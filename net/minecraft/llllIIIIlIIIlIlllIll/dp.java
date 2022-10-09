package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public abstract class dp extends cc
{
    public static final IlIIIlIlIIIllIlIlIIl IIllllIIIlIIIIIIllIl;
    
    static {
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("variant", aa.class);
    }
    
    public dp() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl();
        if (!this.IllIllIIIIlIIlIlllII()) {
            llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dp.IIIIIIIIIlllIllIlIlI, cd.IlIlIlIlIlllllllllIl);
        }
        this.lIIIIlIIIIIlllIllIII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dp.IIllllIIIlIIIIIIllIl, aa.llllIIIIlIIIlIlllIll));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dp.IIllllIIIlIIIIIIllIl)).llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q);
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q);
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI(final int n) {
        return String.valueOf(super.lIllllllIIllIlIlIlII()) + "." + aa.llllIIIIlIIIlIlllIll(n).IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll IlIllllIIlIIlIlIlIll() {
        return dp.IIllllIIIlIIIIIIllIl;
    }
    
    @Override
    public Object llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return aa.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() & 0x7);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        if (ilIIIlIlIIIllIlIlIIl != net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.P)) {
            aa[] values;
            for (int length = (values = aa.values()).length, i = 0; i < length; ++i) {
                list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, values[i].IlIlIlIlIlllllllllIl()));
            }
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(dp.IIllllIIIlIIIIIIllIl, aa.llllIIIIlIIIlIlllIll(n & 0x7));
        if (!this.IllIllIIIIlIIlIlllII()) {
            llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dp.IIIIIIIIIlllIllIlIlI, ((n & 0x8) == 0x0) ? cd.IlIlIlIlIlllllllllIl : cd.llllIIIIlIIIlIlllIll);
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dp.IIllllIIIlIIIIIIllIl)).IlIlIlIlIlllllllllIl();
        if (!this.IllIllIIIIlIIlIlllII() && llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dp.IIIIIIIIIlllIllIlIlI) == cd.llllIIIIlIIIlIlllIll) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return this.IllIllIIIIlIIlIlllII() ? new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { dp.IIllllIIIlIIIIIIllIl }) : new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { dp.IIIIIIIIIlllIllIlIlI, dp.IIllllIIIlIIIIIIllIl });
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dp.IIllllIIIlIIIIIIllIl)).IlIlIlIlIlllllllllIl();
    }
}
