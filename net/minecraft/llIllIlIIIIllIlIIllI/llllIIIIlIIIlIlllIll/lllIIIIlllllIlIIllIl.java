package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lllIIIIlllllIlIIllIl extends IIIlIIIlIlIIlllIIlll
{
    public lllIIIIlllllIlIIllIl() {
        super(3, 3, new lllIIIIlIlIllIIlIIIl[] { new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.h, 0, 32767), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll) }, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.Z, 0, 0));
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        if (!super.llllIIIIlIIIlIlllIll(illlIIIlIlllIIlllII, illlllllIIIlIIIlIlII)) {
            return false;
        }
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
        for (int n = 0; n < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII() && lllIIIIlIlIllIIlIIIl == null; ++n) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(n);
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.h) {
                lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
            }
        }
        if (lllIIIIlIlIllIIlIIIl == null) {
            return false;
        }
        final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = IIllIIllIIIlIlIIIIlI.h.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII);
        return llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI < 4;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
        for (int n = 0; n < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII() && lllIIIIlIlIllIIlIIIl == null; ++n) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(n);
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.h) {
                lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
            }
        }
        final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl();
        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = 1;
        if (llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll() == null) {
            llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl(new IIIIlllIIIIIIlIIIlll());
        }
        llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll().llllIIIIlIIIlIlllIll("map_is_scaling", true);
        return llIIlIIIlIIIllIlIIIl;
    }
}
