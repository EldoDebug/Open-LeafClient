package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import org.apache.logging.log4j.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class IlIlIIIllIIllIlllllI extends llllIIIIlIIIlIlllIll
{
    private static final Logger llIllIIIIIllIlIIIIlI;
    private llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    
    static {
        llIllIIIIIllIlIIIIlI = LogManager.getLogger();
    }
    
    public IlIlIIIllIIllIlllllI(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n - 1, n2 - 1, n3 + 2, n4 + 2);
        final int[] llllIIIIlIIIlIlllIll2 = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n - 1, n2 - 1, n3 + 2, n4 + 2);
        final int[] llllIIIIlIIIlIlllIll3 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.llllIIIIlIIIlIlllIll(j + n, (long)(i + n2));
                final int n5 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * (n3 + 2)];
                final int n6 = llllIIIIlIIIlIlllIll2[j + 1 + (i + 1) * (n3 + 2)];
                final boolean b = (n6 - 2) % 29 == 0;
                if (n5 > 255) {
                    IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.debug("old! " + n5);
                }
                if (n5 != 0 && n6 >= 2 && (n6 - 2) % 29 == 1 && n5 < 128) {
                    if (llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(n5 + 128) != null) {
                        llllIIIIlIIIlIlllIll3[j + i * n3] = n5 + 128;
                    }
                    else {
                        llllIIIIlIIIlIlllIll3[j + i * n3] = n5;
                    }
                }
                else if (this.llllIIIIlIIIlIlllIll(3) != 0 && !b) {
                    llllIIIIlIIIlIlllIll3[j + i * n3] = n5;
                }
                else {
                    int n7;
                    if ((n7 = n5) == llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IIlIlIlIIlIllIIIIIIl.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.IllIllIIIIlIIlIlllII.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IlIllllIIlIIlIlIlIll.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.IIIllllllIllIIIlllIl.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IlIIlIlIIIlIIlIlIlII.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.IllIlIIllIllIIlIllII.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IllIllIlllIllllIIllI.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.llIlIIIIIlIIlIlIIlll.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll.lIIIIIlIlIIIlIIIIlIl) {
                        if (this.llllIIIIlIIIlIlllIll(3) == 0) {
                            n7 = llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI.lIIIIIlIlIIIlIIIIlIl;
                        }
                        else {
                            n7 = llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI.lIIIIIlIlIIIlIIIIlIl;
                        }
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.IIIIIIIIIlllIllIlIlI.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.IlllIIIIlIIIlIlIlIIl.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.lIIlIIIlIllIlIllIIIl.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IIlIIIlllIllIllIlIII.lIIIIIlIlIIIlIIIIlIl) {
                        n7 = llIIlIIIlIIIllIlIIIl.lIlIlIlllIIlIlIlllIl.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5, llIIlIIIlIIIllIlIIIl.lIIIIlIlIllllIIlIllI.lIIIIIlIlIIIlIIIIlIl)) {
                        n7 = llIIlIIIlIIIllIlIIIl.llIIIIIIlIllIIlIIIll.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else if (n5 == llIIlIIIlIIIllIlIIIl.IlllIIIIlIIIlIlIlIIl.lIIIIIlIlIIIlIIIIlIl && this.llllIIIIlIIIlIlllIll(3) == 0) {
                        if (this.llllIIIIlIIIlIlllIll(2) == 0) {
                            n7 = llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll.lIIIIIlIlIIIlIIIIlIl;
                        }
                        else {
                            n7 = llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI.lIIIIIlIlIIIlIIIIlIl;
                        }
                    }
                    if (b && n7 != n5) {
                        if (llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(n7 + 128) != null) {
                            n7 += 128;
                        }
                        else {
                            n7 = n5;
                        }
                    }
                    if (n7 == n5) {
                        llllIIIIlIIIlIlllIll3[j + i * n3] = n5;
                    }
                    else {
                        final int n8 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * (n3 + 2)];
                        final int n9 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * (n3 + 2)];
                        final int n10 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * (n3 + 2)];
                        final int n11 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * (n3 + 2)];
                        int n12 = 0;
                        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n8, n5)) {
                            ++n12;
                        }
                        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n9, n5)) {
                            ++n12;
                        }
                        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n10, n5)) {
                            ++n12;
                        }
                        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n11, n5)) {
                            ++n12;
                        }
                        if (n12 >= 3) {
                            llllIIIIlIIIlIlllIll3[j + i * n3] = n7;
                        }
                        else {
                            llllIIIIlIIIlIlllIll3[j + i * n3] = n5;
                        }
                    }
                }
            }
        }
        return llllIIIIlIIIlIlllIll3;
    }
}
