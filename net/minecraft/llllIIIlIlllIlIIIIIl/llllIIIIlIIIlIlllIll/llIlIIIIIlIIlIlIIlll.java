package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;

public class llIlIIIIIlIIlIlIIlll extends IlIlIIIllIllIIIIIllI
{
    private IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    
    public llIlIIIIIlIIlIlIIlll(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(4);
        ((IllIIlllIIIIlllIIlIl)llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).IlIIIlIlIIIllIlIlIIl(true);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI() || this.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIIlIIIlIlllIll.B().nextFloat() < 0.8f) {
            this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII().llllIIIIlIIIlIlllIll();
        }
    }
}
