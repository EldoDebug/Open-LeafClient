package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IIlllIIIlIlllIIlllII implements GenericFutureListener
{
    final /* synthetic */ IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IIlllIIlIllIllIlIIll IlIlIlIlIlllllllllIl;
    private final /* synthetic */ IlIlIIIIIIlllIlIllIl llIllIIIIIllIlIIIIlI;
    
    IIlllIIIlIlllIIlllII(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll, final IIlllIIlIllIllIlIIll ilIlIlIlIlllllllllIl, final IlIlIIIIIIlllIlIllIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void operationComplete(final Future future) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
    }
}
