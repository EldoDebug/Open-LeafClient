package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class llIllIlIIIIllIlIIllI implements Serializable, Cloneable
{
    static final long llllIIIIlIIIlIlllIll = 8223903484171633710L;
    public double IlIlIlIlIlllllllllIl;
    public double llIllIIIIIllIlIIIIlI;
    public double IlIIIlIlIIIllIlIlIIl;
    public double IlIlIIIllIllIIIIIllI;
    public double IllIIlllIIIIlllIIlIl;
    public double llllIIIlIlllIlIIIIIl;
    public double lIIIIlIIIIIlllIllIII;
    public double lIIIlllIIIllIIIllIII;
    public double llIIlIIIlIIIllIlIIIl;
    public double llIllIlIIIIllIlIIllI;
    public double lIlIlIIIllIIllIIIllI;
    public double IlIlIIIllIIllIlllllI;
    public double IIIIlllIIIIIIlIIIlll;
    public double llllIIllllIlIlIIIIll;
    public double IlIllIlIlIIIlIlIlIII;
    public double IIlllIIlIllIllIlIIll;
    private static final double lllIIIIlllllIlIIllIl = 1.0E-10;
    
    public llIllIlIIIIllIlIIllI(final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI, final double illIIlllIIIIlllIIlIl, final double llllIIIlIlllIlIIIIIl, final double liiiIlIIIIIlllIllIII, final double liiIlllIIIllIIIllIII, final double llIIlIIIlIIIllIlIIIl, final double llIllIlIIIIllIlIIllI, final double lIlIlIIIllIIllIIIllI, final double ilIlIIIllIIllIlllllI, final double iiiIlllIIIIIIlIIIlll, final double llllIIllllIlIlIIIIll, final double ilIllIlIlIIIlIlIlIII, final double iIlllIIlIllIllIlIIll) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public llIllIlIIIIllIlIIllI(final double[] array) {
        this.IlIlIlIlIlllllllllIl = array[0];
        this.llIllIIIIIllIlIIIIlI = array[1];
        this.IlIIIlIlIIIllIlIlIIl = array[2];
        this.IlIlIIIllIllIIIIIllI = array[3];
        this.IllIIlllIIIIlllIIlIl = array[4];
        this.llllIIIlIlllIlIIIIIl = array[5];
        this.lIIIIlIIIIIlllIllIII = array[6];
        this.lIIIlllIIIllIIIllIII = array[7];
        this.llIIlIIIlIIIllIlIIIl = array[8];
        this.llIllIlIIIIllIlIIllI = array[9];
        this.lIlIlIIIllIIllIIIllI = array[10];
        this.IlIlIIIllIIllIlllllI = array[11];
        this.IIIIlllIIIIIIlIIIlll = array[12];
        this.llllIIllllIlIlIIIIll = array[13];
        this.IlIllIlIlIIIlIlIlIII = array[14];
        this.IIlllIIlIllIllIlIIll = array[15];
    }
    
    public llIllIlIIIIllIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double n) {
        this.IlIlIlIlIlllllllllIl = n * (1.0 - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.llIIlIIIlIIIllIlIIIl = n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl));
        this.llIllIIIIIllIlIIIIlI = n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.llllIIIlIlllIlIIIIIl = n * (1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.llIllIlIIIIllIlIIllI = n * (2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl));
        this.IlIIIlIlIIIllIlIlIIl = n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl));
        this.lIIIIlIIIIIlllIllIII = n * (2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl));
        this.lIlIlIIIllIIllIIIllI = n * (1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public llIllIlIIIIllIlIIllI(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double n) {
        this.IlIlIlIlIlllllllllIl = n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.llIIlIIIlIIIllIlIIIl = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
        this.llIllIIIIIllIlIIIIlI = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.llllIIIlIlllIlIIIIIl = n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.llIllIlIIIIllIlIIllI = n * (2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl));
        this.IlIIIlIlIIIllIlIlIIl = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
        this.lIIIIlIIIIIlllIllIII = n * (2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl));
        this.lIlIlIIIllIIllIIIllI = n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public llIllIlIIIIllIlIIllI(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public llIllIlIIIIllIlIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public llIllIlIIIIllIlIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double n) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * n;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * n;
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * n;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * n;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * n;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * n;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * n;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * n;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public llIllIlIIIIllIlIIllI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double n) {
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * n;
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * n;
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * n;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * n;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * n;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * n;
        this.llIllIlIIIIllIlIIllI = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * n;
        this.lIlIlIIIllIIllIIIllI = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * n;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public llIllIlIIIIllIlIIllI() {
        this.IlIlIlIlIlllllllllIl = 0.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = 0.0;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 0.0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.IlIlIlIlIlllllllllIl) + ", " + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ", " + this.IlIlIIIllIllIIIIIllI + "\n" + this.IllIIlllIIIIlllIIlIl + ", " + this.llllIIIlIlllIlIIIIIl + ", " + this.lIIIIlIIIIIlllIllIII + ", " + this.lIIIlllIIIllIIIllIII + "\n" + this.llIIlIIIlIIIllIlIIIl + ", " + this.llIllIlIIIIllIlIIllI + ", " + this.lIlIlIIIllIIllIIIllI + ", " + this.IlIlIIIllIIllIlllllI + "\n" + this.IIIIlllIIIIIIlIIIlll + ", " + this.llllIIllllIlIlIIIIll + ", " + this.IlIllIlIlIIIlIlIlIII + ", " + this.IIlllIIlIllIllIlIIll + "\n";
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = 1.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = 1.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = 1.0;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final int n2, final double n3) {
        Label_0350: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            this.IlIlIlIlIlllllllllIl = n3;
                            break Label_0350;
                        }
                        case 1: {
                            this.llIllIIIIIllIlIIIIlI = n3;
                            break Label_0350;
                        }
                        case 2: {
                            this.IlIIIlIlIIIllIlIlIIl = n3;
                            break Label_0350;
                        }
                        case 3: {
                            this.IlIlIIIllIllIIIIIllI = n3;
                            break Label_0350;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d0"));
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            this.IllIIlllIIIIlllIIlIl = n3;
                            break Label_0350;
                        }
                        case 1: {
                            this.llllIIIlIlllIlIIIIIl = n3;
                            break Label_0350;
                        }
                        case 2: {
                            this.lIIIIlIIIIIlllIllIII = n3;
                            break Label_0350;
                        }
                        case 3: {
                            this.lIIIlllIIIllIIIllIII = n3;
                            break Label_0350;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d0"));
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            this.llIIlIIIlIIIllIlIIIl = n3;
                            break Label_0350;
                        }
                        case 1: {
                            this.llIllIlIIIIllIlIIllI = n3;
                            break Label_0350;
                        }
                        case 2: {
                            this.lIlIlIIIllIIllIIIllI = n3;
                            break Label_0350;
                        }
                        case 3: {
                            this.IlIlIIIllIIllIlllllI = n3;
                            break Label_0350;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d0"));
                        }
                    }
                    break;
                }
                case 3: {
                    switch (n2) {
                        case 0: {
                            this.IIIIlllIIIIIIlIIIlll = n3;
                            break Label_0350;
                        }
                        case 1: {
                            this.llllIIllllIlIlIIIIll = n3;
                            break Label_0350;
                        }
                        case 2: {
                            this.IlIllIlIlIIIlIlIlIII = n3;
                            break Label_0350;
                        }
                        case 3: {
                            this.IIlllIIlIllIllIlIIll = n3;
                            break Label_0350;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d0"));
                        }
                    }
                    break;
                }
                default: {
                    throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d0"));
                }
            }
        }
    }
    
    public final double llllIIIIlIIIlIlllIll(final int n, final int n2) {
        Label_0255: {
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
                        case 3: {
                            return this.IlIlIIIllIllIIIIIllI;
                        }
                        default: {
                            break Label_0255;
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            return this.IllIIlllIIIIlllIIlIl;
                        }
                        case 1: {
                            return this.llllIIIlIlllIlIIIIIl;
                        }
                        case 2: {
                            return this.lIIIIlIIIIIlllIllIII;
                        }
                        case 3: {
                            return this.lIIIlllIIIllIIIllIII;
                        }
                        default: {
                            break Label_0255;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            return this.llIIlIIIlIIIllIlIIIl;
                        }
                        case 1: {
                            return this.llIllIlIIIIllIlIIllI;
                        }
                        case 2: {
                            return this.lIlIlIIIllIIllIIIllI;
                        }
                        case 3: {
                            return this.IlIlIIIllIIllIlllllI;
                        }
                        default: {
                            break Label_0255;
                        }
                    }
                    break;
                }
                case 3: {
                    switch (n2) {
                        case 0: {
                            return this.IIIIlllIIIIIIlIIIlll;
                        }
                        case 1: {
                            return this.llllIIllllIlIlIIIIll;
                        }
                        case 2: {
                            return this.IlIllIlIlIIIlIlIlIII;
                        }
                        case 3: {
                            return this.IIlllIIlIllIllIlIIll;
                        }
                        default: {
                            break Label_0255;
                        }
                    }
                    break;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d1"));
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        if (n == 0) {
            illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl;
            illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI;
            illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII = this.IlIIIlIlIIIllIlIlIIl;
            illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII = this.IlIlIIIllIllIIIIIllI;
        }
        else if (n == 1) {
            illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
            illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
            illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII;
            illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII;
        }
        else if (n == 2) {
            illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl = this.llIIlIIIlIIIllIlIIIl;
            illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl = this.llIllIlIIIIllIlIIllI;
            illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII = this.lIlIlIIIllIIllIIIllI;
            illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII = this.IlIlIIIllIIllIlllllI;
        }
        else {
            if (n != 3) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d2"));
            }
            illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl = this.IIIIlllIIIIIIlIIIlll;
            illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl = this.llllIIllllIlIlIIIIll;
            illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII = this.IlIllIlIlIIIlIlIlIII;
            illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII = this.IIlllIIlIllIllIlIIll;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final double[] array) {
        if (n == 0) {
            array[0] = this.IlIlIlIlIlllllllllIl;
            array[1] = this.llIllIIIIIllIlIIIIlI;
            array[2] = this.IlIIIlIlIIIllIlIlIIl;
            array[3] = this.IlIlIIIllIllIIIIIllI;
        }
        else if (n == 1) {
            array[0] = this.IllIIlllIIIIlllIIlIl;
            array[1] = this.llllIIIlIlllIlIIIIIl;
            array[2] = this.lIIIIlIIIIIlllIllIII;
            array[3] = this.lIIIlllIIIllIIIllIII;
        }
        else if (n == 2) {
            array[0] = this.llIIlIIIlIIIllIlIIIl;
            array[1] = this.llIllIlIIIIllIlIIllI;
            array[2] = this.lIlIlIIIllIIllIIIllI;
            array[3] = this.IlIlIIIllIIllIlllllI;
        }
        else {
            if (n != 3) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d2"));
            }
            array[0] = this.IIIIlllIIIIIIlIIIlll;
            array[1] = this.llllIIllllIlIlIIIIll;
            array[2] = this.IlIllIlIlIIIlIlIlIII;
            array[3] = this.IIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        if (n == 0) {
            illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl;
            illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl;
            illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII = this.llIIlIIIlIIIllIlIIIl;
            illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII = this.IIIIlllIIIIIIlIIIlll;
        }
        else if (n == 1) {
            illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl = this.llIllIIIIIllIlIIIIlI;
            illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
            illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII = this.llIllIlIIIIllIlIIllI;
            illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII = this.llllIIllllIlIlIIIIll;
        }
        else if (n == 2) {
            illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl = this.IlIIIlIlIIIllIlIlIIl;
            illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl = this.lIIIIlIIIIIlllIllIII;
            illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII = this.lIlIlIIIllIIllIIIllI;
            illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII = this.IlIllIlIlIIIlIlIlIII;
        }
        else {
            if (n != 3) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d3"));
            }
            illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl = this.IlIlIIIllIllIIIIIllI;
            illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl = this.lIIIlllIIIllIIIllIII;
            illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII = this.IlIlIIIllIIllIlllllI;
            illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII = this.IIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final double[] array) {
        if (n == 0) {
            array[0] = this.IlIlIlIlIlllllllllIl;
            array[1] = this.IllIIlllIIIIlllIIlIl;
            array[2] = this.llIIlIIIlIIIllIlIIIl;
            array[3] = this.IIIIlllIIIIIIlIIIlll;
        }
        else if (n == 1) {
            array[0] = this.llIllIIIIIllIlIIIIlI;
            array[1] = this.llllIIIlIlllIlIIIIIl;
            array[2] = this.llIllIlIIIIllIlIIllI;
            array[3] = this.llllIIllllIlIlIIIIll;
        }
        else if (n == 2) {
            array[0] = this.IlIIIlIlIIIllIlIlIIl;
            array[1] = this.lIIIIlIIIIIlllIllIII;
            array[2] = this.lIlIlIIIllIIllIIIllI;
            array[3] = this.IlIllIlIlIIIlIlIlIII;
        }
        else {
            if (n != 3) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d3"));
            }
            array[0] = this.IlIlIIIllIllIIIIIllI;
            array[1] = this.lIIIlllIIIllIIIllIII;
            array[2] = this.IlIlIIIllIIllIlllllI;
            array[3] = this.IIlllIIlIllIllIlIIll;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
        liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl = array[0];
        liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI = array[1];
        liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl = array[2];
        liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI = array[3];
        liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl = array[4];
        liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl = array[5];
        liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII = array[6];
        liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII = array[7];
        liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = array[8];
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = (float)array[0];
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI = (float)array[1];
        llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl = (float)array[2];
        llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI = (float)array[3];
        llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl = (float)array[4];
        llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = (float)array[5];
        llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII = (float)array[6];
        llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII = (float)array[7];
        llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = (float)array[8];
    }
    
    public final double llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl = array[0];
        liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI = array[1];
        liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl = array[2];
        liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI = array[3];
        liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl = array[4];
        liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl = array[5];
        liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII = array[6];
        liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII = array[7];
        liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = array[8];
        illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI;
        illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII;
        illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIIllIlllllI;
        return javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(array2);
    }
    
    public final double llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = (float)array[0];
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI = (float)array[1];
        llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl = (float)array[2];
        llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI = (float)array[3];
        llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl = (float)array[4];
        llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = (float)array[5];
        llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII = (float)array[6];
        llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII = (float)array[7];
        llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = (float)array[8];
        illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI;
        illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII;
        illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIIllIlllllI;
        return javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(array2);
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
        final double n = 0.25 * (1.0 + array[0] + array[4] + array[8]);
        if (((n < 0.0) ? (-n) : n) >= 1.0E-30) {
            ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII = (float)Math.sqrt(n);
            final double n2 = 0.25 / ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII;
            ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl = (float)((array[7] - array[5]) * n2);
            ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl = (float)((array[2] - array[6]) * n2);
            ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII = (float)((array[3] - array[1]) * n2);
            return;
        }
        ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII = 0.0f;
        final double n3 = -0.5 * (array[4] + array[8]);
        if (((n3 < 0.0) ? (-n3) : n3) >= 1.0E-30) {
            ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl = (float)Math.sqrt(n3);
            final double n4 = 0.5 / ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl;
            ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl = (float)(array[3] * n4);
            ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII = (float)(array[6] * n4);
            return;
        }
        ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl = 0.0f;
        final double n5 = 0.5 * (1.0 - array[8]);
        if (((n5 < 0.0) ? (-n5) : n5) >= 1.0E-30) {
            ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl = (float)Math.sqrt(n5);
            ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII = (float)(array[7] / (2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
            return;
        }
        ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl = 0.0f;
        ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
        final double n = 0.25 * (1.0 + array[0] + array[4] + array[8]);
        if (((n < 0.0) ? (-n) : n) >= 1.0E-30) {
            illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII = Math.sqrt(n);
            final double n2 = 0.25 / illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
            illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl = (array[7] - array[5]) * n2;
            illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl = (array[2] - array[6]) * n2;
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII = (array[3] - array[1]) * n2;
            return;
        }
        illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII = 0.0;
        final double n3 = -0.5 * (array[4] + array[8]);
        if (((n3 < 0.0) ? (-n3) : n3) >= 1.0E-30) {
            illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl = Math.sqrt(n3);
            final double n4 = 0.5 / illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
            illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl = array[3] * n4;
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII = array[6] * n4;
            return;
        }
        illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl = 0.0;
        final double n5 = 0.5 * (1.0 - array[8]);
        if (((n5 < 0.0) ? (-n5) : n5) >= 1.0E-30) {
            illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl = Math.sqrt(n5);
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII = array[7] / (2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
            return;
        }
        illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl = 0.0;
        illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI;
        illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII;
        illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIIllIlllllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = (float)this.IlIlIlIlIlllllllllIl;
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI = (float)this.llIllIIIIIllIlIIIIlI;
        llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl = (float)this.IlIIIlIlIIIllIlIlIIl;
        llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI = (float)this.IllIIlllIIIIlllIIlIl;
        llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl = (float)this.llllIIIlIlllIlIIIIIl;
        llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = (float)this.lIIIIlIIIIIlllIllIII;
        llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII = (float)this.llIIlIIIlIIIllIlIIIl;
        llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII = (float)this.llIllIlIIIIllIlIIllI;
        llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = (float)this.lIlIlIIIllIIllIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
        liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI = this.IllIIlllIIIIlllIIlIl;
        liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl = this.llllIIIlIlllIlIIIIIl;
        liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl = this.lIIIIlIIIIIlllIllIII;
        liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII = this.llIIlIIIlIIIllIlIIIl;
        liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII = this.llIllIlIIIIllIlIIllI;
        liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = this.lIlIlIIIllIIllIIIllI;
    }
    
    public final double IlIlIlIlIlllllllllIl() {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        return javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(array2);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.lIlIlIIIllIIllIIIllI = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n) {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
        this.IlIlIlIlIlllllllllIl = array[0] * n;
        this.llIllIIIIIllIlIIIIlI = array[1] * n;
        this.IlIIIlIlIIIllIlIlIIl = array[2] * n;
        this.IllIIlllIIIIlllIIlIl = array[3] * n;
        this.llllIIIlIlllIlIIIIIl = array[4] * n;
        this.lIIIIlIIIIIlllIllIII = array[5] * n;
        this.llIIlIIIlIIIllIlIIIl = array[6] * n;
        this.llIllIlIIIIllIlIIllI = array[7] * n;
        this.lIlIlIIIllIIllIIIllI = array[8] * n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final double n2, final double n3, final double n4, final double n5) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = n2;
                this.llIllIIIIIllIlIIIIlI = n3;
                this.IlIIIlIlIIIllIlIlIIl = n4;
                this.IlIlIIIllIllIIIIIllI = n5;
                break;
            }
            case 1: {
                this.IllIIlllIIIIlllIIlIl = n2;
                this.llllIIIlIlllIlIIIIIl = n3;
                this.lIIIIlIIIIIlllIllIII = n4;
                this.lIIIlllIIIllIIIllIII = n5;
                break;
            }
            case 2: {
                this.llIIlIIIlIIIllIlIIIl = n2;
                this.llIllIlIIIIllIlIIllI = n3;
                this.lIlIlIIIllIIllIIIllI = n4;
                this.IlIlIIIllIIllIlllllI = n5;
                break;
            }
            case 3: {
                this.IIIIlllIIIIIIlIIIlll = n2;
                this.llllIIllllIlIlIIIIll = n3;
                this.IlIllIlIlIIIlIlIlIII = n4;
                this.IIlllIIlIllIllIlIIll = n5;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d4"));
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl;
                this.llIllIIIIIllIlIIIIlI = illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl;
                this.IlIIIlIlIIIllIlIlIIl = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII;
                this.IlIlIIIllIllIIIIIllI = illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII;
                break;
            }
            case 1: {
                this.IllIIlllIIIIlllIIlIl = illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl;
                this.llllIIIlIlllIlIIIIIl = illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl;
                this.lIIIIlIIIIIlllIllIII = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII;
                this.lIIIlllIIIllIIIllIII = illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII;
                break;
            }
            case 2: {
                this.llIIlIIIlIIIllIlIIIl = illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl;
                this.llIllIlIIIIllIlIIllI = illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl;
                this.lIlIlIIIllIIllIIIllI = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII;
                this.IlIlIIIllIIllIlllllI = illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII;
                break;
            }
            case 3: {
                this.IIIIlllIIIIIIlIIIlll = illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl;
                this.llllIIllllIlIlIIIIll = illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl;
                this.IlIllIlIlIIIlIlIlIII = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII;
                this.IIlllIIlIllIllIlIIll = illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d4"));
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final double[] array) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = array[0];
                this.llIllIIIIIllIlIIIIlI = array[1];
                this.IlIIIlIlIIIllIlIlIIl = array[2];
                this.IlIlIIIllIllIIIIIllI = array[3];
                break;
            }
            case 1: {
                this.IllIIlllIIIIlllIIlIl = array[0];
                this.llllIIIlIlllIlIIIIIl = array[1];
                this.lIIIIlIIIIIlllIllIII = array[2];
                this.lIIIlllIIIllIIIllIII = array[3];
                break;
            }
            case 2: {
                this.llIIlIIIlIIIllIlIIIl = array[0];
                this.llIllIlIIIIllIlIIllI = array[1];
                this.lIlIlIIIllIIllIIIllI = array[2];
                this.IlIlIIIllIIllIlllllI = array[3];
                break;
            }
            case 3: {
                this.IIIIlllIIIIIIlIIIlll = array[0];
                this.llllIIllllIlIlIIIIll = array[1];
                this.IlIllIlIlIIIlIlIlIII = array[2];
                this.IIlllIIlIllIllIlIIll = array[3];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d4"));
            }
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final double n2, final double n3, final double n4, final double n5) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = n2;
                this.IllIIlllIIIIlllIIlIl = n3;
                this.llIIlIIIlIIIllIlIIIl = n4;
                this.IIIIlllIIIIIIlIIIlll = n5;
                break;
            }
            case 1: {
                this.llIllIIIIIllIlIIIIlI = n2;
                this.llllIIIlIlllIlIIIIIl = n3;
                this.llIllIlIIIIllIlIIllI = n4;
                this.llllIIllllIlIlIIIIll = n5;
                break;
            }
            case 2: {
                this.IlIIIlIlIIIllIlIlIIl = n2;
                this.lIIIIlIIIIIlllIllIII = n3;
                this.lIlIlIIIllIIllIIIllI = n4;
                this.IlIllIlIlIIIlIlIlIII = n5;
                break;
            }
            case 3: {
                this.IlIlIIIllIllIIIIIllI = n2;
                this.lIIIlllIIIllIIIllIII = n3;
                this.IlIlIIIllIIllIlllllI = n4;
                this.IIlllIIlIllIllIlIIll = n5;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d7"));
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl;
                this.IllIIlllIIIIlllIIlIl = illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl;
                this.llIIlIIIlIIIllIlIIIl = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII;
                this.IIIIlllIIIIIIlIIIlll = illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII;
                break;
            }
            case 1: {
                this.llIllIIIIIllIlIIIIlI = illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl;
                this.llllIIIlIlllIlIIIIIl = illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl;
                this.llIllIlIIIIllIlIIllI = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII;
                this.llllIIllllIlIlIIIIll = illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII;
                break;
            }
            case 2: {
                this.IlIIIlIlIIIllIlIlIIl = illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl;
                this.lIIIIlIIIIIlllIllIII = illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl;
                this.lIlIlIIIllIIllIIIllI = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII;
                this.IlIllIlIlIIIlIlIlIII = illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII;
                break;
            }
            case 3: {
                this.IlIlIIIllIllIIIIIllI = illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl;
                this.lIIIlllIIIllIIIllIII = illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl;
                this.IlIlIIIllIIllIlllllI = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII;
                this.IIlllIIlIllIllIlIIll = illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d7"));
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final double[] array) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = array[0];
                this.IllIIlllIIIIlllIIlIl = array[1];
                this.llIIlIIIlIIIllIlIIIl = array[2];
                this.IIIIlllIIIIIIlIIIlll = array[3];
                break;
            }
            case 1: {
                this.llIllIIIIIllIlIIIIlI = array[0];
                this.llllIIIlIlllIlIIIIIl = array[1];
                this.llIllIlIIIIllIlIIllI = array[2];
                this.llllIIllllIlIlIIIIll = array[3];
                break;
            }
            case 2: {
                this.IlIIIlIlIIIllIlIlIIl = array[0];
                this.lIIIIlIIIIIlllIllIII = array[1];
                this.lIlIlIIIllIIllIIIllI = array[2];
                this.IlIllIlIlIIIlIlIlIII = array[3];
                break;
            }
            case 3: {
                this.IlIlIIIllIllIIIIIllI = array[0];
                this.lIIIlllIIIllIIIllIII = array[1];
                this.IlIlIIIllIIllIlllllI = array[2];
                this.IIlllIIlIllIllIlIIll = array[3];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d7"));
            }
        }
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
        this.llIllIlIIIIllIlIIllI += n;
        this.lIlIlIIIllIIllIIIllI += n;
        this.IlIlIIIllIIllIlllllI += n;
        this.IIIIlllIIIIIIlIIIlll += n;
        this.llllIIllllIlIlIIIIll += n;
        this.IlIllIlIlIIIlIlIlIII += n;
        this.IIlllIIlIllIllIlIIll += n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl + n;
        this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI + n;
        this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl + n;
        this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI + n;
        this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl + n;
        this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + n;
        this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII + n;
        this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII + n;
        this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl + n;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI + n;
        this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI + n;
        this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI + n;
        this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll + n;
        this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll + n;
        this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII + n;
        this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll + n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI2) {
        this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll + llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IlIlIlIlIlllllllllIl += llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI += llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI += llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl += llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl += llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII += llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII += llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl += llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI += llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI += llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI += llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll += llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll += llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII += llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll += llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI2) {
        this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl - llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI - llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl - llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI - llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl - llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl - llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII - llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII - llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl - llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI - llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI - llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI - llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll - llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll - llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII - llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll - llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IlIlIlIlIlllllllllIl -= llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI -= llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI -= llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl -= llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl -= llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII -= llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII -= llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl -= llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI -= llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI -= llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI -= llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll -= llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll -= llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII -= llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll -= llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        final double illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
        this.IllIIlllIIIIlllIIlIl = this.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl;
        final double llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = this.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl;
        final double iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
        this.IIIIlllIIIIIIlIIIlll = this.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll;
        final double llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI;
        this.llIllIlIIIIllIlIIllI = this.lIIIIlIIIIIlllIllIII;
        this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI;
        final double llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
        this.llllIIllllIlIlIIIIll = this.lIIIlllIIIllIIIllIII;
        this.lIIIlllIIIllIIIllIII = llllIIllllIlIlIIIIll;
        final double ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII;
        this.IlIllIlIlIIIlIlIlIII = this.IlIlIIIllIIllIlllllI;
        this.IlIlIIIllIIllIlllllI = ilIllIlIlIIIlIlIlIII;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        if (this != llIllIlIIIIllIlIIllI) {
            this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
            this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
            this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
            this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
            this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
            this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
            this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
            this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
            this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
            this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
            this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
            this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
        }
        else {
            this.llIllIIIIIllIlIIIIlI();
        }
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
        this.llIllIlIIIIllIlIIllI = array[9];
        this.lIlIlIIIllIIllIIIllI = array[10];
        this.IlIlIIIllIIllIlllllI = array[11];
        this.IIIIlllIIIIIIlIIIlll = array[12];
        this.llllIIllllIlIlIIIIll = array[13];
        this.IlIllIlIlIIIlIlIlIII = array[14];
        this.IIlllIIlIllIllIlIIll = array[15];
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.lIlIlIIIllIIllIIIllI = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this.IlIlIlIlIlllllllllIl = 1.0 - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
        this.IllIIlllIIIIlllIIlIl = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.llIIlIIIlIIIllIlIIIl = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.llllIIIlIlllIlIIIIIl = 1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI = 2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl);
        this.IlIIIlIlIIIllIlIlIIl = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
        this.lIIIIlIIIIIlllIllIII = 2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl);
        this.lIlIlIIIllIIllIIIllI = 1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final double sqrt = Math.sqrt(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        if (sqrt < 1.0E-10) {
            this.IlIlIlIlIlllllllllIl = 1.0;
            this.llIllIIIIIllIlIIIIlI = 0.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 1.0;
            this.lIIIIlIIIIIlllIllIII = 0.0;
            this.llIIlIIIlIIIllIlIIIl = 0.0;
            this.llIllIlIIIIllIlIIllI = 0.0;
            this.lIlIlIIIllIIllIIIllI = 1.0;
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
            this.IllIIlllIIIIlllIIlIl = n5 * n7 + sin * n4;
            this.llllIIIlIlllIlIIIIIl = n5 * n3 * n3 + cos;
            this.lIIIIlIIIIIlllIllIII = n5 * n8 - sin * n2;
            this.llIIlIIIlIIIllIlIIIl = n5 * n6 - sin * n3;
            this.llIllIlIIIIllIlIIllI = n5 * n8 + sin * n2;
            this.lIlIlIIIllIIllIIIllI = n5 * n4 * n4 + cos;
        }
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        this.IlIlIlIlIlllllllllIl = 1.0 - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        this.IllIIlllIIIIlllIIlIl = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.llIIlIIIlIIIllIlIIIl = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.llllIIIlIlllIlIIIIIl = 1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI = 2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl);
        this.IlIIIlIlIIIllIlIlIIl = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.lIIIIlIIIIIlllIllIII = 2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl);
        this.lIlIlIIIllIIllIIIllI = 1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final double sqrt = Math.sqrt(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI + ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        if (sqrt < 1.0E-10) {
            this.IlIlIlIlIlllllllllIl = 1.0;
            this.llIllIIIIIllIlIIIIlI = 0.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 1.0;
            this.lIIIIlIIIIIlllIllIII = 0.0;
            this.llIIlIIIlIIIllIlIIIl = 0.0;
            this.llIllIlIIIIllIlIIllI = 0.0;
            this.lIlIlIIIllIIllIIIllI = 1.0;
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
            this.IllIIlllIIIIlllIIlIl = n5 * n7 + sin * n4;
            this.llllIIIlIlllIlIIIIIl = n5 * n3 * n3 + cos;
            this.lIIIIlIIIIIlllIllIII = n5 * n8 - sin * n2;
            this.llIIlIIIlIIIllIlIIIl = n5 * n6 - sin * n3;
            this.llIllIlIIIIllIlIIllI = n5 * n8 + sin * n2;
            this.lIlIlIIIllIIllIIIllI = n5 * n4 * n4 + cos;
        }
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double n) {
        this.IlIlIlIlIlllllllllIl = n * (1.0 - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.llIIlIIIlIIIllIlIIIl = n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl));
        this.llIllIIIIIllIlIIIIlI = n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.llllIIIlIlllIlIIIIIl = n * (1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.llIllIlIIIIllIlIIllI = n * (2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl));
        this.IlIIIlIlIIIllIlIlIIl = n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl));
        this.lIIIIlIIIIIlllIllIII = n * (2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl));
        this.lIlIlIIIllIIllIIIllI = n * (1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double n) {
        this.IlIlIlIlIlllllllllIl = n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.llIIlIIIlIIIllIlIIIl = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
        this.llIllIIIIIllIlIIIIlI = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.llllIIIlIlllIlIIIIIl = n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.llIllIlIIIIllIlIIllI = n * (2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl));
        this.IlIIIlIlIIIllIlIlIIl = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
        this.lIIIIlIIIIIlllIllIII = n * (2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl));
        this.lIlIlIIIllIIllIIIllI = n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final float n) {
        this.IlIlIlIlIlllllllllIl = n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.llIIlIIIlIIIllIlIIIl = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
        this.llIllIIIIIllIlIIIIlI = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.llllIIIlIlllIlIIIIIl = n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.llIllIlIIIIllIlIIllI = n * (2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl));
        this.IlIIIlIlIIIllIlIlIIl = n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
        this.lIIIIlIIIIIlllIllIII = n * (2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl));
        this.lIlIlIIIllIIllIIIllI = n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IllIIlllIIIIlllIIlIl(llIllIlIIIIllIlIIllI);
    }
    
    public final void IlIIIlIlIIIllIlIlIIl() {
        this.IllIIlllIIIIlllIIlIl(this);
    }
    
    final void IllIIlllIIIIlllIIlIl(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final double[] array = new double[16];
        final int[] array2 = new int[4];
        final double[] array3 = { llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl, llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI, llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl, llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI, llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl, llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl, llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII, llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII, llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl, llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI, llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI, llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI, llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll, llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll, llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII, llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll };
        if (!llllIIIIlIIIlIlllIll(array3, array2)) {
            throw new IIIlIIlIIIIlllIlllII(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d10"));
        }
        for (int i = 0; i < 16; ++i) {
            array[i] = 0.0;
        }
        array[5] = (array[0] = 1.0);
        array[15] = (array[10] = 1.0);
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
        this.llIllIlIIIIllIlIIllI = array[9];
        this.lIlIlIIIllIIllIIIllI = array[10];
        this.IlIlIIIllIIllIlllllI = array[11];
        this.IIIIlllIIIIIIlIIIlll = array[12];
        this.llllIIllllIlIlIIIIll = array[13];
        this.IlIllIlIlIIIlIlIlIII = array[14];
        this.IIlllIIlIllIllIlIIll = array[15];
    }
    
    static boolean llllIIIIlIIIlIlllIll(final double[] array, final int[] array2) {
        final double[] array3 = new double[4];
        int n = 0;
        int n2 = 0;
        int n3 = 4;
        while (n3-- != 0) {
            double n4 = 0.0;
            int n5 = 4;
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
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < i; ++j) {
                final int n7 = n6 + 4 * j + i;
                double n8 = array[n7];
                int n9 = j;
                int n10 = n6 + 4 * j;
                int n11 = n6 + i;
                while (n9-- != 0) {
                    n8 -= array[n10] * array[n11];
                    ++n10;
                    n11 += 4;
                }
                array[n7] = n8;
            }
            double n12 = 0.0;
            int n13 = -1;
            for (int k = i; k < 4; ++k) {
                final int n14 = n6 + 4 * k + i;
                double n15 = array[n14];
                int n16 = i;
                int n17 = n6 + 4 * k;
                int n18 = n6 + i;
                while (n16-- != 0) {
                    n15 -= array[n17] * array[n18];
                    ++n17;
                    n18 += 4;
                }
                array[n14] = n15;
                final double n19;
                if ((n19 = array3[k] * Math.abs(n15)) >= n12) {
                    n12 = n19;
                    n13 = k;
                }
            }
            if (n13 < 0) {
                throw new RuntimeException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4d11"));
            }
            if (i != n13) {
                int n20 = 4;
                int n21 = n6 + 4 * n13;
                int n22 = n6 + 4 * i;
                while (n20-- != 0) {
                    final double n23 = array[n21];
                    array[n21++] = array[n22];
                    array[n22++] = n23;
                }
                array3[n13] = array3[i];
            }
            array2[i] = n13;
            if (array[n6 + 4 * i + i] == 0.0) {
                return false;
            }
            if (i != 3) {
                final double n24 = 1.0 / array[n6 + 4 * i + i];
                int n25 = n6 + 4 * (i + 1) + i;
                int n26 = 3 - i;
                while (n26-- != 0) {
                    final int n27 = n25;
                    array[n27] *= n24;
                    n25 += 4;
                }
            }
        }
        return true;
    }
    
    static void llllIIIIlIIIlIlllIll(final double[] array, final int[] array2, final double[] array3) {
        final int n = 0;
        for (int i = 0; i < 4; ++i) {
            final int n2 = i;
            int n3 = -1;
            for (int j = 0; j < 4; ++j) {
                final int n4 = array2[n + j];
                double n5 = array3[n2 + 4 * n4];
                array3[n2 + 4 * n4] = array3[n2 + 4 * j];
                if (n3 >= 0) {
                    final int n6 = j * 4;
                    for (int k = n3; k <= j - 1; ++k) {
                        n5 -= array[n6 + k] * array3[n2 + 4 * k];
                    }
                }
                else if (n5 != 0.0) {
                    n3 = j;
                }
                array3[n2 + 4 * j] = n5;
            }
            int n7 = 12;
            final int n8 = n2 + 12;
            array3[n8] /= array[n7 + 3];
            n7 -= 4;
            array3[n2 + 8] = (array3[n2 + 8] - array[n7 + 3] * array3[n2 + 12]) / array[n7 + 2];
            n7 -= 4;
            array3[n2 + 4] = (array3[n2 + 4] - array[n7 + 2] * array3[n2 + 8] - array[n7 + 3] * array3[n2 + 12]) / array[n7 + 1];
            n7 -= 4;
            array3[n2 + 0] = (array3[n2 + 0] - array[n7 + 1] * array3[n2 + 4] - array[n7 + 2] * array3[n2 + 8] - array[n7 + 3] * array3[n2 + 12]) / array[n7 + 0];
        }
    }
    
    public final double IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl * (this.llllIIIlIlllIlIIIIIl * this.lIlIlIIIllIIllIIIllI * this.IIlllIIlIllIllIlIIll + this.lIIIIlIIIIIlllIllIII * this.IlIlIIIllIIllIlllllI * this.llllIIllllIlIlIIIIll + this.lIIIlllIIIllIIIllIII * this.llIllIlIIIIllIlIIllI * this.IlIllIlIlIIIlIlIlIII - this.lIIIlllIIIllIIIllIII * this.lIlIlIIIllIIllIIIllI * this.llllIIllllIlIlIIIIll - this.llllIIIlIlllIlIIIIIl * this.IlIlIIIllIIllIlllllI * this.IlIllIlIlIIIlIlIlIII - this.lIIIIlIIIIIlllIllIII * this.llIllIlIIIIllIlIIllI * this.IIlllIIlIllIllIlIIll) - this.llIllIIIIIllIlIIIIlI * (this.IllIIlllIIIIlllIIlIl * this.lIlIlIIIllIIllIIIllI * this.IIlllIIlIllIllIlIIll + this.lIIIIlIIIIIlllIllIII * this.IlIlIIIllIIllIlllllI * this.IIIIlllIIIIIIlIIIlll + this.lIIIlllIIIllIIIllIII * this.llIIlIIIlIIIllIlIIIl * this.IlIllIlIlIIIlIlIlIII - this.lIIIlllIIIllIIIllIII * this.lIlIlIIIllIIllIIIllI * this.IIIIlllIIIIIIlIIIlll - this.IllIIlllIIIIlllIIlIl * this.IlIlIIIllIIllIlllllI * this.IlIllIlIlIIIlIlIlIII - this.lIIIIlIIIIIlllIllIII * this.llIIlIIIlIIIllIlIIIl * this.IIlllIIlIllIllIlIIll) + this.IlIIIlIlIIIllIlIlIIl * (this.IllIIlllIIIIlllIIlIl * this.llIllIlIIIIllIlIIllI * this.IIlllIIlIllIllIlIIll + this.llllIIIlIlllIlIIIIIl * this.IlIlIIIllIIllIlllllI * this.IIIIlllIIIIIIlIIIlll + this.lIIIlllIIIllIIIllIII * this.llIIlIIIlIIIllIlIIIl * this.llllIIllllIlIlIIIIll - this.lIIIlllIIIllIIIllIII * this.llIllIlIIIIllIlIIllI * this.IIIIlllIIIIIIlIIIlll - this.IllIIlllIIIIlllIIlIl * this.IlIlIIIllIIllIlllllI * this.llllIIllllIlIlIIIIll - this.llllIIIlIlllIlIIIIIl * this.llIIlIIIlIIIllIlIIIl * this.IIlllIIlIllIllIlIIll) - this.IlIlIIIllIllIIIIIllI * (this.IllIIlllIIIIlllIIlIl * this.llIllIlIIIIllIlIIllI * this.IlIllIlIlIIIlIlIlIII + this.llllIIIlIlllIlIIIIIl * this.lIlIlIIIllIIllIIIllI * this.IIIIlllIIIIIIlIIIlll + this.lIIIIlIIIIIlllIllIII * this.llIIlIIIlIIIllIlIIIl * this.llllIIllllIlIlIIIIll - this.lIIIIlIIIIIlllIllIII * this.llIllIlIIIIllIlIIllI * this.IIIIlllIIIIIIlIIIlll - this.IllIIlllIIIIlllIIlIl * this.lIlIlIIIllIIllIIIllI * this.llllIIllllIlIlIIIIll - this.llllIIIlIlllIlIIIIIl * this.llIIlIIIlIIIllIlIIIl * this.IlIllIlIlIIIlIlIlIII);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final double lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        this.IlIlIlIlIlllllllllIl = 1.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = 1.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = 1.0;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double lIlIlIIIllIIllIIIllI, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI * illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final float n) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * n;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * n;
        this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * n;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * n;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * n;
        this.lIIIlllIIIllIIIllIII = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * n;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * n;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * n;
        this.IlIlIIIllIIllIlllllI = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double n) {
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * n;
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * n;
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * n;
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * n;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * n;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * n;
        this.llIllIlIIIIllIlIIllI = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * n;
        this.lIlIlIIIllIIllIIIllI = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * n;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.IlIlIlIlIlllllllllIl = 1.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = cos;
        this.lIIIIlIIIIIlllIllIII = -sin;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = sin;
        this.lIlIlIIIllIIllIIIllI = cos;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.IlIlIlIlIlllllllllIl = cos;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = sin;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = 1.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = -sin;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = cos;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.IlIlIlIlIlllllllllIl = cos;
        this.llIllIIIIIllIlIIIIlI = -sin;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = sin;
        this.llllIIIlIlllIlIIIIIl = cos;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = 1.0;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 1.0;
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
        this.llIllIlIIIIllIlIIllI *= n;
        this.lIlIlIIIllIIllIIIllI *= n;
        this.IlIlIIIllIIllIlllllI *= n;
        this.IIIIlllIIIIIIlIIIlll *= n;
        this.llllIIllllIlIlIIIIll *= n;
        this.IlIllIlIlIIIlIlIlIII *= n;
        this.IIlllIIlIllIllIlIIll *= n;
    }
    
    public final void IlIlIlIlIlllllllllIl(final double n, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * n;
        this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * n;
        this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * n;
        this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * n;
        this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * n;
        this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * n;
        this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * n;
        this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * n;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * n;
        this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * n;
        this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * n;
        this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * n;
        this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * n;
        this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * n;
        this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * n;
    }
    
    public final void llllIIIlIlllIlIIIIIl(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final double ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl + this.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl + this.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        final double llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI + this.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        final double ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl + this.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII + this.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI + this.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        final double ilIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI + this.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI + this.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
        final double illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl + this.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl + this.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl + this.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        final double llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI + this.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        final double liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl + this.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII + this.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI + this.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        final double liiIlllIIIllIIIllIII = this.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII + this.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI + this.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
        final double llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl + this.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl + this.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl + this.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        final double llIllIlIIIIllIlIIllI2 = this.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + this.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI + this.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        final double lIlIlIIIllIIllIIIllI = this.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl + this.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII + this.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI + this.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        final double ilIlIIIllIIllIlllllI = this.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI + this.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII + this.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI + this.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
        final double iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl + this.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl + this.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl + this.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        final double llllIIllllIlIlIIIIll = this.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI + this.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + this.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI + this.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        final double ilIllIlIlIIIlIlIlIII = this.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl + this.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII + this.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI + this.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        final double iIlllIIlIllIllIlIIll = this.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI + this.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII + this.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI + this.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI2;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI2) {
        if (this != llIllIlIIIIllIlIIllI && this != llIllIlIIIIllIlIIllI2) {
            this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
        }
        else {
            final double ilIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            final double llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            final double ilIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            final double ilIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double illIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            final double llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            final double liiiIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            final double liiIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            final double llIllIlIIIIllIlIIllI3 = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            final double lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            final double ilIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double iiiIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            final double llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            final double ilIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            final double iIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI3;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI2) {
        if (this != llIllIlIIIIllIlIIllI && this != llIllIlIIIIllIlIIllI2) {
            this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
        }
        else {
            final double ilIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            final double llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            final double ilIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            final double ilIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double illIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            final double llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            final double liiiIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            final double liiIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            final double llIllIlIIIIllIlIIllI3 = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            final double lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            final double ilIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double iiiIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            final double llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            final double ilIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            final double iIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI3;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI2) {
        if (this != llIllIlIIIIllIlIIllI && this != llIllIlIIIIllIlIIllI2) {
            this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
        }
        else {
            final double ilIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            final double llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            final double ilIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            final double ilIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double illIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            final double llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            final double liiiIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            final double liiIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            final double llIllIlIIIIllIlIIllI3 = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            final double lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            final double ilIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double iiiIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI;
            final double llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII;
            final double ilIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI;
            final double iIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI3;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI2) {
        if (this != llIllIlIIIIllIlIIllI && this != llIllIlIIIIllIlIIllI2) {
            this.IlIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            this.IlIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IllIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IlIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IIIIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
        }
        else {
            final double ilIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            final double llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            final double ilIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            final double ilIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double illIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            final double llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            final double liiiIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            final double liiIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            final double llIllIlIIIIllIlIIllI3 = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            final double lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            final double ilIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            final double iiiIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.IllIIlllIIIIlllIIlIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.llIIlIIIlIIIllIlIIIl + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIIIlllIIIIIIlIIIlll;
            final double llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.llIllIlIIIIllIlIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.llllIIllllIlIlIIIIll;
            final double ilIllIlIlIIIlIlIlIII = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIIIlIlIIIllIlIlIIl + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.lIIIIlIIIIIlllIllIII + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IlIllIlIlIIIlIlIlIII;
            final double iIlllIIlIllIllIlIIll = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIllIIIIIllI + llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII * llIllIlIIIIllIlIIllI2.lIIIlllIIIllIIIllIII + llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI * llIllIlIIIIllIlIIllI2.IlIlIIIllIIllIlllllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll * llIllIlIIIIllIlIIllI2.IIlllIIlIllIllIlIIll;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI3;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        }
    }
    
    public boolean lIIIIlIIIIIlllIllIII(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        try {
            return this.IlIlIlIlIlllllllllIl == llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl == llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl && this.llIllIlIIIIllIlIIllI == llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI && this.lIlIlIIIllIIllIIIllI == llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI && this.IlIlIIIllIIllIlllllI == llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI && this.IIIIlllIIIIIIlIIIlll == llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll && this.llllIIllllIlIlIIIIll == llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll && this.IlIllIlIlIIIlIlIlIII == llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII && this.IIlllIIlIllIllIlIIll == llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = (llIllIlIIIIllIlIIllI)o;
            return this.IlIlIlIlIlllllllllIl == llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl == llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl && this.llIllIlIIIIllIlIIllI == llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI && this.lIlIlIIIllIIllIIIllI == llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI && this.IlIlIIIllIIllIlllllI == llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI && this.IIIIlllIIIIIIlIIIlll == llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll && this.llllIIllllIlIlIIIIll == llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll && this.IlIllIlIlIIIlIlIlIII == llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII && this.IIlllIIlIllIllIlIIll == llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
        }
        catch (ClassCastException ex) {
            return false;
        }
        catch (NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final float n) {
        return this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, (double)n);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final double n) {
        final double n2 = this.IlIlIlIlIlllllllllIl - llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        if (((n2 < 0.0) ? (-n2) : n2) > n) {
            return false;
        }
        final double n3 = this.llIllIIIIIllIlIIIIlI - llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
        if (((n3 < 0.0) ? (-n3) : n3) > n) {
            return false;
        }
        final double n4 = this.IlIIIlIlIIIllIlIlIIl - llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
        if (((n4 < 0.0) ? (-n4) : n4) > n) {
            return false;
        }
        final double n5 = this.IlIlIIIllIllIIIIIllI - llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        if (((n5 < 0.0) ? (-n5) : n5) > n) {
            return false;
        }
        final double n6 = this.IllIIlllIIIIlllIIlIl - llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        if (((n6 < 0.0) ? (-n6) : n6) > n) {
            return false;
        }
        final double n7 = this.llllIIIlIlllIlIIIIIl - llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        if (((n7 < 0.0) ? (-n7) : n7) > n) {
            return false;
        }
        final double n8 = this.lIIIIlIIIIIlllIllIII - llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
        if (((n8 < 0.0) ? (-n8) : n8) > n) {
            return false;
        }
        final double n9 = this.lIIIlllIIIllIIIllIII - llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
        if (((n9 < 0.0) ? (-n9) : n9) > n) {
            return false;
        }
        final double n10 = this.llIIlIIIlIIIllIlIIIl - llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
        if (((n10 < 0.0) ? (-n10) : n10) > n) {
            return false;
        }
        final double n11 = this.llIllIlIIIIllIlIIllI - llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
        if (((n11 < 0.0) ? (-n11) : n11) > n) {
            return false;
        }
        final double n12 = this.lIlIlIIIllIIllIIIllI - llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
        if (((n12 < 0.0) ? (-n12) : n12) > n) {
            return false;
        }
        final double n13 = this.IlIlIIIllIIllIlllllI - llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        if (((n13 < 0.0) ? (-n13) : n13) > n) {
            return false;
        }
        final double n14 = this.IIIIlllIIIIIIlIIIlll - llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        if (((n14 < 0.0) ? (-n14) : n14) > n) {
            return false;
        }
        final double n15 = this.llllIIllllIlIlIIIIll - llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        if (((n15 < 0.0) ? (-n15) : n15) > n) {
            return false;
        }
        final double n16 = this.IlIllIlIlIIIlIlIlIII - llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        if (((n16 < 0.0) ? (-n16) : n16) > n) {
            return false;
        }
        final double n17 = this.IIlllIIlIllIllIlIIll - llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
        return ((n17 < 0.0) ? (-n17) : n17) <= n;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.IlIlIlIlIlllllllllIl), this.llIllIIIIIllIlIIIIlI), this.IlIIIlIlIIIllIlIlIIl), this.IlIlIIIllIllIIIIIllI), this.IllIIlllIIIIlllIIlIl), this.llllIIIlIlllIlIIIIIl), this.lIIIIlIIIIIlllIllIII), this.lIIIlllIIIllIIIllIII), this.llIIlIIIlIIIllIlIIIl), this.llIllIlIIIIllIlIIllI), this.lIlIlIIIllIIllIIIllI), this.IlIlIIIllIIllIlllllI), this.IIIIlllIIIIIIlIIIlll), this.llllIIllllIlIlIIIIll), this.IlIllIlIlIIIlIlIlIII), this.IIlllIIlIllIllIlIIll));
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl2) {
        final double illIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + this.llIllIIIIIllIlIIIIlI * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIllIIIIIllI * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        final double llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        final double liiiIlIIIIIlllIllIII = this.llIIlIIIlIIIllIlIIIl * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + this.llIllIlIIIIllIlIIllI * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + this.lIlIlIIIllIIllIIIllI * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIIllIlllllI * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        iiiiIllIIIIlIIIIllIl2.lIIIlllIIIllIIIllIII = this.IIIIlllIIIIIIlIIIlll * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + this.llllIIllllIlIlIIIIll * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + this.IlIllIlIlIIIlIlIlIII * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + this.IIlllIIlIllIllIlIIll * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        iiiiIllIIIIlIIIIllIl2.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        iiiiIllIIIIlIIIIllIl2.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        iiiiIllIIIIlIIIIllIl2.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        final double illIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + this.llIllIIIIIllIlIIIIlI * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIllIIIIIllI * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        final double llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        final double liiiIlIIIIIlllIllIII = this.llIIlIIIlIIIllIlIIIl * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + this.llIllIlIIIIllIlIIllI * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + this.lIlIlIIIllIIllIIIllI * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIIllIlllllI * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII = this.IIIIlllIIIIIIlIIIlll * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + this.llllIIllllIlIlIIIIll * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + this.IlIllIlIlIIIlIlIlIII * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + this.IIlllIIlIllIllIlIIll * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI2) {
        final float illIIlllIIIIlllIIlIl = (float)(this.IlIlIlIlIlllllllllIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llIllIIIIIllIlIIIIlI * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIllIIIIIllI * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
        final float llllIIIlIlllIlIIIIIl = (float)(this.IllIIlllIIIIlllIIlIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
        final float liiiIlIIIIIlllIllIII = (float)(this.llIIlIIIlIIIllIlIIIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llIllIlIIIIllIlIIllI * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.lIlIlIIIllIIllIIIllI * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIIllIlllllI * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
        iiiiiiiiIlllIllIlIlI2.lIIIlllIIIllIIIllIII = (float)(this.IIIIlllIIIIIIlIIIlll * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llllIIllllIlIlIIIIll * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.IlIllIlIlIIIlIlIlIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IIlllIIlIllIllIlIIll * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
        iiiiiiiiIlllIllIlIlI2.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        iiiiiiiiIlllIllIlIlI2.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        iiiiiiiiIlllIllIlIlI2.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        final float illIIlllIIIIlllIIlIl = (float)(this.IlIlIlIlIlllllllllIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llIllIIIIIllIlIIIIlI * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIllIIIIIllI * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
        final float llllIIIlIlllIlIIIIIl = (float)(this.IllIIlllIIIIlllIIlIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
        final float liiiIlIIIIIlllIllIII = (float)(this.llIIlIIIlIIIllIlIIIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llIllIlIIIIllIlIIllI * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.lIlIlIIIllIIllIIIllI * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIIllIlllllI * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
        iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII = (float)(this.IIIIlllIIIIIIlIIIlll * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llllIIllllIlIlIIIIll * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.IlIllIlIlIIIlIlIlIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IIlllIIlIllIllIlIIll * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
        iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll2) {
        final double llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIllIIIIIllI;
        final double ilIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl * illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII;
        illlIIlIllIllIlIIll2.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl * illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIIllIlllllI;
        illlIIlIllIllIlIIll2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        illlIIlIllIllIlIIll2.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        final double llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIllIIIIIllI;
        final double ilIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl * illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII;
        illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl * illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIIllIlllllI;
        illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        final float llIllIIIIIllIlIIIIlI = (float)(this.IlIlIlIlIlllllllllIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIllIIIIIllI);
        final float ilIIIlIlIIIllIlIlIIl = (float)(this.IllIIlllIIIIlllIIlIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII);
        lllIIIIlllllIlIIllIl2.IlIlIIIllIllIIIIIllI = (float)(this.llIIlIIIlIIIllIlIIIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIIllIlllllI);
        lllIIIIlllllIlIIllIl2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        lllIIIIlllllIlIIllIl2.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final float llIllIIIIIllIlIIIIlI = (float)(this.IlIlIlIlIlllllllllIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIllIIIIIllI);
        final float ilIIIlIlIIIllIlIlIIl = (float)(this.IllIIlllIIIIlllIIlIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII);
        lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI = (float)(this.llIIlIIIlIIIllIlIIIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIIllIlllllI);
        lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII2) {
        final double llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        final double ilIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        illIllIIIIlIIlIlllII2.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        illIllIIIIlIIlIlllII2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        illIllIIIIlIIlIlllII2.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        final double llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        final double ilIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll2) {
        final float llIllIIIIIllIlIIIIlI = (float)(this.IlIlIlIlIlllllllllIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI);
        final float ilIIIlIlIIIllIlIlIIl = (float)(this.IllIIlllIIIIlllIIlIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI);
        ilIllllIIlIIlIlIlIll2.IlIlIIIllIllIIIIIllI = (float)(this.llIIlIIIlIIIllIlIIIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI);
        ilIllllIIlIIlIlIlIll2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        ilIllllIIlIIlIlIlIll2.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        final float llIllIIIIIllIlIIIIlI = (float)(this.IlIlIlIlIlllllllllIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI);
        final float ilIIIlIlIIIllIlIlIIl = (float)(this.IllIIlllIIIIlllIIlIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI);
        ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = (float)(this.llIIlIIIlIIIllIlIIIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI);
        ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * array2[0];
        this.llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * array2[1];
        this.IlIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * array2[2];
        this.IllIIlllIIIIlllIIlIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * array2[0];
        this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * array2[1];
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * array2[2];
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * array2[0];
        this.llIllIlIIIIllIlIIllI = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * array2[1];
        this.lIlIlIIIllIIllIIIllI = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * array2[2];
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * array2[0];
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * array2[1];
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * array2[2];
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * array2[0];
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * array2[1];
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * array2[2];
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * array2[0];
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * array2[1];
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * array2[2];
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        this.IlIlIlIlIlllllllllIl = (1.0 - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII) * array2[0];
        this.IllIIlllIIIIlllIIlIl = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII) * array2[0];
        this.llIIlIIIlIIIllIlIIIl = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl) * array2[0];
        this.llIllIIIIIllIlIIIIlI = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII) * array2[1];
        this.llllIIIlIlllIlIIIIIl = (1.0 - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII) * array2[1];
        this.llIllIlIIIIllIlIIllI = 2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl) * array2[1];
        this.IlIIIlIlIIIllIlIlIIl = 2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl) * array2[2];
        this.lIIIIlIIIIIlllIllIII = 2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl) * array2[2];
        this.lIlIlIIIllIIllIIIllI = (1.0 - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl) * array2[2];
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        this.IlIlIlIlIlllllllllIl = (1.0 - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII) * array2[0];
        this.IllIIlllIIIIlllIIlIl = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII) * array2[0];
        this.llIIlIIIlIIIllIlIIIl = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl) * array2[0];
        this.llIllIIIIIllIlIIIIlI = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII) * array2[1];
        this.llllIIIlIlllIlIIIIIl = (1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII) * array2[1];
        this.llIllIlIIIIllIlIIllI = 2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl) * array2[1];
        this.IlIIIlIlIIIllIlIlIIl = 2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl) * array2[2];
        this.lIIIIlIIIIIlllIllIII = 2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl) * array2[2];
        this.lIlIlIIIllIIllIIIllI = (1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl) * array2[2];
    }
    
    public final void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        final double n = 1.0 / Math.sqrt(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        final double n2 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * n;
        final double n3 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n;
        final double n4 = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * n;
        final double sin = Math.sin(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        final double cos = Math.cos(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        final double n5 = 1.0 - cos;
        final double n6 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        final double n7 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        final double n8 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = (n5 * n2 * n2 + cos) * array2[0];
        this.llIllIIIIIllIlIIIIlI = (n5 * n7 - sin * n4) * array2[1];
        this.IlIIIlIlIIIllIlIlIIl = (n5 * n6 + sin * n3) * array2[2];
        this.IllIIlllIIIIlllIIlIl = (n5 * n7 + sin * n4) * array2[0];
        this.llllIIIlIlllIlIIIIIl = (n5 * n3 * n3 + cos) * array2[1];
        this.lIIIIlIIIIIlllIllIII = (n5 * n8 - sin * n2) * array2[2];
        this.llIIlIIIlIIIllIlIIIl = (n5 * n6 - sin * n3) * array2[0];
        this.llIllIlIIIIllIlIIllI = (n5 * n8 + sin * n2) * array2[1];
        this.lIlIlIIIllIIllIIIllI = (n5 * n4 * n4 + cos) * array2[2];
    }
    
    public final void IllIIlllIIIIlllIIlIl() {
        this.IlIlIlIlIlllllllllIl = 0.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = 0.0;
        this.IlIlIIIllIIllIlllllI = 0.0;
        this.IIIIlllIIIIIIlIIIlll = 0.0;
        this.llllIIllllIlIlIIIIll = 0.0;
        this.IlIllIlIlIIIlIlIlIII = 0.0;
        this.IIlllIIlIllIllIlIIll = 0.0;
    }
    
    public final void llllIIIlIlllIlIIIIIl() {
        this.IlIlIlIlIlllllllllIl = -this.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = -this.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -this.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -this.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -this.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -this.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -this.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -this.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = -this.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = -this.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = -this.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = -this.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = -this.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = -this.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = -this.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = -this.IIlllIIlIllIllIlIIll;
    }
    
    public final void lIIIlllIIIllIIIllIII(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IlIlIlIlIlllllllllIl = -llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = -llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = -llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = -llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = -llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = -llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = -llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = -llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = -llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = -llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
    }
    
    private final void llllIIIIlIIIlIlllIll(final double[] array, final double[] array2) {
        javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(new double[] { this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI }, array, array2);
    }
    
    public Object clone() {
        llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI;
        try {
            llIllIlIIIIllIlIIllI = (llIllIlIIIIllIlIIllI)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
        return llIllIlIIIIllIlIIllI;
    }
    
    public final double lIIIIlIIIIIlllIllIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public final void lIIIIlIIIIIlllIllIII(final double ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public final double lIIIlllIIIllIIIllIII() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void lIIIlllIIIllIIIllIII(final double llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final double llIIlIIIlIIIllIlIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llIIlIIIlIIIllIlIIIl(final double ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final double llIllIlIIIIllIlIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void llIllIlIIIIllIlIIllI(final double illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public final double lIlIlIIIllIIllIIIllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public final void lIlIlIIIllIIllIIIllI(final double llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public final double IlIlIIIllIIllIlllllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public final void IlIlIIIllIIllIlllllI(final double liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final double IIIIlllIIIIIIlIIIlll() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IIIIlllIIIIIIlIIIlll(final double llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public final double llllIIllllIlIlIIIIll() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public final void llllIIllllIlIlIIIIll(final double llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public final double IlIllIlIlIIIlIlIlIII() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public final void IlIllIlIlIIIlIlIlIII(final double lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public final double IIlllIIlIllIllIlIIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IIlllIIlIllIllIlIIll(final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final double lllIIIIlllllIlIIllIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public final void lllIIIIlllllIlIIllIl(final double liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public final double IlIlIIIIIIlllIlIllIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public final void IlIlIIIIIIlllIlIllIl(final double ilIlIIIllIIllIlllllI) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    public final double IIllIIllIIIlIlIIIIlI() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public final void IIllIIllIIIlIlIIIIlI(final double iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public final double IIIlIIIlIlIIlllIIlll() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public final void IIIlIIIlIlIIlllIIlll(final double llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public final double IlIlIIIlIIlIlIIlllIl() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public final void IlIlIIIlIIlIlIIlllIl(final double ilIllIlIlIIIlIlIlIII) {
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    public final double IlllllllIIIlIIIlIlII() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    public final void IlllllllIIIlIIIlIlII(final double iIlllIIlIllIllIlIIll) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
}
