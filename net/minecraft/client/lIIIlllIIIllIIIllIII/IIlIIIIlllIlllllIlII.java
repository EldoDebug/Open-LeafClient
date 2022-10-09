package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.util.concurrent.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

class IIlIIIIlllIlllllIlII implements Callable
{
    final /* synthetic */ IIllIIllIIIlIlIIIIlI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ g IlIlIlIlIlllllllllIl;
    
    IIlIIIIlllIlllllIlII(final IIllIIllIIIlIlIIIIlI llllIIIIlIIIlIlllIll, final g ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI, this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
    }
}
