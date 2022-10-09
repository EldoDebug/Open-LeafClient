package net.minecraft.IlIlIIIllIllIIIIIllI;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;

public class llllIIIIlIIIlIlllIll implements llIllIIIIIllIlIIIIlI
{
    @Override
    public final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final lllIIIIlIlIllIIlIIIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl);
        this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl()));
        return ilIlIlIlIlllllllllIl;
    }
    
    protected lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(), lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(1), 6, IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl()), IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI));
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final double ilIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
        final double llIllIIIIIllIlIIIIlI = liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI();
        final double ilIIIlIlIIIllIlIlIIl = liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl();
        double n2;
        if (lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl) {
            n2 = llIllIIIIIllIlIIIIlI - 0.125;
        }
        else {
            n2 = llIllIIIIIllIlIIIIlI - 0.15625;
        }
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, n2, ilIIIlIlIIIllIlIlIIl, lllIIIIlIlIllIIlIIIl);
        final double n3 = illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextDouble() * 0.1 + 0.2;
        liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII = lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII() * n3;
        liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI = 0.20000000298023224;
        liiIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII = lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl() * n3;
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2 = liiIlllIIIllIIIllIII;
        liiIlllIIIllIIIllIII2.lIllllllIIllIlIlIlII += illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextGaussian() * 0.007499999832361937 * n;
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII3 = liiIlllIIIllIIIllIII;
        liiIlllIIIllIIIllIII3.llIIlllIIlllIIllIllI += illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextGaussian() * 0.007499999832361937 * n;
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII4 = liiIlllIIIllIIIllIII;
        liiIlllIIIllIIIllIII4.IIlllIIIlIlllIIlllII += illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextGaussian() * 0.007499999832361937 * n;
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(1000, ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(), 0);
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(2000, ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(), this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll));
    }
    
    private int llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII() + 1 + (lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl() + 1) * 3;
    }
}
