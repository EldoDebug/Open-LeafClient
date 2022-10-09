package net.minecraft.lIIIIlIIIIIlllIllIII;

public class llllIIIIlIIIlIlllIll
{
    private final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    
    public llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)o;
        if (this.llllIIIIlIIIlIlllIll != llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            return false;
        }
        if (this.IlIlIlIlIlllllllllIl != null) {
            if (!this.IlIlIlIlIlllllllllIl.equals(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl)) {
                return false;
            }
        }
        else if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl != null) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "ClickEvent{action=" + this.llllIIIIlIIIlIlllIll + ", value='" + this.IlIlIlIlIlllllllllIl + '\'' + '}';
    }
    
    @Override
    public int hashCode() {
        return 31 * this.llllIIIIlIIIlIlllIll.hashCode() + ((this.IlIlIlIlIlllllllllIl != null) ? this.IlIlIlIlIlllllllllIl.hashCode() : 0);
    }
}
