package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIllIIllIIlIIIIlIIl extends llllIIIIlIIIlIlllIll
{
    protected boolean IIlIlIlIIlIllIIIIIIl;
    
    protected IlIllIIllIIlIIIIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean iIlIlIlIIlIllIIIIIIl) {
        super(ilIlIlIlIlllllllllIl);
        this.IIlIlIlIIlIllIIIIIIl = iIlIlIlIIlIllIIIIIIl;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (this.IIlIlIlIIlIllIIIIIIl || lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() != this) && super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
    }
}
