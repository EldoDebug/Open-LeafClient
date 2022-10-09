package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import java.util.concurrent.*;

class IIlIIIIlllIlllllIlII implements Callable
{
    final /* synthetic */ llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    
    IIlIIIIlllIlllllIlII(final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(), this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(), this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII);
    }
}
