package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.util.*;

class f
{
    private final IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl;
    private final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private final lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    private final int[] IlIlIIIllIllIIIIIllI;
    final /* synthetic */ e llllIIIIlIIIlIlllIll;
    
    private f(final e llllIIIIlIIIlIlllIll, final IllIIlllIIIIlllIIlIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = new IlIlIlIlIlllllllllIl(128, 128);
        this.IlIlIIIllIllIIIIIllI = this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("map/" + ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI);
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.length; ++i) {
            this.IlIlIIIllIllIIIIIllI[i] = 0;
        }
    }
    
    private void llllIIIIlIIIlIlllIll() {
        for (int i = 0; i < 16384; ++i) {
            final int n = this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl[i] & 0xFF;
            if (n / 4 == 0) {
                this.IlIlIIIllIllIIIIIllI[i] = (i + i / 128 & 0x1) * 8 + 16 << 24;
            }
            else {
                this.IlIlIIIllIllIIIIIllI[i] = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[n / 4].llllIIIIlIIIlIlllIll(n & 0x3);
            }
        }
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    private void llllIIIIlIIIlIlllIll(final boolean b) {
        final int n = 0;
        final int n2 = 0;
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        final float n3 = 0.0f;
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1, 771, 0, 1);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0 + n3, n2 + 128 - n3, -0.009999999776482582).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 128 - n3, n2 + 128 - n3, -0.009999999776482582).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 128 - n3, n2 + 0 + n3, -0.009999999776482582).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0 + n3, n2 + 0 + n3, -0.009999999776482582).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(e.llllIIIIlIIIlIlllIll);
        int n4 = 0;
        for (final g g : this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.values()) {
            if (!b || g.llllIIIIlIIIlIlllIll() == 1) {
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n + g.IlIlIlIlIlllllllllIl() / 2.0f + 64.0f, n2 + g.llIllIIIIIllIlIIIIlI() / 2.0f + 64.0f, -0.02f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(g.IlIIIlIlIIIllIlIlIIl() * 360 / 16.0f, 0.0f, 0.0f, 1.0f);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(4.0f, 4.0f, 3.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.125f, 0.125f, 0.0f);
                final byte llllIIIIlIIIlIlllIll2 = g.llllIIIIlIIIlIlllIll();
                final float n5 = (llllIIIIlIIIlIlllIll2 % 4 + 0) / 4.0f;
                final float n6 = (llllIIIIlIIIlIlllIll2 / 4 + 0) / 4.0f;
                final float n7 = (llllIIIIlIIIlIlllIll2 % 4 + 1) / 4.0f;
                final float n8 = (llllIIIIlIIIlIlllIll2 / 4 + 1) / 4.0f;
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, 1.0, n4 * -0.001f).llllIIIIlIIIlIlllIll(n5, n6).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, 1.0, n4 * -0.001f).llllIIIIlIIIlIlllIll(n7, n6).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, n4 * -0.001f).llllIIIIlIIIlIlllIll(n7, n8).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, n4 * -0.001f).llllIIIIlIIIlIlllIll(n5, n8).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                ++n4;
            }
        }
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -0.04f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
}
