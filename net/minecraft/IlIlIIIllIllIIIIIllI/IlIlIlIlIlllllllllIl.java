package net.minecraft.IlIlIIIllIllIIIIIllI;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public abstract class IlIlIlIlIlllllllllIl extends llllIIIIlIIIlIlllIll
{
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll2 = IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI2 = IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl());
        final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI2.lIIIIlIIIIIlllIllIII(), ilIlIIIllIllIIIIIllI2.lIIIlllIIIllIIIllIII() + 0.1f, ilIlIIIllIllIIIIIllI2.llIIlIIIlIIIllIlIIIl(), this.IlIlIlIlIlllllllllIl(), this.llllIIIIlIIIlIlllIll());
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll3);
        lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(1);
        return lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(1002, ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(), 0);
    }
    
    protected abstract IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII p0, final lIIIIlIIIIIlllIllIII p1);
    
    protected float llllIIIIlIIIlIlllIll() {
        return 6.0f;
    }
    
    protected float IlIlIlIlIlllllllllIl() {
        return 1.1f;
    }
}
