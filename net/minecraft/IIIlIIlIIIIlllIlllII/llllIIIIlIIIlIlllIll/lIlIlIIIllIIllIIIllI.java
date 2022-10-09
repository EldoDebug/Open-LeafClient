package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIlIlIIIllIIllIIIllI extends j
{
    public Class llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    public int IlIIIlIlIIIllIlIlIIl;
    
    public lIlIlIIIllIIllIIIllI(final Class llllIIIIlIIIlIlllIll, final int n, final int ilIlIlIlIlllllllllIl, final int ilIIIlIlIIIllIlIlIIl) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.llllIIIIlIIIlIlllIll.getSimpleName()) + "*(" + this.IlIlIlIlIlllllllllIl + "-" + this.IlIIIlIlIIIllIlIlIIl + "):" + this.llIllIIIIIllIlIIIIlI;
    }
}
