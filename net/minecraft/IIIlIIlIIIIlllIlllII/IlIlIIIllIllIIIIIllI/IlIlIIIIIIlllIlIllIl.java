package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIIIIlllIlIllIl extends IIlllIIlIllIllIlIIll
{
    private lllIIIIlllllIlIIllIl[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public IlIlIIIIIIlllIlIllIl(final Random random, final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = new lllIIIIlllllIlIIllIl[ilIlIlIlIlllllllllIl];
        for (int i = 0; i < ilIlIlIlIlllllllllIl; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = new lllIIIIlllllIlIIllIl(random);
        }
    }
    
    public double[] llllIIIIlIIIlIlllIll(double[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final double n7, final double n8, final double n9) {
        if (array == null) {
            array = new double[n4 * n5 * n6];
        }
        else {
            for (int i = 0; i < array.length; ++i) {
                array[i] = 0.0;
            }
        }
        double n10 = 1.0;
        for (int j = 0; j < this.IlIlIlIlIlllllllllIl; ++j) {
            final double n11 = n * n10 * n7;
            final double n12 = n2 * n10 * n8;
            final double n13 = n3 * n10 * n9;
            final long ilIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n11);
            final long ilIIIlIlIIIllIlIlIIl2 = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n13);
            this.llllIIIIlIIIlIlllIll[j].llllIIIIlIIIlIlllIll(array, n11 - ilIIIlIlIIIllIlIlIIl + ilIIIlIlIIIllIlIlIIl % 16777216L, n12, n13 - ilIIIlIlIIIllIlIlIIl2 + ilIIIlIlIIIllIlIlIIl2 % 16777216L, n4, n5, n6, n7 * n10, n8 * n10, n9 * n10, n10);
            n10 /= 2.0;
        }
        return array;
    }
    
    public double[] llllIIIIlIIIlIlllIll(final double[] array, final int n, final int n2, final int n3, final int n4, final double n5, final double n6, final double n7) {
        return this.llllIIIIlIIIlIlllIll(array, n, 10, n2, n3, 1, n4, n5, 1.0, n6);
    }
}
