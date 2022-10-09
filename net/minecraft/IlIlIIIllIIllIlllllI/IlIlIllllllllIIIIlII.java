package net.minecraft.IlIlIIIllIIllIlllllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import io.netty.channel.nio.*;
import com.google.common.util.concurrent.*;

class IlIlIllllllllIIIIlII extends llllIllllIllllIlIlII
{
    protected NioEventLoopGroup llllIIIIlIIIlIlllIll() {
        return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build());
    }
}
