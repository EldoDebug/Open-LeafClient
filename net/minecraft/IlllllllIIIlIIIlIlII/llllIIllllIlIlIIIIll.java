package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;

public class llllIIllllIlIlIIIIll extends IlIllIlIlIIIlIlIlIII
{
    private final String IlIlIlIlIlllllllllIl;
    
    public llllIIllllIlIlIIIIll(final String ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llllIIllllIlIlIIIIll IlIlIlIlIlllllllllIl() {
        final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = new llllIIllllIlIlIIIIll(this.IlIlIlIlIlllllllllIl);
        llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl().lIlIlIIIllIIllIIIllI());
        final Iterator<llIIIIIIlIllIIlIIIll> iterator = this.IllIIlllIIIIlllIIlIl().iterator();
        while (iterator.hasNext()) {
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(iterator.next().IlIlIIIllIllIIIIIllI());
        }
        return llllIIllllIlIlIIIIll;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof llllIIllllIlIlIIIIll && this.IlIlIlIlIlllllllllIl.equals(((llllIIllllIlIlIIIIll)o).IlIlIlIlIlllllllllIl) && super.equals(o));
    }
    
    @Override
    public String toString() {
        return "SelectorComponent{pattern='" + this.IlIlIlIlIlllllllllIl + '\'' + ", siblings=" + this.llllIIIIlIIIlIlllIll + ", style=" + this.llllIIIlIlllIlIIIIIl() + '}';
    }
}
