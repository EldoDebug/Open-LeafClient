package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;

public class IlIlIllllllllIIIIlII
{
    private final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl;
    private final boolean llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    
    public IlIlIllllllllIIIIlII(final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll, final lIIIIlIIIIIlllIllIII ilIlIlIlIlllllllllIl, final boolean llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IlIlIllllllllIIIIlII)) {
            return false;
        }
        final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = (IlIlIllllllllIIIIlII)o;
        return this.llllIIIIlIIIlIlllIll.equals(ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll) && this.IlIlIlIlIlllllllllIl == ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == ilIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * this.llllIIIIlIIIlIlllIll.hashCode() + ((this.IlIlIlIlIlllllllllIl != null) ? this.IlIlIlIlIlllllllllIl.hashCode() : 0)) + (this.llIllIIIIIllIlIIIIlI ? 1 : 0);
    }
}
