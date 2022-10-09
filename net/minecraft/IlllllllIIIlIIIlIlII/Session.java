package net.minecraft.IlllllllIIIlIIIlIlII;

import com.mojang.authlib.*;
import com.mojang.util.*;
import java.util.*;

public class Session
{
    private final String llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private final String llIllIIIIIllIlIIIIlI;
    private final IlIllIIllIIlIIIIlIIl IlIIIlIlIIIllIlIlIIl;
    
    public Session(final String llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final String llIllIIIIIllIlIIIIlI, final String s) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = IlIllIIllIIlIIIIlIIl.llllIIIIlIIIlIlllIll(s);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return "token:" + this.llIllIIIIIllIlIIIIlI + ":" + this.IlIlIlIlIlllllllllIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public GameProfile IlIlIIIllIllIIIIIllI() {
        try {
            return new GameProfile(UUIDTypeAdapter.fromString(this.IlIlIlIlIlllllllllIl()), this.llIllIIIIIllIlIIIIlI());
        }
        catch (IllegalArgumentException ex) {
            return new GameProfile((UUID)null, this.llIllIIIIIllIlIIIIlI());
        }
    }
    
    public IlIllIIllIIlIIIIlIIl IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
