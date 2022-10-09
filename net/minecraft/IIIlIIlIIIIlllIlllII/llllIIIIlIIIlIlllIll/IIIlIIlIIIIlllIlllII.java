package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;

public class IIIlIIlIIIIlllIlllII extends llIIlIIIlIIIllIlIIIl
{
    protected llIIlIIIlIIIllIlIIIl llIlllIlllllIIllIIII;
    
    public IIIlIIlIIIIlllIlllII(final int n, final llIIlIIIlIIIllIlIIIl llIlllIlllllIIllIIII) {
        super(n);
        this.llIlllIlllllIIllIIII = llIlllIlllllIIllIIII;
        this.llllIIIIlIIIlIlllIll(llIlllIlllllIIllIIII.llIIIllIlIllIllIIIIl, true);
        this.lIlIIlllIIlIIlIlllIl = String.valueOf(llIlllIlllllIIllIIII.lIlIIlllIIlIIlIlllIl) + " M";
        this.IIlllIIlllIIIlIlllII = llIlllIlllllIIllIIII.IIlllIIlllIIIlIlllII;
        this.IlIIlllllIIllIIlllll = llIlllIlllllIIllIIII.IlIIlllllIIllIIlllll;
        this.lllllIIlIlIIIlIlIIIl = llIlllIlllllIIllIIII.lllllIIlIlIIIlIlIIIl;
        this.IIlllllIllIllIlIlIII = llIlllIlllllIIllIIII.IIlllllIllIllIlIlIII;
        this.llllIllllIllllIlIlII = llIlllIlllllIIllIIII.llllIllllIllllIlIlII;
        this.IIlIlIllllIlllIIIIll = llIlllIlllllIIllIIII.IIlIlIllllIlllIIIIll;
        this.lIIllIIIllllIlllIllI = llIlllIlllllIIllIIII.lIIllIIIllllIlllIllI;
        this.IllIlIllIllIlllIIlll = llIlllIlllllIIllIIII.IllIlIllIllIlllIIlll;
        this.lllllIIIIIlIIlllIlIl = llIlllIlllllIIllIIII.lllllIIIIIlIIlllIlIl;
        this.IlIllllIIIlIllIlIIll = llIlllIlllllIIllIIII.IlIllllIIIlIllIlIIll;
        this.lllllIIllIlIllIllllI = Lists.newArrayList((Iterable)llIlllIlllllIIllIIII.lllllIIllIlIllIllllI);
        this.llIllIIlllllllllllll = Lists.newArrayList((Iterable)llIlllIlllllIIllIIII.llIllIIlllllllllllll);
        this.IllllIIlIlIllIIIllII = Lists.newArrayList((Iterable)llIlllIlllllIIllIIII.IllllIIlIlIllIIIllII);
        this.IlIIIIIlIIllIIlIlIll = Lists.newArrayList((Iterable)llIlllIlllllIIllIIII.IlIIIIIlIIllIIlIlIll);
        this.IIlIlIllllIlllIIIIll = llIlllIlllllIIllIIII.IIlIlIllllIlllIIIIll;
        this.lIIllIIIllllIlllIllI = llIlllIlllllIIllIIII.lIIllIIIllllIlllIllI;
        this.IIlllllIllIllIlIlIII = llIlllIlllllIIllIIII.IIlllllIllIllIlIlIII + 0.1f;
        this.llllIllllIllllIlIlII = llIlllIlllllIIllIIII.llllIllllIllllIlIlII + 0.2f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llIlllIlllllIIllIIII.IIllIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, this, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2, final double n3) {
        this.llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl, n, n2, n3);
    }
    
    @Override
    public float llllIIIlIlllIlIIIIIl() {
        return this.llIlllIlllllIIllIIII.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return this.llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll(random);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIlllIlllllIIllIIII.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIlllIlllllIIllIIII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public Class lIlIlIIIllIIllIIIllI() {
        return this.llIlllIlllllIIllIIII.lIlIlIIIllIIllIIIllI();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public IlIlIIIllIIllIlllllI IlIlIIIllIIllIlllllI() {
        return this.llIlllIlllllIIllIIII.IlIlIIIllIIllIlllllI();
    }
}
