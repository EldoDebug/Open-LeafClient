package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import java.util.concurrent.*;

class IIllIIllIIIlIlIIIIlI implements Callable
{
    final /* synthetic */ llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    
    IIllIIllIIIlIlIIIIlI(final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.format("%d game time, %d day time", this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII, this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
    }
}
