package net.optifine.util;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlllIIIlIlllIIlllII
{
    public static int llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        final llllIIIlIlllIlIIIIIl[] ilIlIlIlIlllllllllIl = ilIllIlIlIIIlIlIlIII.lIlIlIIIllIIllIIIllI().IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl == null) {
            return 0;
        }
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl[ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII().lIIIlllIIIllIIIllIII() >> 4];
        return (llllIIIlIlllIlIIIIIl == null) ? 0 : llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII();
    }
    
    public static double IlIlIlIlIlllllllllIl(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII));
    }
    
    public static double llllIIIIlIIIlIlllIll(final int n) {
        final double llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n / 4096.0 * 0.995 * 2.0 - 1.0, -1.0, 1.0);
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(1.0 - llllIIIIlIIIlIlllIll * llllIIIIlIIIlIlllIll);
    }
}
