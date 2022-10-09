package net.optifine;

import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import org.apache.commons.lang3.tuple.*;
import java.util.*;

public class llllllIllIllIlIllllI
{
    private static IIlIIIIIllIlIIIlIIll[] llllIIIIlIIIlIlllIll;
    private static int IlIlIlIlIlllllllllIl;
    
    static {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll = null;
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl = 0;
    }
    
    public static IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll() {
        if (llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        final int n = IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll - llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl;
        IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll = null;
        if (n >= 0 && n < llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll.length) {
            ilIIIIIllIlIIIlIIll = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll[n];
        }
        return ilIIIIIllIlIIIlIIll;
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll = null;
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl = 0;
        final Pair llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI();
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll = (IIlIIIIIllIlIIIlIIll[])llIllIIIIIllIlIIIIlI.getLeft();
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl = (int)llIllIIIIIllIlIIIIlI.getRight();
    }
    
    private static Pair llIllIIIIIllIlIIIIlI() {
        final String s = "optifine/gui/loading/background";
        final String s2 = ".png";
        final String[] llllIIIIlIIIlIlllIll = net.optifine.util.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(s, s2);
        final HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s3 = llllIIIIlIIIlIlllIll[i];
            final String llIllIIIIIllIlIIIIlI = net.optifine.util.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(s3, s, s2);
            final int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, Integer.MIN_VALUE);
            if (llllIIIIlIIIlIlllIll2 == Integer.MIN_VALUE) {
                llllIIIIlIIIlIlllIll("Invalid dimension ID: " + llIllIIIIIllIlIIIIlI + ", path: " + s3);
            }
            else {
                hashMap.put(llllIIIIlIIIlIlllIll2, s3);
            }
        }
        final Set<Object> keySet = hashMap.keySet();
        final Integer[] array = keySet.toArray(new Integer[keySet.size()]);
        Arrays.sort(array);
        if (array.length <= 0) {
            return (Pair)new ImmutablePair((Object)null, (Object)0);
        }
        final Properties ilIlIlIlIlllllllllIl = net.optifine.util.IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl("optifine/gui/loading/loading.properties", "CustomLoadingScreens");
        final int intValue = array[0];
        final IIlIIIIIllIlIIIlIIll[] array2 = new IIlIIIIIllIlIIIlIIll[array[array.length - 1] - intValue + 1];
        for (int j = 0; j < array.length; ++j) {
            final Integer n = array[j];
            array2[n - intValue] = IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(hashMap.get(n), n, ilIlIlIlIlllllllllIl);
        }
        return (Pair)new ImmutablePair((Object)array2, (Object)intValue);
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("CustomLoadingScreen: " + s);
    }
    
    public static void IlIlIlIlIlllllllllIl(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomLoadingScreen: " + s);
    }
}
