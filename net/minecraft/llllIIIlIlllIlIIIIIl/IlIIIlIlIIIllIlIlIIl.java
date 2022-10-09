package net.minecraft.llllIIIlIlllIlIIIIIl;

import java.util.concurrent.*;

class IlIIIlIlIIIllIlIlIIl implements Callable
{
    final /* synthetic */ llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    
    IlIIIlIlIIIllIlIlIIl(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll)) + " (" + this.llllIIIIlIIIlIlllIll.getClass().getCanonicalName() + ")";
    }
}
