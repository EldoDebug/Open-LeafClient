package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IIlllllIllIllIlIlIII extends llllIIIIlIIIlIlllIll
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIlIlIlIlllllllllIl IlllIIIIlIIIlIlIlIIl;
    public static final IlIlIlIlIlllllllllIl lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("north");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("east");
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("south");
        lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("west");
    }
    
    public IIlllllIllIllIlIlIII(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII());
    }
    
    public IIlllllIllIllIlIlIII(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IlllIIIIlIIIlIlIlIIl, false).llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.lllIllIIIllllllIllll, false));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final boolean ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
        final boolean ilIlIIIllIllIIIIIllI2 = this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
        final boolean ilIlIIIllIllIIIIIllI3 = this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
        final boolean ilIlIIIllIllIIIIIllI4 = this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
        float n = 0.375f;
        float n2 = 0.625f;
        float n3 = 0.375f;
        float n4 = 0.625f;
        if (ilIlIIIllIllIIIIIllI) {
            n3 = 0.0f;
        }
        if (ilIlIIIllIllIIIIIllI2) {
            n4 = 1.0f;
        }
        if (ilIlIIIllIllIIIIIllI || ilIlIIIllIllIIIIIllI2) {
            this.llllIIIIlIIIlIlllIll(n, 0.0f, n3, n2, 1.5f, n4);
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        }
        float n5 = 0.375f;
        float n6 = 0.625f;
        if (ilIlIIIllIllIIIIIllI3) {
            n = 0.0f;
        }
        if (ilIlIIIllIllIIIIIllI4) {
            n2 = 1.0f;
        }
        if (ilIlIIIllIllIIIIIllI3 || ilIlIIIllIllIIIIIllI4 || (!ilIlIIIllIllIIIIIllI && !ilIlIIIllIllIIIIIllI2)) {
            this.llllIIIIlIIIlIlllIll(n, 0.0f, n5, n2, 1.5f, n6);
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        }
        if (ilIlIIIllIllIIIIIllI) {
            n5 = 0.0f;
        }
        if (ilIlIIIllIllIIIIIllI2) {
            n6 = 1.0f;
        }
        this.llllIIIIlIIIlIlllIll(n, 0.0f, n5, n2, 1.0f, n6);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final boolean ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
        final boolean ilIlIIIllIllIIIIIllI2 = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
        final boolean ilIlIIIllIllIIIIIllI3 = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
        final boolean ilIlIIIllIllIIIIIllI4 = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
        float n = 0.375f;
        float n2 = 0.625f;
        float n3 = 0.375f;
        float n4 = 0.625f;
        if (ilIlIIIllIllIIIIIllI) {
            n3 = 0.0f;
        }
        if (ilIlIIIllIllIIIIIllI2) {
            n4 = 1.0f;
        }
        if (ilIlIIIllIllIIIIIllI3) {
            n = 0.0f;
        }
        if (ilIlIIIllIllIIIIIllI4) {
            n2 = 1.0f;
        }
        this.llllIIIIlIIIlIlllIll(n, 0.0f, n3, n2, 1.0f, n4);
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
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return false;
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az && ((llIllIIIIIllIlIIIIlI instanceof IIlllllIllIllIlIlIII && llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI == this.llllllIllIllIlIllllI) || llIllIIIIIllIlIIIIlI instanceof llllIllllIllllIlIlII || (llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI.llIIlIIIlIIIllIlIIIl() && llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl() && llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII));
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return true;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        return illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII || IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 0;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IIIIIIIIIlllIllIlIlI, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IIllllIIIlIIIIIIllIl, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl())).llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IlllIIIIlIIIlIlIlIIl, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl())).llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.lllIllIIIllllllIllll, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()));
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IIlllllIllIllIlIlIII.IIIIIIIIIlllIllIlIlI, IIlllllIllIllIlIlIII.IIllllIIIlIIIIIIllIl, IIlllllIllIllIlIlIII.lllIllIIIllllllIllll, IIlllllIllIllIlIlIII.IlllIIIIlIIIlIlIlIIl });
    }
}
