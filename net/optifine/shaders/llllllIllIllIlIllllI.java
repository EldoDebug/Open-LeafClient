package net.optifine.shaders;

import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llllllIllIllIlIllllI
{
    public static Iterator llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final double n, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n2, final IIlIlIllllIlllIIIIll ilIlIllllIlllIIIIll) {
        final float iIlIlllIlIlllIlIllll = llIIlllIIlllIIllIllI.IIlIlllIlIlllIlIllll();
        if (iIlIlllIlIlllIlIllll > 0.0f && iIlIlllIlIlllIlIllll < (n2 - 1) * 16) {
            final int n3 = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(iIlIlllIlIlllIlIllll / 16.0f) + 1;
            final float ilIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl((float)n);
            final float n4 = llIIlllIIlllIIllIllI.dd * llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI;
            final float n5 = (ilIIIlIlIIIllIlIlIIl > llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl && ilIIIlIlIIIllIlIlIIl < 3.0f * llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl) ? (ilIIIlIlIIIllIlIlIIl + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl) : ilIIIlIlIIIllIlIlIIl;
            final float n6 = -llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n5);
            final float n7 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n5) * llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n4);
            final float n8 = -llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n5) * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n4);
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl) >> 4, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII) >> 4, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII) >> 4);
            return new IIIIlllIIIIIIlIIIlll(ilIlIllllIlllIIIIll, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-n6 * n3, -n7 * n3, -n8 * n3), ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6 * n2, n7 * n2, n8 * n2), n3, n3);
        }
        return Arrays.asList(ilIlIllllIlllIIIIll.IllIIlllIIIIlllIIlIl).iterator();
    }
}
