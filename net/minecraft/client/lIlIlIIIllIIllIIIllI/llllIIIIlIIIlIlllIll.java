package net.minecraft.client.lIlIlIIIllIIllIIIllI;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import org.lwjgl.opengl.*;
import java.nio.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class llllIIIIlIIIlIlllIll
{
    public int llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    public boolean IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    public int llllIIIlIlllIlIIIIIl;
    public int lIIIIlIIIIIlllIllIII;
    public float[] lIIIlllIIIllIIIllIII;
    public int llIIlIIIlIIIllIlIIIl;
    
    public llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = -1;
        this.lIIIIlIIIIIlllIllIII = -1;
        (this.lIIIlllIIIllIIIllIII = new float[4])[0] = 1.0f;
        this.lIIIlllIIIllIIIllIII[1] = 1.0f;
        this.lIIIlllIIIllIIIllIII[2] = 1.0f;
        this.lIIIlllIIIllIIIllIII[3] = 0.0f;
        this.llllIIIIlIIIlIlllIll(n, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        if (!lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
        else {
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            if (this.IllIIlllIIIIlllIIlIl >= 0) {
                this.llllIIIIlIIIlIlllIll();
            }
            this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
            this.IlIlIlIlIlllllllllIl();
            lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII(lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI, 0);
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            this.IlIIIlIlIIIllIlIlIIl();
            this.IlIlIIIllIllIIIIIllI();
            if (this.lIIIIlIIIIIlllIllIII > -1) {
                lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII(this.lIIIIlIIIIIlllIllIII);
                this.lIIIIlIIIIIlllIllIII = -1;
            }
            if (this.llllIIIlIlllIlIIIIIl > -1) {
                IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
                this.llllIIIlIlllIlIIIIIl = -1;
            }
            if (this.IllIIlllIIIIlllIIlIl > -1) {
                lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII(lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI, 0);
                lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII(this.IllIIlllIIIIlllIIlIl);
                this.IllIIlllIIIIlllIIlIl = -1;
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        this.llIllIIIIIllIlIIIIlI = n;
        this.IlIIIlIlIIIllIlIlIIl = n2;
        this.llllIIIIlIIIlIlllIll = n;
        this.IlIlIlIlIlllllllllIl = n2;
        if (!lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            this.IllIIlllIIIIlllIIlIl();
        }
        else {
            this.IllIIlllIIIIlllIIlIl = lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl();
            this.llllIIIlIlllIlIIIIIl = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll();
            if (this.IlIlIIIllIllIIIIIllI) {
                this.lIIIIlIIIIIlllIllIII = lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII();
            }
            this.llllIIIIlIIIlIlllIll(9728);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.llllIIIlIlllIlIIIIIl);
            GL11.glTexImage2D(3553, 0, 32856, this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, 0, 6408, 5121, (ByteBuffer)null);
            lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII(lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI, this.IllIIlllIIIIlllIIlIl);
            lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI, lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI, 3553, this.llllIIIlIlllIlIIIIIl, 0);
            if (this.IlIlIIIllIllIIIIIllI) {
                lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII(lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl, this.lIIIIlIIIIIlllIllIII);
                lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl, 33190, this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
                lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl(lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI, lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl, lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl, this.lIIIIlIIIIIlllIllIII);
            }
            this.IllIIlllIIIIlllIIlIl();
            this.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIIlIIIlIIIllIlIIIl) {
        if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.llllIIIlIlllIlIIIIIl);
            GL11.glTexParameterf(3553, 10241, (float)llIIlIIIlIIIllIlIIIl);
            GL11.glTexParameterf(3553, 10240, (float)llIIlIIIlIIIllIlIIIl);
            GL11.glTexParameterf(3553, 10242, 10496.0f);
            GL11.glTexParameterf(3553, 10243, 10496.0f);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        final int llIIlIIIlIIIllIlIIIl = lIIIIlIlIllllIIlIllI.llIIlIIIlIIIllIlIIIl(lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI);
        if (llIIlIIIlIIIllIlIIIl == lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl) {
            return;
        }
        if (llIIlIIIlIIIllIlIIIl == lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
        }
        if (llIIlIIIlIIIllIlIIIl == lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
        }
        if (llIIlIIIlIIIllIlIIIl == lIIIIlIlIllllIIlIllI.llIIlIIIlIIIllIlIIIl) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
        }
        if (llIIlIIIlIIIllIlIIIl == lIIIIlIlIllllIIlIllI.llIllIlIIIIllIlIIllI) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
        }
        throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + llIIlIIIlIIIllIlIIIl);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.llllIIIlIlllIlIIIIIl);
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII(lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI, this.IllIIlllIIIIlllIIlIl);
            if (b) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII(lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI, 0);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4) {
        this.lIIIlllIIIllIIIllIII[0] = n;
        this.lIIIlllIIIllIIIllIII[1] = n2;
        this.lIIIlllIIIllIIIllIII[2] = n3;
        this.lIIIlllIIIllIIIllIII[3] = n4;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll(n, n2, true);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean b) {
        if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, false);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, n, n2, 0.0, 1000.0, 3000.0);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -2000.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, n, n2);
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            if (b) {
                lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
            }
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.llIllIIIIIllIlIIIIlI();
            final float n3 = (float)n;
            final float n4 = (float)n2;
            final float n5 = this.llIllIIIIIllIlIIIIlI / (float)this.llllIIIIlIIIlIlllIll;
            final float n6 = this.IlIIIlIlIIIllIlIlIIl / (float)this.IlIlIlIlIlllllllllIl;
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n4, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n4, 0.0).llllIIIIlIIIlIlllIll(n5, 0.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, 0.0, 0.0).llllIIIIlIIIlIlllIll(n5, n6).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, 0.0).llllIIIIlIIIlIlllIll(0.0, n6).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            this.IlIIIlIlIIIllIlIlIIl();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, true);
        }
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        this.llllIIIIlIIIlIlllIll(true);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII[0], this.lIIIlllIIIllIIIllIII[1], this.lIIIlllIIIllIIIllIII[2], this.lIIIlllIIIllIIIllIII[3]);
        int n = 16384;
        if (this.IlIlIIIllIllIIIIIllI) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0);
            n |= 0x100;
        }
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(n);
        this.IlIlIIIllIllIIIIIllI();
    }
}
