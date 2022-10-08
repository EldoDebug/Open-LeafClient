package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

public class llIIlIIIlIIIllIlIIIl extends llllIIIIlIIIlIlllIll
{
    private final llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI;
    private static volatile /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl;
    
    public llIIlIIIlIIIllIlIIIl(final long n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        switch (llllIIIIlIIIlIlllIll()[this.llIllIIIIIllIlIIIIlI.ordinal()]) {
            default: {
                return this.llIllIIIIIllIlIIIIlI(n, n2, n3, n4);
            }
            case 2: {
                return this.IlIIIlIlIIIllIlIlIIl(n, n2, n3, n4);
            }
            case 3: {
                return this.IlIlIIIllIllIIIIIllI(n, n2, n3, n4);
            }
        }
    }
    
    private int[] llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n - 1;
        final int n6 = n2 - 1;
        final int n7 = 1 + n3 + 1;
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5, n6, n7, 1 + n4 + 1);
        final int[] llllIIIIlIIIlIlllIll2 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.llllIIIIlIIIlIlllIll(j + n, (long)(i + n2));
                int n8 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * n7];
                if (n8 == 1) {
                    final int n9 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * n7];
                    final int n10 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * n7];
                    final int n11 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * n7];
                    final int n12 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * n7];
                    final boolean b = n9 == 3 || n10 == 3 || n11 == 3 || n12 == 3;
                    final boolean b2 = n9 == 4 || n10 == 4 || n11 == 4 || n12 == 4;
                    if (b || b2) {
                        n8 = 2;
                    }
                }
                llllIIIIlIIIlIlllIll2[j + i * n3] = n8;
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    private int[] IlIIIlIlIIIllIlIlIIl(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n - 1;
        final int n6 = n2 - 1;
        final int n7 = 1 + n3 + 1;
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5, n6, n7, 1 + n4 + 1);
        final int[] llllIIIIlIIIlIlllIll2 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n8 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1) * n7];
                if (n8 == 4) {
                    final int n9 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 - 1) * n7];
                    final int n10 = llllIIIIlIIIlIlllIll[j + 1 + 1 + (i + 1) * n7];
                    final int n11 = llllIIIIlIIIlIlllIll[j + 1 - 1 + (i + 1) * n7];
                    final int n12 = llllIIIIlIIIlIlllIll[j + 1 + (i + 1 + 1) * n7];
                    final boolean b = n9 == 2 || n10 == 2 || n11 == 2 || n12 == 2;
                    if (n9 == 1 || n10 == 1 || n11 == 1 || n12 == 1 || b) {
                        n8 = 3;
                    }
                }
                llllIIIIlIIIlIlllIll2[j + i * n3] = n8;
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    private int[] IlIlIIIllIllIIIIIllI(final int n, final int n2, final int n3, final int n4) {
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
        final int[] llllIIIIlIIIlIlllIll2 = IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.llllIIIIlIIIlIlllIll(j + n, (long)(i + n2));
                int n5 = llllIIIIlIIIlIlllIll[j + i * n3];
                if (n5 != 0 && this.llllIIIIlIIIlIlllIll(13) == 0) {
                    n5 |= (1 + this.llllIIIIlIIIlIlllIll(15) << 8 & 0xF00);
                }
                llllIIIIlIIIlIlllIll2[j + i * n3] = n5;
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] ilIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        if (ilIIIlIlIIIllIlIlIIl != null) {
            return ilIIIlIlIIIllIlIlIIl;
        }
        final int[] ilIIIlIlIIIllIlIlIIl2 = new int[llIllIlIIIIllIlIIllI.values().length];
        try {
            ilIIIlIlIIIllIlIlIIl2[llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
    }
}
