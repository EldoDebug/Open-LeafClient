package net.optifine.IlIIIlIlIIIllIlIlIIl;

import java.util.*;

class IlIlIIIllIllIIIIIllI implements llIllIIIIIllIlIIIIlI
{
    private final /* synthetic */ Map llllIIIIlIIIlIlllIll;
    
    IlIlIIIllIllIIIIIllI(final Map llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        synchronized (this.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll.put("Response", llIllIlIIIIllIlIIllI);
            this.llllIIIIlIIIlIlllIll.notifyAll();
        }
        // monitorexit(this.llllIIIIlIIIlIlllIll)
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Exception ex) {
        synchronized (this.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll.put("Exception", ex);
            this.llllIIIIlIIIlIlllIll.notifyAll();
        }
        // monitorexit(this.llllIIIIlIIIlIlllIll)
    }
}
