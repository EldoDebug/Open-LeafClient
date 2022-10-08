package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import java.util.concurrent.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

class IlIlIlIlIlllllllllIl implements Callable
{
    private final /* synthetic */ llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(this.llllIIIIlIIIlIlllIll);
    }
}
