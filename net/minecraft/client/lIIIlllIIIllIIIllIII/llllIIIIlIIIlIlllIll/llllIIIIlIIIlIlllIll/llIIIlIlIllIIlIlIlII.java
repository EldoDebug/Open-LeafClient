package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import java.util.*;

public class llIIIlIlIllIIlIlIlII
{
    private final String llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    
    public llIIIlIlIllIIlIlIlII(final String llllIIIIlIIIlIlllIll, final List ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public List llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof llIIIlIlIllIIlIlIlII)) {
            return false;
        }
        final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII = (llIIIlIlIllIIlIlIlII)o;
        return this.llllIIIIlIIIlIlllIll.equals(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll) && this.IlIlIlIlIlllllllllIl.equals(llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public int hashCode() {
        return 31 * this.llllIIIIlIIIlIlllIll.hashCode() + this.IlIlIlIlIlllllllllIl.hashCode();
    }
}
