package net.optifine.util;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;
import java.lang.reflect.*;

public class llIIIlIlIllIIlIlIlII
{
    private static IIlIIIIlllIlllllIlII llllIIIIlIIIlIlllIll;
    private static IIlIIIIlllIlllllIlII IlIlIlIlIlllllllllIl;
    
    static {
        llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(new String[][] { { "sun.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed" }, { "jdk.internal.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed" } });
        llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll(new String[][] { { "sun.misc.VM", "maxDirectMemory" }, { "jdk.internal.misc.VM", "maxDirectMemory" } });
    }
    
    public static long llllIIIIlIIIlIlllIll() {
        return (llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll == null) ? -1L : llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public static long IlIlIlIlIlllllllllIl() {
        return (llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl == null) ? -1L : llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
    }
    
    private static IIlIIIIlllIlllllIlII llllIIIIlIIIlIlllIll(final String[][] array) {
        final ArrayList<Throwable> list = new ArrayList<Throwable>();
        int i = 0;
        while (i < array.length) {
            final String[] array2 = array[i];
            try {
                return llllIIIIlIIIlIlllIll(array2);
            }
            catch (Throwable t) {
                list.add(t);
                ++i;
            }
        }
        for (final Throwable t2 : list) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(t2.getClass().getName() + ": " + t2.getMessage());
        }
        return null;
    }
    
    private static IIlIIIIlllIlllllIlII llllIIIIlIIIlIlllIll(final String[] array) {
        if (array.length < 2) {
            return null;
        }
        Method method = Class.forName(array[0]).getMethod(array[1], (Class<?>[])new Class[0]);
        method.setAccessible(true);
        Object invoke = null;
        for (int i = 2; i < array.length; ++i) {
            final String s = array[i];
            invoke = method.invoke(invoke, new Object[0]);
            method = invoke.getClass().getMethod(s, (Class<?>[])new Class[0]);
            method.setAccessible(true);
        }
        return new lllllIlIIIlIlIIlllII(method, invoke);
    }
}
