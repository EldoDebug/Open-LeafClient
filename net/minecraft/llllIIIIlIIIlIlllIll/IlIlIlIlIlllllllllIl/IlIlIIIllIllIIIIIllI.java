package net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;

import com.google.common.base.*;

public abstract class IlIlIIIllIllIIIIIllI implements llllIIIIlIIIlIlllIll
{
    private final Class llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    
    protected IlIlIIIllIllIIIIIllI(final String ilIlIlIlIlllllllllIl, final Class llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public Class llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("name", (Object)this.IlIlIlIlIlllllllllIl).add("clazz", (Object)this.llllIIIIlIIIlIlllIll).add("values", (Object)this.IlIlIlIlIlllllllllIl()).toString();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = (IlIlIIIllIllIIIIIllI)o;
            return this.llllIIIIlIIIlIlllIll.equals(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll) && this.IlIlIlIlIlllllllllIl.equals(ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.llllIIIIlIIIlIlllIll.hashCode() + this.IlIlIlIlIlllllllllIl.hashCode();
    }
}
