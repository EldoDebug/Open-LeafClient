package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class IIllIIllIIIlIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    public IIllIIllIIIlIlIIIIlI(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
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
                final llIIlIIIlIIIllIlIIIl ilIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(n5);
                if (n5 == llIIlIIIlIIIllIlIIIl.lIllllllIIllIlIlIlII.lIIIIIlIlIIIlIIIIlIl) {
                    final int n6 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    final int n7 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    final int n8 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    final int n9 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n6 != llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII.lIIIIIlIlIIIlIIIIlIl && n7 != llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII.lIIIIIlIlIIIlIIIIlIl && n8 != llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII.lIIIIIlIlIIIlIIIIlIl && n9 != llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII.lIIIIIlIlIIIlIIIIlIl) {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                    }
                    else {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.llIIlllIIlllIIllIllI.lIIIIIlIlIIIlIIIIlIl;
                    }
                }
                else if (ilIlIIIllIllIIIIIllI != null && ilIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI() == IlIlIIIlIIlIlIIlllIl.class) {
                    final int n10 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    final int n11 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    final int n12 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    final int n13 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (this.llIllIIIIIllIlIIIIlI(n10) && this.llIllIIIIIllIlIIIIlI(n11) && this.llIllIIIIIllIlIIIIlI(n12) && this.llIllIIIIIllIlIIIIlI(n13)) {
                        if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n10) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n11) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n12) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n13)) {
                            llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                        }
                        else {
                            llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IIlllIIIlIlllIIlllII.lIIIIIlIlIIIlIIIIlIl;
                        }
                    }
                    else {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IIllllIIIlIIIIIIllIl.lIIIIIlIlIIIlIIIIlIl;
                    }
                }
                else if (n5 != llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl.lIIIIIlIlIIIlIIIIlIl && n5 != llIIlIIIlIIIllIlIIIl.lIIlIIIlIllIlIllIIIl.lIIIIIlIlIIIlIIIIlIl && n5 != llIIlIIIlIIIllIlIIIl.IlIIIlIIIllllIlIlIlI.lIIIIIlIlIIIlIIIIlIl) {
                    if (ilIlIIIllIllIIIIIllI != null && ilIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl()) {
                        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, j, i, n3, n5, llIIlIIIlIIIllIlIIIl.llIllIlIlIIIIIIIllII.lIIIIIlIlIIIlIIIIlIl);
                    }
                    else if (n5 != llIIlIIIlIIIllIlIIIl.llIIIIIIlIllIIlIIIll.lIIIIIlIlIIIlIIIIlIl && n5 != llIIlIIIlIIIllIlIIIl.lIIIIlIlIllllIIlIllI.lIIIIIlIlIIIlIIIIlIl) {
                        if (n5 != llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII.lIIIIIlIlIIIlIIIIlIl && n5 != llIIlIIIlIIIllIlIIIl.IlllIIIIlIIIlIlIlIIl.lIIIIIlIlIIIlIIIIlIl && n5 != llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII.lIIIIIlIlIIIlIIIIlIl && n5 != llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl.lIIIIIlIlIIIlIIIIlIl) {
                            final int n14 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * (n3 + 2)];
                            final int n15 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * (n3 + 2)];
                            final int n16 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * (n3 + 2)];
                            final int n17 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * (n3 + 2)];
                            if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n14) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n15) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n16) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n17)) {
                                llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                            }
                            else {
                                llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IIlllIIIlIlllIIlllII.lIIIIIlIlIIIlIIIIlIl;
                            }
                        }
                        else {
                            llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                        }
                    }
                    else {
                        final int n18 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * (n3 + 2)];
                        final int n19 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * (n3 + 2)];
                        final int n20 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * (n3 + 2)];
                        final int n21 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * (n3 + 2)];
                        if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n18) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n19) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n20) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n21)) {
                            if (this.IlIIIlIlIIIllIlIlIIl(n18) && this.IlIIIlIlIIIllIlIlIIl(n19) && this.IlIIIlIlIIIllIlIlIIl(n20) && this.IlIIIlIlIIIllIlIlIIl(n21)) {
                                llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                            }
                            else {
                                llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl.lIIIIIlIlIIIlIIIIlIl;
                            }
                        }
                        else {
                            llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                        }
                    }
                }
                else {
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, j, i, n3, n5, llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll.lIIIIIlIlIIIlIIIIlIl);
                }
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    private void llllIIIIlIIIlIlllIll(final int[] array, final int[] array2, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n4)) {
            array2[n + n2 * n3] = n4;
        }
        else {
            final int n6 = array[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
            final int n7 = array[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
            final int n8 = array[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
            final int n9 = array[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
            if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n6) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n7) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n8) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n9)) {
                array2[n + n2 * n3] = n4;
            }
            else {
                array2[n + n2 * n3] = n5;
            }
        }
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final int n) {
        return (llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(n) != null && llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(n).lIlIlIIIllIIllIIIllI() == IlIlIIIlIIlIlIIlllIl.class) || n == llIIlIIIlIIIllIlIIIl.IIllllIIIlIIIIIIllIl.lIIIIIlIlIIIlIIIIlIl || n == llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl || n == llIIlIIIlIIIllIlIIIl.IIIIIIIIIlllIllIlIlI.lIIIIIlIlIIIlIIIIlIl || n == llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI.lIIIIIlIlIIIlIIIIlIl || n == llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.lIIIIIlIlIIIlIIIIlIl || net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n);
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final int n) {
        return llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(n) instanceof IlllllllIIIlIIIlIlII;
    }
}
