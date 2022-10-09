package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.base.*;
import java.util.*;
import com.google.common.collect.*;

public enum IllIllIIIIlIIlIlllII implements Predicate, Iterable
{
    llllIIIIlIIIlIlllIll("HORIZONTAL", 0), 
    IlIlIlIlIlllllllllIl("VERTICAL", 1);
    
    private static volatile /* synthetic */ int[] llIllIIIIIllIlIIIIlI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new IllIllIIIIlIIlIlllII[] { IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll, IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl };
    }
    
    private IllIllIIIIlIIlIlllII(final String s, final int n) {
    }
    
    public lllIllIIIllllllIllll[] llllIIIIlIIIlIlllIll() {
        switch (IlIlIlIlIlllllllllIl()[this.ordinal()]) {
            case 1: {
                return new lllIllIIIllllllIllll[] { lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI };
            }
            case 2: {
                return new lllIllIIIllllllIllll[] { lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll };
            }
            default: {
                throw new Error("Someone's been tampering with the universe!");
            }
        }
    }
    
    public lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final Random random) {
        final lllIllIIIllllllIllll[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll();
        return llllIIIIlIIIlIlllIll[random.nextInt(llllIIIIlIIIlIlllIll.length)];
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return lllIllIIIllllllIllll != null && lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI().IlIlIIIllIllIIIIIllI() == this;
    }
    
    public Iterator iterator() {
        return (Iterator)Iterators.forArray((Object[])this.llllIIIIlIIIlIlllIll());
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] llIllIIIIIllIlIIIIlI = IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI != null) {
            return llIllIIIIIllIlIIIIlI;
        }
        final int[] llIllIIIIIllIlIIIIlI2 = new int[values().length];
        try {
            llIllIIIIIllIlIIIIlI2[IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIIIIIllIlIIIIlI2[IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        return IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
}
