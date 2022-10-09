package net.minecraft.IlIlIIIIIIlllIlIllIl;

import java.util.concurrent.*;

class llIllIIIIIllIlIIIIlI implements Callable
{
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll ? this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI() : "N/A (disabled)";
    }
}
