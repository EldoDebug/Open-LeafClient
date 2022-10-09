package net.minecraft.IlIllIlIlIIIlIlIlIII;

public final class IlIlIIIllIllIIIIIllI implements Comparable
{
    public double llllIIIIlIIIlIlllIll;
    public double IlIlIlIlIlllllllllIl;
    public String llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIllIllIIIIIllI(final String llIllIIIIIllIlIIIIlI, final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        return (ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll < this.llllIIIIlIIIlIlllIll) ? -1 : ((ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll > this.llllIIIIlIIIlIlllIll) ? 1 : ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.compareTo(this.llIllIIIIIllIlIIIIlI));
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return (this.llIllIIIIIllIlIIIIlI.hashCode() & 0xAAAAAA) + 4473924;
    }
}
