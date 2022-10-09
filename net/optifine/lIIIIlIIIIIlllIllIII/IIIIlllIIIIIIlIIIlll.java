package net.optifine.lIIIIlIIIIIlllIllIII;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.io.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIIlllIIIIIIlIIIlll
{
    public static Object llllIIIIlIIIlIlllIll;
    public static Object IlIlIlIlIlllllllllIl;
    public static Object llIllIIIIIllIlIIIIlI;
    
    static {
        IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.llIIlllIIlllIIllIllI);
        IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.lIllllllIIllIlIlIlII);
        IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII);
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final String s) {
        if (!lIIIIlIIIIIlllIllIII.IIllllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI()) {
            lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI, new Object[0]), lIIIIlIIIIIlllIllIII.IIllllIIIlIIIIIIllIl, lIllllIllIllIIllllll, s);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        if (!lIIIIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI()) {
            lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI, new Object[0]), lIIIIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl, lIllllIllIllIIllllll);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final Object o) {
        final Map map = (Map)lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.aa);
        if (map != null) {
            map.put(s, o);
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl, final float n, final int n2) {
        return lIIIIlIIIIIlllIllIII.i.llIllIIIIIllIlIIIIlI() && lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(lIIIIlIIIIIlllIllIII.i, lllllIIIIIlIlIIIIIIl, n, n2);
    }
    
    public static InputStream llllIIIIlIIIlIlllIll(String substring) {
        if (!lIIIIlIIIIIlllIllIII.cn.IlIIIlIlIIIllIlIlIIl()) {
            return null;
        }
        final Object llllIIIIlIIIlIlllIll = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.cn);
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        if (substring.startsWith("/")) {
            substring = substring.substring(1);
        }
        final byte[] array = (byte[])lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll, lIIIIlIIIIIlllIllIII.co, substring);
        if (array == null) {
            return null;
        }
        return new ByteArrayInputStream(array);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        return lIIIIlIIIIIlllIllIII.lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI() ? lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, lIIIIlIIIIIlllIllIII.lIlIIlllIIlIIlIlllIl, llIIlIIIlIIIllIlIIIl) : llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lIIIIlIIIIIlllIllIII.t.llIllIIIIIllIlIIIIlI() ? lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(), lIIIIlIIIIIlllIllIII.t, lllIIIIlIlIllIIlIIIl) : lllIIIIlIlIllIIlIIIl.IllIIlllIIIIlllIIlIl();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return iiIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI(lllIIIIlIlIllIIlIIIl) != -1;
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final IIlllllIllIllIlIlIII illlllIllIllIlIlIII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return lIIIIlIIIIIlllIllIII.IIlIlllIlIlllIlIllll.llIllIIIIIllIlIIIIlI() ? ((IIlllllIllIllIlIlIII)lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()).llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII) : illlllIllIllIlIlIII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII);
    }
    
    public static String[] llllIIIIlIIIlIlllIll() {
        if (!lIIIIlIIIIIlllIllIII.ag.llIllIIIIIllIlIIIIlI()) {
            return new String[0];
        }
        final List list = (List)lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.ai, new Object[0]), lIIIIlIIIIIlllIllIII.ah, new Object[0]);
        if (list == null) {
            return new String[0];
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        for (final Object next : list) {
            if (lIIIIlIIIIIlllIllIII.ao.llllIIIIlIIIlIlllIll(next)) {
                final String illIIlllIIIIlllIIlIl = lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl(next, lIIIIlIIIIIlllIllIII.ap, new Object[0]);
                if (illIIlllIIIIlllIIlIl == null) {
                    continue;
                }
                list2.add(illIIlllIIIIlllIIlIl);
            }
        }
        return list2.toArray(new String[list2.size()]);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n, final float n2, final float n3) {
        final Object llllIIIlIlllIlIIIIIl = lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.IllllIIlIlIllIIIllII, ilIllIlIlIIIlIlIlIII, illlllllIIIlIIIlIlII, n, n2, n3);
        return llllIIIlIlllIlIIIIIl == IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll || (llllIIIlIlllIlIIIIIl == IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI && ilIllIlIlIIIlIlIlIII.lIlIlIIIllIIllIIIllI() && ilIllIlIlIIIlIlIlIII.k());
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n, final int n2, final float n3) {
        return lIIIIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl.llIllIIIIIllIlIIIIlI() && lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(lIIIIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl, ilIllIlIlIIIlIlIlIII, illlllllIIIlIIIlIlII, n, n2, n3);
    }
}
