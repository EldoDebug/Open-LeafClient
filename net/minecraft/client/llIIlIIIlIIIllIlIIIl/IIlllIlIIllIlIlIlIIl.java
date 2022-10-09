package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

class IIlllIlIIllIlIlIlIIl implements Runnable
{
    final /* synthetic */ IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ Minecraft IlIlIlIlIlllllllllIl;
    private final /* synthetic */ llIlllIlllllIIllIIII llIllIIIIIllIlIIIIlI;
    
    IIlllIlIIllIlIlIlIIl(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll, final Minecraft ilIlIlIlIlllllllllIl, final llIlllIlllllIIllIIII llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void run() {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
    }
}
