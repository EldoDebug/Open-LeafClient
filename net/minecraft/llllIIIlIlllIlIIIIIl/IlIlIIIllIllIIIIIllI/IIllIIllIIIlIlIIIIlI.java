package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IIllIIllIIIlIlIIIIlI extends IlIlIIIllIllIIIIIllI
{
    private lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public IIllIIllIIIlIlIIIIlI(final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        return iIlllIIIlIlllIIlllII != null && iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return super.IlIlIlIlIlllllllllIl() && (this.llllIIIIlIIIlIlllIll.ap() || this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII()) > 9.0);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIlIlIlllllllllIl = -10;
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII(), 90.0f, 90.0f);
        this.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll = true;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(0);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl((net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)null);
        this.llllIIIIlIIIlIlllIll.y.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII, 90.0f, 90.0f);
        if (!this.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll(iIlllIIIlIlllIIlllII)) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl((net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)null);
        }
        else {
            ++this.IlIlIlIlIlllllllllIl;
            if (this.IlIlIlIlIlllllllllIl == 0) {
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII().IlllIIIIlIIIlIlIlIIl());
                this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, (byte)21);
            }
            else if (this.IlIlIlIlIlllllllllIl >= this.llllIIIIlIIIlIlllIll.ao()) {
                float n = 1.0f;
                if (this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) {
                    n += 2.0f;
                }
                if (this.llllIIIIlIIIlIlllIll.ap()) {
                    n += 2.0f;
                }
                iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll), n);
                iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll), (float)this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).IlIlIIIllIllIIIIIllI());
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl((net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)null);
            }
            else if (this.IlIlIlIlIlllllllllIl < 60 || this.IlIlIlIlIlllllllllIl % 20 == 0) {}
            super.IlIIIlIlIIIllIlIlIIl();
        }
    }
}
