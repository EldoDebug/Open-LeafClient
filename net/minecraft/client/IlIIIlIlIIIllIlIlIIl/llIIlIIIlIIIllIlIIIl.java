package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class llIIlIIIlIIIllIlIIIl
{
    private lIIlIIIlIllIlIllIIIl[] lIIIIlIIIIIlllIllIII;
    private lIlIlIlllIIlIlIlllIl[] lIIIlllIIIllIIIllIII;
    public final float llllIIIIlIIIlIlllIll;
    public final float IlIlIlIlIlllllllllIl;
    public final float llIllIIIIIllIlIIIIlI;
    public final float IlIIIlIlIIIllIlIlIIl;
    public final float IlIlIIIllIllIIIIIllI;
    public final float IllIIlllIIIIlllIIlIl;
    public String llllIIIlIlllIlIIIIIl;
    
    public llIIlIIIlIIIllIlIIIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final int n, final int n2, final float n3, final float n4, final float n5, final int n6, final int n7, final int n8, final float n9) {
        this(ilIIIIIllIlIIIlIIll, n, n2, n3, n4, n5, n6, n7, n8, n9, ilIIIIIllIlIIIlIIll.lIIIlllIIIllIIIllIII);
    }
    
    public llIIlIIIlIIIllIlIIIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final int[][] array, float llllIIIIlIIIlIlllIll, float ilIlIlIlIlllllllllIl, float llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final boolean b) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll + n;
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl + n2;
        this.IllIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI + n3;
        this.lIIIIlIIIIIlllIllIII = new lIIlIIIlIllIlIllIIIl[8];
        this.lIIIlllIIIllIIIllIII = new lIlIlIlllIIlIlIlllIl[6];
        final float n5 = llllIIIIlIIIlIlllIll + n;
        final float n6 = ilIlIlIlIlllllllllIl + n2;
        final float n7 = llIllIIIIIllIlIIIIlI + n3;
        llllIIIIlIIIlIlllIll -= n4;
        ilIlIlIlIlllllllllIl -= n4;
        llIllIIIIIllIlIIIIlI -= n4;
        float n8 = n5 + n4;
        final float n9 = n6 + n4;
        final float n10 = n7 + n4;
        if (b) {
            final float n11 = n8;
            n8 = llllIIIIlIIIlIlllIll;
            llllIIIIlIIIlIlllIll = n11;
        }
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl = new lIIlIIIlIllIlIllIIIl(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, 0.0f, 0.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl2 = new lIIlIIIlIllIlIllIIIl(n8, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, 0.0f, 8.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl3 = new lIIlIIIlIllIlIllIIIl(n8, n9, llIllIIIIIllIlIIIIlI, 8.0f, 8.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl4 = new lIIlIIIlIllIlIllIIIl(llllIIIIlIIIlIlllIll, n9, llIllIIIIIllIlIIIIlI, 8.0f, 0.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl5 = new lIIlIIIlIllIlIllIIIl(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, n10, 0.0f, 0.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl6 = new lIIlIIIlIllIlIllIIIl(n8, ilIlIlIlIlllllllllIl, n10, 0.0f, 8.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl7 = new lIIlIIIlIllIlIllIIIl(n8, n9, n10, 8.0f, 8.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl8 = new lIIlIIIlIllIlIllIIIl(llllIIIIlIIIlIlllIll, n9, n10, 8.0f, 0.0f);
        this.lIIIIlIIIIIlllIllIII[0] = liIlIIIlIllIlIllIIIl;
        this.lIIIIlIIIIIlllIllIII[1] = liIlIIIlIllIlIllIIIl2;
        this.lIIIIlIIIIIlllIllIII[2] = liIlIIIlIllIlIllIIIl3;
        this.lIIIIlIIIIIlllIllIII[3] = liIlIIIlIllIlIllIIIl4;
        this.lIIIIlIIIIIlllIllIII[4] = liIlIIIlIllIlIllIIIl5;
        this.lIIIIlIIIIIlllIllIII[5] = liIlIIIlIllIlIllIIIl6;
        this.lIIIIlIIIIIlllIllIII[6] = liIlIIIlIllIlIllIIIl7;
        this.lIIIIlIIIIIlllIllIII[7] = liIlIIIlIllIlIllIIIl8;
        this.lIIIlllIIIllIIIllIII[0] = this.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl6, liIlIIIlIllIlIllIIIl2, liIlIIIlIllIlIllIIIl3, liIlIIIlIllIlIllIIIl7 }, array[4], false, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[1] = this.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl, liIlIIIlIllIlIllIIIl5, liIlIIIlIllIlIllIIIl8, liIlIIIlIllIlIllIIIl4 }, array[5], false, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[2] = this.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl6, liIlIIIlIllIlIllIIIl5, liIlIIIlIllIlIllIIIl, liIlIIIlIllIlIllIIIl2 }, array[1], true, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[3] = this.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl3, liIlIIIlIllIlIllIIIl4, liIlIIIlIllIlIllIIIl8, liIlIIIlIllIlIllIIIl7 }, array[0], true, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[4] = this.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl2, liIlIIIlIllIlIllIIIl, liIlIIIlIllIlIllIIIl4, liIlIIIlIllIlIllIIIl3 }, array[2], false, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[5] = this.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl5, liIlIIIlIllIlIllIIIl6, liIlIIIlIllIlIllIIIl7, liIlIIIlIllIlIllIIIl8 }, array[3], false, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        if (b) {
            lIlIlIlllIIlIlIlllIl[] liiIlllIIIllIIIllIII;
            for (int length = (liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII).length, i = 0; i < length; ++i) {
                liiIlllIIIllIIIllIII[i].llllIIIIlIIIlIlllIll();
            }
        }
    }
    
    private lIlIlIlllIIlIlIlllIl llllIIIIlIIIlIlllIll(final lIIlIIIlIllIlIllIIIl[] array, final int[] array2, final boolean b, final float n, final float n2) {
        return (array2 == null) ? null : (b ? new lIlIlIlllIIlIlIlllIl(array, array2[2], array2[3], array2[0], array2[1], n, n2) : new lIlIlIlllIIlIlIlllIl(array, array2[0], array2[1], array2[2], array2[3], n, n2));
    }
    
    public llIIlIIIlIIIllIlIIIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final int n, final int n2, float llllIIIIlIIIlIlllIll, float ilIlIlIlIlllllllllIl, float llIllIIIIIllIlIIIIlI, final int n3, final int n4, final int n5, final float n6, final boolean b) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll + n3;
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl + n4;
        this.IllIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI + n5;
        this.lIIIIlIIIIIlllIllIII = new lIIlIIIlIllIlIllIIIl[8];
        this.lIIIlllIIIllIIIllIII = new lIlIlIlllIIlIlIlllIl[6];
        final float n7 = llllIIIIlIIIlIlllIll + n3;
        final float n8 = ilIlIlIlIlllllllllIl + n4;
        final float n9 = llIllIIIIIllIlIIIIlI + n5;
        llllIIIIlIIIlIlllIll -= n6;
        ilIlIlIlIlllllllllIl -= n6;
        llIllIIIIIllIlIIIIlI -= n6;
        float n10 = n7 + n6;
        final float n11 = n8 + n6;
        final float n12 = n9 + n6;
        if (b) {
            final float n13 = n10;
            n10 = llllIIIIlIIIlIlllIll;
            llllIIIIlIIIlIlllIll = n13;
        }
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl = new lIIlIIIlIllIlIllIIIl(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, 0.0f, 0.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl2 = new lIIlIIIlIllIlIllIIIl(n10, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, 0.0f, 8.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl3 = new lIIlIIIlIllIlIllIIIl(n10, n11, llIllIIIIIllIlIIIIlI, 8.0f, 8.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl4 = new lIIlIIIlIllIlIllIIIl(llllIIIIlIIIlIlllIll, n11, llIllIIIIIllIlIIIIlI, 8.0f, 0.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl5 = new lIIlIIIlIllIlIllIIIl(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, n12, 0.0f, 0.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl6 = new lIIlIIIlIllIlIllIIIl(n10, ilIlIlIlIlllllllllIl, n12, 0.0f, 8.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl7 = new lIIlIIIlIllIlIllIIIl(n10, n11, n12, 8.0f, 8.0f);
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl8 = new lIIlIIIlIllIlIllIIIl(llllIIIIlIIIlIlllIll, n11, n12, 8.0f, 0.0f);
        this.lIIIIlIIIIIlllIllIII[0] = liIlIIIlIllIlIllIIIl;
        this.lIIIIlIIIIIlllIllIII[1] = liIlIIIlIllIlIllIIIl2;
        this.lIIIIlIIIIIlllIllIII[2] = liIlIIIlIllIlIllIIIl3;
        this.lIIIIlIIIIIlllIllIII[3] = liIlIIIlIllIlIllIIIl4;
        this.lIIIIlIIIIIlllIllIII[4] = liIlIIIlIllIlIllIIIl5;
        this.lIIIIlIIIIIlllIllIII[5] = liIlIIIlIllIlIllIIIl6;
        this.lIIIIlIIIIIlllIllIII[6] = liIlIIIlIllIlIllIIIl7;
        this.lIIIIlIIIIIlllIllIII[7] = liIlIIIlIllIlIllIIIl8;
        this.lIIIlllIIIllIIIllIII[0] = new lIlIlIlllIIlIlIlllIl(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl6, liIlIIIlIllIlIllIIIl2, liIlIIIlIllIlIllIIIl3, liIlIIIlIllIlIllIIIl7 }, n + n5 + n3, n2 + n5, n + n5 + n3 + n5, n2 + n5 + n4, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[1] = new lIlIlIlllIIlIlIlllIl(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl, liIlIIIlIllIlIllIIIl5, liIlIIIlIllIlIllIIIl8, liIlIIIlIllIlIllIIIl4 }, n, n2 + n5, n + n5, n2 + n5 + n4, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[2] = new lIlIlIlllIIlIlIlllIl(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl6, liIlIIIlIllIlIllIIIl5, liIlIIIlIllIlIllIIIl, liIlIIIlIllIlIllIIIl2 }, n + n5, n2, n + n5 + n3, n2 + n5, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[3] = new lIlIlIlllIIlIlIlllIl(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl3, liIlIIIlIllIlIllIIIl4, liIlIIIlIllIlIllIIIl8, liIlIIIlIllIlIllIIIl7 }, n + n5 + n3, n2 + n5, n + n5 + n3 + n3, n2, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[4] = new lIlIlIlllIIlIlIlllIl(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl2, liIlIIIlIllIlIllIIIl, liIlIIIlIllIlIllIIIl4, liIlIIIlIllIlIllIIIl3 }, n + n5, n2 + n5, n + n5 + n3, n2 + n5 + n4, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        this.lIIIlllIIIllIIIllIII[5] = new lIlIlIlllIIlIlIlllIl(new lIIlIIIlIllIlIllIIIl[] { liIlIIIlIllIlIllIIIl5, liIlIIIlIllIlIllIIIl6, liIlIIIlIllIlIllIIIl7, liIlIIIlIllIlIllIIIl8 }, n + n5 + n3 + n5, n2 + n5, n + n5 + n3 + n5 + n3, n2 + n5 + n4, ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl);
        if (b) {
            for (int i = 0; i < this.lIIIlllIIIllIIIllIII.length; ++i) {
                this.lIIIlllIIIllIIIllIII[i].llllIIIIlIIIlIlllIll();
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final float n) {
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.length; ++i) {
            final lIlIlIlllIIlIlIlllIl lIlIlIlllIIlIlIlllIl = this.lIIIlllIIIllIIIllIII[i];
            if (lIlIlIlllIIlIlIlllIl != null) {
                lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, n);
            }
        }
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final String llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        return this;
    }
}
