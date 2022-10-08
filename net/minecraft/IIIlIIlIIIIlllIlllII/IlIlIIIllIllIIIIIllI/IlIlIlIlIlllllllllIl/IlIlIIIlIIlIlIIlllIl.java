package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

public class IlIlIIIlIIlIlIIlllIl extends llllIIIIlIIIlIlllIll
{
    public IlIlIIIlIIlIlIIlllIl(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(n);
        super.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(int n, int n2, final int n3, final int n4) {
        n -= 2;
        n2 -= 2;
        final int n5 = n >> 2;
        final int n6 = n2 >> 2;
        final int n7 = (n3 >> 2) + 2;
        final int n8 = (n4 >> 2) + 2;
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5, n6, n7, n8);
        final int n9 = n7 - 1 << 2;
        final int[] llllIIIIlIIIlIlllIll2 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n9 * (n8 - 1 << 2));
        for (int i = 0; i < n8 - 1; ++i) {
            int j = 0;
            int n10 = llllIIIIlIIIlIlllIll[j + 0 + (i + 0) * n7];
            int n11 = llllIIIIlIIIlIlllIll[j + 0 + (i + 1) * n7];
            while (j < n7 - 1) {
                this.llllIIIIlIIIlIlllIll(j + n5 << 2, (long)(i + n6 << 2));
                final double n12 = (this.llllIIIIlIIIlIlllIll(1024) / 1024.0 - 0.5) * 3.6;
                final double n13 = (this.llllIIIIlIIIlIlllIll(1024) / 1024.0 - 0.5) * 3.6;
                this.llllIIIIlIIIlIlllIll(j + n5 + 1 << 2, (long)(i + n6 << 2));
                final double n14 = (this.llllIIIIlIIIlIlllIll(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                final double n15 = (this.llllIIIIlIIIlIlllIll(1024) / 1024.0 - 0.5) * 3.6;
                this.llllIIIIlIIIlIlllIll(j + n5 << 2, (long)(i + n6 + 1 << 2));
                final double n16 = (this.llllIIIIlIIIlIlllIll(1024) / 1024.0 - 0.5) * 3.6;
                final double n17 = (this.llllIIIIlIIIlIlllIll(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                this.llllIIIIlIIIlIlllIll(j + n5 + 1 << 2, (long)(i + n6 + 1 << 2));
                final double n18 = (this.llllIIIIlIIIlIlllIll(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                final double n19 = (this.llllIIIIlIIIlIlllIll(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                final int n20 = llllIIIIlIIIlIlllIll[j + 1 + (i + 0) * n7] & 0xFF;
                final int n21 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * n7] & 0xFF;
                for (int k = 0; k < 4; ++k) {
                    int n22 = ((i << 2) + k) * n9 + (j << 2);
                    for (int l = 0; l < 4; ++l) {
                        final double n23 = (k - n13) * (k - n13) + (l - n12) * (l - n12);
                        final double n24 = (k - n15) * (k - n15) + (l - n14) * (l - n14);
                        final double n25 = (k - n17) * (k - n17) + (l - n16) * (l - n16);
                        final double n26 = (k - n19) * (k - n19) + (l - n18) * (l - n18);
                        if (n23 < n24 && n23 < n25 && n23 < n26) {
                            llllIIIIlIIIlIlllIll2[n22++] = n10;
                        }
                        else if (n24 < n23 && n24 < n25 && n24 < n26) {
                            llllIIIIlIIIlIlllIll2[n22++] = n20;
                        }
                        else if (n25 < n23 && n25 < n24 && n25 < n26) {
                            llllIIIIlIIIlIlllIll2[n22++] = n11;
                        }
                        else {
                            llllIIIIlIIIlIlllIll2[n22++] = n21;
                        }
                    }
                }
                n10 = n20;
                n11 = n21;
                ++j;
            }
        }
        final int[] llllIIIIlIIIlIlllIll3 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int n27 = 0; n27 < n4; ++n27) {
            System.arraycopy(llllIIIIlIIIlIlllIll2, (n27 + (n2 & 0x3)) * n9 + (n & 0x3), llllIIIIlIIIlIlllIll3, n27 * n3, n3);
        }
        return llllIIIIlIIIlIlllIll3;
    }
}
