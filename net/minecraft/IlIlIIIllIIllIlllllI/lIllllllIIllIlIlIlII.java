package net.minecraft.IlIlIIIllIIllIlllllI;

import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import io.netty.channel.*;

class lIllllllIIllIlIlIlII extends ChannelInitializer
{
    final /* synthetic */ IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    
    lIllllllIIllIlIlIlII(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected void initChannel(final Channel channel) {
        final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = new IIlllIIlIllIllIlIIll(IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
        illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(new IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, illlIIlIllIllIlIIll));
        this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.add(illlIIlIllIllIlIIll);
        channel.pipeline().addLast("packet_handler", illlIIlIllIllIlIIll);
    }
}
