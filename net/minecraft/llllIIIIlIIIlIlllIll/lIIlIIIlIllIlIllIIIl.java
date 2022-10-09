package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import java.util.*;

public class lIIlIIIlIllIlIllIIIl extends IIlIIIIlllIlllllIlII implements dt
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    public static final IlIIIlIlIIIllIlIlIIl IIllllIIIlIIIIIIllIl;
    public static final IlIIIlIlIIIllIlIlIIl IlllIIIIlIIIlIlIlIIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("variant", lIlIlIlllIIlIlIlllIl.class);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("half", IIlIIIlllIllIllIlIII.class);
        IlllIIIIlIIIlIlIlIIl = IIlIlIlIIlIllIIIIIIl.IlllIIIIlIIIlIlIlIIl;
    }
    
    public lIIlIIIlIllIlIllIIIl() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl, IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IlllIIIIlIIIlIlIlIIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI));
        this.llIllIIIIIllIlIIIIlI(0.0f);
        this.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IllIIlllIIIIlllIIlIl);
        this.IlIlIlIlIlllllllllIl("doublePlant");
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public lIlIlIlllIIlIlIlllIl IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
            return (lIlIlIlllIIlIlIlllIl)this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI);
        }
        return lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() != this) {
            return true;
        }
        final lIlIlIlllIIlIlIlllIl lIlIlIlllIIlIlIlllIl = (lIlIlIlllIIlIlIlllIl)this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI);
        return lIlIlIlllIIlIlIlllIl == net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl || lIlIlIlllIIlIlIlllIl == net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    protected void IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (!this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl)) {
            final boolean b = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl) == IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll;
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = b ? ilIlIlIlIlllllllllIl : ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = b ? ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() : ilIlIlIlIlllllllllIl;
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = b ? this : illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = b ? illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3).llIllIIIIIllIlIIIIlI() : this;
            if (llllIIIIlIIIlIlllIll == this) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
            }
            if (llllIIIIlIIIlIlllIll2 == this) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 3);
                if (!b) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl3, llIIlIIIlIIIllIlIIIl, 0);
                }
            }
        }
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl) == IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll) {
            return illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == this;
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        return ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this && super.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl) == IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll) {
            return null;
        }
        final lIlIlIlllIIlIlIlllIl lIlIlIlllIIlIlIlllIl = (lIlIlIlllIIlIlIlllIl)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI);
        return (lIlIlIlllIIlIlIlllIl == net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl) ? null : ((lIlIlIlllIIlIlIlllIl == net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI) ? ((random.nextInt(8) == 0) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlllIIIIlIIIlIlIlIIl : null) : net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this));
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl) != IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll && llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI) != lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI) ? ((lIlIlIlllIIlIlIlllIl)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl() : 0;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final lIlIlIlllIIlIlIlllIl ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
        return (ilIlIIIllIllIIIIIllI != lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI && ilIlIIIllIllIIIIIllI != lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl) ? 16777215 : net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIlIlIlllIIlIlIlllIl lIlIlIlllIIlIlIlllIl, final int n) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl, IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI, lIlIlIlllIIlIlIlllIl), n);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl, IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll), n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl, IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll), 2);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII || llllIIIIlIIIlIlllIll.p() == null || llllIIIIlIIIlIlllIll.p().llllIIIIlIIIlIlllIll() != net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i || llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl) != IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl || !this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll)) {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl) == IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll) {
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == this) {
                if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                    final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                    final lIlIlIlllIIlIlIlllIl lIlIlIlllIIlIlIlllIl = (lIlIlIlllIIlIlIlllIl)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI);
                    if (lIlIlIlllIIlIlIlllIl != net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl && lIlIlIlllIIlIlIlllIl != net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI) {
                        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), true);
                    }
                    else if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                        if (llllIIIIlIIIlIlllIll.p() != null && llllIIIIlIIIlIlllIll.p().llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i) {
                            this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll);
                            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                        }
                        else {
                            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), true);
                        }
                    }
                    else {
                        illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                    }
                }
                else {
                    illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                }
            }
        }
        else if (llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI() == this) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
        }
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll);
    }
    
    private boolean IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lIlIlIlllIIlIlIlllIl lIlIlIlllIIlIlIlllIl = (lIlIlIlllIIlIlIlllIl)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI);
        if (lIlIlIlllIIlIlIlllIl != net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl && lIlIlIlllIIlIlIlllIl != net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI) {
            return false;
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIIlIlIllllIIlIllI[llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this)]);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, 2, ((lIlIlIlllIIlIlIlllIl == net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI) ? dd.IlIlIlIlIlllllllllIl : dd.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl()));
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        lIlIlIlllIIlIlIlllIl[] values;
        for (int length = (values = lIlIlIlllIIlIlIlllIl.values()).length, i = 0; i < length; ++i) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, values[i].IlIlIlIlIlllllllllIl()));
        }
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        final lIlIlIlllIIlIlIlllIl ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return ilIlIIIllIllIIIIIllI != lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI && ilIlIIIllIllIIIIIllI != lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return true;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(this, 1, this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl()));
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return ((n & 0x8) > 0) ? this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl, IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll) : this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl, IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll(n & 0x7));
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl) == IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI));
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl) == IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll) ? (0x8 | ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IlllIIIIlIIIlIlIlIIl)).llIllIIIIIllIlIIIIlI()) : ((lIlIlIlllIIlIlIlllIl)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { lIIlIIIlIllIlIllIIIl.IIllllIIIlIIIIIIllIl, lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI, lIIlIIIlIllIlIllIIIl.IlllIIIIlIIIlIlIlIIl });
    }
    
    @Override
    public IllIIlllIIIIlllIIlIl llIllIlIlIIIIIIIllII() {
        return net.minecraft.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl;
    }
}
