package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

public class IllIIlllIIIIlllIIlIl extends llllIIIIlIIIlIlllIll
{
    public IllIIlllIIIIlllIIlIl(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
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
                final int n8 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * n7];
                this.llllIIIIlIIIlIlllIll(j + n, (long)(i + n2));
                if (n8 == 0) {
                    llllIIIIlIIIlIlllIll2[j + i * n3] = 0;
                }
                else {
                    final int llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(6);
                    int n9;
                    if (llllIIIIlIIIlIlllIll3 == 0) {
                        n9 = 4;
                    }
                    else if (llllIIIIlIIIlIlllIll3 <= 1) {
                        n9 = 3;
                    }
                    else {
                        n9 = 1;
                    }
                    llllIIIIlIIIlIlllIll2[j + i * n3] = n9;
                }
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
}
