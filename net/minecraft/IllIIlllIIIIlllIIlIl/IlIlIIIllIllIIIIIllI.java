package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIllIllIIIIIllI extends llllIIIIlIIIlIlllIll
{
    public IlIlIIIllIllIIIIIllI(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.llIllIlIIIIllIlIIllI);
        this.IlIlIlIlIlllllllllIl("arrowKnockback");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 12 + (n - 1) * 20;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl(n) + 25;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 2;
    }
}
