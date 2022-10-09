package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

public abstract class IlIlIlIlIlllllllllIl implements IlIIIlIlIIIllIlIlIIl
{
    private final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private final double llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    protected IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        if (ilIlIlIlIlllllllllIl == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public double IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final boolean ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        return this;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int hashCode() {
        return this.IlIlIlIlIlllllllllIl.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof IlIIIlIlIIIllIlIlIIl && this.IlIlIlIlIlllllllllIl.equals(((IlIIIlIlIIIllIlIlIIl)o).llllIIIIlIIIlIlllIll());
    }
}
