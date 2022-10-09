package net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import javax.crypto.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.security.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIlIlIlllllllllIl implements IIlIIIIIllIlIIIlIIll
{
    private byte[] llllIIIIlIIIlIlllIll;
    private byte[] IlIlIlIlIlllllllllIl;
    
    public IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = new byte[0];
        this.IlIlIlIlIlllllllllIl = new byte[0];
    }
    
    public IlIlIlIlIlllllllllIl(final SecretKey secretKey, final PublicKey publicKey, final byte[] array) {
        this.llllIIIIlIIIlIlllIll = new byte[0];
        this.IlIlIlIlIlllllllllIl = new byte[0];
        this.llllIIIIlIIIlIlllIll = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(publicKey, secretKey.getEncoded());
        this.IlIlIlIlIlllllllllIl = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(publicKey, array);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public SecretKey llllIIIIlIIIlIlllIll(final PrivateKey privateKey) {
        return lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(privateKey, this.llllIIIIlIIIlIlllIll);
    }
    
    public byte[] IlIlIlIlIlllllllllIl(final PrivateKey privateKey) {
        return (privateKey == null) ? this.IlIlIlIlIlllllllllIl : lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(privateKey, this.IlIlIlIlIlllllllllIl);
    }
}
