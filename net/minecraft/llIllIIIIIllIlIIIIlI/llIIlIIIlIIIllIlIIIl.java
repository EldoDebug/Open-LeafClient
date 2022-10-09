package net.minecraft.llIllIIIIIllIlIIIIlI;

import java.util.concurrent.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

class llIIlIIIlIIIllIlIIIl implements Callable
{
    private final /* synthetic */ int llllIIIIlIIIlIlllIll;
    private final /* synthetic */ llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    
    llIIlIIIlIIIllIlIIIl(final int llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        try {
            return String.format("ID #%d (%s // %s)", this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII(), this.IlIlIlIlIlllllllllIl.getClass().getCanonicalName());
        }
        catch (Throwable t) {
            return "ID #" + this.llllIIIIlIIIlIlllIll;
        }
    }
}
