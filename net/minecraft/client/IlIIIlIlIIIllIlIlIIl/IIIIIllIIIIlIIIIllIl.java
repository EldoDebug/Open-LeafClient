package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIIIllIIIIlIIIIllIl extends IlIIIlIlIIIllIlIlIIl
{
    private IIlIIIIIllIlIIIlIIll[] llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll[] IlIlIlIlIlllllllllIl;
    private float[] llIllIIIIIllIlIIIIlI;
    private static final int[][] IlIIIlIlIIIllIlIlIIl;
    private static final int[][] llIllIlIIIIllIlIIllI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new int[][] { { 3, 2, 2 }, { 4, 3, 2 }, { 6, 4, 3 }, { 3, 3, 3 }, { 2, 2, 3 }, { 2, 1, 2 }, { 1, 1, 2 } };
        llIllIlIIIIllIlIIllI = new int[][] { new int[2], { 0, 4 }, { 0, 9 }, { 0, 16 }, { 0, 22 }, { 11, 0 }, { 13, 4 } };
    }
    
    public IIIIIllIIIIlIIIIllIl() {
        this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll[7];
        this.llIllIIIIIllIlIIIIlI = new float[7];
        float n = -3.5f;
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            (this.llllIIIIlIIIlIlllIll[i] = new IIlIIIIIllIlIIIlIIll(this, IIIIIllIIIIlIIIIllIl.llIllIlIIIIllIlIIllI[i][0], IIIIIllIIIIlIIIIllIl.llIllIlIIIIllIlIIllI[i][1])).llllIIIIlIIIlIlllIll(IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i][0] * -0.5f, 0.0f, IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i][2] * -0.5f, IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i][0], IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i][1], IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i][2]);
            this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(0.0f, (float)(24 - IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i][1]), n);
            this.llIllIIIIIllIlIIIIlI[i] = n;
            if (i < this.llllIIIIlIIIlIlllIll.length - 1) {
                n += (IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i][2] + IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i + 1][2]) * 0.5f;
            }
        }
        this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll[3];
        (this.IlIlIlIlIlllllllllIl[0] = new IIlIIIIIllIlIIIlIIll(this, 20, 0)).llllIIIIlIIIlIlllIll(-5.0f, 0.0f, IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[2][2] * -0.5f, 10, 8, IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[2][2]);
        this.IlIlIlIlIlllllllllIl[0].llllIIIIlIIIlIlllIll(0.0f, 16.0f, this.llIllIIIIIllIlIIIIlI[2]);
        (this.IlIlIlIlIlllllllllIl[1] = new IIlIIIIIllIlIIIlIIll(this, 20, 11)).llllIIIIlIIIlIlllIll(-3.0f, 0.0f, IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[4][2] * -0.5f, 6, 4, IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[4][2]);
        this.IlIlIlIlIlllllllllIl[1].llllIIIIlIIIlIlllIll(0.0f, 20.0f, this.llIllIIIIIllIlIIIIlI[4]);
        (this.IlIlIlIlIlllllllllIl[2] = new IIlIIIIIllIlIIIlIIll(this, 20, 18)).llllIIIIlIIIlIlllIll(-3.0f, 0.0f, IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[4][2] * -0.5f, 6, 5, IIIIIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[1][2]);
        this.IlIlIlIlIlllllllllIl[2].llllIIIIlIIIlIlllIll(0.0f, 19.0f, this.llIllIIIIIllIlIIIIlI[1]);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(n6);
        }
        for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length; ++j) {
            this.IlIlIlIlIlllllllllIl[j].llllIIIIlIIIlIlllIll(n6);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i].llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.05f * (1 + Math.abs(i - 2));
            this.llllIIIIlIIIlIlllIll[i].llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.2f * Math.abs(i - 2);
        }
        this.IlIlIlIlIlllllllllIl[0].llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll[2].llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl[1].llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll[4].llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl[1].llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll[4].llIllIIIIIllIlIIIIlI;
        this.IlIlIlIlIlllllllllIl[2].llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll[1].llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl[2].llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll[1].llIllIIIIIllIlIIIIlI;
    }
}
