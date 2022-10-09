package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;

import org.apache.logging.log4j.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final IlIlIIIllIllIIIIIllI IlIlIlIlIlllllllllIl;
    private final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IlIIIlIlIIIllIlIlIIl(final int ilIIIlIlIIIllIlIlIIl, final IlIlIIIllIllIIIIIllI ilIlIlIlIlllllllllIl, final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI, final int ilIlIIIllIllIIIIIllI) {
        if (!this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI)) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.llIllIIIIIllIlIIIIlI = IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    private final boolean llllIIIIlIIIlIlllIll(final int n, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        return n == 0 || illIIlllIIIIlllIIlIl == IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public final IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.IlIlIIIllIllIIIIIllI) + "," + this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() + "," + this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
    }
    
    public final int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() * this.IlIlIIIllIllIIIIIllI;
    }
    
    public final boolean IllIIlllIIIIlllIIlIl() {
        return this.llIllIIIIIllIlIIIIlI == IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)o;
            return this.IlIlIIIllIllIIIIIllI == ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI && this.IlIIIlIlIIIllIlIlIIl == ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl && this.IlIlIlIlIlllllllllIl == ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * this.IlIlIlIlIlllllllllIl.hashCode() + this.llIllIIIIIllIlIIIIlI.hashCode()) + this.IlIIIlIlIIIllIlIlIIl) + this.IlIlIIIllIllIIIIIllI;
    }
}
