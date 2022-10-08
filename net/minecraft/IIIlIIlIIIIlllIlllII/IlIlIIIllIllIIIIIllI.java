package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIllIllIIIIIllI
{
    private final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    private final float IlIlIlIlIlllllllllIl;
    
    public IlIlIIIllIllIIIIIllI(final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll, final long n, final long n2, final float n3) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2, n3);
    }
    
    public float llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return (this.IlIlIlIlIlllllllllIl < 2.0f) ? 0.0f : ((this.IlIlIlIlIlllllllllIl > 4.0f) ? 1.0f : ((this.IlIlIlIlIlllllllllIl - 2.0f) / 2.0f));
    }
    
    private float llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final long n, final long n2, final float n3) {
        if (illIIlllIIIIlllIIlIl == IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
            return 0.0f;
        }
        final boolean b = illIIlllIIIIlllIIlIl == IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl;
        final float n4 = 0.75f;
        final float n5 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((n - 72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        final float n6 = n4 + n5;
        float n7 = 0.0f + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 / 3600000.0f, 0.0f, 1.0f) * (b ? 1.0f : 0.75f) + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.25f, 0.0f, n5);
        if (illIIlllIIIIlllIIlIl == IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl) {
            n7 *= 0.5f;
        }
        return illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll() * (n6 + n7);
    }
}
