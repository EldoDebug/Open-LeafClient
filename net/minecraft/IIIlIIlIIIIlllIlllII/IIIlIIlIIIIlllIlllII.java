package net.minecraft.IIIlIIlIIIIlllIlllII;

import java.util.concurrent.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

class IIIlIIlIIIIlllIlllII implements Callable
{
    final /* synthetic */ IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    
    IIIlIIlIIIIlllIlllII(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        try {
            return String.format("ID #%d (%s // %s)", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl), this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII(), this.IlIlIlIlIlllllllllIl.getClass().getCanonicalName());
        }
        catch (Throwable t) {
            return "ID #" + net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        }
    }
}
