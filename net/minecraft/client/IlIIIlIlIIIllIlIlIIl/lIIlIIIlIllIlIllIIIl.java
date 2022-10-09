package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIlIIIlIllIlIllIIIl
{
    public e llllIIIIlIIIlIlllIll;
    public float IlIlIlIlIlllllllllIl;
    public float llIllIIIIIllIlIIIIlI;
    
    public lIIlIIIlIllIlIllIIIl(final float n, final float n2, final float n3, final float n4, final float n5) {
        this(new e(n, n2, n3), n4, n5);
    }
    
    public lIIlIIIlIllIlIllIIIl llllIIIIlIIIlIlllIll(final float n, final float n2) {
        return new lIIlIIIlIllIlIllIIIl(this, n, n2);
    }
    
    public lIIlIIIlIllIlIllIIIl(final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public lIIlIIIlIllIlIllIIIl(final e llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
}
