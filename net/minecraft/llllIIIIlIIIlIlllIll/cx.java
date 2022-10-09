package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public abstract class cx extends cc
{
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIIIlIlIIIllIlIlIIl IlllIIIIlIIIlIlIlIIl;
    
    static {
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("seamless");
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("variant", cy.class);
    }
    
    public cx() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl();
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl;
        if (this.IllIllIIIIlIIlIlllII()) {
            llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(cx.IIllllIIIlIIIIIIllIl, false);
        }
        else {
            llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(cx.IIIIIIIIIlllIllIlIlI, cd.IlIlIlIlIlllllllllIl);
        }
        this.lIIIIlIIIIIlllIllIII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cx.IlllIIIIlIIIlIlIlIIl, cy.llllIIIIlIIIlIlllIll));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll);
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll);
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI(final int n) {
        return String.valueOf(super.lIllllllIIllIlIlIlII()) + "." + cy.llllIIIIlIIIlIlllIll(n).IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll IlIllllIIlIIlIlIlIll() {
        return cx.IlllIIIIlIIIlIlIlIIl;
    }
    
    @Override
    public Object llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return cy.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() & 0x7);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        if (ilIIIlIlIIIllIlIlIIl != net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI)) {
            cy[] values;
            for (int length = (values = cy.values()).length, i = 0; i < length; ++i) {
                final cy cy = values[i];
                if (cy != net.minecraft.llllIIIIlIIIlIlllIll.cy.llIllIIIIIllIlIIIIlI) {
                    list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, cy.IlIlIlIlIlllllllllIl()));
                }
            }
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(cx.IlllIIIIlIIIlIlIlIIl, cy.llllIIIIlIIIlIlllIll(n & 0x7));
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl;
        if (this.IllIllIIIIlIIlIlllII()) {
            llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(cx.IIllllIIIlIIIIIIllIl, (n & 0x8) != 0x0);
        }
        else {
            llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(cx.IIIIIIIIIlllIllIlIlI, ((n & 0x8) == 0x0) ? cd.IlIlIlIlIlllllllllIl : cd.llllIIIIlIIIlIlllIll);
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((cy)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cx.IlllIIIIlIIIlIlIlIIl)).IlIlIlIlIlllllllllIl();
        if (this.IllIllIIIIlIIlIlllII()) {
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cx.IIllllIIIlIIIIIIllIl)) {
                n |= 0x8;
            }
        }
        else if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cx.IIIIIIIIIlllIllIlIlI) == cd.llllIIIIlIIIlIlllIll) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return this.IllIllIIIIlIIlIlllII() ? new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { cx.IIllllIIIlIIIIIIllIl, cx.IlllIIIIlIIIlIlIlIIl }) : new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { cx.IIIIIIIIIlllIllIlIlI, cx.IlllIIIIlIIIlIlIlIIl });
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((cy)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cx.IlllIIIIlIIIlIlIlIIl)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((cy)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cx.IlllIIIIlIIIlIlIlIIl)).llIllIIIIIllIlIIIIlI();
    }
}
