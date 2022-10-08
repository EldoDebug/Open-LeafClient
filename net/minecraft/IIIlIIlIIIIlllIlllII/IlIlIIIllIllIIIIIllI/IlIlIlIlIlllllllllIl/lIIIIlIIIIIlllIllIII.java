package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class lIIIIlIIIIIlllIllIII extends llllIIIIlIIIlIlllIll
{
    public lIIIIlIIIIIlllIllIII(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n - 1, n2 - 1, n3 + 2, n4 + 2);
        final int[] llllIIIIlIIIlIlllIll2 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.llllIIIIlIIIlIlllIll(j + n, (long)(i + n2));
                final int n5 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * (n3 + 2)];
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, j, i, n3, n5, llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl.lIIIIIlIlIIIlIIIIlIl, llIIlIIIlIIIllIlIIIl.IlIIIlIIIllllIlIlIlI.lIIIIIlIlIIIlIIIIlIl) && !this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, j, i, n3, n5, llIIlIIIlIIIllIlIIIl.lIIIIlIlIllllIIlIllI.lIIIIIlIlIIIlIIIIlIl, llIIlIIIlIIIllIlIIIl.llIIIIIIlIllIIlIIIll.lIIIIIlIlIIIlIIIIlIl) && !this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, j, i, n3, n5, llIIlIIIlIIIllIlIIIl.llIIIlIlllIllIIlIllI.lIIIIIlIlIIIlIIIIlIl, llIIlIIIlIIIllIlIIIl.llIIIIIIlIllIIlIIIll.lIIIIIlIlIIIlIIIIlIl) && !this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, j, i, n3, n5, llIIlIIIlIIIllIlIIIl.IlIIlIlIIIlIIlIlIlII.lIIIIIlIlIIIlIIIIlIl, llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.lIIIIIlIlIIIlIIIIlIl)) {
                    if (n5 == llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl.lIIIIIlIlIIIlIIIIlIl) {
                        final int n6 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * (n3 + 2)];
                        final int n7 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * (n3 + 2)];
                        final int n8 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * (n3 + 2)];
                        final int n9 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * (n3 + 2)];
                        if (n6 != llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl && n7 != llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl && n8 != llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl && n9 != llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl) {
                            llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                        }
                        else {
                            llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.lIIlIIIlIllIlIllIIIl.lIIIIIlIlIIIlIIIIlIl;
                        }
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl.lIIIIIlIlIIIlIIIIlIl) {
                        final int n10 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * (n3 + 2)];
                        final int n11 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * (n3 + 2)];
                        final int n12 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * (n3 + 2)];
                        final int n13 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * (n3 + 2)];
                        if (n10 != llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl.lIIIIIlIlIIIlIIIIlIl && n11 != llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl.lIIIIIlIlIIIlIIIIlIl && n12 != llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl.lIIIIIlIlIIIlIIIIlIl && n13 != llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl.lIIIIIlIlIIIlIIIIlIl && n10 != llIIlIIIlIIIllIlIIIl.IllIllIlllIllllIIllI.lIIIIIlIlIIIlIIIIlIl && n11 != llIIlIIIlIIIllIlIIIl.IllIllIlllIllllIIllI.lIIIIIlIlIIIlIIIIlIl && n12 != llIIlIIIlIIIllIlIIIl.IllIllIlllIllllIIllI.lIIIIIlIlIIIlIIIIlIl && n13 != llIIlIIIlIIIllIlIIIl.IllIllIlllIllllIIllI.lIIIIIlIlIIIlIIIIlIl && n10 != llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl && n11 != llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl && n12 != llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl && n13 != llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl) {
                            if (n10 != llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl && n13 != llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl && n11 != llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl && n12 != llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl) {
                                llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                            }
                            else {
                                llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IIllllIIIlIIIIIIllIl.lIIIIIlIlIIIlIIIIlIl;
                            }
                        }
                        else {
                            llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll.lIIIIIlIlIIIlIIIIlIl;
                        }
                    }
                    else {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                    }
                }
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final int[] array, final int[] array2, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n4, n5)) {
            return false;
        }
        final int n7 = array[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
        final int n8 = array[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
        final int n9 = array[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
        final int n10 = array[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
        if (this.IlIlIlIlIlllllllllIl(n7, n5) && this.IlIlIlIlIlllllllllIl(n8, n5) && this.IlIlIlIlIlllllllllIl(n9, n5) && this.IlIlIlIlIlllllllllIl(n10, n5)) {
            array2[n + n2 * n3] = n4;
        }
        else {
            array2[n + n2 * n3] = n6;
        }
        return true;
    }
    
    private boolean IlIlIlIlIlllllllllIl(final int[] array, final int[] array2, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n4 != n5) {
            return false;
        }
        final int n7 = array[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
        final int n8 = array[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
        final int n9 = array[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
        final int n10 = array[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n7, n5) && net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n8, n5) && net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n9, n5) && net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n10, n5)) {
            array2[n + n2 * n3] = n4;
        }
        else {
            array2[n + n2 * n3] = n6;
        }
        return true;
    }
    
    private boolean IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2)) {
            return true;
        }
        final llIIlIIIlIIIllIlIIIl ilIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(n);
        final llIIlIIIlIIIllIlIIIl ilIlIIIllIllIIIIIllI2 = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(n2);
        if (ilIlIIIllIllIIIIIllI != null && ilIlIIIllIllIIIIIllI2 != null) {
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = ilIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI();
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI2 = ilIlIIIllIllIIIIIllI2.IlIlIIIllIIllIlllllI();
            return ilIlIIIllIIllIlllllI == ilIlIIIllIIllIlllllI2 || ilIlIIIllIIllIlllllI == IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI || ilIlIIIllIIllIlllllI2 == IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI;
        }
        return false;
    }
}
