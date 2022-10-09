package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import com.google.common.cache.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

class llIllIIIIIllIlIIIIlI extends CacheLoader
{
    private final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final boolean IlIlIlIlIlllllllllIl;
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return new lIIIIlIIIIIlllIllIII(this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl);
    }
}
