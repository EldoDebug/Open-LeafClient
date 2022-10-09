package net.minecraft.IlIlIlIlIlllllllllIl;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IlIIlllllIIllIIlllll implements Predicate
{
    private final /* synthetic */ int llllIIIIlIIIlIlllIll;
    private final /* synthetic */ int IlIlIlIlIlllllllllIl;
    
    IlIIlllllIIllIIlllll(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final int llllIIIIlIIIlIlllIll = lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll((int)Math.floor(llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll));
        return (this.llllIIIIlIIIlIlllIll > this.IlIlIlIlIlllllllllIl) ? (llllIIIIlIIIlIlllIll >= this.llllIIIIlIIIlIlllIll || llllIIIIlIIIlIlllIll <= this.IlIlIlIlIlllllllllIl) : (llllIIIIlIIIlIlllIll >= this.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll <= this.IlIlIlIlIlllllllllIl);
    }
}
