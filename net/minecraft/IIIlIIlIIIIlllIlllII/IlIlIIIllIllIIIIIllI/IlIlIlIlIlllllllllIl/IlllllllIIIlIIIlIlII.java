package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

public class IlllllllIIIlIIIlIlII extends llllIIIIlIIIlIlllIll
{
    public IlllllllIIIlIIIlIlII(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(n);
        super.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n >> 1;
        final int n6 = n2 >> 1;
        final int n7 = (n3 >> 1) + 2;
        final int n8 = (n4 >> 1) + 2;
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5, n6, n7, n8);
        final int n9 = n7 - 1 << 1;
        final int[] llllIIIIlIIIlIlllIll2 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n9 * (n8 - 1 << 1));
        for (int i = 0; i < n8 - 1; ++i) {
            int n10 = (i << 1) * n9;
            int j = 0;
            int n11 = llllIIIIlIIIlIlllIll[j + 0 + (i + 0) * n7];
            int n12 = llllIIIIlIIIlIlllIll[j + 0 + (i + 1) * n7];
            while (j < n7 - 1) {
                this.llllIIIIlIIIlIlllIll(j + n5 << 1, (long)(i + n6 << 1));
                final int n13 = llllIIIIlIIIlIlllIll[j + 1 + (i + 0) * n7];
                final int n14 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * n7];
                llllIIIIlIIIlIlllIll2[n10] = n11;
                llllIIIIlIIIlIlllIll2[n10++ + n9] = this.IlIlIlIlIlllllllllIl(n11, n12);
                llllIIIIlIIIlIlllIll2[n10] = this.IlIlIlIlIlllllllllIl(n11, n13);
                llllIIIIlIIIlIlllIll2[n10++ + n9] = this.IlIlIlIlIlllllllllIl(n11, n13, n12, n14);
                n11 = n13;
                n12 = n14;
                ++j;
            }
        }
        final int[] llllIIIIlIIIlIlllIll3 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int k = 0; k < n4; ++k) {
            System.arraycopy(llllIIIIlIIIlIlllIll2, (k + (n2 & 0x1)) * n9 + (n & 0x1), llllIIIIlIIIlIlllIll3, k * n3, n3);
        }
        return llllIIIIlIIIlIlllIll3;
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n2) {
        llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll;
        for (int i = 0; i < n2; ++i) {
            llllIIIIlIIIlIlllIll2 = new IlllllllIIIlIIIlIlII(n + i, llllIIIIlIIIlIlllIll2);
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    protected int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return (this.llllIIIIlIIIlIlllIll(2) == 0) ? n : n2;
    }
}
