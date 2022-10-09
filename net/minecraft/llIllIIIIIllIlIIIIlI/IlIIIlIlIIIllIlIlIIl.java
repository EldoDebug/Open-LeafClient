package net.minecraft.llIllIIIIIllIlIIIIlI;

import java.util.concurrent.*;

class IlIIIlIlIIIllIlIlIIl implements Callable
{
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(System.getProperty("java.version")) + ", " + System.getProperty("java.vendor");
    }
}
