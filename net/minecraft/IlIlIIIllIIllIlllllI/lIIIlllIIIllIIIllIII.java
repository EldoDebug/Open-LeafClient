package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class lIIIlllIIIllIIIllIII implements GenericFutureListener
{
    final /* synthetic */ lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIIIIIIlllIlIllIl IlIlIlIlIlllllllllIl;
    
    lIIIlllIIIllIIIllIII(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll, final IlIlIIIIIIlllIlIllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void operationComplete(final Future future) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
}
