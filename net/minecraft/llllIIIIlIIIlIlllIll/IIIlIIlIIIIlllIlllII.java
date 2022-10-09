package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public abstract class IIIlIIlIIIIlllIlllII extends llllIIIIlIIIlIlllIll
{
    public static final llIllIIIIIllIlIIIIlI IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    private final boolean IlllIIIIlIIIlIlIlIIl;
    private static volatile /* synthetic */ int[] lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("powered");
    }
    
    protected IIIlIIlIIIIlllIlllII(final boolean illlIIIIlIIIlIlIlIIl) {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl, false));
        this.llllIIIIlIIIlIlllIll(true);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        this.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return this.IlllIIIIlIIIlIlIlIIl ? 30 : 20;
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
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        return (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) ? IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll) : illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI()) ? this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll).llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl, false) : this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl, false);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl) && !IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI)).IlIlIIIllIllIIIIIllI())) {
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
        this.lIIIlllIIIllIIIllIII(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
    }
    
    private void lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI);
        final float n = (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl) ? 1 : 2) / 16.0f;
        switch (IllIllIIIIlIIlIlllII()[lllIllIIIllllllIllll.ordinal()]) {
            case 6: {
                this.llllIIIIlIIIlIlllIll(0.0f, 0.375f, 0.3125f, n, 0.625f, 0.6875f);
                break;
            }
            case 5: {
                this.llllIIIIlIIIlIlllIll(1.0f - n, 0.375f, 0.3125f, 1.0f, 0.625f, 0.6875f);
                break;
            }
            case 4: {
                this.llllIIIIlIIIlIlllIll(0.3125f, 0.375f, 0.0f, 0.6875f, 0.625f, n);
                break;
            }
            case 3: {
                this.llllIIIIlIIIlIlllIll(0.3125f, 0.375f, 1.0f - n, 0.6875f, 0.625f, 1.0f);
                break;
            }
            case 2: {
                this.llllIIIIlIIIlIlllIll(0.3125f, 0.0f, 0.375f, 0.6875f, 0.0f + n, 0.625f);
                break;
            }
            case 1: {
                this.llllIIIIlIIIlIlllIll(0.3125f, 1.0f - n, 0.375f, 0.6875f, 1.0f, 0.625f);
                break;
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl)) {
            return true;
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl, true), 3);
        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, "random.click", 0.3f, 0.6f);
        this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI));
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII));
        return true;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl)) {
            this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI));
        }
        super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl) ? 15 : 0;
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl) ? ((llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI) == lllIllIIIllllllIllll) ? 15 : 0) : 0;
    }
    
    @Override
    public boolean IIIlIIlIIIIlllIlllII() {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl)) {
            if (this.IlllIIIIlIIIlIlIlIIl) {
                this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
            }
            else {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl, false));
                this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI));
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, "random.click", 0.3f, 0.5f);
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    @Override
    public void IlIlIllllllllIIIIlII() {
        final float n = 0.1875f;
        final float n2 = 0.125f;
        final float n3 = 0.125f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.5f - n2, 0.5f - n3, 0.5f + n, 0.5f + n2, 0.5f + n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IlllIIIIlIIIlIlIlIIl && !(boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl)) {
            this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        }
    }
    
    private void IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.lIIIlllIIIllIIIllIII(llIIlIIIlIIIllIlIIIl);
        final boolean b = !illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.IlIlIllllllllIIIIlII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.IIlllIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIIlIlIllIIlIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.lllllIlIIIlIlIIlllII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.lIllllllIIllIlIlIlII, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIlllIIlllIIllIllI)).isEmpty();
        final boolean booleanValue = (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl);
        if (b && !booleanValue) {
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl, true));
            this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI));
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (!b && booleanValue) {
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl, false));
            this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI));
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, "random.click", 0.3f, 0.5f);
        }
        if (b) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII));
        }
    }
    
    private void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, this);
        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI()), this);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        lllIllIIIllllllIllll lllIllIIIllllllIllll = null;
        switch (n & 0x7) {
            case 0: {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
                break;
            }
            case 1: {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
                break;
            }
            case 2: {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
                break;
            }
            case 3: {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
                break;
            }
            case 4: {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
                break;
            }
            default: {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
                break;
            }
        }
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll).llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl, (n & 0x8) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0;
        switch (IllIllIIIIlIIlIlllII()[((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI)).ordinal()]) {
            case 6: {
                n = 1;
                break;
            }
            case 5: {
                n = 2;
                break;
            }
            case 4: {
                n = 3;
                break;
            }
            case 3: {
                n = 4;
                break;
            }
            default: {
                n = 5;
                break;
            }
            case 1: {
                n = 0;
                break;
            }
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI, IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl });
    }
    
    static /* synthetic */ int[] IllIllIIIIlIIlIlllII() {
        final int[] lllIllIIIllllllIllll = IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll;
        if (lllIllIIIllllllIllll != null) {
            return lllIllIIIllllllIllll;
        }
        final int[] lllIllIIIllllllIllll2 = new int[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values().length];
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll = lllIllIIIllllllIllll2;
    }
}
