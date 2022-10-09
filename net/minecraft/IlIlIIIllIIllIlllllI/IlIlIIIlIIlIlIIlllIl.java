package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.handler.timeout.*;
import io.netty.channel.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IlIlIIIlIIlIlIIlllIl extends ChannelInitializer
{
    private final /* synthetic */ IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    
    IlIlIIIlIIlIlIIlllIl(final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected void initChannel(final Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, true);
        }
        catch (ChannelException ex) {}
        channel.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("splitter", new IllllIIlIlIllIIIllII()).addLast("decoder", new IlIIIIIlIIllIIlIlIll(IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl)).addLast("prepender", new IlIllllIIIlIllIlIIll()).addLast("encoder", new lllllIIIIIlIIlllIlIl(IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll)).addLast("packet_handler", this.llllIIIIlIIIlIlllIll);
    }
}
