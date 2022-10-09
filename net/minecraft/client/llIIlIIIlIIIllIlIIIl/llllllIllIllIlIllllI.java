package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import com.google.common.cache.*;
import com.mojang.authlib.*;
import java.util.*;
import net.minecraft.client.*;

class llllllIllIllIlIllllI extends CacheLoader
{
    final /* synthetic */ IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    
    llllllIllIllIlIllllI(final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public Map llllIIIIlIIIlIlllIll(final GameProfile gameProfile) {
        return Minecraft.getMinecraft().lIlIlIlllIIlIlIlllIl().getTextures(gameProfile, false);
    }
}
