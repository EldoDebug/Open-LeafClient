package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.util.concurrent.*;
import io.netty.channel.*;

class IIIlIIIlIlIIlllIIlll implements Runnable
{
    final /* synthetic */ IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    private final /* synthetic */ llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private final /* synthetic */ llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private final /* synthetic */ IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    private final /* synthetic */ GenericFutureListener[] IlIlIIIllIllIIIIIllI;
    
    IIIlIIIlIlIIlllIIlll(final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl, final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI, final IIlIIIIIllIlIIIlIIll ilIIIlIlIIIllIlIlIIl, final GenericFutureListener[] ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void run() {
        if (this.IlIlIlIlIlllllllllIl != this.llIllIIIIIllIlIIIIlI) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        }
        final ChannelFuture writeAndFlush = this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.writeAndFlush(this.IlIIIlIlIIIllIlIlIIl);
        if (this.IlIlIIIllIllIIIIIllI != null) {
            writeAndFlush.addListeners((GenericFutureListener<? extends Future<? super Void>>[])this.IlIlIIIllIllIIIIIllI);
        }
        writeAndFlush.addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
}
