package net.minecraft.IlIlIlIlIlllllllllIl;

import com.google.common.base.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IIlllIIlllIIIlIlllII implements Predicate
{
    private final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ int IlIlIlIlIlllllllllIl;
    private final /* synthetic */ int llIllIIIIIllIlIIIIlI;
    private final /* synthetic */ int IlIIIlIlIIIllIlIlIIl;
    private final /* synthetic */ int IlIlIIIllIllIIIIIllI;
    
    IIlllIIlllIIIlIlllII(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final int n = (int)llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll);
        return (this.IlIlIlIlIlllllllllIl < 0 || n >= this.llIllIIIIIllIlIIIIlI) && (this.IlIIIlIlIIIllIlIlIIl < 0 || n <= this.IlIlIIIllIllIIIIIllI);
    }
}
