package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.channel.*;

class IlllllllIIIlIIIlIlII extends ChannelInitializer
{
    private final /* synthetic */ IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    
    IlllllllIIIlIIIlIlII(final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected void initChannel(final Channel channel) {
        channel.pipeline().addLast("packet_handler", this.llllIIIIlIIIlIlllIll);
    }
}
