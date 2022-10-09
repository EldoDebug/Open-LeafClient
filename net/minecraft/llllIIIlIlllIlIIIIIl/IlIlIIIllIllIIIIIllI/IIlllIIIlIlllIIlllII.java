package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

class IIlllIIIlIlllIIlllII extends IlIIllIIllIIllIIlIIl
{
    private final llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll;
    private lllIllIIIllllllIllll IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    
    public IIlllIIIlIlllIIlllII(final llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll) {
        super(llllIIIIlIIIlIlllIll, 1.0, 10);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII() != null) {
            return false;
        }
        if (!this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl()) {
            return false;
        }
        final Random b = this.llllIIIIlIIIlIlllIll.B();
        if (b.nextInt(10) == 0) {
            this.IlIlIlIlIlllllllllIl = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(b);
            if (bs.lIIIlllIIIllIIIllIII(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + 0.5, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII).llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl)))) {
                return this.llIllIIIIIllIlIIIIlI = true;
            }
        }
        this.llIllIIIIIllIlIIIIlI = false;
        return super.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.llIllIIIIIllIlIIIIlI && super.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        if (!this.llIllIIIIIllIlIIIIlI) {
            super.IlIlIIIllIllIIIIIllI();
        }
        else {
            final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII;
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + 0.5, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII).llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            if (bs.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl)) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(bs.IIIIIIIIIlllIllIlIlI, bt.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)), 3);
                this.llllIIIIlIIIlIlllIll.IIllllIIIlIIIIIIllIl();
                this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII();
            }
        }
    }
}
