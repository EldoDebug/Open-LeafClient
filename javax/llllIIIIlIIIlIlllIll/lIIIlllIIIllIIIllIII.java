package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class lIIIlllIIIllIIIllIII implements Serializable, Cloneable
{
    static final long llllIIIIlIIIlIlllIll = 6837536777072402710L;
    public double IlIlIlIlIlllllllllIl;
    public double llIllIIIIIllIlIIIIlI;
    public double IlIIIlIlIIIllIlIlIIl;
    public double IlIlIIIllIllIIIIIllI;
    public double IllIIlllIIIIlllIIlIl;
    public double llllIIIlIlllIlIIIIIl;
    public double lIIIIlIIIIIlllIllIII;
    public double lIIIlllIIIllIIIllIII;
    public double llIIlIIIlIIIllIlIIIl;
    private static final double llIllIlIIIIllIlIIllI = 1.110223024E-16;
    
    public lIIIlllIIIllIIIllIII(final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI, final double illIIlllIIIIlllIIlIl, final double llllIIIlIlllIlIIIIIl, final double liiiIlIIIIIlllIllIII, final double liiIlllIIIllIIIllIII, final double llIIlIIIlIIIllIlIIIl) {
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
    
    public lIIIlllIIIllIIIllIII(final double[] array) {
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
    
    public lIIIlllIIIllIIIllIII(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
    }
    
    public lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
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
    
    public lIIIlllIIIllIIIllIII() {
        this.IlIlIlIlIlllllllllIl = 0.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.IlIlIlIlIlllllllllIl) + ", " + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + "\n" + this.IlIlIIIllIllIIIIIllI + ", " + this.IllIIlllIIIIlllIIlIl + ", " + this.llllIIIlIlllIlIIIIIl + "\n" + this.lIIIIlIIIIIlllIllIII + ", " + this.lIIIlllIIIllIIIllIII + ", " + this.llIIlIIIlIIIllIlIIIl + "\n";
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = 1.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 1.0;
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n) {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
        this.IlIlIlIlIlllllllllIl = array[0] * n;
        this.llIllIIIIIllIlIIIIlI = array[1] * n;
        this.IlIIIlIlIIIllIlIlIIl = array[2] * n;
        this.IlIlIIIllIllIIIIIllI = array[3] * n;
        this.IllIIlllIIIIlllIIlIl = array[4] * n;
        this.llllIIIlIlllIlIIIIIl = array[5] * n;
        this.lIIIIlIIIIIlllIllIII = array[6] * n;
        this.lIIIlllIIIllIIIllIII = array[7] * n;
        this.llIIlIIIlIIIllIlIIIl = array[8] * n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final int n2, final double llIIlIIIlIIIllIlIIIl) {
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
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d0"));
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
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d0"));
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
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d0"));
                        }
                    }
                    break;
                }
                default: {
                    throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d0"));
                }
            }
        }
    }
    
    public final double llllIIIIlIIIlIlllIll(final int n, final int n2) {
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
        throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d1"));
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        if (n == 0) {
            illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl;
            illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = this.llIllIIIIIllIlIIIIlI;
            illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl;
        }
        else if (n == 1) {
            illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI;
            illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl;
            illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.llllIIIlIlllIlIIIIIl;
        }
        else {
            if (n != 2) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d2"));
            }
            illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = this.lIIIIlIIIIIlllIllIII;
            illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII;
            illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final double[] array) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d2"));
            }
            array[0] = this.lIIIIlIIIIIlllIllIII;
            array[1] = this.lIIIlllIIIllIIIllIII;
            array[2] = this.llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        if (n == 0) {
            illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl;
            illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI;
            illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII;
        }
        else if (n == 1) {
            illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
            illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl;
            illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.lIIIlllIIIllIIIllIII;
        }
        else {
            if (n != 2) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d4"));
            }
            illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl;
            illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = this.llllIIIlIlllIlIIIIIl;
            illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final double[] array) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d4"));
            }
            array[0] = this.IlIIIlIlIIIllIlIlIIl;
            array[1] = this.llllIIIlIlllIlIIIIIl;
            array[2] = this.llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final double liiiIlIIIIIlllIllIII, final double liiIlllIIIllIIIllIII, final double llIIlIIIlIIIllIlIIIl) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d6"));
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
                this.llIllIIIIIllIlIIIIlI = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
                this.IlIIIlIlIIIllIlIlIIl = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
                break;
            }
            case 1: {
                this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
                this.IllIIlllIIIIlllIIlIl = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
                this.llllIIIlIlllIlIIIIIl = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
                break;
            }
            case 2: {
                this.lIIIIlIIIIIlllIllIII = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
                this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
                this.llIIlIIIlIIIllIlIIIl = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d6"));
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final double[] array) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d6"));
            }
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final double ilIIIlIlIIIllIlIlIIl, final double llllIIIlIlllIlIIIIIl, final double llIIlIIIlIIIllIlIIIl) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d9"));
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
                this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
                this.lIIIIlIIIIIlllIllIII = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
                break;
            }
            case 1: {
                this.llIllIIIIIllIlIIIIlI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
                this.IllIIlllIIIIlllIIlIl = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
                this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
                break;
            }
            case 2: {
                this.IlIIIlIlIIIllIlIlIIl = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
                this.llllIIIlIlllIlIIIIIl = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
                this.llIIlIIIlIIIllIlIIIl = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d9"));
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final double[] array) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d9"));
            }
        }
    }
    
    public final double IlIlIlIlIlllllllllIl() {
        final double[] array = new double[3];
        this.llllIIIIlIIIlIlllIll(array, new double[9]);
        return IlIIIlIlIIIllIlIlIIl(array);
    }
    
    public final void IlIlIlIlIlllllllllIl(final double n) {
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
    
    public final void llllIIIIlIIIlIlllIll(final double n, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + n;
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI + n;
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl + n;
        this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI + n;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + n;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl + n;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII + n;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII + n;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl + n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2) {
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl + liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl += liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI += liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI += liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl += liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl += liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII += liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII += liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl += liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2) {
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl - liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI - liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl - liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl - liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl - liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII - liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII - liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl - liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl -= liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI -= liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI -= liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl -= liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl -= liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII -= liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII -= liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl -= liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        final double ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = this.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        final double liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII;
        this.lIIIIlIIIIIlllIllIII = this.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = liiiIlIIIIIlllIllIII;
        final double liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII;
        this.lIIIlllIIIllIIIllIII = this.llllIIIlIlllIlIIIIIl;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        if (this != liiIlllIIIllIIIllIII) {
            this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
            this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
            this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
            this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
            this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
            this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        }
        else {
            this.llIllIIIIIllIlIIIIlI();
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this.IlIlIlIlIlllllllllIl = 1.0 - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
        this.IlIlIIIllIllIIIIIllI = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.lIIIIlIIIIIlllIllIII = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = 1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = 2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl);
        this.IlIIIlIlIIIllIlIlIIl = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl = 2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl);
        this.llIIlIIIlIIIllIlIIIl = 1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final double sqrt = Math.sqrt(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        if (sqrt < 1.110223024E-16) {
            this.IlIlIlIlIlllllllllIl = 1.0;
            this.llIllIIIIIllIlIIIIlI = 0.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IlIlIIIllIllIIIIIllI = 0.0;
            this.IllIIlllIIIIlllIIlIl = 1.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 0.0;
            this.lIIIlllIIIllIIIllIII = 0.0;
            this.llIIlIIIlIIIllIlIIIl = 1.0;
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
            this.IlIlIlIlIlllllllllIl = n5 * n2 * n2 + cos;
            this.llIllIIIIIllIlIIIIlI = n5 * n7 - sin * n4;
            this.IlIIIlIlIIIllIlIlIIl = n5 * n6 + sin * n3;
            this.IlIlIIIllIllIIIIIllI = n5 * n7 + sin * n4;
            this.IllIIlllIIIIlllIIlIl = n5 * n3 * n3 + cos;
            this.llllIIIlIlllIlIIIIIl = n5 * n8 - sin * n2;
            this.lIIIIlIIIIIlllIllIII = n5 * n6 - sin * n3;
            this.lIIIlllIIIllIIIllIII = n5 * n8 + sin * n2;
            this.llIIlIIIlIIIllIlIIIl = n5 * n4 * n4 + cos;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        this.IlIlIlIlIlllllllllIl = 1.0 - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        this.IlIlIIIllIllIIIIIllI = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.lIIIIlIIIIIlllIllIII = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = 1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = 2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl);
        this.IlIIIlIlIIIllIlIlIIl = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl = 2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl);
        this.llIIlIIIlIIIllIlIIIl = 1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final double sqrt = Math.sqrt(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI + ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        if (sqrt < 1.110223024E-16) {
            this.IlIlIlIlIlllllllllIl = 1.0;
            this.llIllIIIIIllIlIIIIlI = 0.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IlIlIIIllIllIIIIIllI = 0.0;
            this.IllIIlllIIIIlllIIlIl = 1.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 0.0;
            this.lIIIlllIIIllIIIllIII = 0.0;
            this.llIIlIIIlIIIllIlIIIl = 1.0;
        }
        else {
            final double n = 1.0 / sqrt;
            final double n2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * n;
            final double n3 = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * n;
            final double n4 = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * n;
            final double sin = Math.sin(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
            final double cos = Math.cos(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
            final double n5 = 1.0 - cos;
            final double n6 = n2 * n4;
            final double n7 = n2 * n3;
            final double n8 = n3 * n4;
            this.IlIlIlIlIlllllllllIl = n5 * n2 * n2 + cos;
            this.llIllIIIIIllIlIIIIlI = n5 * n7 - sin * n4;
            this.IlIIIlIlIIIllIlIlIIl = n5 * n6 + sin * n3;
            this.IlIlIIIllIllIIIIIllI = n5 * n7 + sin * n4;
            this.IllIIlllIIIIlllIIlIl = n5 * n3 * n3 + cos;
            this.llllIIIlIlllIlIIIIIl = n5 * n8 - sin * n2;
            this.lIIIIlIIIIIlllIllIII = n5 * n6 - sin * n3;
            this.lIIIlllIIIllIIIllIII = n5 * n8 + sin * n2;
            this.llIIlIIIlIIIllIlIIIl = n5 * n4 * n4 + cos;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
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
    
    public final void IlIIIlIlIIIllIlIlIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double[] array) {
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
    
    public final void IlIlIIIllIllIIIIIllI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.lIlIlIIIllIIllIIIllI(liiIlllIIIllIIIllIII);
    }
    
    public final void IlIIIlIlIIIllIlIlIIl() {
        this.lIlIlIIIllIIllIIIllI(this);
    }
    
    private final void lIlIlIIIllIIllIIIllI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double[] array = new double[9];
        final int[] array2 = new int[3];
        final double[] array3 = { liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl, liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI, liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl, liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI, liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl, liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl, liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII, liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII, liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl };
        if (!llllIIIIlIIIlIlllIll(array3, array2)) {
            throw new IIIlIIlIIIIlllIlllII(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d12"));
        }
        for (int i = 0; i < 9; ++i) {
            array[i] = 0.0;
        }
        array[0] = 1.0;
        array[8] = (array[4] = 1.0);
        llllIIIIlIIIlIlllIll(array3, array2, array);
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
                throw new RuntimeException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix3d13"));
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
    
    public final double IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl * (this.IllIIlllIIIIlllIIlIl * this.llIIlIIIlIIIllIlIIIl - this.llllIIIlIlllIlIIIIIl * this.lIIIlllIIIllIIIllIII) + this.llIllIIIIIllIlIIIIlI * (this.llllIIIlIlllIlIIIIIl * this.lIIIIlIIIIIlllIllIII - this.IlIlIIIllIllIIIIIllI * this.llIIlIIIlIIIllIlIIIl) + this.IlIIIlIlIIIllIlIlIIl * (this.IlIlIIIllIllIIIIIllI * this.lIIIlllIIIllIIIllIII - this.IllIIlllIIIIlllIIlIl * this.lIIIIlIIIIIlllIllIII);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final double llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl;
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.IlIlIlIlIlllllllllIl = 1.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = cos;
        this.llllIIIlIlllIlIIIIIl = -sin;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = sin;
        this.llIIlIIIlIIIllIlIIIl = cos;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.IlIlIlIlIlllllllllIl = cos;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = sin;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 1.0;
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = -sin;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = cos;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.IlIlIlIlIlllllllllIl = cos;
        this.llIllIIIIIllIlIIIIlI = -sin;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = sin;
        this.IllIIlllIIIIlllIIlIl = cos;
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 1.0;
    }
    
    public final void llllIIIlIlllIlIIIIIl(final double n) {
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
    
    public final void IlIlIlIlIlllllllllIl(final double n, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = n * liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = n * liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = n * liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n * liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n * liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = n * liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = n * liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI + this.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        final double llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + this.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        final double ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl + this.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        final double ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + this.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        final double illIIlllIIIIlllIIlIl = this.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        final double llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl + this.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl + this.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        final double liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + this.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI + this.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        final double liiIlllIIIllIIIllIII2 = this.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI + this.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + this.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        final double llIIlIIIlIIIllIlIIIl = this.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl + this.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl + this.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII2;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2) {
        if (this != liiIlllIIIllIIIllIII && this != liiIlllIIIllIIIllIII2) {
            this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
        }
        else {
            final double ilIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            final double llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            final double ilIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            final double ilIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            final double illIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            final double llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            final double liiiIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            final double liiIlllIIIllIIIllIII3 = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            final double llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII3;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void llllIIIlIlllIlIIIIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = this.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI + this.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        array[1] = this.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + this.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        array[2] = this.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl + this.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        array[3] = this.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + this.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        array[4] = this.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        array[5] = this.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl + this.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl + this.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        array[6] = this.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + this.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI + this.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        array[7] = this.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI + this.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + this.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        array[8] = this.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl + this.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl + this.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        llllIIIIlIIIlIlllIll(array, array3, array2);
        this.IlIlIlIlIlllllllllIl = array2[0];
        this.llIllIIIIIllIlIIIIlI = array2[1];
        this.IlIIIlIlIIIllIlIlIIl = array2[2];
        this.IlIlIIIllIllIIIIIllI = array2[3];
        this.IllIIlllIIIIlllIIlIl = array2[4];
        this.llllIIIlIlllIlIIIIIl = array2[5];
        this.lIIIIlIIIIIlllIllIII = array2[6];
        this.lIIIlllIIIllIIIllIII = array2[7];
        this.llIIlIIIlIIIllIlIIIl = array2[8];
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
        array[1] = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
        array[2] = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
        array[3] = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
        array[4] = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
        array[5] = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
        array[6] = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
        array[7] = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
        array[8] = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
        llllIIIIlIIIlIlllIll(array, array3, array2);
        this.IlIlIlIlIlllllllllIl = array2[0];
        this.llIllIIIIIllIlIIIIlI = array2[1];
        this.IlIIIlIlIIIllIlIlIIl = array2[2];
        this.IlIlIIIllIllIIIIIllI = array2[3];
        this.IllIIlllIIIIlllIIlIl = array2[4];
        this.llllIIIlIlllIlIIIIIl = array2[5];
        this.lIIIIlIIIIIlllIllIII = array2[6];
        this.lIIIlllIIIllIIIllIII = array2[7];
        this.llIIlIIIlIIIllIlIIIl = array2[8];
    }
    
    public final void IlIlIIIllIllIIIIIllI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2) {
        if (this != liiIlllIIIllIIIllIII && this != liiIlllIIIllIIIllIII2) {
            this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
        }
        else {
            final double ilIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            final double llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            final double ilIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            final double ilIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            final double illIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            final double llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            final double liiiIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            final double liiIlllIIIllIIIllIII3 = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            final double llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII3;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2) {
        if (this != liiIlllIIIllIIIllIII && this != liiIlllIIIllIIIllIII2) {
            this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
        }
        else {
            final double ilIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            final double llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            final double ilIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            final double ilIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            final double illIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            final double llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            final double liiiIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl;
            final double liiIlllIIIllIIIllIII3 = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl;
            final double llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII3;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void llllIIIlIlllIlIIIIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2) {
        if (this != liiIlllIIIllIIIllIII && this != liiIlllIIIllIIIllIII2) {
            this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
        }
        else {
            final double ilIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            final double llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            final double ilIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            final double ilIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            final double illIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            final double llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            final double liiiIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIIlIIIIIlllIllIII;
            final double liiIlllIIIllIIIllIII3 = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.lIIIlllIIIllIIIllIII;
            final double llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * liiIlllIIIllIIIllIII2.IlIIIlIlIIIllIlIlIIl + liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * liiIlllIIIllIIIllIII2.llllIIIlIlllIlIIIIIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * liiIlllIIIllIIIllIII2.llIIlIIIlIIIllIlIIIl;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII3;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl() {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
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
    
    public final void lIIIIlIIIIIlllIllIII(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        array[1] = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        array[2] = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        array[3] = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        array[4] = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        array[5] = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        array[6] = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        array[7] = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        array[8] = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        llllIIIIlIIIlIlllIll(array, array3, array2);
        this.IlIlIlIlIlllllllllIl = array2[0];
        this.llIllIIIIIllIlIIIIlI = array2[1];
        this.IlIIIlIlIIIllIlIlIIl = array2[2];
        this.IlIlIIIllIllIIIIIllI = array2[3];
        this.IllIIlllIIIIlllIIlIl = array2[4];
        this.llllIIIlIlllIlIIIIIl = array2[5];
        this.lIIIIlIIIIIlllIllIII = array2[6];
        this.lIIIlllIIIllIIIllIII = array2[7];
        this.llIIlIIIlIIIllIlIIIl = array2[8];
    }
    
    public final void llllIIIlIlllIlIIIIIl() {
        final double n = 1.0 / Math.sqrt(this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII);
        this.IlIlIlIlIlllllllllIl *= n;
        this.IlIlIIIllIllIIIIIllI *= n;
        this.lIIIIlIIIIIlllIllIII *= n;
        final double n2 = 1.0 / Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII);
        this.llIllIIIIIllIlIIIIlI *= n2;
        this.IllIIlllIIIIlllIIlIl *= n2;
        this.lIIIlllIIIllIIIllIII *= n2;
        this.IlIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI * this.lIIIlllIIIllIIIllIII - this.IllIIlllIIIIlllIIlIl * this.lIIIIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI * this.lIIIIlIIIIIlllIllIII - this.IlIlIlIlIlllllllllIl * this.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl * this.IllIIlllIIIIlllIIlIl - this.llIllIIIIIllIlIIIIlI * this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void lIIIlllIIIllIIIllIII(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double n = 1.0 / Math.sqrt(liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI + liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII);
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * n;
        this.IlIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * n;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * n;
        final double n2 = 1.0 / Math.sqrt(liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII);
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * n2;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * n2;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * n2;
        this.IlIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI * this.lIIIlllIIIllIIIllIII - this.IllIIlllIIIIlllIIlIl * this.lIIIIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI * this.lIIIIlIIIIIlllIllIII - this.IlIlIlIlIlllllllllIl * this.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl * this.IllIIlllIIIIlllIIlIl - this.llIllIIIIIllIlIIIIlI * this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        try {
            return this.IlIlIlIlIlllllllllIl == liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl == liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = (lIIIlllIIIllIIIllIII)o;
            return this.IlIlIlIlIlllllllllIl == liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl == liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        }
        catch (ClassCastException ex) {
            return false;
        }
        catch (NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final double n) {
        final double n2 = this.IlIlIlIlIlllllllllIl - liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        if (((n2 < 0.0) ? (-n2) : n2) > n) {
            return false;
        }
        final double n3 = this.llIllIIIIIllIlIIIIlI - liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        if (((n3 < 0.0) ? (-n3) : n3) > n) {
            return false;
        }
        final double n4 = this.IlIIIlIlIIIllIlIlIIl - liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        if (((n4 < 0.0) ? (-n4) : n4) > n) {
            return false;
        }
        final double n5 = this.IlIlIIIllIllIIIIIllI - liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        if (((n5 < 0.0) ? (-n5) : n5) > n) {
            return false;
        }
        final double n6 = this.IllIIlllIIIIlllIIlIl - liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        if (((n6 < 0.0) ? (-n6) : n6) > n) {
            return false;
        }
        final double n7 = this.llllIIIlIlllIlIIIIIl - liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        if (((n7 < 0.0) ? (-n7) : n7) > n) {
            return false;
        }
        final double n8 = this.lIIIIlIIIIIlllIllIII - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        if (((n8 < 0.0) ? (-n8) : n8) > n) {
            return false;
        }
        final double n9 = this.lIIIlllIIIllIIIllIII - liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        if (((n9 < 0.0) ? (-n9) : n9) > n) {
            return false;
        }
        final double n10 = this.llIIlIIIlIIIllIlIIIl - liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        return ((n10 < 0.0) ? (-n10) : n10) <= n;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.IlIlIlIlIlllllllllIl), this.llIllIIIIIllIlIIIIlI), this.IlIIIlIlIIIllIlIlIIl), this.IlIlIIIllIllIIIIIllI), this.IllIIlllIIIIlllIIlIl), this.llllIIIlIlllIlIIIIIl), this.lIIIIlIIIIIlllIllIII), this.lIIIlllIIIllIIIllIII), this.llIIlIIIlIIIllIlIIIl));
    }
    
    public final void lIIIIlIIIIIlllIllIII() {
        this.IlIlIlIlIlllllllllIl = 0.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
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
    
    public final void llIllIlIIIIllIlIIllI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = -liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = -liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = -liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl + this.llllIIIlIlllIlIIIIIl * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI, this.lIIIIlIIIIIlllIllIII * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI + this.lIIIlllIIIllIIIllIII * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl + this.llIIlIIIlIIIllIlIIIl * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI);
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll2) {
        final double llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        final double ilIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI + this.IllIIlllIIIIlllIIlIl * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl + this.llllIIIlIlllIlIIIIIl * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        ilIIIIIllIlIIIlIIll2.IlIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI + this.lIIIlllIIIllIIIllIII * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl + this.llIIlIIIlIIIllIlIIIl * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        ilIIIIIllIlIIIlIIll2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        ilIIIIIllIlIIIlIIll2.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    final void llllIIIIlIIIlIlllIll(final double[] array, final double[] array2) {
        llllIIIIlIIIlIlllIll(new double[] { this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, this.llIIlIIIlIIIllIlIIIl }, array, array2);
    }
    
    static void llllIIIIlIIIlIlllIll(final double[] array, final double[] array2, final double[] array3) {
        final double[] array4 = new double[9];
        final double[] array5 = new double[9];
        final double[] array6 = new double[9];
        final double[] array7 = new double[9];
        final double[] array8 = array6;
        final double[] array9 = array7;
        final double[] array10 = new double[9];
        final double[] array11 = new double[3];
        final double[] array12 = new double[3];
        int n = 0;
        for (int i = 0; i < 9; ++i) {
            array10[i] = array[i];
        }
        if (array[3] * array[3] < 1.110223024E-16) {
            array4[0] = 1.0;
            array4[1] = 0.0;
            array4[3] = (array4[2] = 0.0);
            array4[4] = 1.0;
            array4[5] = 0.0;
            array4[7] = (array4[6] = 0.0);
            array4[8] = 1.0;
        }
        else if (array[0] * array[0] < 1.110223024E-16) {
            array8[0] = array[0];
            array8[1] = array[1];
            array8[2] = array[2];
            array[0] = array[3];
            array[1] = array[4];
            array[2] = array[5];
            array[3] = -array8[0];
            array[4] = -array8[1];
            array[5] = -array8[2];
            array4[0] = 0.0;
            array4[1] = 1.0;
            array4[2] = 0.0;
            array4[3] = -1.0;
            array4[5] = (array4[4] = 0.0);
            array4[7] = (array4[6] = 0.0);
            array4[8] = 1.0;
        }
        else {
            final double n2 = 1.0 / Math.sqrt(array[0] * array[0] + array[3] * array[3]);
            final double n3 = array[0] * n2;
            final double n4 = array[3] * n2;
            array8[0] = n3 * array[0] + n4 * array[3];
            array8[1] = n3 * array[1] + n4 * array[4];
            array8[2] = n3 * array[2] + n4 * array[5];
            array[3] = -n4 * array[0] + n3 * array[3];
            array[4] = -n4 * array[1] + n3 * array[4];
            array[5] = -n4 * array[2] + n3 * array[5];
            array[0] = array8[0];
            array[1] = array8[1];
            array[2] = array8[2];
            array4[0] = n3;
            array4[1] = n4;
            array4[2] = 0.0;
            array4[3] = -n4;
            array4[4] = n3;
            array4[5] = 0.0;
            array4[7] = (array4[6] = 0.0);
            array4[8] = 1.0;
        }
        if (array[6] * array[6] >= 1.110223024E-16) {
            if (array[0] * array[0] < 1.110223024E-16) {
                array8[0] = array[0];
                array8[1] = array[1];
                array8[2] = array[2];
                array[0] = array[6];
                array[1] = array[7];
                array[2] = array[8];
                array[6] = -array8[0];
                array[7] = -array8[1];
                array[8] = -array8[2];
                array8[0] = array4[0];
                array8[1] = array4[1];
                array8[2] = array4[2];
                array4[0] = array4[6];
                array4[1] = array4[7];
                array4[2] = array4[8];
                array4[6] = -array8[0];
                array4[7] = -array8[1];
                array4[8] = -array8[2];
            }
            else {
                final double n5 = 1.0 / Math.sqrt(array[0] * array[0] + array[6] * array[6]);
                final double n6 = array[0] * n5;
                final double n7 = array[6] * n5;
                array8[0] = n6 * array[0] + n7 * array[6];
                array8[1] = n6 * array[1] + n7 * array[7];
                array8[2] = n6 * array[2] + n7 * array[8];
                array[6] = -n7 * array[0] + n6 * array[6];
                array[7] = -n7 * array[1] + n6 * array[7];
                array[8] = -n7 * array[2] + n6 * array[8];
                array[0] = array8[0];
                array[1] = array8[1];
                array[2] = array8[2];
                array8[0] = n6 * array4[0];
                array8[1] = n6 * array4[1];
                array4[2] = n7;
                array8[6] = -array4[0] * n7;
                array8[7] = -array4[1] * n7;
                array4[8] = n6;
                array4[0] = array8[0];
                array4[1] = array8[1];
                array4[6] = array8[6];
                array4[7] = array8[7];
            }
        }
        if (array[2] * array[2] < 1.110223024E-16) {
            array5[0] = 1.0;
            array5[1] = 0.0;
            array5[3] = (array5[2] = 0.0);
            array5[4] = 1.0;
            array5[5] = 0.0;
            array5[7] = (array5[6] = 0.0);
            array5[8] = 1.0;
        }
        else if (array[1] * array[1] < 1.110223024E-16) {
            array8[2] = array[2];
            array8[5] = array[5];
            array8[8] = array[8];
            array[2] = -array[1];
            array[5] = -array[4];
            array[8] = -array[7];
            array[1] = array8[2];
            array[4] = array8[5];
            array[7] = array8[8];
            array5[0] = 1.0;
            array5[2] = (array5[1] = 0.0);
            array5[4] = (array5[3] = 0.0);
            array5[5] = -1.0;
            array5[6] = 0.0;
            array5[7] = 1.0;
            array5[8] = 0.0;
        }
        else {
            final double n8 = 1.0 / Math.sqrt(array[1] * array[1] + array[2] * array[2]);
            final double n9 = array[1] * n8;
            final double n10 = array[2] * n8;
            array8[1] = n9 * array[1] + n10 * array[2];
            array[2] = -n10 * array[1] + n9 * array[2];
            array[1] = array8[1];
            array8[4] = n9 * array[4] + n10 * array[5];
            array[5] = -n10 * array[4] + n9 * array[5];
            array[4] = array8[4];
            array8[7] = n9 * array[7] + n10 * array[8];
            array[8] = -n10 * array[7] + n9 * array[8];
            array[7] = array8[7];
            array5[0] = 1.0;
            array5[1] = 0.0;
            array5[3] = (array5[2] = 0.0);
            array5[4] = n9;
            array5[5] = -n10;
            array5[6] = 0.0;
            array5[7] = n10;
            array5[8] = n9;
        }
        if (array[7] * array[7] >= 1.110223024E-16) {
            if (array[4] * array[4] < 1.110223024E-16) {
                array8[3] = array[3];
                array8[4] = array[4];
                array8[5] = array[5];
                array[3] = array[6];
                array[4] = array[7];
                array[5] = array[8];
                array[6] = -array8[3];
                array[7] = -array8[4];
                array[8] = -array8[5];
                array8[3] = array4[3];
                array8[4] = array4[4];
                array8[5] = array4[5];
                array4[3] = array4[6];
                array4[4] = array4[7];
                array4[5] = array4[8];
                array4[6] = -array8[3];
                array4[7] = -array8[4];
                array4[8] = -array8[5];
            }
            else {
                final double n11 = 1.0 / Math.sqrt(array[4] * array[4] + array[7] * array[7]);
                final double n12 = array[4] * n11;
                final double n13 = array[7] * n11;
                array8[3] = n12 * array[3] + n13 * array[6];
                array[6] = -n13 * array[3] + n12 * array[6];
                array[3] = array8[3];
                array8[4] = n12 * array[4] + n13 * array[7];
                array[7] = -n13 * array[4] + n12 * array[7];
                array[4] = array8[4];
                array8[5] = n12 * array[5] + n13 * array[8];
                array[8] = -n13 * array[5] + n12 * array[8];
                array[5] = array8[5];
                array8[3] = n12 * array4[3] + n13 * array4[6];
                array4[6] = -n13 * array4[3] + n12 * array4[6];
                array4[3] = array8[3];
                array8[4] = n12 * array4[4] + n13 * array4[7];
                array4[7] = -n13 * array4[4] + n12 * array4[7];
                array4[4] = array8[4];
                array8[5] = n12 * array4[5] + n13 * array4[8];
                array4[8] = -n13 * array4[5] + n12 * array4[8];
                array4[5] = array8[5];
            }
        }
        array9[0] = array[0];
        array9[1] = array[4];
        array9[2] = array[8];
        array11[0] = array[1];
        array11[1] = array[5];
        if (array11[0] * array11[0] >= 1.110223024E-16 || array11[1] * array11[1] >= 1.110223024E-16) {
            llllIIIIlIIIlIlllIll(array9, array11, array4, array5);
        }
        array12[0] = array9[0];
        array12[1] = array9[1];
        array12[2] = array9[2];
        if (IlIIIlIlIIIllIlIlIIl(Math.abs(array12[0]), 1.0) && IlIIIlIlIIIllIlIlIIl(Math.abs(array12[1]), 1.0) && IlIIIlIlIIIllIlIlIIl(Math.abs(array12[2]), 1.0)) {
            for (int j = 0; j < 3; ++j) {
                if (array12[j] < 0.0) {
                    ++n;
                }
            }
            if (n == 0 || n == 2) {
                final int n14 = 0;
                final int n15 = 1;
                final int n16 = 2;
                final double n17 = 1.0;
                array2[n16] = n17;
                array2[n14] = (array2[n15] = n17);
                for (int k = 0; k < 9; ++k) {
                    array3[k] = array10[k];
                }
                return;
            }
        }
        IlIlIlIlIlllllllllIl(array4, array6);
        IlIlIlIlIlllllllllIl(array5, array7);
        llllIIIIlIIIlIlllIll(array, array6, array7, array12, array3, array2);
    }
    
    static void llllIIIIlIIIlIlllIll(final double[] array, final double[] array2, final double[] array3, final double[] array4, final double[] array5, final double[] array6) {
        final int[] array7 = new int[3];
        final int[] array8 = new int[3];
        final double[] array9 = new double[3];
        final double[] array10 = new double[9];
        if (array4[0] < 0.0) {
            array4[0] = -array4[0];
            array3[0] = -array3[0];
            array3[1] = -array3[1];
            array3[2] = -array3[2];
        }
        if (array4[1] < 0.0) {
            array4[1] = -array4[1];
            array3[3] = -array3[3];
            array3[4] = -array3[4];
            array3[5] = -array3[5];
        }
        if (array4[2] < 0.0) {
            array4[2] = -array4[2];
            array3[6] = -array3[6];
            array3[7] = -array3[7];
            array3[8] = -array3[8];
        }
        IlIlIlIlIlllllllllIl(array2, array3, array10);
        if (IlIIIlIlIIIllIlIlIIl(Math.abs(array4[0]), Math.abs(array4[1])) && IlIIIlIlIIIllIlIlIIl(Math.abs(array4[1]), Math.abs(array4[2]))) {
            for (int i = 0; i < 9; ++i) {
                array5[i] = array10[i];
            }
            for (int j = 0; j < 3; ++j) {
                array6[j] = array4[j];
            }
        }
        else {
            if (array4[0] > array4[1]) {
                if (array4[0] > array4[2]) {
                    if (array4[2] > array4[1]) {
                        array7[0] = 0;
                        array7[array7[1] = 2] = 1;
                    }
                    else {
                        array7[0] = 0;
                        array7[1] = 1;
                        array7[2] = 2;
                    }
                }
                else {
                    array7[0] = 2;
                    array7[1] = 0;
                    array7[2] = 1;
                }
            }
            else if (array4[1] > array4[2]) {
                if (array4[2] > array4[0]) {
                    array7[0] = 1;
                    array7[array7[1] = 2] = 0;
                }
                else {
                    array7[array7[0] = 1] = 0;
                    array7[2] = 2;
                }
            }
            else {
                array7[0] = 2;
                array7[1] = 1;
                array7[2] = 0;
            }
            array9[0] = array[0] * array[0] + array[1] * array[1] + array[2] * array[2];
            array9[1] = array[3] * array[3] + array[4] * array[4] + array[5] * array[5];
            array9[2] = array[6] * array[6] + array[7] * array[7] + array[8] * array[8];
            int n;
            int n2;
            int n3;
            if (array9[0] > array9[1]) {
                if (array9[0] > array9[2]) {
                    if (array9[2] > array9[1]) {
                        n = 0;
                        n2 = 1;
                        n3 = 2;
                    }
                    else {
                        n = 0;
                        n3 = 1;
                        n2 = 2;
                    }
                }
                else {
                    n2 = 0;
                    n = 1;
                    n3 = 2;
                }
            }
            else if (array9[1] > array9[2]) {
                if (array9[2] > array9[0]) {
                    n3 = 0;
                    n2 = 1;
                    n = 2;
                }
                else {
                    n3 = 0;
                    n = 1;
                    n2 = 2;
                }
            }
            else {
                n2 = 0;
                n3 = 1;
                n = 2;
            }
            array6[0] = array4[array7[n]];
            array6[1] = array4[array7[n3]];
            array6[2] = array4[array7[n2]];
            array5[0] = array10[array7[n]];
            array5[3] = array10[array7[n] + 3];
            array5[6] = array10[array7[n] + 6];
            array5[1] = array10[array7[n3]];
            array5[4] = array10[array7[n3] + 3];
            array5[7] = array10[array7[n3] + 6];
            array5[2] = array10[array7[n2]];
            array5[5] = array10[array7[n2] + 3];
            array5[8] = array10[array7[n2] + 6];
        }
    }
    
    static int llllIIIIlIIIlIlllIll(final double[] array, final double[] array2, final double[] array3, final double[] array4) {
        final double[] array5 = new double[2];
        final double[] array6 = new double[2];
        final double[] array7 = new double[2];
        final double[] array8 = new double[2];
        final double[] array9 = new double[9];
        final double n = 1.0;
        boolean b = false;
        int n2 = 1;
        if (Math.abs(array2[1]) < 4.89E-15 || Math.abs(array2[0]) < 4.89E-15) {
            b = true;
        }
        for (int n3 = 0; n3 < 10 && !b; ++n3) {
            final double llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(array[1], array2[1], array[2]);
            llllIIIIlIIIlIlllIll((Math.abs(array[0]) - llllIIIIlIIIlIlllIll) * (llIllIIIIIllIlIIIIlI(n, array[0]) + llllIIIIlIIIlIlllIll / array[0]), array2[0], array8, array6, 0, n2);
            final double n4 = array6[0] * array[0] + array8[0] * array2[0];
            array2[0] = array6[0] * array2[0] - array8[0] * array[0];
            final double n5 = array8[0] * array[1];
            array[1] *= array6[0];
            final double llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(n4, n5, array7, array5, 0, n2);
            n2 = 0;
            array[0] = llllIIIIlIIIlIlllIll2;
            final double n6 = array5[0] * array2[0] + array7[0] * array[1];
            array[1] = array5[0] * array[1] - array7[0] * array2[0];
            final double n7 = array7[0] * array2[1];
            array2[1] *= array5[0];
            array2[0] = llllIIIIlIIIlIlllIll(n6, n7, array8, array6, 1, n2);
            final double n8 = array6[1] * array[1] + array8[1] * array2[1];
            array2[1] = array6[1] * array2[1] - array8[1] * array[1];
            final double n9 = array8[1] * array[2];
            array[2] *= array6[1];
            array[1] = llllIIIIlIIIlIlllIll(n8, n9, array7, array5, 1, n2);
            final double n10 = array5[1] * array2[1] + array7[1] * array[2];
            array[2] = array5[1] * array[2] - array7[1] * array2[1];
            array2[1] = n10;
            final double n11 = array3[0];
            array3[0] = array5[0] * n11 + array7[0] * array3[3];
            array3[3] = -array7[0] * n11 + array5[0] * array3[3];
            final double n12 = array3[1];
            array3[1] = array5[0] * n12 + array7[0] * array3[4];
            array3[4] = -array7[0] * n12 + array5[0] * array3[4];
            final double n13 = array3[2];
            array3[2] = array5[0] * n13 + array7[0] * array3[5];
            array3[5] = -array7[0] * n13 + array5[0] * array3[5];
            final double n14 = array3[3];
            array3[3] = array5[1] * n14 + array7[1] * array3[6];
            array3[6] = -array7[1] * n14 + array5[1] * array3[6];
            final double n15 = array3[4];
            array3[4] = array5[1] * n15 + array7[1] * array3[7];
            array3[7] = -array7[1] * n15 + array5[1] * array3[7];
            final double n16 = array3[5];
            array3[5] = array5[1] * n16 + array7[1] * array3[8];
            array3[8] = -array7[1] * n16 + array5[1] * array3[8];
            final double n17 = array4[0];
            array4[0] = array6[0] * n17 + array8[0] * array4[1];
            array4[1] = -array8[0] * n17 + array6[0] * array4[1];
            final double n18 = array4[3];
            array4[3] = array6[0] * n18 + array8[0] * array4[4];
            array4[4] = -array8[0] * n18 + array6[0] * array4[4];
            final double n19 = array4[6];
            array4[6] = array6[0] * n19 + array8[0] * array4[7];
            array4[7] = -array8[0] * n19 + array6[0] * array4[7];
            final double n20 = array4[1];
            array4[1] = array6[1] * n20 + array8[1] * array4[2];
            array4[2] = -array8[1] * n20 + array6[1] * array4[2];
            final double n21 = array4[4];
            array4[4] = array6[1] * n21 + array8[1] * array4[5];
            array4[5] = -array8[1] * n21 + array6[1] * array4[5];
            final double n22 = array4[7];
            array4[7] = array6[1] * n22 + array8[1] * array4[8];
            array4[8] = -array8[1] * n22 + array6[1] * array4[8];
            array9[0] = array[0];
            array9[1] = array2[0];
            array9[3] = (array9[2] = 0.0);
            array9[4] = array[1];
            array9[5] = array2[1];
            array9[7] = (array9[6] = 0.0);
            array9[8] = array[2];
            if (Math.abs(array2[1]) < 4.89E-15 || Math.abs(array2[0]) < 4.89E-15) {
                b = true;
            }
        }
        if (Math.abs(array2[1]) < 4.89E-15) {
            llllIIIIlIIIlIlllIll(array[0], array2[0], array[1], array, array7, array5, array8, array6, 0);
            final double n23 = array3[0];
            array3[0] = array5[0] * n23 + array7[0] * array3[3];
            array3[3] = -array7[0] * n23 + array5[0] * array3[3];
            final double n24 = array3[1];
            array3[1] = array5[0] * n24 + array7[0] * array3[4];
            array3[4] = -array7[0] * n24 + array5[0] * array3[4];
            final double n25 = array3[2];
            array3[2] = array5[0] * n25 + array7[0] * array3[5];
            array3[5] = -array7[0] * n25 + array5[0] * array3[5];
            final double n26 = array4[0];
            array4[0] = array6[0] * n26 + array8[0] * array4[1];
            array4[1] = -array8[0] * n26 + array6[0] * array4[1];
            final double n27 = array4[3];
            array4[3] = array6[0] * n27 + array8[0] * array4[4];
            array4[4] = -array8[0] * n27 + array6[0] * array4[4];
            final double n28 = array4[6];
            array4[6] = array6[0] * n28 + array8[0] * array4[7];
            array4[7] = -array8[0] * n28 + array6[0] * array4[7];
        }
        else {
            llllIIIIlIIIlIlllIll(array[1], array2[1], array[2], array, array7, array5, array8, array6, 1);
            final double n29 = array3[3];
            array3[3] = array5[0] * n29 + array7[0] * array3[6];
            array3[6] = -array7[0] * n29 + array5[0] * array3[6];
            final double n30 = array3[4];
            array3[4] = array5[0] * n30 + array7[0] * array3[7];
            array3[7] = -array7[0] * n30 + array5[0] * array3[7];
            final double n31 = array3[5];
            array3[5] = array5[0] * n31 + array7[0] * array3[8];
            array3[8] = -array7[0] * n31 + array5[0] * array3[8];
            final double n32 = array4[1];
            array4[1] = array6[0] * n32 + array8[0] * array4[2];
            array4[2] = -array8[0] * n32 + array6[0] * array4[2];
            final double n33 = array4[4];
            array4[4] = array6[0] * n33 + array8[0] * array4[5];
            array4[5] = -array8[0] * n33 + array6[0] * array4[5];
            final double n34 = array4[7];
            array4[7] = array6[0] * n34 + array8[0] * array4[8];
            array4[8] = -array8[0] * n34 + array6[0] * array4[8];
        }
        return 0;
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
    
    static double llIllIIIIIllIlIIIIlI(final double n, final double n2) {
        final double n3 = (n >= 0.0) ? n : (-n);
        return (n2 >= 0.0) ? n3 : (-n3);
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
                if (abs / abs3 < 1.110223024E-16) {
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
                    if (abs / abs3 < 1.110223024E-16) {
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
    
    static double llllIIIIlIIIlIlllIll(final double n, final double n2, final double[] array, final double[] array2, final int n3, final int n4) {
        double n5;
        double n6;
        double n7;
        if (n2 == 0.0) {
            n5 = 1.0;
            n6 = 0.0;
            n7 = n;
        }
        else if (n == 0.0) {
            n5 = 0.0;
            n6 = 1.0;
            n7 = n2;
        }
        else {
            double n8 = n;
            double n9 = n2;
            double n10 = llllIIIIlIIIlIlllIll(Math.abs(n8), Math.abs(n9));
            if (n10 >= 4.9947976805055876E145) {
                int n11 = 0;
                while (n10 >= 4.9947976805055876E145) {
                    ++n11;
                    n8 *= 2.002083095183101E-146;
                    n9 *= 2.002083095183101E-146;
                    n10 = llllIIIIlIIIlIlllIll(Math.abs(n8), Math.abs(n9));
                }
                n7 = Math.sqrt(n8 * n8 + n9 * n9);
                n5 = n8 / n7;
                n6 = n9 / n7;
                for (int i = 1; i <= n11; ++i) {
                    n7 *= 4.9947976805055876E145;
                }
            }
            else if (n10 <= 2.002083095183101E-146) {
                int n12 = 0;
                while (n10 <= 2.002083095183101E-146) {
                    ++n12;
                    n8 *= 4.9947976805055876E145;
                    n9 *= 4.9947976805055876E145;
                    n10 = llllIIIIlIIIlIlllIll(Math.abs(n8), Math.abs(n9));
                }
                n7 = Math.sqrt(n8 * n8 + n9 * n9);
                n5 = n8 / n7;
                n6 = n9 / n7;
                for (int j = 1; j <= n12; ++j) {
                    n7 *= 2.002083095183101E-146;
                }
            }
            else {
                n7 = Math.sqrt(n8 * n8 + n9 * n9);
                n5 = n8 / n7;
                n6 = n9 / n7;
            }
            if (Math.abs(n) > Math.abs(n2) && n5 < 0.0) {
                n5 = -n5;
                n6 = -n6;
                n7 = -n7;
            }
        }
        array[n3] = n6;
        array2[n3] = n5;
        return n7;
    }
    
    static void IlIlIlIlIlllllllllIl(final double[] array) {
        for (int i = 0; i < 3; ++i) {
            System.out.println(String.valueOf(array[i * 3 + 0]) + " " + array[i * 3 + 1] + " " + array[i * 3 + 2] + "\n");
        }
    }
    
    static void llIllIIIIIllIlIIIIlI(final double[] array) {
        System.out.println("det= " + (array[0] * array[4] * array[8] + array[1] * array[5] * array[6] + array[2] * array[3] * array[7] - array[2] * array[4] * array[6] - array[0] * array[5] * array[7] - array[1] * array[3] * array[8]));
    }
    
    static void IlIlIlIlIlllllllllIl(final double[] array, final double[] array2, final double[] array3) {
        final double[] array4 = { array[0] * array2[0] + array[1] * array2[3] + array[2] * array2[6], array[0] * array2[1] + array[1] * array2[4] + array[2] * array2[7], array[0] * array2[2] + array[1] * array2[5] + array[2] * array2[8], array[3] * array2[0] + array[4] * array2[3] + array[5] * array2[6], array[3] * array2[1] + array[4] * array2[4] + array[5] * array2[7], array[3] * array2[2] + array[4] * array2[5] + array[5] * array2[8], array[6] * array2[0] + array[7] * array2[3] + array[8] * array2[6], array[6] * array2[1] + array[7] * array2[4] + array[8] * array2[7], array[6] * array2[2] + array[7] * array2[5] + array[8] * array2[8] };
        for (int i = 0; i < 9; ++i) {
            array3[i] = array4[i];
        }
    }
    
    static void IlIlIlIlIlllllllllIl(final double[] array, final double[] array2) {
        array2[0] = array[0];
        array2[1] = array[3];
        array2[2] = array[6];
        array2[3] = array[1];
        array2[4] = array[4];
        array2[5] = array[7];
        array2[6] = array[2];
        array2[7] = array[5];
        array2[8] = array[8];
    }
    
    static double IlIIIlIlIIIllIlIlIIl(final double[] array) {
        if (array[0] > array[1]) {
            if (array[0] > array[2]) {
                return array[0];
            }
            return array[2];
        }
        else {
            if (array[1] > array[2]) {
                return array[1];
            }
            return array[2];
        }
    }
    
    private static final boolean IlIIIlIlIIIllIlIlIIl(final double n, final double n2) {
        if (n == n2) {
            return true;
        }
        final double abs = Math.abs(n - n2);
        final double abs2 = Math.abs(n);
        final double abs3 = Math.abs(n2);
        final double n3 = (abs2 >= abs3) ? abs2 : abs3;
        return abs < 1.0E-6 || abs / n3 < 1.0E-4;
    }
    
    public Object clone() {
        lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII;
        try {
            liiIlllIIIllIIIllIII = (lIIIlllIIIllIIIllIII)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
        return liiIlllIIIllIIIllIII;
    }
    
    public final double llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public final void lIIIIlIIIIIlllIllIII(final double ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public final double llIllIlIIIIllIlIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void lIIIlllIIIllIIIllIII(final double llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final double lIlIlIIIllIIllIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llIIlIIIlIIIllIlIIIl(final double ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final double IlIlIIIllIIllIlllllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llIllIlIIIIllIlIIllI(final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final double IIIIlllIIIIIIlIIIlll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void lIlIlIIIllIIllIIIllI(final double illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public final double llllIIllllIlIlIIIIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public final void IlIlIIIllIIllIlllllI(final double llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public final double IlIllIlIlIIIlIlIlIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public final void IIIIlllIIIIIIlIIIlll(final double liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final double IIlllIIlIllIllIlIIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIllllIlIlIIIIll(final double liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public final double lllIIIIlllllIlIIllIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IlIllIlIlIIIlIlIlIII(final double llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
}
