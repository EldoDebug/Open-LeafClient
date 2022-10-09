package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import java.util.concurrent.*;

class IIIIlllIIIIIIlIIIlll implements Callable
{
    final /* synthetic */ llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    IIIIlllIIIIIIlIIIlll(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return (this.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl.IIlllIIIlIlllIIlllII() == null) ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
    }
}
