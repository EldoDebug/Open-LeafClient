package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIIIlIlIIIllIlIlIIl implements IIlIIIIIllIlIIIlIIll
{
    private long llllIIIIlIIIlIlllIll;
    private long IlIlIlIlIlllllllllIl;
    
    public IlIIIlIlIIIllIlIlIIl() {
    }
    
    public IlIIIlIlIIIllIlIlIIl(final long llllIIIIlIIIlIlllIll, final long ilIlIlIlIlllllllllIl, final boolean b) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (!b) {
            this.IlIlIlIlIlllllllllIl = -this.IlIlIlIlIlllllllllIl;
            if (this.IlIlIlIlIlllllllllIl == 0L) {
                this.IlIlIlIlIlllllllllIl = -1L;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readLong();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readLong();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeLong(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeLong(this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public long llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public long IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
