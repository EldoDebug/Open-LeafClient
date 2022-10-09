package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import com.google.common.base.*;

public class lIIIIlIIIIIlllIllIII
{
    private final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private final boolean llIllIIIIIllIlIIIIlI;
    private llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl;
    private IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    
    public lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll() {
        if (this.IlIIIlIlIIIllIlIlIIl == null && (this.llIllIIIIIllIlIIIIlI || this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(this.IlIlIlIlIlllllllllIl))) {
            this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        }
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl() {
        if (this.IlIlIIIllIllIIIIIllI == null && !this.IllIIlllIIIIlllIIlIl) {
            this.IlIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            this.IllIIlllIIIIlllIIlIl = true;
        }
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public static Predicate llllIIIIlIIIlIlllIll(final Predicate predicate) {
        return (Predicate)new lIIIlllIIIllIIIllIII(predicate);
    }
}
