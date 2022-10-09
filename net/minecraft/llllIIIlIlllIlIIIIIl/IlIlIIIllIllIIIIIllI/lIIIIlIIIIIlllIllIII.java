package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

class lIIIIlIIIIIlllIllIII extends IlIlIIIllIllIIIIIllI
{
    private net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll;
    
    public lIIIIlIIIIIlllIllIII(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing") && this.llllIIIIlIIIlIlllIll.ao().llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && this.llllIIIIlIIIlIlllIll.B().nextInt(2000) == 0;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final Random b = this.llllIIIIlIIIlIlllIll.B();
        final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII;
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - 1.0 + b.nextDouble() * 2.0), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + b.nextDouble() * 2.0), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - 1.0 + b.nextDouble() * 2.0));
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll.ao().llIllIIIIIllIlIIIIlI(), illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI(), illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI())) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll.ao(), 3);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3) {
        return llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) && llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl() == IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll3.IllIIlllIIIIlllIIlIl() != IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl();
    }
}
