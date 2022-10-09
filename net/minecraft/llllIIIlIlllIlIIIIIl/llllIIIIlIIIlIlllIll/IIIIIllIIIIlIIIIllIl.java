package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class IIIIIllIIIIlIIIIllIl extends lIllllllIIllIlIlIlII
{
    private final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    
    public IIIIIllIIIIlIIIIllIl(final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI, final double n) {
        super(llIllIIIIIllIlIIIIlI, n, 8);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI.as() && !this.llIllIIIIIllIlIIIIlI.at() && super.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return super.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        super.IlIlIIIllIllIIIIIllI();
        this.llIllIIIIIllIlIIIIlI.av().llllIIIIlIIIlIlllIll(false);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        super.llIllIIIIIllIlIIIIlI();
        this.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll(false);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        this.llIllIIIIIllIlIIIIlI.av().llllIIIIlIIIlIlllIll(false);
        if (!this.lIIIIlIIIIIlllIllIII()) {
            this.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll(false);
        }
        else if (!this.llIllIIIIIllIlIIIIlI.at()) {
            this.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll(true);
        }
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll())) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll instanceof IlIlIIIllIIllIlllllI && ((IlIlIIIllIIllIlllllI)llllIIIIlIIIlIlllIll).lIlIlIIIllIIllIIIllI < 1) {
                return true;
            }
        }
        else {
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl) {
                return true;
            }
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII && ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI) != IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
                return true;
            }
        }
        return false;
    }
}
