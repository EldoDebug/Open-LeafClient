package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.handler.timeout.*;
import io.netty.channel.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.*;

class lllllIlIIIlIlIIlllII extends ChannelInitializer
{
    final /* synthetic */ IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    
    lllllIlIIIlIlIIlllII(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected void initChannel(final Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, true);
        }
        catch (ChannelException ex) {}
        channel.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("legacy_query", new IIIIIllIIIIlIIIIllIl(this.llllIIIIlIIIlIlllIll)).addLast("splitter", new IllllIIlIlIllIIIllII()).addLast("decoder", new IlIIIIIlIIllIIlIlIll(IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll)).addLast("prepender", new IlIllllIIIlIllIlIIll()).addLast("encoder", new lllllIIIIIlIIlllIlIl(IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl));
        final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = new IIlllIIlIllIllIlIIll(IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.add(illlIIlIllIllIlIIll);
        channel.pipeline().addLast("packet_handler", illlIIlIllIllIlIIll);
        illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(new llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, illlIIlIllIllIlIIll));
    }
}
