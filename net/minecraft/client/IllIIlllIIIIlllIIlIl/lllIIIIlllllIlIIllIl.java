package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import io.netty.channel.*;

class lllIIIIlllllIlIIllIl extends ChannelInitializer
{
    final /* synthetic */ IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIIIllIllIIIIIllI IlIlIlIlIlllllllllIl;
    private final /* synthetic */ IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI;
    
    lllIIIIlllllIlIIllIl(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final IlIlIIIllIllIIIIIllI ilIlIlIlIlllllllllIl, final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    protected void initChannel(final Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, true);
        }
        catch (ChannelException ex) {}
        channel.pipeline().addLast(new IlIlIIIIIIlllIlIllIl(this, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI));
    }
}
