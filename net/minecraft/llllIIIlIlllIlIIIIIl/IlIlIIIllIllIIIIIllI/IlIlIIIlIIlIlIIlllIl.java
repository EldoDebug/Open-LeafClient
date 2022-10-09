package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IlIlIIIlIIlIlIIlllIl implements Predicate
{
    private lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    
    public IlIlIIIlIIlIlIIlllIl(final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return (lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll || lllIIIIlllllIlIIllIl instanceof IlllllllIIIlIIIlIlII) && lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll) > 9.0;
    }
}
