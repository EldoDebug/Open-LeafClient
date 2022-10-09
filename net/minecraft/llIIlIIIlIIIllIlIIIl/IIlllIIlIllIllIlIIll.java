package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

class IIlllIIlIllIllIlIIll extends IIIIIllIIIIlIIIIllIl
{
    final /* synthetic */ IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    
    IIlllIIlIllIllIlIIll(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n, final int n2, final int n3) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(llIIIlIlIllIIlIlIlII, n, n2, n3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl) && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII && !this.IlIlIlIlIlllllllllIl();
    }
}
