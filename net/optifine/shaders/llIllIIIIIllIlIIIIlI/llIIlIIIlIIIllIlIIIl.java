package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import org.lwjgl.opengl.*;

public class llIIlIIIlIIIllIlIIIl extends IIIIlllIIIIIIlIIIlll
{
    private int[][] llllIIIIlIIIlIlllIll;
    private static final int IlIlIlIlIlllllllllIl = Integer.MIN_VALUE;
    
    public llIIlIIIlIIIllIlIIIl(final String s) {
        super(s);
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final int[] array = this.llllIIIIlIIIlIlllIll[this.IlIIIlIlIIIllIlIlIIl()];
        if (array[0] != n || array[1] != n2) {
            array[0] = n;
            array[1] = n2;
            final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI >= 0) {
                ARBShaderObjects.glUniform2iARB(ilIlIIIllIllIIIIIllI, n, n2);
                this.lIIIlllIIIllIIIllIII();
            }
        }
    }
    
    public int[] llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll[this.IlIIIlIlIIIllIlIlIIl()];
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n) {
        if (n >= this.llllIIIIlIIIlIlllIll.length) {
            final int[][] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            final int[][] llllIIIIlIIIlIlllIll2 = new int[n + 10][];
            System.arraycopy(llllIIIIlIIIlIlllIll, 0, llllIIIIlIIIlIlllIll2, 0, llllIIIIlIIIlIlllIll.length);
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
        }
        if (this.llllIIIIlIIIlIlllIll[n] == null) {
            this.llllIIIIlIIIlIlllIll[n] = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE };
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = new int[][] { { Integer.MIN_VALUE, Integer.MIN_VALUE } };
    }
}
