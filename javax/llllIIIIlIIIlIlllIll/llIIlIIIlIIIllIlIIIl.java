package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class llIIlIIIlIIIllIlIIIl implements Serializable, Cloneable
{
    static final long llllIIIIlIIIlIlllIll = 329697160112089834L;
    public float IlIlIlIlIlllllllllIl;
    public float llIllIIIIIllIlIIIIlI;
    public float IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    public float llllIIIlIlllIlIIIIIl;
    public float lIIIIlIIIIIlllIllIII;
    public float lIIIlllIIIllIIIllIII;
    public float llIIlIIIlIIIllIlIIIl;
    private static final double llIllIlIIIIllIlIIllI = 1.0E-8;
    
    public llIIlIIIlIIIllIlIIIl(final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI, final float illIIlllIIIIlllIIlIl, final float llllIIIlIlllIlIIIIIl, final float liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII, final float llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public llIIlIIIlIIIllIlIIIl(final float[] array) {
        this.IlIlIlIlIlllllllllIl = array[0];
        this.llIllIIIIIllIlIIIIlI = array[1];
        this.IlIIIlIlIIIllIlIlIIl = array[2];
        this.IlIlIIIllIllIIIIIllI = array[3];
        this.IllIIlllIIIIlllIIlIl = array[4];
        this.llllIIIlIlllIlIIIIIl = array[5];
        this.lIIIIlIIIIIlllIllIII = array[6];
        this.lIIIlllIIIllIIIllIII = array[7];
        this.llIIlIIIlIIIllIlIIIl = array[8];
    }
    
    public llIIlIIIlIIIllIlIIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = (float)liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (float)liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (float)liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = (float)liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (float)liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (float)liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (float)liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = (float)liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
    }
    
    public llIIlIIIlIIIllIlIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
    }
    
    public llIIlIIIlIIIllIlIIIl() {
        this.IlIlIlIlIlllllllllIl = 0.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.IlIlIlIlIlllllllllIl) + ", " + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + "\n" + this.IlIlIIIllIllIIIIIllI + ", " + this.IllIIlllIIIIlllIIlIl + ", " + this.llllIIIlIlllIlIIIIIl + "\n" + this.lIIIIlIIIIIlllIllIII + ", " + this.lIIIlllIIIllIIIllIII + ", " + this.llIIlIIIlIIIllIlIIIl + "\n";
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = 1.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 1.0f;
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n) {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
        this.IlIlIlIlIlllllllllIl = (float)(array[0] * n);
        this.llIllIIIIIllIlIIIIlI = (float)(array[1] * n);
        this.IlIIIlIlIIIllIlIlIIl = (float)(array[2] * n);
        this.IlIlIIIllIllIIIIIllI = (float)(array[3] * n);
        this.IllIIlllIIIIlllIIlIl = (float)(array[4] * n);
        this.llllIIIlIlllIlIIIIIl = (float)(array[5] * n);
        this.lIIIIlIIIIIlllIllIII = (float)(array[6] * n);
        this.lIIIlllIIIllIIIllIII = (float)(array[7] * n);
        this.llIIlIIIlIIIllIlIIIl = (float)(array[8] * n);
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final int n2, final float llIIlIIIlIIIllIlIIIl) {
        Label_0234: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl;
                            break Label_0234;
                        }
                        case 1: {
                            this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl;
                            break Label_0234;
                        }
                        case 2: {
                            this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl;
                            break Label_0234;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f0"));
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl;
                            break Label_0234;
                        }
                        case 1: {
                            this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl;
                            break Label_0234;
                        }
                        case 2: {
                            this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl;
                            break Label_0234;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f0"));
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl;
                            break Label_0234;
                        }
                        case 1: {
                            this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl;
                            break Label_0234;
                        }
                        case 2: {
                            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
                            break Label_0234;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f0"));
                        }
                    }
                    break;
                }
                default: {
                    throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f0"));
                }
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        if (n == 0) {
            ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl;
            ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = this.llIllIIIIIllIlIIIIlI;
            ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl;
        }
        else if (n == 1) {
            ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI;
            ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl;
            ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = this.llllIIIlIlllIlIIIIIl;
        }
        else {
            if (n != 2) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f1"));
            }
            ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = this.lIIIIlIIIIIlllIllIII;
            ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII;
            ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final float[] array) {
        if (n == 0) {
            array[0] = this.IlIlIlIlIlllllllllIl;
            array[1] = this.llIllIIIIIllIlIIIIlI;
            array[2] = this.IlIIIlIlIIIllIlIlIIl;
        }
        else if (n == 1) {
            array[0] = this.IlIlIIIllIllIIIIIllI;
            array[1] = this.IllIIlllIIIIlllIIlIl;
            array[2] = this.llllIIIlIlllIlIIIIIl;
        }
        else {
            if (n != 2) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f1"));
            }
            array[0] = this.lIIIIlIIIIIlllIllIII;
            array[1] = this.lIIIlllIIIllIIIllIII;
            array[2] = this.llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        if (n == 0) {
            ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl;
            ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI;
            ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII;
        }
        else if (n == 1) {
            ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
            ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl;
            ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = this.lIIIlllIIIllIIIllIII;
        }
        else {
            if (n != 2) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f3"));
            }
            ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl;
            ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = this.llllIIIlIlllIlIIIIIl;
            ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final float[] array) {
        if (n == 0) {
            array[0] = this.IlIlIlIlIlllllllllIl;
            array[1] = this.IlIlIIIllIllIIIIIllI;
            array[2] = this.lIIIIlIIIIIlllIllIII;
        }
        else if (n == 1) {
            array[0] = this.llIllIIIIIllIlIIIIlI;
            array[1] = this.IllIIlllIIIIlllIIlIl;
            array[2] = this.lIIIlllIIIllIIIllIII;
        }
        else {
            if (n != 2) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f3"));
            }
            array[0] = this.IlIIIlIlIIIllIlIlIIl;
            array[1] = this.llllIIIlIlllIlIIIIIl;
            array[2] = this.llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final float llllIIIIlIIIlIlllIll(final int n, final int n2) {
        Label_0162: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            return this.IlIlIlIlIlllllllllIl;
                        }
                        case 1: {
                            return this.llIllIIIIIllIlIIIIlI;
                        }
                        case 2: {
                            return this.IlIIIlIlIIIllIlIlIIl;
                        }
                        default: {
                            break Label_0162;
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            return this.IlIlIIIllIllIIIIIllI;
                        }
                        case 1: {
                            return this.IllIIlllIIIIlllIIlIl;
                        }
                        case 2: {
                            return this.llllIIIlIlllIlIIIIIl;
                        }
                        default: {
                            break Label_0162;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            return this.lIIIIlIIIIIlllIllIII;
                        }
                        case 1: {
                            return this.lIIIlllIIIllIIIllIII;
                        }
                        case 2: {
                            return this.llIIlIIIlIIIllIlIIIl;
                        }
                        default: {
                            break Label_0162;
                        }
                    }
                    break;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f5"));
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final float liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII, final float llIIlIIIlIIIllIlIIIl) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII;
                this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII;
                this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl;
                break;
            }
            case 1: {
                this.IlIlIIIllIllIIIIIllI = liiiIlIIIIIlllIllIII;
                this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII;
                this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl;
                break;
            }
            case 2: {
                this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
                this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
                this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f6"));
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
                this.llIllIIIIIllIlIIIIlI = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
                this.IlIIIlIlIIIllIlIlIIl = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
                break;
            }
            case 1: {
                this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
                this.IllIIlllIIIIlllIIlIl = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
                this.llllIIIlIlllIlIIIIIl = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
                break;
            }
            case 2: {
                this.lIIIIlIIIIIlllIllIII = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
                this.lIIIlllIIIllIIIllIII = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
                this.llIIlIIIlIIIllIlIIIl = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f6"));
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final float[] array) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = array[0];
                this.llIllIIIIIllIlIIIIlI = array[1];
                this.IlIIIlIlIIIllIlIlIIl = array[2];
                break;
            }
            case 1: {
                this.IlIlIIIllIllIIIIIllI = array[0];
                this.IllIIlllIIIIlllIIlIl = array[1];
                this.llllIIIlIlllIlIIIIIl = array[2];
                break;
            }
            case 2: {
                this.lIIIIlIIIIIlllIllIII = array[0];
                this.lIIIlllIIIllIIIllIII = array[1];
                this.llIIlIIIlIIIllIlIIIl = array[2];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f6"));
            }
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final float ilIIIlIlIIIllIlIlIIl, final float llllIIIlIlllIlIIIIIl, final float llIIlIIIlIIIllIlIIIl) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl;
                this.IlIlIIIllIllIIIIIllI = llllIIIlIlllIlIIIIIl;
                this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl;
                break;
            }
            case 1: {
                this.llIllIIIIIllIlIIIIlI = ilIIIlIlIIIllIlIlIIl;
                this.IllIIlllIIIIlllIIlIl = llllIIIlIlllIlIIIIIl;
                this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl;
                break;
            }
            case 2: {
                this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
                this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
                this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f9"));
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
                this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
                this.lIIIIlIIIIIlllIllIII = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
                break;
            }
            case 1: {
                this.llIllIIIIIllIlIIIIlI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
                this.IllIIlllIIIIlllIIlIl = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
                this.lIIIlllIIIllIIIllIII = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
                break;
            }
            case 2: {
                this.IlIIIlIlIIIllIlIlIIl = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
                this.llllIIIlIlllIlIIIIIl = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
                this.llIIlIIIlIIIllIlIIIl = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f9"));
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final float[] array) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = array[0];
                this.IlIlIIIllIllIIIIIllI = array[1];
                this.lIIIIlIIIIIlllIllIII = array[2];
                break;
            }
            case 1: {
                this.llIllIIIIIllIlIIIIlI = array[0];
                this.IllIIlllIIIIlllIIlIl = array[1];
                this.lIIIlllIIIllIIIllIII = array[2];
                break;
            }
            case 2: {
                this.IlIIIlIlIIIllIlIlIIl = array[0];
                this.llllIIIlIlllIlIIIIIl = array[1];
                this.llIIlIIIlIIIllIlIIIl = array[2];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f9"));
            }
        }
    }
    
    public final float IlIlIlIlIlllllllllIl() {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        return (float)javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(array2);
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n) {
        this.IlIlIlIlIlllllllllIl += n;
        this.llIllIIIIIllIlIIIIlI += n;
        this.IlIIIlIlIIIllIlIlIIl += n;
        this.IlIlIIIllIllIIIIIllI += n;
        this.IllIIlllIIIIlllIIlIl += n;
        this.llllIIIlIlllIlIIIIIl += n;
        this.lIIIIlIIIIIlllIllIII += n;
        this.lIIIlllIIIllIIIllIII += n;
        this.llIIlIIIlIIIllIlIIIl += n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + n;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + n;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl + n;
        this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI + n;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + n;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl + n;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII + n;
        this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII + n;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl + n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl + llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl += llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI += llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI += llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl += llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl += llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII += llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII += llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl += llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl - llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI - llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl - llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI - llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl - llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl - llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII - llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII - llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl - llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl -= llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI -= llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI -= llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl -= llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl -= llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII -= llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII -= llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl -= llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        final float ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = this.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        final float liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII;
        this.lIIIIlIIIIIlllIllIII = this.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = liiiIlIIIIIlllIllIII;
        final float liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII;
        this.lIIIlllIIIllIIIllIII = this.llllIIIlIlllIlIIIIIl;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this != llIIlIIIlIIIllIlIIIl) {
            this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
            this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
            this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
            this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
            this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        }
        else {
            this.llIllIIIIIllIlIIIIlI();
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        this.IlIlIlIlIlllllllllIl = 1.0f - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        this.IlIlIIIllIllIIIIIllI = 2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.lIIIIlIIIIIlllIllIII = 2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = 2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = 1.0f - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = 2.0f * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl);
        this.IlIIIlIlIIIllIlIlIIl = 2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl = 2.0f * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl);
        this.llIIlIIIlIIIllIlIIIl = 1.0f - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final float n = (float)Math.sqrt(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI + ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        if (n < 1.0E-8) {
            this.IlIlIlIlIlllllllllIl = 1.0f;
            this.llIllIIIIIllIlIIIIlI = 0.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IlIlIIIllIllIIIIIllI = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 1.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 0.0f;
            this.lIIIlllIIIllIIIllIII = 0.0f;
            this.llIIlIIIlIIIllIlIIIl = 1.0f;
        }
        else {
            final float n2 = 1.0f / n;
            final float n3 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * n2;
            final float n4 = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * n2;
            final float n5 = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * n2;
            final float n6 = (float)Math.sin(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
            final float n7 = (float)Math.cos(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
            final float n8 = 1.0f - n7;
            final float n9 = n3 * n5;
            final float n10 = n3 * n4;
            final float n11 = n4 * n5;
            this.IlIlIlIlIlllllllllIl = n8 * n3 * n3 + n7;
            this.llIllIIIIIllIlIIIIlI = n8 * n10 - n6 * n5;
            this.IlIIIlIlIIIllIlIlIIl = n8 * n9 + n6 * n4;
            this.IlIlIIIllIllIIIIIllI = n8 * n10 + n6 * n5;
            this.IllIIlllIIIIlllIIlIl = n8 * n4 * n4 + n7;
            this.llllIIIlIlllIlIIIIIl = n8 * n11 - n6 * n3;
            this.lIIIIlIIIIIlllIllIII = n8 * n9 - n6 * n4;
            this.lIIIlllIIIllIIIllIII = n8 * n11 + n6 * n3;
            this.llIIlIIIlIIIllIlIIIl = n8 * n5 * n5 + n7;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final double sqrt = Math.sqrt(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        if (sqrt < 1.0E-8) {
            this.IlIlIlIlIlllllllllIl = 1.0f;
            this.llIllIIIIIllIlIIIIlI = 0.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IlIlIIIllIllIIIIIllI = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 1.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 0.0f;
            this.lIIIlllIIIllIIIllIII = 0.0f;
            this.llIIlIIIlIIIllIlIIIl = 1.0f;
        }
        else {
            final double n = 1.0 / sqrt;
            final double n2 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * n;
            final double n3 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n;
            final double n4 = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * n;
            final double sin = Math.sin(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
            final double cos = Math.cos(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
            final double n5 = 1.0 - cos;
            final double n6 = n2 * n4;
            final double n7 = n2 * n3;
            final double n8 = n3 * n4;
            this.IlIlIlIlIlllllllllIl = (float)(n5 * n2 * n2 + cos);
            this.llIllIIIIIllIlIIIIlI = (float)(n5 * n7 - sin * n4);
            this.IlIIIlIlIIIllIlIlIIl = (float)(n5 * n6 + sin * n3);
            this.IlIlIIIllIllIIIIIllI = (float)(n5 * n7 + sin * n4);
            this.IllIIlllIIIIlllIIlIl = (float)(n5 * n3 * n3 + cos);
            this.llllIIIlIlllIlIIIIIl = (float)(n5 * n8 - sin * n2);
            this.lIIIIlIIIIIlllIllIII = (float)(n5 * n6 - sin * n3);
            this.lIIIlllIIIllIIIllIII = (float)(n5 * n8 + sin * n2);
            this.llIIlIIIlIIIllIlIIIl = (float)(n5 * n4 * n4 + cos);
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this.IlIlIlIlIlllllllllIl = (float)(1.0 - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.IlIlIIIllIllIIIIIllI = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.lIIIIlIIIIIlllIllIII = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl));
        this.llIllIIIIIllIlIIIIlI = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.IllIIlllIIIIlllIIlIl = (float)(1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.lIIIlllIIIllIIIllIII = (float)(2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl));
        this.IlIIIlIlIIIllIlIlIIl = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl));
        this.llllIIIlIlllIlIIIIIl = (float)(2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl));
        this.llIIlIIIlIIIllIlIIIl = (float)(1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
    }
    
    public final void llllIIIIlIIIlIlllIll(final float[] array) {
        this.IlIlIlIlIlllllllllIl = array[0];
        this.llIllIIIIIllIlIIIIlI = array[1];
        this.IlIIIlIlIIIllIlIlIIl = array[2];
        this.IlIlIIIllIllIIIIIllI = array[3];
        this.IllIIlllIIIIlllIIlIl = array[4];
        this.llllIIIlIlllIlIIIIIl = array[5];
        this.lIIIIlIIIIIlllIllIII = array[6];
        this.lIIIlllIIIllIIIllIII = array[7];
        this.llIIlIIIlIIIllIlIIIl = array[8];
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = (float)liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (float)liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (float)liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = (float)liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (float)liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (float)liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (float)liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = (float)liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.lIlIlIIIllIIllIIIllI(llIIlIIIlIIIllIlIIIl);
    }
    
    public final void IlIIIlIlIIIllIlIlIIl() {
        this.lIlIlIIIllIIllIIIllI(this);
    }
    
    private final void lIlIlIIIllIIllIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final int[] array3 = new int[3];
        array[0] = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        array[1] = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        array[2] = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        array[3] = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        array[4] = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        array[5] = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        array[6] = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        array[7] = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        array[8] = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        if (!llllIIIIlIIIlIlllIll(array, array3)) {
            throw new IIIlIIlIIIIlllIlllII(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f12"));
        }
        for (int i = 0; i < 9; ++i) {
            array2[i] = 0.0;
        }
        array2[0] = 1.0;
        array2[8] = (array2[4] = 1.0);
        llllIIIIlIIIlIlllIll(array, array3, array2);
        this.IlIlIlIlIlllllllllIl = (float)array2[0];
        this.llIllIIIIIllIlIIIIlI = (float)array2[1];
        this.IlIIIlIlIIIllIlIlIIl = (float)array2[2];
        this.IlIlIIIllIllIIIIIllI = (float)array2[3];
        this.IllIIlllIIIIlllIIlIl = (float)array2[4];
        this.llllIIIlIlllIlIIIIIl = (float)array2[5];
        this.lIIIIlIIIIIlllIllIII = (float)array2[6];
        this.lIIIlllIIIllIIIllIII = (float)array2[7];
        this.llIIlIIIlIIIllIlIIIl = (float)array2[8];
    }
    
    static boolean llllIIIIlIIIlIlllIll(final double[] array, final int[] array2) {
        final double[] array3 = new double[3];
        int n = 0;
        int n2 = 0;
        int n3 = 3;
        while (n3-- != 0) {
            double n4 = 0.0;
            int n5 = 3;
            while (n5-- != 0) {
                final double abs = Math.abs(array[n++]);
                if (abs > n4) {
                    n4 = abs;
                }
            }
            if (n4 == 0.0) {
                return false;
            }
            array3[n2++] = 1.0 / n4;
        }
        final int n6 = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i; ++j) {
                final int n7 = n6 + 3 * j + i;
                double n8 = array[n7];
                int n9 = j;
                int n10 = n6 + 3 * j;
                int n11 = n6 + i;
                while (n9-- != 0) {
                    n8 -= array[n10] * array[n11];
                    ++n10;
                    n11 += 3;
                }
                array[n7] = n8;
            }
            double n12 = 0.0;
            int n13 = -1;
            for (int k = i; k < 3; ++k) {
                final int n14 = n6 + 3 * k + i;
                double n15 = array[n14];
                int n16 = i;
                int n17 = n6 + 3 * k;
                int n18 = n6 + i;
                while (n16-- != 0) {
                    n15 -= array[n17] * array[n18];
                    ++n17;
                    n18 += 3;
                }
                array[n14] = n15;
                final double n19;
                if ((n19 = array3[k] * Math.abs(n15)) >= n12) {
                    n12 = n19;
                    n13 = k;
                }
            }
            if (n13 < 0) {
                throw new RuntimeException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3f13"));
            }
            if (i != n13) {
                int n20 = 3;
                int n21 = n6 + 3 * n13;
                int n22 = n6 + 3 * i;
                while (n20-- != 0) {
                    final double n23 = array[n21];
                    array[n21++] = array[n22];
                    array[n22++] = n23;
                }
                array3[n13] = array3[i];
            }
            array2[i] = n13;
            if (array[n6 + 3 * i + i] == 0.0) {
                return false;
            }
            if (i != 2) {
                final double n24 = 1.0 / array[n6 + 3 * i + i];
                int n25 = n6 + 3 * (i + 1) + i;
                int n26 = 2 - i;
                while (n26-- != 0) {
                    final int n27 = n25;
                    array[n27] *= n24;
                    n25 += 3;
                }
            }
        }
        return true;
    }
    
    static void llllIIIIlIIIlIlllIll(final double[] array, final int[] array2, final double[] array3) {
        final int n = 0;
        for (int i = 0; i < 3; ++i) {
            final int n2 = i;
            int n3 = -1;
            for (int j = 0; j < 3; ++j) {
                final int n4 = array2[n + j];
                double n5 = array3[n2 + 3 * n4];
                array3[n2 + 3 * n4] = array3[n2 + 3 * j];
                if (n3 >= 0) {
                    final int n6 = j * 3;
                    for (int k = n3; k <= j - 1; ++k) {
                        n5 -= array[n6 + k] * array3[n2 + 3 * k];
                    }
                }
                else if (n5 != 0.0) {
                    n3 = j;
                }
                array3[n2 + 3 * j] = n5;
            }
            int n7 = 6;
            final int n8 = n2 + 6;
            array3[n8] /= array[n7 + 2];
            n7 -= 3;
            array3[n2 + 3] = (array3[n2 + 3] - array[n7 + 2] * array3[n2 + 6]) / array[n7 + 1];
            n7 -= 3;
            array3[n2 + 0] = (array3[n2 + 0] - array[n7 + 1] * array3[n2 + 3] - array[n7 + 2] * array3[n2 + 6]) / array[n7 + 0];
        }
    }
    
    public final float IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl * (this.IllIIlllIIIIlllIIlIl * this.llIIlIIIlIIIllIlIIIl - this.llllIIIlIlllIlIIIIIl * this.lIIIlllIIIllIIIllIII) + this.llIllIIIIIllIlIIIIlI * (this.llllIIIlIlllIlIIIIIl * this.lIIIIlIIIIIlllIllIII - this.IlIlIIIllIllIIIIIllI * this.llIIlIIIlIIIllIlIIIl) + this.IlIIIlIlIIIllIlIlIIl * (this.IlIlIIIllIllIIIIIllI * this.lIIIlllIIIllIIIllIII - this.IllIIlllIIIIlllIIlIl * this.lIIIIlIIIIIlllIllIII);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final float llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl;
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final float n) {
        final float liiIlllIIIllIIIllIII = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.IlIlIlIlIlllllllllIl = 1.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = n2;
        this.llllIIIlIlllIlIIIIIl = -liiIlllIIIllIIIllIII;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = n2;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final float n) {
        final float ilIIIlIlIIIllIlIlIIl = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.IlIlIlIlIlllllllllIl = n2;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 1.0f;
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = -ilIIIlIlIIIllIlIlIIl;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = n2;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final float n) {
        final float ilIlIIIllIllIIIIIllI = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.IlIlIlIlIlllllllllIl = n2;
        this.llIllIIIIIllIlIIIIlI = -ilIlIIIllIllIIIIIllI;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = n2;
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 1.0f;
    }
    
    public final void llllIIIlIlllIlIIIIIl(final float n) {
        this.IlIlIlIlIlllllllllIl *= n;
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
        this.IlIlIIIllIllIIIIIllI *= n;
        this.IllIIlllIIIIlllIIlIl *= n;
        this.llllIIIlIlllIlIIIIIl *= n;
        this.lIIIIlIIIIIlllIllIII *= n;
        this.lIIIlllIIIllIIIllIII *= n;
        this.llIIlIIIlIIIllIlIIIl *= n;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = n * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = n * llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = n * llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n * llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n * llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = n * llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = n * llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final float ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI + this.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        final float llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + this.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        final float ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl + this.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        final float ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + this.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        final float illIIlllIIIIlllIIlIl = this.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        final float llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl + this.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl + this.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        final float liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + this.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI + this.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        final float liiIlllIIIllIIIllIII = this.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + this.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + this.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        final float llIIlIIIlIIIllIlIIIl2 = this.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl + this.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl + this.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl2;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        if (this != llIIlIIIlIIIllIlIIIl && this != llIIlIIIlIIIllIlIIIl2) {
            this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
        }
        else {
            final float ilIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            final float llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            final float ilIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            final float ilIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            final float illIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            final float llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            final float liiiIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            final float liiIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            final float llIIlIIIlIIIllIlIIIl3 = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl3;
        }
    }
    
    public final void llllIIIlIlllIlIIIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = this.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI + this.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        array[1] = this.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + this.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        array[2] = this.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl + this.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        array[3] = this.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + this.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        array[4] = this.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        array[5] = this.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl + this.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl + this.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        array[6] = this.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + this.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI + this.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        array[7] = this.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + this.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + this.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        array[8] = this.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl + this.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl + this.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(array, array3, array2);
        this.IlIlIlIlIlllllllllIl = (float)array2[0];
        this.llIllIIIIIllIlIIIIlI = (float)array2[1];
        this.IlIIIlIlIIIllIlIlIIl = (float)array2[2];
        this.IlIlIIIllIllIIIIIllI = (float)array2[3];
        this.IllIIlllIIIIlllIIlIl = (float)array2[4];
        this.llllIIIlIlllIlIIIIIl = (float)array2[5];
        this.lIIIIlIIIIIlllIllIII = (float)array2[6];
        this.lIIIlllIIIllIIIllIII = (float)array2[7];
        this.llIIlIIIlIIIllIlIIIl = (float)array2[8];
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
        array[1] = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
        array[2] = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
        array[3] = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
        array[4] = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
        array[5] = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
        array[6] = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
        array[7] = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
        array[8] = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
        javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(array, array3, array2);
        this.IlIlIlIlIlllllllllIl = (float)array2[0];
        this.llIllIIIIIllIlIIIIlI = (float)array2[1];
        this.IlIIIlIlIIIllIlIlIIl = (float)array2[2];
        this.IlIlIIIllIllIIIIIllI = (float)array2[3];
        this.IllIIlllIIIIlllIIlIl = (float)array2[4];
        this.llllIIIlIlllIlIIIIIl = (float)array2[5];
        this.lIIIIlIIIIIlllIllIII = (float)array2[6];
        this.lIIIlllIIIllIIIllIII = (float)array2[7];
        this.llIIlIIIlIIIllIlIIIl = (float)array2[8];
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        if (this != llIIlIIIlIIIllIlIIIl && this != llIIlIIIlIIIllIlIIIl2) {
            this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
        }
        else {
            final float ilIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            final float llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            final float ilIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            final float ilIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            final float illIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            final float llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            final float liiiIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            final float liiIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            final float llIIlIIIlIIIllIlIIIl3 = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl3;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        if (this != llIIlIIIlIIIllIlIIIl && this != llIIlIIIlIIIllIlIIIl2) {
            this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
        }
        else {
            final float ilIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            final float llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            final float ilIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            final float ilIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            final float illIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            final float llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            final float liiiIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl;
            final float liiIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl;
            final float llIIlIIIlIIIllIlIIIl3 = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl3;
        }
    }
    
    public final void llllIIIlIlllIlIIIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        if (this != llIIlIIIlIIIllIlIIIl && this != llIIlIIIlIIIllIlIIIl2) {
            this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
        }
        else {
            final float ilIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            final float llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            final float ilIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            final float ilIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            final float illIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            final float llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            final float liiiIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIIlIIIIIlllIllIII;
            final float liiIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.lIIIlllIIIllIIIllIII;
            final float llIIlIIIlIIIllIlIIIl3 = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl + llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * llIIlIIIlIIIllIlIIIl2.llllIIIlIlllIlIIIIIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl3;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl() {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
        this.IlIlIlIlIlllllllllIl = (float)array[0];
        this.llIllIIIIIllIlIIIIlI = (float)array[1];
        this.IlIIIlIlIIIllIlIlIIl = (float)array[2];
        this.IlIlIIIllIllIIIIIllI = (float)array[3];
        this.IllIIlllIIIIlllIIlIl = (float)array[4];
        this.llllIIIlIlllIlIIIIIl = (float)array[5];
        this.lIIIIlIIIIIlllIllIII = (float)array[6];
        this.lIIIlllIIIllIIIllIII = (float)array[7];
        this.llIIlIIIlIIIllIlIIIl = (float)array[8];
    }
    
    public final void lIIIIlIIIIIlllIllIII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        array[1] = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        array[2] = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        array[3] = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        array[4] = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        array[5] = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        array[6] = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        array[7] = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        array[8] = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(array, array3, array2);
        this.IlIlIlIlIlllllllllIl = (float)array2[0];
        this.llIllIIIIIllIlIIIIlI = (float)array2[1];
        this.IlIIIlIlIIIllIlIlIIl = (float)array2[2];
        this.IlIlIIIllIllIIIIIllI = (float)array2[3];
        this.IllIIlllIIIIlllIIlIl = (float)array2[4];
        this.llllIIIlIlllIlIIIIIl = (float)array2[5];
        this.lIIIIlIIIIIlllIllIII = (float)array2[6];
        this.lIIIlllIIIllIIIllIII = (float)array2[7];
        this.llIIlIIIlIIIllIlIIIl = (float)array2[8];
    }
    
    public final void llllIIIlIlllIlIIIIIl() {
        final float n = 1.0f / (float)Math.sqrt(this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII);
        this.IlIlIlIlIlllllllllIl *= n;
        this.IlIlIIIllIllIIIIIllI *= n;
        this.lIIIIlIIIIIlllIllIII *= n;
        final float n2 = 1.0f / (float)Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII);
        this.llIllIIIIIllIlIIIIlI *= n2;
        this.IllIIlllIIIIlllIIlIl *= n2;
        this.lIIIlllIIIllIIIllIII *= n2;
        this.IlIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI * this.lIIIlllIIIllIIIllIII - this.IllIIlllIIIIlllIIlIl * this.lIIIIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI * this.lIIIIlIIIIIlllIllIII - this.IlIlIlIlIlllllllllIl * this.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl * this.IllIIlllIIIIlllIIlIl - this.llIllIIIIIllIlIIIIlI * this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final float n = 1.0f / (float)Math.sqrt(llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI + llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII);
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * n;
        this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * n;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * n;
        final float n2 = 1.0f / (float)Math.sqrt(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII);
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * n2;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * n2;
        this.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * n2;
        this.IlIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI * this.lIIIlllIIIllIIIllIII - this.IllIIlllIIIIlllIIlIl * this.lIIIIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI * this.lIIIIlIIIIIlllIllIII - this.IlIlIlIlIlllllllllIl * this.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl * this.IllIIlllIIIIlllIIlIl - this.llIllIIIIIllIlIIIIlI * this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        try {
            return this.IlIlIlIlIlllllllllIl == llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl == llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)o;
            return this.IlIlIlIlIlllllllllIl == llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl == llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        }
        catch (ClassCastException ex) {
            return false;
        }
        catch (NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n) {
        boolean b = true;
        if (Math.abs(this.IlIlIlIlIlllllllllIl - llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl) > n) {
            b = false;
        }
        if (Math.abs(this.llIllIIIIIllIlIIIIlI - llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) > n) {
            b = false;
        }
        if (Math.abs(this.IlIIIlIlIIIllIlIlIIl - llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl) > n) {
            b = false;
        }
        if (Math.abs(this.IlIlIIIllIllIIIIIllI - llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI) > n) {
            b = false;
        }
        if (Math.abs(this.IllIIlllIIIIlllIIlIl - llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl) > n) {
            b = false;
        }
        if (Math.abs(this.llllIIIlIlllIlIIIIIl - llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl) > n) {
            b = false;
        }
        if (Math.abs(this.lIIIIlIIIIIlllIllIII - llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII) > n) {
            b = false;
        }
        if (Math.abs(this.lIIIlllIIIllIIIllIII - llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII) > n) {
            b = false;
        }
        if (Math.abs(this.llIIlIIIlIIIllIlIIIl - llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl) > n) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.IlIlIlIlIlllllllllIl), this.llIllIIIIIllIlIIIIlI), this.IlIIIlIlIIIllIlIlIIl), this.IlIlIIIllIllIIIIIllI), this.IllIIlllIIIIlllIIlIl), this.llllIIIlIlllIlIIIIIl), this.lIIIIlIIIIIlllIllIII), this.lIIIlllIIIllIIIllIII), this.llIIlIIIlIIIllIlIIIl));
    }
    
    public final void lIIIIlIIIIIlllIllIII() {
        this.IlIlIlIlIlllllllllIl = 0.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
    }
    
    public final void lIIIlllIIIllIIIllIII() {
        this.IlIlIlIlIlllllllllIl = -this.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = -this.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -this.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -this.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -this.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -this.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -this.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -this.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = -this.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llIllIlIIIIllIlIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = -llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = -llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = -llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl + this.llllIIIlIlllIlIIIIIl * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI, this.lIIIIlIIIIIlllIllIII * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI + this.lIIIlllIIIllIIIllIII * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl + this.llIIlIIIlIIIllIlIIIl * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI);
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final llllllIllIllIlIllllI llllllIllIllIlIllllI2) {
        final float llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        final float ilIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl + this.llllIIIlIlllIlIIIIIl * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        llllllIllIllIlIllllI2.IlIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI + this.lIIIlllIIIllIIIllIII * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl + this.llIIlIIIlIIIllIlIIIl * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        llllllIllIllIlIllllI2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        llllllIllIllIlIllllI2.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    void llllIIIIlIIIlIlllIll(final double[] array, final double[] array2) {
        javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(new double[] { this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, this.llIIlIIIlIIIllIlIIIl }, array, array2);
    }
    
    public Object clone() {
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl;
        try {
            llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    public final float llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public final void lIIIIlIIIIIlllIllIII(final float ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public final float llIllIlIIIIllIlIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void lIIIlllIIIllIIIllIII(final float llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final float lIlIlIIIllIIllIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llIIlIIIlIIIllIlIIIl(final float ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final float IlIlIIIllIIllIlllllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llIllIlIIIIllIlIIllI(final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final float IIIIlllIIIIIIlIIIlll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void lIlIlIIIllIIllIIIllI(final float illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public final float llllIIllllIlIlIIIIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public final void IlIlIIIllIIllIlllllI(final float llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public final float IlIllIlIlIIIlIlIlIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public final void IIIIlllIIIIIIlIIIlll(final float liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final float IIlllIIlIllIllIlIIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIllllIlIlIIIIll(final float liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public final float lllIIIIlllllIlIIllIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IlIllIlIlIIIlIlIlIII(final float llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
}
