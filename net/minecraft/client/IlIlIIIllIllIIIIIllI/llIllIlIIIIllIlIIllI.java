package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import java.util.concurrent.*;

class llIllIlIIIIllIlIIllI implements Callable
{
    final /* synthetic */ llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    llIllIlIIIIllIlIIllI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.size()) + " total; " + this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.toString();
    }
}
