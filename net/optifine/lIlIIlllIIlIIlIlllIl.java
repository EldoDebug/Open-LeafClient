package net.optifine;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class lIlIIlllIIlIIlIlllIl implements IlIllllIIlIIlIlIlIll
{
    private IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(), this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI();
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII().llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI());
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return -1;
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return -1;
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
}
