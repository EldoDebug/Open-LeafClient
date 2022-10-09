package net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIlIlIlllllllllIl implements IIlIIIIIllIlIIIlIIll
{
    private long llllIIIIlIIIlIlllIll;
    
    public IlIlIlIlIlllllllllIl() {
    }
    
    public IlIlIlIlIlllllllllIl(final long llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readLong();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeLong(this.llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
}
