package net.minecraft.llllIIIlIlllIlIIIIIl;

import java.util.concurrent.*;

class IIlIIIIlllIlllllIlII implements Callable
{
    final /* synthetic */ IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ int IlIlIlIlIlllllllllIl;
    
    IIlIIIIlllIlllllIlII(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        String s = "Once per " + this.IlIlIlIlIlllllllllIl + " ticks";
        if (this.IlIlIlIlIlllllllllIl == Integer.MAX_VALUE) {
            s = "Maximum (" + s + ")";
        }
        return s;
    }
}
