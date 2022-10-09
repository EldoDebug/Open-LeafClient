package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IlIlIIIIIIlllIlIllIl extends IlIlIIIllIllIIIIIllI
{
    private IIIlIIlIIIIlllIlllII IlIIIlIlIIIllIlIlIIl;
    private lllIIIIlllllIlIIllIl IlIlIIIllIllIIIIIllI;
    IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private double IllIIlllIIIIlllIIlIl;
    private IlIIIlIlIIIllIlIlIIl llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    float IlIlIlIlIlllllllllIl;
    float llIllIIIIIllIlIIIIlI;
    private boolean lIIIlllIIIllIIIllIII;
    
    public IlIlIIIIIIlllIlIllIl(final IIIlIIlIIIIlllIlllII ilIIIlIlIIIllIlIlIIl, final double illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI, final float ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll = ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = ilIIIlIlIIIllIlIlIIl.lIllllllIIllIlIlIlII();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll(3);
        if (!(ilIIIlIlIIIllIlIlIIl.lIllllllIIllIlIlIlII() instanceof IllIIlllIIIIlllIIlIl)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final lllIIIIlllllIlIIllIl au = this.IlIIIlIlIIIllIlIlIIl.au();
        if (au == null) {
            return false;
        }
        if (au instanceof llllIIIIlIIIlIlllIll && ((llllIIIIlIIIlIlllIll)au).IlIIIlIlIIIllIlIlIIl()) {
            return false;
        }
        if (this.IlIIIlIlIIIllIlIlIIl.at()) {
            return false;
        }
        if (this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(au) < this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI) {
            return false;
        }
        this.IlIlIIIllIllIIIIIllI = au;
        return true;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl() && this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(this.IlIlIIIllIllIIIIIllI) > this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl && !this.IlIIIlIlIIIllIlIlIIl.at();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.lIIIIlIIIIIlllIllIII = 0;
        this.lIIIlllIIIllIIIllIII = ((IllIIlllIIIIlllIIlIl)this.IlIIIlIlIIIllIlIlIIl.lIllllllIIllIlIlIlII()).lIlIlIIIllIIllIIIllI();
        ((IllIIlllIIIIlllIIlIl)this.IlIIIlIlIIIllIlIlIIl.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(false);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIIIllIllIIIIIllI = null;
        this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl();
        ((IllIIlllIIIIlllIIlIl)this.IlIIIlIlIIIllIlIlIIl.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll || !llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, 10.0f, (float)this.IlIIIlIlIIIllIlIlIIl.j());
        if (!this.IlIIIlIlIIIllIlIlIIl.at() && --this.lIIIIlIIIIIlllIllIII <= 0) {
            this.lIIIIlIIIIIlllIllIII = 10;
            if (!this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl) && !this.IlIIIlIlIIIllIlIlIIl.t() && this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(this.IlIlIIIllIllIIIIIllI) >= 144.0) {
                final int n = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl) - 2;
                final int n2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI.lllllIlIIIlIlIIlllII) - 2;
                final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl);
                for (int i = 0; i <= 4; ++i) {
                    for (int j = 0; j <= 4; ++j) {
                        if ((i < 1 || j < 1 || i > 3 || j > 3) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, new IlIlIlIlIlllllllllIl(n + i, llIllIIIIIllIlIIIIlI - 1, n2 + j)) && this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n + i, llIllIIIIIllIlIIIIlI, n2 + j)) && this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n + i, llIllIIIIIllIlIIIIlI + 1, n2 + j))) {
                            this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(n + i + 0.5f, llIllIIIIIllIlIIIIlI, n2 + j + 0.5f, this.IlIIIlIlIIIllIlIlIIl.IIlIIIIIllIlIIIlIIll, this.IlIIIlIlIIIllIlIlIIl.llllllIllIllIlIllllI);
                            this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl();
                            return;
                        }
                    }
                }
            }
        }
    }
}
