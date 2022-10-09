package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import org.lwjgl.opengl.*;

public class lIIIIlIIIIIlllIllIII extends IIIIlllIIIIIIlIIIlll
{
    private int[] llllIIIIlIIIlIlllIll;
    private static final int IlIlIlIlIlllllllllIl = Integer.MIN_VALUE;
    
    public lIIIIlIIIIIlllIllIII(final String s) {
        super(s);
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        if (n != this.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl]) {
            this.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl] = n;
            final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI >= 0) {
                ARBShaderObjects.glUniform1iARB(ilIlIIIllIllIIIIIllI, n);
                this.lIIIlllIIIllIIIllIII();
            }
        }
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll[this.IlIIIlIlIIIllIlIlIIl()];
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n) {
        if (n >= this.llllIIIIlIIIlIlllIll.length) {
            final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            final int[] llllIIIIlIIIlIlllIll2 = new int[n + 10];
            System.arraycopy(llllIIIIlIIIlIlllIll, 0, llllIIIIlIIIlIlllIll2, 0, llllIIIIlIIIlIlllIll.length);
            for (int i = llllIIIIlIIIlIlllIll.length; i < llllIIIIlIIIlIlllIll2.length; ++i) {
                llllIIIIlIIIlIlllIll2[i] = Integer.MIN_VALUE;
            }
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = new int[] { Integer.MIN_VALUE };
    }
}
