package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class llIIIIIIlIllIIlIIIll extends IlIlIIIllIllIIIIIllI
{
    private IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll;
    
    public llIIIIIIlIllIIlIIIll(final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(5);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (!this.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII()) {
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI()) {
            return false;
        }
        if (!this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl) {
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll) {
            return false;
        }
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        return llllIIIIlIIIlIlllIll != null && this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll) <= 16.0 && llllIIIIlIIIlIlllIll.t instanceof IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll)null);
    }
}
