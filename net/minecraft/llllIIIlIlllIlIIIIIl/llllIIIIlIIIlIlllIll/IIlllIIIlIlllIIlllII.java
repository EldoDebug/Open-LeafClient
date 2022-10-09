package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlllIIIlIlllIIlllII extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    private float llllIIIlIlllIlIIIIIl;
    
    public IIlllIIIlIlllIIlllII(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final double illIIlllIIIIlllIIlIl, final float llllIIIlIlllIlIIIIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        if (this.IlIlIlIlIlllllllllIl == null) {
            return false;
        }
        if (this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll) > this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl) {
            return false;
        }
        final e llllIIIIlIIIlIlllIll = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 16, 7, new e(this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII, this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII));
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        return true;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl() && this.IlIlIlIlIlllllllllIl.llllIllllIllllIlIlII() && this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll) < this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl);
    }
}
