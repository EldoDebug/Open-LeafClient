package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIllIllIIIIIllI extends lIIIlllIIIllIIIllIII
{
    private lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI) {
        super(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        final lllIIIIlllllIlIIllIl llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll();
        if (llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl != null) {
            if (llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl == this.llIllIIIIIllIlIIIIlI) {
                return;
            }
            llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this, llllIIllllIlIlIIIIll), 0.0f);
        }
        for (int i = 0; i < 32; ++i) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextDouble() * 2.0, this.lllllIlIIIlIlIIlllII, this.IlIIllIIllIIllIIlIIl.nextGaussian(), 0.0, this.IlIIllIIllIIllIIlIIl.nextGaussian(), new int[0]);
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (llllIIllllIlIlIIIIll instanceof IlIIIlIlIIIllIlIlIIl) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)llllIIllllIlIlIIIIll;
                if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().IlIlIIIllIllIIIIIllI() && ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII == this.IlllllllIIIlIIIlIlII && !ilIIIlIlIIIllIlIlIIl.ah()) {
                    if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.05f && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doMobSpawning")) {
                        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl(this.IlllllllIIIlIIIlIlII);
                        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(true);
                        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll.IIlllIlIIllIlIlIlIIl, llllIIllllIlIlIIIIll.llIIIlIlIllIIlIlIlII, llllIIllllIlIlIIIIll.lllllIlIIIlIlIIlllII, llllIIllllIlIlIIIIll.IIlIIIIIllIlIIIlIIll, llllIIllllIlIlIIIIll.llllllIllIllIlIllllI);
                        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
                    }
                    if (llllIIllllIlIlIIIIll.IIllIIIlIIIIlIIlIIII()) {
                        llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
                    }
                    llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
                    llllIIllllIlIlIIIIll.IllIlIIllIllIIlIllII = 0.0f;
                    llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII, 5.0f);
                }
            }
            else if (llllIIllllIlIlIIIIll != null) {
                llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
                llllIIllllIlIlIIIIll.IllIlIIllIllIIlIllII = 0.0f;
            }
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        final lllIIIIlllllIlIIllIl llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll();
        if (llllIIllllIlIlIIIIll != null && llllIIllllIlIlIIIIll instanceof llllIIIIlIIIlIlllIll && !llllIIllllIlIlIIIIll.llllIllllIllllIlIlII()) {
            this.IllIllIIIIlIIlIlllII();
        }
        else {
            super.IIllIIllIIIlIlIIIIlI();
        }
    }
}
