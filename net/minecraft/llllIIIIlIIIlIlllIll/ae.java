package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class ae extends llllIIllllIlIlIIIIll
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    private final af IIllllIIIlIIIIIIllIl;
    private static volatile /* synthetic */ int[] IlllIIIIlIIIlIlIlIIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("powered");
    }
    
    protected ae(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final af iIllllIIIlIIIIIIllIl) {
        super(ilIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(ae.IIIIIIIIIlllIllIlIlI, false));
        this.IIllllIIIlIIIIIIllIl = iIllllIIIlIIIIIIllIl;
    }
    
    @Override
    protected int llIIlIIIlIIIllIlIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ae.IIIIIIIIIlllIllIlIlI) ? 15 : 0;
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ae.IIIIIIIIIlllIllIlIlI, n > 0);
    }
    
    @Override
    protected int llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        List list = null;
        switch (IllIllIIIIlIIlIlllII()[this.IIllllIIIlIIIIIIllIl.ordinal()]) {
            case 1: {
                list = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(null, llllIIIIlIIIlIlllIll);
                break;
            }
            case 2: {
                list = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.class, llllIIIIlIIIlIlllIll);
                break;
            }
            default: {
                return 0;
            }
        }
        if (!list.isEmpty()) {
            final Iterator<llIllIIIIIllIlIIIIlI> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().IIlIlllIlIlllIlIllll()) {
                    return 15;
                }
            }
        }
        return 0;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ae.IIIIIIIIIlllIllIlIlI, n == 1);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ae.IIIIIIIIIlllIllIlIlI)) ? 1 : 0;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { ae.IIIIIIIIIlllIllIlIlI });
    }
    
    static /* synthetic */ int[] IllIllIIIIlIIlIlllII() {
        final int[] illlIIIIlIIIlIlIlIIl = ae.IlllIIIIlIIIlIlIlIIl;
        if (illlIIIIlIIIlIlIlIIl != null) {
            return illlIIIIlIIIlIlIlIIl;
        }
        final int[] illlIIIIlIIIlIlIlIIl2 = new int[af.values().length];
        try {
            illlIIIIlIIIlIlIlIIl2[af.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illlIIIIlIIIlIlIlIIl2[af.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        return ae.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl2;
    }
}
