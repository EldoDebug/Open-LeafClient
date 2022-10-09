package net.minecraft.client;

import java.util.concurrent.*;

class llIIlIIIlIIIllIlIIIl implements Callable
{
    final /* synthetic */ Minecraft llllIIIIlIIIlIlllIll;
    
    llIIlIIIlIIIllIlIIIl(final Minecraft llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll ? this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI() : "N/A (disabled)";
    }
}
