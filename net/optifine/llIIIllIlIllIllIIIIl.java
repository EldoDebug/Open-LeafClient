package net.optifine;

import java.util.*;
import net.optifine.shaders.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class llIIIllIlIllIllIIIIl
{
    private static boolean llllIIIIlIIIlIlllIll;
    private static BitSet IlIlIlIlIlllllllllIl;
    private static BitSet llIllIIIIIllIlIIIIlI;
    
    static {
        llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl = new BitSet();
        llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI = new BitSet();
    }
    
    public static boolean llllIIIIlIIIlIlllIll() {
        return llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll && !llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll;
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().b;
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n) {
        if (n >= 0) {
            llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl.set(n);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final BitSet set) {
        if (set != null) {
            llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl.or(set);
        }
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final int n) {
        return n >= 0 && llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl.get(n);
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl.clear();
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n) {
        if (n >= 0) {
            llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI.set(n);
        }
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl(final int n) {
        return n >= 0 && llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI.get(n);
    }
    
    public static void IlIIIlIlIIIllIlIlIIl() {
        llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI.clear();
    }
}
