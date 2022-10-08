package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import java.util.concurrent.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

class llIllIIIIIllIlIIIIlI implements Callable
{
    private final /* synthetic */ llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(this.llllIIIIlIIIlIlllIll);
    }
}
