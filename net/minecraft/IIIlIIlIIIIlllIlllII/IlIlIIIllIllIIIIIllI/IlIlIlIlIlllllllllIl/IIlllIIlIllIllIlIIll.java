package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class IIlllIIlIllIllIlIIll extends llllIIIIlIIIlIlllIll
{
    public IIlllIIlIllIllIlIIll(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(n);
        super.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n - 1;
        final int n6 = n2 - 1;
        final int n7 = n3 + 2;
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5, n6, n7, n4 + 2);
        final int[] llllIIIIlIIIlIlllIll2 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                final int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll[j + 0 + (i + 1) * n7]);
                final int llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll[j + 2 + (i + 1) * n7]);
                final int llIllIIIIIllIlIIIIlI3 = this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll[j + 1 + (i + 0) * n7]);
                final int llIllIIIIIllIlIIIIlI4 = this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll[j + 1 + (i + 2) * n7]);
                final int llIllIIIIIllIlIIIIlI5 = this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * n7]);
                if (llIllIIIIIllIlIIIIlI5 == llIllIIIIIllIlIIIIlI && llIllIIIIIllIlIIIIlI5 == llIllIIIIIllIlIIIIlI3 && llIllIIIIIllIlIIIIlI5 == llIllIIIIIllIlIIIIlI2 && llIllIIIIIllIlIIIIlI5 == llIllIIIIIllIlIIIIlI4) {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = -1;
                }
                else {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII.lIIIIIlIlIIIlIIIIlIl;
                }
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    private int llIllIIIIIllIlIIIIlI(final int n) {
        return (n >= 2) ? (2 + (n & 0x1)) : n;
    }
}
