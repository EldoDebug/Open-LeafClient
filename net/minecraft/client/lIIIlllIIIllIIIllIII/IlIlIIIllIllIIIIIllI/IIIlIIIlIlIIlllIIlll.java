package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import java.util.concurrent.*;

class IIIlIIIlIlIIlllIIlll implements Callable
{
    final /* synthetic */ IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl;
    
    IIIlIIIlIlIIlllIIlll(final IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll, final IlIlIIIllIIllIlllllI ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()) + " x " + this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
    }
}
