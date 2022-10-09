package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import com.google.common.util.concurrent.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

class lIIIlllIIIllIIIllIII implements FutureCallback
{
    final /* synthetic */ lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ String IlIlIlIlIlllllllllIl;
    
    lIIIlllIIIllIIIllIII(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void onSuccess(final Object o) {
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new lIllllllIIllIlIlIlII(this.IlIlIlIlIlllllllllIl, llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll));
    }
    
    public void onFailure(final Throwable t) {
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new lIllllllIIllIlIlIlII(this.IlIlIlIlIlllllllllIl, llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI));
    }
}
