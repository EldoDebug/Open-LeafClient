package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class lIlIlIIIllIIllIIIllI extends IIlllIIlIllIllIlIIll
{
    public void llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final double n, final double n2, final double n3, final float n4, final int n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n + 0.5f, (float)n2, (float)n3 + 0.5f);
        llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl(), n, n2, n3, n4);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final double n, final double n2, final double n3, final float n4) {
        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        if (llllIIIIlIIIlIlllIll != null) {
            final float n5 = 0.4375f;
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.4f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI() + (ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl() - ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()) * n4) * 10.0f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-30.0f, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.4f, 0.0f);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n5, n5, n5);
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n, n2, n3, 0.0f, 0.0f);
            Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 0.0, 0.0, 0.0, 0.0f, n4);
        }
    }
}
