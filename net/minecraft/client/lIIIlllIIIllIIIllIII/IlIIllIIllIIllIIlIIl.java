package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIIllIIllIIllIIlIIl
{
    private final lIIllIIIllllIlllIllI[] llllIIIIlIIIlIlllIll;
    
    public IlIIllIIllIIllIIlIIl() {
        (this.llllIIIIlIIIlIlllIll = new lIIllIIIllllIlllIllI[IlIIlIlIIIlIIlIlIlII.values().length])[IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll.ordinal()] = new lIIllIIIllllIlllIllI(2097152);
        this.llllIIIIlIIIlIlllIll[IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI.ordinal()] = new lIIllIIIllllIlllIllI(131072);
        this.llllIIIIlIIIlIlllIll[IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl.ordinal()] = new lIIllIIIllllIlllIllI(131072);
        this.llllIIIIlIIIlIlllIll[IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl.ordinal()] = new lIIllIIIllllIlllIllI(262144);
    }
    
    public lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        return this.llllIIIIlIIIlIlllIll[ilIIlIlIIIlIIlIlIlII.ordinal()];
    }
    
    public lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll[n];
    }
}
