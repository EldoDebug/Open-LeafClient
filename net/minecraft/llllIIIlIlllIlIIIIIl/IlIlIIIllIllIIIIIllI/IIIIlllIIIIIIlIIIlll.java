package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import java.util.*;

class IIIIlllIIIIIIlIIIlll extends IlIlIIIllIllIIIIIllI
{
    private llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll;
    
    public IIIIlllIIIIIIlIIIlll(final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final IIlllIIlllIIIlIlllII llIIIlIlIllIIlIlIlII = this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII();
        if (!llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll()) {
            return true;
        }
        final double n = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl() - this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
        final double n2 = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI() - this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII;
        final double n3 = llIIIlIlIllIIlIlIlII.IllIIlllIIIIlllIIlIl() - this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
        final double n4 = n * n + n2 * n2 + n3 * n3;
        return n4 < 1.0 || n4 > 3600.0;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        final Random b = this.llllIIIIlIIIlIlllIll.B();
        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl + (b.nextFloat() * 2.0f - 1.0f) * 16.0f, this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + (b.nextFloat() * 2.0f - 1.0f) * 16.0f, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII + (b.nextFloat() * 2.0f - 1.0f) * 16.0f, 1.0);
    }
}
