package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import java.util.*;

class IlIlIlIlIlllllllllIl implements Comparator
{
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2) {
        return (ilIIIlIlIIIllIlIlIIl instanceof IlIlIIIlIIlIlIIlllIl && ilIIIlIlIIIllIlIlIIl2 instanceof IIIlIIIlIlIIlllIIlll) ? 1 : ((ilIIIlIlIIIllIlIlIIl2 instanceof IlIlIIIlIIlIlIIlllIl && ilIIIlIlIIIllIlIlIIl instanceof IIIlIIIlIlIIlllIIlll) ? -1 : ((ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll() < ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()) ? -1 : ((ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll() > ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()) ? 1 : 0)));
    }
}
