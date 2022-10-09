package net.optifine.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;

public class IlIlIIIllIllIIIIIllI
{
    public static void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl != null) {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Model: " + ilIlIlIlIlllllllllIl + ", ao: " + ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() + ", gui3d: " + ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() + ", builtIn: " + ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl() + ", particle: " + ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
            final lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl;
            for (int i = 0; i < llllIIIlIlllIlIIIIIl.length; ++i) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll = llllIIIlIlllIlIIIIIl[i];
                llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(), ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), "  ");
            }
            llllIIIIlIIIlIlllIll("General", ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), "  ");
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s, final List list, final String s2) {
        final Iterator<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> iterator = list.iterator();
        while (iterator.hasNext()) {
            llllIIIIlIIIlIlllIll(s, iterator.next(), s2);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String s2) {
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.valueOf(s2) + "Quad: " + llllIIIIlIIIlIlllIll.getClass().getName() + ", type: " + s + ", face: " + llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI() + ", tint: " + llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl() + ", sprite: " + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
        llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "  " + s2);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[] array, final String s) {
        final int n = array.length / 4;
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.valueOf(s) + "Length: " + array.length + ", step: " + n);
        for (int i = 0; i < 4; ++i) {
            final int n2 = i * n;
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.valueOf(s) + i + " xyz: " + Float.intBitsToFloat(array[n2 + 0]) + "," + Float.intBitsToFloat(array[n2 + 1]) + "," + Float.intBitsToFloat(array[n2 + 2]) + " col: " + array[n2 + 3] + " u,v: " + Float.intBitsToFloat(array[n2 + 4]) + "," + Float.intBitsToFloat(array[n2 + 5]));
        }
    }
    
    public static IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final List llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        final lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl;
        final ArrayList<List> list = new ArrayList<List>();
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.length; ++i) {
            list.add(llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl[i])));
        }
        return new lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll, list, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
    }
    
    public static List llllIIIIlIIIlIlllIll(final List list) {
        final ArrayList<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> list2 = new ArrayList<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>();
        final Iterator<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(llllIIIIlIIIlIlllIll(iterator.next()));
        }
        return list2;
    }
    
    public static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().clone(), llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(), llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
    }
}
