package net.minecraft.llIllIIIIIllIlIIIIlI;

import java.util.concurrent.*;

class IlIlIIIllIllIIIIIllI implements Callable
{
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(System.getProperty("java.vm.name")) + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
    }
}
