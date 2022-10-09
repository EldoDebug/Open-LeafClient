package net.optifine.util;

import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.lang.reflect.*;

public class CacheObjectArray
{
    private static ArrayDeque llllIIIIlIIIlIlllIll;
    private static int IlIlIlIlIlllllllllIl;
    
    static {
        CacheObjectArray.llllIIIIlIIIlIlllIll = new ArrayDeque();
        CacheObjectArray.IlIlIlIlIlllllllllIl = 10;
    }
    
    private static synchronized int[] llllIIIIlIIIlIlllIll(final int n) {
        int[] array = CacheObjectArray.llllIIIIlIIIlIlllIll.pollLast();
        if (array == null || array.length < n) {
            array = new int[n];
        }
        return array;
    }
    
    public static synchronized void llllIIIIlIIIlIlllIll(final int[] array) {
        if (CacheObjectArray.llllIIIIlIIIlIlllIll.size() < CacheObjectArray.IlIlIlIlIlllllllllIl) {
            CacheObjectArray.llllIIIIlIIIlIlllIll.add(array);
        }
    }
    
    public static void main(final String[] array) {
        final int n = 4096;
        final int n2 = 500000;
        IlIlIlIlIlllllllllIl(n, n2);
        llllIIIIlIIIlIlllIll(n, n2);
        IlIIIlIlIIIllIlIlIIl(n, n2);
        llIllIIIIIllIlIIIIlI(n, n2);
        llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.class, n, n2);
        final long ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(n, n2);
        final long llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n, n2);
        final long ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl(n, n2);
        final long llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(n, n2);
        final long llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.class, n, n2);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("New: " + ilIlIlIlIlllllllllIl);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Clone: " + llllIIIIlIIIlIlllIll);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("NewObj: " + ilIIIlIlIIIllIlIlIIl);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CloneObj: " + llIllIIIIIllIlIIIIlI);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("NewObjDyn: " + llllIIIIlIIIlIlllIll2);
    }
    
    private static long llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        final int[] array = new int[n];
        for (int i = 0; i < n2; ++i) {
            final int[] array2 = array.clone();
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
    
    private static long IlIlIlIlIlllllllllIl(final int n, final int n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < n2; ++i) {
            final int[] array = (int[])Array.newInstance(Integer.TYPE, n);
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
    
    private static long llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        final llIIlIIIlIIIllIlIIIl[] array = new llIIlIIIlIIIllIlIIIl[n];
        for (int i = 0; i < n2; ++i) {
            final llIIlIIIlIIIllIlIIIl[] array2 = array.clone();
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
    
    private static long IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < n2; ++i) {
            final llIIlIIIlIIIllIlIIIl[] array = new llIIlIIIlIIIllIlIIIl[n];
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
    
    private static long llllIIIIlIIIlIlllIll(final Class clazz, final int n, final int n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < n2; ++i) {
            final Object[] array = (Object[])Array.newInstance(clazz, n);
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
