package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IlIllIlIlIIIlIlIlIII extends lIllllllIIllIlIlIlII
{
    private final lIlIlIIIllIIllIIIllI llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    
    public IlIllIlIlIIIlIlIlIII(final lIlIlIIIllIIllIIIllI llIllIIIIIllIlIIIIlI) {
        super(llIllIIIIIllIlIIIIlI, 0.699999988079071, 16);
        this.IlIlIIIllIllIIIIIllI = false;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll <= 0) {
            if (!this.llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing")) {
                return false;
            }
            this.IlIlIIIllIllIIIIIllI = false;
            this.IlIIIlIlIIIllIlIlIIl = this.llIllIIIIIllIlIIIIlI.az();
        }
        return super.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI && super.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        super.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        super.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        this.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, 10.0f, (float)this.llIllIIIIIllIlIIIIlI.j());
        if (this.lIIIIlIIIIIlllIllIII()) {
            final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = this.llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII;
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
            if (this.IlIlIIIllIllIIIIIllI && llIllIIIIIllIlIIIIlI instanceof llIIlllIIlllIIllIllI && (int)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IIIIIIIIIlllIllIlIlI) == 7) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, true);
                this.llIllIIIIIllIlIIIIlI.au();
            }
            this.IlIlIIIllIllIIIIIllI = false;
            this.llllIIIIlIIIlIlllIll = 10;
        }
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() instanceof llIIlllIIlllIIllIllI && (int)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IIIIIIIIIlllIllIlIlI) == 7 && this.IlIIIlIlIIIllIlIlIIl && !this.IlIlIIIllIllIIIIIllI) {
                return this.IlIlIIIllIllIIIIIllI = true;
            }
        }
        return false;
    }
}
