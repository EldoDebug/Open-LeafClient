package net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI;

import io.netty.channel.*;
import io.netty.util.concurrent.*;

class llIllIIIIIllIlIIIIlI implements ChannelFutureListener
{
    final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final ChannelFuture channelFuture) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IIlllIIIllIllIIlIlIl());
    }
}
