package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

class lllIIIIlllllIlIIllIl extends llllIIIIlIIIlIlllIll
{
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI2 = IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl());
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
        final double n = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() + ilIlIIIllIllIIIIIllI2.lIIIIlIIIIIlllIllIII() * 0.3f;
        final double n2 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() + ilIlIIIllIllIIIIIllI2.lIIIlllIIIllIIIllIII() * 0.3f;
        final double n3 = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl() + ilIlIIIllIllIIIIIllI2.llIIlIIIlIIIllIlIIIl() * 0.3f;
        final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        final Random llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll2.llllIIllllIlIlIIIIll;
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll2, n, n2, n3, llllIIllllIlIlIIIIll.nextGaussian() * 0.05 + ilIlIIIllIllIIIIIllI2.lIIIIlIIIIIlllIllIII(), llllIIllllIlIlIIIIll.nextGaussian() * 0.05 + ilIlIIIllIllIIIIIllI2.lIIIlllIIIllIIIllIII(), llllIIllllIlIlIIIIll.nextGaussian() * 0.05 + ilIlIIIllIllIIIIIllI2.llIIlIIIlIIIllIlIIIl()));
        lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(1);
        return lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(1009, ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(), 0);
    }
}
