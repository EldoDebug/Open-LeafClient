package net.minecraft.IlIlIIIllIIllIlllllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import io.netty.channel.epoll.*;
import com.google.common.util.concurrent.*;

class IlIlIIIIIIlllIlIllIl extends llllIllllIllllIlIlII
{
    protected EpollEventLoopGroup llllIIIIlIIIlIlllIll() {
        return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build());
    }
}
