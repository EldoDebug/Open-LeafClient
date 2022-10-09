package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;

public class IlIlIlIlIlllllllllIl implements IlIllIlIlIIIlIlIlIII
{
    private final IIllIIIlIIlIlIlIIIII llllIIIIlIIIlIlllIll;
    
    public IlIlIlIlIlllllllllIl(final IIllIIIlIIlIlIlIIIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final int v = lllIIIIlllllIlIIllIl.V();
        if (v > 0) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII, lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII);
            final Random random = new Random(lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl());
            lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            for (int i = 0; i < v; ++i) {
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(random);
                final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI.get(random.nextInt(llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI.size()));
                llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(0.0625f);
                final float nextFloat = random.nextFloat();
                final float nextFloat2 = random.nextFloat();
                final float nextFloat3 = random.nextFloat();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll + (llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl - llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll) * nextFloat) / 16.0f, (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + (llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI - llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl) * nextFloat2) / 16.0f, (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI + (llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl - llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) * nextFloat3) / 16.0f);
                final float n8 = nextFloat * 2.0f - 1.0f;
                final float n9 = nextFloat2 * 2.0f - 1.0f;
                final float n10 = nextFloat3 * 2.0f - 1.0f;
                final float n11 = n8 * -1.0f;
                final float n12 = n9 * -1.0f;
                final float n13 = n10 * -1.0f;
                final float llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n11 * n11 + n13 * n13);
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll;
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll;
                final float n14 = (float)(Math.atan2(n11, n13) * 180.0 / 3.141592653589793);
                llllIIIIlIIIlIlllIll4.IIlIIIIIllIlIIIlIIll = n14;
                llllIIIIlIIIlIlllIll3.IIIllllllIllIIIlllIl = n14;
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll;
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll6 = llllIIIIlIIIlIlllIll;
                final float n15 = (float)(Math.atan2(n12, llIllIIIIIllIlIIIIlI) * 180.0 / 3.141592653589793);
                llllIIIIlIIIlIlllIll6.llllllIllIllIlIllllI = n15;
                llllIIIIlIIIlIlllIll5.IlIIIlIIIllllIlIlIlI = n15;
                this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 0.0, 0.0, 0.0, 0.0f, n3);
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
