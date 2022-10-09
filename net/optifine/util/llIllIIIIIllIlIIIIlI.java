package net.optifine.util;

public class llIllIIIIIllIlIIIIlI
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int[][][] llllIIIlIlllIlIIIIIl;
    private int[] lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    
    public llIllIIIIIllIlIIIIlI(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = 18;
        this.IlIlIlIlIlllllllllIl = 128;
        this.llIllIIIIIllIlIIIIlI = 18;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = 0;
        this.IllIIlllIIIIlllIIlIl = 0;
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = 0;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl = new int[llllIIIIlIIIlIlllIll][ilIlIlIlIlllllllllIl][llIllIIIIIllIlIIIIlI];
        this.llllIIIIlIIIlIlllIll();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll; ++i) {
            final int[][] array = this.llllIIIlIlllIlIIIIIl[i];
            for (int j = 0; j < this.IlIlIlIlIlllllllllIl; ++j) {
                final int[] array2 = array[j];
                for (int k = 0; k < this.llIllIIIIIllIlIIIIlI; ++k) {
                    array2[k] = -1;
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll();
    }
    
    public int IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        try {
            this.lIIIIlIIIIIlllIllIII = this.llllIIIlIlllIlIIIIIl[n - this.IlIIIlIlIIIllIlIlIIl][n2 - this.IlIlIIIllIllIIIIIllI];
            this.lIIIlllIIIllIIIllIII = n3 - this.IllIIlllIIIIlllIIlIl;
            return this.lIIIIlIIIIIlllIllIII[this.lIIIlllIIIllIIIllIII];
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            return -1;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        try {
            this.lIIIIlIIIIIlllIllIII[this.lIIIlllIIIllIIIllIII] = n;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
