package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIlIIIIllIlIIllI extends llllIIIIlIIIlIlllIll
{
    protected llIllIlIIIIllIlIIllI(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2, final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        super(n, lIllllIllIllIIllllll, n2, ilIlIllllllllIIIIlII);
        this.IlIlIlIlIlllllllllIl("fishingSpeed");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 15 + (n - 1) * 9;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return super.IlIlIlIlIlllllllllIl(n) + 50;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
}
