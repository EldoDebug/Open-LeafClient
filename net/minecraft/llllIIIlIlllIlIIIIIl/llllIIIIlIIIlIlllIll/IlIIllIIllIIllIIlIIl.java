package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIIllIIllIIllIIlIIl extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    
    public IlIIllIIllIIllIIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final double n) {
        this(llIIlIIIlIIIllIlIIIl, n, 120);
    }
    
    public IlIIllIIllIIllIIlIIl(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final double ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (!this.llllIIIlIlllIlIIIIIl) {
            if (this.llllIIIIlIIIlIlllIll.G() >= 100) {
                return false;
            }
            if (this.llllIIIIlIIIlIlllIll.B().nextInt(this.IllIIlllIIIIlllIIlIl) != 0) {
                return false;
            }
        }
        final e llllIIIIlIIIlIlllIll = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 10, 7);
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl = false;
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
    
    public void lIIIIlIIIIIlllIllIII() {
        this.llllIIIlIlllIlIIIIIl = true;
    }
    
    public void IlIlIlIlIlllllllllIl(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
