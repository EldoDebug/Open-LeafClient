package net.minecraft.IlIlIIIllIIllIlllllI;

import com.mojang.authlib.*;

public class lllIllIIIllllllIllll
{
    private final int llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private GameProfile[] llIllIIIIIllIlIIIIlI;
    
    public lllIllIIIllllllIllll(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public GameProfile[] llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final GameProfile[] llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
}
