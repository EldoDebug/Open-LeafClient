package net.minecraft.lIlIlIIIllIIllIIIllI;

import com.google.common.collect.*;
import java.util.*;

class IlIIIlIlIIIllIlIlIIl extends llIllIIIIIllIlIIIIlI
{
    protected List IlIlIlIlIlllllllllIl;
    
    public IlIIIlIlIIIllIlIlIIl(final String llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : this.IlIlIlIlIlllllllllIl) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        }
        return iiiIlllIIIIIIlIIIlll;
    }
}
