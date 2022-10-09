package net.minecraft.lIIIIlIIIIIlllIllIII;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIIIIIllIlIIIIlI
{
    private final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    private final llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl;
    
    public llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll, final llIIIIIIlIllIIlIIIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl() {
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
        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = (llIllIIIIIllIlIIIIlI)o;
        if (this.llllIIIIlIIIlIlllIll != llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll) {
            return false;
        }
        if (this.IlIlIlIlIlllllllllIl != null) {
            if (!this.IlIlIlIlIlllllllllIl.equals(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl)) {
                return false;
            }
        }
        else if (llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl != null) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "HoverEvent{action=" + this.llllIIIIlIIIlIlllIll + ", value='" + this.IlIlIlIlIlllllllllIl + '\'' + '}';
    }
    
    @Override
    public int hashCode() {
        return 31 * this.llllIIIIlIIIlIlllIll.hashCode() + ((this.IlIlIlIlIlllllllllIl != null) ? this.IlIlIlIlIlllllllllIl.hashCode() : 0);
    }
}
