package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIllIIllIIIlIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    public IIllIIllIIIlIlIIIIlI(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl);
        this.IlIlIlIlIlllllllllIl("oxygen");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 10 * n;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl(n) + 30;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
}
