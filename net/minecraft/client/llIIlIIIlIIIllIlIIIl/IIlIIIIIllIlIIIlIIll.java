package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import java.io.*;
import java.util.concurrent.*;
import com.google.common.cache.*;
import com.mojang.authlib.minecraft.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import com.mojang.authlib.*;
import java.util.*;

public class IIlIIIIIllIlIIIlIIll
{
    private static final ExecutorService llllIIIIlIIIlIlllIll;
    private final IIlllIIlIllIllIlIIll IlIlIlIlIlllllllllIl;
    private final File llIllIIIIIllIlIIIIlI;
    private final MinecraftSessionService IlIIIlIlIIIllIlIlIIl;
    private final LoadingCache IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    }
    
    public IIlIIIIIllIlIIIlIIll(final IIlllIIlIllIllIlIIll ilIlIlIlIlllllllllIl, final File llIllIIIIIllIlIIIIlI, final MinecraftSessionService ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader)new llllllIllIllIlIllllI(this));
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final MinecraftProfileTexture minecraftProfileTexture, final MinecraftProfileTexture$Type minecraftProfileTexture$Type) {
        return this.llllIIIIlIIIlIlllIll(minecraftProfileTexture, minecraftProfileTexture$Type, null);
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final MinecraftProfileTexture minecraftProfileTexture, final MinecraftProfileTexture$Type minecraftProfileTexture$Type, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll("skins/" + minecraftProfileTexture.getHash());
        if (this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll) != null) {
            if (iiiiiiiiIlllIllIlIlI != null) {
                iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll(minecraftProfileTexture$Type, lIllllIllIllIIllllll, minecraftProfileTexture);
            }
        }
        else {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, new IlIIlllllIIllIIlllll(new File(new File(this.llIllIIIIIllIlIIIIlI, (minecraftProfileTexture.getHash().length() > 2) ? minecraftProfileTexture.getHash().substring(0, 2) : "xx"), minecraftProfileTexture.getHash()), minecraftProfileTexture.getUrl(), net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), new IIIllllllIllIIIlllIl(this, (minecraftProfileTexture$Type == MinecraftProfileTexture$Type.SKIN) ? new IllIlIIllIllIIlIllII() : null, iiiiiiiiIlllIllIlIlI, minecraftProfileTexture$Type, lIllllIllIllIIllllll, minecraftProfileTexture)));
        }
        return lIllllIllIllIIllllll;
    }
    
    public void llllIIIIlIIIlIlllIll(final GameProfile gameProfile, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final boolean b) {
        IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll.submit(new IlIIIlIIIllllIlIlIlI(this, gameProfile, b, iiiiiiiiIlllIllIlIlI));
    }
    
    public Map llllIIIIlIIIlIlllIll(final GameProfile gameProfile) {
        return (Map)this.IlIlIIIllIllIIIIIllI.getUnchecked((Object)gameProfile);
    }
}
