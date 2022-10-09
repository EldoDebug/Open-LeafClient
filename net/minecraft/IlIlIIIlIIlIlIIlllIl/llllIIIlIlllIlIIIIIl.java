package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import java.util.concurrent.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

class llllIIIlIlllIlIIIIIl implements Callable
{
    final /* synthetic */ IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    
    llllIIIlIlllIlIIIIIl(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        if (llIllIIIIIllIlIIIIlI < 0) {
            return "Unknown? (Got " + llIllIIIIIllIlIIIIlI + ")";
        }
        return String.format("%1$d / 0x%1$X / 0b%2$s", llIllIIIIIllIlIIIIlI, String.format("%4s", Integer.toBinaryString(llIllIIIIIllIlIIIIlI)).replace(" ", "0"));
    }
}
