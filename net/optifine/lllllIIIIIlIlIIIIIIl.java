package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lllllIIIIIlIlIIIIIIl implements IlIllllIIlIIlIlIlIll
{
    private llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return (int)(this.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().getLeastSignificantBits() & 0x7FFFFFFFL);
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll.w_() ? this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII() : null;
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        if (!(this.llllIIIIlIIIlIlllIll instanceof IlIllIlIlIIIlIlIlIII)) {
            return 0;
        }
        return (int)((IlIllIlIlIIIlIlIlIII)this.llllIIIIlIIIlIlllIll).N();
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        if (!(this.llllIIIIlIIIlIlllIll instanceof IlIllIlIlIIIlIlIlIII)) {
            return 0;
        }
        return (int)((IlIllIlIlIIIlIlIlIII)this.llllIIIIlIIIlIlllIll).U();
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
}
