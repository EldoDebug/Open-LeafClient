package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIllllIIlIIlIlIlIll extends IlIlIIIllIllIIIIIllI
{
    private IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    
    public IlIllllIIlIIlIlIlIll(final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.at() || this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI == null) {
            return false;
        }
        final e llllIIIIlIIIlIlllIll = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 5, 4);
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
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl() && this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI != null;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIIlIIIlIlllIll.B().nextInt(50) == 0) {
            if (this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI instanceof llllIIIIlIIIlIlllIll) {
                final int ae = this.llllIIIIlIIIlIlllIll.aE();
                final int ak = this.llllIIIIlIIIlIlllIll.aK();
                if (ak > 0 && this.llllIIIIlIIIlIlllIll.B().nextInt(ak) < ae) {
                    this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII((llllIIIIlIIIlIlllIll)this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI);
                    this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, (byte)7);
                    return;
                }
                this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll(5);
            }
            this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
            this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI = null;
            this.llllIIIIlIIIlIlllIll.aT();
            this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, (byte)6);
        }
    }
}
