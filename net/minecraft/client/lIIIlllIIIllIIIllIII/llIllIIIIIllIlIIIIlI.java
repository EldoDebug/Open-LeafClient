package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.*;
import java.util.*;
import net.optifine.shaders.*;

public class llIllIIIIIllIlIIIIlI
{
    private static float llllIIIIlIIIlIlllIll;
    private static boolean IlIlIlIlIlllllllllIl;
    private static final IlIIlIlIIIlIIlIlIlII[] llIllIIIIIllIlIIIIlI;
    private static volatile /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl;
    
    static {
        net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = 0.2f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl = false;
        llIllIIIIIllIlIIIIlI = new IlIIlIlIIIlIIlIlIlII[] { IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI, IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl, IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl };
    }
    
    public llIllIIIIIllIlIIIIlI() {
        if (lIIIIlIIIIIlllIllIII.v.IlIIIlIlIIIllIlIlIIl()) {
            lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.v, (Object)false);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl2);
        return this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2, liIllIIIllllIlllIllI, true);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final boolean b) {
        final boolean b2 = Minecraft.IIlIIIIlllIlllllIlII() && llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IlIIIlIlIIIllIlIlIIl() == 0 && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        try {
            if (llllIIIIlIIIlIlllIll.b()) {
                IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI, liIllIIIllllIlllIllI);
            }
            final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll2 = liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl);
            llllIIIIlIIIlIlllIll = net.optifine.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll2);
            final boolean b3 = b2 ? this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, liIllIIIllllIlllIllI, b) : this.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, liIllIIIllllIlllIllI, b);
            if (b3) {
                this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, liIllIIIllllIlllIllI, b, 0L, llllIIIIlIIIlIlllIll2, b2);
            }
            if (llllIIIIlIIIlIlllIll.b()) {
                IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liIllIIIllllIlllIllI);
            }
            return b3;
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Tesselating block model");
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Block model being tesselated");
            lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
            llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("Using AO", b2);
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll3);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final boolean b) {
        return this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2), ilIlIlIlIlllllllllIl2, liIllIIIllllIlllIllI, b);
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final boolean b) {
        boolean b2 = false;
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2);
        final IlIIlIlIIIlIIlIlIlII iIlllIIlIllIllIlIIll = liIllIIIllllIlllIllI.IIlllIIlIllIllIlIIll();
        lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl;
        for (int length = (llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = llllIIIlIlllIlIIIIIl[i];
            final List llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            if (!llllIIIIlIIIlIlllIll2.isEmpty()) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                if (!b || llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll3, lllIllIIIllllllIllll)) {
                    this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2, liIllIIIllllIlllIllI, net.optifine.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2, lllIllIIIllllllIllll, iIlllIIlIllIllIlIIll, 0L, llllIIIIlIIIlIlllIll), llllIIIIlIIIlIlllIll);
                    b2 = true;
                }
            }
        }
        final List llllIIIIlIIIlIlllIll4 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll4.size() > 0) {
            this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2, liIllIIIllllIlllIllI, net.optifine.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2, null, iIlllIIlIllIllIlIIll, 0L, llllIIIIlIIIlIlllIll), llllIIIIlIIIlIlllIll);
            b2 = true;
        }
        return b2;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final boolean b) {
        return this.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2), ilIlIlIlIlllllllllIl2, liIllIIIllllIlllIllI, b);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final boolean b) {
        boolean b2 = false;
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2);
        final IlIIlIlIIIlIIlIlIlII iIlllIIlIllIllIlIIll = liIllIIIllllIlllIllI.IIlllIIlIllIllIlIIll();
        lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl;
        for (int length = (llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = llllIIIlIlllIlIIIIIl[i];
            final List llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            if (!llllIIIIlIIIlIlllIll2.isEmpty()) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                if (!b || llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll3, lllIllIIIllllllIllll)) {
                    this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2, lllIllIIIllllllIllll, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll3), false, liIllIIIllllIlllIllI, net.optifine.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2, lllIllIIIllllllIllll, iIlllIIlIllIllIlIIll, 0L, llllIIIIlIIIlIlllIll), llllIIIIlIIIlIlllIll);
                    b2 = true;
                }
            }
        }
        final List llllIIIIlIIIlIlllIll4 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll4.size() > 0) {
            this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2, null, -1, true, liIllIIIllllIlllIllI, net.optifine.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2, null, iIlllIIlIllIllIlIIll, 0L, llllIIIIlIIIlIlllIll), llllIIIIlIIIlIlllIll);
            b2 = true;
        }
        return b2;
    }
    
    private void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final List list, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        final float[] llIllIIIIIllIlIIIIlI2 = llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI();
        final BitSet ilIIIlIlIIIllIlIlIIl = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        final IlIIIlIlIIIllIlIlIIl ilIlIIIllIllIIIIIllI = llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI();
        double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        final IllIIlllIIIIlllIIlIl llIllIlIlIIIIIIIllII = llIllIIIIIllIlIIIIlI.llIllIlIlIIIIIIIllII();
        if (llIllIlIlIIIIIIIllII != IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
            final long llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            n += ((llllIIIIlIIIlIlllIll >> 16 & 0xFL) / 15.0f - 0.5) * 0.5;
            n3 += ((llllIIIIlIIIlIlllIll >> 24 & 0xFL) / 15.0f - 0.5) * 0.5;
            if (llIllIlIlIIIIIIIllII == IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI) {
                n2 += ((llllIIIIlIIIlIlllIll >> 20 & 0xFL) / 15.0f - 1.0) * 0.2;
            }
        }
        for (final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 : list) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI(), llIllIIIIIllIlIIIIlI2, ilIIIlIlIIIllIlIlIIl);
            ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI(), llIllIIIIIllIlIIIIlI2, ilIIIlIlIIIllIlIlIIl);
            if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll().IIIlIIIlIlIIlllIIlll) {
                ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
            }
            if (liIllIIIllllIlllIllI.llIllIlIIIIllIlIIllI()) {
                liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl());
            }
            else {
                liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl());
            }
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll());
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl[0], ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl[1], ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl[2], ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl[3]);
            final int llllIIIIlIIIlIlllIll3 = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llIIlIIIlIIIllIlIIIl, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl);
            if (!llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI() && llllIIIIlIIIlIlllIll3 == -1) {
                if (net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) {
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[0], 4);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[1], 3);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[2], 2);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[3], 1);
                }
                else {
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[0], ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[0], ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[0], 4);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[1], ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[1], ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[1], 3);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[2], ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[2], ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[2], 2);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[3], ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[3], ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[3], 1);
                }
            }
            else {
                int n4;
                if (llllIIIIlIIIlIlllIll3 != -1) {
                    n4 = llllIIIIlIIIlIlllIll3;
                }
                else {
                    n4 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl());
                }
                if (IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
                    n4 = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(n4);
                }
                final float n5 = (n4 >> 16 & 0xFF) / 255.0f;
                final float n6 = (n4 >> 8 & 0xFF) / 255.0f;
                final float n7 = (n4 & 0xFF) / 255.0f;
                if (net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) {
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n5, n6, n7, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[0], 4);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n5, n6, n7, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[1], 3);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n5, n6, n7, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[2], 2);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n5, n6, n7, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[3], 1);
                }
                else {
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[0] * n5, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[0] * n6, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[0] * n7, 4);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[1] * n5, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[1] * n6, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[1] * n7, 3);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[2] * n5, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[2] * n6, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[2] * n7, 2);
                    liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[3] * n5, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[3] * n6, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll[3] * n7, 1);
                }
            }
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int[] array, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float[] array2, final BitSet set) {
        float min = 32.0f;
        float min2 = 32.0f;
        float min3 = 32.0f;
        float max = -32.0f;
        float max2 = -32.0f;
        float max3 = -32.0f;
        final int n = array.length / 4;
        for (int i = 0; i < 4; ++i) {
            final float intBitsToFloat = Float.intBitsToFloat(array[i * n]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array[i * n + 1]);
            final float intBitsToFloat3 = Float.intBitsToFloat(array[i * n + 2]);
            min = Math.min(min, intBitsToFloat);
            min2 = Math.min(min2, intBitsToFloat2);
            min3 = Math.min(min3, intBitsToFloat3);
            max = Math.max(max, intBitsToFloat);
            max2 = Math.max(max2, intBitsToFloat2);
            max3 = Math.max(max3, intBitsToFloat3);
        }
        if (array2 != null) {
            array2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()] = min;
            array2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()] = max;
            array2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()] = min2;
            array2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] = max2;
            array2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()] = min3;
            array2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()] = max3;
            final int length = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length;
            array2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl() + length] = 1.0f - min;
            array2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl() + length] = 1.0f - max;
            array2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() + length] = 1.0f - min2;
            array2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() + length] = 1.0f - max2;
            array2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl() + length] = 1.0f - min3;
            array2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl() + length] = 1.0f - max3;
        }
        switch (IlIlIlIlIlllllllllIl()[lllIllIIIllllllIllll.ordinal()]) {
            case 1: {
                set.set(1, min >= 1.0E-4f || min3 >= 1.0E-4f || max <= 0.9999f || max3 <= 0.9999f);
                set.set(0, (min2 < 1.0E-4f || llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) && min2 == max2);
                break;
            }
            case 2: {
                set.set(1, min >= 1.0E-4f || min3 >= 1.0E-4f || max <= 0.9999f || max3 <= 0.9999f);
                set.set(0, (max2 > 0.9999f || llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) && min2 == max2);
                break;
            }
            case 3: {
                set.set(1, min >= 1.0E-4f || min2 >= 1.0E-4f || max <= 0.9999f || max2 <= 0.9999f);
                set.set(0, (min3 < 1.0E-4f || llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) && min3 == max3);
                break;
            }
            case 4: {
                set.set(1, min >= 1.0E-4f || min2 >= 1.0E-4f || max <= 0.9999f || max2 <= 0.9999f);
                set.set(0, (max3 > 0.9999f || llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) && min3 == max3);
                break;
            }
            case 5: {
                set.set(1, min2 >= 1.0E-4f || min3 >= 1.0E-4f || max2 <= 0.9999f || max3 <= 0.9999f);
                set.set(0, (min < 1.0E-4f || llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) && min == max);
                break;
            }
            case 6: {
                set.set(1, min2 >= 1.0E-4f || min3 >= 1.0E-4f || max2 <= 0.9999f || max3 <= 0.9999f);
                set.set(0, (max > 0.9999f || llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) && min == max);
                break;
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, int n, final boolean b, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final List list, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        final BitSet ilIIIlIlIIIllIlIlIIl = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        double n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        double n3 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        double n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        final IllIIlllIIIIlllIIlIl llIllIlIlIIIIIIIllII = llIllIIIIIllIlIIIIlI.llIllIlIlIIIIIIIllII();
        if (llIllIlIlIIIIIIIllII != IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
            final long n5 = (long)(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() * 3129871) ^ ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() * 116129781L;
            final long n6 = n5 * n5 * 42317861L + n5 * 11L;
            n2 += ((n6 >> 16 & 0xFL) / 15.0f - 0.5) * 0.5;
            n4 += ((n6 >> 24 & 0xFL) / 15.0f - 0.5) * 0.5;
            if (llIllIlIlIIIIIIIllII == IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI) {
                n3 += ((n6 >> 20 & 0xFL) / 15.0f - 1.0) * 0.2;
            }
        }
        for (final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : list) {
            if (b) {
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(), null, ilIIIlIlIIIllIlIlIIl);
                n = (ilIIIlIlIIIllIlIlIIl.get(0) ? llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI())) : llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl));
            }
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().IIIlIIIlIlIIlllIIlll) {
                n |= 0xF0;
            }
            if (liIllIIIllllIlllIllI.llIllIlIIIIllIlIIllI()) {
                liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl());
            }
            else {
                liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
            }
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n, n, n, n);
            final int llllIIIIlIIIlIlllIll2 = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl);
            if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() || llllIIIIlIIIlIlllIll2 != -1) {
                int n7;
                if (llllIIIIlIIIlIlllIll2 != -1) {
                    n7 = llllIIIIlIIIlIlllIll2;
                }
                else {
                    n7 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
                }
                if (IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
                    n7 = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(n7);
                }
                final float n8 = (n7 >> 16 & 0xFF) / 255.0f;
                final float n9 = (n7 >> 8 & 0xFF) / 255.0f;
                final float n10 = (n7 & 0xFF) / 255.0f;
                liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n8, n9, n10, 4);
                liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n8, n9, n10, 3);
                liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n8, n9, n10, 2);
                liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n8, n9, n10, 1);
            }
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n2, n3, n4);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float n, final float n2, final float n3, final float n4) {
        lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl;
        for (int length = (llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl).length, i = 0; i < length; ++i) {
            this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl[i]));
        }
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final boolean b) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 1.0f, 0.0f);
        int n2 = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(llIIlIIIlIIIllIlIIIl));
        if (IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
            n2 = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(n2);
        }
        final float n3 = (n2 >> 16 & 0xFF) / 255.0f;
        final float n4 = (n2 >> 8 & 0xFF) / 255.0f;
        final float n5 = (n2 & 0xFF) / 255.0f;
        if (!b) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n, n, n, 1.0f);
        }
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, n3, n4, n5);
    }
    
    private void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final List list) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        for (final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 : list) {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl());
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll());
            if (llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI()) {
                llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(n2 * n, n3 * n, n4 * n);
            }
            else {
                llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(n, n, n);
            }
            final f ilIlIIIllIIllIlllllI = llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI().IlIlIIIllIIllIlllllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl((float)ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII(), (float)ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII(), (float)ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl());
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        }
    }
    
    public static float llllIIIIlIIIlIlllIll(final float n) {
        return (n == 0.2f) ? net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll : n;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = 1.0f - net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll() * 0.8f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl = (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && llIIlllIIlllIIllIllI.IlIlIIIIIIlllIlIllIl());
    }
    
    private void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final boolean b, final long n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final boolean b2) {
        if (llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII()) {
            for (int i = 0; i < net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.length; ++i) {
                final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII = net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI[i];
                final net.optifine.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII);
                if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() > 0) {
                    final IlIIllIIllIIllIIlIIl llllIIllllIlIlIIIIll = llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll();
                    if (llllIIllllIlIlIIIIll != null) {
                        final lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll2 = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII);
                        if (!llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI()) {
                            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
                            llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(liIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll(), liIllIIIllllIlllIllI.llllIIllllIlIlIIIIll(), liIllIIIllllIlllIllI.IlIllIlIlIIIlIlIlIII());
                        }
                        for (int j = 0; j < llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(); ++j) {
                            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(j);
                            final List llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(j);
                            if (llllIIIIlIIIlIlllIll3.llllIIllllIlIlIIIIll() != null) {
                                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.llllIIllllIlIlIIIIll(), ilIlIlIlIlllllllllIl3);
                            }
                            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl2);
                            if (b2) {
                                this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll4, llllIIIlIlllIlIIIIIl);
                            }
                            else {
                                this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll3.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.IlIlIIIllIllIIIIIllI())), false, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll4, llllIIIlIlllIlIIIIIl);
                            }
                        }
                    }
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                }
            }
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII() && !llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl() && net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2)) {
            this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, net.optifine.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), net.optifine.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl2, liIllIIIllllIlllIllI, b);
        }
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] ilIIIlIlIIIllIlIlIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl;
        if (ilIIIlIlIIIllIlIlIIl != null) {
            return ilIIIlIlIIIllIlIlIIl;
        }
        final int[] ilIIIlIlIIIllIlIlIIl2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            ilIIIlIlIIIllIlIlIIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
    }
}
