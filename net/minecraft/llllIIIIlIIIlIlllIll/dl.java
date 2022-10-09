package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class dl extends llllIIIIlIIIlIlllIll
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIlIlIlIlllllllllIl IlllIIIIlIIIlIlIlIIl;
    public static final IlIlIlIlIlllllllllIl lllIllIIIllllllIllll;
    public static final IlIlIlIlIlllllllllIl llIllIlIlIIIIIIIllII;
    public static final IlIIIlIlIIIllIlIlIIl IIlIlIlIIlIllIIIIIIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("up");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("north");
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("east");
        lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("south");
        llIllIlIlIIIIIIIllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("west");
        IIlIlIlIIlIllIIIIIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("variant", dm.class);
    }
    
    public dl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(dl.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(dl.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(dl.IlllIIIIlIIIlIlIlIIl, false).llllIIIIlIIIlIlllIll(dl.lllIllIIIllllllIllll, false).llllIIIIlIIIlIlllIll(dl.llIllIlIlIIIIIIIllII, false).llllIIIIlIIIlIlllIll(dl.IIlIlIlIIlIllIIIIIIl, dm.llllIIIIlIIIlIlllIll));
        this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll);
        this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl / 3.0f);
        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(String.valueOf(this.lIllllllIIllIlIlIlII()) + "." + dm.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() + ".name");
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return false;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final boolean ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
        final boolean ilIlIIIllIllIIIIIllI2 = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
        final boolean ilIlIIIllIllIIIIIllI3 = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
        final boolean ilIlIIIllIllIIIIIllI4 = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
        float n = 0.25f;
        float n2 = 0.75f;
        float n3 = 0.25f;
        float n4 = 0.75f;
        float n5 = 1.0f;
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
        if (ilIlIIIllIllIIIIIllI && ilIlIIIllIllIIIIIllI2 && !ilIlIIIllIllIIIIIllI3 && !ilIlIIIllIllIIIIIllI4) {
            n5 = 0.8125f;
            n = 0.3125f;
            n2 = 0.6875f;
        }
        else if (!ilIlIIIllIllIIIIIllI && !ilIlIIIllIllIIIIIllI2 && ilIlIIIllIllIIIIIllI3 && ilIlIIIllIllIIIIIllI4) {
            n5 = 0.8125f;
            n3 = 0.3125f;
            n4 = 0.6875f;
        }
        this.llllIIIIlIIIlIlllIll(n, 0.0f, n3, n2, n5, n4);
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        this.lIllllllIIllIlIlIlII = 1.5;
        return super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az && (llIllIIIIIllIlIIIIlI == this || llIllIIIIIllIlIIIIlI instanceof llllIllllIllllIlIlII || (llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI.llIIlIIIlIIIllIlIIIl() && llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl() && llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        dm[] values;
        for (int length = (values = dm.values()).length, i = 0; i < length; ++i) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, values[i].IlIlIlIlIlllllllllIl()));
        }
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((dm)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dl.IIlIlIlIIlIllIIIIIIl)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return lllIllIIIllllllIllll != lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll || super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(dl.IIlIlIlIIlIllIIIIIIl, dm.llllIIIIlIIIlIlllIll(n));
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((dm)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dl.IIlIlIlIIlIllIIIIIIl)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dl.IIIIIIIIIlllIllIlIlI, !lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll())).llllIIIIlIIIlIlllIll(dl.IIllllIIIlIIIIIIllIl, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(dl.IlllIIIIlIIIlIlIlIIl, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl())).llllIIIIlIIIlIlllIll(dl.lllIllIIIllllllIllll, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl())).llllIIIIlIIIlIlllIll(dl.llIllIlIlIIIIIIIllII, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()));
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { dl.IIIIIIIIIlllIllIlIlI, dl.IIllllIIIlIIIIIIllIl, dl.IlllIIIIlIIIlIlIlIIl, dl.llIllIlIlIIIIIIIllII, dl.lllIllIIIllllllIllll, dl.IIlIlIlIIlIllIIIIIIl });
    }
}
