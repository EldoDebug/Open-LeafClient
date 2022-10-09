package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIlIIlIIIIlllIlllII extends llllIIIIlIIIlIlllIll
{
    public IIIlIIlIIIIlllIlllII(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl);
        this.IlIlIlIlIlllllllllIl("waterWorker");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 1;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl(n) + 40;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 1;
    }
}
