package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlllIlIIllIlIlIlIIl
{
    private final lIllllllIIllIlIlIlII llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final float llIllIIIIIllIlIIIIlI;
    private final float IlIIIlIlIIIllIlIlIIl;
    private final String IlIlIIIllIllIIIIIllI;
    private final float IllIIlllIIIIlllIIlIl;
    
    public IIlllIlIIllIlIlIlIIl(final lIllllllIIllIlIlIlII llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final float ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI, final String ilIlIIIllIllIIIIIllI, final float illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public lIllllllIIllIlIlIlII llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() instanceof lllIIIIlllllIlIIllIl;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public llIIIIIIlIllIIlIIIll IlIlIIIllIllIIIIIllI() {
        return (this.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl() == null) ? null : this.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl().v_();
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return (this.llllIIIIlIIIlIlllIll == lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl) ? Float.MAX_VALUE : this.IllIIlllIIIIlllIIlIl;
    }
}
