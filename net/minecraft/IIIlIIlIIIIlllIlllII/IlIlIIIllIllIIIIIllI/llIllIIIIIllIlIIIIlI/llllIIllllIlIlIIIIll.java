package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import java.util.concurrent.*;

class llllIIllllIlIlIIIIll implements Callable
{
    final /* synthetic */ IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
    private final /* synthetic */ int IlIlIlIlIlllllllllIl;
    private final /* synthetic */ int llIllIIIIIllIlIIIIlI;
    
    llllIIllllIlIlIIIIll(final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI) ? "True" : "False";
    }
}
