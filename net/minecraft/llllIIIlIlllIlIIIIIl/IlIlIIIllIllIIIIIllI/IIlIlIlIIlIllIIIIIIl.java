package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IIlIlIlIIlIllIIIIIIl extends IlIlIlIlIlllllllllIl
{
    public IIlIlIlIIlIllIIIIIIl(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII, final Class clazz) {
        super(llIllIlIlIIIIIIIllII, clazz, 1.0, true);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        if (this.IlIlIlIlIlllllllllIl.b_(1.0f) >= 0.5f && this.IlIlIlIlIlllllllllIl.B().nextInt(100) == 0) {
            this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl((lllIIIIlllllIlIIllIl)null);
            return false;
        }
        return super.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected double llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return 4.0f + lllIIIIlllllIlIIllIl.IllIllIIIIlIIlIlllII;
    }
}
