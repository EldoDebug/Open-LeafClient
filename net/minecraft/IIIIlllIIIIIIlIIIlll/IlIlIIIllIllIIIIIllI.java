package net.minecraft.IIIIlllIIIIIIlIIIlll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIllIllIIIIIllI extends IllIIlllIIIIlllIIlIl
{
    private IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl;
    
    public IlIlIIIllIllIIIIIllI(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(ilIllIlIlIIIlIlIlIII, illlllllIIIlIIIlIlII);
    }
    
    @Override
    public net.minecraft.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        return super.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
    }
    
    @Override
    public net.minecraft.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IllIIlllIIIIlllIIlIl = new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        return super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl) {
        final net.minecraft.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        if (llllIIIIlIIIlIlllIll != null) {
            return this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl);
        }
        this.IllIIlllIIIIlllIIlIl = new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        return true;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (!this.IllIIlllIIIIlllIIlIl()) {
            super.IlIIIlIlIIIllIlIlIIl();
        }
        else if (this.IllIIlllIIIIlllIIlIl != null) {
            final double n = this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII * this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII;
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IllIIlllIIIIlllIIlIl) >= n && (this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII <= this.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII() || this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(new IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII(), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII), this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl())) >= n)) {
                this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII().llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII(), this.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII(), this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl(), this.IlIIIlIlIIIllIlIlIIl);
            }
            else {
                this.IllIIlllIIIIlllIIlIl = null;
            }
        }
    }
}
