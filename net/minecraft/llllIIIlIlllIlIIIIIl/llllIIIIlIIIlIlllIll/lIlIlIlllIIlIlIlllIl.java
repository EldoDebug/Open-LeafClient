package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class lIlIlIlllIIlIlIlllIl extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    private double llllIIIlIlllIlIIIIIl;
    private llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    private IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    private boolean IlIlIIIllIIllIlllllI;
    
    public lIlIlIlllIIlIlIlllIl(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl, final IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI, final boolean lIlIlIIIllIIllIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.llllIIIIlIIIlIlllIll(3);
        if (!(llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII() instanceof IllIIlllIIIIlllIIlIl)) {
            throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.lIIIlllIIIllIIIllIII > 0) {
            --this.lIIIlllIIIllIIIllIII;
            return false;
        }
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 10.0);
        if (this.lIIIIlIIIIIlllIllIII == null) {
            return false;
        }
        final lllIIIIlIlIllIIlIIIl p = this.lIIIIlIIIIIlllIllIII.p();
        return p != null && p.llllIIIIlIIIlIlllIll() == this.llIllIlIIIIllIlIIllI;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        if (this.lIlIlIIIllIIllIIIllI) {
            if (this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.lIIIIlIIIIIlllIllIII) < 36.0) {
                if (this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs(this.lIIIIlIIIIIlllIllIII.llllllIllIllIlIllllI - this.IllIIlllIIIIlllIIlIl) > 5.0 || Math.abs(this.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll - this.llllIIIlIlllIlIIIIIl) > 5.0) {
                    return false;
                }
            }
            else {
                this.llIllIIIIIllIlIIIIlI = this.lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl;
                this.IlIIIlIlIIIllIlIlIIl = this.lIIIIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII;
                this.IlIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII;
            }
            this.IllIIlllIIIIlllIIlIl = this.lIIIIlIIIIIlllIllIII.llllllIllIllIlIllllI;
            this.llllIIIlIlllIlIIIIIl = this.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll;
        }
        return this.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llIllIIIIIllIlIIIIlI = this.lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = this.lIIIIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII;
        this.IlIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII;
        this.llIIlIIIlIIIllIlIIIl = true;
        this.IlIlIIIllIIllIlllllI = ((IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).lIlIlIIIllIIllIIIllI();
        ((IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(false);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.lIIIIlIIIIIlllIllIII = null;
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
        this.lIIIlllIIIllIIIllIII = 100;
        this.llIIlIIIlIIIllIlIIIl = false;
        ((IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, 30.0f, (float)this.llllIIIIlIIIlIlllIll.j());
        if (this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.lIIIIlIIIIIlllIllIII) < 6.25) {
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
        }
        else {
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.IlIlIlIlIlllllllllIl);
        }
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
}
