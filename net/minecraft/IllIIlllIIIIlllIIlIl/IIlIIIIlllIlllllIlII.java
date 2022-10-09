package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlIIIIlllIlllllIlII extends llllIIIIlIIIlIlllIll
{
    public IIlIIIIlllIlllllIlII(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl("waterWalker");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return n * 10;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl(n) + 15;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
}
