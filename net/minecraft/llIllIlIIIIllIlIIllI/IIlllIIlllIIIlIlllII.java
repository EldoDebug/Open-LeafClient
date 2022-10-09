package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class IIlllIIlllIIIlIlllII extends IlIIIlIlIIIllIlIlIIl
{
    public IIlllIIlllIIIlIlllII() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (!(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() instanceof IIlllllIllIllIlIlIII)) {
            return false;
        }
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return true;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        boolean b = false;
        final double n = 7.0;
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII : illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII - n, liiIlllIIIllIIIllIII - n, llIIlIIIlIIIllIlIIIl - n, liiiIlIIIIIlllIllIII + n, liiIlllIIIllIIIllIII + n, llIIlIIIlIIIllIlIIIl + n))) {
            if (ilIllIlIlIIIlIlIlIII.t() && ilIllIlIlIIIlIlIlIII.u() == llllIIIIlIIIlIlllIll) {
                if (ilIlIIIllIIllIlllllI == null) {
                    ilIlIIIllIIllIlllllI = IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
                }
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, true);
                b = true;
            }
        }
        return b;
    }
}
