package net.minecraft.IlllllllIIIlIIIlIlII;

public class IIIllIIIlIlIIllIIIlI
{
    private transient IIlllIIlllIIIlIlllII[] llllIIIIlIIIlIlllIll;
    private transient int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private final float IlIIIlIlIIIllIlIlIIl = 0.75f;
    
    public IIIllIIIlIlIIllIIIlI() {
        this.llllIIIIlIIIlIlllIll = new IIlllIIlllIIIlIlllII[16];
        this.llIllIIIIIllIlIIIIlI = 12;
    }
    
    private static int llllIIIlIlllIlIIIIIl(int n) {
        n = (n ^ n >>> 20 ^ n >>> 12);
        return n ^ n >>> 7 ^ n >>> 4;
    }
    
    private static int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return n & n2 - 1;
    }
    
    public Object llllIIIIlIIIlIlllIll(final int n) {
        for (IIlllIIlllIIIlIlllII llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl(n), this.llllIIIIlIIIlIlllIll.length)]; llIllIIIIIllIlIIIIlI != null; llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) {
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll == n) {
                return llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;
            }
        }
        return null;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final int n) {
        return this.llIllIIIIIllIlIIIIlI(n) != null;
    }
    
    final IIlllIIlllIIIlIlllII llIllIIIIIllIlIIIIlI(final int n) {
        for (IIlllIIlllIIIlIlllII llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl(n), this.llllIIIIlIIIlIlllIll.length)]; llIllIIIIIllIlIIIIlI != null; llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) {
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll == n) {
                return llIllIIIIIllIlIIIIlI;
            }
        }
        return null;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final Object ilIlIlIlIlllllllllIl) {
        final int llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl(n);
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, this.llllIIIIlIIIlIlllIll.length);
        for (IIlllIIlllIIIlIlllII llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll]; llIllIIIIIllIlIIIIlI != null; llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) {
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll == n) {
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                return;
            }
        }
        this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, n, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
    }
    
    private void lIIIIlIIIIIlllIllIII(final int n) {
        if (this.llllIIIIlIIIlIlllIll.length == 1073741824) {
            this.llIllIIIIIllIlIIIIlI = Integer.MAX_VALUE;
        }
        else {
            final IIlllIIlllIIIlIlllII[] llllIIIIlIIIlIlllIll = new IIlllIIlllIIIlIlllII[n];
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
            this.llIllIIIIIllIlIIIIlI = (int)(n * 0.75f);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IIlllIIlllIIIlIlllII[] array) {
        final IIlllIIlllIIIlIlllII[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        final int length = array.length;
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII = llllIIIIlIIIlIlllIll[i];
            if (illlIIlllIIIlIlllII != null) {
                llllIIIIlIIIlIlllIll[i] = null;
                IIlllIIlllIIIlIlllII llIllIIIIIllIlIIIIlI;
                do {
                    llIllIIIIIllIlIIIIlI = illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI;
                    final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl, length);
                    illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI = array[llllIIIIlIIIlIlllIll2];
                    array[llllIIIIlIIIlIlllIll2] = illlIIlllIIIlIlllII;
                } while ((illlIIlllIIIlIlllII = llIllIIIIIllIlIIIIlI) != null);
            }
        }
    }
    
    public Object IlIIIlIlIIIllIlIlIIl(final int n) {
        final IIlllIIlllIIIlIlllII ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(n);
        return (ilIlIIIllIllIIIIIllI == null) ? null : ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
    }
    
    final IIlllIIlllIIIlIlllII IlIlIIIllIllIIIIIllI(final int n) {
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl(n), this.llllIIIIlIIIlIlllIll.length);
        IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII2;
        IIlllIIlllIIIlIlllII llIllIIIIIllIlIIIIlI;
        for (IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII = illlIIlllIIIlIlllII2 = this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll]; illlIIlllIIIlIlllII2 != null; illlIIlllIIIlIlllII2 = llIllIIIIIllIlIIIIlI) {
            llIllIIIIIllIlIIIIlI = illlIIlllIIIlIlllII2.llIllIIIIIllIlIIIIlI;
            if (illlIIlllIIIlIlllII2.llllIIIIlIIIlIlllIll == n) {
                --this.IlIlIlIlIlllllllllIl;
                if (illlIIlllIIIlIlllII == illlIIlllIIIlIlllII2) {
                    this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll] = llIllIIIIIllIlIIIIlI;
                }
                else {
                    illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
                }
                return illlIIlllIIIlIlllII2;
            }
            illlIIlllIIIlIlllII = illlIIlllIIIlIlllII2;
        }
        return illlIIlllIIIlIlllII2;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final IIlllIIlllIIIlIlllII[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            llllIIIIlIIIlIlllIll[i] = null;
        }
        this.IlIlIlIlIlllllllllIl = 0;
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final Object o, final int n3) {
        this.llllIIIIlIIIlIlllIll[n3] = new IIlllIIlllIIIlIlllII(n, n2, o, this.llllIIIIlIIIlIlllIll[n3]);
        if (this.IlIlIlIlIlllllllllIl++ >= this.llIllIIIIIllIlIIIIlI) {
            this.lIIIIlIIIIIlllIllIII(2 * this.llllIIIIlIIIlIlllIll.length);
        }
    }
}
