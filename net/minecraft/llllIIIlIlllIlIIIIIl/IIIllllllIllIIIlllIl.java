package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIllllllIllIIIlllIl implements llIIlllIIlllIIllIllI
{
    private IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll;
    private llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private llIIIIIIlIllIIlIIIll IlIIIlIlIIIllIlIlIIl;
    
    public IIIllllllIllIIIlllIl(final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl, final llIIIIIIlIllIIlIIIll ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll = new IlIIIlIIIllllIlIlIlI(ilIlIlIlIlllllllllIl, this);
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return (this.IlIIIlIlIIIllIlIlIIl != null) ? this.IlIIIlIlIIIllIlIlIIl : new IIllIIllIIIlIlIIIIlI("entity.Villager.name", new Object[0]);
    }
}
