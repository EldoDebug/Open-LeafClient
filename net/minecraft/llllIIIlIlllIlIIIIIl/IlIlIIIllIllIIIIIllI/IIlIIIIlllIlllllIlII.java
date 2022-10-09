package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IIlIIIIlllIlllllIlII extends IIlIIIIIllIlIIIlIIll
{
    public IIlIIIIlllIlllllIlII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Class clazz, final int n, final boolean b, final boolean b2, final Predicate predicate) {
        super(llIIlIIIlIIIllIlIIIl, clazz, n, b, b2, predicate);
        this.llIllIIIIIllIlIIIIlI = (Predicate)new IIIlIIlIIIIlllIlllII(this, predicate, llIIlIIIlIIIllIlIIIl);
    }
}
