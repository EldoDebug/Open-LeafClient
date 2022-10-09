package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum llIllIIIIIllIlIIIIlI
{
    llllIIIIlIIIlIlllIll("COMMON", 0, IlllIIIIlIIIlIlIlIIl.IlIllIlIlIIIlIlIlIII, "Common"), 
    IlIlIlIlIlllllllllIl("UNCOMMON", 1, IlllIIIIlIIIlIlIlIIl.llllIIllllIlIlIIIIll, "Uncommon"), 
    llIllIIIIIllIlIIIIlI("RARE", 2, IlllIIIIlIIIlIlIlIIl.lIlIlIIIllIIllIIIllI, "Rare"), 
    IlIIIlIlIIIllIlIlIIl("EPIC", 3, IlllIIIIlIIIlIlIlIIl.IIIIlllIIIIIIlIIIlll, "Epic");
    
    public final IlllIIIIlIIIlIlIlIIl IlIlIIIllIllIIIIIllI;
    public final String IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new llIllIIIIIllIlIIIIlI[] { llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl };
    }
    
    private llIllIIIIIllIlIIIIlI(final String s, final int n, final IlllIIIIlIIIlIlIlIIl ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
