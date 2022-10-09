package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIlllIIIllIllIIlIlIl implements IIlIIIIIllIlIIIlIIll
{
    private llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll;
    private llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl;
    
    public IIlllIIIllIllIIlIlIl() {
    }
    
    public IIlllIIIllIllIIlIlIl(final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
