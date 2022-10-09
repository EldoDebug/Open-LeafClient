package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import org.lwjgl.opengl.*;

public class llllIIIlIlllIlIIIIIl extends IIIIlllIIIIIIlIIIlll
{
    private float[] llllIIIIlIIIlIlllIll;
    private static final float IlIlIlIlIlllllllllIl = -3.4028235E38f;
    
    public llllIIIlIlllIlIIIIIl(final String s) {
        super(s);
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        if (n != this.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl]) {
            this.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl] = n;
            final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI >= 0) {
                ARBShaderObjects.glUniform1fARB(ilIlIIIllIllIIIIIllI, n);
                this.lIIIlllIIIllIIIllIII();
            }
        }
    }
    
    public float llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll[this.IlIIIlIlIIIllIlIlIIl()];
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n) {
        if (n >= this.llllIIIIlIIIlIlllIll.length) {
            final float[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            final float[] llllIIIIlIIIlIlllIll2 = new float[n + 10];
            System.arraycopy(llllIIIIlIIIlIlllIll, 0, llllIIIIlIIIlIlllIll2, 0, llllIIIIlIIIlIlllIll.length);
            for (int i = llllIIIIlIIIlIlllIll.length; i < llllIIIIlIIIlIlllIll2.length; ++i) {
                llllIIIIlIIIlIlllIll2[i] = -3.4028235E38f;
            }
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = new float[] { -3.4028235E38f };
    }
}
