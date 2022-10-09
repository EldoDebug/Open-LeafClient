package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class ag extends llllIIllllIlIlIIIIll
{
    public static final IllIIlllIIIIlllIIlIl IIIIIIIIIlllIllIlIlI;
    private final int IIllllIIIlIIIIIIllIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("power", 0, 15);
    }
    
    protected ag(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        this(ilIlIlIlIlllllllllIl, n, ilIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII());
    }
    
    protected ag(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int iIllllIIIlIIIIIIllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(ag.IIIIIIIIIlllIllIlIlI, 0));
        this.IIllllIIIlIIIIIIllIl = iIllllIIIlIIIIIIllIl;
    }
    
    @Override
    protected int llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int min = Math.min(illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.class, this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)).size(), this.IIllllIIIlIIIIIIllIl);
        if (min > 0) {
            return llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(Math.min(this.IIllllIIIlIIIIIIllIl, min) / (float)this.IIllllIIIlIIIIIIllIl * 15.0f);
        }
        return 0;
    }
    
    @Override
    protected int llIIlIIIlIIIllIlIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ag.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ag.IIIIIIIIIlllIllIlIlI, n);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return 10;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ag.IIIIIIIIIlllIllIlIlI, n);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ag.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { ag.IIIIIIIIIlllIllIlIlI });
    }
}
