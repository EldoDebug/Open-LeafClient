package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class lIIIlllIIIllIIIllIII extends llllIIIIlIIIlIlllIll
{
    public lIIIlllIIIllIIIllIII(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
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
                final int n8 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * (n3 + 2)];
                final int n9 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * (n3 + 2)];
                final int n10 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * (n3 + 2)];
                final int n11 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * (n3 + 2)];
                final int n12 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * n7];
                int n13 = 0;
                if (n8 == 0) {
                    ++n13;
                }
                if (n9 == 0) {
                    ++n13;
                }
                if (n10 == 0) {
                    ++n13;
                }
                if (n11 == 0) {
                    ++n13;
                }
                if (n12 == 0 && n13 > 3) {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IlllIIIIlIIIlIlIlIIl.lIIIIIlIlIIIlIIIIlIl;
                }
                else {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = n12;
                }
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
}
