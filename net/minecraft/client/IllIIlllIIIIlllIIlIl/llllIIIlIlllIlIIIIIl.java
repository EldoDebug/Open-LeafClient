package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import javax.crypto.*;
import io.netty.util.concurrent.*;

class llllIIIlIlllIlIIIIIl implements GenericFutureListener
{
    final /* synthetic */ IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ SecretKey IlIlIlIlIlllllllllIl;
    
    llllIIIlIlllIlIIIIIl(final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll, final SecretKey ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void operationComplete(final Future future) {
        this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
}
