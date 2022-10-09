package net.minecraft.IlllllllIIIlIIIlIlII;

import org.apache.logging.log4j.*;
import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.spec.*;
import java.security.*;

public class lllllIlIIIlIlIIlllII
{
    private static final Logger llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public static SecretKey llllIIIIlIIIlIlllIll() {
        try {
            final KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            return instance.generateKey();
        }
        catch (NoSuchAlgorithmException ex) {
            throw new Error(ex);
        }
    }
    
    public static KeyPair IlIlIlIlIlllllllllIl() {
        try {
            final KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(1024);
            return instance.generateKeyPair();
        }
        catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll.error("Key pair generation failed!");
            return null;
        }
    }
    
    public static byte[] llllIIIIlIIIlIlllIll(final String s, final PublicKey publicKey, final SecretKey secretKey) {
        try {
            return llllIIIIlIIIlIlllIll("SHA-1", new byte[][] { s.getBytes("ISO_8859_1"), secretKey.getEncoded(), publicKey.getEncoded() });
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static byte[] llllIIIIlIIIlIlllIll(final String s, final byte[]... array) {
        try {
            final MessageDigest instance = MessageDigest.getInstance(s);
            for (int length = array.length, i = 0; i < length; ++i) {
                instance.update(array[i]);
            }
            return instance.digest();
        }
        catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static PublicKey llllIIIIlIIIlIlllIll(final byte[] array) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(array));
        }
        catch (NoSuchAlgorithmException ex) {}
        catch (InvalidKeySpecException ex2) {}
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll.error("Public key reconstitute failed!");
        return null;
    }
    
    public static SecretKey llllIIIIlIIIlIlllIll(final PrivateKey privateKey, final byte[] array) {
        return new SecretKeySpec(IlIlIlIlIlllllllllIl(privateKey, array), "AES");
    }
    
    public static byte[] llllIIIIlIIIlIlllIll(final Key key, final byte[] array) {
        return llllIIIIlIIIlIlllIll(1, key, array);
    }
    
    public static byte[] IlIlIlIlIlllllllllIl(final Key key, final byte[] array) {
        return llllIIIIlIIIlIlllIll(2, key, array);
    }
    
    private static byte[] llllIIIIlIIIlIlllIll(final int n, final Key key, final byte[] array) {
        try {
            return llllIIIIlIIIlIlllIll(n, key.getAlgorithm(), key).doFinal(array);
        }
        catch (IllegalBlockSizeException ex) {
            ex.printStackTrace();
        }
        catch (BadPaddingException ex2) {
            ex2.printStackTrace();
        }
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll.error("Cipher data failed!");
        return null;
    }
    
    private static Cipher llllIIIIlIIIlIlllIll(final int n, final String s, final Key key) {
        try {
            final Cipher instance = Cipher.getInstance(s);
            instance.init(n, key);
            return instance;
        }
        catch (InvalidKeyException ex) {
            ex.printStackTrace();
        }
        catch (NoSuchAlgorithmException ex2) {
            ex2.printStackTrace();
        }
        catch (NoSuchPaddingException ex3) {
            ex3.printStackTrace();
        }
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll.error("Cipher creation failed!");
        return null;
    }
    
    public static Cipher llllIIIIlIIIlIlllIll(final int n, final Key key) {
        try {
            final Cipher instance = Cipher.getInstance("AES/CFB8/NoPadding");
            instance.init(n, key, new IvParameterSpec(key.getEncoded()));
            return instance;
        }
        catch (GeneralSecurityException ex) {
            throw new RuntimeException(ex);
        }
    }
}
