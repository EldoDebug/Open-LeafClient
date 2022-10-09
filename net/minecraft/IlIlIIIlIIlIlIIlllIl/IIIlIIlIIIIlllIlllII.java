package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class IIIlIIlIIIIlllIlllII extends IlIlIllllllllIIIIlII implements llllIIIIlIIIlIlllIll, llIIIllIlIllIllIIIIl
{
    private lllIIIIlIlIllIIlIIIl[] IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    
    public IIIlIIlIIIIlllIlllII() {
        this.IlIlIIIllIllIIIIIllI = new lllIIIIlIlIllIIlIIIl[5];
        this.llllIIIlIlllIlIIIIIl = -1;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Items", 10);
        this.IlIlIIIllIllIIIIIllI = new lllIIIIlIlIllIIlIIIl[this.lIIIlllIIIllIIIllIII()];
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CustomName", 8)) {
            this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("CustomName");
        }
        this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("TransferCooldown");
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
            final byte ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Slot");
            if (ilIIIlIlIIIllIlIlIIl >= 0 && ilIIIlIlIIIllIlIlIIl < this.IlIlIIIllIllIIIIIllI.length) {
                this.IlIlIIIllIllIIIIIllI[ilIIIlIlIIIllIlIlIIl] = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.length; ++i) {
            if (this.IlIlIIIllIllIIIIIllI[i] != null) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Slot", (byte)i);
                this.IlIlIIIllIllIIIIIllI[i].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Items", ilIlIIIlIIlIlIIlllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TransferCooldown", this.llllIIIlIlllIlIIIIIl);
        if (this.w_()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomName", this.IllIIlllIIIIlllIIlIl);
        }
    }
    
    @Override
    public void llIIIlIlIllIIlIlIlII() {
        super.llIIIlIlIllIIlIlIlII();
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIlIIIllIllIIIIIllI.length;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return this.IlIlIIIllIllIIIIIllI[n];
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.IlIlIIIllIllIIIIIllI[n] == null) {
            return null;
        }
        if (this.IlIlIIIllIllIIIIIllI[n].IlIlIlIlIlllllllllIl <= n2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.IlIlIIIllIllIIIIIllI[n];
            this.IlIlIIIllIllIIIIIllI[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI[n].llllIIIIlIIIlIlllIll(n2);
        if (this.IlIlIIIllIllIIIIIllI[n].IlIlIlIlIlllllllllIl == 0) {
            this.IlIlIIIllIllIIIIIllI[n] = null;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (this.IlIlIIIllIllIIIIIllI[n] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.IlIlIIIllIllIIIIIllI[n];
            this.IlIlIIIllIllIIIIIllI[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IlIlIIIllIllIIIIIllI[n] = lllIIIIlIlIllIIlIIIl;
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > this.lllllIlIIIlIlIIlllII()) {
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = this.lllllIlIIIlIlIIlllII();
        }
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.IllIIlllIIIIlllIIlIl : "container.hopper";
    }
    
    @Override
    public boolean w_() {
        return this.IllIIlllIIIIlllIIlIl != null && this.IllIIlllIIIIlllIIlIl.length() > 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final String illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
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
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll != null && !this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) {
            --this.llllIIIlIlllIlIIIIIl;
            if (!this.IlIlIIIlIIlIlIIlllIl()) {
                this.IlIlIlIlIlllllllllIl(0);
                this.IIIlIIIlIlIIlllIIlll();
            }
        }
    }
    
    public boolean IIIlIIIlIlIIlllIIlll() {
        if (this.llllIIIIlIIIlIlllIll != null && !this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) {
            if (!this.IlIlIIIlIIlIlIIlllIl() && lllIlIIIIIlIlllllIlI.IllIIlllIIIIlllIIlIl(this.llIIlIIIlIIIllIlIIIl())) {
                boolean ilIlIllllllllIIIIlII = false;
                if (!this.IIlIIIIlllIlllllIlII()) {
                    ilIlIllllllllIIIIlII = this.IlIlIllllllllIIIIlII();
                }
                if (!this.IIIlIIlIIIIlllIlllII()) {
                    ilIlIllllllllIIIIlII = (llllIIIIlIIIlIlllIll(this) || ilIlIllllllllIIIIlII);
                }
                if (ilIlIllllllllIIIIlII) {
                    this.IlIlIlIlIlllllllllIl(8);
                    this.llIIIlIlIllIIlIlIlII();
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    private boolean IIlIIIIlllIlllllIlII() {
        lllIIIIlIlIllIIlIIIl[] ilIlIIIllIllIIIIIllI;
        for (int length = (ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI).length, i = 0; i < length; ++i) {
            if (ilIlIIIllIllIIIIIllI[i] != null) {
                return false;
            }
        }
        return true;
    }
    
    private boolean IIIlIIlIIIIlllIlllII() {
        lllIIIIlIlIllIIlIIIl[] ilIlIIIllIllIIIIIllI;
        for (int length = (ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI).length, i = 0; i < length; ++i) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIlIIIllIllIIIIIllI[i];
            if (lllIIIIlIlIllIIlIIIl == null || lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl != lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl()) {
                return false;
            }
        }
        return true;
    }
    
    private boolean IlIlIllllllllIIIIlII() {
        final llIIIlIlIllIIlIlIlII iIlllIlIIllIlIlIlIIl = this.IIlllIlIIllIlIlIlIIl();
        if (iIlllIlIIllIlIlIlIIl == null) {
            return false;
        }
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = lllIlIIIIIlIlllllIlI.IlIlIIIllIllIIIIIllI(this.llIIlIIIlIIIllIlIIIl()).IlIlIIIllIllIIIIIllI();
        if (this.llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl, ilIlIIIllIllIIIIIllI)) {
            return false;
        }
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII(); ++i) {
            if (this.lIlIlIIIllIIllIIIllI(i) != null) {
                final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = this.lIlIlIIIllIIllIIIllI(i).llIIlIIIlIIIllIlIIIl();
                final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl(i, 1), ilIlIIIllIllIIIIIllI);
                if (llllIIIIlIIIlIlllIll == null || llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl == 0) {
                    iIlllIlIIllIlIlIlIIl.llIIIlIlIllIIlIlIlII();
                    return true;
                }
                this.llIllIIIIIllIlIIIIlI(i, llIIlIIIlIIIllIlIIIl);
            }
        }
        return false;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (llIIIlIlIllIIlIlIlII instanceof lllllIlIIIlIlIIlllII) {
            final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = (lllllIlIIIlIlIIlllII)llIIIlIlIllIIlIlIlII;
            final int[] llllIIIIlIIIlIlllIll = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(llllIIIIlIIIlIlllIll[i]);
                if (lIlIlIIIllIIllIIIllI == null || lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl != lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl()) {
                    return false;
                }
            }
        }
        else {
            for (int liiIlllIIIllIIIllIII = llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII(), j = 0; j < liiIlllIIIllIIIllIII; ++j) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI2 = llIIIlIlIllIIlIlIlII.lIlIlIIIllIIllIIIllI(j);
                if (lIlIlIIIllIIllIIIllI2 == null || lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl != lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean IlIlIlIlIlllllllllIl(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (llIIIlIlIllIIlIlIlII instanceof lllllIlIIIlIlIIlllII) {
            final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = (lllllIlIIIlIlIIlllII)llIIIlIlIllIIlIlIlII;
            final int[] llllIIIIlIIIlIlllIll = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
                if (lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(llllIIIIlIIIlIlllIll[i]) != null) {
                    return false;
                }
            }
        }
        else {
            for (int liiIlllIIIllIIIllIII = llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII(), j = 0; j < liiIlllIIIllIIIllIII; ++j) {
                if (llIIIlIlIllIIlIlIlII.lIlIlIIIllIIllIIIllI(j) != null) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final llIIIlIlIllIIlIlIlII ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (ilIlIlIlIlllllllllIl != null) {
            final lllIllIIIllllllIllll llllIIIIlIIIlIlllIll2 = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
            if (IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2)) {
                return false;
            }
            if (ilIlIlIlIlllllllllIl instanceof lllllIlIIIlIlIIlllII) {
                final int[] llllIIIIlIIIlIlllIll3 = ((lllllIlIIIlIlIIlllII)ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                for (int i = 0; i < llllIIIIlIIIlIlllIll3.length; ++i) {
                    if (llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll3[i], llllIIIIlIIIlIlllIll2)) {
                        return true;
                    }
                }
            }
            else {
                for (int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), j = 0; j < liiIlllIIIllIIIllIII; ++j) {
                    if (llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, j, llllIIIIlIIIlIlllIll2)) {
                        return true;
                    }
                }
            }
        }
        else {
            final Iterator<lIIIlllIIIllIIIllIII> iterator = (Iterator<lIIIlllIIIllIIIllIII>)llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII(), llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll(), llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI() + 1.0, llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl()).iterator();
            while (iterator.hasNext()) {
                if (llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, iterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = llIIIlIlIllIIlIlIlII.lIlIlIIIllIIllIIIllI(n);
        if (lIlIlIIIllIIllIIIllI != null && IlIlIlIlIlllllllllIl(llIIIlIlIllIIlIlIlII, lIlIlIIIllIIllIIIllI, n, lllIllIIIllllllIllll)) {
            final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl(n, 1), null);
            if (llllIIIIlIIIlIlllIll2 == null || llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == 0) {
                llIIIlIlIllIIlIlIlII.llIIIlIlIllIIlIlIlII();
                return true;
            }
            llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(n, llIIlIIIlIIIllIlIIIl);
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        boolean b = false;
        if (liiIlllIIIllIIIllIII == null) {
            return false;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII().llIIlIIIlIIIllIlIIIl(), null);
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl != 0) {
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        else {
            b = true;
            liiIlllIIIllIIIllIII.IllIllIIIIlIIlIlllII();
        }
        return b;
    }
    
    public static lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (llIIIlIlIllIIlIlIlII instanceof lllllIlIIIlIlIIlllII && lllIllIIIllllllIllll != null) {
            final int[] llllIIIIlIIIlIlllIll = ((lllllIlIIIlIlIIlllII)llIIIlIlIllIIlIlIlII).llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            for (int n = 0; n < llllIIIIlIIIlIlllIll.length && lllIIIIlIlIllIIlIIIl != null; lllIIIIlIlIllIIlIIIl = llIllIIIIIllIlIIIIlI(llIIIlIlIllIIlIlIlII, lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll[n], lllIllIIIllllllIllll), ++n) {
                if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                    break;
                }
            }
        }
        else {
            for (int liiIlllIIIllIIIllIII = llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII(), n2 = 0; n2 < liiIlllIIIllIIIllIII && lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > 0; lllIIIIlIlIllIIlIIIl = llIllIIIIIllIlIIIIlI(llIIIlIlIllIIlIlIlII, lllIIIIlIlIllIIlIIIl, n2, lllIllIIIllllllIllll), ++n2) {}
        }
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == 0) {
            lllIIIIlIlIllIIlIIIl = null;
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl(n, lllIIIIlIlIllIIlIIIl) && (!(llIIIlIlIllIIlIlIlII instanceof lllllIlIIIlIlIIlllII) || ((lllllIlIIIlIlIIlllII)llIIIlIlIllIIlIlIlII).llllIIIIlIIIlIlllIll(n, lllIIIIlIlIllIIlIIIl, lllIllIIIllllllIllll));
    }
    
    private static boolean IlIlIlIlIlllllllllIl(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return !(llIIIlIlIllIIlIlIlII instanceof lllllIlIIIlIlIIlllII) || ((lllllIlIIIlIlIIlllII)llIIIlIlIllIIlIlIlII).IlIlIlIlIlllllllllIl(n, lllIIIIlIlIllIIlIIIl, lllIllIIIllllllIllll);
    }
    
    private static lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = llIIIlIlIllIIlIlIlII.lIlIlIIIllIIllIIIllI(n);
        if (llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, lllIIIIlIlIllIIlIIIl, n, lllIllIIIllllllIllll)) {
            int n2 = 0;
            if (lIlIlIIIllIIllIIIllI == null) {
                llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(n, lllIIIIlIlIllIIlIIIl);
                lllIIIIlIlIllIIlIIIl = null;
                n2 = 1;
            }
            else if (llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, lllIIIIlIlIllIIlIIIl)) {
                final int min = Math.min(lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl, lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl() - lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl);
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = lllIIIIlIlIllIIlIIIl;
                lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl -= min;
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl3 = lIlIlIIIllIIllIIIllI;
                lllIIIIlIlIllIIlIIIl3.IlIlIlIlIlllllllllIl += min;
                n2 = ((min > 0) ? 1 : 0);
            }
            if (n2 != 0) {
                if (llIIIlIlIllIIlIlIlII instanceof IIIlIIlIIIIlllIlllII) {
                    final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)llIIIlIlIllIIlIlIlII;
                    if (iiIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII()) {
                        iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(8);
                    }
                    llIIIlIlIllIIlIlIlII.llIIIlIlIllIIlIlIlII();
                }
                llIIIlIlIllIIlIlIlII.llIIIlIlIllIIlIlIlII();
            }
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    private llIIIlIlIllIIlIlIlII IIlllIlIIllIlIlIlIIl() {
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = lllIlIIIIIlIlllllIlI.IlIlIIIllIllIIIIIllI(this.llIIlIIIlIIIllIlIIIl());
        return IlIlIlIlIlllllllllIl(this.IIlllIIIlIlllIIlllII(), this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + ilIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII(), this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + ilIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII(), this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + ilIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl());
    }
    
    public static llIIIlIlIllIIlIlIlII IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII(), llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll(), llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI() + 1.0, llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl());
    }
    
    public static List llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        return illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n - 0.5, n2 - 0.5, n3 - 0.5, n + 0.5, n2 + 0.5, n3 + 0.5), llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll);
    }
    
    public static llIIIlIlIllIIlIlIlII IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        llIIIlIlIllIIlIlIlII liiIlllIIIllIIIllIII = null;
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3));
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll()) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll instanceof llIIIlIlIllIIlIlIlII) {
                liiIlllIIIllIIIllIII = (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll;
                if (liiIlllIIIllIIIllIII instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIlIIIllIIllIlllllI && llIllIIIIIllIlIIIIlI instanceof IIlIIIIIllIlIIIlIIll) {
                    liiIlllIIIllIIIllIII = ((IIlIIIIIllIlIIIlIIll)llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
                }
            }
        }
        if (liiIlllIIIllIIIllIII == null) {
            final List llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n - 0.5, n2 - 0.5, n3 - 0.5, n + 0.5, n2 + 0.5, n3 + 0.5), llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI);
            if (llllIIIIlIIIlIlllIll2.size() > 0) {
                liiIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll2.get(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(llllIIIIlIIIlIlllIll2.size()));
            }
        }
        return liiIlllIIIllIIIllIII;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        return lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll() && lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == lllIIIIlIlIllIIlIIIl2.lIIIIlIIIIIlllIllIII() && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl() && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, lllIIIIlIlIllIIlIIIl2);
    }
    
    @Override
    public double IIlIIIIIllIlIIIlIIll() {
        return this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5;
    }
    
    @Override
    public double llllllIllIllIlIllllI() {
        return this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5;
    }
    
    @Override
    public double IIIllllllIllIIIlllIl() {
        return this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5;
    }
    
    public void IlIlIlIlIlllllllllIl(final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public boolean IlIlIIIlIIlIlIIlllIl() {
        return this.llllIIIlIlllIlIIIIIl > 0;
    }
    
    public boolean IlllllllIIIlIIIlIlII() {
        return this.llllIIIlIlllIlIIIIIl <= 1;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "minecraft:hopper";
    }
    
    @Override
    public net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new llllIIllllIlIlIIIIll(illIIlllIIIIlllIIlIl, this, llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n) {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 0;
    }
    
    @Override
    public void lIllllllIIllIlIlIlII() {
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.length; ++i) {
            this.IlIlIIIllIllIIIIIllI[i] = null;
        }
    }
}
