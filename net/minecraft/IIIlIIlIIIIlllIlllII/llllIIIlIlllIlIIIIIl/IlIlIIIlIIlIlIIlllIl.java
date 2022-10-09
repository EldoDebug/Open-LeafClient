package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import java.util.concurrent.*;

class IlIlIIIlIIlIlIIlllIl implements Callable
{
    final /* synthetic */ llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    
    IlIlIIIlIIlIlIIlllIl(final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        String s = "Unknown?";
        try {
            switch (this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll) {
                case 19132: {
                    s = "McRegion";
                    break;
                }
                case 19133: {
                    s = "Anvil";
                    break;
                }
            }
        }
        catch (Throwable t) {}
        return String.format("0x%05X - %s", this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, s);
    }
}
