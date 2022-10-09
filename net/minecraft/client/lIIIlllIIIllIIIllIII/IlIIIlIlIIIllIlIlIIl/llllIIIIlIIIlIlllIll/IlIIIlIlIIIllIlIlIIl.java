package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIIIlIlIIIllIlIlIIl implements IlIllIlIlIIIlIlIlIII
{
    private final lIIlIIIlIllIlIllIIIl llllIIIIlIIIlIlllIll;
    
    public IlIIIlIlIIIllIlIlIIl(final lIIlIIIlIllIlIllIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI() && !llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII() && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll) && llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() != null) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII());
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, 0.125f);
            final double n8 = llllIIIIlIIIlIlllIll.z + (llllIIIIlIIIlIlllIll.C - llllIIIIlIIIlIlllIll.z) * n3 - (llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII + (llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII) * n3);
            final double n9 = llllIIIIlIIIlIlllIll.A + (llllIIIIlIIIlIlllIll.D - llllIIIIlIIIlIlllIll.A) * n3 - (llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII + (llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII - llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII) * n3);
            final double n10 = llllIIIIlIIIlIlllIll.B + (llllIIIIlIIIlIlllIll.E - llllIIIIlIIIlIlllIll.B) * n3 - (llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII + (llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) * n3);
            final float n11 = llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl + (llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII - llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl) * n3;
            final double n12 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n11 * 3.1415927f / 180.0f);
            final double n13 = -llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n11 * 3.1415927f / 180.0f);
            float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((float)n9 * 10.0f, -6.0f, 32.0f);
            float n14 = (float)(n8 * n12 + n10 * n13) * 100.0f;
            final float n15 = (float)(n8 * n13 - n10 * n12) * 100.0f;
            if (n14 < 0.0f) {
                n14 = 0.0f;
            }
            if (n14 > 165.0f) {
                n14 = 165.0f;
            }
            if (llllIIIIlIIIlIlllIll2 < -5.0f) {
                llllIIIIlIIIlIlllIll2 = -5.0f;
            }
            float n16 = llllIIIIlIIIlIlllIll2 + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI + (llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll - llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI) * n3) * 6.0f) * 32.0f * (llllIIIIlIIIlIlllIll.w + (llllIIIIlIIIlIlllIll.x - llllIIIIlIIIlIlllIll.w) * n3);
            if (llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl()) {
                n16 += 25.0f;
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.142f, -0.0178f);
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(6.0f + n14 / 2.0f + n16, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n15 / 2.0f, 0.0f, 0.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n15 / 2.0f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 1.0f, 0.0f);
            this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII().llIllIIIIIllIlIIIIlI(0.0625f);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
