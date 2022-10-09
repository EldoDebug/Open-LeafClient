package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIlIlIlllllllllIl extends IlIlIIIllIllIIIIIllI
{
    IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    protected llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    int llIllIIIIIllIlIIIIlI;
    double IlIIIlIlIIIllIlIlIIl;
    boolean IlIlIIIllIllIIIIIllI;
    net.minecraft.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl;
    Class llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private double lIIIlllIIIllIIIllIII;
    private double llIIlIIIlIIIllIlIIIl;
    private double llIllIlIIIIllIlIIllI;
    
    public IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Class llllIIIlIlllIlIIIIIl, final double n, final boolean b) {
        this(llIIlIIIlIIIllIlIIIl, n, b);
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl, final double ilIIIlIlIIIllIlIlIIl, final boolean ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII();
        if (iIlllIIIlIlllIIlllII == null) {
            return false;
        }
        if (!iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII()) {
            return false;
        }
        if (this.llllIIIlIlllIlIIIIIl != null && !this.llllIIIlIlllIlIIIIIl.isAssignableFrom(iIlllIIIlIlllIIlllII.getClass())) {
            return false;
        }
        this.IllIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII);
        return this.IllIIlllIIIIlllIIlIl != null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII();
        return iIlllIIIlIlllIIlllII != null && iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII() && (this.IlIlIIIllIllIIIIIllI ? this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(iIlllIIIlIlllIIlllII)) : (!this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl()));
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl);
        this.lIIIIlIIIIIlllIllIII = 0;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII();
        this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII, 30.0f, 30.0f);
        final double ilIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(iIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl, iIlllIIIlIlllIIlllII.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, iIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII);
        final double llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII);
        --this.lIIIIlIIIIIlllIllIII;
        if ((this.IlIlIIIllIllIIIIIllI || this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI().llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII)) && this.lIIIIlIIIIIlllIllIII <= 0 && ((this.lIIIlllIIIllIIIllIII == 0.0 && this.llIIlIIIlIIIllIlIIIl == 0.0 && this.llIllIlIIIIllIlIIllI == 0.0) || iIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI(this.lIIIlllIIIllIIIllIII, this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI) >= 1.0 || this.IlIlIlIlIlllllllllIl.B().nextFloat() < 0.05f)) {
            this.lIIIlllIIIllIIIllIII = iIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl;
            this.llIIlIIIlIIIllIlIIIl = iIlllIIIlIlllIIlllII.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl;
            this.llIllIlIIIIllIlIIllI = iIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII;
            this.lIIIIlIIIIIlllIllIII = 4 + this.IlIlIlIlIlllllllllIl.B().nextInt(7);
            if (ilIlIIIllIllIIIIIllI > 1024.0) {
                this.lIIIIlIIIIIlllIllIII += 10;
            }
            else if (ilIlIIIllIllIIIIIllI > 256.0) {
                this.lIIIIlIIIIIlllIllIII += 5;
            }
            if (!this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII, this.IlIIIlIlIIIllIlIlIIl)) {
                this.lIIIIlIIIIIlllIllIII += 15;
            }
        }
        this.llIllIIIIIllIlIIIIlI = Math.max(this.llIllIIIIIllIlIIIIlI - 1, 0);
        if (ilIlIIIllIllIIIIIllI <= llllIIIIlIIIlIlllIll && this.llIllIIIIIllIlIIIIlI <= 0) {
            this.llIllIIIIIllIlIIIIlI = 20;
            if (this.IlIlIlIlIlllllllllIl.n() != null) {
                this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII();
            }
            this.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll(iIlllIIIlIlllIIlllII);
        }
    }
    
    protected double llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.IlIlIlIlIlllllllllIl.IllIllIIIIlIIlIlllII * 2.0f * this.IlIlIlIlIlllllllllIl.IllIllIIIIlIIlIlllII * 2.0f + lllIIIIlllllIlIIllIl.IllIllIIIIlIIlIlllII;
    }
}
