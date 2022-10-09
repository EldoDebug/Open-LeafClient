package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;

public class IlIlIIIIIIlllIlIllIl extends IlIllIlIlIIIlIlIlIII
{
    private final String IlIlIlIlIlllllllllIl;
    
    public IlIlIIIIIIlllIlIllIl(final String ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public IlIlIIIIIIlllIlIllIl IlIlIlIlIlllllllllIl() {
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(this.IlIlIlIlIlllllllllIl);
        ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl().lIlIlIIIllIIllIIIllI());
        final Iterator<llIIIIIIlIllIIlIIIll> iterator = this.IllIIlllIIIIlllIIlIl().iterator();
        while (iterator.hasNext()) {
            ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(iterator.next().IlIlIIIllIllIIIIIllI());
        }
        return ilIlIIIIIIlllIlIllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof IlIlIIIIIIlllIlIllIl && this.IlIlIlIlIlllllllllIl.equals(((IlIlIIIIIIlllIlIllIl)o).llllIIIIlIIIlIlllIll()) && super.equals(o));
    }
    
    @Override
    public String toString() {
        return "TextComponent{text='" + this.IlIlIlIlIlllllllllIl + '\'' + ", siblings=" + this.llllIIIIlIIIlIlllIll + ", style=" + this.llllIIIlIlllIlIIIIIl() + '}';
    }
}
