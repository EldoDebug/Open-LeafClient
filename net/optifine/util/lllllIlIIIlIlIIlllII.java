package net.optifine.util;

import java.lang.reflect.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

class lllllIlIIIlIlIIlllII implements IIlIIIIlllIlllllIlII
{
    private boolean llllIIIIlIIIlIlllIll;
    private final /* synthetic */ Method IlIlIlIlIlllllllllIl;
    private final /* synthetic */ Object llIllIIIIIllIlIIIIlI;
    
    lllllIlIIIlIlIIlllII(final Method ilIlIlIlIlllllllllIl, final Object llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = false;
    }
    
    @Override
    public long llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll) {
            return -1L;
        }
        try {
            return (long)this.IlIlIlIlIlllllllllIl.invoke(this.llIllIIIIIllIlIIIIlI, new Object[0]);
        }
        catch (Throwable t) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(t.getClass().getName() + ": " + t.getMessage());
            this.llllIIIIlIIIlIlllIll = true;
            return -1L;
        }
    }
}
