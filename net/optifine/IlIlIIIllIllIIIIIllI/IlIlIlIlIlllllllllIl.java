package net.optifine.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.lwjgl.util.vector.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl
{
    private static final float llllIIIIlIIIlIlllIll = 1.0E-6f;
    
    public static net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final String s, final int n) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(s), n);
    }
    
    public static net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n) {
        final ArrayList list = new ArrayList();
        final lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl;
        final ArrayList<ArrayList<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>> list2 = new ArrayList<ArrayList<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>>();
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = llllIIIlIlllIlIIIIIl[i];
            final ArrayList<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> list3 = new ArrayList<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>();
            list3.add(llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, ilIlIIIllIIllIlllllI, n));
            list2.add(list3);
        }
        return new lIIIlllIIIllIIIllIII(list, list2, true, true, ilIlIIIllIIllIlllllI, llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll);
    }
    
    public static net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        final ArrayList list = new ArrayList();
        list.addAll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        list.addAll(ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll());
        final lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl;
        final ArrayList<ArrayList> list2 = new ArrayList<ArrayList>();
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = llllIIIlIlllIlIIIIIl[i];
            final ArrayList list3 = new ArrayList();
            list3.addAll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll));
            list3.addAll(ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll));
            list2.add(list3);
        }
        return new lIIIlllIIIllIIIllIII(list, list2, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
    }
    
    public static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n) {
        return new llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(16.0f, 16.0f, 16.0f), new IllIIlllIIIIlllIIlIl(lllIllIIIllllllIllll, n, "#" + lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(), new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(new float[] { 0.0f, 0.0f, 16.0f, 16.0f }, 0)), ilIlIIIllIIllIlllllI, lllIllIIIllllllIllll, lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, null, false, true);
    }
    
    public static net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final String s, final String s2, final String s3) {
        final IlIlIIIIIIlllIlIllIl ilIllllIIlIIlIlIlIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIllllIIlIIlIlIlIll();
        return llllIIIIlIIIlIlllIll(s, ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(s2), ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(s3));
    }
    
    public static net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final String s, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI2) {
        if (ilIlIIIllIIllIlllllI == null || ilIlIIIllIIllIlllllI2 == null) {
            return null;
        }
        final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl iIlllIIIlIlllIIlllII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        if (iIlllIIIlIlllIIlllII == null) {
            return null;
        }
        final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl(s, "normal"));
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll != iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll()) {
            final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            final lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl;
            for (int i = 0; i < llllIIIlIlllIlIIIIIl.length; ++i) {
                llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl[i]), ilIlIIIllIIllIlllllI, ilIlIIIllIIllIlllllI2);
            }
            llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), ilIlIIIllIIllIlllllI, ilIlIIIllIIllIlllllI2);
            return ilIlIlIlIlllllllllIl;
        }
        return null;
    }
    
    private static void llllIIIIlIIIlIlllIll(final List list, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI2) {
        final ArrayList<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> list2 = new ArrayList<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>();
        for (net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : list) {
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == ilIlIIIllIIllIlllllI) {
                llllIIIIlIIIlIlllIll = new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll, ilIlIIIllIIllIlllllI2);
            }
            list2.add(llllIIIIlIIIlIlllIll);
        }
        list.clear();
        list.addAll(list2);
    }
    
    public static void llllIIIIlIIIlIlllIll(final Vector3f vector3f) {
        vector3f.setX(llllIIIIlIIIlIlllIll(vector3f.getX()));
        vector3f.setY(llllIIIIlIIIlIlllIll(vector3f.getY()));
        vector3f.setZ(llllIIIIlIIIlIlllIll(vector3f.getZ()));
    }
    
    private static float llllIIIIlIIIlIlllIll(final float n) {
        return (n > -1.0E-6f && n < 1.0E-6f) ? 0.0f : ((n > 0.999999f && n < 1.000001f) ? 1.0f : n);
    }
    
    public static net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final long n = (long)(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() * 3129871) ^ ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() * 116129781L;
        final long n2 = n * n * 42317861L + n * 11L;
        final double n3 = ((n2 >> 16 & 0xFL) / 15.0f - 0.5) * 0.5;
        final double n4 = ((n2 >> 24 & 0xFL) / 15.0f - 0.5) * 0.5;
        double n5 = 0.0;
        if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI) {
            n5 = ((n2 >> 20 & 0xFL) / 15.0f - 1.0) * 0.2;
        }
        return llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(n3, n5, n4);
    }
}
