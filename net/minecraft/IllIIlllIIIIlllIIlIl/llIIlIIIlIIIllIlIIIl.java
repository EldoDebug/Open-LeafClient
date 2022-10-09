package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIIlIIIlIIIllIlIIIl extends llllIIIIlIIIlIlllIll
{
    protected llIIlIIIlIIIllIlIIIl(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl);
        this.IlIlIlIlIlllllllllIl("fire");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 10 + 20 * (n - 1);
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
