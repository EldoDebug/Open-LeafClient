package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.lIIIlllIIIllIIIllIII.*;

public enum IIlllIlIIllIlIlIlIIl
{
    llllIIIIlIIIlIlllIll("LEATHER", 0, "leather", 5, new int[] { 1, 3, 2, 1 }, 15), 
    IlIlIlIlIlllllllllIl("CHAIN", 1, "chainmail", 15, new int[] { 2, 5, 4, 1 }, 12), 
    llIllIIIIIllIlIIIIlI("IRON", 2, "iron", 15, new int[] { 2, 6, 5, 2 }, 9), 
    IlIIIlIlIIIllIlIlIIl("GOLD", 3, "gold", 7, new int[] { 2, 5, 3, 1 }, 25), 
    IlIlIIIllIllIIIIIllI("DIAMOND", 4, "diamond", 33, new int[] { 3, 8, 6, 3 }, 10);
    
    private final String IllIIlllIIIIlllIIlIl;
    private final int llllIIIlIlllIlIIIIIl;
    private final int[] lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    
    static {
        llIIlIIIlIIIllIlIIIl = new IIlllIlIIllIlIlIlIIl[] { IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll, IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl, IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI, IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl, IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI };
    }
    
    private IIlllIlIIllIlIlIlIIl(final String s, final int n, final String illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl, final int[] liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public int llllIIIIlIIIlIlllIll(final int n) {
        return IIIlIIlIIIIlllIlllII.llIllIlIIIIllIlIIllI[n] * this.llllIIIlIlllIlIIIIIl;
    }
    
    public int IlIlIlIlIlllllllllIl(final int n) {
        return this.lIIIIlIIIIIlllIllIII[n];
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl() {
        return (this == IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll) ? IIllIIllIIIlIlIIIIlI.lllllIlIlIlllIlllIlI : ((this == IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl) ? IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl : ((this == IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl) ? IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI : ((this == IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI) ? IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl : ((this == IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI) ? IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII : null))));
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
