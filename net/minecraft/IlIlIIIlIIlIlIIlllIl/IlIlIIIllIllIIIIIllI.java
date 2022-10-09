package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import java.util.concurrent.*;

class IlIlIIIllIllIIIIIllI implements Callable
{
    final /* synthetic */ IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    
    IlIlIIIllIllIIIIIllI(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl.get(this.llllIIIIlIIIlIlllIll.getClass())) + " // " + this.llllIIIIlIIIlIlllIll.getClass().getCanonicalName();
    }
}
