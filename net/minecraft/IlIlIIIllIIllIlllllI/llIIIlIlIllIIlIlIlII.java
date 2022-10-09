package net.minecraft.IlIlIIIllIIllIlllllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import io.netty.channel.local.*;
import com.google.common.util.concurrent.*;

class llIIIlIlIllIIlIlIlII extends llllIllllIllllIlIlII
{
    protected LocalEventLoopGroup llllIIIIlIIIlIlllIll() {
        return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Server IO #%d").setDaemon(true).build());
    }
}
