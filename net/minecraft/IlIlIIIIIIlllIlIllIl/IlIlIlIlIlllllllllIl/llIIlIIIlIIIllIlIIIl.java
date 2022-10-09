package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import com.mojang.authlib.*;

class llIIlIIIlIIIllIlIIIl implements ProfileLookupCallback
{
    private final /* synthetic */ GameProfile[] llllIIIIlIIIlIlllIll;
    
    llIIlIIIlIIIllIlIIIl(final GameProfile[] llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void onProfileLookupSucceeded(final GameProfile gameProfile) {
        this.llllIIIIlIIIlIlllIll[0] = gameProfile;
    }
    
    public void onProfileLookupFailed(final GameProfile gameProfile, final Exception ex) {
        this.llllIIIIlIIIlIlllIll[0] = null;
    }
}
