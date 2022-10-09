package net.optifine;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class lIIlIIIlIllIlIllIIIl
{
    private IllIlIIllIllIIlIllII llllIIIIlIIIlIlllIll;
    private IllIlIIllIllIIlIllII IlIlIlIlIlllllllllIl;
    private IllIlIIllIllIIlIllII llIllIIIIIllIlIIIIlI;
    private int[] IlIIIlIlIIIllIlIlIIl;
    private int[] IlIlIIIllIllIIIIIllI;
    
    public lIIlIIIlIllIlIllIIIl(final IllIlIIllIllIIlIllII llllIIIIlIIIlIlllIll, IllIlIIllIllIIlIllII ilIlIlIlIlllllllllIl, IllIlIIllIllIIlIllII llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = new int[0];
        this.IlIlIIIllIllIIIIIllI = new int[0];
        if (ilIlIlIlIlllllllllIl != null || llIllIIIIIllIlIIIIlI != null) {
            if (ilIlIlIlIlllllllllIl == null) {
                ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll;
            }
            if (llIllIIIIIllIlIIIIlI == null) {
                llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl;
            }
        }
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n, final int[] array, final boolean b, final float n2) {
        if (this.IlIlIlIlIlllllllllIl == null && this.llIllIIIIIllIlIIIIlI == null) {
            return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, array, b);
        }
        final int iIlllIIlIllIllIlIIll = illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll();
        if (iIlllIIlIllIllIlIIll == 1 || iIlllIIlIllIllIlIIll == -1) {
            return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, array, b);
        }
        final float llIIlIIIlIIIllIlIIIl = illlllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl(n2);
        float liiiIlIIIIIlllIllIII = illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(n2);
        final float n3 = 1.0E-4f;
        final boolean b2 = llIIlIIIlIIIllIlIIIl > n3;
        final boolean b3 = liiiIlIIIIIlllIllIII > n3;
        if (!b2 && !b3) {
            return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, array, b);
        }
        if (llIIlIIIlIIIllIlIIIl > 0.0f) {
            liiiIlIIIIIlllIllIII /= llIIlIIIlIIIllIlIIIl;
        }
        final float n4 = 1.0f - llIIlIIIlIIIllIlIIIl;
        final float n5 = llIIlIIIlIIIllIlIIIl - liiiIlIIIIIlllIllIII;
        if (this.IlIIIlIlIIIllIlIlIIl.length != array.length) {
            this.IlIIIlIlIIIllIlIlIIl = new int[array.length];
            this.IlIlIIIllIllIIIIIllI = new int[array.length];
        }
        int n6 = 0;
        final int[][] array2 = { array, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI };
        final float[] array3 = new float[3];
        if (n4 > n3 && this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, array2[n6], b)) {
            array3[n6] = n4;
            ++n6;
        }
        if (n5 > n3 && this.IlIlIlIlIlllllllllIl != null && this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, array2[n6], b)) {
            array3[n6] = n5;
            ++n6;
        }
        if (liiiIlIIIIIlllIllIII > n3 && this.llIllIIIIIllIlIIIIlI != null && this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, array2[n6], b)) {
            array3[n6] = liiiIlIIIIIlllIllIII;
            ++n6;
        }
        return (n6 == 2) ? this.llllIIIIlIIIlIlllIll(array2[0], array3[0], array2[1], array3[1]) : (n6 != 3 || this.llllIIIIlIIIlIlllIll(array2[0], array3[0], array2[1], array3[1], array2[2], array3[2]));
    }
    
    private boolean llllIIIIlIIIlIlllIll(final int[] array, final float n, final int[] array2, final float n2) {
        if (array2.length != array.length) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            final int n3 = array[i];
            final int n4 = n3 >> 16 & 0xFF;
            final int n5 = n3 >> 8 & 0xFF;
            final int n6 = n3 & 0xFF;
            final int n7 = array2[i];
            array[i] = (0xFF000000 | (int)(n4 * n + (n7 >> 16 & 0xFF) * n2) << 16 | (int)(n5 * n + (n7 >> 8 & 0xFF) * n2) << 8 | (int)(n6 * n + (n7 & 0xFF) * n2));
        }
        return true;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final int[] array, final float n, final int[] array2, final float n2, final int[] array3, final float n3) {
        if (array2.length == array.length && array3.length == array.length) {
            for (int i = 0; i < array.length; ++i) {
                final int n4 = array[i];
                final int n5 = n4 >> 16 & 0xFF;
                final int n6 = n4 >> 8 & 0xFF;
                final int n7 = n4 & 0xFF;
                final int n8 = array2[i];
                final int n9 = n8 >> 16 & 0xFF;
                final int n10 = n8 >> 8 & 0xFF;
                final int n11 = n8 & 0xFF;
                final int n12 = array3[i];
                array[i] = (0xFF000000 | (int)(n5 * n + n9 * n2 + (n12 >> 16 & 0xFF) * n3) << 16 | (int)(n6 * n + n10 * n2 + (n12 >> 8 & 0xFF) * n3) << 8 | (int)(n7 * n + n11 * n2 + (n12 & 0xFF) * n3));
            }
            return true;
        }
        return false;
    }
}
