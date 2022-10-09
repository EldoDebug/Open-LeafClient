package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;

public class IllIllIIIIlIIlIlllII extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    public IllIllIIIIlIIlIlllII(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        ((IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).IlIlIIIllIllIIIIIllI(true);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        ((IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).IlIlIIIllIllIIIIIllI(false);
    }
}
