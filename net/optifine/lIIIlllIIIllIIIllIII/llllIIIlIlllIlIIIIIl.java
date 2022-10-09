package net.optifine.lIIIlllIIIllIIIllIII;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.IlIlIIIllIllIIIIIllI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class llllIIIlIlllIlIIIIIl
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private float[] llllIIIlIlllIlIIIIIl;
    private BitSet lIIIIlIIIIIlllIllIII;
    private IlIIIlIlIIIllIlIlIIl lIIIlllIIIllIIIllIII;
    private net.optifine.IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl;
    private boolean[] llIllIlIIIIllIlIIllI;
    private boolean[] lIlIlIIIllIIllIIIllI;
    private boolean[] IlIlIIIllIIllIlllllI;
    private lllIllIIIllllllIllll[] IIIIlllIIIIIIlIIIlll;
    private List llllIIllllIlIlIIIIll;
    private List IlIllIlIlIIIlIlIlIII;
    private llllIIIIlIIIlIlllIll[] IIlllIIlIllIllIlIIll;
    private llllIIIIlIIIlIlllIll[] lllIIIIlllllIlIIllIl;
    private llllIIIIlIIIlIlllIll[] IlIlIIIIIIlllIlIllIl;
    private llllIIIIlIIIlIlllIll[] IIllIIllIIIlIlIIIIlI;
    private IlIIllIIllIIllIIlIIl IIIlIIIlIlIIlllIIlll;
    private llIllIIIIIllIlIIIIlI[] IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    private static final int IIlIIIIlllIlllllIlII = -1;
    private static final int IIIlIIlIIIIlllIlllII = 0;
    private static final int IlIlIllllllllIIIIlII = 1;
    
    public llllIIIlIlllIlIIIIIl(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = -1;
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = new float[lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length * 2];
        this.lIIIIlIIIIIlllIllIII = new BitSet(3);
        this.lIIIlllIIIllIIIllIII = new IlIIIlIlIIIllIlIlIIl();
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = null;
        this.IlIlIIIllIIllIlllllI = null;
        this.IIIIlllIIIIIIlIIIlll = null;
        this.llllIIllllIlIlIIIIll = new ArrayList();
        this.IlIllIlIlIIIlIlIlIII = new ArrayList();
        this.IIlllIIlIllIllIlIIll = new llllIIIIlIIIlIlllIll[1];
        this.lllIIIIlllllIlIIllIl = new llllIIIIlIIIlIlllIll[2];
        this.IlIlIIIIIIlllIlIllIl = new llllIIIIlIIIlIlllIll[3];
        this.IIllIIllIIIlIlIIIIlI = new llllIIIIlIIIlIlllIll[4];
        this.IIIlIIIlIlIIlllIIlll = null;
        this.IlIlIIIlIIlIlIIlllIl = new llIllIIIIIllIlIIIIlI[IlIIlIlIIIlIIlIlIlII.values().length];
        this.IlllllllIIIlIIIlIlII = false;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.llllIIIIlIIIlIlllIll != llllIIIIlIIIlIlllIll || this.IlIlIlIlIlllllllllIl != ilIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI = -1;
            this.IlIIIlIlIIIllIlIlIIl = -1;
            this.IlIlIIIllIllIIIIIllI = -1;
            this.IllIIlllIIIIlllIIlIl = -1;
            this.lIIIIlIIIIIlllIllIII.clear();
        }
    }
    
    public int llllIIIIlIIIlIlllIll() {
        if (this.llIllIIIIIllIlIIIIlI < 0) {
            if (this.llllIIIIlIIIlIlllIll instanceof IllIIlllIIIIlllIIlIl) {
                this.llIllIIIIIllIlIIIIlI = ((IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll).IlIIIlIlIIIllIlIlIIl();
            }
            else {
                this.llIllIIIIIllIlIIIIlI = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
            }
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        if (this.IlIIIlIlIIIllIlIlIIl < 0) {
            if (this.llllIIIIlIIIlIlllIll instanceof IllIIlllIIIIlllIIlIl) {
                this.IlIIIlIlIIIllIlIlIIl = ((IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll).IllIIlllIIIIlllIIlIl();
            }
            else {
                this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll);
            }
        }
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public float[] llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public BitSet IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final List list) {
        if (this.IlIlIIIllIllIIIIIllI == -1 && list.size() > 0) {
            if (list.get(0) instanceof lIIIlllIIIllIIIllIII) {
                this.IlIlIIIllIllIIIIIllI = 1;
            }
            else {
                this.IlIlIIIllIllIIIIIllI = 0;
            }
        }
        return this.IlIlIIIllIllIIIIIllI == 1;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IlIlIIIllIllIIIIIllI < 0) {
            if (llllIIIIlIIIlIlllIll instanceof lIIIlllIIIllIIIllIII) {
                this.IlIlIIIllIllIIIIIllI = 1;
            }
            else {
                this.IlIlIIIllIllIIIIIllI = 0;
            }
        }
        return this.IlIlIIIllIllIIIIIllI == 1;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI == 1;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public net.optifine.IlIIIlIlIIIllIlIlIIl lIIIIlIIIIIlllIllIII() {
        if (this.llIIlIIIlIIIllIlIIIl == null) {
            this.llIIlIIIlIIIllIlIIIl = new net.optifine.IlIIIlIlIIIllIlIlIIl(0, 0, 0);
        }
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public boolean[] lIIIlllIIIllIIIllIII() {
        if (this.llIllIlIIIIllIlIIllI == null) {
            this.llIllIlIIIIllIlIIllI = new boolean[4];
        }
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public boolean[] llIIlIIIlIIIllIlIIIl() {
        if (this.lIlIlIIIllIIllIIIllI == null) {
            this.lIlIlIIIllIIllIIIllI = new boolean[4];
        }
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public boolean[] llIllIlIIIIllIlIIllI() {
        if (this.IlIlIIIllIIllIlllllI == null) {
            this.IlIlIIIllIIllIlllllI = new boolean[4];
        }
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public lllIllIIIllllllIllll[] lIlIlIIIllIIllIIIllI() {
        if (this.IIIIlllIIIIIIlIIIlll == null) {
            this.IIIIlllIIIIIIlIIIlll = new lllIllIIIllllllIllll[4];
        }
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public lllIllIIIllllllIllll[] llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllIllIIIllllllIllll lllIllIIIllllllIllll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll3, final lllIllIIIllllllIllll lllIllIIIllllllIllll4) {
        final lllIllIIIllllllIllll[] lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI();
        lIlIlIIIllIIllIIIllI[0] = lllIllIIIllllllIllll;
        lIlIlIIIllIIllIIIllI[1] = lllIllIIIllllllIllll2;
        lIlIlIIIllIIllIIIllI[2] = lllIllIIIllllllIllll3;
        lIlIlIIIllIIllIIIllI[3] = lllIllIIIllllllIllll4;
        return lIlIlIIIllIIllIIIllI;
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        if (this.IllIIlllIIIIlllIIlIl == -1) {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI() && this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() instanceof lIllIlIIIllllllIIlII) {
                this.IllIIlllIIIIlllIIlIl = 1;
            }
            else {
                this.IllIIlllIIIIlllIIlIl = 0;
            }
        }
        return this.IllIIlllIIIIlllIIlIl == 1;
    }
    
    public List IIIIlllIIIIIIlIIIlll() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public llllIIIIlIIIlIlllIll[] IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IIlllIIlIllIllIlIIll[0] = llllIIIIlIIIlIlllIll;
        return this.IIlllIIlIllIllIlIIll;
    }
    
    public llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        this.lllIIIIlllllIlIIllIl[0] = llllIIIIlIIIlIlllIll;
        this.lllIIIIlllllIlIIllIl[1] = llllIIIIlIIIlIlllIll2;
        return this.lllIIIIlllllIlIIllIl;
    }
    
    public llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3) {
        this.IlIlIIIIIIlllIlIllIl[0] = llllIIIIlIIIlIlllIll;
        this.IlIlIIIIIIlllIlIllIl[1] = llllIIIIlIIIlIlllIll2;
        this.IlIlIIIIIIlllIlIllIl[2] = llllIIIIlIIIlIlllIll3;
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4) {
        this.IIllIIllIIIlIlIIIIlI[0] = llllIIIIlIIIlIlllIll;
        this.IIllIIllIIIlIlIIIIlI[1] = llllIIIIlIIIlIlllIll2;
        this.IIllIIllIIIlIlIIIIlI[2] = llllIIIIlIIIlIlllIll3;
        this.IIllIIllIIIlIlIIIIlI[3] = llllIIIIlIIIlIlllIll4;
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public List llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll[] array) {
        this.IlIllIlIlIIIlIlIlIII.clear();
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                this.IlIllIlIlIIIlIlIlIII.add(array[i]);
            }
        }
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public IlIIllIIllIIllIIlIIl llllIIllllIlIlIIIIll() {
        return this.IIIlIIIlIlIIlllIIlll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIllIIllIIllIIlIIl iiIlIIIlIlIIlllIIlll) {
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = this.IlIlIIIlIIlIlIIlllIl[ilIIlIlIIIlIIlIlIlII.ordinal()];
        if (llIllIIIIIllIlIIIIlI == null) {
            llIllIIIIIllIlIIIIlI = new llIllIIIIIllIlIIIIlI();
            this.IlIlIIIlIIlIlIIlllIl[ilIIlIlIIIlIIlIlIlII.ordinal()] = llIllIIIIIllIlIIIIlI;
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    public boolean IlIllIlIlIIIlIlIlIII() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean illlllllIIIlIIIlIlII) {
        this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
    }
}
