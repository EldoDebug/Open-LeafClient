package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

enum IlIllIlIlIIIlIlIlIII
{
    llllIIIIlIIIlIlllIll("UP", 0, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, 0, -1), 
    IlIlIlIlIlllllllllIl("DOWN", 1, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, 0, 1), 
    llIllIIIIIllIlIIIIlI("LEFT", 2, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, -1, 0), 
    IlIIIlIlIIIllIlIlIIl("RIGHT", 3, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, 1, 0);
    
    private final lllIllIIIllllllIllll IlIlIIIllIllIIIIIllI;
    private final int IllIIlllIIIIlllIIlIl;
    private final int llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new IlIllIlIlIIIlIlIlIII[] { IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll, IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl, IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI, IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl };
    }
    
    private IlIllIlIlIIIlIlIlIII(final String s, final int n, final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public lllIllIIIllllllIllll llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl() {
        return this == IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl || this == IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll;
    }
}
