package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIIlIlIllllIIlIllI extends IlIIIlIlIIIllIlIlIIl
{
    @Override
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        if (n != 1) {
            return super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, n);
        }
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, "Colors");
        if (!(llllIIIIlIIIlIlllIll instanceof IIIlIIIlIlIIlllIIlll)) {
            return 9079434;
        }
        final int[] ilIlIIIllIllIIIIIllI = ((IIIlIIIlIlIIlllIIlll)llllIIIIlIIIlIlllIll).IlIlIIIllIllIIIIIllI();
        if (ilIlIIIllIllIIIIIllI.length == 1) {
            return ilIlIIIllIllIIIIIllI[0];
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int[] array;
        for (int length = (array = ilIlIIIllIllIIIIIllI).length, i = 0; i < length; ++i) {
            final int n5 = array[i];
            n2 += (n5 & 0xFF0000) >> 16;
            n3 += (n5 & 0xFF00) >> 8;
            n4 += (n5 & 0xFF) >> 0;
        }
        return n2 / ilIlIIIllIllIIIIIllI.length << 16 | n3 / ilIlIIIllIllIIIIIllI.length << 8 | n4 / ilIlIIIllIllIIIIIllI.length;
    }
    
    public static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final String s) {
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("Explosion");
            if (ilIlIIIllIIllIlllllI != null) {
                return ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(s);
            }
        }
        return null;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final boolean b) {
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("Explosion");
            if (ilIlIIIllIIllIlllllI != null) {
                llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, list);
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final List list) {
        final byte ilIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Type");
        if (ilIIIlIlIIIllIlIlIIl >= 0 && ilIIIlIlIIIllIlIlIIl <= 4) {
            list.add(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworksCharge.type." + ilIIIlIlIIIllIlIlIIl).trim());
        }
        else {
            list.add(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworksCharge.type").trim());
        }
        final int[] lIlIlIIIllIIllIIIllI = iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI("Colors");
        if (lIlIlIIIllIIllIIIllI.length > 0) {
            int n = 1;
            String s = "";
            int[] array;
            for (int length = (array = lIlIlIIIllIIllIIIllI).length, i = 0; i < length; ++i) {
                final int n2 = array[i];
                if (n == 0) {
                    s = String.valueOf(s) + ", ";
                }
                n = 0;
                boolean b = false;
                for (int j = 0; j < IllIllIIIIlIIlIlllII.llllIIIlIlllIlIIIIIl.length; ++j) {
                    if (n2 == IllIllIIIIlIIlIlllII.llllIIIlIlllIlIIIIIl[j]) {
                        b = true;
                        s = String.valueOf(s) + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworksCharge." + net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(j).IlIIIlIlIIIllIlIlIIl());
                        break;
                    }
                }
                if (!b) {
                    s = String.valueOf(s) + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworksCharge.customColor");
                }
            }
            list.add(s);
        }
        final int[] lIlIlIIIllIIllIIIllI2 = iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI("FadeColors");
        if (lIlIlIIIllIIllIIIllI2.length > 0) {
            int n3 = 1;
            String s2 = String.valueOf(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworksCharge.fadeTo")) + " ";
            int[] array2;
            for (int length2 = (array2 = lIlIlIIIllIIllIIIllI2).length, k = 0; k < length2; ++k) {
                final int n4 = array2[k];
                if (n3 == 0) {
                    s2 = String.valueOf(s2) + ", ";
                }
                n3 = 0;
                boolean b2 = false;
                for (int l = 0; l < 16; ++l) {
                    if (n4 == IllIllIIIIlIIlIlllII.llllIIIlIlllIlIIIIIl[l]) {
                        b2 = true;
                        s2 = String.valueOf(s2) + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworksCharge." + net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(l).IlIIIlIlIIIllIlIlIIl());
                        break;
                    }
                }
                if (!b2) {
                    s2 = String.valueOf(s2) + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworksCharge.customColor");
                }
            }
            list.add(s2);
        }
        if (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Trail")) {
            list.add(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworksCharge.trail"));
        }
        if (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Flicker")) {
            list.add(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworksCharge.flicker"));
        }
    }
}
