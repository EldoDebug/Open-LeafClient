package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import java.util.*;
import com.mojang.authlib.minecraft.*;

class IIIIIllIIIIlIIIIllIl implements Runnable
{
    final /* synthetic */ IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ Map IlIlIlIlIlllllllllIl;
    private final /* synthetic */ IIIIIIIIIlllIllIlIlI llIllIIIIIllIlIIIIlI;
    
    IIIIIllIIIIlIIIIllIl(final IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll, final Map ilIlIlIlIlllllllllIl, final IIIIIIIIIlllIllIlIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void run() {
        if (this.IlIlIlIlIlllllllllIl.containsKey(MinecraftProfileTexture$Type.SKIN)) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.get(MinecraftProfileTexture$Type.SKIN), MinecraftProfileTexture$Type.SKIN, this.llIllIIIIIllIlIIIIlI);
        }
        if (this.IlIlIlIlIlllllllllIl.containsKey(MinecraftProfileTexture$Type.CAPE)) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.get(MinecraftProfileTexture$Type.CAPE), MinecraftProfileTexture$Type.CAPE, this.llIllIIIIIllIlIIIIlI);
        }
    }
}
