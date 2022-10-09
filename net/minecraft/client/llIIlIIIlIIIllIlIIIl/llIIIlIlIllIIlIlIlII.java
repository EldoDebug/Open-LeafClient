package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import java.io.*;
import com.google.common.util.concurrent.*;

class llIIIlIlIllIIlIlIlII implements FutureCallback
{
    final /* synthetic */ IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ File IlIlIlIlIlllllllllIl;
    private final /* synthetic */ SettableFuture llIllIIIIIllIlIIIIlI;
    
    llIIIlIlIllIIlIlIlII(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll, final File ilIlIlIlIlllllllllIl, final SettableFuture llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void onSuccess(final Object o) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI.set((Object)null);
    }
    
    public void onFailure(final Throwable exception) {
        this.llIllIIIIIllIlIIIIlI.setException(exception);
    }
}
