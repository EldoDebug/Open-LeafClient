package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;

public class llllIIIlIlllIlIIIIIl extends llllIIIIlIIIlIlllIll
{
    private llIIlIIIlIIIllIlIIIl[] llIllIIIIIllIlIIIIlI;
    private llIIlIIIlIIIllIlIIIl[] IlIIIlIlIIIllIlIlIIl;
    private llIIlIIIlIIIllIlIIIl[] IlIlIIIllIllIIIIIllI;
    private llIIlIIIlIIIllIlIIIl[] IllIIlllIIIIlllIIlIl;
    private final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl;
    
    public llllIIIlIlllIlIIIIIl(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII, final String s) {
        super(n);
        this.llIllIIIIIllIlIIIIlI = new llIIlIIIlIIIllIlIIIl[] { llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl, llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl, llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl, llIIlIIIlIIIllIlIIIl.IIlIIIlllIllIllIlIII, llIIlIIIlIIIllIlIIIl.IIlIIIlllIllIllIlIII, llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll };
        this.IlIIIlIlIIIllIlIlIIl = new llIIlIIIlIIIllIlIIIl[] { llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI, llIIlIIIlIIIllIlIIIl.IlIllllIIlIIlIlIlIll, llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl, llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll, llIIlIIIlIIIllIlIIIl.IIlIlIlIIlIllIIIIIIl, llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl };
        this.IlIlIIIllIllIIIIIllI = new llIIlIIIlIIIllIlIIIl[] { llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI, llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl, llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll, llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll };
        this.IllIIlllIIIIlllIIlIl = new llIIlIIIlIIIllIlIIIl[] { llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII, llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII, llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII, llIIlIIIlIIIllIlIIIl.IllIllIlllIllllIIllI };
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (llIllIlIlIIIIIIIllII == llIllIlIlIIIIIIIllII.lIIIIlIIIIIlllIllIII) {
            this.llIllIIIIIllIlIIIIlI = new llIIlIIIlIIIllIlIIIl[] { llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl, llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI, llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl, llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl, llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll, llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll };
            this.llllIIIlIlllIlIIIIIl = null;
        }
        else if (llIllIlIlIIIIIIIllII == llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl) {
            this.llllIIIlIlllIlIIIIIl = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(s).IlIlIlIlIlllllllllIl();
        }
        else {
            this.llllIIIlIlllIlIIIIIl = null;
        }
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
        final int[] llllIIIIlIIIlIlllIll2 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.llllIIIIlIIIlIlllIll(j + n, (long)(i + n2));
                final int n5 = llllIIIIlIIIlIlllIll[j + i * n3];
                final int n6 = (n5 & 0xF00) >> 8;
                final int n7 = n5 & 0xFFFFF0FF;
                if (this.llllIIIlIlllIlIIIIIl != null && this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII >= 0) {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII;
                }
                else if (net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n7)) {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = n7;
                }
                else if (n7 == llIIlIIIlIIIllIlIIIl.lIllllllIIllIlIlIlII.lIIIIIlIlIIIlIIIIlIl) {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = n7;
                }
                else if (n7 == 1) {
                    if (n6 > 0) {
                        if (this.llllIIIIlIIIlIlllIll(3) == 0) {
                            llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.llIIIlIlllIllIIlIllI.lIIIIIlIlIIIlIIIIlIl;
                        }
                        else {
                            llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.lIIIIlIlIllllIIlIllI.lIIIIIlIlIIIlIIIIlIl;
                        }
                    }
                    else {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = this.llIllIIIIIllIlIIIIlI[this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.length)].lIIIIIlIlIIIlIIIIlIl;
                    }
                }
                else if (n7 == 2) {
                    if (n6 > 0) {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = this.IlIIIlIlIIIllIlIlIIl[this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.length)].lIIIIIlIlIIIlIIIIlIl;
                    }
                }
                else if (n7 == 3) {
                    if (n6 > 0) {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IlIIlIlIIIlIIlIlIlII.lIIIIIlIlIIIlIIIIlIl;
                    }
                    else {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = this.IlIlIIIllIllIIIIIllI[this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.length)].lIIIIIlIlIIIlIIIIlIl;
                    }
                }
                else if (n7 == 4) {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = this.IllIIlllIIIIlllIIlIl[this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.length)].lIIIIIlIlIIIlIIIIlIl;
                }
                else {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.lIllllllIIllIlIlIlII.lIIIIIlIlIIIlIIIIlIl;
                }
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
}
