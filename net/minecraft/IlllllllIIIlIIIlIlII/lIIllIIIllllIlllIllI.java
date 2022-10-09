package net.minecraft.IlllllllIIIlIIIlIlII;

public class lIIllIIIllllIlllIllI
{
    private transient IllIlIllIllIlllIIlll[] llllIIIIlIIIlIlllIll;
    private transient int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private final float IlIlIIIllIllIIIIIllI = 0.75f;
    private transient volatile int IllIIlllIIIIlllIIlIl;
    
    public lIIllIIIllllIlllIllI() {
        this.llllIIIIlIIIlIlllIll = new IllIlIllIllIlllIIlll[4096];
        this.IlIIIlIlIIIllIlIlIIl = 3072;
        this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.length - 1;
    }
    
    private static int llllIIIlIlllIlIIIIIl(final long n) {
        return (int)(n ^ n >>> 27);
    }
    
    private static int llllIIIIlIIIlIlllIll(int n) {
        n = (n ^ n >>> 20 ^ n >>> 12);
        return n ^ n >>> 7 ^ n >>> 4;
    }
    
    private static int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return n & n2;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public Object llllIIIIlIIIlIlllIll(final long n) {
        for (IllIlIllIllIlllIIlll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl(n), this.llIllIIIIIllIlIIIIlI)]; llIllIIIIIllIlIIIIlI != null; llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) {
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll == n) {
                return llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;
            }
        }
        return null;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final long n) {
        return this.llIllIIIIIllIlIIIIlI(n) != null;
    }
    
    final IllIlIllIllIlllIIlll llIllIIIIIllIlIIIIlI(final long n) {
        for (IllIlIllIllIlllIIlll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl(n), this.llIllIIIIIllIlIIIIlI)]; llIllIIIIIllIlIIIIlI != null; llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) {
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll == n) {
                return llIllIIIIIllIlIIIIlI;
            }
        }
        return null;
    }
    
    public void llllIIIIlIIIlIlllIll(final long n, final Object ilIlIlIlIlllllllllIl) {
        final int llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl(n);
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, this.llIllIIIIIllIlIIIIlI);
        for (IllIlIllIllIlllIIlll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll]; llIllIIIIIllIlIIIIlI != null; llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) {
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll == n) {
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                return;
            }
        }
        ++this.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, n, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
    }
    
    private void IlIlIlIlIlllllllllIl(final int n) {
        if (this.llllIIIIlIIIlIlllIll.length == 1073741824) {
            this.IlIIIlIlIIIllIlIlIIl = Integer.MAX_VALUE;
        }
        else {
            final IllIlIllIllIlllIIlll[] llllIIIIlIIIlIlllIll = new IllIlIllIllIlllIIlll[n];
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
            this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.length - 1;
            final float n2 = (float)n;
            this.getClass();
            this.IlIIIlIlIIIllIlIlIIl = (int)(n2 * 0.75f);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IllIlIllIllIlllIIlll[] array) {
        final IllIlIllIllIlllIIlll[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        final int length = array.length;
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            IllIlIllIllIlllIIlll illIlIllIllIlllIIlll = llllIIIIlIIIlIlllIll[i];
            if (illIlIllIllIlllIIlll != null) {
                llllIIIIlIIIlIlllIll[i] = null;
                IllIlIllIllIlllIIlll llIllIIIIIllIlIIIIlI;
                do {
                    llIllIIIIIllIlIIIIlI = illIlIllIllIlllIIlll.llIllIIIIIllIlIIIIlI;
                    final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(illIlIllIllIlllIIlll.IlIIIlIlIIIllIlIlIIl, length - 1);
                    illIlIllIllIlllIIlll.llIllIIIIIllIlIIIIlI = array[llllIIIIlIIIlIlllIll2];
                    array[llllIIIIlIIIlIlllIll2] = illIlIllIllIlllIIlll;
                } while ((illIlIllIllIlllIIlll = llIllIIIIIllIlIIIIlI) != null);
            }
        }
    }
    
    public Object IlIIIlIlIIIllIlIlIIl(final long n) {
        final IllIlIllIllIlllIIlll ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(n);
        return (ilIlIIIllIllIIIIIllI == null) ? null : ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
    }
    
    final IllIlIllIllIlllIIlll IlIlIIIllIllIIIIIllI(final long n) {
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl(n), this.llIllIIIIIllIlIIIIlI);
        IllIlIllIllIlllIIlll illIlIllIllIlllIIlll2;
        IllIlIllIllIlllIIlll llIllIIIIIllIlIIIIlI;
        for (IllIlIllIllIlllIIlll illIlIllIllIlllIIlll = illIlIllIllIlllIIlll2 = this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll]; illIlIllIllIlllIIlll2 != null; illIlIllIllIlllIIlll2 = llIllIIIIIllIlIIIIlI) {
            llIllIIIIIllIlIIIIlI = illIlIllIllIlllIIlll2.llIllIIIIIllIlIIIIlI;
            if (illIlIllIllIlllIIlll2.llllIIIIlIIIlIlllIll == n) {
                ++this.IllIIlllIIIIlllIIlIl;
                --this.IlIlIlIlIlllllllllIl;
                if (illIlIllIllIlllIIlll == illIlIllIllIlllIIlll2) {
                    this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll] = llIllIIIIIllIlIIIIlI;
                }
                else {
                    illIlIllIllIlllIIlll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
                }
                return illIlIllIllIlllIIlll2;
            }
            illIlIllIllIlllIIlll = illIlIllIllIlllIIlll2;
        }
        return illIlIllIllIlllIIlll2;
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final long n2, final Object o, final int n3) {
        this.llllIIIIlIIIlIlllIll[n3] = new IllIlIllIllIlllIIlll(n, n2, o, this.llllIIIIlIIIlIlllIll[n3]);
        if (this.IlIlIlIlIlllllllllIl++ >= this.IlIIIlIlIIIllIlIlIIl) {
            this.IlIlIlIlIlllllllllIl(2 * this.llllIIIIlIIIlIlllIll.length);
        }
    }
    
    public double IlIlIlIlIlllllllllIl() {
        int n = 0;
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i] != null) {
                ++n;
            }
        }
        return 1.0 * n / this.IlIlIlIlIlllllllllIl;
    }
}
