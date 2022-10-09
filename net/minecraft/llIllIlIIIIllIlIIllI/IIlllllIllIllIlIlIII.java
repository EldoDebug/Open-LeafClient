package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;

public class IIlllllIllIllIlIlIII extends llllIllllIllllIlIlII
{
    protected IIlllllIllIllIlIlIII() {
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final int n, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final String string = "map_" + n;
        IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.class, string);
        if (illIIlllIIIIlllIIlIl == null) {
            illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(string);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(string, illIIlllIIIIlllIIlIl);
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    public IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.class, "map_" + lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
        if (illIIlllIIIIlllIIlIl == null && !illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl("map"));
            final String string = "map_" + lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
            illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(string);
            illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = 3;
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().llIllIIIIIllIlIIIIlI(), illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().IlIlIIIllIllIIIIIllI(), illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
            illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = (byte)illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll();
            illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(string, illIIlllIIIIlllIIlIl);
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        if (illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll() == illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl && llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll) {
            final int n = 1 << illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI;
            final int ilIlIlIlIlllllllllIl = illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl;
            final int llIllIIIIIllIlIIIIlI2 = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI;
            final int n2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - ilIlIlIlIlllllllllIl) / n + 64;
            final int n3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI2) / n + 64;
            int n4 = 128 / n;
            if (illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
                n4 /= 2;
            }
            final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll;
            final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI);
            ++llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
            int n5 = 0;
            for (int i = n2 - n4 + 1; i < n2 + n4; ++i) {
                if ((i & 0xF) == (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl & 0xF) || n5 != 0) {
                    n5 = 0;
                    double n6 = 0.0;
                    for (int j = n3 - n4 - 1; j < n3 + n4; ++j) {
                        if (i >= 0 && j >= -1 && i < 128 && j < 128) {
                            final int n7 = i - n2;
                            final int n8 = j - n3;
                            final boolean b = n7 * n7 + n8 * n8 > (n4 - 2) * (n4 - 2);
                            final int n9 = (ilIlIlIlIlllllllllIl / n + i - 64) * n;
                            final int n10 = (llIllIIIIIllIlIIIIlI2 / n + j - 64) * n;
                            final HashMultiset create = HashMultiset.create();
                            final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl2 = illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl(new IlIlIlIlIlllllllllIl(n9, 0, n10));
                            if (!llllIIIlIlllIlIIIIIl2.lIIIIlIIIIIlllIllIII()) {
                                final int n11 = n9 & 0xF;
                                final int n12 = n10 & 0xF;
                                int n13 = 0;
                                double n14 = 0.0;
                                if (illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
                                    final int n15 = n9 + n10 * 231871;
                                    if ((n15 * n15 * 31287121 + n15 * 11 >> 20 & 0x1) == 0x0) {
                                        ((Multiset)create).add((Object)net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI, IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll)), 10);
                                    }
                                    else {
                                        ((Multiset)create).add((Object)net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ct.IIIIIIIIIlllIllIlIlI, cu.llllIIIIlIIIlIlllIll)), 100);
                                    }
                                    n14 = 100.0;
                                }
                                else {
                                    final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3 = new llllIIIlIlllIlIIIIIl();
                                    for (int k = 0; k < n; ++k) {
                                        for (int l = 0; l < n; ++l) {
                                            int n16 = llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(k + n11, l + n12) + 1;
                                            llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
                                            if (n16 > 1) {
                                                do {
                                                    --n16;
                                                    llIIlIIIlIIIllIlIIIl = llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl(llllIIIlIlllIlIIIIIl3.IlIlIlIlIlllllllllIl(k + n11, n16, l + n12));
                                                } while (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl) == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl && n16 > 0);
                                                if (n16 > 0 && llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
                                                    int n17 = n16 - 1;
                                                    net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2;
                                                    do {
                                                        llllIIIIlIIIlIlllIll2 = llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll(k + n11, n17--, l + n12);
                                                        ++n13;
                                                    } while (n17 > 0 && llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll());
                                                }
                                            }
                                            n14 += n16 / (double)(n * n);
                                            ((Multiset)create).add((Object)llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl));
                                        }
                                    }
                                }
                                final int n18 = n13 / (n * n);
                                final double n19 = (n14 - n6) * 4.0 / (n + 4) + ((i + j & 0x1) - 0.5) * 0.4;
                                int n20 = 1;
                                if (n19 > 0.6) {
                                    n20 = 2;
                                }
                                if (n19 < -0.6) {
                                    n20 = 0;
                                }
                                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)create), (Object)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
                                if (llllIIIIlIIIlIlllIll3 == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll) {
                                    final double n21 = n18 * 0.1 + (i + j & 0x1) * 0.2;
                                    n20 = 1;
                                    if (n21 < 0.5) {
                                        n20 = 2;
                                    }
                                    if (n21 > 0.9) {
                                        n20 = 0;
                                    }
                                }
                                n6 = n14;
                                if (j >= 0 && n7 * n7 + n8 * n8 < n4 * n4 && (!b || (i + j & 0x1) != 0x0)) {
                                    final byte b2 = illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl[i + j * 128];
                                    final byte b3 = (byte)(llllIIIIlIIIlIlllIll3.IIllllIIIlIIIIIIllIl * 4 + n20);
                                    if (b2 != b3) {
                                        illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl[i + j * 128] = b3;
                                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i, j);
                                        n5 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final boolean b) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII);
            if (llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI, lllIIIIlIlIllIIlIIIl);
            }
            if (b) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII).llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll() && lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IIIIlllIIIIIIlIIIlll("map_is_scaling")) {
            final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll2 = IIllIIllIIIlIlIIIIlI.h.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII);
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl("map"));
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl("map_" + lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
            illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = (byte)(llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI + 1);
            if (illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI > 4) {
                illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = 4;
            }
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI, illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
            illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl;
            illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll("map_" + lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII(), illIIlllIIIIlllIIlIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final boolean b) {
        final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII);
        if (b) {
            if (llllIIIIlIIIlIlllIll2 == null) {
                list.add("Unknown map");
            }
            else {
                list.add("Scaling at 1:" + (1 << llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI));
                list.add("(Level " + llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI + "/" + 4 + ")");
            }
        }
    }
}
