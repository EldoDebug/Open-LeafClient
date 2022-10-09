package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import java.util.concurrent.*;

class IlIlIIIlIIlIlIIlllIl implements Callable
{
    final /* synthetic */ IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl;
    
    IlIlIIIlIIlIlIIlllIl(final IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll, final IlIlIIIllIIllIlllllI ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(this.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI()) + " frames";
    }
}
