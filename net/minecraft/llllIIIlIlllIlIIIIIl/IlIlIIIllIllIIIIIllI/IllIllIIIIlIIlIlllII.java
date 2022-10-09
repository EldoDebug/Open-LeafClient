package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IllIllIIIIlIIlIlllII extends IIlIIIIIllIlIIIlIIll
{
    public IllIllIIIIlIIlIlllII(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII, final Class clazz) {
        super(llIllIlIlIIIIIIIllII, clazz, true);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI.b_(1.0f) < 0.5f && super.llllIIIIlIIIlIlllIll();
    }
}
