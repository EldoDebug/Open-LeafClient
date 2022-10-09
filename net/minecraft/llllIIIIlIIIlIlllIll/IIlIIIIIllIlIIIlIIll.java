package net.minecraft.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class IIlIIIIIllIlIIIlIIll extends IIllllIIIlIIIIIIllIl
{
    public static final llIllIIIIIllIlIIIIlI IIIIIIIIIlllIllIlIlI;
    public final int IIllllIIIlIIIIIIllIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing", (Predicate)IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll);
    }
    
    protected IIlIIIIIllIlIIIlIIll(final int iIllllIIIlIIIIIIllIl) {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI));
        this.IIllllIIIlIIIIIIllIl = iIllllIIIlIIIIIIllIl;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
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
    public int llIllIlIIIIllIlIIllI() {
        return 2;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI() == this) {
            this.llllIIIIlIIIlIlllIll(0.0625f, 0.0f, 0.0f, 0.9375f, 0.875f, 0.9375f);
        }
        else if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI() == this) {
            this.llllIIIIlIIIlIlllIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 1.0f);
        }
        else if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI() == this) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
        else if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI() == this) {
            this.llllIIIIlIIIlIlllIll(0.0625f, 0.0f, 0.0625f, 1.0f, 0.875f, 0.9375f);
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        final Iterator iterator = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator.next());
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
                this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2);
            }
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll * 4.0f / 360.0f + 0.5) & 0x3).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI, ilIlIIIllIllIIIIIllI);
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI2 = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl();
        final boolean b = this == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI();
        final boolean b2 = this == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI();
        final boolean b3 = this == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI2).llIllIIIIIllIlIIIIlI();
        final boolean b4 = this == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI();
        if (!b && !b2 && !b3 && !b4) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 3);
        }
        else if (ilIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI() != llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll || (!b && !b2)) {
            if (ilIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI && (b3 || b4)) {
                if (b3) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI2, llllIIIIlIIIlIlllIll, 3);
                }
                else {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll, 3);
                }
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 3);
            }
        }
        else {
            if (b) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll, 3);
            }
            else {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, 3);
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 3);
        }
        if (lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl()) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll2 instanceof IlIlIIIllIIllIlllllI) {
                ((IlIlIIIllIIllIlllllI)llllIIIIlIIIlIlllIll2).llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.IIlllIIlIllIllIlIIll());
            }
        }
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return llllIIIIlIIIlIlllIll;
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl5 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
        lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI);
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI();
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI();
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI4 = ilIlIlIlIlllllllllIl5.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI != this && llIllIIIIIllIlIIIIlI2 != this) {
            final boolean llllIIIIlIIIlIlllIll2 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
            final boolean llllIIIIlIIIlIlllIll3 = llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll();
            if (llIllIIIIIllIlIIIIlI3 == this || llIllIIIIIllIlIIIIlI4 == this) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl6 = (llIllIIIIIllIlIIIIlI3 == this) ? ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI() : ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl();
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl7 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl6.llIllIIIIIllIlIIIIlI());
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl8 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl6.IlIIIlIlIIIllIlIlIIl());
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
                lllIllIIIllllllIllll lllIllIIIllllllIllll2;
                if (llIllIIIIIllIlIIIIlI3 == this) {
                    lllIllIIIllllllIllll2 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI);
                }
                else {
                    lllIllIIIllllllIllll2 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI);
                }
                if (lllIllIIIllllllIllll2 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
                    lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
                }
                final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI5 = ilIlIlIlIlllllllllIl7.llIllIIIIIllIlIIIIlI();
                final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI6 = ilIlIlIlIlllllllllIl8.llIllIIIIIllIlIIIIlI();
                if ((llllIIIIlIIIlIlllIll2 || llIllIIIIIllIlIIIIlI5.llllIIIIlIIIlIlllIll()) && !llllIIIIlIIIlIlllIll3 && !llIllIIIIIllIlIIIIlI6.llllIIIIlIIIlIlllIll()) {
                    lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
                }
                if ((llllIIIIlIIIlIlllIll3 || llIllIIIIIllIlIIIIlI6.llllIIIIlIIIlIlllIll()) && !llllIIIIlIIIlIlllIll2 && !llIllIIIIIllIlIIIIlI5.llllIIIIlIIIlIlllIll()) {
                    lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
                }
            }
        }
        else {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl9 = (llIllIIIIIllIlIIIIlI == this) ? ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() : ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl10 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl9.IlIlIIIllIllIIIIIllI());
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl11 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl9.IllIIlllIIIIlllIIlIl());
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
            lllIllIIIllllllIllll lllIllIIIllllllIllll3;
            if (llIllIIIIIllIlIIIIlI == this) {
                lllIllIIIllllllIllll3 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI);
            }
            else {
                lllIllIIIllllllIllll3 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI);
            }
            if (lllIllIIIllllllIllll3 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
            }
            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI7 = ilIlIlIlIlllllllllIl10.llIllIIIIIllIlIIIIlI();
            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI8 = ilIlIlIlIlllllllllIl11.llIllIIIIIllIlIIIIlI();
            if ((llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll() || llIllIIIIIllIlIIIIlI7.llllIIIIlIIIlIlllIll()) && !llIllIIIIIllIlIIIIlI4.llllIIIIlIIIlIlllIll() && !llIllIIIIIllIlIIIIlI8.llllIIIIlIIIlIlllIll()) {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
            }
            if ((llIllIIIIIllIlIIIIlI4.llllIIIIlIIIlIlllIll() || llIllIIIIIllIlIIIIlI8.llllIIIIlIIIlIlllIll()) && !llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll() && !llIllIIIIIllIlIIIIlI7.llllIIIIlIIIlIlllIll()) {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
            }
        }
        llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 3);
        return llllIIIIlIIIlIlllIll;
    }
    
    public llIIlIIIlIIIllIlIIIl IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        lllIllIIIllllllIllll lllIllIIIllllllIllll = null;
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll2 : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll2));
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
                return llIIlIIIlIIIllIlIIIl;
            }
            if (!ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
                continue;
            }
            if (lllIllIIIllllllIllll != null) {
                lllIllIIIllllllIllll = null;
                break;
            }
            lllIllIIIllllllIllll = lllIllIIIllllllIllll2;
        }
        if (lllIllIIIllllllIllll != null) {
            return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI());
        }
        lllIllIIIllllllIllll lllIllIIIllllllIllll3 = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI);
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll3)).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
            lllIllIIIllllllIllll3 = lllIllIIIllllllIllll3.IlIlIIIllIllIIIIIllI();
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll3)).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
            lllIllIIIllllllIllll3 = lllIllIIIllllllIllll3.IllIIlllIIIIlllIIlIl();
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll3)).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
            lllIllIIIllllllIllll3 = lllIllIIIllllllIllll3.IlIlIIIllIllIIIIIllI();
        }
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll3);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        int n = 0;
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI() == this) {
            if (this.llIllIlIIIIllIlIIllI(illlllllIIIlIIIlIlII, ilIlIIIllIllIIIIIllI)) {
                return false;
            }
            ++n;
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI() == this) {
            if (this.llIllIlIIIIllIlIIllI(illlllllIIIlIIIlIlII, illIIlllIIIIlllIIlIl)) {
                return false;
            }
            ++n;
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI() == this) {
            if (this.llIllIlIIIIllIlIIllI(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI)) {
                return false;
            }
            ++n;
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI() == this) {
            if (this.llIllIlIIIIllIlIIllI(illlllllIIIlIIIlIlII, ilIIIlIlIIIllIlIlIIl)) {
                return false;
            }
            ++n;
        }
        return n <= 1;
    }
    
    private boolean llIllIlIIIIllIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() != this) {
            return false;
        }
        final Iterator iterator = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator.next())).llIllIIIIIllIlIIIIlI() == this) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll);
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll2 instanceof IlIlIIIllIIllIlllllI) {
            llllIIIIlIIIlIlllIll2.lllIIIIlllllIlIIllIl();
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll instanceof llIIIlIlIllIIlIlIlII) {
            net.minecraft.llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll);
            illlllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl, this);
        }
        super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        if (liiIlllIIIllIIIllIII != null) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIIIlIlIllIIlIlIlII)liiIlllIIIllIIIllIII);
            if (this.IIllllIIIlIIIIIIllIl == 0) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIIIIIIlIllIIlIIIll);
            }
            else if (this.IIllllIIIlIIIIIIllIl == 1) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIlIIIIIlIIlIlIIlll);
            }
        }
        return true;
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (!(llllIIIIlIIIlIlllIll instanceof IlIlIIIllIIllIlllllI)) {
            return null;
        }
        llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII = (IlIlIIIllIIllIlllllI)llllIIIIlIIIlIlllIll;
        if (this.lIlIlIIIllIIllIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
            return null;
        }
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI() == this) {
                if (this.lIlIlIIIllIIllIIIllI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2)) {
                    return null;
                }
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                if (!(llllIIIIlIIIlIlllIll3 instanceof IlIlIIIllIIllIlllllI)) {
                    continue;
                }
                if (lllIllIIIllllllIllll != net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && lllIllIIIllllllIllll != net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
                    llIIIlIlIllIIlIlIlII = new IIIllllllIllIIIlllIl("container.chestDouble", (net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll)llIIIlIlIllIIlIlIlII, (net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll)llllIIIIlIIIlIlllIll3);
                }
                else {
                    llIIIlIlIllIIlIlIlII = new IIIllllllIllIIIlllIl("container.chestDouble", (net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll)llllIIIIlIIIlIlllIll3, (net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll)llIIIlIlIllIIlIlIlII);
                }
            }
        }
        return (net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll)llIIIlIlIllIIlIlIlII;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        return new IlIlIIIllIIllIlllllI();
    }
    
    @Override
    public boolean IIIlIIlIIIIlllIlllII() {
        return this.IIllllIIIlIIIIIIllIl == 1;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (!this.IIIlIIlIIIIlllIlllII()) {
            return 0;
        }
        int lIlIlIIIllIIllIIIllI2 = 0;
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll instanceof IlIlIIIllIIllIlllllI) {
            lIlIlIIIllIIllIIIllI2 = ((IlIlIIIllIIllIlllllI)llllIIIIlIIIlIlllIll).lIlIlIIIllIIllIIIllI;
        }
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI2, 0, 15);
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) ? this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, lllIllIIIllllllIllll) : 0;
    }
    
    private boolean lIlIlIIIllIIllIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIIIllIIllIlllllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) || this.IIIIlllIIIIIIlIIIlll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    private boolean IlIlIIIllIIllIlllllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII();
    }
    
    private boolean IIIIlllIIIIIIlIIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final Iterator<net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI> iterator = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 1, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 2, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 1)).iterator();
        while (iterator.hasNext()) {
            if (((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl)iterator.next()).at()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean IIIIIIIIIlllIllIlIlI() {
        return true;
    }
    
    @Override
    public int lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl));
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        lllIllIIIllllllIllll lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(n);
        if (lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
        }
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IIlIIIIIllIlIIIlIIll.IIIIIIIIIlllIllIlIlI });
    }
}
