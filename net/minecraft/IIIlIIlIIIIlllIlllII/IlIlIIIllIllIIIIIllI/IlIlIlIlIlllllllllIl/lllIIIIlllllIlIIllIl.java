package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

public class lllIIIIlllllIlIIllIl extends llllIIIIlIIIlIlllIll
{
    public lllIIIIlllllIlIIllIl(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
        final int[] llllIIIIlIIIlIlllIll2 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.llllIIIIlIIIlIlllIll(j + n, (long)(i + n2));
                llllIIIIlIIIlIlllIll2[j + i * n3] = ((llllIIIIlIIIlIlllIll[j + i * n3] > 0) ? (this.llllIIIIlIIIlIlllIll(299999) + 2) : 0);
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
}
