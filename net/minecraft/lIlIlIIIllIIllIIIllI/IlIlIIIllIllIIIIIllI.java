package net.minecraft.lIlIlIIIllIIllIIIllI;

import com.google.common.collect.*;
import java.util.*;

class IlIlIIIllIllIIIIIllI extends llIllIIIIIllIlIIIIlI
{
    protected List IlIlIlIlIlllllllllIl;
    
    public IlIlIIIllIllIIIIIllI(final String llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll() {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        final Iterator<llIllIIIIIllIlIIIIlI> iterator = this.IlIlIlIlIlllllllllIl.iterator();
        while (iterator.hasNext()) {
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iterator.next().llllIIIIlIIIlIlllIll());
        }
        return ilIlIIIlIIlIlIIlllIl;
    }
}
