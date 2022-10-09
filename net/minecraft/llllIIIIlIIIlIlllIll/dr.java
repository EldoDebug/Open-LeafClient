package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class dr implements IlIlIIIllIIllIlllllI
{
    private final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    
    public dr(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public String s_() {
        return null;
    }
    
    @Override
    public boolean w_() {
        return false;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return new IIllIIllIIIlIlIIIIlI(String.valueOf(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl.lIllllllIIllIlIlIlII()) + ".name", new Object[0]);
    }
    
    @Override
    public net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new IIIlIIlIIIIlllIlllII(illIIlllIIIIlllIIlIl, this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "minecraft:crafting_table";
    }
}
