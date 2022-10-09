package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIIIIIIIlllIllIlIlI extends llIllIIIIIllIlIIIIlI
{
    public IIIIIIIIIlllIllIlIlI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final double n, final double n2, final double n3, final float n4, final float n5) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 1);
        final double[] array = new double[8];
        final double[] array2 = new double[8];
        double n6 = 0.0;
        double n7 = 0.0;
        final Random random = new Random(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        for (int i = 7; i >= 0; --i) {
            array[i] = n6;
            array2[i] = n7;
            n6 += random.nextInt(11) - 5;
            n7 += random.nextInt(11) - 5;
        }
        for (int j = 0; j < 4; ++j) {
            final Random random2 = new Random(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
            for (int k = 0; k < 3; ++k) {
                int n8 = 7;
                int n9 = 0;
                if (k > 0) {
                    n8 = 7 - k;
                }
                if (k > 0) {
                    n9 = n8 - 2;
                }
                double n10 = array[n8] - n6;
                double n11 = array2[n8] - n7;
                for (int l = n8; l >= n9; --l) {
                    final double n12 = n10;
                    final double n13 = n11;
                    if (k == 0) {
                        n10 += random2.nextInt(11) - 5;
                        n11 += random2.nextInt(11) - 5;
                    }
                    else {
                        n10 += random2.nextInt(31) - 15;
                        n11 += random2.nextInt(31) - 15;
                    }
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(5, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                    double n14 = 0.1 + j * 0.2;
                    if (k == 0) {
                        n14 *= l * 0.1 + 1.0;
                    }
                    double n15 = 0.1 + j * 0.2;
                    if (k == 0) {
                        n15 *= (l - 1) * 0.1 + 1.0;
                    }
                    for (int n16 = 0; n16 < 5; ++n16) {
                        double n17 = n + 0.5 - n14;
                        double n18 = n3 + 0.5 - n14;
                        if (n16 == 1 || n16 == 2) {
                            n17 += n14 * 2.0;
                        }
                        if (n16 == 2 || n16 == 3) {
                            n18 += n14 * 2.0;
                        }
                        double n19 = n + 0.5 - n15;
                        double n20 = n3 + 0.5 - n15;
                        if (n16 == 1 || n16 == 2) {
                            n19 += n15 * 2.0;
                        }
                        if (n16 == 2 || n16 == 3) {
                            n20 += n15 * 2.0;
                        }
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n19 + n10, n2 + l * 16, n20 + n11).llllIIIIlIIIlIlllIll(0.45f, 0.45f, 0.5f, 0.3f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n17 + n12, n2 + (l + 1) * 16, n18 + n13).llllIIIIlIIIlIlllIll(0.45f, 0.45f, 0.5f, 0.3f).IlIlIIIllIllIIIIIllI();
                    }
                    llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
                }
            }
        }
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return null;
    }
}
