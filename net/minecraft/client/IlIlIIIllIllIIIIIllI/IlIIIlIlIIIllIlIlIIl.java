package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private final Minecraft llllIIIIlIIIlIlllIll;
    private final lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl;
    private IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl;
    private float IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private lllIllIIIllllllIllll lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    
    public IlIIIlIlIIIllIlIlIIl(final Minecraft llllIIIIlIIIlIlllIll, final lIIIIlIIIIIlllIllIII ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = new IlIlIlIlIlllllllllIl(-1, -1, -1);
        this.lIIIlllIIIllIIIllIII = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (!minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(minecraft.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll)) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.K);
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll liiIlllIIIllIIIllIII) {
        (this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII).llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.K);
    }
    
    public void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = -180.0f;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI()) {
            if (this.lIIIlllIIIllIIIllIII == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                return false;
            }
            if (!this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.as()) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
                final lllIIIIlIlIllIIlIIIl p2 = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.p();
                if (p2 == null) {
                    return false;
                }
                if (!p2.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)) {
                    return false;
                }
            }
        }
        if (this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl() && this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.n() != null && this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.n().llllIIIIlIIIlIlllIll() instanceof IllIlllIllIIIIllllII) {
            return false;
        }
        final llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl;
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            return false;
        }
        illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(2001, ilIlIlIlIlllllllllIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2));
        final boolean liiiIlIIIIIlllIllIII = illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        if (liiiIlIIIIIlllIllIII) {
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
        }
        this.llIllIIIIIllIlIIIIlI = new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII(), -1, this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl());
        if (!this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl()) {
            final lllIIIIlIlIllIIlIIIl p3 = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.p();
            if (p3 != null) {
                p3.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llIllIIIIIllIlIIIIlI2, ilIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                if (p3.IlIlIlIlIlllllllllIl == 0) {
                    this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.q();
                }
            }
        }
        return liiiIlIIIIIlllIllIII;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI()) {
            if (this.lIIIlllIIIllIIIllIII == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                return false;
            }
            if (!this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.as()) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI();
                final lllIIIIlIlIllIIlIIIl p2 = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.p();
                if (p2 == null) {
                    return false;
                }
                if (!p2.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI2)) {
                    return false;
                }
            }
        }
        if (!this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI)) {
            return false;
        }
        if (this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl()) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll));
            llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this, llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll);
            this.llllIIIlIlllIlIIIIIl = 5;
        }
        else if (!this.lIIIIlIIIIIlllIllIII || !this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI)) {
            if (this.lIIIIlIIIIIlllIllIII) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll));
            }
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll));
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI();
            final boolean b = llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
            if (b && this.IlIlIIIllIllIIIIIllI == 0.0f) {
                llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, llIllIIIIIllIlIIIIlI, this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
            }
            if (b && llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII, this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI) >= 1.0f) {
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll);
            }
            else {
                this.lIIIIlIIIIIlllIllIII = true;
                this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
                this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.n();
                this.IlIlIIIllIllIIIIIllI = 0.0f;
                this.IllIIlllIIIIlllIIlIl = 0.0f;
                this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl(), this.llIllIIIIIllIlIIIIlI, (int)(this.IlIlIIIllIllIIIIIllI * 10.0f) - 1);
            }
        }
        return true;
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        if (this.lIIIIlIIIIIlllIllIII) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll));
            this.lIIIIlIIIIIlllIllIII = false;
            this.IlIlIIIllIllIIIIIllI = 0.0f;
            this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl(), this.llIllIIIIIllIlIIIIlI, -1);
        }
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this.IIIIlllIIIIIIlIIIlll();
        if (this.llllIIIlIlllIlIIIIIl > 0) {
            --this.llllIIIlIlllIlIIIIIl;
            return true;
        }
        if (this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl() && this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
            this.llllIIIlIlllIlIIIIIl = 5;
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll));
            llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
            return true;
        }
        if (!this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
            return this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            return this.lIIIIlIIIIIlllIllIII = false;
        }
        this.IlIlIIIllIllIIIIIllI += llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII, this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        if (this.IllIIlllIIIIlllIIlIl % 4.0f == 0.0f) {
            this.llllIIIIlIIIlIlllIll.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI()), (llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl() + 1.0f) / 8.0f, llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI() * 0.5f, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f));
        }
        ++this.IllIIlllIIIIlllIIlIl;
        if (this.IlIlIIIllIllIIIIIllI >= 1.0f) {
            this.lIIIIlIIIIIlllIllIII = false;
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll));
            this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
            this.IlIlIIIllIllIIIIIllI = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 5;
        }
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl(), this.llIllIIIIIllIlIIIIlI, (int)(this.IlIlIIIllIllIIIIIllI * 10.0f) - 1);
        return true;
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl() ? 5.0f : 4.5f;
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IIIIlllIIIIIIlIIIlll();
        if (this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().IlIlIIIllIllIIIIIllI()) {
            this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll();
        }
        else {
            this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().llIIlIIIlIIIllIlIIIl();
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final lllIIIIlIlIllIIlIIIl n = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.n();
        boolean b = this.IlIIIlIlIIIllIlIlIIl == null && n == null;
        if (this.IlIIIlIlIIIllIlIlIIl != null && n != null) {
            b = (n.llllIIIIlIIIlIlllIll() == this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(n, this.IlIIIlIlIIIllIlIlIIl) && (n.IlIIIlIlIIIllIlIlIIl() || n.lIIIIlIIIIIlllIllIII() == this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII()));
        }
        return ilIlIlIlIlllllllllIl.equals(this.llIllIIIIIllIlIIIIlI) && b;
    }
    
    private void IIIIlllIIIIIIlIIIlll() {
        final int llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI != this.llIIlIIIlIIIllIlIIIl) {
            this.llIIlIIIlIIIllIlIIIl = llIllIIIIIllIlIIIIlI;
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(this.llIIlIIIlIIIllIlIIIl));
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll, final e e) {
        this.IIIIlllIIIIIIlIIIlll();
        final float n = (float)(e.llllIIIIlIIIlIlllIll - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
        final float n2 = (float)(e.IlIlIlIlIlllllllllIl - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII());
        final float n3 = (float)(e.llIllIIIIIllIlIIIIlI - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        boolean b = false;
        if (!this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
            return false;
        }
        if (this.lIIIlllIIIllIIIllIII != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            if ((!llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl() || llIllIIIIIllIlIIIIlI.n() == null) && ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll, n, n2, n3)) {
                b = true;
            }
            if (!b && lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIlllIIIlIlllIIlllII && !((IIlllIIIlIlllIIlllII)lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()).llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, llIllIIIIIllIlIIIIlI, lllIIIIlIlIllIIlIIIl)) {
                return false;
            }
        }
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(), llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl(), n, n2, n3));
        if (b || this.lIIIlllIIIllIIIllIII == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            return true;
        }
        if (lllIIIIlIlIllIIlIIIl == null) {
            return false;
        }
        if (this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl()) {
            final int liiiIlIIIIIlllIllIII = lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
            final int ilIlIlIlIlllllllllIl3 = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            final boolean llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3);
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII);
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl3;
            return llllIIIIlIIIlIlllIll;
        }
        return lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.lIIIlllIIIllIIIllIII == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            return false;
        }
        this.IIIIlllIIIIIIlIIIlll();
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl()));
        final int ilIlIlIlIlllllllllIl = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll2 != lllIIIIlIlIllIIlIIIl || (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl != ilIlIlIlIlllllllllIl)) {
            llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = llllIIIIlIIIlIlllIll2;
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == 0) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = null;
            }
            return true;
        }
        return false;
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return new llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl, ilIlIIIllIIllIlllllI);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IIIIlllIIIIIIlIIIlll();
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl));
        if (this.lIIIlllIIIllIIIllIII != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl(llIllIIIIIllIlIIIIlI);
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IIIIlllIIIIIIlIIIlll();
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll));
        return this.lIIIlllIIIllIIIllIII != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl(llIllIIIIIllIlIIIIlI);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        this.IIIIlllIIIIIIlIIIlll();
        final e e = new e(llIlllIlllllIIllIIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll - llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIlllIlllllIIllIIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl - llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIlllIlllllIIllIIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI - llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI, e));
        return this.lIIIlllIIIllIIIllIII != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, e);
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final short llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.t.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI);
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.t.llllIIIIlIIIlIlllIll(n2, n3, n4, llllIIIIlIIIlIlllIll);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new lllIIIIlllllIlIIllIl(n, n2, n3, n4, llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll2));
        return llllIIIIlIIIlIlllIll3;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IIIlIIIlIlIIlllIIlll(n, n2));
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        if (this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl()) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI(n, lllIIIIlIlIllIIlIIIl));
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl() && lllIIIIlIlIllIIlIIIl != null) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI(-1, lllIIIIlIlIllIIlIIIl));
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IIIIlllIIIIIIlIIIlll();
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl, net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll));
        llllIIIIlIIIlIlllIll.i();
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return !this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl();
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl();
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl();
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IIllIIIlIIIIlIIlIIII() && this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll instanceof IllIIlllIIIIlllIIlIl;
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return this.lIIIlllIIIllIIIllIII == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
    }
    
    public lllIllIIIllllllIllll lIlIlIIIllIIllIIIllI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
