package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI
{
    private static final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll;
    private static final llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl;
    private static final llllIIIlIlllIlIIIIIl llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new IlIIIlIlIIIllIlIlIIl();
        IlIlIlIlIlllllllllIl = new IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI = new IllIIlllIIIIlllIIlIl();
    }
    
    private static int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 : net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-1, 0, -1), ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1, 0, 1))) {
            final int llllIIIIlIIIlIlllIll = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIlIlllIlIIIIIl2), llllIIIlIlllIlIIIIIl2);
            n += (llllIIIIlIIIlIlllIll & 0xFF0000) >> 16;
            n2 += (llllIIIIlIIIlIlllIll & 0xFF00) >> 8;
            n3 += (llllIIIIlIIIlIlllIll & 0xFF);
        }
        return (n / 9 & 0xFF) << 16 | (n2 / 9 & 0xFF) << 8 | (n3 / 9 & 0xFF);
    }
    
    public static int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
    }
    
    public static int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl);
    }
    
    public static int llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
    }
}
