package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

public class IlIllIlIlIIIlIlIlIII implements Comparable
{
    private final String llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private final String llIllIIIIIllIlIIIIlI;
    private final boolean IlIIIlIlIIIllIlIlIIl;
    
    public IlIllIlIlIIIlIlIlIII(final String llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final String llIllIIIIIllIlIIIIlI, final boolean ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s)", this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof IlIllIlIlIIIlIlIlIII && this.llllIIIIlIIIlIlllIll.equals(((IlIllIlIlIIIlIlIlIII)o).llllIIIIlIIIlIlllIll));
    }
    
    @Override
    public int hashCode() {
        return this.llllIIIIlIIIlIlllIll.hashCode();
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        return this.llllIIIIlIIIlIlllIll.compareTo(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll);
    }
}
