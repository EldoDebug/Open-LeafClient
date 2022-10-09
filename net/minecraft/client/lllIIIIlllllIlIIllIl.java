package net.minecraft.client;

import java.util.concurrent.*;
import org.lwjgl.*;

class lllIIIIlllllIlIIllIl implements Callable
{
    final /* synthetic */ Minecraft llllIIIIlIIIlIlllIll;
    
    lllIIIIlllllIlIIllIl(final Minecraft llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return Sys.getVersion();
    }
}
