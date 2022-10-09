package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import java.util.*;
import com.mojang.authlib.*;

class llllIIllllIlIlIIIIll implements ProfileLookupCallback
{
    private final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private final /* synthetic */ List IlIlIlIlIlllllllllIl;
    
    llllIIllllIlIlIIIIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void onProfileLookupSucceeded(final GameProfile gameProfile) {
        this.llllIIIIlIIIlIlllIll.lIIIIIlIlIIIlIIIIlIl().llllIIIIlIIIlIlllIll(gameProfile);
        this.IlIlIlIlIlllllllllIl.add(gameProfile);
    }
    
    public void onProfileLookupFailed(final GameProfile gameProfile, final Exception ex) {
        IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.warn("Could not lookup user whitelist entry for " + gameProfile.getName(), (Throwable)ex);
    }
}
