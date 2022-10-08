package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

public class IIIIlllIIIIIIlIIIlll extends llllIIIIlIIIlIlllIll
{
    public IIIIlllIIIIIIlIIIlll(final long n) {
        super(n);
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int[] llllIIIIlIIIlIlllIll = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.llllIIIIlIIIlIlllIll(n + j, (long)(n2 + i));
                llllIIIIlIIIlIlllIll[j + i * n3] = ((this.llllIIIIlIIIlIlllIll(10) == 0) ? 1 : 0);
            }
        }
        if (n > -n3 && n <= 0 && n2 > -n4 && n2 <= 0) {
            llllIIIIlIIIlIlllIll[-n + -n2 * n3] = 1;
        }
        return llllIIIIlIIIlIlllIll;
    }
}
