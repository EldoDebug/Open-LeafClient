package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.collect.*;
import java.util.*;

public enum lllIllIIIllllllIllll implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DOWN", 0, 0, 1, -1, "down", IIlIlIlIIlIllIIIIIIl.IlIlIlIlIlllllllllIl, llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl, new f(0, -1, 0)), 
    IlIlIlIlIlllllllllIl("UP", 1, 1, 0, -1, "up", IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll, llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl, new f(0, 1, 0)), 
    llIllIIIIIllIlIIIIlI("NORTH", 2, 2, 3, 2, "north", IIlIlIlIIlIllIIIIIIl.IlIlIlIlIlllllllllIl, llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI, new f(0, 0, -1)), 
    IlIIIlIlIIIllIlIlIIl("SOUTH", 3, 3, 2, 0, "south", IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll, llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI, new f(0, 0, 1)), 
    IlIlIIIllIllIIIIIllI("WEST", 4, 4, 5, 1, "west", IIlIlIlIIlIllIIIIIIl.IlIlIlIlIlllllllllIl, llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll, new f(-1, 0, 0)), 
    IllIIlllIIIIlllIIlIl("EAST", 5, 5, 4, 3, "east", IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll, llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll, new f(1, 0, 0));
    
    private final int lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    private final String llIllIlIIIIllIlIIllI;
    private final llIllIlIlIIIIIIIllII lIlIlIIIllIIllIIIllI;
    private final IIlIlIlIIlIllIIIIIIl IlIlIIIllIIllIlllllI;
    private final f IIIIlllIIIIIIlIIIlll;
    public static final lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl;
    private static final lllIllIIIllllllIllll[] llllIIllllIlIlIIIIll;
    private static final Map IlIllIlIlIIIlIlIlIII;
    private static volatile /* synthetic */ int[] IIlllIIlIllIllIlIIll;
    private static volatile /* synthetic */ int[] lllIIIIlllllIlIIllIl;
    
    static {
        IlIlIIIIIIlllIlIllIl = new lllIllIIIllllllIllll[] { lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl };
        llllIIIlIlllIlIIIIIl = new lllIllIIIllllllIllll[6];
        llllIIllllIlIlIIIIll = new lllIllIIIllllllIllll[4];
        IlIllIlIlIIIlIlIlIII = Maps.newHashMap();
        lllIllIIIllllllIllll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
            net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl[lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII] = lllIllIIIllllllIllll;
            if (lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI().IlIIIlIlIIIllIlIlIIl()) {
                net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIllllIlIlIIIIll[lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl] = lllIllIIIllllllIllll;
            }
            net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIllIlIlIIIlIlIlIII.put(lllIllIIIllllllIllll.llIllIlIIIIllIlIIllI().toLowerCase(), lllIllIIIllllllIllll);
        }
    }
    
    private lllIllIIIllllllIllll(final String s, final int n, final int liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl, final String llIllIlIIIIllIlIIllI, final IIlIlIlIIlIllIIIIIIl ilIlIIIllIIllIlllllI, final llIllIlIlIIIIIIIllII lIlIlIIIllIIllIIIllI, final f iiiIlllIIIIIIlIIIlll) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public IIlIlIlIIlIllIIIIIIl IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public lllIllIIIllllllIllll IlIlIIIllIllIIIIIllI() {
        return lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl[this.lIIIlllIIIllIIIllIII];
    }
    
    public lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        switch (IIIIlllIIIIIIlIIIlll()[llIllIlIlIIIIIIIllII.ordinal()]) {
            case 1: {
                if (this != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && this != lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                    return this.IlIllIlIlIIIlIlIlIII();
                }
                return this;
            }
            case 2: {
                if (this != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && this != lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
                    return this.IllIIlllIIIIlllIIlIl();
                }
                return this;
            }
            case 3: {
                if (this != lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && this != lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                    return this.IIlllIIlIllIllIlIIll();
                }
                return this;
            }
            default: {
                throw new IllegalStateException("Unable to get CW facing for axis " + llIllIlIlIIIIIIIllII);
            }
        }
    }
    
    public lllIllIIIllllllIllll IllIIlllIIIIlllIIlIl() {
        switch (llllIIllllIlIlIIIIll()[this.ordinal()]) {
            case 3: {
                return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
            }
            case 6: {
                return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
            }
            case 4: {
                return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
            }
            case 5: {
                return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
            }
            default: {
                throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
            }
        }
    }
    
    private lllIllIIIllllllIllll IlIllIlIlIIIlIlIlIII() {
        switch (llllIIllllIlIlIIIIll()[this.ordinal()]) {
            case 3: {
                return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
            }
            default: {
                throw new IllegalStateException("Unable to get X-rotated facing of " + this);
            }
            case 4: {
                return lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
            }
            case 2: {
                return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
            }
            case 1: {
                return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
            }
        }
    }
    
    private lllIllIIIllllllIllll IIlllIIlIllIllIlIIll() {
        switch (llllIIllllIlIlIIIIll()[this.ordinal()]) {
            case 6: {
                return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
            }
            default: {
                throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
            }
            case 5: {
                return lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
            }
            case 2: {
                return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
            }
            case 1: {
                return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
            }
        }
    }
    
    public lllIllIIIllllllIllll llllIIIlIlllIlIIIIIl() {
        switch (llllIIllllIlIlIIIIll()[this.ordinal()]) {
            case 3: {
                return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
            }
            case 6: {
                return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
            }
            case 4: {
                return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
            }
            case 5: {
                return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
            }
            default: {
                throw new IllegalStateException("Unable to get CCW facing of " + this);
            }
        }
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return (this.lIlIlIIIllIIllIIIllI == llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) ? this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() : 0;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return (this.lIlIlIIIllIIllIIIllI == llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl) ? this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() : 0;
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return (this.lIlIlIIIllIIllIIIllI == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) ? this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() : 0;
    }
    
    public String llIllIlIIIIllIlIIllI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public llIllIlIlIIIIIIIllII lIlIlIIIllIIllIIIllI() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final String s) {
        return (s == null) ? null : lllIllIIIllllllIllll.IlIllIlIlIIIlIlIlIII.get(s.toLowerCase());
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final int n) {
        return lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl[llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n % lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length)];
    }
    
    public static lllIllIIIllllllIllll IlIlIlIlIlllllllllIl(final int n) {
        return lllIllIIIllllllIllll.llllIIllllIlIlIIIIll[llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n % lllIllIIIllllllIllll.llllIIllllIlIlIIIIll.length)];
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final double n) {
        return IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n / 90.0 + 0.5) & 0x3);
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final Random random) {
        return values()[random.nextInt(values().length)];
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI = lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
        float n4 = Float.MIN_VALUE;
        lllIllIIIllllllIllll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
            final float n5 = n * lllIllIIIllllllIllll.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII() + n2 * lllIllIIIllllllIllll.IIIIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII() + n3 * lllIllIIIllllllIllll.IIIIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl();
            if (n5 > n4) {
                n4 = n5;
                llIllIIIIIllIlIIIIlI = lllIllIIIllllllIllll;
            }
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public String toString() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl, final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        lllIllIIIllllllIllll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
            if (lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl() == ilIlIlIIlIllIIIIIIl && lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII) {
                return lllIllIIIllllllIllll;
            }
        }
        throw new IllegalArgumentException("No such direction: " + ilIlIlIIlIllIIIIIIl + " " + llIllIlIlIIIIIIIllII);
    }
    
    public f IlIlIIIllIIllIlllllI() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    static /* synthetic */ int[] IIIIlllIIIIIIlIIIlll() {
        final int[] iIlllIIlIllIllIlIIll = lllIllIIIllllllIllll.IIlllIIlIllIllIlIIll;
        if (iIlllIIlIllIllIlIIll != null) {
            return iIlllIIlIllIllIlIIll;
        }
        final int[] iIlllIIlIllIllIlIIll2 = new int[llIllIlIlIIIIIIIllII.values().length];
        try {
            iIlllIIlIllIllIlIIll2[llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iIlllIIlIllIllIlIIll2[llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iIlllIIlIllIllIlIIll2[llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return lllIllIIIllllllIllll.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll2;
    }
    
    static /* synthetic */ int[] llllIIllllIlIlIIIIll() {
        final int[] lllIIIIlllllIlIIllIl = lllIllIIIllllllIllll.lllIIIIlllllIlIIllIl;
        if (lllIIIIlllllIlIIllIl != null) {
            return lllIIIIlllllIlIIllIl;
        }
        final int[] lllIIIIlllllIlIIllIl2 = new int[values().length];
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIIIIlllllIlIIllIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lllIllIIIllllllIllll.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl2;
    }
}
