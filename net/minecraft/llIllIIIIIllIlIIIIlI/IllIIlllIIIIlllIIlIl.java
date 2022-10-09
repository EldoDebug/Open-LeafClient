package net.minecraft.llIllIIIIIllIlIIIIlI;

import java.util.concurrent.*;

class IllIIlllIIIIlllIIlIl implements Callable
{
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    IllIIlllIIIIlllIIlIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        final Runtime runtime = Runtime.getRuntime();
        final long maxMemory = runtime.maxMemory();
        final long totalMemory = runtime.totalMemory();
        final long freeMemory = runtime.freeMemory();
        return String.valueOf(freeMemory) + " bytes (" + freeMemory / 1024L / 1024L + " MB) / " + totalMemory + " bytes (" + totalMemory / 1024L / 1024L + " MB) up to " + maxMemory + " bytes (" + maxMemory / 1024L / 1024L + " MB)";
    }
}
