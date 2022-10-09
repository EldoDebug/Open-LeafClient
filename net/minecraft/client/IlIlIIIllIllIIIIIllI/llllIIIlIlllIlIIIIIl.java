package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum llllIIIlIlllIlIIIIIl
{
    llllIIIIlIIIlIlllIll("ENABLED", 0, "enabled"), 
    IlIlIlIlIlllllllllIl("DISABLED", 1, "disabled"), 
    llIllIIIIIllIlIIIIlI("PROMPT", 2, "prompt");
    
    private final llIIIIIIlIllIIlIIIll IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new llllIIIlIlllIlIIIIIl[] { llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI };
    }
    
    private llllIIIlIlllIlIIIIIl(final String s, final int n, final String s2) {
        this.IlIIIlIlIIIllIlIlIIl = new IIllIIllIIIlIlIIIIlI("addServer.resourcePack." + s2, new Object[0]);
    }
    
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
