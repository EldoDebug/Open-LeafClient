package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.lwjgl.util.vector.*;
import java.util.*;

public class IIIIlllIIIIIIlIIIlll
{
    public static final List llllIIIIlIIIlIlllIll;
    private static volatile /* synthetic */ int[] IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = Lists.newArrayList((Object[])new String[] { "layer0", "layer1", "layer2", "layer3", "layer4" });
    }
    
    public net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2) {
        final HashMap hashMap = Maps.newHashMap();
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.size(); ++i) {
            final String s = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.get(i);
            if (!ilIlIIIIIIlllIlIllIl2.IlIlIlIlIlllllllllIl(s)) {
                break;
            }
            final String llIllIIIIIllIlIIIIlI = ilIlIIIIIIlllIlIllIl2.llIllIIIIIllIlIIIIlI(s);
            hashMap.put(s, llIllIIIIIllIlIIIIlI);
            arrayList.addAll(this.llllIIIIlIIIlIlllIll(i, s, ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI).toString())));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hashMap.put("particle", ilIlIIIIIIlllIlIllIl2.IlIlIlIlIlllllllllIl("particle") ? ilIlIIIIIIlllIlIllIl2.llIllIIIIIllIlIIIIlI("particle") : ((String)hashMap.get("layer0")));
        return new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl(arrayList, hashMap, false, false, ilIlIIIIIIlllIlIllIl2.llllIIIlIlllIlIIIIIl());
    }
    
    private List llllIIIIlIIIlIlllIll(final int n, final String s, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final HashMap hashMap = Maps.newHashMap();
        hashMap.put(lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, new IllIIlllIIIIlllIIlIl(null, n, s, new IlIlIlIlIlllllllllIl(new float[] { 0.0f, 0.0f, 16.0f, 16.0f }, 0)));
        hashMap.put(lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, new IllIIlllIIIIlllIIlIl(null, n, s, new IlIlIlIlIlllllllllIl(new float[] { 16.0f, 0.0f, 0.0f, 16.0f }, 0)));
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new IlIIIlIlIIIllIlIlIIl(new Vector3f(0.0f, 0.0f, 7.5f), new Vector3f(16.0f, 16.0f, 8.5f), hashMap, null, true));
        arrayList.addAll(this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, s, n));
        return arrayList;
    }
    
    private List llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final String s, final int n) {
        final float n2 = (float)ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI();
        final float n3 = (float)ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl();
        final ArrayList arrayList = Lists.newArrayList();
        for (final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll : this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI)) {
            float n4 = 0.0f;
            float n5 = 0.0f;
            float n6 = 0.0f;
            float n7 = 0.0f;
            float n8 = 0.0f;
            float n9 = 0.0f;
            float n10 = 0.0f;
            float n11 = 0.0f;
            float n12 = 0.0f;
            float n13 = 0.0f;
            final float n14 = (float)llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl();
            final float n15 = (float)llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI();
            final float n16 = (float)llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl();
            final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll();
            switch (llllIIIIlIIIlIlllIll()[llllIIIIlIIIlIlllIll.ordinal()]) {
                case 1: {
                    n8 = n14;
                    n4 = n14;
                    n9 = (n6 = n15 + 1.0f);
                    n10 = n16;
                    n5 = n16;
                    n11 = n16;
                    n7 = n16;
                    n12 = 16.0f / n2;
                    n13 = 16.0f / (n3 - 1.0f);
                    break;
                }
                case 2: {
                    n11 = n16;
                    n10 = n16;
                    n8 = n14;
                    n4 = n14;
                    n9 = (n6 = n15 + 1.0f);
                    n5 = n16 + 1.0f;
                    n7 = n16 + 1.0f;
                    n12 = 16.0f / n2;
                    n13 = 16.0f / (n3 - 1.0f);
                    break;
                }
                case 3: {
                    n8 = n16;
                    n4 = n16;
                    n9 = n16;
                    n6 = n16;
                    n11 = n14;
                    n5 = n14;
                    n10 = (n7 = n15 + 1.0f);
                    n12 = 16.0f / (n2 - 1.0f);
                    n13 = 16.0f / n3;
                    break;
                }
                case 4: {
                    n9 = n16;
                    n8 = n16;
                    n4 = n16 + 1.0f;
                    n6 = n16 + 1.0f;
                    n11 = n14;
                    n5 = n14;
                    n10 = (n7 = n15 + 1.0f);
                    n12 = 16.0f / (n2 - 1.0f);
                    n13 = 16.0f / n3;
                    break;
                }
            }
            final float n17 = 16.0f / n2;
            final float n18 = 16.0f / n3;
            final float n19 = n4 * n17;
            final float n20 = n6 * n17;
            final float n21 = n5 * n18;
            final float n22 = n7 * n18;
            final float n23 = 16.0f - n21;
            final float n24 = 16.0f - n22;
            final float n25 = n8 * n12;
            final float n26 = n9 * n12;
            final float n27 = n10 * n13;
            final float n28 = n11 * n13;
            final HashMap hashMap = Maps.newHashMap();
            hashMap.put(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), new IllIIlllIIIIlllIIlIl(null, n, s, new IlIlIlIlIlllllllllIl(new float[] { n25, n27, n26, n28 }, 0)));
            switch (llllIIIIlIIIlIlllIll()[llllIIIIlIIIlIlllIll.ordinal()]) {
                default: {
                    continue;
                }
                case 1: {
                    arrayList.add(new IlIIIlIlIIIllIlIlIIl(new Vector3f(n19, n23, 7.5f), new Vector3f(n20, n23, 8.5f), hashMap, null, true));
                    continue;
                }
                case 2: {
                    arrayList.add(new IlIIIlIlIIIllIlIlIIl(new Vector3f(n19, n24, 7.5f), new Vector3f(n20, n24, 8.5f), hashMap, null, true));
                    continue;
                }
                case 3: {
                    arrayList.add(new IlIIIlIlIIIllIlIlIIl(new Vector3f(n19, n23, 7.5f), new Vector3f(n19, n24, 8.5f), hashMap, null, true));
                    continue;
                }
                case 4: {
                    arrayList.add(new IlIIIlIlIIIllIlIlIIl(new Vector3f(n20, n23, 7.5f), new Vector3f(n20, n24, 8.5f), hashMap, null, true));
                    continue;
                }
            }
        }
        return arrayList;
    }
    
    private List llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final int llIllIIIIIllIlIIIIlI = ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI();
        final int ilIIIlIlIIIllIlIlIIl = ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl();
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < ilIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI(); ++i) {
            final int[] array = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(i)[0];
            for (int j = 0; j < ilIIIlIlIIIllIlIlIIl; ++j) {
                for (int k = 0; k < llIllIIIIIllIlIIIIlI; ++k) {
                    final boolean b = !this.llllIIIIlIIIlIlllIll(array, k, j, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
                    this.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll, arrayList, array, k, j, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, b);
                    this.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl, arrayList, array, k, j, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, b);
                    this.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI, arrayList, array, k, j, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, b);
                    this.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl, arrayList, array, k, j, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, b);
                }
            }
        }
        return arrayList;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final List list, final int[] array, final int n, final int n2, final int n3, final int n4, final boolean b) {
        if (this.llllIIIIlIIIlIlllIll(array, n + ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(), n2 + ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI(), n3, n4) && b) {
            this.llllIIIIlIIIlIlllIll(list, ilIllIlIlIIIlIlIlIII, n, n2);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final List list, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final int n, final int n2) {
        llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = null;
        for (final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll2 : list) {
            if (llllIIllllIlIlIIIIll2.llllIIIIlIIIlIlllIll() == ilIllIlIlIIIlIlIlIII && llllIIllllIlIlIIIIll2.IlIIIlIlIIIllIlIlIIl() == (ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl() ? n2 : n)) {
                llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll2;
                break;
            }
        }
        final int n3 = ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl() ? n2 : n;
        final int n4 = ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl() ? n : n2;
        if (llllIIllllIlIlIIIIll == null) {
            list.add(new llllIIllllIlIlIIIIll(ilIllIlIlIIIlIlIlIII, n4, n3));
        }
        else {
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(n4);
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final int[] array, final int n, final int n2, final int n3, final int n4) {
        return n < 0 || n2 < 0 || n >= n3 || n2 >= n4 || (array[n2 * n3 + n] >> 24 & 0xFF) == 0x0;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] ilIlIlIlIlllllllllIl = IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        final int[] ilIlIlIlIlllllllllIl2 = new int[IlIllIlIlIIIlIlIlIII.values().length];
        try {
            ilIlIlIlIlllllllllIl2[IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIlIlIlllllllllIl2[IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIlIlIlllllllllIl2[IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIlIlIlIlllllllllIl2[IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
    }
}
