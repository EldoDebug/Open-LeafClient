package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import java.util.concurrent.*;

class IlIlIIIllIllIIIIIllI implements Callable
{
    final /* synthetic */ llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ int IlIlIlIlIlllllllllIl;
    
    IlIlIIIllIllIIIIIllI(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return (this.IlIlIlIlIlllllllllIl == 0) ? "MISC_TEXTURE" : ((this.IlIlIlIlIlllllllllIl == 1) ? "TERRAIN_TEXTURE" : ((this.IlIlIlIlIlllllllllIl == 3) ? "ENTITY_PARTICLE_TEXTURE" : ("Unknown - " + this.IlIlIlIlIlllllllllIl)));
    }
}
