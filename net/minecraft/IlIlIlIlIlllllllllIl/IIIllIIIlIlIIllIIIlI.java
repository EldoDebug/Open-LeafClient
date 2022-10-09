package net.minecraft.IlIlIlIlIlllllllllIl;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IIIllIIIlIlIIllIIIlI implements Predicate
{
    private final /* synthetic */ String llllIIIIlIIIlIlllIll;
    private final /* synthetic */ boolean IlIlIlIlIlllllllllIl;
    
    IIIllIIIlIlIIllIIIlI(final String llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return llIllIIIIIllIlIIIIlI.s_().equals(this.llllIIIIlIIIlIlllIll) ^ this.IlIlIlIlIlllllllllIl;
    }
}
