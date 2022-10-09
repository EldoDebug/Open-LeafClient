package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;
import com.google.common.base.*;

public enum llIllIIlllllllllllll implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DANDELION", 0, IIllIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll, 0, "dandelion"), 
    IlIlIlIlIlllllllllIl("POPPY", 1, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, 0, "poppy"), 
    llIllIIIIIllIlIIIIlI("BLUE_ORCHID", 2, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, 1, "blue_orchid", "blueOrchid"), 
    IlIIIlIlIIIllIlIlIIl("ALLIUM", 3, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, 2, "allium"), 
    IlIlIIIllIllIIIIIllI("HOUSTONIA", 4, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, 3, "houstonia"), 
    IllIIlllIIIIlllIIlIl("RED_TULIP", 5, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, 4, "red_tulip", "tulipRed"), 
    llllIIIlIlllIlIIIIIl("ORANGE_TULIP", 6, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, 5, "orange_tulip", "tulipOrange"), 
    lIIIIlIIIIIlllIllIII("WHITE_TULIP", 7, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, 6, "white_tulip", "tulipWhite"), 
    lIIIlllIIIllIIIllIII("PINK_TULIP", 8, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, 7, "pink_tulip", "tulipPink"), 
    llIIlIIIlIIIllIlIIIl("OXEYE_DAISY", 9, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, 8, "oxeye_daisy", "oxeyeDaisy");
    
    private static final llIllIIlllllllllllll[][] llIllIlIIIIllIlIIllI;
    private final IIllIIIlIIlIlIlIIIII lIlIlIIIllIIllIIIllI;
    private final int IlIlIIIllIIllIlllllI;
    private final String IIIIlllIIIIIIlIIIlll;
    private final String llllIIllllIlIlIIIIll;
    
    static {
        IlIllIlIlIIIlIlIlIII = new llIllIIlllllllllllll[] { llIllIIlllllllllllll.llllIIIIlIIIlIlllIll, llIllIIlllllllllllll.IlIlIlIlIlllllllllIl, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI, llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl, llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI, llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl, llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl, llIllIIlllllllllllll.lIIIIlIIIIIlllIllIII, llIllIIlllllllllllll.lIIIlllIIIllIIIllIII, llIllIIlllllllllllll.llIIlIIIlIIIllIlIIIl };
        llIllIlIIIIllIlIIllI = new llIllIIlllllllllllll[IIllIIIlIIlIlIlIIIII.values().length][];
        IIllIIIlIIlIlIlIIIII[] values;
        for (int length = (values = IIllIIIlIIlIlIlIIIII.values()).length, i = 0; i < length; ++i) {
            final IIllIIIlIIlIlIlIIIII illIIIlIIlIlIlIIIII = values[i];
            final Collection filter = Collections2.filter((Collection)Lists.newArrayList((Object[])values()), (Predicate)new lllllIIllIlIllIllllI(illIIIlIIlIlIlIIIII));
            llIllIIlllllllllllll.llIllIlIIIIllIlIIllI[illIIIlIIlIlIlIIIII.ordinal()] = filter.toArray(new llIllIIlllllllllllll[filter.size()]);
        }
    }
    
    private llIllIIlllllllllllll(final String s, final int n, final IIllIIIlIIlIlIlIIIII illIIIlIIlIlIlIIIII, final int n2, final String s2) {
        this(s, n, illIIIlIIlIlIlIIIII, n2, s2, s2);
    }
    
    private llIllIIlllllllllllll(final String s, final int n, final IIllIIIlIIlIlIlIIIII lIlIlIIIllIIllIIIllI, final int ilIlIIIllIIllIlllllI, final String iiiIlllIIIIIIlIIIlll, final String llllIIllllIlIlIIIIll) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public IIllIIIlIIlIlIlIIIII IlIlIlIlIlllllllllIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public static llIllIIlllllllllllll llllIIIIlIIIlIlllIll(final IIllIIIlIIlIlIlIIIII illIIIlIIlIlIlIIIII, int n) {
        final llIllIIlllllllllllll[] array = llIllIIlllllllllllll.llIllIlIIIIllIlIIllI[illIIIlIIlIlIlIIIII.ordinal()];
        if (n < 0 || n >= array.length) {
            n = 0;
        }
        return array[n];
    }
    
    public static llIllIIlllllllllllll[] llllIIIIlIIIlIlllIll(final IIllIIIlIIlIlIlIIIII illIIIlIIlIlIlIIIII) {
        return llIllIIlllllllllllll.llIllIlIIIIllIlIIllI[illIIIlIIlIlIlIIIII.ordinal()];
    }
    
    @Override
    public String toString() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIllllIlIlIIIIll;
    }
}
