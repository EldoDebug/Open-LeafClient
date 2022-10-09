package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIlIlIlllllllllIl extends llllIIIIlIIIlIlllIll
{
    public IlIlIlIlIlllllllllIl(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.llIllIlIIIIllIlIIllI);
        this.IlIlIlIlIlllllllllIl("arrowDamage");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 1 + (n - 1) * 10;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl(n) + 15;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 5;
    }
}
