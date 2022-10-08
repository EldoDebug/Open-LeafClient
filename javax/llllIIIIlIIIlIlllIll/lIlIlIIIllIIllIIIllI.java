package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class lIlIlIIIllIIllIIIllI implements Serializable, Cloneable
{
    static final long llllIIIIlIIIlIlllIll = -8405036035410109353L;
    public float IlIlIlIlIlllllllllIl;
    public float llIllIIIIIllIlIIIIlI;
    public float IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    public float llllIIIlIlllIlIIIIIl;
    public float lIIIIlIIIIIlllIllIII;
    public float lIIIlllIIIllIIIllIII;
    public float llIIlIIIlIIIllIlIIIl;
    public float llIllIlIIIIllIlIIllI;
    public float lIlIlIIIllIIllIIIllI;
    public float IlIlIIIllIIllIlllllI;
    public float IIIIlllIIIIIIlIIIlll;
    public float llllIIllllIlIlIIIIll;
    public float IlIllIlIlIIIlIlIlIII;
    public float IIlllIIlIllIllIlIIll;
    private static final double lllIIIIlllllIlIIllIl = 1.0E-8;
    
    public lIlIlIIIllIIllIIIllI(final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI, final float illIIlllIIIIlllIIlIl, final float llllIIIlIlllIlIIIIIl, final float liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII, final float llIIlIIIlIIIllIlIIIl, final float llIllIlIIIIllIlIIllI, final float lIlIlIIIllIIllIIIllI, final float ilIlIIIllIIllIlllllI, final float iiiIlllIIIIIIlIIIlll, final float llllIIllllIlIlIIIIll, final float ilIllIlIlIIIlIlIlIII, final float iIlllIIlIllIllIlIIll) {
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
    
    public lIlIlIIIllIIllIIIllI(final float[] array) {
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
    
    public lIlIlIIIllIIllIIIllI(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final float n) {
        this.IlIlIlIlIlllllllllIl = (float)(n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.IllIIlllIIIIlllIIlIl = (float)(n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII)));
        this.llIIlIIIlIIIllIlIIIl = (float)(n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl)));
        this.llIllIIIIIllIlIIIIlI = (float)(n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII)));
        this.llllIIIlIlllIlIIIIIl = (float)(n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.llIllIlIIIIllIlIIllI = (float)(n * (2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl)));
        this.IlIIIlIlIIIllIlIlIIl = (float)(n * (2.0 * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl)));
        this.lIIIIlIIIIIlllIllIII = (float)(n * (2.0 * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl)));
        this.lIlIlIIIllIIllIIIllI = (float)(n * (1.0 - 2.0 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
        this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public lIlIlIIIllIIllIIIllI(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IlIlIlIlIlllllllllIl = (float)llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (float)llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (float)llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = (float)llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (float)llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (float)llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (float)llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = (float)llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = (float)llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = (float)llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = (float)llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = (float)llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = (float)llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = (float)llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = (float)llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public lIlIlIIIllIIllIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
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
    
    public lIlIlIIIllIIllIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final float n) {
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
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public lIlIlIIIllIIllIIIllI() {
        this.IlIlIlIlIlllllllllIl = 0.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = 0.0f;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 0.0f;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.IlIlIlIlIlllllllllIl) + ", " + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ", " + this.IlIlIIIllIllIIIIIllI + "\n" + this.IllIIlllIIIIlllIIlIl + ", " + this.llllIIIlIlllIlIIIIIl + ", " + this.lIIIIlIIIIIlllIllIII + ", " + this.lIIIlllIIIllIIIllIII + "\n" + this.llIIlIIIlIIIllIlIIIl + ", " + this.llIllIlIIIIllIlIIllI + ", " + this.lIlIlIIIllIIllIIIllI + ", " + this.IlIlIIIllIIllIlllllI + "\n" + this.IIIIlllIIIIIIlIIIlll + ", " + this.llllIIllllIlIlIIIIll + ", " + this.IlIllIlIlIIIlIlIlIII + ", " + this.IIlllIIlIllIllIlIIll + "\n";
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = 1.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 1.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = 1.0f;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
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
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f0"));
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
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f0"));
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
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f0"));
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
                            throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f0"));
                        }
                    }
                    break;
                }
                default: {
                    throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f0"));
                }
            }
        }
    }
    
    public final float llllIIIIlIIIlIlllIll(final int n, final int n2) {
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
        throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f1"));
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        if (n == 0) {
            llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl;
            llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI;
            llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII = this.IlIIIlIlIIIllIlIlIIl;
            llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII = this.IlIlIIIllIllIIIIIllI;
        }
        else if (n == 1) {
            llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
            llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
            llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII;
            llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII;
        }
        else if (n == 2) {
            llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl = this.llIIlIIIlIIIllIlIIIl;
            llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl = this.llIllIlIIIIllIlIIllI;
            llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII = this.lIlIlIIIllIIllIIIllI;
            llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII = this.IlIlIIIllIIllIlllllI;
        }
        else {
            if (n != 3) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f2"));
            }
            llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl = this.IIIIlllIIIIIIlIIIlll;
            llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl = this.llllIIllllIlIlIIIIll;
            llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII = this.IlIllIlIlIIIlIlIlIII;
            llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII = this.IIlllIIlIllIllIlIIll;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final float[] array) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f2"));
            }
            array[0] = this.IIIIlllIIIIIIlIIIlll;
            array[1] = this.llllIIllllIlIlIIIIll;
            array[2] = this.IlIllIlIlIIIlIlIlIII;
            array[3] = this.IIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        if (n == 0) {
            llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl;
            llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl;
            llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII = this.llIIlIIIlIIIllIlIIIl;
            llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII = this.IIIIlllIIIIIIlIIIlll;
        }
        else if (n == 1) {
            llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl = this.llIllIIIIIllIlIIIIlI;
            llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
            llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII = this.llIllIlIIIIllIlIIllI;
            llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII = this.llllIIllllIlIlIIIIll;
        }
        else if (n == 2) {
            llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl = this.IlIIIlIlIIIllIlIlIIl;
            llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl = this.lIIIIlIIIIIlllIllIII;
            llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII = this.lIlIlIIIllIIllIIIllI;
            llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII = this.IlIllIlIlIIIlIlIlIII;
        }
        else {
            if (n != 3) {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f4"));
            }
            llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl = this.IlIlIIIllIllIIIIIllI;
            llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl = this.lIIIlllIIIllIIIllIII;
            llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII = this.IlIlIIIllIIllIlllllI;
            llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII = this.IIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final float[] array) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f4"));
            }
            array[0] = this.IlIlIIIllIllIIIIIllI;
            array[1] = this.lIIIlllIIIllIIIllIII;
            array[2] = this.IlIlIIIllIIllIlllllI;
            array[3] = this.IIlllIIlIllIllIlIIll;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n) {
        final double[] array = new double[9];
        this.llllIIIIlIIIlIlllIll(new double[3], array);
        this.IlIlIlIlIlllllllllIl = (float)(array[0] * n);
        this.llIllIIIIIllIlIIIIlI = (float)(array[1] * n);
        this.IlIIIlIlIIIllIlIlIIl = (float)(array[2] * n);
        this.IllIIlllIIIIlllIIlIl = (float)(array[3] * n);
        this.llllIIIlIlllIlIIIIIl = (float)(array[4] * n);
        this.lIIIIlIIIIIlllIllIII = (float)(array[5] * n);
        this.llIIlIIIlIIIllIlIIIl = (float)(array[6] * n);
        this.llIllIlIIIIllIlIIllI = (float)(array[7] * n);
        this.lIlIlIIIllIIllIIIllI = (float)(array[8] * n);
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
    
    public final float llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
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
        ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI;
        ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII;
        ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIIllIlllllI;
        return (float)javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(array2);
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
    
    public final void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI;
        ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII;
        ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIIllIlllllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI = this.IllIIlllIIIIlllIIlIl;
        llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl = this.llllIIIlIlllIlIIIIIl;
        llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = this.lIIIIlIIIIIlllIllIII;
        llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII = this.llIIlIIIlIIIllIlIIIl;
        llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII = this.llIllIlIIIIllIlIIllI;
        llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = this.lIlIlIIIllIIllIIIllI;
    }
    
    public final float IlIlIlIlIlllllllllIl() {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        return (float)javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(array2);
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
    
    public final void llllIIIIlIIIlIlllIll(final int n, final float n2, final float n3, final float n4, final float n5) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f6"));
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl;
                this.llIllIIIIIllIlIIIIlI = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl;
                this.IlIIIlIlIIIllIlIlIIl = llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII;
                this.IlIlIIIllIllIIIIIllI = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII;
                break;
            }
            case 1: {
                this.IllIIlllIIIIlllIIlIl = llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl;
                this.llllIIIlIlllIlIIIIIl = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl;
                this.lIIIIlIIIIIlllIllIII = llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII;
                this.lIIIlllIIIllIIIllIII = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII;
                break;
            }
            case 2: {
                this.llIIlIIIlIIIllIlIIIl = llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl;
                this.llIllIlIIIIllIlIIllI = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl;
                this.lIlIlIIIllIIllIIIllI = llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII;
                this.IlIlIIIllIIllIlllllI = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII;
                break;
            }
            case 3: {
                this.IIIIlllIIIIIIlIIIlll = llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl;
                this.llllIIllllIlIlIIIIll = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl;
                this.IlIllIlIlIIIlIlIlIII = llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII;
                this.IIlllIIlIllIllIlIIll = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f6"));
            }
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final float[] array) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f6"));
            }
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final float n2, final float n3, final float n4, final float n5) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f9"));
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        switch (n) {
            case 0: {
                this.IlIlIlIlIlllllllllIl = llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl;
                this.IllIIlllIIIIlllIIlIl = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl;
                this.llIIlIIIlIIIllIlIIIl = llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII;
                this.IIIIlllIIIIIIlIIIlll = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII;
                break;
            }
            case 1: {
                this.llIllIIIIIllIlIIIIlI = llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl;
                this.llllIIIlIlllIlIIIIIl = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl;
                this.llIllIlIIIIllIlIIllI = llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII;
                this.llllIIllllIlIlIIIIll = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII;
                break;
            }
            case 2: {
                this.IlIIIlIlIIIllIlIlIIl = llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl;
                this.lIIIIlIIIIIlllIllIII = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl;
                this.lIlIlIIIllIIllIIIllI = llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII;
                this.IlIllIlIlIIIlIlIlIII = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII;
                break;
            }
            case 3: {
                this.IlIlIIIllIllIIIIIllI = llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl;
                this.lIIIlllIIIllIIIllIII = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl;
                this.IlIlIIIllIIllIlllllI = llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII;
                this.IIlllIIlIllIllIlIIll = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f9"));
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final float[] array) {
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
                throw new ArrayIndexOutOfBoundsException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f9"));
            }
        }
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
        this.llIllIlIIIIllIlIIllI += n;
        this.lIlIlIIIllIIllIIIllI += n;
        this.IlIlIIIllIIllIlllllI += n;
        this.IIIIlllIIIIIIlIIIlll += n;
        this.llllIIllllIlIlIIIIll += n;
        this.IlIllIlIlIIIlIlIlIII += n;
        this.IIlllIIlIllIllIlIIll += n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl + n;
        this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI + n;
        this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl + n;
        this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI + n;
        this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl + n;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + n;
        this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII + n;
        this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII + n;
        this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl + n;
        this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI + n;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI + n;
        this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI + n;
        this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll + n;
        this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll + n;
        this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII + n;
        this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll + n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll + lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl += lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI += lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI += lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl += lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl += lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII += lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII += lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl += lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI += lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI += lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI += lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll += lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll += lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII += lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll += lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl - lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI - lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl - lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI - lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl - lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl - lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII - lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII - lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl - lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI - lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI - lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI - lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll - lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll - lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII - lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll - lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl -= lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI -= lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI -= lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl -= lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl -= lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII -= lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII -= lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl -= lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI -= lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI -= lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI -= lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll -= lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll -= lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII -= lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll -= lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        final float illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
        this.IllIIlllIIIIlllIIlIl = this.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl;
        final float llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = this.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl;
        final float iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
        this.IIIIlllIIIIIIlIIIlll = this.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll;
        final float llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI;
        this.llIllIlIIIIllIlIIllI = this.lIIIIlIIIIIlllIllIII;
        this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI;
        final float llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
        this.llllIIllllIlIlIIIIll = this.lIIIlllIIIllIIIllIII;
        this.lIIIlllIIIllIIIllIII = llllIIllllIlIlIIIIll;
        final float ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII;
        this.IlIllIlIlIIIlIlIlIII = this.IlIlIIIllIIllIlllllI;
        this.IlIlIIIllIIllIlllllI = ilIllIlIlIIIlIlIlIII;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        if (this != lIlIlIIIllIIllIIIllI) {
            this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
            this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl;
            this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
            this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
            this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI;
            this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
            this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
            this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI;
            this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
            this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI;
            this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII;
            this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI;
            this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
        }
        else {
            this.llIllIIIIIllIlIIIIlI();
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        this.IlIlIlIlIlllllllllIl = 1.0f - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        this.IllIIlllIIIIlllIIlIl = 2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.llIIlIIIlIIIllIlIIIl = 2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = 2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.llllIIIlIlllIlIIIIIl = 1.0f - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI = 2.0f * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl);
        this.IlIIIlIlIIIllIlIlIIl = 2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.lIIIIlIIIIIlllIllIII = 2.0f * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl);
        this.lIlIlIIIllIIllIIIllI = 1.0f - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final float n = (float)Math.sqrt(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI + ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        if (n < 1.0E-8) {
            this.IlIlIlIlIlllllllllIl = 1.0f;
            this.llIllIIIIIllIlIIIIlI = 0.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 1.0f;
            this.lIIIIlIIIIIlllIllIII = 0.0f;
            this.llIIlIIIlIIIllIlIIIl = 0.0f;
            this.llIllIlIIIIllIlIIllI = 0.0f;
            this.lIlIlIIIllIIllIIIllI = 1.0f;
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
            this.IllIIlllIIIIlllIIlIl = n8 * n10 + n6 * n5;
            this.llllIIIlIlllIlIIIIIl = n8 * n4 * n4 + n7;
            this.lIIIIlIIIIIlllIllIII = n8 * n11 - n6 * n3;
            this.llIIlIIIlIIIllIlIIIl = n8 * n9 - n6 * n4;
            this.llIllIlIIIIllIlIIllI = n8 * n11 + n6 * n3;
            this.lIlIlIIIllIIllIIIllI = n8 * n5 * n5 + n7;
        }
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this.IlIlIlIlIlllllllllIl = (float)(1.0 - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.llIIlIIIlIIIllIlIIIl = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl));
        this.llIllIIIIIllIlIIIIlI = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.llllIIIlIlllIlIIIIIl = (float)(1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.llIllIlIIIIllIlIIllI = (float)(2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl));
        this.IlIIIlIlIIIllIlIlIIl = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl));
        this.lIIIIlIIIIIlllIllIII = (float)(2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl));
        this.lIlIlIIIllIIllIIIllI = (float)(1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final double sqrt = Math.sqrt(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        if (sqrt < 1.0E-8) {
            this.IlIlIlIlIlllllllllIl = 1.0f;
            this.llIllIIIIIllIlIIIIlI = 0.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 1.0f;
            this.lIIIIlIIIIIlllIllIII = 0.0f;
            this.llIIlIIIlIIIllIlIIIl = 0.0f;
            this.llIllIlIIIIllIlIIllI = 0.0f;
            this.lIlIlIIIllIIllIIIllI = 1.0f;
        }
        else {
            final double n = 1.0 / sqrt;
            final double n2 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * n;
            final double n3 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n;
            final double n4 = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * n;
            final float n5 = (float)Math.sin(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
            final float n6 = (float)Math.cos(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
            final float n7 = 1.0f - n6;
            final float n8 = (float)(n2 * n4);
            final float n9 = (float)(n2 * n3);
            final float n10 = (float)(n3 * n4);
            this.IlIlIlIlIlllllllllIl = n7 * (float)(n2 * n2) + n6;
            this.llIllIIIIIllIlIIIIlI = n7 * n9 - n5 * (float)n4;
            this.IlIIIlIlIIIllIlIlIIl = n7 * n8 + n5 * (float)n3;
            this.IllIIlllIIIIlllIIlIl = n7 * n9 + n5 * (float)n4;
            this.llllIIIlIlllIlIIIIIl = n7 * (float)(n3 * n3) + n6;
            this.lIIIIlIIIIIlllIllIII = n7 * n10 - n5 * (float)n2;
            this.llIIlIIIlIIIllIlIIIl = n7 * n8 - n5 * (float)n3;
            this.llIllIlIIIIllIlIIllI = n7 * n10 + n5 * (float)n2;
            this.lIlIlIIIllIIllIIIllI = n7 * (float)(n4 * n4) + n6;
        }
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double n) {
        this.IlIlIlIlIlllllllllIl = (float)(n * (1.0 - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.IllIIlllIIIIlllIIlIl = (float)(n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII)));
        this.llIIlIIIlIIIllIlIIIl = (float)(n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl)));
        this.llIllIIIIIllIlIIIIlI = (float)(n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII)));
        this.llllIIIlIlllIlIIIIIl = (float)(n * (1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII));
        this.llIllIlIIIIllIlIIllI = (float)(n * (2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl)));
        this.IlIIIlIlIIIllIlIlIIl = (float)(n * (2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl)));
        this.lIIIIlIIIIIlllIllIII = (float)(n * (2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl)));
        this.lIlIlIIIllIIllIIIllI = (float)(n * (1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl));
        this.IlIlIIIllIllIIIIIllI = (float)illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = (float)illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = (float)illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final float n) {
        this.IlIlIlIlIlllllllllIl = n * (1.0f - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = n * (2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.llIIlIIIlIIIllIlIIIl = n * (2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
        this.llIllIIIIIllIlIIIIlI = n * (2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII));
        this.llllIIIlIlllIlIIIIIl = n * (1.0f - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.llIllIlIIIIllIlIIllI = n * (2.0f * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl));
        this.IlIIIlIlIIIllIlIlIIl = n * (2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl));
        this.lIIIIlIIIIIlllIllIII = n * (2.0f * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl));
        this.lIlIlIIIllIIllIIIllI = n * (1.0f - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IlIlIlIlIlllllllllIl = (float)llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (float)llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (float)llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = (float)llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (float)llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (float)llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (float)llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = (float)llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = (float)llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = (float)llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = (float)llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = (float)llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = (float)llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = (float)llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = (float)llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
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
    
    public final void IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        this.IllIIlllIIIIlllIIlIl(lIlIlIIIllIIllIIIllI);
    }
    
    public final void IlIIIlIlIIIllIlIlIIl() {
        this.IllIIlllIIIIlllIIlIl(this);
    }
    
    final void IllIIlllIIIIlllIIlIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final double[] array = new double[16];
        final double[] array2 = new double[16];
        final int[] array3 = new int[4];
        array[0] = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
        array[1] = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
        array[2] = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
        array[3] = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI;
        array[4] = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
        array[5] = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl;
        array[6] = lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII;
        array[7] = lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII;
        array[8] = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl;
        array[9] = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI;
        array[10] = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI;
        array[11] = lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI;
        array[12] = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        array[13] = lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        array[14] = lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        array[15] = lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
        if (!llllIIIIlIIIlIlllIll(array, array3)) {
            throw new IIIlIIlIIIIlllIlllII(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f12"));
        }
        for (int i = 0; i < 16; ++i) {
            array2[i] = 0.0;
        }
        array2[5] = (array2[0] = 1.0);
        array2[15] = (array2[10] = 1.0);
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
        this.llIllIlIIIIllIlIIllI = (float)array2[9];
        this.lIlIlIIIllIIllIIIllI = (float)array2[10];
        this.IlIlIIIllIIllIlllllI = (float)array2[11];
        this.IIIIlllIIIIIIlIIIlll = (float)array2[12];
        this.llllIIllllIlIlIIIIll = (float)array2[13];
        this.IlIllIlIlIIIlIlIlIII = (float)array2[14];
        this.IIlllIIlIllIllIlIIll = (float)array2[15];
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
                throw new RuntimeException(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("Matrix4f13"));
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
    
    public final float IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl * (this.llllIIIlIlllIlIIIIIl * this.lIlIlIIIllIIllIIIllI * this.IIlllIIlIllIllIlIIll + this.lIIIIlIIIIIlllIllIII * this.IlIlIIIllIIllIlllllI * this.llllIIllllIlIlIIIIll + this.lIIIlllIIIllIIIllIII * this.llIllIlIIIIllIlIIllI * this.IlIllIlIlIIIlIlIlIII - this.lIIIlllIIIllIIIllIII * this.lIlIlIIIllIIllIIIllI * this.llllIIllllIlIlIIIIll - this.llllIIIlIlllIlIIIIIl * this.IlIlIIIllIIllIlllllI * this.IlIllIlIlIIIlIlIlIII - this.lIIIIlIIIIIlllIllIII * this.llIllIlIIIIllIlIIllI * this.IIlllIIlIllIllIlIIll) - this.llIllIIIIIllIlIIIIlI * (this.IllIIlllIIIIlllIIlIl * this.lIlIlIIIllIIllIIIllI * this.IIlllIIlIllIllIlIIll + this.lIIIIlIIIIIlllIllIII * this.IlIlIIIllIIllIlllllI * this.IIIIlllIIIIIIlIIIlll + this.lIIIlllIIIllIIIllIII * this.llIIlIIIlIIIllIlIIIl * this.IlIllIlIlIIIlIlIlIII - this.lIIIlllIIIllIIIllIII * this.lIlIlIIIllIIllIIIllI * this.IIIIlllIIIIIIlIIIlll - this.IllIIlllIIIIlllIIlIl * this.IlIlIIIllIIllIlllllI * this.IlIllIlIlIIIlIlIlIII - this.lIIIIlIIIIIlllIllIII * this.llIIlIIIlIIIllIlIIIl * this.IIlllIIlIllIllIlIIll) + this.IlIIIlIlIIIllIlIlIIl * (this.IllIIlllIIIIlllIIlIl * this.llIllIlIIIIllIlIIllI * this.IIlllIIlIllIllIlIIll + this.llllIIIlIlllIlIIIIIl * this.IlIlIIIllIIllIlllllI * this.IIIIlllIIIIIIlIIIlll + this.lIIIlllIIIllIIIllIII * this.llIIlIIIlIIIllIlIIIl * this.llllIIllllIlIlIIIIll - this.lIIIlllIIIllIIIllIII * this.llIllIlIIIIllIlIIllI * this.IIIIlllIIIIIIlIIIlll - this.IllIIlllIIIIlllIIlIl * this.IlIlIIIllIIllIlllllI * this.llllIIllllIlIlIIIIll - this.llllIIIlIlllIlIIIIIl * this.llIIlIIIlIIIllIlIIIl * this.IIlllIIlIllIllIlIIll) - this.IlIlIIIllIllIIIIIllI * (this.IllIIlllIIIIlllIIlIl * this.llIllIlIIIIllIlIIllI * this.IlIllIlIlIIIlIlIlIII + this.llllIIIlIlllIlIIIIIl * this.lIlIlIIIllIIllIIIllI * this.IIIIlllIIIIIIlIIIlll + this.lIIIIlIIIIIlllIllIII * this.llIIlIIIlIIIllIlIIIl * this.llllIIllllIlIlIIIIll - this.lIIIIlIIIIIlllIllIII * this.llIllIlIIIIllIlIIllI * this.IIIIlllIIIIIIlIIIlll - this.IllIIlllIIIIlllIIlIl * this.lIlIlIIIllIIllIIIllI * this.llllIIllllIlIlIIIIll - this.llllIIIlIlllIlIIIIIl * this.llIIlIIIlIIIllIlIIIl * this.IlIllIlIlIIIlIlIlIII);
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = (float)liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (float)liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = (float)liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = (float)liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = (float)liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = (float)liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI = (float)liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII;
        this.lIlIlIIIllIIllIIIllI = (float)liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final float lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
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
        this.llIllIlIIIIllIlIIllI = array[9];
        this.lIlIlIIIllIIllIIIllI = array[10];
        this.IlIlIIIllIIllIlllllI = array[11];
        this.IIIIlllIIIIIIlIIIlll = array[12];
        this.llllIIllllIlIlIIIIll = array[13];
        this.IlIllIlIlIIIlIlIlIII = array[14];
        this.IIlllIIlIllIllIlIIll = array[15];
    }
    
    public final void IlIlIlIlIlllllllllIl(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        this.IlIlIlIlIlllllllllIl = 1.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 1.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = 1.0f;
        this.IlIlIIIllIIllIlllllI = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float lIlIlIIIllIIllIIIllI, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final float lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
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
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double n) {
        this.IlIlIlIlIlllllllllIl = (float)(liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * n);
        this.llIllIIIIIllIlIIIIlI = (float)(liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * n);
        this.IlIIIlIlIIIllIlIlIIl = (float)(liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * n);
        this.IlIlIIIllIllIIIIIllI = (float)illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = (float)(liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * n);
        this.llllIIIlIlllIlIIIIIl = (float)(liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * n);
        this.lIIIIlIIIIIlllIllIII = (float)(liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * n);
        this.lIIIlllIIIllIIIllIII = (float)illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.llIIlIIIlIIIllIlIIIl = (float)(liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * n);
        this.llIllIlIIIIllIlIIllI = (float)(liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * n);
        this.lIlIlIIIllIIllIIIllI = (float)(liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * n);
        this.IlIlIIIllIIllIlllllI = (float)illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.lIIIlllIIIllIIIllIII = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIIllIlllllI = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final float n) {
        final float llIllIlIIIIllIlIIllI = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.IlIlIlIlIlllllllllIl = 1.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = n2;
        this.lIIIIlIIIIIlllIllIII = -llIllIlIIIIllIlIIllI;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = n2;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final float n) {
        final float ilIIIlIlIIIllIlIlIIl = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.IlIlIlIlIlllllllllIl = n2;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 1.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = -ilIIIlIlIIIllIlIlIIl;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = n2;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final float n) {
        final float illIIlllIIIIlllIIlIl = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.IlIlIlIlIlllllllllIl = n2;
        this.llIllIIIIIllIlIIIIlI = -illIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n2;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = 1.0f;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 1.0f;
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
        this.llIllIlIIIIllIlIIllI *= n;
        this.lIlIlIIIllIIllIIIllI *= n;
        this.IlIlIIIllIIllIlllllI *= n;
        this.IIIIlllIIIIIIlIIIlll *= n;
        this.llllIIllllIlIlIIIIll *= n;
        this.IlIllIlIlIIIlIlIlIII *= n;
        this.IIlllIIlIllIllIlIIll *= n;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * n;
        this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * n;
        this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * n;
        this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * n;
        this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * n;
        this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * n;
        this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * n;
        this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * n;
        this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * n;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * n;
        this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * n;
        this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * n;
        this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * n;
        this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * n;
        this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * n;
    }
    
    public final void llllIIIlIlllIlIIIIIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final float ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl + this.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl + this.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        final float llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI + this.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        final float ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl + this.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII + this.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI + this.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        final float ilIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI + this.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI + this.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
        final float illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl + this.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl + this.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl + this.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        final float llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI + this.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        final float liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl + this.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII + this.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI + this.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        final float liiIlllIIIllIIIllIII = this.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII + this.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI + this.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
        final float llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl + this.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl + this.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl + this.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        final float llIllIlIIIIllIlIIllI = this.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + this.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI + this.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        final float lIlIlIIIllIIllIIIllI2 = this.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl + this.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII + this.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI + this.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        final float ilIlIIIllIIllIlllllI = this.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI + this.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII + this.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI + this.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
        final float iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl + this.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl + this.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl + this.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        final float llllIIllllIlIlIIIIll = this.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI + this.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + this.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI + this.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        final float ilIllIlIlIIIlIlIlIII = this.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl + this.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII + this.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI + this.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        final float iIlllIIlIllIllIlIIll = this.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI + this.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII + this.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI + this.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
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
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI2;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2) {
        if (this != lIlIlIIIllIIllIIIllI && this != lIlIlIIIllIIllIIIllI2) {
            this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
        }
        else {
            final float ilIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            final float llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            final float ilIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            final float ilIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float illIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            final float llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            final float liiiIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            final float liiIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            final float llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            final float lIlIlIIIllIIllIIIllI3 = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            final float ilIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float iiiIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            final float llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            final float ilIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            final float iIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
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
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI3;
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2) {
        if (this != lIlIlIIIllIIllIIIllI && this != lIlIlIIIllIIllIIIllI2) {
            this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
        }
        else {
            final float ilIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            final float llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            final float ilIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            final float ilIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float illIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            final float llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            final float liiiIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            final float liiIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            final float llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            final float lIlIlIIIllIIllIIIllI3 = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            final float ilIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float iiiIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            final float llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            final float ilIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            final float iIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
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
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI3;
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2) {
        if (this != lIlIlIIIllIIllIIIllI && this != lIlIlIIIllIIllIIIllI2) {
            this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
        }
        else {
            final float ilIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            final float llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            final float ilIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            final float ilIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float illIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            final float llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            final float liiiIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            final float liiIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            final float llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            final float lIlIlIIIllIIllIIIllI3 = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            final float ilIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float iiiIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI;
            final float llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII;
            final float ilIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI;
            final float iIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
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
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI3;
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2) {
        if (this != lIlIlIIIllIIllIIIllI && this != lIlIlIIIllIIllIIIllI2) {
            this.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            this.IlIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IlIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            this.lIIIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IlIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            this.IIIIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
        }
        else {
            final float ilIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            final float llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            final float ilIIIlIlIIIllIlIlIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            final float ilIlIIIllIllIIIIIllI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float illIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            final float llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            final float liiiIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            final float liiIlllIIIllIIIllIII = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            final float llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            final float lIlIlIIIllIIllIIIllI3 = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            final float ilIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
            final float iiiIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll;
            final float llllIIllllIlIlIIIIll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.llIllIIIIIllIlIIIIlI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.llIllIlIIIIllIlIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll;
            final float ilIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIIIlIlIIIllIlIlIIl + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IlIllIlIlIIIlIlIlIII;
            final float iIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIllIIIIIllI + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII * lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII + lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI * lIlIlIIIllIIllIIIllI2.IlIlIIIllIIllIlllllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll * lIlIlIIIllIIllIIIllI2.IIlllIIlIllIllIlIIll;
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
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI3;
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
            this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        }
    }
    
    public boolean lIIIIlIIIIIlllIllIII(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        try {
            return this.IlIlIlIlIlllllllllIl == lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl == lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl && this.llIllIlIIIIllIlIIllI == lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI && this.lIlIlIIIllIIllIIIllI == lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI && this.IlIlIIIllIIllIlllllI == lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI && this.IIIIlllIIIIIIlIIIlll == lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll && this.llllIIllllIlIlIIIIll == lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll && this.IlIllIlIlIIIlIlIlIII == lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII && this.IIlllIIlIllIllIlIIll == lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = (lIlIlIIIllIIllIIIllI)o;
            return this.IlIlIlIlIlllllllllIl == lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl == lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl && this.llIllIlIIIIllIlIIllI == lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI && this.lIlIlIIIllIIllIIIllI == lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI && this.IlIlIIIllIIllIlllllI == lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI && this.IIIIlllIIIIIIlIIIlll == lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll && this.llllIIllllIlIlIIIIll == lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll && this.IlIllIlIlIIIlIlIlIII == lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII && this.IIlllIIlIllIllIlIIll == lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
        }
        catch (ClassCastException ex) {
            return false;
        }
        catch (NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final float n) {
        boolean b = true;
        if (Math.abs(this.IlIlIlIlIlllllllllIl - lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl) > n) {
            b = false;
        }
        if (Math.abs(this.llIllIIIIIllIlIIIIlI - lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI) > n) {
            b = false;
        }
        if (Math.abs(this.IlIIIlIlIIIllIlIlIIl - lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl) > n) {
            b = false;
        }
        if (Math.abs(this.IlIlIIIllIllIIIIIllI - lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI) > n) {
            b = false;
        }
        if (Math.abs(this.IllIIlllIIIIlllIIlIl - lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl) > n) {
            b = false;
        }
        if (Math.abs(this.llllIIIlIlllIlIIIIIl - lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl) > n) {
            b = false;
        }
        if (Math.abs(this.lIIIIlIIIIIlllIllIII - lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII) > n) {
            b = false;
        }
        if (Math.abs(this.lIIIlllIIIllIIIllIII - lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII) > n) {
            b = false;
        }
        if (Math.abs(this.llIIlIIIlIIIllIlIIIl - lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl) > n) {
            b = false;
        }
        if (Math.abs(this.llIllIlIIIIllIlIIllI - lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI) > n) {
            b = false;
        }
        if (Math.abs(this.lIlIlIIIllIIllIIIllI - lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI) > n) {
            b = false;
        }
        if (Math.abs(this.IlIlIIIllIIllIlllllI - lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI) > n) {
            b = false;
        }
        if (Math.abs(this.IIIIlllIIIIIIlIIIlll - lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll) > n) {
            b = false;
        }
        if (Math.abs(this.llllIIllllIlIlIIIIll - lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll) > n) {
            b = false;
        }
        if (Math.abs(this.IlIllIlIlIIIlIlIlIII - lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII) > n) {
            b = false;
        }
        if (Math.abs(this.IIlllIIlIllIllIlIIll - lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll) > n) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.IlIlIlIlIlllllllllIl), this.llIllIIIIIllIlIIIIlI), this.IlIIIlIlIIIllIlIlIIl), this.IlIlIIIllIllIIIIIllI), this.IllIIlllIIIIlllIIlIl), this.llllIIIlIlllIlIIIIIl), this.lIIIIlIIIIIlllIllIII), this.lIIIlllIIIllIIIllIII), this.llIIlIIIlIIIllIlIIIl), this.llIllIlIIIIllIlIIllI), this.lIlIlIIIllIIllIIIllI), this.IlIlIIIllIIllIlllllI), this.IIIIlllIIIIIIlIIIlll), this.llllIIllllIlIlIIIIll), this.IlIllIlIlIIIlIlIlIII), this.IIlllIIlIllIllIlIIll));
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI2) {
        final float illIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llIllIIIIIllIlIIIIlI * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIllIIIIIllI * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        final float llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        final float liiiIlIIIIIlllIllIII = this.llIIlIIIlIIIllIlIIIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llIllIlIIIIllIlIIllI * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.lIlIlIIIllIIllIIIllI * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIIllIlllllI * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        iiiiiiiiIlllIllIlIlI2.lIIIlllIIIllIIIllIII = this.IIIIlllIIIIIIlIIIlll * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llllIIllllIlIlIIIIll * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.IlIllIlIlIIIlIlIlIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IIlllIIlIllIllIlIIll * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        iiiiiiiiIlllIllIlIlI2.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        iiiiiiiiIlllIllIlIlI2.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        iiiiiiiiIlllIllIlIlI2.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        final float illIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llIllIIIIIllIlIIIIlI * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.IlIIIlIlIIIllIlIlIIl * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIllIIIIIllI * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        final float llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        final float liiiIlIIIIIlllIllIII = this.llIIlIIIlIIIllIlIIIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llIllIlIIIIllIlIIllI * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.lIlIlIIIllIIllIIIllI * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IlIlIIIllIIllIlllllI * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII = this.IIIIlllIIIIIIlIIIlll * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + this.llllIIllllIlIlIIIIll * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + this.IlIllIlIlIIIlIlIlIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + this.IIlllIIlIllIllIlIIll * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        final float llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIllIIIIIllI;
        final float ilIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII;
        lllIIIIlllllIlIIllIl2.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIIllIlllllI;
        lllIIIIlllllIlIIllIl2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        lllIIIIlllllIlIIllIl2.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final float llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIllIIIIIllI;
        final float ilIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.lIIIlllIIIllIIIllIII;
        lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl * lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI + this.IlIlIIIllIIllIlllllI;
        lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll2) {
        final float llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        final float ilIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        ilIllllIIlIIlIlIlIll2.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        ilIllllIIlIIlIlIlIll2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        ilIllllIIlIIlIlIlIll2.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        final float llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llIllIIIIIllIlIIIIlI * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.IlIIIlIlIIIllIlIlIIl * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        final float ilIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llllIIIlIlllIlIIIIIl * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.lIIIIlIIIIIlllIllIII * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.llIllIlIIIIllIlIIllI * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.lIlIlIIIllIIllIIIllI * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        this.IlIlIlIlIlllllllllIl = (float)(liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl * array2[0]);
        this.llIllIIIIIllIlIIIIlI = (float)(liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI * array2[1]);
        this.IlIIIlIlIIIllIlIlIIl = (float)(liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl * array2[2]);
        this.IllIIlllIIIIlllIIlIl = (float)(liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * array2[0]);
        this.llllIIIlIlllIlIIIIIl = (float)(liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl * array2[1]);
        this.lIIIIlIIIIIlllIllIII = (float)(liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl * array2[2]);
        this.llIIlIIIlIIIllIlIIIl = (float)(liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * array2[0]);
        this.llIllIlIIIIllIlIIllI = (float)(liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII * array2[1]);
        this.lIlIlIIIllIIllIIIllI = (float)(liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl * array2[2]);
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        this.IlIlIlIlIlllllllllIl = (float)(llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl * array2[0]);
        this.llIllIIIIIllIlIIIIlI = (float)(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI * array2[1]);
        this.IlIIIlIlIIIllIlIlIIl = (float)(llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl * array2[2]);
        this.IllIIlllIIIIlllIIlIl = (float)(llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * array2[0]);
        this.llllIIIlIlllIlIIIIIl = (float)(llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl * array2[1]);
        this.lIIIIlIIIIIlllIllIII = (float)(llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl * array2[2]);
        this.llIIlIIIlIIIllIlIIIl = (float)(llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * array2[0]);
        this.llIllIlIIIIllIlIIllI = (float)(llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII * array2[1]);
        this.lIlIlIIIllIIllIIIllI = (float)(llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl * array2[2]);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        this.IlIlIlIlIlllllllllIl = (float)((1.0f - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII) * array2[0]);
        this.IllIIlllIIIIlllIIlIl = (float)(2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII) * array2[0]);
        this.llIIlIIIlIIIllIlIIIl = (float)(2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl) * array2[0]);
        this.llIllIIIIIllIlIIIIlI = (float)(2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII) * array2[1]);
        this.llllIIIlIlllIlIIIIIl = (float)((1.0f - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII) * array2[1]);
        this.llIllIlIIIIllIlIIllI = (float)(2.0f * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl) * array2[1]);
        this.IlIIIlIlIIIllIlIlIIl = (float)(2.0f * (ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl) * array2[2]);
        this.lIIIIlIIIIIlllIllIII = (float)(2.0f * (ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl) * array2[2]);
        this.lIlIlIIIllIIllIIIllI = (float)((1.0f - 2.0f * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - 2.0f * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl) * array2[2]);
    }
    
    public final void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        this.IlIlIlIlIlllllllllIl = (float)((1.0 - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII) * array2[0]);
        this.IllIIlllIIIIlllIIlIl = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII) * array2[0]);
        this.llIIlIIIlIIIllIlIIIl = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl) * array2[0]);
        this.llIllIIIIIllIlIIIIlI = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII) * array2[1]);
        this.llllIIIlIlllIlIIIIIl = (float)((1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII) * array2[1]);
        this.llIllIlIIIIllIlIIllI = (float)(2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl) * array2[1]);
        this.IlIIIlIlIIIllIlIlIIl = (float)(2.0 * (illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl) * array2[2]);
        this.lIIIIlIIIIIlllIllIII = (float)(2.0 * (illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl) * array2[2]);
        this.lIlIlIIIllIIllIIIllI = (float)((1.0 - 2.0 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - 2.0 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl) * array2[2]);
    }
    
    public final void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.llllIIIIlIIIlIlllIll(array2, array);
        final double sqrt = Math.sqrt(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI + ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        if (sqrt < 1.0E-8) {
            this.IlIlIlIlIlllllllllIl = 1.0f;
            this.llIllIIIIIllIlIIIIlI = 0.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 1.0f;
            this.lIIIIlIIIIIlllIllIII = 0.0f;
            this.llIIlIIIlIIIllIlIIIl = 0.0f;
            this.llIllIlIIIIllIlIIllI = 0.0f;
            this.lIlIlIIIllIIllIIIllI = 1.0f;
        }
        else {
            final double n = 1.0 / sqrt;
            final double n2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * n;
            final double n3 = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * n;
            final double n4 = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * n;
            final double sin = Math.sin(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
            final double cos = Math.cos(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
            final double n5 = 1.0 - cos;
            final double n6 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
            final double n7 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
            final double n8 = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
            this.IlIlIlIlIlllllllllIl = (float)((n5 * n2 * n2 + cos) * array2[0]);
            this.llIllIIIIIllIlIIIIlI = (float)((n5 * n7 - sin * n4) * array2[1]);
            this.IlIIIlIlIIIllIlIlIIl = (float)((n5 * n6 + sin * n3) * array2[2]);
            this.IllIIlllIIIIlllIIlIl = (float)((n5 * n7 + sin * n4) * array2[0]);
            this.llllIIIlIlllIlIIIIIl = (float)((n5 * n3 * n3 + cos) * array2[1]);
            this.lIIIIlIIIIIlllIllIII = (float)((n5 * n8 - sin * n2) * array2[2]);
            this.llIIlIIIlIIIllIlIIIl = (float)((n5 * n6 - sin * n3) * array2[0]);
            this.llIllIlIIIIllIlIIllI = (float)((n5 * n8 + sin * n2) * array2[1]);
            this.lIlIlIIIllIIllIIIllI = (float)((n5 * n4 * n4 + cos) * array2[2]);
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl() {
        this.IlIlIlIlIlllllllllIl = 0.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = 0.0f;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIllllIlIlIIIIll = 0.0f;
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        this.IIlllIIlIllIllIlIIll = 0.0f;
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
    
    public final void lIIIlllIIIllIIIllIII(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        this.IlIlIlIlIlllllllllIl = -lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = -lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = -lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = -lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = -lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = -lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = -lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = -lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = -lIlIlIIIllIIllIIIllI.IlIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = -lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
    }
    
    private final void llllIIIIlIIIlIlllIll(final double[] array, final double[] array2) {
        javax.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(new double[] { this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI }, array, array2);
    }
    
    public Object clone() {
        lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI;
        try {
            lIlIlIIIllIIllIIIllI = (lIlIlIIIllIIllIIIllI)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
        return lIlIlIIIllIIllIIIllI;
    }
    
    public final float lIIIIlIIIIIlllIllIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public final void lIIIIlIIIIIlllIllIII(final float ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public final float lIIIlllIIIllIIIllIII() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void lIIIlllIIIllIIIllIII(final float llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final float llIIlIIIlIIIllIlIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llIIlIIIlIIIllIlIIIl(final float ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final float llIllIlIIIIllIlIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void llIllIlIIIIllIlIIllI(final float illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public final float lIlIlIIIllIIllIIIllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public final void lIlIlIIIllIIllIIIllI(final float llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public final float IlIlIIIllIIllIlllllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public final void IlIlIIIllIIllIlllllI(final float liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final float IIIIlllIIIIIIlIIIlll() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public final void IIIIlllIIIIIIlIIIlll(final float llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public final float llllIIllllIlIlIIIIll() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public final void llllIIllllIlIlIIIIll(final float llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public final float IlIllIlIlIIIlIlIlIII() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public final void IlIllIlIlIIIlIlIlIII(final float lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public final float IIlllIIlIllIllIlIIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IIlllIIlIllIllIlIIll(final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final float lllIIIIlllllIlIIllIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public final void lllIIIIlllllIlIIllIl(final float liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public final float IlIlIIIIIIlllIlIllIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public final void IlIlIIIIIIlllIlIllIl(final float ilIlIIIllIIllIlllllI) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    public final float IIllIIllIIIlIlIIIIlI() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public final void IIllIIllIIIlIlIIIIlI(final float iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public final float IIIlIIIlIlIIlllIIlll() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public final void IIIlIIIlIlIIlllIIlll(final float llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public final float IlIlIIIlIIlIlIIlllIl() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public final void IlIlIIIlIIlIlIIlllIl(final float ilIllIlIlIIIlIlIlIII) {
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    public final float IlllllllIIIlIIIlIlII() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    public final void IlllllllIIIlIIIlIlII(final float iIlllIIlIllIllIlIIll) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
}
