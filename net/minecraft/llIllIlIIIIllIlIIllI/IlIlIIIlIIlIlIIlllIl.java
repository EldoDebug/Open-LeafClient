package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.lIIIlllIIIllIIIllIII.*;

public enum IlIlIIIlIIlIlIIlllIl
{
    llllIIIIlIIIlIlllIll("WOOD", 0, 0, 59, 2.0f, 0.0f, 15), 
    IlIlIlIlIlllllllllIl("STONE", 1, 1, 131, 4.0f, 1.0f, 5), 
    llIllIIIIIllIlIIIIlI("IRON", 2, 2, 250, 6.0f, 2.0f, 14), 
    IlIIIlIlIIIllIlIlIIl("EMERALD", 3, 3, 1561, 8.0f, 3.0f, 10), 
    IlIlIIIllIllIIIIIllI("GOLD", 4, 0, 32, 12.0f, 0.0f, 22);
    
    private final int IllIIlllIIIIlllIIlIl;
    private final int llllIIIlIlllIlIIIIIl;
    private final float lIIIIlIIIIIlllIllIII;
    private final float lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIlIIIIllIlIIllI = new IlIlIIIlIIlIlIIlllIl[] { IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll, IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl, IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI, IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl, IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI };
    }
    
    private IlIlIIIlIIlIlIIlllIl(final String s, final int n, final int illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl, final float liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public float llIllIIIIIllIlIIIIlI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public IlIIIlIlIIIllIlIlIIl IllIIlllIIIIlllIIlIl() {
        return (this == IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll) ? net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl) : ((this == IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl) ? net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI) : ((this == IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI) ? IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI : ((this == IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI) ? IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl : ((this == IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl) ? IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII : null))));
    }
}
