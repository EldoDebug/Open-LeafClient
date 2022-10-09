package net.minecraft.IlIlIlIlIlllllllllIl;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class lllllIIIIIlIlIIIIIIl implements Predicate
{
    private final /* synthetic */ String llllIIIIlIIIlIlllIll;
    private final /* synthetic */ boolean IlIlIlIlIlllllllllIl;
    
    lllllIIIIIlIlIIIIIIl(final String llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this.llllIIIIlIIIlIlllIll) ^ this.IlIlIlIlIlllllllllIl;
    }
}
