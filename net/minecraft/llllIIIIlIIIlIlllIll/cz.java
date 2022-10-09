package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public abstract class cz extends cc
{
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIIIlIlIIIllIlIlIIl IlllIIIIlIIIlIlIlIIl;
    
    static {
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("seamless");
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("variant", da.class);
    }
    
    public cz() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl();
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl;
        if (this.IllIllIIIIlIIlIlllII()) {
            llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(cz.IIllllIIIlIIIIIIllIl, false);
        }
        else {
            llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(cz.IIIIIIIIIlllIllIlIlI, cd.IlIlIlIlIlllllllllIl);
        }
        this.lIIIIlIIIIIlllIllIII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cz.IlllIIIIlIIIlIlIlIIl, da.llllIIIIlIIIlIlllIll));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(String.valueOf(this.lIllllllIIllIlIlIlII()) + ".red_sandstone.name");
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aT);
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aT);
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI(final int n) {
        return String.valueOf(super.lIllllllIIllIlIlIlII()) + "." + da.llllIIIIlIIIlIlllIll(n).IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll IlIllllIIlIIlIlIlIll() {
        return cz.IlllIIIIlIIIlIlIlIIl;
    }
    
    @Override
    public Object llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return da.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() & 0x7);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        if (ilIIIlIlIIIllIlIlIIl != net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aS)) {
            da[] values;
            for (int length = (values = da.values()).length, i = 0; i < length; ++i) {
                list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, values[i].IlIlIlIlIlllllllllIl()));
            }
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(cz.IlllIIIIlIIIlIlIlIIl, da.llllIIIIlIIIlIlllIll(n & 0x7));
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl;
        if (this.IllIllIIIIlIIlIlllII()) {
            llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(cz.IIllllIIIlIIIIIIllIl, (n & 0x8) != 0x0);
        }
        else {
            llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(cz.IIIIIIIIIlllIllIlIlI, ((n & 0x8) == 0x0) ? cd.IlIlIlIlIlllllllllIl : cd.llllIIIIlIIIlIlllIll);
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((da)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cz.IlllIIIIlIIIlIlIlIIl)).IlIlIlIlIlllllllllIl();
        if (this.IllIllIIIIlIIlIlllII()) {
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cz.IIllllIIIlIIIIIIllIl)) {
                n |= 0x8;
            }
        }
        else if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cz.IIIIIIIIIlllIllIlIlI) == cd.llllIIIIlIIIlIlllIll) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return this.IllIllIIIIlIIlIlllII() ? new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { cz.IIllllIIIlIIIIIIllIl, cz.IlllIIIIlIIIlIlIlIIl }) : new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { cz.IIIIIIIIIlllIllIlIlI, cz.IlllIIIIlIIIlIlIlIIl });
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((da)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cz.IlllIIIIlIIIlIlIlIIl)).llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((da)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cz.IlllIIIIlIIIlIlIlIIl)).IlIlIlIlIlllllllllIl();
    }
}
