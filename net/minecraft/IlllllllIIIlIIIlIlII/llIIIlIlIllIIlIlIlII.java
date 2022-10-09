package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.collect.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public class llIIIlIlIllIIlIlIlII
{
    private final List llllIIIIlIIIlIlllIll;
    private final lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    
    public llIIIlIlIllIIlIlIlII(final lllIIIIlllllIlIIllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.lIIIIlIIIIIlllIllIII();
        if (this.IlIlIlIlIlllllllllIl.f_()) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII)).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI) {
                this.lIIIIlIIIIIlllIllIII = "ladder";
            }
            else if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r) {
                this.lIIIIlIIIIIlllIllIII = "vines";
            }
        }
        else if (this.IlIlIlIlIlllllllllIl.llIIIlIlllIllIIlIllI()) {
            this.lIIIIlIIIIIlllIllIII = "water";
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n, final float n2) {
        this.IlIlIIIllIllIIIIIllI();
        this.llllIIIIlIIIlIlllIll();
        final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl = new IIlllIlIIllIlIlIlIIl(lIllllllIIllIlIlIlII, this.IlIlIlIlIlllllllllIl.lllllIIIIIlIlIIIIIIl, n, n2, this.lIIIIlIIIIIlllIllIII, this.IlIlIlIlIlllllllllIl.IllIlIIllIllIIlIllII);
        this.llllIIIIlIIIlIlllIll.add(illlIlIIllIlIlIlIIl);
        this.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl.lllllIIIIIlIlIIIIIIl;
        this.llllIIIlIlllIlIIIIIl = true;
        if (illlIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI() && !this.IllIIlllIIIIlllIIlIl && this.IlIlIlIlIlllllllllIl.llllIllllIllllIlIlII()) {
            this.IllIIlllIIIIlllIIlIl = true;
            this.IlIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl.lllllIIIIIlIlIIIIIIl;
            this.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl;
            this.IlIlIlIlIlllllllllIl.ak();
        }
    }
    
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl() {
        if (this.llllIIIIlIIIlIlllIll.size() == 0) {
            return new IIllIIllIIIlIlIIIIlI("death.attack.generic", new Object[] { this.IlIlIlIlIlllllllllIl.v_() });
        }
        final IIlllIlIIllIlIlIlIIl llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl();
        final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl = this.llllIIIIlIIIlIlllIll.get(this.llllIIIIlIIIlIlllIll.size() - 1);
        final llIIIIIIlIllIIlIIIll ilIlIIIllIllIIIIIllI = illlIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI();
        final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl();
        llIIIIIIlIllIIlIIIll ilIlIlIlIlllllllllIl;
        if (llllIIIlIlllIlIIIIIl != null && illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll() == lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII) {
            final llIIIIIIlIllIIlIIIll ilIlIIIllIllIIIIIllI2 = llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI();
            if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() != lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII && llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() != lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl) {
                if (ilIlIIIllIllIIIIIllI2 != null && (ilIlIIIllIllIIIIIllI == null || !ilIlIIIllIllIIIIIllI2.equals(ilIlIIIllIllIIIIIllI))) {
                    final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl2 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl();
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = (llIIlIIIlIIIllIlIIIl2 instanceof lllIIIIlllllIlIIllIl) ? ((lllIIIIlllllIlIIllIl)llIIlIIIlIIIllIlIIIl2).n() : null;
                    if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl()) {
                        ilIlIlIlIlllllllllIl = new IIllIIllIIIlIlIIIIlI("death.fell.assist.item", new Object[] { this.IlIlIlIlIlllllllllIl.v_(), ilIlIIIllIllIIIIIllI2, lllIIIIlIlIllIIlIIIl.lllllIlIIIlIlIIlllII() });
                    }
                    else {
                        ilIlIlIlIlllllllllIl = new IIllIIllIIIlIlIIIIlI("death.fell.assist", new Object[] { this.IlIlIlIlIlllllllllIl.v_(), ilIlIIIllIllIIIIIllI2 });
                    }
                }
                else if (ilIlIIIllIllIIIIIllI != null) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = (llIIlIIIlIIIllIlIIIl instanceof lllIIIIlllllIlIIllIl) ? ((lllIIIIlllllIlIIllIl)llIIlIIIlIIIllIlIIIl).n() : null;
                    if (lllIIIIlIlIllIIlIIIl2 != null && lllIIIIlIlIllIIlIIIl2.IlIlIIIIIIlllIlIllIl()) {
                        ilIlIlIlIlllllllllIl = new IIllIIllIIIlIlIIIIlI("death.fell.finish.item", new Object[] { this.IlIlIlIlIlllllllllIl.v_(), ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl2.lllllIlIIIlIlIIlllII() });
                    }
                    else {
                        ilIlIlIlIlllllllllIl = new IIllIIllIIIlIlIIIIlI("death.fell.finish", new Object[] { this.IlIlIlIlIlllllllllIl.v_(), ilIlIIIllIllIIIIIllI });
                    }
                }
                else {
                    ilIlIlIlIlllllllllIl = new IIllIIllIIIlIlIIIIlI("death.fell.killer", new Object[] { this.IlIlIlIlIlllllllllIl.v_() });
                }
            }
            else {
                ilIlIlIlIlllllllllIl = new IIllIIllIIIlIlIIIIlI("death.fell.accident." + this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl), new Object[] { this.IlIlIlIlIlllllllllIl.v_() });
            }
        }
        else {
            ilIlIlIlIlllllllllIl = illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    public lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI() {
        lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = null;
        lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2 = null;
        float ilIlIlIlIlllllllllIl = 0.0f;
        float ilIlIlIlIlllllllllIl2 = 0.0f;
        for (final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl : this.llllIIIIlIIIlIlllIll) {
            if (illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && (lllIIIIlllllIlIIllIl2 == null || illlIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl() > ilIlIlIlIlllllllllIl2)) {
                ilIlIlIlIlllllllllIl2 = illlIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl();
                lllIIIIlllllIlIIllIl2 = (net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl();
            }
            if (illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl() instanceof lllIIIIlllllIlIIllIl && (lllIIIIlllllIlIIllIl == null || illlIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl() > ilIlIlIlIlllllllllIl)) {
                ilIlIlIlIlllllllllIl = illlIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl();
                lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl();
            }
        }
        if (lllIIIIlllllIlIIllIl2 != null && ilIlIlIlIlllllllllIl2 >= ilIlIlIlIlllllllllIl / 3.0f) {
            return lllIIIIlllllIlIIllIl2;
        }
        return lllIIIIlllllIlIIllIl;
    }
    
    private IIlllIlIIllIlIlIlIIl llllIIIlIlllIlIIIIIl() {
        IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl = null;
        IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl2 = null;
        final int n = 0;
        float illIIlllIIIIlllIIlIl = 0.0f;
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.size(); ++i) {
            final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl3 = this.llllIIIIlIIIlIlllIll.get(i);
            final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl4 = (i > 0) ? this.llllIIIIlIIIlIlllIll.get(i - 1) : null;
            if ((illlIlIIllIlIlIlIIl3.llllIIIIlIIIlIlllIll() == lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII || illlIlIIllIlIlIlIIl3.llllIIIIlIIIlIlllIll() == lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl) && illlIlIIllIlIlIlIIl3.IllIIlllIIIIlllIIlIl() > 0.0f && (illlIlIIllIlIlIlIIl == null || illlIlIIllIlIlIlIIl3.IllIIlllIIIIlllIIlIl() > illIIlllIIIIlllIIlIl)) {
                if (i > 0) {
                    illlIlIIllIlIlIlIIl = illlIlIIllIlIlIlIIl4;
                }
                else {
                    illlIlIIllIlIlIlIIl = illlIlIIllIlIlIlIIl3;
                }
                illIIlllIIIIlllIIlIl = illlIlIIllIlIlIlIIl3.IllIIlllIIIIlllIIlIl();
            }
            if (illlIlIIllIlIlIlIIl3.IlIIIlIlIIIllIlIlIIl() != null && (illlIlIIllIlIlIlIIl2 == null || illlIlIIllIlIlIlIIl3.IlIlIlIlIlllllllllIl() > n)) {
                illlIlIIllIlIlIlIIl2 = illlIlIIllIlIlIlIIl3;
            }
        }
        if (illIIlllIIIIlllIIlIl > 5.0f && illlIlIIllIlIlIlIIl != null) {
            return illlIlIIllIlIlIlIIl;
        }
        if (n > 5 && illlIlIIllIlIlIlIIl2 != null) {
            return illlIlIIllIlIlIlIIl2;
        }
        return null;
    }
    
    private String llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl) {
        return (illlIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl() == null) ? "generic" : illlIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl ? (this.IlIlIlIlIlllllllllIl.lllllIIIIIlIlIIIIIIl - this.IlIIIlIlIIIllIlIlIIl) : (this.IlIlIIIllIllIIIIIllI - this.IlIIIlIlIIIllIlIlIIl);
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        this.lIIIIlIIIIIlllIllIII = null;
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        final int n = this.IllIIlllIIIIlllIIlIl ? 300 : 100;
        if (this.llllIIIlIlllIlIIIIIl && (!this.IlIlIlIlIlllllllllIl.llllIllllIllllIlIlII() || this.IlIlIlIlIlllllllllIl.lllllIIIIIlIlIIIIIIl - this.llIllIIIIIllIlIIIIlI > n)) {
            final boolean illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = false;
            this.IllIIlllIIIIlllIIlIl = false;
            this.IlIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl.lllllIIIIIlIlIIIIIIl;
            if (illIIlllIIIIlllIIlIl) {
                this.IlIlIlIlIlllllllllIl.al();
            }
            this.llllIIIIlIIIlIlllIll.clear();
        }
    }
    
    public lllIIIIlllllIlIIllIl IllIIlllIIIIlllIIlIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
