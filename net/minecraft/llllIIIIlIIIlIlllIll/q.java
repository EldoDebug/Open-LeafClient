package net.minecraft.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class q extends llllIlIllllIIlIIlIlI
{
    public static final IlIIIlIlIIIllIlIlIIl IIllllIIIlIIIIIIllIl;
    private static volatile /* synthetic */ int[] lllIllIIIllllllIllll;
    private static volatile /* synthetic */ int[] llIllIlIlIIIIIIIllII;
    
    static {
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("variant", aa.class, (Predicate)new r());
    }
    
    public q() {
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(q.IIIIIIIIIlllIllIlIlI, a.IlIlIlIlIlllllllllIl));
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final aa aa = (aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl);
        switch (IlIllllIIlIIlIlIlIll()[((a)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(q.IIIIIIIIIlllIllIlIlI)).ordinal()]) {
            default: {
                switch (IllIllIIIIlIIlIlllII()[aa.ordinal()]) {
                    default: {
                        return net.minecraft.llllIIIIlIIIlIlllIll.aa.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
                    }
                    case 2: {
                        return net.minecraft.llllIIIIlIIIlIlllIll.aa.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
                    }
                    case 3: {
                        return net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII;
                    }
                    case 4: {
                        return net.minecraft.llllIIIIlIIIlIlllIll.aa.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
                    }
                }
                break;
            }
            case 2: {
                return aa.llIllIIIIIllIlIIIIlI();
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, aa.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, aa.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, aa.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()));
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.llllIIIIlIIIlIlllIll((n & 0x3) % 4));
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = null;
        switch (n & 0xC) {
            case 0: {
                llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(q.IIIIIIIIIlllIllIlIlI, a.IlIlIlIlIlllllllllIl);
                break;
            }
            case 4: {
                llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(q.IIIIIIIIIlllIllIlIlI, a.llllIIIIlIIIlIlllIll);
                break;
            }
            case 8: {
                llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(q.IIIIIIIIIlllIllIlIlI, a.llIllIIIIIllIlIIIIlI);
                break;
            }
            default: {
                llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(q.IIIIIIIIIlllIllIlIlI, a.IlIIIlIlIIIllIlIlIIl);
                break;
            }
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl)).IlIlIlIlIlllllllllIl();
        switch (IlIllllIIlIIlIlIlIll()[((a)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(q.IIIIIIIIIlllIllIlIlI)).ordinal()]) {
            case 1: {
                n |= 0x4;
                break;
            }
            case 3: {
                n |= 0x8;
                break;
            }
            case 4: {
                n |= 0xC;
                break;
            }
        }
        return n;
    }
    
    @Override
    protected IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { q.IIllllIIIlIIIIIIllIl, q.IIIIIIIIIlllIllIlIlI });
    }
    
    @Override
    protected lllIIIIlIlIllIIlIIIl IllIIlllIIIIlllIIlIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this), 1, ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl)).IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl)).IlIlIlIlIlllllllllIl();
    }
    
    static /* synthetic */ int[] IllIllIIIIlIIlIlllII() {
        final int[] lllIllIIIllllllIllll = q.lllIllIIIllllllIllll;
        if (lllIllIIIllllllIllll != null) {
            return lllIllIIIllllllIllll;
        }
        final int[] lllIllIIIllllllIllll2 = new int[aa.values().length];
        try {
            lllIllIIIllllllIllll2[aa.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIllIIIllllllIllll2[aa.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIllIIIllllllIllll2[aa.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIllIIIllllllIllll2[aa.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIllIIIllllllIllll2[aa.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIllIIIllllllIllll2[aa.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return q.lllIllIIIllllllIllll = lllIllIIIllllllIllll2;
    }
    
    static /* synthetic */ int[] IlIllllIIlIIlIlIlIll() {
        final int[] llIllIlIlIIIIIIIllII = q.llIllIlIlIIIIIIIllII;
        if (llIllIlIlIIIIIIIllII != null) {
            return llIllIlIlIIIIIIIllII;
        }
        final int[] llIllIlIlIIIIIIIllII2 = new int[a.values().length];
        try {
            llIllIlIlIIIIIIIllII2[a.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIlIlIIIIIIIllII2[a.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIllIlIlIIIIIIIllII2[a.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIllIlIlIIIIIIIllII2[a.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return q.llIllIlIlIIIIIIIllII = llIllIlIlIIIIIIIllII2;
    }
}
