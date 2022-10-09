package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import java.util.concurrent.*;

class IlllllllIIIlIIIlIlII implements Callable
{
    final /* synthetic */ llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    
    IlllllllIIIlIIIlIlII(final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", this.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, this.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll, this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, this.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl);
    }
}
