package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import java.util.concurrent.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

class IllIIlllIIIIlllIIlIl implements Callable
{
    final /* synthetic */ IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    
    IllIIlllIIIIlllIIlIl(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        final int llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI());
        try {
            return String.format("ID #%d (%s // %s)", llllIIIIlIIIlIlllIll, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll).lIllllllIIllIlIlIlII(), net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll).getClass().getCanonicalName());
        }
        catch (Throwable t) {
            return "ID #" + llllIIIIlIIIlIlllIll;
        }
    }
}
