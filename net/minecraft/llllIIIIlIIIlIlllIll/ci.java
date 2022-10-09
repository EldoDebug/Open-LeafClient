package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class ci implements IlIlIIIllIllIIIIIllI
{
    private final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    
    public ci(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public double IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5;
    }
    
    @Override
    public double llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5;
    }
    
    @Override
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5;
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        return ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
}
