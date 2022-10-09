package net.minecraft.client.lIlIlIIIllIIllIIIllI;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.lwjgl.*;
import org.apache.commons.lang3.*;
import net.minecraft.client.IIIIlllIIIIIIlIIIlll.*;
import java.nio.*;
import org.apache.commons.io.*;
import java.io.*;

public class IllIIlllIIIIlllIIlIl
{
    private final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    private IllIIlllIIIIlllIIlIl(final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll, final int llIllIIIIIllIlIIIIlI, final String ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        ++this.IlIIIlIlIIIllIlIlIIl;
        lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(), this.llIllIIIIIllIlIIIIlI);
    }
    
    public void IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        --this.IlIIIlIlIIIllIlIlIIl;
        if (this.IlIIIlIlIIIllIlIlIIl <= 0) {
            lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
            this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().remove(this.IlIlIlIlIlllllllllIl);
        }
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final String s) {
        IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl().get(s);
        if (illIIlllIIIIlllIIlIl == null) {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll("shaders/program/" + s + llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl());
            final byte[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(new BufferedInputStream(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll).IlIlIlIlIlllllllllIl()));
            final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(llllIIIIlIIIlIlllIll.length);
            byteBuffer.put(llllIIIIlIIIlIlllIll);
            byteBuffer.position(0);
            final int ilIlIlIlIlllllllllIl = lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI());
            lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, byteBuffer);
            lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
            if (lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl, lIIIIlIlIllllIIlIllI.IIIIlllIIIIIIlIIIlll) == 0) {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl("Couldn't compile " + llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() + " program: " + StringUtils.trim(lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl, 32768)));
                ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
                throw ilIlIlIlIlllllllllIl2;
            }
            illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl, s);
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl().put(s, illIIlllIIIIlllIIlIl);
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    protected static byte[] llllIIIIlIIIlIlllIll(final BufferedInputStream bufferedInputStream) {
        byte[] byteArray;
        try {
            byteArray = IOUtils.toByteArray((InputStream)bufferedInputStream);
        }
        finally {
            bufferedInputStream.close();
        }
        bufferedInputStream.close();
        return byteArray;
    }
}
