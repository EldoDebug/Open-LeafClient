package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import org.lwjgl.opengl.*;

public class lIIIlllIIIllIIIllIII extends IIIIlllIIIIIIlIIIlll
{
    private float[][] llllIIIIlIIIlIlllIll;
    private static final float IlIlIlIlIlllllllllIl = -3.4028235E38f;
    
    public lIIIlllIIIllIIIllIII(final String s) {
        super(s);
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2) {
        final float[] array = this.llllIIIIlIIIlIlllIll[this.IlIIIlIlIIIllIlIlIIl()];
        if (array[0] != n || array[1] != n2) {
            array[0] = n;
            array[1] = n2;
            final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI >= 0) {
                ARBShaderObjects.glUniform2fARB(ilIlIIIllIllIIIIIllI, n, n2);
                this.lIIIlllIIIllIIIllIII();
            }
        }
    }
    
    public float[] llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll[this.IlIIIlIlIIIllIlIlIIl()];
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n) {
        if (n >= this.llllIIIIlIIIlIlllIll.length) {
            final float[][] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            final float[][] llllIIIIlIIIlIlllIll2 = new float[n + 10][];
            System.arraycopy(llllIIIIlIIIlIlllIll, 0, llllIIIIlIIIlIlllIll2, 0, llllIIIIlIIIlIlllIll.length);
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
        }
        if (this.llllIIIIlIIIlIlllIll[n] == null) {
            this.llllIIIIlIIIlIlllIll[n] = new float[] { -3.4028235E38f, -3.4028235E38f };
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = new float[][] { { -3.4028235E38f, -3.4028235E38f } };
    }
}
