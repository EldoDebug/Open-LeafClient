package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import com.google.common.util.concurrent.*;

class lIIIlllIIIllIIIllIII implements Runnable
{
    final /* synthetic */ lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ ListenableFuture IlIlIlIlIlllllllllIl;
    
    lIIIlllIIIllIIIllIII(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll, final ListenableFuture ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void run() {
        this.IlIlIlIlIlllllllllIl.cancel(false);
    }
}
