package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lllIIIIlllllIlIIllIl extends llllIIIIlIIIlIlllIll
{
    protected lllIIIIlllllIlIIllIl(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl);
        this.IlIlIlIlIlllllllllIl("knockback");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 5 + 20 * (n - 1);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return super.IlIlIlIlIlllllllllIl(n) + 50;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 2;
    }
}
