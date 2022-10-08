package net.minecraft.IIIlIIIlIlIIlllIIlll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIlIIIIllIlIIllI extends IllIIlllIIIIlllIIlIl
{
    public llIllIlIIIIllIlIIllI(final String s, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        super(s, llIIIIIIlIllIIlIIIll, ilIIIlIlIIIllIlIlIIl);
    }
    
    public llIllIlIIIIllIlIIllI(final String s, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        super(s, llIIIIIIlIllIIlIIIll);
    }
    
    @Override
    public IllIIlllIIIIlllIIlIl lIIIlllIIIllIIIllIII() {
        super.lIIIlllIIIllIIIllIII();
        IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.add(this);
        return this;
    }
}
