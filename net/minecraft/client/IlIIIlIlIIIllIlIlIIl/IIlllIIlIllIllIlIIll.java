package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlllIIlIllIllIlIIll extends IlIIIlIlIIIllIlIlIIl
{
    private static final int[][] llllIIIIlIIIlIlllIll;
    private static final int[][] IlIlIlIlIlllllllllIl;
    private static final int llIllIIIIIllIlIIIIlI;
    private final IIlIIIIIllIlIIIlIIll[] IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new int[][] { { 4, 3, 2 }, { 6, 4, 5 }, { 3, 3, 1 }, { 1, 2, 1 } };
        IlIlIlIlIlllllllllIl = new int[][] { new int[2], { 0, 5 }, { 0, 14 }, { 0, 18 } };
        llIllIIIIIllIlIIIIlI = IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.length;
    }
    
    public IIlllIIlIllIllIlIIll() {
        this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll[IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI];
        float n = -3.5f;
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            (this.IlIIIlIlIIIllIlIlIIl[i] = new IIlIIIIIllIlIIIlIIll(this, IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl[i][0], IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl[i][1])).llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll[i][0] * -0.5f, 0.0f, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll[i][2] * -0.5f, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll[i][0], IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll[i][1], IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll[i][2]);
            this.IlIIIlIlIIIllIlIlIIl[i].llllIIIIlIIIlIlllIll(0.0f, (float)(24 - IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll[i][1]), n);
            if (i < this.IlIIIlIlIIIllIlIlIIl.length - 1) {
                n += (IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll[i][2] + IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll[i + 1][2]) * 0.5f;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            this.IlIIIlIlIIIllIlIlIIl[i].llllIIIIlIIIlIlllIll(n6);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            this.IlIIIlIlIIIllIlIlIIl[i].llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.01f * (1 + Math.abs(i - 2));
            this.IlIIIlIlIIIllIlIlIIl[i].llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.1f * Math.abs(i - 2);
        }
    }
}
