package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIIlllIIlllIIllIllI extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    
    public llIIlllIIlllIIllIllI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final double ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII()) {
            return false;
        }
        final IlIlIlIlIlllllllllIl iIlllIIlIllIllIlIIll = this.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll();
        final e llllIIIIlIIIlIlllIll = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 16, 7, new e(iIlllIIlIllIllIlIIll.lIIIIlIIIIIlllIllIII(), iIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII(), iIlllIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl()));
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        return true;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
    }
}
