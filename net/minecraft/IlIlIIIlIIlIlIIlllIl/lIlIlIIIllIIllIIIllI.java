package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class lIlIlIIIllIIllIIIllI extends IlIlIllllllllIIIIlII implements llIIIllIlIllIllIIIIl, lllllIlIIIlIlIIlllII
{
    private static final int[] IlIlIIIllIllIIIIIllI;
    private static final int[] IllIIlllIIIIlllIIlIl;
    private lllIIIIlIlIllIIlIIIl[] llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private boolean[] lIIIlllIIIllIIIllIII;
    private net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl;
    private String llIllIlIIIIllIlIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = new int[] { 3 };
        IllIIlllIIIIlllIIlIl = new int[] { 0, 1, 2 };
    }
    
    public lIlIlIIIllIIllIIIllI() {
        this.llllIIIlIlllIlIIIIIl = new lllIIIIlIlIllIIlIIIl[4];
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.llIllIlIIIIllIlIIllI : "container.brewing";
    }
    
    @Override
    public boolean w_() {
        return this.llIllIlIIIIllIlIIllI != null && this.llIllIlIIIIllIlIIllI.length() > 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final String llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.llllIIIlIlllIlIIIIIl.length;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (this.lIIIIlIIIIIlllIllIII > 0) {
            --this.lIIIIlIIIIIlllIllIII;
            if (this.lIIIIlIIIIIlllIllIII == 0) {
                this.IlllllllIIIlIIIlIlII();
                this.llIIIlIlIllIIlIlIlII();
            }
            else if (!this.IlIlIIIlIIlIlIIlllIl()) {
                this.lIIIIlIIIIIlllIllIII = 0;
                this.llIIIlIlIllIIlIlIlII();
            }
            else if (this.llIIlIIIlIIIllIlIIIl != this.llllIIIlIlllIlIIIIIl[3].llllIIIIlIIIlIlllIll()) {
                this.lIIIIlIIIIIlllIllIII = 0;
                this.llIIIlIlIllIIlIlIlII();
            }
        }
        else if (this.IlIlIIIlIIlIlIIlllIl()) {
            this.lIIIIlIIIIIlllIllIII = 400;
            this.llIIlIIIlIIIllIlIIIl = this.llllIIIlIlllIlIIIIIl[3].llllIIIIlIIIlIlllIll();
        }
        if (!this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) {
            final boolean[] iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll();
            if (!Arrays.equals(iiIlIIIlIlIIlllIIlll, this.lIIIlllIIIllIIIllIII)) {
                this.lIIIlllIIIllIIIllIII = iiIlIIIlIlIIlllIIlll;
                llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI());
                if (!(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() instanceof IlllllllIIIlIIIlIlII)) {
                    return;
                }
                for (int i = 0; i < IlllllllIIIlIIIlIlII.IIIIIIIIIlllIllIlIlI.length; ++i) {
                    llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlllllllIIIlIIIlIlII.IIIIIIIIIlllIllIlIlI[i], iiIlIIIlIlIIlllIIlll[i]);
                }
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 2);
            }
        }
    }
    
    private boolean IlIlIIIlIIlIlIIlllIl() {
        if (this.llllIIIlIlllIlIIIIIl[3] == null || this.llllIIIlIlllIlIIIIIl[3].IlIlIlIlIlllllllllIl <= 0) {
            return false;
        }
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIlIlllIlIIIIIl[3];
        if (!lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IllIIlllIIIIlllIIlIl(lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        boolean b = false;
        for (int i = 0; i < 3; ++i) {
            if (this.llllIIIlIlllIlIIIIIl[i] != null && this.llllIIIlIlllIlIIIIIl[i].llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.D) {
                final int liiiIlIIIIIlllIllIII = this.llllIIIlIlllIlIIIIIl[i].lIIIIlIIIIIlllIllIII();
                final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, lllIIIIlIlIllIIlIIIl);
                if (!lllllIIIIIlIIlllIlIl.IllIIlllIIIIlllIIlIl(liiiIlIIIIIlllIllIII) && lllllIIIIIlIIlllIlIl.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll)) {
                    b = true;
                    break;
                }
                final List ilIlIIIllIllIIIIIllI = IIllIIllIIIlIlIIIIlI.D.IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII);
                final List ilIlIIIllIllIIIIIllI2 = IIllIIllIIIlIlIIIIlI.D.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll);
                if ((liiiIlIIIIIlllIllIII <= 0 || ilIlIIIllIllIIIIIllI != ilIlIIIllIllIIIIIllI2) && (ilIlIIIllIllIIIIIllI == null || (!ilIlIIIllIllIIIIIllI.equals(ilIlIIIllIllIIIIIllI2) && ilIlIIIllIllIIIIIllI2 != null)) && liiiIlIIIIIlllIllIII != llllIIIIlIIIlIlllIll) {
                    b = true;
                    break;
                }
            }
        }
        return b;
    }
    
    private void IlllllllIIIlIIIlIlII() {
        if (this.IlIlIIIlIIlIlIIlllIl()) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIlIlllIlIIIIIl[3];
            for (int i = 0; i < 3; ++i) {
                if (this.llllIIIlIlllIlIIIIIl[i] != null && this.llllIIIlIlllIlIIIIIl[i].llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.D) {
                    final int liiiIlIIIIIlllIllIII = this.llllIIIlIlllIlIIIIIl[i].lIIIIlIIIIIlllIllIII();
                    final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, lllIIIIlIlIllIIlIIIl);
                    final List ilIlIIIllIllIIIIIllI = IIllIIllIIIlIlIIIIlI.D.IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII);
                    final List ilIlIIIllIllIIIIIllI2 = IIllIIllIIIlIlIIIIlI.D.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll);
                    if ((liiiIlIIIIIlllIllIII > 0 && ilIlIIIllIllIIIIIllI == ilIlIIIllIllIIIIIllI2) || (ilIlIIIllIllIIIIIllI != null && (ilIlIIIllIllIIIIIllI.equals(ilIlIIIllIllIIIIIllI2) || ilIlIIIllIllIIIIIllI2 == null))) {
                        if (!lllllIIIIIlIIlllIlIl.IllIIlllIIIIlllIIlIl(liiiIlIIIIIlllIllIII) && lllllIIIIIlIIlllIlIl.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll)) {
                            this.llllIIIlIlllIlIIIIIl[i].IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                        }
                    }
                    else if (liiiIlIIIIIlllIllIII != llllIIIIlIIIlIlllIll) {
                        this.llllIIIlIlllIlIIIIIl[i].IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                    }
                }
            }
            if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().llIllIlIIIIllIlIIllI()) {
                this.llllIIIlIlllIlIIIIIl[3] = new lllIIIIlIlIllIIlIIIl(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl());
            }
            else {
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = this.llllIIIlIlllIlIIIIIl[3];
                --lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl;
                if (this.llllIIIlIlllIlIIIIIl[3].IlIlIlIlIlllllllllIl <= 0) {
                    this.llllIIIlIlllIlIIIIIl[3] = null;
                }
            }
        }
    }
    
    private int llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return (lllIIIIlIlIllIIlIIIl == null) ? n : (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IllIIlllIIIIlllIIlIl(lllIIIIlIlIllIIlIIIl) ? net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl)) : n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Items", 10);
        this.llllIIIlIlllIlIIIIIl = new lllIIIIlIlIllIIlIIIl[this.lIIIlllIIIllIIIllIII()];
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
            final byte ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Slot");
            if (ilIIIlIlIIIllIlIlIIl >= 0 && ilIIIlIlIIIllIlIlIIl < this.llllIIIlIlllIlIIIIIl.length) {
                this.llllIIIlIlllIlIIIIIl[ilIIIlIlIIIllIlIlIIl] = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            }
        }
        this.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("BrewTime");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CustomName", 8)) {
            this.llIllIlIIIIllIlIIllI = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("CustomName");
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BrewTime", (short)this.lIIIIlIIIIIlllIllIII);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            if (this.llllIIIlIlllIlIIIIIl[i] != null) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Slot", (byte)i);
                this.llllIIIlIlllIlIIIIIl[i].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Items", ilIlIIIlIIlIlIIlllIl);
        if (this.w_()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomName", this.llIllIlIIIIllIlIIllI);
        }
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return (n >= 0 && n < this.llllIIIlIlllIlIIIIIl.length) ? this.llllIIIlIlllIlIIIIIl[n] : null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (n >= 0 && n < this.llllIIIlIlllIlIIIIIl.length) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIlIlllIlIIIIIl[n];
            this.llllIIIlIlllIlIIIIIl[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (n >= 0 && n < this.llllIIIlIlllIlIIIIIl.length) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIlIlllIlIIIIIl[n];
            this.llllIIIlIlllIlIIIIIl[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (n >= 0 && n < this.llllIIIlIlllIlIIIIIl.length) {
            this.llllIIIlIlllIlIIIIIl[n] = lllIIIIlIlIllIIlIIIl;
        }
    }
    
    @Override
    public int lllllIlIIIlIlIIlllII() {
        return 64;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl) == this && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5) <= 64.0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return (n == 3) ? lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IllIIlllIIIIlllIIlIl(lllIIIIlIlIllIIlIIIl) : (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.D || lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.E);
    }
    
    public boolean[] IIIlIIIlIlIIlllIIlll() {
        final boolean[] array = new boolean[3];
        for (int i = 0; i < 3; ++i) {
            if (this.llllIIIlIlllIlIIIIIl[i] != null) {
                array[i] = true;
            }
        }
        return array;
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) ? lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI : lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.IlIIIlIlIIIllIlIlIIl(n, lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return true;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "minecraft:brewing_stand";
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new IlIlIIIllIllIIIIIllI(illIIlllIIIIlllIIlIl, this);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n) {
        switch (n) {
            case 0: {
                return this.lIIIIlIIIIIlllIllIII;
            }
            default: {
                return 0;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int liiiIlIIIIIlllIllIII) {
        switch (n) {
            case 0: {
                this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
                break;
            }
        }
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 1;
    }
    
    @Override
    public void lIllllllIIllIlIlIlII() {
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            this.llllIIIlIlllIlIIIIIl[i] = null;
        }
    }
}
