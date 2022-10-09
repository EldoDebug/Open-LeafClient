package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

class lllIIIIlllllIlIIllIl extends IIIIIllIIIIlIIIIllIl
{
    final /* synthetic */ IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl;
    
    lllIIIIlllllIlIIllIl(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n, final int n2, final int n3, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        super(llIIIlIlIllIIlIlIlII, n, n2, n3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl) && this.IllIIlllIIIIlllIIlIl.aP() && net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl.aP();
    }
}
