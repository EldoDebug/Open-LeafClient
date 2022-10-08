package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIIIIlllIlIllIl implements Comparable
{
    private static long IlIIIlIlIIIllIlIlIIl;
    private final llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI;
    public final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    public long IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    private long IllIIlllIIIIlllIIlIl;
    
    public IlIlIIIIIIlllIlIllIl(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIIIllIllIIIIIllI) {
        this.IllIIlllIIIIlllIIlIl = IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl++;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof IlIlIIIIIIlllIlIllIl)) {
            return false;
        }
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = (IlIlIIIIIIlllIlIllIl)o;
        return this.llllIIIIlIIIlIlllIll.equals(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll) && net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, ilIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public int hashCode() {
        return this.llllIIIIlIIIlIlllIll.hashCode();
    }
    
    public IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll(final long ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        return this;
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        return (this.IlIlIlIlIlllllllllIl < ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl) ? -1 : ((this.IlIlIlIlIlllllllllIl > ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl) ? 1 : ((this.llIllIIIIIllIlIIIIlI != ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI) ? (this.llIllIIIIIllIlIIIIlI - ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI) : ((this.IllIIlllIIIIlllIIlIl < ilIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl) ? -1 : ((this.IllIIlllIIIIlllIIlIl > ilIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl) ? 1 : 0))));
    }
    
    @Override
    public String toString() {
        return String.valueOf(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI)) + ": " + this.llllIIIIlIIIlIlllIll + ", " + this.IlIlIlIlIlllllllllIl + ", " + this.llIllIIIIIllIlIIIIlI + ", " + this.IllIIlllIIIIlllIIlIl;
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
