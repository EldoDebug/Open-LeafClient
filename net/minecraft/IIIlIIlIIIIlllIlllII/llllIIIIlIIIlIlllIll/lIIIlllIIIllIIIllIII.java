package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIlllIIIllIIIllIII extends lIIIIlIIIIIlllIllIII
{
    protected lllIllIIIllllllIllll IIllllIIIlIIIIIIllIl;
    
    public lIIIlllIIIllIIIllIII() {
        this.IIllllIIIlIIIIIIllIl = new IIlIIIIIllIlIIIlIIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.L);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llllIIIIlIIIlIlllIll();
        if (this.IlIlIlIlIlllllllllIl.nextInt(5) == 0) {
            this.IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.nextInt(16) + 8, 0, this.IlIlIlIlIlllllllllIl.nextInt(16) + 8)));
        }
        if (this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() == 0 && this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl() == 0) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
            ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(0.0, 128.0, 0.0, this.IlIlIlIlIlllllllllIl.nextFloat() * 360.0f, 0.0f);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
    }
}
