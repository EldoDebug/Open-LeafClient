package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIIlIIIIIlllIllIII implements IlIllIlIlIIIlIlIlIII
{
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (ilIlIlIlIlllllllllIl.F > 0) {
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            final float n8 = (ilIlIlIlIlllllllllIl.F + n3) / 200.0f;
            float n9 = 0.0f;
            if (n8 > 0.8f) {
                n9 = (n8 - 0.8f) / 0.2f;
            }
            final Random random = new Random(432L);
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 1);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -1.0f, -2.0f);
            for (int n10 = 0; n10 < (n8 + n8 * n8) / 2.0f * 60.0f; ++n10) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(random.nextFloat() * 360.0f, 0.0f, 0.0f, 1.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(random.nextFloat() * 360.0f + n8 * 90.0f, 0.0f, 0.0f, 1.0f);
                final float n11 = random.nextFloat() * 20.0f + 5.0f + n9 * 10.0f;
                final float n12 = random.nextFloat() * 2.0f + 1.0f + n9 * 2.0f;
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(6, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, 0.0).IlIlIlIlIlllllllllIl(255, 255, 255, (int)(255.0f * (1.0f - n9))).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-0.866 * n12, n11, -0.5f * n12).IlIlIlIlIlllllllllIl(255, 0, 255, 0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.866 * n12, n11, -0.5f * n12).IlIlIlIlIlllllllllIl(255, 0, 255, 0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n11, 1.0f * n12).IlIlIlIlIlllllllllIl(255, 0, 255, 0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-0.866 * n12, n11, -0.5f * n12).IlIlIlIlIlllllllllIl(255, 0, 255, 0).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            }
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
