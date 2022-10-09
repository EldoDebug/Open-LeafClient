package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlllIIlllIIIlIlllII
{
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public IIlllIIlllIIIlIlllII(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof IIlllIIlllIIIlIlllII)) {
            return false;
        }
        final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII = (IIlllIIlllIIIlIlllII)o;
        return this.llllIIIIlIIIlIlllIll.equals(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll) && this.llIllIIIIIllIlIIIIlI == illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl && this.IlIlIlIlIlllllllllIl == illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String toString() {
        return "TE(" + this.llllIIIIlIIIlIlllIll + ")," + this.llIllIIIIIllIlIIIIlI + "," + this.IlIIIlIlIIIllIlIlIIl + "," + this.IlIlIlIlIlllllllllIl;
    }
}
