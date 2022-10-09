package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

class IIlIIIIlllIlllllIlII extends IIIIIllIIIIlIIIIllIl
{
    final /* synthetic */ IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlllllllIIIlIIIlIlII IllIIlllIIIIlllIIlIl;
    private final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl;
    
    IIlIIIIlllIlllllIlII(final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n, final int n2, final int n3, final IlllllllIIIlIIIlIlII illIIlllIIIIlllIIlIl, final IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        super(llIIIlIlIllIIlIlIlII, n, n2, n3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return (llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl || llllIIIIlIIIlIlllIll.L >= this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) && this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll > 0 && this.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI(-this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        }
        this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(0, null);
        if (this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI > 0) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI(1);
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl > this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI) {
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = lIlIlIIIllIIllIIIllI;
                lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl -= this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI;
                this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(1, lIlIlIIIllIIllIIIllI);
            }
            else {
                this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(1, null);
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(1, null);
        }
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll = 0;
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl);
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl && !this.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII && ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj && llllIIIIlIIIlIlllIll.B().nextFloat() < 0.12f) {
            int intValue = (int)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.IIllllIIIlIIIIIIllIl);
            if (++intValue > 2) {
                this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII(this.llllIIIlIlllIlIIIIIl);
                this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(1020, this.llllIIIlIlllIlIIIIIl, 0);
            }
            else {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.IIllllIIIlIIIIIIllIl, intValue), 2);
                this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(1021, this.llllIIIlIlllIlIIIIIl, 0);
            }
        }
        else if (!this.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII) {
            this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(1021, this.llllIIIlIlllIlIIIIIl, 0);
        }
    }
}
