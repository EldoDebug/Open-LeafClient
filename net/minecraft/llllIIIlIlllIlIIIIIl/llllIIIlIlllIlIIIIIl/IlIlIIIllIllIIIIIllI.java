package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum IlIlIIIllIllIIIIIllI
{
    llllIIIIlIIIlIlllIll("CAPE", 0, 0, "cape"), 
    IlIlIlIlIlllllllllIl("JACKET", 1, 1, "jacket"), 
    llIllIIIIIllIlIIIIlI("LEFT_SLEEVE", 2, 2, "left_sleeve"), 
    IlIIIlIlIIIllIlIlIIl("RIGHT_SLEEVE", 3, 3, "right_sleeve"), 
    IlIlIIIllIllIIIIIllI("LEFT_PANTS_LEG", 4, 4, "left_pants_leg"), 
    IllIIlllIIIIlllIIlIl("RIGHT_PANTS_LEG", 5, 5, "right_pants_leg"), 
    llllIIIlIlllIlIIIIIl("HAT", 6, 6, "hat");
    
    private final int lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    private final String llIIlIIIlIIIllIlIIIl;
    private final llIIIIIIlIllIIlIIIll llIllIlIIIIllIlIIllI;
    
    static {
        lIlIlIIIllIIllIIIllI = new IlIlIIIllIllIIIIIllI[] { IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl };
    }
    
    private IlIlIIIllIllIIIIIllI(final String s, final int n, final int liiiIlIIIIIlllIllIII, final String llIIlIIIlIIIllIlIIIl) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = 1 << liiiIlIIIIIlllIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = new IIllIIllIIIlIlIIIIlI("options.modelPart." + llIIlIIIlIIIllIlIIIl, new Object[0]);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public llIIIIIIlIllIIlIIIll IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIlIIIIllIlIIllI;
    }
}
