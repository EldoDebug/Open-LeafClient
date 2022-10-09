package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.collect.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;

public class lIIIlllIIIllIIIllIII implements IlIIIlIlIIIllIlIlIIl
{
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
                    if (((IIIlIIlIIIIlllIlllII)lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll()).lllIIIIlllllIlIIllIl() != IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll || lllIIIIlIlIllIIlIIIl != null) {
                        return false;
                    }
                    lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
                }
                else {
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.a) {
                        return false;
                    }
                    arrayList.add(lIlIlIIIllIIllIIIllI);
                }
            }
        }
        return lllIIIIlIlIllIIlIIIl != null && !arrayList.isEmpty();
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = null;
        final int[] array = new int[3];
        int n = 0;
        int n2 = 0;
        IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = null;
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
                    iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll();
                    if (iiIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl() != IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll || llIIlIIIlIIIllIlIIIl != null) {
                        return null;
                    }
                    llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
                    llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = 1;
                    if (iiIlIIlIIIIlllIlllII.llIllIlIIIIllIlIIllI(lIlIlIIIllIIllIIIllI)) {
                        final int lIlIlIIIllIIllIIIllI2 = iiIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI(llIIlIIIlIIIllIlIIIl);
                        final float n3 = (lIlIlIIIllIIllIIIllI2 >> 16 & 0xFF) / 255.0f;
                        final float n4 = (lIlIlIIIllIIllIIIllI2 >> 8 & 0xFF) / 255.0f;
                        final float n5 = (lIlIlIIIllIIllIIIllI2 & 0xFF) / 255.0f;
                        n += (int)(Math.max(n3, Math.max(n4, n5)) * 255.0f);
                        array[0] += (int)(n3 * 255.0f);
                        array[1] += (int)(n4 * 255.0f);
                        array[2] += (int)(n5 * 255.0f);
                        ++n2;
                    }
                }
                else {
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.a) {
                        return null;
                    }
                    final float[] llllIIIIlIIIlIlllIll = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII()));
                    final int n6 = (int)(llllIIIIlIIIlIlllIll[0] * 255.0f);
                    final int n7 = (int)(llllIIIIlIIIlIlllIll[1] * 255.0f);
                    final int n8 = (int)(llllIIIIlIIIlIlllIll[2] * 255.0f);
                    n += Math.max(n6, Math.max(n7, n8));
                    final int[] array2 = array;
                    final int n9 = 0;
                    array2[n9] += n6;
                    final int[] array3 = array;
                    final int n10 = 1;
                    array3[n10] += n7;
                    final int[] array4 = array;
                    final int n11 = 2;
                    array4[n11] += n8;
                    ++n2;
                }
            }
        }
        if (iiIlIIlIIIIlllIlllII == null) {
            return null;
        }
        final int n12 = array[0] / n2;
        final int n13 = array[1] / n2;
        final int n14 = array[2] / n2;
        final float n15 = n / (float)n2;
        final float n16 = (float)Math.max(n12, Math.max(n13, n14));
        iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl, (((int)(n12 * n15 / n16) << 8) + (int)(n13 * n15 / n16) << 8) + (int)(n14 * n15 / n16));
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 10;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl() {
        return null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl[] IlIlIlIlIlllllllllIl(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        final lllIIIIlIlIllIIlIIIl[] array = new lllIIIIlIlIllIIlIIIl[illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII()];
        for (int i = 0; i < array.length; ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll().llIllIlIIIIllIlIIllI()) {
                array[i] = new lllIIIIlIlIllIIlIIIl(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl());
            }
        }
        return array;
    }
}
