package net.optifine.IlIIIlIlIIIllIlIlIIl;

import java.nio.charset.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;
import java.io.*;

public class llllIIIlIlllIlIIIIIl extends Thread
{
    private IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    private static final Charset IlIlIlIlIlllllllllIl;
    private static final String llIllIIIIIllIlIIIIlI = "Content-Length";
    private static final char IlIIIlIlIIIllIlIlIIl = '\r';
    private static final char IlIlIIIllIllIIIIIllI = '\n';
    
    static {
        IlIlIlIlIlllllllllIl = Charset.forName("ASCII");
    }
    
    public llllIIIlIlllIlIIIIIl(final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll) {
        super("HttpPipelineReceiver");
        this.llllIIIIlIIIlIlllIll = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            lIIIIlIIIIIlllIllIII ilIIIlIlIIIllIlIlIIl = null;
            try {
                ilIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()));
            }
            catch (InterruptedException ex2) {}
            catch (Exception ex) {
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, ex);
            }
        }
    }
    
    private llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final InputStream inputStream) {
        final String llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(inputStream);
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, " ");
        if (llllIIIIlIIIlIlllIll.length < 3) {
            throw new IOException("Invalid status line: " + llIllIIIIIllIlIIIIlI);
        }
        final String s = llllIIIIlIIIlIlllIll[0];
        final int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[1], 0);
        final String s2 = llllIIIIlIIIlIlllIll[2];
        final LinkedHashMap<Object, String> linkedHashMap = new LinkedHashMap<Object, String>();
        while (true) {
            final String llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI(inputStream);
            if (llIllIIIIIllIlIIIIlI2.length() <= 0) {
                break;
            }
            final int index = llIllIIIIIllIlIIIIlI2.indexOf(":");
            if (index <= 0) {
                continue;
            }
            linkedHashMap.put(llIllIIIIIllIlIIIIlI2.substring(0, index).trim(), llIllIIIIIllIlIIIIlI2.substring(index + 1).trim());
        }
        byte[] ilIlIlIlIlllllllllIl = null;
        final String s3 = linkedHashMap.get("Content-Length");
        if (s3 != null) {
            final int llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s3, -1);
            if (llllIIIIlIIIlIlllIll3 > 0) {
                ilIlIlIlIlllllllllIl = new byte[llllIIIIlIIIlIlllIll3];
                this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, inputStream);
            }
        }
        else if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(linkedHashMap.get("Transfer-Encoding"), (Object)"chunked")) {
            ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(inputStream);
        }
        return new llIllIlIIIIllIlIIllI(llllIIIIlIIIlIlllIll2, llIllIIIIIllIlIIIIlI, linkedHashMap, ilIlIlIlIlllllllllIl);
    }
    
    private byte[] IlIlIlIlIlllllllllIl(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i;
        do {
            i = Integer.parseInt(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI(inputStream), "; ")[0], 16);
            final byte[] array = new byte[i];
            this.llllIIIIlIIIlIlllIll(array, inputStream);
            byteArrayOutputStream.write(array);
            this.llIllIIIIIllIlIIIIlI(inputStream);
        } while (i != 0);
        return byteArrayOutputStream.toByteArray();
    }
    
    private void llllIIIIlIIIlIlllIll(final byte[] array, final InputStream inputStream) {
        int read;
        for (int i = 0; i < array.length; i += read) {
            read = inputStream.read(array, i, array.length - i);
            if (read < 0) {
                throw new EOFException();
            }
        }
    }
    
    private String llIllIIIIIllIlIIIIlI(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n = -1;
        boolean b = false;
        while (true) {
            final int read = inputStream.read();
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(read);
            if (n == 13 && read == 10) {
                b = true;
                break;
            }
            n = read;
        }
        String substring = new String(byteArrayOutputStream.toByteArray(), llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
        if (b) {
            substring = substring.substring(0, substring.length() - 2);
        }
        return substring;
    }
}
