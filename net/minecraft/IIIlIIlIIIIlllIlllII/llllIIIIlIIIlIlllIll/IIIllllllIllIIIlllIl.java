package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import java.util.*;

public class IIIllllllIllIIIlllIl
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private List IlIIIlIlIIIllIlIlIIl;
    private String IlIlIIIllIllIIIIIllI;
    
    protected IIIllllllIllIIIlllIl() {
        this.llIllIIIIIllIlIIIIlI = new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
        this.IlIlIIIllIllIIIIIllI = "";
        (this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList()).add(llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl.add(llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll);
        this.IlIIIlIlIIIllIlIlIIl.add(llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll);
        this.IlIIIlIlIIIllIlIlIIl.add(llIIlIIIlIIIllIlIIIl.IIIllllllIllIIIlllIl);
        this.IlIIIlIlIIIllIlIlIIl.add(llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI);
        this.IlIIIlIlIIIllIlIlIIl.add(llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl);
        this.IlIIIlIlIIIllIlIlIIl.add(llIIlIIIlIIIllIlIIIl.IIIIIIIIIlllIllIlIlI);
    }
    
    public IIIllllllIllIIIlllIl(final long n, final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII, final String ilIlIIIllIllIIIIIllI) {
        this();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        final llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, llIllIlIlIIIIIIIllII, ilIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll[0];
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll[1];
    }
    
    public IIIllllllIllIIIlllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this(illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII(), illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().IIllIIllIIIlIlIIIIlI(), illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().IIlllIlIIllIlIlIlIIl());
    }
    
    public List llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, null);
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), llIIlIIIlIIIllIlIIIl);
    }
    
    public float[] llllIIIIlIIIlIlllIll(float[] array, final int n, final int n2, final int n3, final int n4) {
        IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll();
        if (array == null || array.length < n3 * n4) {
            array = new float[n3 * n4];
        }
        final int[] llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
        for (int i = 0; i < n3 * n4; ++i) {
            try {
                float n5 = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[i], llIIlIIIlIIIllIlIIIl.IlIIllIIllIIllIIlIIl).lIIIIlIIIIIlllIllIII() / 65536.0f;
                if (n5 > 1.0f) {
                    n5 = 1.0f;
                }
                array[i] = n5;
            }
            catch (Throwable t) {
                final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Invalid Biome id");
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("DownfallBlock");
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("biome id", i);
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("downfalls[] size", array.length);
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("x", n);
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("z", n2);
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("w", n3);
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("h", n4);
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
            }
        }
        return array;
    }
    
    public float llllIIIIlIIIlIlllIll(final float n, final int n2) {
        return n;
    }
    
    public llIIlIIIlIIIllIlIIIl[] llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl[] array, final int n, final int n2, final int n3, final int n4) {
        IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll();
        if (array == null || array.length < n3 * n4) {
            array = new llIIlIIIlIIIllIlIIIl[n3 * n4];
        }
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
        try {
            for (int i = 0; i < n3 * n4; ++i) {
                array[i] = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[i], llIIlIIIlIIIllIlIIIl.IlIIllIIllIIllIIlIIl);
            }
            return array;
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Invalid Biome id");
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("RawBiomeBlock");
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("biomes[] size", array.length);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("x", n);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("z", n2);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("w", n3);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("h", n4);
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
        }
    }
    
    public llIIlIIIlIIIllIlIIIl[] IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl[] array, final int n, final int n2, final int n3, final int n4) {
        return this.llllIIIIlIIIlIlllIll(array, n, n2, n3, n4, true);
    }
    
    public llIIlIIIlIIIllIlIIIl[] llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl[] array, final int n, final int n2, final int n3, final int n4, final boolean b) {
        IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll();
        if (array == null || array.length < n3 * n4) {
            array = new llIIlIIIlIIIllIlIIIl[n3 * n4];
        }
        if (b && n3 == 16 && n4 == 16 && (n & 0xF) == 0x0 && (n2 & 0xF) == 0x0) {
            System.arraycopy(this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2), 0, array, 0, n3 * n4);
            return array;
        }
        final int[] llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
        for (int i = 0; i < n3 * n4; ++i) {
            array[i] = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[i], llIIlIIIlIIIllIlIIIl.IlIIllIIllIIllIIlIIl);
        }
        return array;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final List list) {
        IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll();
        final int n4 = n - n3 >> 2;
        final int n5 = n2 - n3 >> 2;
        final int n6 = n + n3 >> 2;
        final int n7 = n2 + n3 >> 2;
        final int n8 = n6 - n4 + 1;
        final int n9 = n7 - n5 + 1;
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n4, n5, n8, n9);
        try {
            for (int i = 0; i < n8 * n9; ++i) {
                if (!list.contains(llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll[i]))) {
                    return false;
                }
            }
            return true;
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Invalid Biome id");
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Layer");
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Layer", this.llllIIIIlIIIlIlllIll.toString());
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("x", n);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("z", n2);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("radius", n3);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("allowed", list);
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
        }
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final List list, final Random random) {
        IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll();
        final int n4 = n - n3 >> 2;
        final int n5 = n2 - n3 >> 2;
        final int n6 = n + n3 >> 2;
        final int n7 = n2 + n3 >> 2;
        final int n8 = n6 - n4 + 1;
        final int n9 = n7 - n5 + 1;
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n4, n5, n8, n9);
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = null;
        int n10 = 0;
        for (int i = 0; i < n8 * n9; ++i) {
            final int n11 = n4 + i % n8 << 2;
            final int n12 = n5 + i / n8 << 2;
            if (list.contains(llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll[i])) && (ilIlIlIlIlllllllllIl == null || random.nextInt(n10 + 1) == 0)) {
                ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(n11, 0, n12);
                ++n10;
            }
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
    }
}
