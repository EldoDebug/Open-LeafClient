package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

public class IIIlIIIlIlIIlllIIlll extends llllIIIIlIIIlIlllIll
{
    public IIIlIIIlIlIIlllIIlll(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
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
                final int n8 = llllIIIIlIIIlIlllIll[j + 0 + (i + 1) * n7];
                final int n9 = llllIIIIlIIIlIlllIll[j + 2 + (i + 1) * n7];
                final int n10 = llllIIIIlIIIlIlllIll[j + 1 + (i + 0) * n7];
                final int n11 = llllIIIIlIIIlIlllIll[j + 1 + (i + 2) * n7];
                int n12 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * n7];
                if (n8 == n9 && n10 == n11) {
                    this.llllIIIIlIIIlIlllIll(j + n, (long)(i + n2));
                    if (this.llllIIIIlIIIlIlllIll(2) == 0) {
                        n12 = n8;
                    }
                    else {
                        n12 = n10;
                    }
                }
                else {
                    if (n8 == n9) {
                        n12 = n8;
                    }
                    if (n10 == n11) {
                        n12 = n10;
                    }
                }
                llllIIIIlIIIlIlllIll2[j + i * n3] = n12;
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
}
