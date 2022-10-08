package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import java.util.*;

public class IIllIIllIIIlIlIIIIlI extends IIlllIIlIllIllIlIIll
{
    private IIIlIIIlIlIIlllIIlll[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public IIllIIllIIIlIlIIIIlI(final Random random, final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = new IIIlIIIlIlIIlllIIlll[ilIlIlIlIlllllllllIl];
        for (int i = 0; i < ilIlIlIlIlllllllllIl; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = new IIIlIIIlIlIIlllIIlll(random);
        }
    }
    
    public double llllIIIIlIIIlIlllIll(final double n, final double n2) {
        double n3 = 0.0;
        double n4 = 1.0;
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            n3 += this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(n * n4, n2 * n4) / n4;
            n4 /= 2.0;
        }
        return n3;
    }
    
    public double[] llllIIIIlIIIlIlllIll(final double[] array, final double n, final double n2, final int n3, final int n4, final double n5, final double n6, final double n7) {
        return this.llllIIIIlIIIlIlllIll(array, n, n2, n3, n4, n5, n6, n7, 0.5);
    }
    
    public double[] llllIIIIlIIIlIlllIll(double[] array, final double n, final double n2, final int n3, final int n4, final double n5, final double n6, final double n7, final double n8) {
        if (array != null && array.length >= n3 * n4) {
            for (int i = 0; i < array.length; ++i) {
                array[i] = 0.0;
            }
        }
        else {
            array = new double[n3 * n4];
        }
        double n9 = 1.0;
        double n10 = 1.0;
        for (int j = 0; j < this.IlIlIlIlIlllllllllIl; ++j) {
            this.llllIIIIlIIIlIlllIll[j].llllIIIIlIIIlIlllIll(array, n, n2, n3, n4, n5 * n10 * n9, n6 * n10 * n9, 0.55 / n9);
            n10 *= n7;
            n9 *= n8;
        }
        return array;
    }
}
