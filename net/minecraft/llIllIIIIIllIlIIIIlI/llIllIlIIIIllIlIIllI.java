package net.minecraft.llIllIIIIIllIlIIIIlI;

import java.util.concurrent.*;

class llIllIlIIIIllIlIIllI implements Callable
{
    private final /* synthetic */ int llllIIIIlIIIlIlllIll;
    
    llIllIlIIIIllIlIIllI(final int llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll < 0) {
            return "Unknown? (Got " + this.llllIIIIlIIIlIlllIll + ")";
        }
        return String.format("%1$d / 0x%1$X / 0b%2$s", this.llllIIIIlIIIlIlllIll, String.format("%4s", Integer.toBinaryString(this.llllIIIIlIIIlIlllIll)).replace(" ", "0"));
    }
}
