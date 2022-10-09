package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class IlIlIIIlIIlIlIIlllIl extends llllIIIIlIIIlIlllIll
{
    private boolean IIIIIIIIIlllIllIlIlI;
    
    protected IlIlIIIlIIlIlIIlllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        this(ilIlIlIlIlllllllllIl, b, ilIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII());
    }
    
    protected IlIlIIIlIIlIlIIlllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean iiiiiiiiIlllIllIlIlI, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        this.IIIIIIIIIlllIllIlIlI = iiiiiiiiIlllIllIlIlI;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        if (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII || this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK) {
            if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI())) != ilIlIlIlIlllllllllIl2) {
                return true;
            }
            if (llIllIIIIIllIlIIIIlI == this) {
                return false;
            }
        }
        return (this.IIIIIIIIIlllIllIlIlI || llIllIIIIIllIlIIIIlI != this) && super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
    }
}
