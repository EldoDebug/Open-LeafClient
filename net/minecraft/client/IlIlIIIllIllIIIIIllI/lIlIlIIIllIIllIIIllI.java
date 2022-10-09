package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import java.util.concurrent.*;

class lIlIlIIIllIIllIIIllI implements Callable
{
    final /* synthetic */ llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    lIlIlIIIllIIllIIIllI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(this.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI.size()) + " total; " + this.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI.toString();
    }
}
