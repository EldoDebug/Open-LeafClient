package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import com.mojang.authlib.*;
import com.mojang.authlib.minecraft.*;
import net.minecraft.client.*;
import com.google.common.collect.*;
import java.util.*;

class IlIIIlIIIllllIlIlIlI implements Runnable
{
    final /* synthetic */ IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private final /* synthetic */ GameProfile IlIlIlIlIlllllllllIl;
    private final /* synthetic */ boolean llIllIIIIIllIlIIIIlI;
    private final /* synthetic */ IIIIIIIIIlllIllIlIlI IlIIIlIlIIIllIlIlIIl;
    
    IlIIIlIIIllllIlIlIlI(final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll, final GameProfile ilIlIlIlIlllllllllIl, final boolean llIllIIIIIllIlIIIIlI, final IIIIIIIIIlllIllIlIlI ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void run() {
        final HashMap hashMap = Maps.newHashMap();
        try {
            hashMap.putAll(this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.getTextures(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI));
        }
        catch (InsecureTextureException ex) {}
        if (hashMap.isEmpty() && this.IlIlIlIlIlllllllllIl.getId().equals(Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl().IlIlIIIllIllIIIIIllI().getId())) {
            this.IlIlIlIlIlllllllllIl.getProperties().clear();
            this.IlIlIlIlIlllllllllIl.getProperties().putAll((Multimap)Minecraft.getMinecraft().IIllllIIIlIIIIIIllIl());
            hashMap.putAll(this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.getTextures(this.IlIlIlIlIlllllllllIl, false));
        }
        Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new IIIIIllIIIIlIIIIllIl(this, hashMap, this.IlIIIlIlIIIllIlIlIIl));
    }
}
