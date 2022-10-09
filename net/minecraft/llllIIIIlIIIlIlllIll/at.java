package net.minecraft.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class at extends ao
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IlllIIIIlIIIlIlIlIIl;
    private static volatile /* synthetic */ int[] lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("shape", ap.class, (Predicate)new au());
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("powered");
    }
    
    protected at() {
        super(true);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(at.IIIIIIIIIlllIllIlIlI, ap.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(at.IlllIIIIlIIIlIlIlIIl, false));
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b, final int n) {
        if (n >= 8) {
            return false;
        }
        int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        int llIIlIIIlIIIllIlIIIl2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        boolean b2 = true;
        ap ap = (ap)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(at.IIIIIIIIIlllIllIlIlI);
        switch (IlIllllIIlIIlIlIlIll()[ap.ordinal()]) {
            case 1: {
                if (b) {
                    ++llIIlIIIlIIIllIlIIIl2;
                    break;
                }
                --llIIlIIIlIIIllIlIIIl2;
                break;
            }
            case 2: {
                if (b) {
                    --liiiIlIIIIIlllIllIII;
                    break;
                }
                ++liiiIlIIIIIlllIllIII;
                break;
            }
            case 3: {
                if (b) {
                    --liiiIlIIIIIlllIllIII;
                }
                else {
                    ++liiiIlIIIIIlllIllIII;
                    ++liiIlllIIIllIIIllIII;
                    b2 = false;
                }
                ap = net.minecraft.llllIIIIlIIIlIlllIll.ap.IlIlIlIlIlllllllllIl;
                break;
            }
            case 4: {
                if (b) {
                    --liiiIlIIIIIlllIllIII;
                    ++liiIlllIIIllIIIllIII;
                    b2 = false;
                }
                else {
                    ++liiiIlIIIIIlllIllIII;
                }
                ap = net.minecraft.llllIIIIlIIIlIlllIll.ap.IlIlIlIlIlllllllllIl;
                break;
            }
            case 5: {
                if (b) {
                    ++llIIlIIIlIIIllIlIIIl2;
                }
                else {
                    --llIIlIIIlIIIllIlIIIl2;
                    ++liiIlllIIIllIIIllIII;
                    b2 = false;
                }
                ap = net.minecraft.llllIIIIlIIIlIlllIll.ap.llllIIIIlIIIlIlllIll;
                break;
            }
            case 6: {
                if (b) {
                    ++llIIlIIIlIIIllIlIIIl2;
                    ++liiIlllIIIllIIIllIII;
                    b2 = false;
                }
                else {
                    --llIIlIIIlIIIllIlIIIl2;
                }
                ap = net.minecraft.llllIIIIlIIIlIlllIll.ap.llllIIIIlIIIlIlllIll;
                break;
            }
        }
        return this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl2), b, n, ap) || (b2 && this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII - 1, llIIlIIIlIIIllIlIIIl2), b, n, ap));
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b, final int n, final ap ap) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() != this) {
            return false;
        }
        final ap ap2 = (ap)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(at.IIIIIIIIIlllIllIlIlI);
        return (ap != ap.IlIlIlIlIlllllllllIl || (ap2 != ap.llllIIIIlIIIlIlllIll && ap2 != ap.IlIlIIIllIllIIIIIllI && ap2 != ap.IllIIlllIIIIlllIIlIl)) && (ap != ap.llllIIIIlIIIlIlllIll || (ap2 != ap.IlIlIlIlIlllllllllIl && ap2 != ap.llIllIIIIIllIlIIIIlI && ap2 != ap.IlIIIlIlIIIllIlIlIIl)) && (boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(at.IlllIIIIlIIIlIlIlIIl) && (illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII(ilIlIlIlIlllllllllIl) || this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, b, n + 1));
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final boolean booleanValue = (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(at.IlllIIIIlIIIlIlIlIIl);
        final boolean b = illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII(ilIlIlIlIlllllllllIl) || this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, true, 0) || this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, false, 0);
        if (b != booleanValue) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(at.IlllIIIIlIIIlIlIlIIl, b), 3);
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), this);
            if (((ap)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(at.IIIIIIIIIlllIllIlIlI)).llIllIIIIIllIlIIIIlI()) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), this);
            }
        }
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll IllIllIIIIlIIlIlllII() {
        return at.IIIIIIIIIlllIllIlIlI;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(at.IIIIIIIIIlllIllIlIlI, ap.llllIIIIlIIIlIlllIll(n & 0x7)).llllIIIIlIIIlIlllIll(at.IlllIIIIlIIIlIlIlIIl, (n & 0x8) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((ap)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(at.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(at.IlllIIIIlIIIlIlIlIIl)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { at.IIIIIIIIIlllIllIlIlI, at.IlllIIIIlIIIlIlIlIIl });
    }
    
    static /* synthetic */ int[] IlIllllIIlIIlIlIlIll() {
        final int[] lllIllIIIllllllIllll = at.lllIllIIIllllllIllll;
        if (lllIllIIIllllllIllll != null) {
            return lllIllIIIllllllIllll;
        }
        final int[] lllIllIIIllllllIllll2 = new int[ap.values().length];
        try {
            lllIllIIIllllllIllll2[ap.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIllIIIllllllIllll2[ap.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIllIIIllllllIllll2[ap.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIllIIIllllllIllll2[ap.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIllIIIllllllIllll2[ap.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIllIIIllllllIllll2[ap.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            lllIllIIIllllllIllll2[ap.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            lllIllIIIllllllIllll2[ap.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            lllIllIIIllllllIllll2[ap.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            lllIllIIIllllllIllll2[ap.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        return at.lllIllIIIllllllIllll = lllIllIIIllllllIllll2;
    }
}
