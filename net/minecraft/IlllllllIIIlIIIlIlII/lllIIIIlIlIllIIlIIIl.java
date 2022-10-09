package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lllIIIIlIlIllIIlIIIl
{
    protected final float llllIIIIlIIIlIlllIll;
    protected final float IlIlIlIlIlllllllllIl;
    protected final float llIllIIIIIllIlIIIIlI;
    
    public lllIIIIlIlIllIIlIIIl(final float llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public lllIIIIlIlIllIIlIIIl(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll = ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(0);
        this.IlIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(1);
        this.llIllIIIIIllIlIIIIlI = ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(2);
    }
    
    public IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll() {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this.llllIIIIlIIIlIlllIll));
        ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this.IlIlIlIlIlllllllllIl));
        ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this.llIllIIIIIllIlIIIIlI));
        return ilIlIIIlIIlIlIIlllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = (lllIIIIlIlIllIIlIIIl)o;
        return this.llllIIIIlIIIlIlllIll == lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll && this.IlIlIlIlIlllllllllIl == lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == lllIIIIlIlIllIIlIIIl.llIllIIIIIllIlIIIIlI;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public float llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
