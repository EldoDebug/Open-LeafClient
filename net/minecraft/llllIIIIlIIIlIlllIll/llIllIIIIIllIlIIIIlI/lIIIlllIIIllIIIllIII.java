package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;

class lIIIlllIIIllIIIllIII implements Predicate
{
    private final /* synthetic */ Predicate llllIIIIlIIIlIlllIll;
    
    lIIIlllIIIllIIIllIII(final Predicate llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        return liiiIlIIIIIlllIllIII != null && this.llllIIIIlIIIlIlllIll.apply((Object)liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
    }
}
