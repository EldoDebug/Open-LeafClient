package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.optifine.*;
import com.google.common.collect.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public final class IIllIIllIIIlIlIIIIlI
{
    private static final int llllIIIIlIIIlIlllIll;
    private final Set IlIlIlIlIlllllllllIl;
    private Map llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = (int)Math.pow(17.0, 2.0);
    }
    
    public IIllIIllIIIlIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = Sets.newHashSet();
        this.llIllIIIIIllIlIIIIlI = new HashMap();
        this.IlIIIlIlIIIllIlIlIIl = Integer.MAX_VALUE;
        this.IlIlIIIllIllIIIIIllI = Integer.MAX_VALUE;
    }
    
    public int llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final boolean b, final boolean b2, final boolean b3) {
        if (!b && !b2) {
            return 0;
        }
        boolean b4 = true;
        llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = null;
        if (iiIllllllIllIIIlllIl.IllIIlllIIIIlllIIlIl.size() == 1) {
            llllIIIIlIIIlIlllIll = iiIllllllIllIIIlllIl.IllIIlllIIIIlllIIlIl.get(0);
            if (this.IlIlIlIlIlllllllllIl.size() > 0 && llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl == this.IlIIIlIlIIIllIlIlIIl && llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII == this.IlIlIIIllIllIIIIIllI) {
                b4 = false;
            }
        }
        if (b4) {
            this.IlIlIlIlIlllllllllIl.clear();
            int illIIlllIIIIlllIIlIl = 0;
            for (final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 : iiIllllllIllIIIlllIl.IllIIlllIIIIlllIIlIl) {
                if (!llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl()) {
                    final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2.IIlllIlIIllIlIlIlIIl / 16.0);
                    final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2.lllllIlIIIlIlIIlllII / 16.0);
                    for (int n = 8, i = -n; i <= n; ++i) {
                        for (int j = -n; j <= n; ++j) {
                            final boolean b5 = i == -n || i == n || j == -n || j == n;
                            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(i + llIllIIIIIllIlIIIIlI, j + llIllIIIIIllIlIIIIlI2);
                            if (!this.IlIlIlIlIlllllllllIl.contains(ilIlIlIlIlllllllllIl)) {
                                ++illIIlllIIIIlllIIlIl;
                                if (!b5 && iiIllllllIllIIIlllIl.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
                                    this.IlIlIlIlIlllllllllIl.add(ilIlIlIlIlllllllllIl);
                                }
                            }
                        }
                    }
                }
            }
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            if (llllIIIIlIIIlIlllIll != null) {
                this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl;
                this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII;
            }
        }
        int n2 = 0;
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl iIlllIlIIllIlIlIlIIl = iiIllllllIllIIIlllIl.IIlllIlIIllIlIlIlIIl();
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(0, 0, 0);
        new llllIIIlIlllIlIIIIIl();
        IIlllIlIIllIlIlIlIIl[] values;
        for (int length = (values = IIlllIlIIllIlIlIlIIl.values()).length, k = 0; k < length; ++k) {
            final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl = values[k];
            if ((!illlIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI() || b2) && (illlIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI() || b) && (!illlIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl() || b3) && (lIIIIlIIIIIlllIllIII.H.llIllIIIIIllIlIIIIlI() ? lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(iiIllllllIllIIIlllIl, lIIIIlIIIIIlllIllIII.H, illlIlIIllIlIlIlIIl, true) : iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll())) <= illlIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl() * this.IllIIlllIIIIlllIIlIl / IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
                Object ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl;
                if (lIIIIlIIIIIlllIllIII.IIlIlllIlIlllIlIllll.llIllIIIIIllIlIIIIlI()) {
                    final ArrayList arrayList = Lists.newArrayList((Iterable)ilIlIlIlIlllllllllIl2);
                    Collections.shuffle(arrayList);
                    ilIlIlIlIlllllllllIl2 = arrayList;
                }
            Label_1153:
                while (true) {
                    for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 : ilIlIlIlIlllllllllIl2) {
                        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl, ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl3.IlIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl);
                        final int liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll3.lIIIIlIIIIIlllIllIII();
                        final int liiIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll3.lIIIlllIIIllIIIllIII();
                        final int llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl();
                        if (!iiIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                            int n3 = 0;
                            for (int l = 0; l < 3; ++l) {
                                int n4 = liiiIlIIIIIlllIllIII;
                                int n5 = liiIlllIIIllIIIllIII;
                                int n6 = llIIlIIIlIIIllIlIIIl;
                                final int n7 = 6;
                                lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll4 = null;
                                llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll5 = null;
                                for (int n8 = 0; n8 < 4; ++n8) {
                                    n4 += iiIllllllIllIIIlllIl.llllIIllllIlIlIIIIll.nextInt(n7) - iiIllllllIllIIIlllIl.llllIIllllIlIlIIIIll.nextInt(n7);
                                    n5 += iiIllllllIllIIIlllIl.llllIIllllIlIlIIIIll.nextInt(1) - iiIllllllIllIIIlllIl.llllIIllllIlIlIIIIll.nextInt(1);
                                    n6 += iiIllllllIllIIIlllIl.llllIIllllIlIlIIIIll.nextInt(n7) - iiIllllllIllIIIlllIl.llllIIllllIlIlIIIIll.nextInt(n7);
                                    final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl4 = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n4, n5, n6);
                                    final float n9 = n4 + 0.5f;
                                    final float n10 = n6 + 0.5f;
                                    if (!iiIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(n9, n5, n10, 24.0) && iIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl(n9, n5, n10) >= 576.0) {
                                        if (llllIIIIlIIIlIlllIll4 == null) {
                                            llllIIIIlIIIlIlllIll4 = iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl4);
                                            if (llllIIIIlIIIlIlllIll4 == null) {
                                                break;
                                            }
                                        }
                                        if (iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll4, ilIlIlIlIlllllllllIl4) && llllIIIIlIIIlIlllIll(IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll), iiIllllllIllIIIlllIl, ilIlIlIlIlllllllllIl4)) {
                                            IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII;
                                            try {
                                                ilIllIlIlIIIlIlIlIII = this.llIllIIIIIllIlIIIIlI.get(llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll);
                                                if (ilIllIlIlIIIlIlIlIII == null) {
                                                    ilIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll.getConstructor(IlllllllIIIlIIIlIlII.class).newInstance(iiIllllllIllIIIlllIl);
                                                    this.llIllIIIIIllIlIIIIlI.put(llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll, ilIllIlIlIIIlIlIlIII);
                                                }
                                            }
                                            catch (Exception ex) {
                                                ex.printStackTrace();
                                                return n2;
                                            }
                                            ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(n9, n5, n10, iiIllllllIllIIIlllIl.llllIIllllIlIlIIIIll.nextFloat() * 360.0f, 0.0f);
                                            if (lIIIIlIIIIIlllIllIII.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI() ? IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, iiIllllllIllIIIlllIl, n9, (float)n5, n10) : (ilIllIlIlIIIlIlIlIII.lIlIlIIIllIIllIIIllI() && ilIllIlIlIIIlIlIlIII.k())) {
                                                this.llIllIIIIIllIlIIIIlI.remove(llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll);
                                                if (!IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, iiIllllllIllIIIlllIl, n9, n5, n10)) {
                                                    llllIIIIlIIIlIlllIll5 = ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII)), llllIIIIlIIIlIlllIll5);
                                                }
                                                if (ilIllIlIlIIIlIlIlIII.k()) {
                                                    ++n3;
                                                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII);
                                                }
                                                if (n3 >= (lIIIIlIIIIIlllIllIII.IlIllllIIIlIllIlIIll.llIllIIIIIllIlIIIIlI() ? lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(lIIIIlIIIIIlllIllIII.IlIllllIIIlIllIlIIll, ilIllIlIlIIIlIlIlIII) : ilIllIlIlIIIlIlIlIII.m())) {
                                                    continue Label_1153;
                                                }
                                            }
                                            n2 += n3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
            }
        }
        return n2;
    }
    
    protected static net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n, n2);
        final int n3 = n * 16 + illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(16);
        final int n4 = n2 * 16 + illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(16);
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n3, 0, n4)) + 1, 16);
        return new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n3, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt((llIllIIIIIllIlIIIIlI > 0) ? llIllIIIIIllIlIIIIlI : (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() + 16 - 1)), n4);
    }
    
    private static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n, n2);
        final int n3 = n * 16 + illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(16);
        final int n4 = n2 * 16 + illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(16);
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n3 & 0xF, n4 & 0xF) + 1, 16);
        ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(n3, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt((llIllIIIIIllIlIIIIlI > 0) ? llIllIIIIIllIlIIIIlI : (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() + 16 - 1)), n4);
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!illlllllIIIlIIIlIlII.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
            return false;
        }
        if (illlIIlIllIllIlIIll == null) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        if (illlIIlIllIllIlIIll == IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI) {
            return llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll() && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll() && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII();
        }
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2);
        if (!(lIIIIlIIIIIlllIllIII.llIIIIIIlIllIIlIIIll.llIllIIIIIllIlIIIIlI() ? lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI(), lIIIIlIIIIIlllIllIII.llIIIIIIlIllIIlIIIll, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, illlIIlIllIllIlIIll) : IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2))) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII && llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az && !llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() && !llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll() && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII();
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2, final int n3, final int n4, final Random random) {
        final List llllIIIIlIIIlIlllIll = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl);
        if (!llllIIIIlIIIlIlllIll.isEmpty()) {
            while (random.nextFloat() < llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl()) {
                final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = (lIlIlIIIllIIllIIIllI)i.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, llllIIIIlIIIlIlllIll);
                final int n5 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl + random.nextInt(1 + lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl - lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl);
                llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll2 = null;
                int n6 = n + random.nextInt(n3);
                int n7 = n2 + random.nextInt(n4);
                final int n8 = n6;
                final int n9 = n7;
                for (int i = 0; i < n5; ++i) {
                    boolean b = false;
                    for (int n10 = 0; !b && n10 < 4; ++n10) {
                        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl lllIIIIlllllIlIIllIl = illlllllIIIlIIIlIlII.lllIIIIlllllIlIIllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n6, 0, n7));
                        if (llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl)) {
                            IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII;
                            try {
                                ilIllIlIlIIIlIlIlIII = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.getConstructor(IlllllllIIIlIIIlIlII.class).newInstance(illlllllIIIlIIIlIlII);
                            }
                            catch (Exception ex) {
                                ex.printStackTrace();
                                continue;
                            }
                            if (lIIIIlIIIIIlllIllIII.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI() && lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.IllllIIlIlIllIIIllII, ilIllIlIlIIIlIlIlIII, illlllllIIIlIIIlIlII, n6 + 0.5f, lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII(), n7 + 0.5f) == IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl) {
                                continue;
                            }
                            ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(n6 + 0.5f, lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII(), n7 + 0.5f, random.nextFloat() * 360.0f, 0.0f);
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII);
                            llllIIIIlIIIlIlllIll2 = ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII)), llllIIIIlIIIlIlllIll2);
                            b = true;
                        }
                        for (n6 += random.nextInt(5) - random.nextInt(5), n7 += random.nextInt(5) - random.nextInt(5); n6 < n || n6 >= n + n3 || n7 < n2 || n7 >= n2 + n3; n6 = n8 + random.nextInt(5) - random.nextInt(5), n7 = n9 + random.nextInt(5) - random.nextInt(5)) {}
                    }
                }
            }
        }
    }
}
