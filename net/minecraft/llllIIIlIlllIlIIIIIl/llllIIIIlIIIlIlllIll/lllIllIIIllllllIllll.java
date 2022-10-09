package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lllIllIIIllllllIllll extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    protected double llllIIIIlIIIlIlllIll;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    
    public lllIllIIIllllllIllll(final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl, final double llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.IlIlIlIlIlllllllllIl.C() == null && !this.IlIlIlIlIlllllllllIl.lIIIIIlIlIIIlIIIIlIl()) {
            return false;
        }
        final e llllIIIIlIIIlIlllIll = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 5, 4);
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        return true;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl();
    }
}
