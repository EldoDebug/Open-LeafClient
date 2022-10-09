package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIIIlIIIllllIlIlIlI extends IlIlIIIllIllIIIIIllI
{
    IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl;
    lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI;
    int IlIIIlIlIIIllIlIlIIl;
    
    public IlIIIlIIIllllIlIlIlI(final IlIllIlIlIIIlIlIlIII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII();
        if (iIlllIIIlIlllIIlllII == null) {
            return false;
        }
        this.llIllIIIIIllIlIIIIlI = iIlllIIIlIlllIIlllII;
        return true;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII() && this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(this.llIllIIIIIllIlIIIIlI) <= 225.0 && (!this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl() || this.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, 30.0f, 30.0f);
        final double n = this.IlIlIlIlIlllllllllIl.IllIllIIIIlIIlIlllII * 2.0f * this.IlIlIlIlIlllllllllIl.IllIllIIIIlIIlIlllII * 2.0f;
        final double ilIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(this.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, this.llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
        double n2 = 0.8;
        if (ilIlIIIllIllIIIIIllI > n && ilIlIIIllIllIIIIIllI < 16.0) {
            n2 = 1.33;
        }
        else if (ilIlIIIllIllIIIIIllI < 225.0) {
            n2 = 0.6;
        }
        this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, n2);
        this.IlIIIlIlIIIllIlIlIIl = Math.max(this.IlIIIlIlIIIllIlIlIIl - 1, 0);
        if (ilIlIIIllIllIIIIIllI <= n && this.IlIIIlIlIIIllIlIlIIl <= 0) {
            this.IlIIIlIlIIIllIlIlIIl = 20;
            this.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll(this.llIllIIIIIllIlIIIIlI);
        }
    }
}
