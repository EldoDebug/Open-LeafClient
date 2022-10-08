package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class llllIIIlIlllIlIIIIIl implements Serializable, Cloneable
{
    static final long llllIIIIlIIIlIlllIll = 2777097312029690941L;
    private static final boolean IlIlIIIllIllIIIIIllI = false;
    int IlIlIlIlIlllllllllIl;
    int llIllIIIIIllIlIIIIlI;
    double[][] IlIIIlIlIIIllIlIlIIl;
    private static final double IllIIlllIIIIlllIIlIl = 1.0E-10;
    
    public llllIIIlIlllIlIIIIIl(final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = new double[ilIlIlIlIlllllllllIl][llIllIIIIIllIlIIIIlI];
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        for (int i = 0; i < ilIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = 0.0;
            }
        }
        int n;
        if (ilIlIlIlIlllllllllIl < llIllIIIIIllIlIIIIlI) {
            n = ilIlIlIlIlllllllllIl;
        }
        else {
            n = llIllIIIIIllIlIIIIlI;
        }
        for (int k = 0; k < n; ++k) {
            this.IlIIIlIlIIIllIlIlIIl[k][k] = 1.0;
        }
    }
    
    public llllIIIlIlllIlIIIIIl(final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final double[] array) {
        this.IlIIIlIlIIIllIlIlIIl = new double[ilIlIlIlIlllllllllIl][llIllIIIIIllIlIIIIlI];
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        for (int i = 0; i < ilIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = array[i * llIllIIIIIllIlIIIIlI + j];
            }
        }
    }
    
    public llllIIIlIlllIlIIIIIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        this.IlIlIlIlIlllllllllIl = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix0"));
        }
        final double[][] ilIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                ilIIIlIlIIIllIlIlIIl[i][j] = 0.0;
                for (int k = 0; k < this.llIllIIIIIllIlIIIIlI; ++k) {
                    final double[] array = ilIIIlIlIIIllIlIlIIl[i];
                    final int n = j;
                    array[n] += this.IlIIIlIlIIIllIlIlIIl[i][k] * llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[k][j];
                }
            }
        }
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2) {
        if (llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl || this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix1"));
        }
        final double[][] ilIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI; ++j) {
                ilIIIlIlIIIllIlIlIIl[i][j] = 0.0;
                for (int k = 0; k < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++k) {
                    final double[] array = ilIIIlIlIIIllIlIlIIl[i];
                    final int n = j;
                    array[n] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][k] * llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[k][j];
                }
            }
        }
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2) {
        if (this.IlIlIlIlIlllllllllIl < liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl()) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix2"));
        }
        if (this.llIllIIIIIllIlIIIIlI < liiiIlIIIIIlllIllIII2.IllIIlllIIIIlllIIlIl()) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix3"));
        }
        for (int i = 0; i < liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl(); ++i) {
            for (int j = 0; j < liiiIlIIIIIlllIllIII2.IllIIlllIIIIlllIIlIl(); ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] * liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll[j];
            }
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix4"));
        }
        if (this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix5"));
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2) {
        if (llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix6"));
        }
        if (llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix7"));
        }
        if (this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI || this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix8"));
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j] + llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix9"));
        }
        if (this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix28"));
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] -= llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2) {
        if (llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix10"));
        }
        if (llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix11"));
        }
        if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix12"));
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j] - llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = -this.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix13"));
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = -llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
    }
    
    public final void IlIlIlIlIlllllllllIl() {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = 0.0;
            }
        }
        int n;
        if (this.IlIlIlIlIlllllllllIl < this.llIllIIIIIllIlIIIIlI) {
            n = this.IlIlIlIlIlllllllllIl;
        }
        else {
            n = this.llIllIIIIIllIlIIIIlI;
        }
        for (int k = 0; k < n; ++k) {
            this.IlIIIlIlIIIllIlIlIIl[k][k] = 1.0;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = 0.0;
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl() {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = -this.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
        int n;
        if (this.IlIlIlIlIlllllllllIl < this.llIllIIIIIllIlIIIIlI) {
            n = this.IlIlIlIlIlllllllllIl;
        }
        else {
            n = this.llIllIIIIIllIlIIIIlI;
        }
        for (int k = 0; k < n; ++k) {
            final double[] array = this.IlIIIlIlIIIllIlIlIIl[k];
            final int n2 = k;
            ++array[n2];
        }
    }
    
    public final void IlIlIIIllIllIIIIIllI() {
        this.llIIlIIIlIIIllIlIIIl(this);
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        this.llIIlIIIlIIIllIlIIIl(llllIIIlIlllIlIIIIIl);
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (this != llllIIIlIlllIlIIIIIl) {
            for (int i = 0; i < n3; ++i) {
                for (int j = 0; j < n4; ++j) {
                    llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n5 + i][n6 + j] = this.IlIIIlIlIIIllIlIlIIl[n + i][n2 + j];
                }
            }
        }
        else {
            final double[][] array = new double[n3][n4];
            for (int k = 0; k < n3; ++k) {
                for (int l = 0; l < n4; ++l) {
                    array[k][l] = this.IlIIIlIlIIIllIlIlIIl[n + k][n2 + l];
                }
            }
            for (int n7 = 0; n7 < n3; ++n7) {
                for (int n8 = 0; n8 < n4; ++n8) {
                    llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n5 + n7][n6 + n8] = array[n7][n8];
                }
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        final double[][] ilIIIlIlIIIllIlIlIIl = new double[ilIlIlIlIlllllllllIl][llIllIIIIIllIlIIIIlI];
        int ilIlIlIlIlllllllllIl2;
        if (this.IlIlIlIlIlllllllllIl < ilIlIlIlIlllllllllIl) {
            ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl;
        }
        else {
            ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl;
        }
        int llIllIIIIIllIlIIIIlI2;
        if (this.llIllIIIIIllIlIIIIlI < llIllIIIIIllIlIIIIlI) {
            llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI;
        }
        else {
            llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI;
        }
        for (int i = 0; i < ilIlIlIlIlllllllllIl2; ++i) {
            for (int j = 0; j < llIllIIIIIllIlIIIIlI2; ++j) {
                ilIIIlIlIIIllIlIlIIl[i][j] = this.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double[] array) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = array[this.llIllIIIIIllIlIIIIlI * i + j];
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.llIllIIIIIllIlIIIIlI < 3 || this.IlIlIlIlIlllllllllIl < 3) {
            this.llIllIIIIIllIlIIIIlI = 3;
            this.IlIlIlIlIlllllllllIl = 3;
            this.IlIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
        }
        this.IlIIIlIlIIIllIlIlIIl[0][0] = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl[0][1] = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl[0][2] = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl[1][0] = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.IlIIIlIlIIIllIlIlIIl[1][1] = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl[1][2] = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.IlIIIlIlIIIllIlIlIIl[2][0] = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.IlIIIlIlIIIllIlIlIIl[2][1] = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.IlIIIlIlIIIllIlIlIIl[2][2] = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        for (int i = 3; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 3; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = 0.0;
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        if (this.IlIlIlIlIlllllllllIl < 3 || this.llIllIIIIIllIlIIIIlI < 3) {
            this.IlIIIlIlIIIllIlIlIIl = new double[3][3];
            this.IlIlIlIlIlllllllllIl = 3;
            this.llIllIIIIIllIlIIIIlI = 3;
        }
        this.IlIIIlIlIIIllIlIlIIl[0][0] = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl[0][1] = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl[0][2] = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl[1][0] = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.IlIIIlIlIIIllIlIlIIl[1][1] = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl[1][2] = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.IlIIIlIlIIIllIlIlIIl[2][0] = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.IlIIIlIlIIIllIlIlIIl[2][1] = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.IlIIIlIlIIIllIlIlIIl[2][2] = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        for (int i = 3; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 3; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = 0.0;
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        if (this.IlIlIlIlIlllllllllIl < 4 || this.llIllIIIIIllIlIIIIlI < 4) {
            this.IlIIIlIlIIIllIlIlIIl = new double[4][4];
            this.IlIlIlIlIlllllllllIl = 4;
            this.llIllIIIIIllIlIIIIlI = 4;
        }
        this.IlIIIlIlIIIllIlIlIIl[0][0] = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl[0][1] = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl[0][2] = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl[0][3] = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI;
        this.IlIIIlIlIIIllIlIlIIl[1][0] = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl[1][1] = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl;
        this.IlIIIlIlIIIllIlIlIIl[1][2] = lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII;
        this.IlIIIlIlIIIllIlIlIIl[1][3] = lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII;
        this.IlIIIlIlIIIllIlIlIIl[2][0] = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl;
        this.IlIIIlIlIIIllIlIlIIl[2][1] = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI;
        this.IlIIIlIlIIIllIlIlIIl[2][2] = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIIIlIlIIIllIlIlIIl[2][3] = lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI;
        this.IlIIIlIlIIIllIlIlIIl[3][0] = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        this.IlIIIlIlIIIllIlIlIIl[3][1] = lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        this.IlIIIlIlIIIllIlIlIIl[3][2] = lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        this.IlIIIlIlIIIllIlIlIIl[3][3] = lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
        for (int i = 4; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 4; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = 0.0;
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        if (this.IlIlIlIlIlllllllllIl < 4 || this.llIllIIIIIllIlIIIIlI < 4) {
            this.IlIIIlIlIIIllIlIlIIl = new double[4][4];
            this.IlIlIlIlIlllllllllIl = 4;
            this.llIllIIIIIllIlIIIIlI = 4;
        }
        this.IlIIIlIlIIIllIlIlIIl[0][0] = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl[0][1] = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl[0][2] = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl[0][3] = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        this.IlIIIlIlIIIllIlIlIIl[1][0] = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl[1][1] = llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.IlIIIlIlIIIllIlIlIIl[1][2] = llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
        this.IlIIIlIlIIIllIlIlIIl[1][3] = llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
        this.IlIIIlIlIIIllIlIlIIl[2][0] = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
        this.IlIIIlIlIIIllIlIlIIl[2][1] = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
        this.IlIIIlIlIIIllIlIlIIl[2][2] = llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIIIlIlIIIllIlIlIIl[2][3] = llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        this.IlIIIlIlIIIllIlIlIIl[3][0] = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        this.IlIIIlIlIIIllIlIlIIl[3][1] = llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        this.IlIIIlIlIIIllIlIlIIl[3][2] = llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        this.IlIIIlIlIIIllIlIlIIl[3][3] = llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
        for (int i = 4; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 4; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = 0.0;
            }
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (this.IlIlIlIlIlllllllllIl < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            this.IlIlIlIlIlllllllllIl = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
        }
        for (int i = 0; i < Math.min(this.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl); ++i) {
            for (int j = 0; j < Math.min(this.llIllIIIIIllIlIIIIlI, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI); ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
        for (int k = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; k < this.IlIlIlIlIlllllllllIl; ++k) {
            for (int l = llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; l < this.llIllIIIIIllIlIIIIlI; ++l) {
                this.IlIIIlIlIIIllIlIlIIl[k][l] = 0.0;
            }
        }
    }
    
    public final int IllIIlllIIIIlllIIlIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public final int llllIIIlIlllIlIIIIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final double IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return this.IlIIIlIlIIIllIlIlIIl[n][n2];
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final int n2, final double n3) {
        this.IlIIIlIlIIIllIlIlIIl[n][n2] = n3;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final double[] array) {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            array[i] = this.IlIIIlIlIIIllIlIlIIl[n][i];
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl() < this.llIllIIIIIllIlIIIIlI) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] = this.IlIIIlIlIIIllIlIlIIl[n][i];
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final double[] array) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            array[i] = this.IlIIIlIlIIIllIlIlIIl[i][n];
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl() < this.IlIlIlIlIlllllllllIl) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] = this.IlIIIlIlIIIllIlIlIIl[i][n];
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        if (this.IlIlIlIlIlllllllllIl < 3 || this.llIllIIIIIllIlIIIIlI < 3) {
            liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII();
            if (this.llIllIIIIIllIlIIIIlI > 0) {
                if (this.IlIlIlIlIlllllllllIl > 0) {
                    liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl[0][0];
                    if (this.IlIlIlIlIlllllllllIl > 1) {
                        liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl[1][0];
                        if (this.IlIlIlIlIlllllllllIl > 2) {
                            liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII = this.IlIIIlIlIIIllIlIlIIl[2][0];
                        }
                    }
                }
                if (this.llIllIIIIIllIlIIIIlI > 1) {
                    if (this.IlIlIlIlIlllllllllIl > 0) {
                        liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl[0][1];
                        if (this.IlIlIlIlIlllllllllIl > 1) {
                            liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl = this.IlIIIlIlIIIllIlIlIIl[1][1];
                            if (this.IlIlIlIlIlllllllllIl > 2) {
                                liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII = this.IlIIIlIlIIIllIlIlIIl[2][1];
                            }
                        }
                    }
                    if (this.llIllIIIIIllIlIIIIlI > 2 && this.IlIlIlIlIlllllllllIl > 0) {
                        liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl[0][2];
                        if (this.IlIlIlIlIlllllllllIl > 1) {
                            liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[1][2];
                            if (this.IlIlIlIlIlllllllllIl > 2) {
                                liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = this.IlIIIlIlIIIllIlIlIIl[2][2];
                            }
                        }
                    }
                }
            }
        }
        else {
            liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl[0][0];
            liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl[0][1];
            liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl[0][2];
            liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl[1][0];
            liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl = this.IlIIIlIlIIIllIlIlIIl[1][1];
            liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[1][2];
            liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII = this.IlIIIlIlIIIllIlIlIIl[2][0];
            liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII = this.IlIIIlIlIIIllIlIlIIl[2][1];
            liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = this.IlIIIlIlIIIllIlIlIIl[2][2];
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.IlIlIlIlIlllllllllIl < 3 || this.llIllIIIIIllIlIIIIlI < 3) {
            llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII();
            if (this.llIllIIIIIllIlIIIIlI > 0) {
                if (this.IlIlIlIlIlllllllllIl > 0) {
                    llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = (float)this.IlIIIlIlIIIllIlIlIIl[0][0];
                    if (this.IlIlIlIlIlllllllllIl > 1) {
                        llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI = (float)this.IlIIIlIlIIIllIlIlIIl[1][0];
                        if (this.IlIlIlIlIlllllllllIl > 2) {
                            llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII = (float)this.IlIIIlIlIIIllIlIlIIl[2][0];
                        }
                    }
                }
                if (this.llIllIIIIIllIlIIIIlI > 1) {
                    if (this.IlIlIlIlIlllllllllIl > 0) {
                        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI = (float)this.IlIIIlIlIIIllIlIlIIl[0][1];
                        if (this.IlIlIlIlIlllllllllIl > 1) {
                            llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl = (float)this.IlIIIlIlIIIllIlIlIIl[1][1];
                            if (this.IlIlIlIlIlllllllllIl > 2) {
                                llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII = (float)this.IlIIIlIlIIIllIlIlIIl[2][1];
                            }
                        }
                    }
                    if (this.llIllIIIIIllIlIIIIlI > 2 && this.IlIlIlIlIlllllllllIl > 0) {
                        llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl = (float)this.IlIIIlIlIIIllIlIlIIl[0][2];
                        if (this.IlIlIlIlIlllllllllIl > 1) {
                            llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = (float)this.IlIIIlIlIIIllIlIlIIl[1][2];
                            if (this.IlIlIlIlIlllllllllIl > 2) {
                                llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = (float)this.IlIIIlIlIIIllIlIlIIl[2][2];
                            }
                        }
                    }
                }
            }
        }
        else {
            llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = (float)this.IlIIIlIlIIIllIlIlIIl[0][0];
            llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI = (float)this.IlIIIlIlIIIllIlIlIIl[0][1];
            llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl = (float)this.IlIIIlIlIIIllIlIlIIl[0][2];
            llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI = (float)this.IlIIIlIlIIIllIlIlIIl[1][0];
            llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl = (float)this.IlIIIlIlIIIllIlIlIIl[1][1];
            llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = (float)this.IlIIIlIlIIIllIlIlIIl[1][2];
            llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII = (float)this.IlIIIlIlIIIllIlIlIIl[2][0];
            llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII = (float)this.IlIIIlIlIIIllIlIlIIl[2][1];
            llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = (float)this.IlIIIlIlIIIllIlIlIIl[2][2];
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        if (this.IlIlIlIlIlllllllllIl < 4 || this.llIllIIIIIllIlIIIIlI < 4) {
            llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl();
            if (this.llIllIIIIIllIlIIIIlI > 0) {
                if (this.IlIlIlIlIlllllllllIl > 0) {
                    llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl[0][0];
                    if (this.IlIlIlIlIlllllllllIl > 1) {
                        llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl = this.IlIIIlIlIIIllIlIlIIl[1][0];
                        if (this.IlIlIlIlIlllllllllIl > 2) {
                            llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl = this.IlIIIlIlIIIllIlIlIIl[2][0];
                            if (this.IlIlIlIlIlllllllllIl > 3) {
                                llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll = this.IlIIIlIlIIIllIlIlIIl[3][0];
                            }
                        }
                    }
                }
                if (this.llIllIIIIIllIlIIIIlI > 1) {
                    if (this.IlIlIlIlIlllllllllIl > 0) {
                        llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl[0][1];
                        if (this.IlIlIlIlIlllllllllIl > 1) {
                            llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[1][1];
                            if (this.IlIlIlIlIlllllllllIl > 2) {
                                llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI = this.IlIIIlIlIIIllIlIlIIl[2][1];
                                if (this.IlIlIlIlIlllllllllIl > 3) {
                                    llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll = this.IlIIIlIlIIIllIlIlIIl[3][1];
                                }
                            }
                        }
                    }
                    if (this.llIllIIIIIllIlIIIIlI > 2) {
                        if (this.IlIlIlIlIlllllllllIl > 0) {
                            llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl[0][2];
                            if (this.IlIlIlIlIlllllllllIl > 1) {
                                llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII = this.IlIIIlIlIIIllIlIlIIl[1][2];
                                if (this.IlIlIlIlIlllllllllIl > 2) {
                                    llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI = this.IlIIIlIlIIIllIlIlIIl[2][2];
                                    if (this.IlIlIlIlIlllllllllIl > 3) {
                                        llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII = this.IlIIIlIlIIIllIlIlIIl[3][2];
                                    }
                                }
                            }
                        }
                        if (this.llIllIIIIIllIlIIIIlI > 3 && this.IlIlIlIlIlllllllllIl > 0) {
                            llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl[0][3];
                            if (this.IlIlIlIlIlllllllllIl > 1) {
                                llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII = this.IlIIIlIlIIIllIlIlIIl[1][3];
                                if (this.IlIlIlIlIlllllllllIl > 2) {
                                    llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI = this.IlIIIlIlIIIllIlIlIIl[2][3];
                                    if (this.IlIlIlIlIlllllllllIl > 3) {
                                        llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll = this.IlIIIlIlIIIllIlIlIIl[3][3];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl[0][0];
            llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl[0][1];
            llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl[0][2];
            llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl[0][3];
            llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl = this.IlIIIlIlIIIllIlIlIIl[1][0];
            llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[1][1];
            llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII = this.IlIIIlIlIIIllIlIlIIl[1][2];
            llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII = this.IlIIIlIlIIIllIlIlIIl[1][3];
            llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl = this.IlIIIlIlIIIllIlIlIIl[2][0];
            llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI = this.IlIIIlIlIIIllIlIlIIl[2][1];
            llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI = this.IlIIIlIlIIIllIlIlIIl[2][2];
            llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI = this.IlIIIlIlIIIllIlIlIIl[2][3];
            llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll = this.IlIIIlIlIIIllIlIlIIl[3][0];
            llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll = this.IlIIIlIlIIIllIlIlIIl[3][1];
            llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII = this.IlIIIlIlIIIllIlIlIIl[3][2];
            llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll = this.IlIIIlIlIIIllIlIlIIl[3][3];
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        if (this.IlIlIlIlIlllllllllIl < 4 || this.llIllIIIIIllIlIIIIlI < 4) {
            lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl();
            if (this.llIllIIIIIllIlIIIIlI > 0) {
                if (this.IlIlIlIlIlllllllllIl > 0) {
                    lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl = (float)this.IlIIIlIlIIIllIlIlIIl[0][0];
                    if (this.IlIlIlIlIlllllllllIl > 1) {
                        lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl = (float)this.IlIIIlIlIIIllIlIlIIl[1][0];
                        if (this.IlIlIlIlIlllllllllIl > 2) {
                            lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl = (float)this.IlIIIlIlIIIllIlIlIIl[2][0];
                            if (this.IlIlIlIlIlllllllllIl > 3) {
                                lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll = (float)this.IlIIIlIlIIIllIlIlIIl[3][0];
                            }
                        }
                    }
                }
                if (this.llIllIIIIIllIlIIIIlI > 1) {
                    if (this.IlIlIlIlIlllllllllIl > 0) {
                        lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = (float)this.IlIIIlIlIIIllIlIlIIl[0][1];
                        if (this.IlIlIlIlIlllllllllIl > 1) {
                            lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl = (float)this.IlIIIlIlIIIllIlIlIIl[1][1];
                            if (this.IlIlIlIlIlllllllllIl > 2) {
                                lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI = (float)this.IlIIIlIlIIIllIlIlIIl[2][1];
                                if (this.IlIlIlIlIlllllllllIl > 3) {
                                    lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll = (float)this.IlIIIlIlIIIllIlIlIIl[3][1];
                                }
                            }
                        }
                    }
                    if (this.llIllIIIIIllIlIIIIlI > 2) {
                        if (this.IlIlIlIlIlllllllllIl > 0) {
                            lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl = (float)this.IlIIIlIlIIIllIlIlIIl[0][2];
                            if (this.IlIlIlIlIlllllllllIl > 1) {
                                lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII = (float)this.IlIIIlIlIIIllIlIlIIl[1][2];
                                if (this.IlIlIlIlIlllllllllIl > 2) {
                                    lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI = (float)this.IlIIIlIlIIIllIlIlIIl[2][2];
                                    if (this.IlIlIlIlIlllllllllIl > 3) {
                                        lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII = (float)this.IlIIIlIlIIIllIlIlIIl[3][2];
                                    }
                                }
                            }
                        }
                        if (this.llIllIIIIIllIlIIIIlI > 3 && this.IlIlIlIlIlllllllllIl > 0) {
                            lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI = (float)this.IlIIIlIlIIIllIlIlIIl[0][3];
                            if (this.IlIlIlIlIlllllllllIl > 1) {
                                lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII = (float)this.IlIIIlIlIIIllIlIlIIl[1][3];
                                if (this.IlIlIlIlIlllllllllIl > 2) {
                                    lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI = (float)this.IlIIIlIlIIIllIlIlIIl[2][3];
                                    if (this.IlIlIlIlIlllllllllIl > 3) {
                                        lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll = (float)this.IlIIIlIlIIIllIlIlIIl[3][3];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl = (float)this.IlIIIlIlIIIllIlIlIIl[0][0];
            lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = (float)this.IlIIIlIlIIIllIlIlIIl[0][1];
            lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl = (float)this.IlIIIlIlIIIllIlIlIIl[0][2];
            lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI = (float)this.IlIIIlIlIIIllIlIlIIl[0][3];
            lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl = (float)this.IlIIIlIlIIIllIlIlIIl[1][0];
            lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl = (float)this.IlIIIlIlIIIllIlIlIIl[1][1];
            lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII = (float)this.IlIIIlIlIIIllIlIlIIl[1][2];
            lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII = (float)this.IlIIIlIlIIIllIlIlIIl[1][3];
            lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl = (float)this.IlIIIlIlIIIllIlIlIIl[2][0];
            lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI = (float)this.IlIIIlIlIIIllIlIlIIl[2][1];
            lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI = (float)this.IlIIIlIlIIIllIlIlIIl[2][2];
            lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI = (float)this.IlIIIlIlIIIllIlIlIIl[2][3];
            lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll = (float)this.IlIIIlIlIIIllIlIlIIl[3][0];
            lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll = (float)this.IlIIIlIlIIIllIlIlIIl[3][1];
            lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII = (float)this.IlIIIlIlIIIllIlIlIIl[3][2];
            lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll = (float)this.IlIIIlIlIIIllIlIlIIl[3][3];
        }
    }
    
    public final void llllIIIlIlllIlIIIIIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        int n;
        if (this.llIllIIIIIllIlIIIIlI < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            n = this.llIllIIIIIllIlIIIIlI;
        }
        else {
            n = llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        }
        int n2;
        if (this.IlIlIlIlIlllllllllIl < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            n2 = this.IlIlIlIlIlllllllllIl;
        }
        else {
            n2 = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl;
        }
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j] = this.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
        for (int k = n2; k < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++k) {
            for (int l = 0; l < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++l) {
                llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[k][l] = 0.0;
            }
        }
        for (int n3 = n; n3 < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++n3) {
            for (int n4 = 0; n4 < n2; ++n4) {
                llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n4][n3] = 0.0;
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final double[] array) {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.IlIIIlIlIIIllIlIlIIl[n][i] = array[i];
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.IlIIIlIlIIIllIlIlIIl[n][i] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final double[] array) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            this.IlIIIlIlIIIllIlIlIIl[i][n] = array[i];
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            this.IlIIIlIlIIIllIlIlIIl[i][n] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2) {
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI || this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix14"));
        }
        if (llllIIIlIlllIlIIIIIl == this || llllIIIlIlllIlIIIIIl2 == this) {
            final double[][] ilIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
            for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
                for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                    ilIIIlIlIIIllIlIlIIl[i][j] = 0.0;
                    for (int k = 0; k < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++k) {
                        final double[] array = ilIIIlIlIIIllIlIlIIl[i];
                        final int n = j;
                        array[n] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[k][i] * llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[j][k];
                    }
                }
            }
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
        else {
            for (int l = 0; l < this.IlIlIlIlIlllllllllIl; ++l) {
                for (int n2 = 0; n2 < this.llIllIIIIIllIlIIIIlI; ++n2) {
                    this.IlIIIlIlIIIllIlIlIIl[l][n2] = 0.0;
                    for (int n3 = 0; n3 < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++n3) {
                        final double[] array2 = this.IlIIIlIlIIIllIlIlIIl[l];
                        final int n4 = n2;
                        array2[n4] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n3][l] * llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[n2][n3];
                    }
                }
            }
        }
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2) {
        if (llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl || this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix15"));
        }
        if (llllIIIlIlllIlIIIIIl == this || llllIIIlIlllIlIIIIIl2 == this) {
            final double[][] ilIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
            for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
                for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                    ilIIIlIlIIIllIlIlIIl[i][j] = 0.0;
                    for (int k = 0; k < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++k) {
                        final double[] array = ilIIIlIlIIIllIlIlIIl[i];
                        final int n = j;
                        array[n] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][k] * llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[j][k];
                    }
                }
            }
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
        else {
            for (int l = 0; l < this.IlIlIlIlIlllllllllIl; ++l) {
                for (int n2 = 0; n2 < this.llIllIIIIIllIlIIIIlI; ++n2) {
                    this.IlIIIlIlIIIllIlIlIIl[l][n2] = 0.0;
                    for (int n3 = 0; n3 < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++n3) {
                        final double[] array2 = this.IlIIIlIlIIIllIlIlIIl[l];
                        final int n4 = n2;
                        array2[n4] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[l][n3] * llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[n2][n3];
                    }
                }
            }
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2) {
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI || this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix16"));
        }
        if (llllIIIlIlllIlIIIIIl == this || llllIIIlIlllIlIIIIIl2 == this) {
            final double[][] ilIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
            for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
                for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                    ilIIIlIlIIIllIlIlIIl[i][j] = 0.0;
                    for (int k = 0; k < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++k) {
                        final double[] array = ilIIIlIlIIIllIlIlIIl[i];
                        final int n = j;
                        array[n] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[k][i] * llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[k][j];
                    }
                }
            }
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
        else {
            for (int l = 0; l < this.IlIlIlIlIlllllllllIl; ++l) {
                for (int n2 = 0; n2 < this.llIllIIIIIllIlIIIIlI; ++n2) {
                    this.IlIIIlIlIIIllIlIlIIl[l][n2] = 0.0;
                    for (int n3 = 0; n3 < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++n3) {
                        final double[] array2 = this.IlIIIlIlIIIllIlIlIIl[l];
                        final int n4 = n2;
                        array2[n4] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n3][l] * llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[n3][n2];
                    }
                }
            }
        }
    }
    
    public final void lIIIIlIIIIIlllIllIII() {
        if (this.IlIlIlIlIlllllllllIl != this.llIllIIIIIllIlIIIIlI) {
            final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
            this.IlIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI;
            this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl;
            final double[][] ilIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
            for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
                for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                    ilIIIlIlIIIllIlIlIIl[i][j] = this.IlIIIlIlIIIllIlIlIIl[j][i];
                }
            }
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
        else {
            for (int k = 0; k < this.IlIlIlIlIlllllllllIl; ++k) {
                for (int l = 0; l < k; ++l) {
                    final double n = this.IlIIIlIlIIIllIlIlIIl[k][l];
                    this.IlIIIlIlIIIllIlIlIIl[k][l] = this.IlIIIlIlIIIllIlIlIIl[l][k];
                    this.IlIIIlIlIIIllIlIlIIl[l][k] = n;
                }
            }
        }
    }
    
    public final void lIIIIlIIIIIlllIllIII(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix17"));
        }
        if (llllIIIlIlllIlIIIIIl != this) {
            for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
                for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                    this.IlIIIlIlIIIllIlIlIIl[i][j] = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[j][i];
                }
            }
        }
        else {
            this.lIIIIlIIIIIlllIllIII();
        }
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.IlIlIlIlIlllllllllIl * this.llIllIIIIIllIlIIIIlI * 8);
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                sb.append(this.IlIIIlIlIIIllIlIlIIl[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    private static void llIllIlIIIIllIlIIllI(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++j) {
                if (Math.abs(llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j]) < 1.0E-10) {
                    System.out.print(" 0.0     ");
                }
                else {
                    System.out.print(" " + llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j]);
                }
            }
            System.out.print("\n");
        }
    }
    
    @Override
    public int hashCode() {
        long n = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.IlIlIlIlIlllllllllIl), this.llIllIIIIIllIlIIIIlI);
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                n = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(n, this.IlIIIlIlIIIllIlIlIIl[i][j]);
            }
        }
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(n);
    }
    
    public boolean lIIIlllIIIllIIIllIII(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        try {
            if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
                return false;
            }
            for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
                for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                    if (this.IlIIIlIlIIIllIlIlIIl[i][j] != llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = (llllIIIlIlllIlIIIIIl)o;
            if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
                return false;
            }
            for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
                for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                    if (this.IlIIIlIlIIIllIlIlIIl[i][j] != llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
        catch (ClassCastException ex) {
            return false;
        }
        catch (NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final float n) {
        return this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, (double)n);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final double n) {
        if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            return false;
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                final double n2 = this.IlIIIlIlIIIllIlIlIIl[i][j] - llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j];
                if (((n2 < 0.0) ? (-n2) : n2) > n) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final double lIIIlllIIIllIIIllIII() {
        int n;
        if (this.IlIlIlIlIlllllllllIl < this.llIllIIIIIllIlIIIIlI) {
            n = this.IlIlIlIlIlllllllllIl;
        }
        else {
            n = this.llIllIIIIIllIlIIIIlI;
        }
        double n2 = 0.0;
        for (int i = 0; i < n; ++i) {
            n2 += this.IlIIIlIlIIIllIlIlIIl[i][i];
        }
        return n2;
    }
    
    public final int llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3) {
        if (this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl3.llIllIIIIIllIlIIIIlI || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl3.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix18"));
        }
        if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl || this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix25"));
        }
        if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl || this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix26"));
        }
        if (this.IlIlIlIlIlllllllllIl != 2 || this.llIllIIIIIllIlIIIIlI != 2 || this.IlIIIlIlIIIllIlIlIIl[1][0] != 0.0) {
            return llllIIIIlIIIlIlllIll(this, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2, llllIIIlIlllIlIIIIIl3);
        }
        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
        llllIIIlIlllIlIIIIIl3.IlIlIlIlIlllllllllIl();
        if (this.IlIIIlIlIIIllIlIlIIl[0][1] == 0.0) {
            return 2;
        }
        final double[] array = { 0.0 };
        final double[] array2 = { 0.0 };
        final double[] array3 = { 0.0 };
        final double[] array4 = { 0.0 };
        llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[0][0], this.IlIIIlIlIIIllIlIlIIl[0][1], this.IlIIIlIlIIIllIlIlIIl[1][1], new double[] { this.IlIIIlIlIIIllIlIlIIl[0][0], this.IlIIIlIlIIIllIlIlIIl[1][1] }, array, array3, array2, array4, 0);
        IlIlIlIlIlllllllllIl(0, llllIIIlIlllIlIIIIIl, array3, array);
        llllIIIIlIIIlIlllIll(0, llllIIIlIlllIlIIIIIl3, array4, array2);
        return 2;
    }
    
    public final int llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final double[] array = new double[llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl * llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI];
        final int[] array2 = { 0 };
        final int[] array3 = new int[llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl];
        if (this.IlIlIlIlIlllllllllIl != this.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix19"));
        }
        if (this.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix27"));
        }
        if (this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix27"));
        }
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl()) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix20"));
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                array[i * this.llIllIIIIIllIlIIIIlI + j] = this.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
        if (!llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, array, array3, array2)) {
            throw new IIIlIIlIIIIlllIlllII(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix21"));
        }
        for (int k = 0; k < this.IlIlIlIlIlllllllllIl; ++k) {
            for (int l = 0; l < this.llIllIIIIIllIlIIIIlI; ++l) {
                llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[k][l] = array[k * this.llIllIIIIIllIlIIIIlI + l];
            }
        }
        for (int n = 0; n < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++n) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[n] = array3[n];
        }
        return array2[0];
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n) {
        int n2;
        if (this.IlIlIlIlIlllllllllIl < this.llIllIIIIIllIlIIIIlI) {
            n2 = this.IlIlIlIlIlllllllllIl;
        }
        else {
            n2 = this.llIllIIIIIllIlIIIIlI;
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                this.IlIIIlIlIIIllIlIlIIl[i][j] = 0.0;
            }
        }
        for (int k = 0; k < n2; ++k) {
            this.IlIIIlIlIIIllIlIlIIl[k][k] = n;
        }
    }
    
    final void llIIlIIIlIIIllIlIIIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final int n = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl * llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        final double[] array = new double[n];
        final double[] array2 = new double[n];
        final int[] array3 = new int[llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl];
        final int[] array4 = { 0 };
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix22"));
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                array[i * this.llIllIIIIIllIlIIIIlI + j] = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
        if (!llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, array, array3, array4)) {
            throw new IIIlIIlIIIIlllIlllII(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix21"));
        }
        for (int k = 0; k < n; ++k) {
            array2[k] = 0.0;
        }
        for (int l = 0; l < this.llIllIIIIIllIlIIIIlI; ++l) {
            array2[l + l * this.llIllIIIIIllIlIIIIlI] = 1.0;
        }
        llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, array, array3, array2);
        for (int n2 = 0; n2 < this.IlIlIlIlIlllllllllIl; ++n2) {
            for (int n3 = 0; n3 < this.llIllIIIIIllIlIIIIlI; ++n3) {
                this.IlIIIlIlIIIllIlIlIIl[n2][n3] = array2[n2 * this.llIllIIIIIllIlIIIIlI + n3];
            }
        }
    }
    
    static boolean llllIIIIlIIIlIlllIll(final int n, final double[] array, final int[] array2, final int[] array3) {
        final double[] array4 = new double[n];
        int n2 = 0;
        int n3 = 0;
        array3[0] = 1;
        int n4 = n;
        while (n4-- != 0) {
            double n5 = 0.0;
            int n6 = n;
            while (n6-- != 0) {
                final double abs = Math.abs(array[n2++]);
                if (abs > n5) {
                    n5 = abs;
                }
            }
            if (n5 == 0.0) {
                return false;
            }
            array4[n3++] = 1.0 / n5;
        }
        final int n7 = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                final int n8 = n7 + n * j + i;
                double n9 = array[n8];
                int n10 = j;
                int n11 = n7 + n * j;
                int n12 = n7 + i;
                while (n10-- != 0) {
                    n9 -= array[n11] * array[n12];
                    ++n11;
                    n12 += n;
                }
                array[n8] = n9;
            }
            double n13 = 0.0;
            int n14 = -1;
            for (int k = i; k < n; ++k) {
                final int n15 = n7 + n * k + i;
                double n16 = array[n15];
                int n17 = i;
                int n18 = n7 + n * k;
                int n19 = n7 + i;
                while (n17-- != 0) {
                    n16 -= array[n18] * array[n19];
                    ++n18;
                    n19 += n;
                }
                array[n15] = n16;
                final double n20;
                if ((n20 = array4[k] * Math.abs(n16)) >= n13) {
                    n13 = n20;
                    n14 = k;
                }
            }
            if (n14 < 0) {
                throw new RuntimeException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GMatrix24"));
            }
            if (i != n14) {
                int n21 = n;
                int n22 = n7 + n * n14;
                int n23 = n7 + n * i;
                while (n21-- != 0) {
                    final double n24 = array[n22];
                    array[n22++] = array[n23];
                    array[n23++] = n24;
                }
                array4[n14] = array4[i];
                array3[0] = -array3[0];
            }
            array2[i] = n14;
            if (array[n7 + n * i + i] == 0.0) {
                return false;
            }
            if (i != n - 1) {
                final double n25 = 1.0 / array[n7 + n * i + i];
                int n26 = n7 + n * (i + 1) + i;
                int n27 = n - 1 - i;
                while (n27-- != 0) {
                    final int n28 = n26;
                    array[n28] *= n25;
                    n26 += n;
                }
            }
        }
        return true;
    }
    
    static void llllIIIIlIIIlIlllIll(final int n, final double[] array, final int[] array2, final double[] array3) {
        final int n2 = 0;
        for (int i = 0; i < n; ++i) {
            final int n3 = i;
            int n4 = -1;
            for (int j = 0; j < n; ++j) {
                final int n5 = array2[n2 + j];
                double n6 = array3[n3 + n * n5];
                array3[n3 + n * n5] = array3[n3 + n * j];
                if (n4 >= 0) {
                    final int n7 = j * n;
                    for (int k = n4; k <= j - 1; ++k) {
                        n6 -= array[n7 + k] * array3[n3 + n * k];
                    }
                }
                else if (n6 != 0.0) {
                    n4 = j;
                }
                array3[n3 + n * j] = n6;
            }
            for (int l = 0; l < n; ++l) {
                final int n8 = n - 1 - l;
                final int n9 = n * n8;
                double n10 = 0.0;
                for (int n11 = 1; n11 <= l; ++n11) {
                    n10 += array[n9 + n - n11] * array3[n3 + n * (n - n11)];
                }
                array3[n3 + n * n8] = (array3[n3 + n * n8] - n10) / array[n9 + n8];
            }
        }
    }
    
    static int llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl4) {
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl5 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl6 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl7 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl8 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl);
        int n;
        int ilIlIlIlIlllllllllIl;
        if (llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl >= llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI) {
            n = llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI;
            ilIlIlIlIlllllllllIl = llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI - 1;
        }
        else {
            n = llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl;
            ilIlIlIlIlllllllllIl = llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl;
        }
        int n2;
        if (llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl > llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI) {
            n2 = llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl;
        }
        else {
            n2 = llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI;
        }
        final double[] array = new double[n2];
        final double[] array2 = new double[n];
        final double[] array3 = new double[ilIlIlIlIlllllllllIl];
        llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl();
        llllIIIlIlllIlIIIIIl4.IlIlIlIlIlllllllllIl();
        int ilIlIlIlIlllllllllIl2 = llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl;
        int llIllIIIIIllIlIIIIlI = llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI;
        for (int i = 0; i < n; ++i) {
            if (ilIlIlIlIlllllllllIl2 > 1) {
                double n3 = 0.0;
                for (int j = 0; j < ilIlIlIlIlllllllllIl2; ++j) {
                    n3 += llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[j + i][i] * llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[j + i][i];
                }
                final double sqrt = Math.sqrt(n3);
                if (llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i] == 0.0) {
                    array[0] = sqrt;
                }
                else {
                    array[0] = llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i] + llIllIIIIIllIlIIIIlI(sqrt, llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i]);
                }
                for (int k = 1; k < ilIlIlIlIlllllllllIl2; ++k) {
                    array[k] = llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i + k][i];
                }
                double n4 = 0.0;
                for (int l = 0; l < ilIlIlIlIlllllllllIl2; ++l) {
                    n4 += array[l] * array[l];
                }
                final double n5 = 2.0 / n4;
                for (int n6 = i; n6 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n6) {
                    for (int n7 = i; n7 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n7) {
                        llllIIIlIlllIlIIIIIl6.IlIIIlIlIIIllIlIlIIl[n6][n7] = -n5 * array[n6 - i] * array[n7 - i];
                    }
                }
                for (int n8 = i; n8 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n8) {
                    final double[] array4 = llllIIIlIlllIlIIIIIl6.IlIIIlIlIIIllIlIlIIl[n8];
                    final int n9 = n8;
                    ++array4[n9];
                }
                double n10 = 0.0;
                for (int n11 = i; n11 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n11) {
                    n10 += llllIIIlIlllIlIIIIIl6.IlIIIlIlIIIllIlIlIIl[i][n11] * llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[n11][i];
                }
                llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i] = n10;
                for (int n12 = i; n12 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n12) {
                    for (int n13 = i + 1; n13 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n13) {
                        llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n12][n13] = 0.0;
                        for (int n14 = i; n14 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n14) {
                            final double[] array5 = llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n12];
                            final int n15 = n13;
                            array5[n15] += llllIIIlIlllIlIIIIIl6.IlIIIlIlIIIllIlIlIIl[n12][n14] * llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[n14][n13];
                        }
                    }
                }
                for (int n16 = i; n16 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n16) {
                    for (int n17 = i + 1; n17 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n17) {
                        llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[n16][n17] = llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n16][n17];
                    }
                }
                for (int n18 = i; n18 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n18) {
                    for (int n19 = 0; n19 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n19) {
                        llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n18][n19] = 0.0;
                        for (int n20 = i; n20 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n20) {
                            final double[] array6 = llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n18];
                            final int n21 = n19;
                            array6[n21] += llllIIIlIlllIlIIIIIl6.IlIIIlIlIIIllIlIlIIl[n18][n20] * llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[n20][n19];
                        }
                    }
                }
                for (int n22 = i; n22 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n22) {
                    for (int n23 = 0; n23 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n23) {
                        llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl[n22][n23] = llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n22][n23];
                    }
                }
                --ilIlIlIlIlllllllllIl2;
            }
            if (llIllIIIIIllIlIIIIlI > 2) {
                double n24 = 0.0;
                for (int n25 = 1; n25 < llIllIIIIIllIlIIIIlI; ++n25) {
                    n24 += llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i + n25] * llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i + n25];
                }
                final double sqrt2 = Math.sqrt(n24);
                if (llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i + 1] == 0.0) {
                    array[0] = sqrt2;
                }
                else {
                    array[0] = llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i + 1] + llIllIIIIIllIlIIIIlI(sqrt2, llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i + 1]);
                }
                for (int n26 = 1; n26 < llIllIIIIIllIlIIIIlI - 1; ++n26) {
                    array[n26] = llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i + n26 + 1];
                }
                double n27 = 0.0;
                for (int n28 = 0; n28 < llIllIIIIIllIlIIIIlI - 1; ++n28) {
                    n27 += array[n28] * array[n28];
                }
                final double n29 = 2.0 / n27;
                for (int n30 = i + 1; n30 < llIllIIIIIllIlIIIIlI; ++n30) {
                    for (int n31 = i + 1; n31 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n31) {
                        llllIIIlIlllIlIIIIIl7.IlIIIlIlIIIllIlIlIIl[n30][n31] = -n29 * array[n30 - i - 1] * array[n31 - i - 1];
                    }
                }
                for (int n32 = i + 1; n32 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n32) {
                    final double[] array7 = llllIIIlIlllIlIIIIIl7.IlIIIlIlIIIllIlIlIIl[n32];
                    final int n33 = n32;
                    ++array7[n33];
                }
                double n34 = 0.0;
                for (int n35 = i; n35 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n35) {
                    n34 += llllIIIlIlllIlIIIIIl7.IlIIIlIlIIIllIlIlIIl[n35][i + 1] * llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][n35];
                }
                llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[i][i + 1] = n34;
                for (int n36 = i + 1; n36 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n36) {
                    for (int n37 = i + 1; n37 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n37) {
                        llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n36][n37] = 0.0;
                        for (int n38 = i + 1; n38 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n38) {
                            final double[] array8 = llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n36];
                            final int n39 = n37;
                            array8[n39] += llllIIIlIlllIlIIIIIl7.IlIIIlIlIIIllIlIlIIl[n38][n37] * llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[n36][n38];
                        }
                    }
                }
                for (int n40 = i + 1; n40 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n40) {
                    for (int n41 = i + 1; n41 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n41) {
                        llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[n40][n41] = llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n40][n41];
                    }
                }
                for (int n42 = 0; n42 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n42) {
                    for (int n43 = i + 1; n43 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n43) {
                        llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n42][n43] = 0.0;
                        for (int n44 = i + 1; n44 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n44) {
                            final double[] array9 = llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n42];
                            final int n45 = n43;
                            array9[n45] += llllIIIlIlllIlIIIIIl7.IlIIIlIlIIIllIlIlIIl[n44][n43] * llllIIIlIlllIlIIIIIl4.IlIIIlIlIIIllIlIlIIl[n42][n44];
                        }
                    }
                }
                for (int n46 = 0; n46 < llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl; ++n46) {
                    for (int n47 = i + 1; n47 < llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI; ++n47) {
                        llllIIIlIlllIlIIIIIl4.IlIIIlIlIIIllIlIlIIl[n46][n47] = llllIIIlIlllIlIIIIIl5.IlIIIlIlIIIllIlIlIIl[n46][n47];
                    }
                }
                --llIllIIIIIllIlIIIIlI;
            }
        }
        for (int n48 = 0; n48 < n; ++n48) {
            array2[n48] = llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[n48][n48];
        }
        for (int n49 = 0; n49 < ilIlIlIlIlllllllllIl; ++n49) {
            array3[n49] = llllIIIlIlllIlIIIIIl8.IlIIIlIlIIIllIlIlIIl[n49][n49 + 1];
        }
        if (llllIIIlIlllIlIIIIIl8.IlIlIlIlIlllllllllIl == 2 && llllIIIlIlllIlIIIIIl8.llIllIIIIIllIlIIIIlI == 2) {
            final double[] array10 = { 0.0 };
            final double[] array11 = { 0.0 };
            final double[] array12 = { 0.0 };
            final double[] array13 = { 0.0 };
            llllIIIIlIIIlIlllIll(array2[0], array3[0], array2[1], array2, array12, array10, array13, array11, 0);
            IlIlIlIlIlllllllllIl(0, llllIIIlIlllIlIIIIIl2, array10, array12);
            llllIIIIlIIIlIlllIll(0, llllIIIlIlllIlIIIIIl4, array11, array13);
            return 2;
        }
        llllIIIIlIIIlIlllIll(0, array3.length - 1, array2, array3, llllIIIlIlllIlIIIIIl2, llllIIIlIlllIlIIIIIl4);
        return array2.length;
    }
    
    static void llllIIIIlIIIlIlllIll(final int n, int n2, final double[] array, final double[] array2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2) {
        final double[] array3 = { 0.0 };
        final double[] array4 = { 0.0 };
        final double[] array5 = { 0.0 };
        final double[] array6 = { 0.0 };
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI, llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl);
        final double n3 = 1.0;
        boolean b = false;
        double n4 = 0.0;
        double n5 = 0.0;
        for (int n6 = 0; n6 < 2 && !b; ++n6) {
            int i;
            for (i = n; i <= n2; ++i) {
                if (i == n) {
                    int n7;
                    if (array2.length == array.length) {
                        n7 = n2;
                    }
                    else {
                        n7 = n2 + 1;
                    }
                    final double llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(array[n7 - 1], array2[n2], array[n7]);
                    n4 = (Math.abs(array[i]) - llllIIIIlIIIlIlllIll) * (llIllIIIIIllIlIIIIlI(n3, array[i]) + llllIIIIlIIIlIlllIll / array[i]);
                    n5 = array2[i];
                }
                final double llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(n4, n5, array6, array4);
                if (i != n) {
                    array2[i - 1] = llllIIIIlIIIlIlllIll2;
                }
                final double n8 = array4[0] * array[i] + array6[0] * array2[i];
                array2[i] = array4[0] * array2[i] - array6[0] * array[i];
                n5 = array6[0] * array[i + 1];
                array[i + 1] *= array4[0];
                llllIIIIlIIIlIlllIll(i, llllIIIlIlllIlIIIIIl2, array4, array6);
                array[i] = llllIIIIlIIIlIlllIll(n8, n5, array5, array3);
                n4 = array3[0] * array2[i] + array5[0] * array[i + 1];
                array[i + 1] = array3[0] * array[i + 1] - array5[0] * array2[i];
                if (i < n2) {
                    n5 = array5[0] * array2[i + 1];
                    array2[i + 1] *= array3[0];
                }
                IlIlIlIlIlllllllllIl(i, llllIIIlIlllIlIIIIIl, array3, array5);
            }
            if (array.length == array2.length) {
                llllIIIIlIIIlIlllIll(n4, n5, array6, array4);
                n4 = array4[0] * array[i] + array6[0] * array2[i];
                array2[i] = array4[0] * array2[i] - array6[0] * array[i];
                array[i + 1] *= array4[0];
                llllIIIIlIIIlIlllIll(i, llllIIIlIlllIlIIIIIl2, array4, array6);
            }
            while (n2 - n > 1 && Math.abs(array2[n2]) < 4.89E-15) {
                --n2;
            }
            for (int j = n2 - 2; j > n; --j) {
                if (Math.abs(array2[j]) < 4.89E-15) {
                    llllIIIIlIIIlIlllIll(j + 1, n2, array, array2, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                    for (n2 = j - 1; n2 - n > 1 && Math.abs(array2[n2]) < 4.89E-15; --n2) {}
                }
            }
            if (n2 - n <= 1 && Math.abs(array2[n + 1]) < 4.89E-15) {
                b = true;
            }
        }
        if (Math.abs(array2[1]) < 4.89E-15) {
            llllIIIIlIIIlIlllIll(array[n], array2[n], array[n + 1], array, array5, array3, array6, array4, 0);
            array2[n + 1] = (array2[n] = 0.0);
        }
        IlIlIlIlIlllllllllIl(n, llllIIIlIlllIlIIIIIl, array3, array5);
        llllIIIIlIIIlIlllIll(n, llllIIIlIlllIlIIIIIl2, array4, array6);
    }
    
    private static void llllIIIIlIIIlIlllIll(final double[] array, final double[] array2) {
        System.out.println("\ns =" + array[0] + " " + array[1] + " " + array[2]);
        System.out.println("e =" + array2[0] + " " + array2[1]);
    }
    
    private static void llllIIIIlIIIlIlllIll(final int n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final double[] array, final double[] array2) {
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++i) {
            final double n2 = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n];
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n] = array[0] * n2 + array2[0] * llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n + 1];
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n + 1] = -array2[0] * n2 + array[0] * llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n + 1];
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final double[] array, final double[] array2, final int n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final double[] array3 = { 0.0 };
        final double[] array4 = { 0.0 };
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
        double n2 = array2[n];
        double n3 = array[n];
        int i;
        for (i = n; i > 0; --i) {
            final double llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n2, n3, array4, array3);
            n2 = -array2[i - 1] * array4[0];
            n3 = array[i - 1];
            array[i] = llllIIIIlIIIlIlllIll;
            array2[i - 1] *= array3[0];
            llllIIIIlIIIlIlllIll(i, n + 1, llllIIIlIlllIlIIIIIl, array3, array4, llllIIIlIlllIlIIIIIl2, llllIIIlIlllIlIIIIIl3);
        }
        array[i + 1] = llllIIIIlIIIlIlllIll(n2, n3, array4, array3);
        llllIIIIlIIIlIlllIll(i, n + 1, llllIIIlIlllIlIIIIIl, array3, array4, llllIIIlIlllIlIIIIIl2, llllIIIlIlllIlIIIIIl3);
    }
    
    private static void IlIlIlIlIlllllllllIl(final double[] array, final double[] array2, final int n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final double[] array3 = { 0.0 };
        final double[] array4 = { 0.0 };
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
        double n2 = array2[n];
        double n3 = array[n + 1];
        int i;
        for (i = n; i < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI - 2; ++i) {
            final double llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n3, n2, array4, array3);
            n2 = -array2[i + 1] * array4[0];
            n3 = array[i + 2];
            array[i + 1] = llllIIIIlIIIlIlllIll;
            array2[i + 1] *= array3[0];
            IlIlIlIlIlllllllllIl(n, i + 1, llllIIIlIlllIlIIIIIl, array3, array4, llllIIIlIlllIlIIIIIl2, llllIIIlIlllIlIIIIIl3);
        }
        array[i + 1] = llllIIIIlIIIlIlllIll(n3, n2, array4, array3);
        IlIlIlIlIlllllllllIl(n, i + 1, llllIIIlIlllIlIIIIIl, array3, array4, llllIIIlIlllIlIIIIIl2, llllIIIlIlllIlIIIIIl3);
    }
    
    private static void llllIIIIlIIIlIlllIll(final int n, final int n2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final double[] array, final double[] array2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3) {
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++i) {
            final double n3 = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n];
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n] = array[0] * n3 - array2[0] * llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n2];
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n2] = array2[0] * n3 + array[0] * llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][n2];
        }
        System.out.println("topr    =" + n);
        System.out.println("bottomr =" + n2);
        System.out.println("cosr =" + array[0]);
        System.out.println("sinr =" + array2[0]);
        System.out.println("\nm =");
        llIllIlIIIIllIlIIllI(llllIIIlIlllIlIIIIIl3);
        System.out.println("\nv =");
        llIllIlIIIIllIlIIllI(llllIIIlIlllIlIIIIIl2);
        llllIIIlIlllIlIIIIIl3.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl3, llllIIIlIlllIlIIIIIl2);
        System.out.println("\nt*m =");
        llIllIlIIIIllIlIIllI(llllIIIlIlllIlIIIIIl3);
    }
    
    private static void IlIlIlIlIlllllllllIl(final int n, final int n2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final double[] array, final double[] array2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3) {
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++i) {
            final double n3 = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n][i];
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n][i] = array[0] * n3 - array2[0] * llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n2][i];
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n2][i] = array2[0] * n3 + array[0] * llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n2][i];
        }
        System.out.println("\nm=");
        llIllIlIIIIllIlIIllI(llllIIIlIlllIlIIIIIl3);
        System.out.println("\nu=");
        llIllIlIIIIllIlIIllI(llllIIIlIlllIlIIIIIl2);
        llllIIIlIlllIlIIIIIl3.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2, llllIIIlIlllIlIIIIIl3);
        System.out.println("\nt*m=");
        llIllIlIIIIllIlIIllI(llllIIIlIlllIlIIIIIl3);
    }
    
    private static void IlIlIlIlIlllllllllIl(final int n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final double[] array, final double[] array2) {
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++i) {
            final double n2 = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n][i];
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n][i] = array[0] * n2 + array2[0] * llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n + 1][i];
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n + 1][i] = -array2[0] * n2 + array[0] * llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[n + 1][i];
        }
    }
    
    private static void IlIlIlIlIlllllllllIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3) {
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl4 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
        llllIIIlIlllIlIIIIIl4.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2, llllIIIlIlllIlIIIIIl4);
        llllIIIlIlllIlIIIIIl4.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl4, llllIIIlIlllIlIIIIIl3);
        System.out.println("\n m = \n" + lIlIlIIIllIIllIIIllI(llllIIIlIlllIlIIIIIl4));
    }
    
    private static String lIlIlIIIllIIllIIIllI(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final StringBuffer sb = new StringBuffer(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl * llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI * 8);
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++j) {
                if (Math.abs(llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j]) < 1.0E-9) {
                    sb.append("0.0000 ");
                }
                else {
                    sb.append(llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    private static void llllIIIIlIIIlIlllIll(final double[] array, final double[] array2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2) {
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI, llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl);
        System.out.println(" \ns = ");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(" " + array[i]);
        }
        System.out.println(" \ne = ");
        for (int j = 0; j < array2.length; ++j) {
            System.out.println(" " + array2[j]);
        }
        System.out.println(" \nu  = \n" + llllIIIlIlllIlIIIIIl.toString());
        System.out.println(" \nv  = \n" + llllIIIlIlllIlIIIIIl2.toString());
        llllIIIlIlllIlIIIIIl3.IlIlIlIlIlllllllllIl();
        for (int k = 0; k < array.length; ++k) {
            llllIIIlIlllIlIIIIIl3.IlIIIlIlIIIllIlIlIIl[k][k] = array[k];
        }
        for (int l = 0; l < array2.length; ++l) {
            llllIIIlIlllIlIIIIIl3.IlIIIlIlIIIllIlIlIIl[l][l + 1] = array2[l];
        }
        System.out.println(" \nm  = \n" + llllIIIlIlllIlIIIIIl3.toString());
        llllIIIlIlllIlIIIIIl3.IllIIlllIIIIlllIIlIl(llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl3);
        llllIIIlIlllIlIIIIIl3.IlIlIIIllIllIIIIIllI(llllIIIlIlllIlIIIIIl3, llllIIIlIlllIlIIIIIl2);
        System.out.println(" \n u.transpose*m*v.transpose  = \n" + llllIIIlIlllIlIIIIIl3.toString());
    }
    
    static double llllIIIIlIIIlIlllIll(final double n, final double n2) {
        if (n > n2) {
            return n;
        }
        return n2;
    }
    
    static double IlIlIlIlIlllllllllIl(final double n, final double n2) {
        if (n < n2) {
            return n;
        }
        return n2;
    }
    
    static double llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        final double abs = Math.abs(n);
        final double abs2 = Math.abs(n2);
        final double abs3 = Math.abs(n3);
        final double ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(abs, abs3);
        final double llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(abs, abs3);
        double n4;
        if (ilIlIlIlIlllllllllIl == 0.0) {
            n4 = 0.0;
            if (llllIIIIlIIIlIlllIll != 0.0) {
                final double n5 = IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, abs2) / llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, abs2);
            }
        }
        else if (abs2 < llllIIIIlIIIlIlllIll) {
            final double n6 = ilIlIlIlIlllllllllIl / llllIIIIlIIIlIlllIll + 1.0;
            final double n7 = (llllIIIIlIIIlIlllIll - ilIlIlIlIlllllllllIl) / llllIIIIlIIIlIlllIll;
            final double n8 = abs2 / llllIIIIlIIIlIlllIll;
            final double n9 = n8 * n8;
            n4 = ilIlIlIlIlllllllllIl * (2.0 / (Math.sqrt(n6 * n6 + n9) + Math.sqrt(n7 * n7 + n9)));
        }
        else {
            final double n10 = llllIIIIlIIIlIlllIll / abs2;
            if (n10 == 0.0) {
                n4 = ilIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll / abs2;
            }
            else {
                final double n11 = ilIlIlIlIlllllllllIl / llllIIIIlIIIlIlllIll + 1.0;
                final double n12 = (llllIIIIlIIIlIlllIll - ilIlIlIlIlllllllllIl) / llllIIIIlIIIlIlllIll;
                final double n13 = n11 * n10;
                final double n14 = n12 * n10;
                final double n15 = ilIlIlIlIlllllllllIl * (1.0 / (Math.sqrt(n13 * n13 + 1.0) + Math.sqrt(n14 * n14 + 1.0))) * n10;
                n4 = n15 + n15;
            }
        }
        return n4;
    }
    
    static int llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double[] array, final double[] array2, final double[] array3, final double[] array4, final double[] array5, final int n4) {
        final double n5 = 2.0;
        final double n6 = 1.0;
        double n7 = array[0];
        double n8 = array[1];
        double n9 = 0.0;
        double n10 = 0.0;
        double n11 = 0.0;
        double n12 = 0.0;
        double n13 = 0.0;
        double n14 = n;
        double abs = Math.abs(n14);
        double n15 = n3;
        double abs2 = Math.abs(n3);
        int n16 = 1;
        final boolean b = abs2 > abs;
        if (b) {
            n16 = 3;
            final double n17 = n14;
            n14 = n15;
            n15 = n17;
            final double n18 = abs;
            abs = abs2;
            abs2 = n18;
        }
        final double abs3 = Math.abs(n2);
        if (abs3 == 0.0) {
            array[1] = abs2;
            array[0] = abs;
        }
        else {
            int n19 = 1;
            if (abs3 > abs) {
                n16 = 2;
                if (abs / abs3 < 1.0E-10) {
                    n19 = 0;
                    n7 = abs3;
                    if (abs2 > 1.0) {
                        n8 = abs / (abs3 / abs2);
                    }
                    else {
                        n8 = abs / abs3 * abs2;
                    }
                    n9 = 1.0;
                    n11 = n15 / n2;
                    n12 = 1.0;
                    n10 = n14 / n2;
                }
            }
            if (n19 != 0) {
                final double n20 = abs - abs2;
                double n21;
                if (n20 == abs) {
                    n21 = 1.0;
                }
                else {
                    n21 = n20 / abs;
                }
                final double n22 = n2 / n14;
                final double n23 = 2.0 - n21;
                final double n24 = n22 * n22;
                Math.sqrt(n23 * n23 + n24);
                if (n21 == 0.0) {
                    Math.abs(n22);
                }
                else {
                    Math.sqrt(n21 * n21 + n24);
                }
                if (abs3 > abs) {
                    n16 = 2;
                    if (abs / abs3 < 1.0E-10) {
                        n19 = 0;
                        n7 = abs3;
                        if (abs2 > 1.0) {
                            n8 = abs / (abs3 / abs2);
                        }
                        else {
                            n8 = abs / abs3 * abs2;
                        }
                        n9 = 1.0;
                        n11 = n15 / n2;
                        n12 = 1.0;
                        n10 = n14 / n2;
                    }
                }
                if (n19 != 0) {
                    final double n25 = abs - abs2;
                    double n26;
                    if (n25 == abs) {
                        n26 = 1.0;
                    }
                    else {
                        n26 = n25 / abs;
                    }
                    final double n27 = n2 / n14;
                    final double n28 = 2.0 - n26;
                    final double n29 = n27 * n27;
                    final double sqrt = Math.sqrt(n28 * n28 + n29);
                    double n30;
                    if (n26 == 0.0) {
                        n30 = Math.abs(n27);
                    }
                    else {
                        n30 = Math.sqrt(n26 * n26 + n29);
                    }
                    final double n31 = (sqrt + n30) * 0.5;
                    n8 = abs2 / n31;
                    n7 = abs * n31;
                    double n32;
                    if (n29 == 0.0) {
                        if (n26 == 0.0) {
                            n32 = llIllIIIIIllIlIIIIlI(n5, n14) * llIllIIIIIllIlIIIIlI(n6, n2);
                        }
                        else {
                            n32 = n2 / llIllIIIIIllIlIIIIlI(n25, n14) + n27 / n28;
                        }
                    }
                    else {
                        n32 = (n27 / (sqrt + n28) + n27 / (n30 + n26)) * (n31 + 1.0);
                    }
                    final double sqrt2 = Math.sqrt(n32 * n32 + 4.0);
                    n10 = 2.0 / sqrt2;
                    n12 = n32 / sqrt2;
                    n9 = (n10 + n12 * n27) / n31;
                    n11 = n15 / n14 * n12 / n31;
                }
            }
            if (b) {
                array3[0] = n12;
                array2[0] = n10;
                array5[0] = n11;
                array4[0] = n9;
            }
            else {
                array3[0] = n9;
                array2[0] = n11;
                array5[0] = n10;
                array4[0] = n12;
            }
            if (n16 == 1) {
                n13 = llIllIIIIIllIlIIIIlI(n6, array5[0]) * llIllIIIIIllIlIIIIlI(n6, array3[0]) * llIllIIIIIllIlIIIIlI(n6, n);
            }
            if (n16 == 2) {
                n13 = llIllIIIIIllIlIIIIlI(n6, array4[0]) * llIllIIIIIllIlIIIIlI(n6, array3[0]) * llIllIIIIIllIlIIIIlI(n6, n2);
            }
            if (n16 == 3) {
                n13 = llIllIIIIIllIlIIIIlI(n6, array4[0]) * llIllIIIIIllIlIIIIlI(n6, array2[0]) * llIllIIIIIllIlIIIIlI(n6, n3);
            }
            array[n4] = llIllIIIIIllIlIIIIlI(n7, n13);
            array[n4 + 1] = llIllIIIIIllIlIIIIlI(n8, n13 * llIllIIIIIllIlIIIIlI(n6, n) * llIllIIIIIllIlIIIIlI(n6, n3));
        }
        return 0;
    }
    
    static double llllIIIIlIIIlIlllIll(final double n, final double n2, final double[] array, final double[] array2) {
        double n3;
        double n4;
        double n5;
        if (n2 == 0.0) {
            n3 = 1.0;
            n4 = 0.0;
            n5 = n;
        }
        else if (n == 0.0) {
            n3 = 0.0;
            n4 = 1.0;
            n5 = n2;
        }
        else {
            double n6 = n;
            double n7 = n2;
            double n8 = llllIIIIlIIIlIlllIll(Math.abs(n6), Math.abs(n7));
            if (n8 >= 4.9947976805055876E145) {
                int n9 = 0;
                while (n8 >= 4.9947976805055876E145) {
                    ++n9;
                    n6 *= 2.002083095183101E-146;
                    n7 *= 2.002083095183101E-146;
                    n8 = llllIIIIlIIIlIlllIll(Math.abs(n6), Math.abs(n7));
                }
                n5 = Math.sqrt(n6 * n6 + n7 * n7);
                n3 = n6 / n5;
                n4 = n7 / n5;
                for (int i = 1; i <= n9; ++i) {
                    n5 *= 4.9947976805055876E145;
                }
            }
            else if (n8 <= 2.002083095183101E-146) {
                int n10 = 0;
                while (n8 <= 2.002083095183101E-146) {
                    ++n10;
                    n6 *= 4.9947976805055876E145;
                    n7 *= 4.9947976805055876E145;
                    n8 = llllIIIIlIIIlIlllIll(Math.abs(n6), Math.abs(n7));
                }
                n5 = Math.sqrt(n6 * n6 + n7 * n7);
                n3 = n6 / n5;
                n4 = n7 / n5;
                for (int j = 1; j <= n10; ++j) {
                    n5 *= 2.002083095183101E-146;
                }
            }
            else {
                n5 = Math.sqrt(n6 * n6 + n7 * n7);
                n3 = n6 / n5;
                n4 = n7 / n5;
            }
            if (Math.abs(n) > Math.abs(n2) && n3 < 0.0) {
                n3 = -n3;
                n4 = -n4;
                n5 = -n5;
            }
        }
        array[0] = n4;
        array2[0] = n3;
        return n5;
    }
    
    static double llIllIIIIIllIlIIIIlI(final double n, final double n2) {
        final double n3 = (n >= 0.0) ? n : (-n);
        return (n2 >= 0.0) ? n3 : (-n3);
    }
    
    public Object clone() {
        llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl;
        try {
            llllIIIlIlllIlIIIIIl = (llllIIIlIlllIlIIIIIl)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
        llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl = new double[this.IlIlIlIlIlllllllllIl][this.llIllIIIIIllIlIIIIlI];
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j] = this.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
        return llllIIIlIlllIlIIIIIl;
    }
}
