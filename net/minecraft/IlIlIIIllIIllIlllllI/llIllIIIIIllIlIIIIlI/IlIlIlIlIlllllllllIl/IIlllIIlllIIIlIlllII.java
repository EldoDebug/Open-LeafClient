package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.mojang.authlib.*;
import com.google.common.base.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlllIIlllIIIlIlllII
{
    private final int IlIlIlIlIlllllllllIl;
    private final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI;
    private final GameProfile IlIIIlIlIIIllIlIlIIl;
    private final llIIIIIIlIllIIlIIIll IlIlIIIllIllIIIIIllI;
    final /* synthetic */ llIIIllIlIllIllIIIIl llllIIIIlIIIlIlllIll;
    
    public IIlllIIlllIIIlIlllII(final llIIIllIlIllIllIIIIl llllIIIIlIIIlIlllIll, final GameProfile ilIIIlIlIIIllIlIlIIl, final int ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI, final llIIIIIIlIllIIlIIIll ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public GameProfile llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public llIIIIIIlIllIIlIIIll IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("latency", this.IlIlIlIlIlllllllllIl).add("gameMode", (Object)this.llIllIIIIIllIlIIIIlI).add("profile", (Object)this.IlIIIlIlIIIllIlIlIIl).add("displayName", (Object)((this.IlIlIIIllIllIIIIIllI == null) ? null : lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI))).toString();
    }
}
