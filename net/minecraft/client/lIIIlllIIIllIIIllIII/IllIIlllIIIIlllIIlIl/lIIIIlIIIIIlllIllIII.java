package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class lIIIIlIIIIIlllIllIII extends IIlllIIlIllIllIlIIll
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private lIIIlllIIIllIIIllIII IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/enchanting_table_book.png");
    }
    
    public lIIIIlIIIIIlllIllIII() {
        this.IlIIIlIlIIIllIlIlIIl = new lIIIlllIIIllIIIllIII();
    }
    
    public void llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final double n, final double n2, final double n3, final float n4, final int n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n + 0.5f, (float)n2 + 0.75f, (float)n3 + 0.5f);
        final float n6 = illIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI + n4;
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.1f + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n6 * 0.1f) * 0.01f, 0.0f);
        float n7;
        for (n7 = illIIllIIIlIlIIIIlI.lIlIlIIIllIIllIIIllI - illIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI; n7 >= 3.1415927f; n7 -= 6.2831855f) {}
        while (n7 < -3.1415927f) {
            n7 += 6.2831855f;
        }
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(illIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI + n7 * n4) * 180.0f / 3.1415927f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(80.0f, 0.0f, 0.0f, 1.0f);
        this.llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll);
        final float n8 = illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl + (illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl - illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl) * n4 + 0.25f;
        final float n9 = illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl + (illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl - illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl) * n4 + 0.75f;
        float n10 = (n8 - llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((double)n8)) * 1.6f - 0.3f;
        float n11 = (n9 - llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((double)n9)) * 1.6f - 0.3f;
        if (n10 < 0.0f) {
            n10 = 0.0f;
        }
        if (n11 < 0.0f) {
            n11 = 0.0f;
        }
        if (n10 > 1.0f) {
            n10 = 1.0f;
        }
        if (n11 > 1.0f) {
            n11 = 1.0f;
        }
        final float n12 = illIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI + (illIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl - illIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI) * n4;
        lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(null, n6, n10, n11, n12, 0.0f, 0.0625f);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
}
