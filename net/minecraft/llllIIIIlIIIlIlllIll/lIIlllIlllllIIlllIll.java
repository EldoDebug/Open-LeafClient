package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

public class lIIlllIlllllIIlllIll extends llllIIIIlIIIlIlllIll
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    private static volatile /* synthetic */ int[] IlllIIIIlIIIlIlIlIIl;
    private static volatile /* synthetic */ int[] lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("facing", lIllIIlIlIlllllIIIII.class);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("powered");
    }
    
    protected lIIlllIlllllIIlllIll() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI, lIllIIlIlIlllllIIIII.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl, false));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI());
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        lllIllIIIllllllIllll[] values;
        for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            if (IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, values[i])) {
                return true;
            }
        }
        return false;
    }
    
    protected static boolean IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl, false);
        if (IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI())) {
            return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI, lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII()));
        }
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll2 : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            if (lllIllIIIllllllIllll2 != lllIllIIIllllllIllll && IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll2.IlIlIIIllIllIIIIIllI())) {
                return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI, lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll2, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII()));
            }
        }
        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl())) {
            return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI, lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII()));
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public static int llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        switch (IllIllIIIIlIIlIlllII()[lllIllIIIllllllIllll.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 3;
            }
            case 5: {
                return 2;
            }
            case 6: {
                return 1;
            }
            default: {
                return -1;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl) && !IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ((lIllIIlIlIlllllIIIII)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI)).llIllIIIIIllIlIIIIlI().IlIlIIIllIllIIIIIllI())) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        }
    }
    
    private boolean IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
            return true;
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
        illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        return false;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final float n = 0.1875f;
        switch (IlIllllIIlIIlIlIlIll()[((lIllIIlIlIlllllIIIII)lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI)).ordinal()]) {
            case 2: {
                this.llllIIIIlIIIlIlllIll(0.0f, 0.2f, 0.5f - n, n * 2.0f, 0.8f, 0.5f + n);
                break;
            }
            case 3: {
                this.llllIIIIlIIIlIlllIll(1.0f - n * 2.0f, 0.2f, 0.5f - n, 1.0f, 0.8f, 0.5f + n);
                break;
            }
            case 4: {
                this.llllIIIIlIIIlIlllIll(0.5f - n, 0.2f, 0.0f, 0.5f + n, 0.8f, n * 2.0f);
                break;
            }
            case 5: {
                this.llllIIIIlIIIlIlllIll(0.5f - n, 0.2f, 1.0f - n * 2.0f, 0.5f + n, 0.8f, 1.0f);
                break;
            }
            case 6:
            case 7: {
                final float n2 = 0.25f;
                this.llllIIIIlIIIlIlllIll(0.5f - n2, 0.0f, 0.5f - n2, 0.5f + n2, 0.6f, 0.5f + n2);
                break;
            }
            case 1:
            case 8: {
                final float n3 = 0.25f;
                this.llllIIIIlIIIlIlllIll(0.5f - n3, 0.4f, 0.5f - n3, 0.5f + n3, 1.0f, 0.5f + n3);
                break;
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, 3);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, "random.click", 0.3f, ((boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl)) ? 0.6f : 0.5f);
        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, this);
        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(((lIllIIlIlIlllllIIIII)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI)).llIllIIIIIllIlIIIIlI().IlIlIIIllIllIIIIIllI()), this);
        return true;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl)) {
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, this);
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(((lIllIIlIlIlllllIIIII)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI)).llIllIIIIIllIlIIIIlI().IlIlIIIllIllIIIIIllI()), this);
        }
        super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl) ? 15 : 0;
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl) ? ((((lIllIIlIlIlllllIIIII)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI)).llIllIIIIIllIlIIIIlI() == lllIllIIIllllllIllll) ? 15 : 0) : 0;
    }
    
    @Override
    public boolean IIIlIIlIIIIlllIlllII() {
        return true;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI, lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll(n & 0x7)).llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl, (n & 0x8) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((lIllIIlIlIlllllIIIII)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI, lIIlllIlllllIIlllIll.IIllllIIIlIIIIIIllIl });
    }
    
    static /* synthetic */ int[] IllIllIIIIlIIlIlllII() {
        final int[] illlIIIIlIIIlIlIlIIl = lIIlllIlllllIIlllIll.IlllIIIIlIIIlIlIlIIl;
        if (illlIIIIlIIIlIlIlIIl != null) {
            return illlIIIIlIIIlIlIlIIl;
        }
        final int[] illlIIIIlIIIlIlIlIIl2 = new int[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values().length];
        try {
            illlIIIIlIIIlIlIlIIl2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illlIIIIlIIIlIlIlIIl2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illlIIIIlIIIlIlIlIIl2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            illlIIIIlIIIlIlIlIIl2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            illlIIIIlIIIlIlIlIIl2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            illlIIIIlIIIlIlIlIIl2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lIIlllIlllllIIlllIll.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl2;
    }
    
    static /* synthetic */ int[] IlIllllIIlIIlIlIlIll() {
        final int[] lllIllIIIllllllIllll = lIIlllIlllllIIlllIll.lllIllIIIllllllIllll;
        if (lllIllIIIllllllIllll != null) {
            return lllIllIIIllllllIllll;
        }
        final int[] lllIllIIIllllllIllll2 = new int[lIllIIlIlIlllllIIIII.values().length];
        try {
            lllIllIIIllllllIllll2[lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIllIIIllllllIllll2[lIllIIlIlIlllllIIIII.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIllIIIllllllIllll2[lIllIIlIlIlllllIIIII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIllIIIllllllIllll2[lIllIIlIlIlllllIIIII.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIllIIIllllllIllll2[lIllIIlIlIlllllIIIII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIllIIIllllllIllll2[lIllIIlIlIlllllIIIII.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            lllIllIIIllllllIllll2[lIllIIlIlIlllllIIIII.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            lllIllIIIllllllIllll2[lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        return lIIlllIlllllIIlllIll.lllIllIIIllllllIllll = lllIllIIIllllllIllll2;
    }
}
