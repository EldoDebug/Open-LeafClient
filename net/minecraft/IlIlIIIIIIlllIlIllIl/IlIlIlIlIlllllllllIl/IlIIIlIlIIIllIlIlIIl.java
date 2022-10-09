package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IlIIIlIlIIIllIlIlIIl
{
    public IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private IlIlIlIlIlllllllllIl lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.lIIIlllIIIllIIIllIII = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.llIllIlIIIIllIlIIllI = -1;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI) {
        (this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.K);
        this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII();
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new llIIIllIlIllIllIIIIl(IIIllIIIlIlIIllIIIlI.IlIlIlIlIlllllllllIl, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[] { this.IlIlIlIlIlllllllllIl }));
    }
    
    public lllIllIIIllllllIllll llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI();
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void IlIlIlIlIlllllllllIl(final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI) {
        if (this.llIllIIIIIllIlIIIIlI == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
        this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        ++this.llllIIIlIlllIlIIIIIl;
        if (this.lIIIIlIIIIIlllIllIII) {
            final int n = this.llllIIIlIlllIlIIIIIl - this.llIIlIIIlIIIllIlIIIl;
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                this.lIIIIlIIIIIlllIllIII = false;
            }
            else {
                final float n2 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII, this.lIIIlllIIIllIIIllIII) * (n + 1);
                final int llIllIlIIIIllIlIIllI = (int)(n2 * 10.0f);
                if (llIllIlIIIIllIlIIllI != this.llIllIlIIIIllIlIIllI) {
                    this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl.IlllIIIIlIIIlIlIlIIl(), this.lIIIlllIIIllIIIllIII, llIllIlIIIIllIlIIllI);
                    this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
                }
                if (n2 >= 1.0f) {
                    this.lIIIIlIIIIIlllIllIII = false;
                    this.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII);
                }
            }
        }
        else if (this.IlIIIlIlIIIllIlIlIIl) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl.IlllIIIIlIIIlIlIlIIl(), this.IllIIlllIIIIlllIIlIl, -1);
                this.llIllIlIIIIllIlIIllI = -1;
                this.IlIIIlIlIIIllIlIlIIl = false;
            }
            else {
                final int llIllIlIIIIllIlIIllI2 = (int)(llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII, this.lIIIlllIIIllIIIllIII) * (this.llllIIIlIlllIlIIIIIl - this.IlIlIIIllIllIIIIIllI + 1) * 10.0f);
                if (llIllIlIIIIllIlIIllI2 != this.llIllIlIIIIllIlIIllI) {
                    this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl.IlllIIIIlIIIlIlIlIIl(), this.IllIIlllIIIIlllIIlIl, llIllIlIIIIllIlIIllI2);
                    this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI2;
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (this.llIllIIIIIllIlIIIIlI()) {
            if (!this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(null, illIIlllIIIIlllIIlIl, lllIllIIIllllllIllll)) {
                this.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl);
            }
        }
        else {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI();
            if (this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()) {
                if (this.llIllIIIIIllIlIIIIlI == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                    return;
                }
                if (!this.IlIlIlIlIlllllllllIl.as()) {
                    final lllIIIIlIlIllIIlIIIl p2 = this.IlIlIlIlIlllllllllIl.p();
                    if (p2 == null) {
                        return;
                    }
                    if (!p2.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)) {
                        return;
                    }
                }
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(null, illIIlllIIIIlllIIlIl, lllIllIIIllllllIllll);
            this.IlIlIIIllIllIIIIIllI = this.llllIIIlIlllIlIIIIIl;
            float llllIIIIlIIIlIlllIll = 1.0f;
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl, this.IlIlIlIlIlllllllllIl);
                llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII, illIIlllIIIIlllIIlIl);
            }
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll >= 1.0f) {
                this.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl);
            }
            else {
                this.IlIIIlIlIIIllIlIlIIl = true;
                this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
                final int llIllIlIIIIllIlIIllI = (int)(llllIIIIlIIIlIlllIll * 10.0f);
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl.IlllIIIIlIIIlIlIlIIl(), illIIlllIIIIlllIIlIl, llIllIlIIIIllIlIIllI);
                this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII) {
        if (liiIlllIIIllIIIllIII.equals(this.IllIIlllIIIIlllIIlIl)) {
            final int n = this.llllIIIlIlllIlIIIIIl - this.IlIlIIIllIllIIIIIllI;
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII, liiIlllIIIllIIIllIII) * (n + 1) >= 0.7f) {
                    this.IlIIIlIlIIIllIlIlIIl = false;
                    this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl.IlllIIIIlIIIlIlIlIIl(), liiIlllIIIllIIIllIII, -1);
                    this.IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII);
                }
                else if (!this.lIIIIlIIIIIlllIllIII) {
                    this.IlIIIlIlIIIllIlIlIIl = false;
                    this.lIIIIlIIIIIlllIllIII = true;
                    this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
                    this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI;
                }
            }
        }
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl.IlllIIIIlIIIlIlIlIIl(), this.IllIIlllIIIIlllIIlIl, -1);
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, this.IlIlIlIlIlllllllllIl);
        final boolean liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        if (liiiIlIIIIIlllIllIII) {
            ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
        }
        return liiiIlIIIIIlllIllIII;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl() && this.IlIlIlIlIlllllllllIl.n() != null && this.IlIlIlIlIlllllllllIl.n().llllIIIIlIIIlIlllIll() instanceof IllIlllIllIIIIllllII) {
            return false;
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()) {
            if (this.llIllIIIIIllIlIIIIlI == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                return false;
            }
            if (!this.IlIlIlIlIlllllllllIl.as()) {
                final lllIIIIlIlIllIIlIIIl p = this.IlIlIlIlIlllllllllIl.p();
                if (p == null) {
                    return false;
                }
                if (!p.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI())) {
                    return false;
                }
            }
        }
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 2001, ilIlIlIlIlllllllllIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2));
        final boolean llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        if (this.llIllIIIIIllIlIIIIlI()) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlllIIIIlIIIlIlIlIIl(this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl));
        }
        else {
            final lllIIIIlIlIllIIlIIIl p2 = this.IlIlIlIlIlllllllllIl.p();
            final boolean ilIlIlIlIlllllllllIl3 = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI());
            if (p2 != null) {
                p2.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl);
                if (p2.IlIlIlIlIlllllllllIl == 0) {
                    this.IlIlIlIlIlllllllllIl.q();
                }
            }
            if (llIllIIIIIllIlIIIIlI && ilIlIlIlIlllllllllIl3) {
                ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll);
            }
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.llIllIIIIIllIlIIIIlI == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            return false;
        }
        final int ilIlIlIlIlllllllllIl = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        final int liiiIlIIIIIlllIllIII = lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll2 != lllIIIIlIlIllIIlIIIl || (llllIIIIlIIIlIlllIll2 != null && (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl != ilIlIlIlIlllllllllIl || llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI() > 0 || llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() != liiiIlIIIIIlllIllIII))) {
            llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = llllIIIIlIIIlIlllIll2;
            if (this.llIllIIIIIllIlIIIIlI()) {
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                if (llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl()) {
                    llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII);
                }
            }
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == 0) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = null;
            }
            if (!llllIIIIlIIIlIlllIll.g()) {
                ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI);
            }
            return true;
        }
        return false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (this.llIllIIIIIllIlIIIIlI == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll2 instanceof IIIIlllIIIIIIlIIIlll) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
                IIIIlllIIIIIIlIIIlll liiIlllIIIllIIIllIII = (IIIIlllIIIIIIlIIIlll)llllIIIIlIIIlIlllIll2;
                if (liiIlllIIIllIIIllIII instanceof IlIlIIIllIIllIlllllI && llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll) {
                    liiIlllIIIllIIIllIII = ((net.minecraft.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll)llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
                }
                if (liiIlllIIIllIIIllIII != null) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIIIlIlIllIIlIlIlII)liiIlllIIIllIIIllIII);
                    return true;
                }
            }
            else if (llllIIIIlIIIlIlllIll2 instanceof llIIIlIlIllIIlIlIlII) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll2);
                return true;
            }
            return false;
        }
        if (!llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl() || llllIIIIlIIIlIlllIll.n() == null) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll, n, n2, n3)) {
                return true;
            }
        }
        if (lllIIIIlIlIllIIlIIIl == null) {
            return false;
        }
        if (this.llIllIIIIIllIlIIIIlI()) {
            final int liiiIlIIIIIlllIllIII = lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
            final int ilIlIlIlIlllllllllIl3 = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            final boolean llllIIIIlIIIlIlllIll3 = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3);
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII);
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl3;
            return llllIIIIlIIIlIlllIll3;
        }
        return lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
}
