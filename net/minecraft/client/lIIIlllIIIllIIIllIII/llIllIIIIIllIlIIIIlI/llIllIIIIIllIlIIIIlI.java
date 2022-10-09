package net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;

public class llIllIIIIIllIlIIIIlI implements IlIIIlIlIIIllIlIlIIl
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    
    public llIllIIIIIllIlIIIIlI() {
        this(net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
    }
    
    public llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n - this.IlIlIlIlIlllllllllIl, n2 - this.llIllIIIIIllIlIIIIlI, n3 - this.IlIIIlIlIIIllIlIlIIl, n4 - this.IlIlIlIlIlllllllllIl, n5 - this.llIllIIIIIllIlIIIIlI, n6 - this.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n - this.IlIlIlIlIlllllllllIl, n2 - this.llIllIIIIIllIlIIIIlI, n3 - this.IlIIIlIlIIIllIlIlIIl, n4 - this.IlIlIlIlIlllllllllIl, n5 - this.llIllIIIIIllIlIIIIlI, n6 - this.IlIIIlIlIIIllIlIlIIl);
    }
}
