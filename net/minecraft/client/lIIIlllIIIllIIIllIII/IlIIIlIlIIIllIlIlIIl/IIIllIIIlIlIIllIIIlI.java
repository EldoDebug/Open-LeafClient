package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class IIIllIIIlIlIIllIIIlI extends llIllIIIIIllIlIIIIlI
{
    public IIIllIIIlIlIIllIIIlI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
        this.llIllIIIIIllIlIIIIlI = 0.5f;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll, final double n, final double n2, final double n3, final float n4, final float n5) {
        final IlIllIlIlIIIlIlIlIII ilIIllIIllIIllIIlIIl = Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl();
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2 + 0.5f, (float)n3);
        if (iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll - n5 + 1.0f < 10.0f) {
            final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(1.0f - (iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll - n5 + 1.0f) / 10.0f, 0.0f, 1.0f);
            final float n6 = llllIIIIlIIIlIlllIll * llllIIIIlIIIlIlllIll;
            final float n7 = 1.0f + n6 * n6 * 0.3f;
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n7, n7, n7);
        }
        final float n8 = (1.0f - (iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll - n5 + 1.0f) / 100.0f) * 0.8f;
        this.llIllIIIIIllIlIIIIlI(iiIlIIIlIlIIlllIIlll);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, 0.5f);
        ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII.lllIllIIIllllllIllll(), iiIlIIIlIlIIlllIIlll.b_(n5));
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, 1.0f);
        if (iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll / 5 % 2 == 0) {
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 772);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, n8);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-3.0f, -3.0f);
            lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll();
            ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII.lllIllIIIllllllIllll(), 1.0f);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.lllIIIIlllllIlIIllIl();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        }
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        return IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;
    }
}
