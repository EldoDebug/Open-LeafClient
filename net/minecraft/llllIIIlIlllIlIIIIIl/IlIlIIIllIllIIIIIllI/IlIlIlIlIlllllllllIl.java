package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;

class IlIlIlIlIlllllllllIl extends IlIlIIIllIllIIIIIllI
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        return iIlllIIIlIlllIIlllII != null && iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIlIlIlllllllllIl = 0;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(false);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        --this.llIllIIIIIllIlIIIIlI;
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        final double ilIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(iIlllIIIlIlllIIlllII);
        if (ilIlIIIllIllIIIIIllI < 4.0) {
            if (this.llIllIIIIIllIlIIIIlI <= 0) {
                this.llIllIIIIIllIlIIIIlI = 20;
                this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll(iIlllIIIlIlllIIlllII);
            }
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII().llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl, iIlllIIIlIlllIIlllII.llIIIlIlIllIIlIlIlII, iIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII, 1.0);
        }
        else if (ilIlIIIllIllIIIIIllI < 256.0) {
            final double n = iIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl - this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
            final double n2 = iIlllIIIlIlllIIlllII.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + iIlllIIIlIlllIIlllII.IlIllllIIlIIlIlIlIll / 2.0f - (this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll / 2.0f);
            final double n3 = iIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII - this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
            if (this.llIllIIIIIllIlIIIIlI <= 0) {
                ++this.IlIlIlIlIlllllllllIl;
                if (this.IlIlIlIlIlllllllllIl == 1) {
                    this.llIllIIIIIllIlIIIIlI = 60;
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(true);
                }
                else if (this.IlIlIlIlIlllllllllIl <= 4) {
                    this.llIllIIIIIllIlIIIIlI = 6;
                }
                else {
                    this.llIllIIIIIllIlIIIIlI = 100;
                    this.IlIlIlIlIlllllllllIl = 0;
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(false);
                }
                if (this.IlIlIlIlIlllllllllIl > 1) {
                    final float n4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI)) * 0.5f;
                    this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1009, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((int)this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, (int)this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, (int)this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII), 0);
                    for (int i = 0; i < 1; ++i) {
                        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll, n + this.llllIIIIlIIIlIlllIll.B().nextGaussian() * n4, n2, n3 + this.llllIIIIlIIIlIlllIll.B().nextGaussian() * n4);
                        llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII = this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll / 2.0f + 0.5;
                        this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
                    }
                }
            }
            this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII, 10.0f, 10.0f);
        }
        else {
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII().llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl, iIlllIIIlIlllIIlllII.llIIIlIlIllIIlIlIlII, iIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII, 1.0);
        }
        super.IlIIIlIlIIIllIlIlIIl();
    }
}
