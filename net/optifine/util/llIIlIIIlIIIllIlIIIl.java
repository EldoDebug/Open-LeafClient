package net.optifine.util;

import java.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIIlIIIlIIIllIlIIIl
{
    private static final Map llllIIIIlIIIlIlllIll;
    private static final Map IlIlIlIlIlllllllllIl;
    private static final Map llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new HashMap();
        IlIlIlIlIlllllllllIl = new HashMap();
        llIllIIIIIllIlIIIIlI = new HashMap();
        for (int i = 0; i < 1000; ++i) {
            final Class llllIIIIlIIIlIlllIll2 = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(i);
            if (llllIIIIlIIIlIlllIll2 != null) {
                final String ilIlIlIlIlllllllllIl = IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(i);
                if (ilIlIlIlIlllllllllIl != null) {
                    if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.containsKey(llllIIIIlIIIlIlllIll2)) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Duplicate entity class: " + llllIIIIlIIIlIlllIll2 + ", id1: " + llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.get(llllIIIIlIIIlIlllIll2) + ", id2: " + i);
                    }
                    if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.containsKey(ilIlIlIlIlllllllllIl)) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Duplicate entity name: " + ilIlIlIlIlllllllllIl + ", id1: " + llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.get(ilIlIlIlIlllllllllIl) + ", id2: " + i);
                    }
                    if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.containsKey(ilIlIlIlIlllllllllIl)) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Duplicate entity name: " + ilIlIlIlIlllllllllIl + ", class1: " + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.get(ilIlIlIlIlllllllllIl) + ", class2: " + llllIIIIlIIIlIlllIll2);
                    }
                    llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.put(llllIIIIlIIIlIlllIll2, i);
                    llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.put(ilIlIlIlIlllllllllIl, i);
                    llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.put(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2);
                }
            }
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return (llIllIIIIIllIlIIIIlI == null) ? -1 : llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.getClass());
    }
    
    public static int llllIIIIlIIIlIlllIll(final Class clazz) {
        final Integer n = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.get(clazz);
        return (n == null) ? -1 : n;
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s) {
        final Integer n = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.get(s);
        return (n == null) ? -1 : n;
    }
    
    public static Class IlIlIlIlIlllllllllIl(final String s) {
        return llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.get(s);
    }
}
