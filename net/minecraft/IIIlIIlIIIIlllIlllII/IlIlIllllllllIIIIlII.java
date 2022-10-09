package net.minecraft.IIIlIIlIIIIlllIlllII;

import java.util.concurrent.*;

class IlIlIllllllllIIIIlII implements Callable
{
    final /* synthetic */ IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    
    IlIlIllllllllIIIIlII(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.size()) + " total; " + this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.toString();
    }
}
