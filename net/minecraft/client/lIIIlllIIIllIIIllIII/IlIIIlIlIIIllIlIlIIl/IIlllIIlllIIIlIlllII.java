package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIlllIIlllIIIlIlllII extends llIllIlIlIIIIIIIllII
{
    public IIlllIIlllIIIlIlllII(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final int llIIIlIlIllIIlIlIlII = lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII();
        if (llIIIlIlIllIIlIlIlII > -1 && llIIIlIlIllIIlIlIlII - n + 1.0f < 10.0f) {
            final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(1.0f - (llIIIlIlIllIIlIlIlII - n + 1.0f) / 10.0f, 0.0f, 1.0f);
            final float n2 = llllIIIIlIIIlIlllIll * llllIIIIlIIIlIlllIll;
            final float n3 = 1.0f + n2 * n2 * 0.3f;
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n3, n3, n3);
        }
        super.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, llIIlIIIlIIIllIlIIIl);
        if (llIIIlIlIllIIlIlIlII > -1 && llIIIlIlIllIIlIlIlII / 5 % 2 == 0) {
            final IlIllIlIlIIIlIlIlIII ilIIllIIllIIllIIlIIl = Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl();
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 772);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, (1.0f - (llIIIlIlIllIIlIlIlII - n + 1.0f) / 100.0f) * 0.8f);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII.lllIllIIIllllllIllll(), 1.0f);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        }
    }
}
