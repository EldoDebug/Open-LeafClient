package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.util.concurrent.*;
import org.lwjgl.input.*;

class IlllllllIIIlIIIlIlII implements Callable
{
    final /* synthetic */ IIllIIllIIIlIlIIIIlI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ int IlIlIlIlIlllllllllIl;
    private final /* synthetic */ int llIllIIIIIllIlIIIIlI;
    
    IlllllllIIIlIIIlIlII(final IIllIIllIIIlIlIIIIlI llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, Mouse.getX(), Mouse.getY());
    }
}
