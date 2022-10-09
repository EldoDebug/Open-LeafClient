package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.optifine.expr.*;

public class IlIlIlIlIlllllllllIl implements llIllIlIIIIllIlIIllI
{
    private IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll;
    
    public IlIlIlIlIlllllllllIl(final IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return IlIlIIIIIIlllIlIllIl.lIIIIlIIIIIlllIllIII(this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().append(this.llllIIIIlIIIlIlllIll).toString();
    }
}
