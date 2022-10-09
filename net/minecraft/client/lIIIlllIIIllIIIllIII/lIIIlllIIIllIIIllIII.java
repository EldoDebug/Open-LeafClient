package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;

class lIIIlllIIIllIIIllIII extends IllIIlllIIIIlllIIlIl
{
    final /* synthetic */ lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    private static volatile /* synthetic */ int[] llIllIIIIIllIlIIIIlI;
    
    lIIIlllIIIllIIIllIII(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        switch (llllIIIIlIIIlIlllIll()[((am)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(al.IIIIIIIIIlllIllIlIlI)).ordinal()]) {
            default: {
                return new llllIIIlIlllIlIIIIIl("quartz_block", "normal");
            }
            case 2: {
                return new llllIIIlIlllIlIIIIIl("chiseled_quartz_block", "normal");
            }
            case 3: {
                return new llllIIIlIlllIlIIIIIl("quartz_column", "axis=y");
            }
            case 4: {
                return new llllIIIlIlllIlIIIIIl("quartz_column", "axis=x");
            }
            case 5: {
                return new llllIIIlIlllIlIIIIIl("quartz_column", "axis=z");
            }
        }
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] llIllIIIIIllIlIIIIlI = lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI != null) {
            return llIllIIIIIllIlIIIIlI;
        }
        final int[] llIllIIIIIllIlIIIIlI2 = new int[am.values().length];
        try {
            llIllIIIIIllIlIIIIlI2[am.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIIIIIllIlIIIIlI2[am.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIllIIIIIllIlIIIIlI2[am.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIllIIIIIllIlIIIIlI2[am.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIllIIIIIllIlIIIIlI2[am.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
}
