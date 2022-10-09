package net.optifine;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIIlIIIIIlllIllIII
{
    public static void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        if (llllIIIIlIIIlIlllIll != null) {
            int n = 3;
            if (llllIIIIlIIIlIlllIll.x) {
                n = 1;
            }
            net.minecraft.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl, n);
            net.minecraft.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII, n);
        }
        if (illlllllIIIlIIIlIlII != null) {
            final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII llIIIlIlIllIIlIlIlII = illlllllIIIlIIIlIlII.llIIIlIlIllIIlIlIlII();
            if (llIIIlIlIllIIlIlIlII != null) {
                final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lIIIIlIlIllllIIlIllI();
                if (liiiIlIlIllllIIlIllI != null) {
                    final int n2 = (int)liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl / 16;
                    final int n3 = (int)liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII / 16;
                    final int n4 = n2 - 512;
                    final int n5 = n2 + 512;
                    final int n6 = n3 - 512;
                    final int n7 = n3 + 512;
                    int n8 = 0;
                    for (int i = n4; i < n5; ++i) {
                        for (int j = n6; j < n7; ++j) {
                            if (llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(i, j)) {
                                final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl(i, j);
                                if (ilIIIlIlIIIllIlIlIIl != null && !(ilIIIlIlIIIllIlIlIIl instanceof llllIIIlIlllIlIIIIIl)) {
                                    final int n9 = i << 4;
                                    final int n10 = j << 4;
                                    final int n11 = n9 + 16;
                                    final int n12 = n10 + 16;
                                    final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = new IlIIIlIlIIIllIlIlIIl(0, 0, 0);
                                    final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl3 = new IlIIIlIlIIIllIlIlIIl(0, 0, 0);
                                    for (int k = n9; k < n11; ++k) {
                                        for (int l = n10; l < n12; ++l) {
                                            ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl(k, 0, l);
                                            final IlIlIlIlIlllllllllIl iIlllIIlIllIllIlIIll = illlllllIIIlIIIlIlII.IIlllIIlIllIllIlIIll(ilIIIlIlIIIllIlIlIIl2);
                                            for (int n13 = 0; n13 < iIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII(); ++n13) {
                                                ilIIIlIlIIIllIlIlIIl3.IlIlIlIlIlllllllllIl(k, n13, l);
                                                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl3).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                                                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(k, l, ilIIIlIlIIIllIlIlIIl3.lIIIlllIIIllIIIllIII(), iIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII());
                                                    ++n8;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (n8 > 0) {
                        String s = "server";
                        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll()) {
                            s = "client";
                        }
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("ClearWater (" + s + ") relighted " + n8 + " chunks");
                    }
                }
            }
        }
    }
}
