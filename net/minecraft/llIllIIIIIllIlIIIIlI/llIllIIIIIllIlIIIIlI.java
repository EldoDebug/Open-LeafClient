package net.minecraft.llIllIIIIIllIlIIIIlI;

import java.util.concurrent.*;

class llIllIIIIIllIlIIIIlI implements Callable
{
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(System.getProperty("os.name")) + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    }
}
