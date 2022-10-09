package net.minecraft.IlIlIIIllIIllIlllllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import io.netty.channel.epoll.*;
import com.google.common.util.concurrent.*;

class IIlllIlIIllIlIlIlIIl extends llllIllllIllllIlIlII
{
    protected EpollEventLoopGroup llllIIIIlIIIlIlllIll() {
        return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build());
    }
}
