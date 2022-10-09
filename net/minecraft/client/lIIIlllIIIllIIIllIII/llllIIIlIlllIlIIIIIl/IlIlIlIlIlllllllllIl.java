package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;

import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.nio.*;
import org.lwjgl.opengl.*;

public class IlIlIlIlIlllllllllIl
{
    private int llllIIIIlIIIlIlllIll;
    private final llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private lIIIlllIIIllIIIllIII IlIIIlIlIIIllIlIlIIl;
    private lIIIIlIIIIIlllIllIII IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, this.llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final ByteBuffer byteBuffer) {
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(byteBuffer, this.IlIlIIIllIllIIIIIllI);
        }
        else {
            this.llllIIIIlIIIlIlllIll();
            lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, byteBuffer, 35044);
            this.IlIlIlIlIlllllllllIl();
            this.llIllIIIIIllIlIIIIlI = byteBuffer.limit() / this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(int illIIlllIIIIlllIIlIl) {
        if (this.IllIIlllIIIIlllIIlIl > 0) {
            illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
        }
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, this.IlIlIIIllIllIIIIIllI);
        }
        else {
            GL11.glDrawArrays(illIIlllIIIIlllIIlIl, 0, this.llIllIIIIIllIlIIIIlI);
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, 0);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        if (this.llllIIIIlIIIlIlllIll >= 0) {
            lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(this.llllIIIIlIIIlIlllIll);
            this.llllIIIIlIIIlIlllIll = -1;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl != null) {
            this.llIllIIIIIllIlIIIIlI();
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = new lIIIIlIIIIIlllIllIII();
        }
    }
    
    public lIIIlllIIIllIIIllIII IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lIIIIlIIIIIlllIllIII IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
