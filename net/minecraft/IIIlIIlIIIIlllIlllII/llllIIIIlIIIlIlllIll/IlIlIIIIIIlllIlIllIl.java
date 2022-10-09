package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;

class IlIlIIIIIIlllIlIllIl extends IIIlIIlIIIIlllIlllII
{
    final /* synthetic */ IIlllIIlIllIllIlIIll IIlllIIIllIllIIlIlIl;
    
    IlIlIIIIIIlllIlIllIl(final IIlllIIlIllIllIlIIll iIlllIIIllIllIIlIlIl, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IIlllIIIllIllIIlIlIl = iIlllIIIllIllIIlIlIl;
        super(n, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return random.nextBoolean() ? net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.IIlllIIIllIllIIlIlIl : net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.llIlllIlllllIIllIIII;
    }
}
