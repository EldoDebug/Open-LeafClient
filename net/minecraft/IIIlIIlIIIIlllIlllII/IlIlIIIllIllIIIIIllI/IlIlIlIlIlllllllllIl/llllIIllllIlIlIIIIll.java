package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class llllIIllllIlIlIIIIll extends llllIIIIlIIIlIlllIll
{
    public llllIIllllIlIlIIIIll(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
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
                if (this.llllIIIIlIIIlIlllIll(57) == 0) {
                    if (n5 == llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll.lIIIIIlIlIIIlIIIIlIl) {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll.lIIIIIlIlIIIlIIIIlIl + 128;
                    }
                    else {
                        llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                    }
                }
                else {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
                }
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
}
