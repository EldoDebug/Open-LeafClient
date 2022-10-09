package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import com.google.common.base.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlllIlIIllIlIlIlIIl extends lllIllIIIllllllIllll
{
    private final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final Predicate llIllIIIIIllIlIIIIlI;
    
    public IIlllIlIIllIlIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        this(llIIlIIIlIIIllIlIIIl, n, (Predicate)net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
    }
    
    public IIlllIlIIllIlIlIlIIl(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final Predicate llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final float n = random.nextFloat() * 3.1415927f;
        final double n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 8 + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n) * this.IlIlIlIlIlllllllllIl / 8.0f;
        final double n3 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 8 - llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n) * this.IlIlIlIlIlllllllllIl / 8.0f;
        final double n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 8 + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n) * this.IlIlIlIlIlllllllllIl / 8.0f;
        final double n5 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 8 - llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n) * this.IlIlIlIlIlllllllllIl / 8.0f;
        final double n6 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextInt(3) - 2;
        final double n7 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextInt(3) - 2;
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            final float n8 = i / (float)this.IlIlIlIlIlllllllllIl;
            final double n9 = n2 + (n3 - n2) * n8;
            final double n10 = n6 + (n7 - n6) * n8;
            final double n11 = n4 + (n5 - n4) * n8;
            final double n12 = random.nextDouble() * this.IlIlIlIlIlllllllllIl / 16.0;
            final double n13 = (llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(3.1415927f * n8) + 1.0f) * n12 + 1.0;
            final double n14 = (llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(3.1415927f * n8) + 1.0f) * n12 + 1.0;
            final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n9 - n13 / 2.0);
            final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n10 - n14 / 2.0);
            final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n11 - n13 / 2.0);
            final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n9 + n13 / 2.0);
            final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n10 + n14 / 2.0);
            final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n11 + n13 / 2.0);
            for (int j = llIllIIIIIllIlIIIIlI; j <= llIllIIIIIllIlIIIIlI4; ++j) {
                final double n15 = (j + 0.5 - n9) / (n13 / 2.0);
                if (n15 * n15 < 1.0) {
                    for (int k = llIllIIIIIllIlIIIIlI2; k <= llIllIIIIIllIlIIIIlI5; ++k) {
                        final double n16 = (k + 0.5 - n10) / (n14 / 2.0);
                        if (n15 * n15 + n16 * n16 < 1.0) {
                            for (int l = llIllIIIIIllIlIIIIlI3; l <= llIllIIIIIllIlIIIIlI6; ++l) {
                                final double n17 = (l + 0.5 - n11) / (n13 / 2.0);
                                if (n15 * n15 + n16 * n16 + n17 * n17 < 1.0) {
                                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(j, k, l);
                                    if (this.llIllIIIIIllIlIIIIlI.apply((Object)illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2))) {
                                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, this.llllIIIIlIIIlIlllIll, 2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
