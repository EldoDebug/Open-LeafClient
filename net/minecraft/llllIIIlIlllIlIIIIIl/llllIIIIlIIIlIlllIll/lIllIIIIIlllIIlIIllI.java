package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIllIIIIIlllIIlIIllI
{
    private IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl;
    protected boolean llllIIIIlIIIlIlllIll;
    
    public lIllIIIIIlllIIlIIllI(final IlIllIlIlIIIlIlIlIII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll = true;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI(this.llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll = false;
    }
}
