package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lllIIIIlllllIlIIllIl extends lIllIIIIIlllIIlIIllI
{
    private lIlIlIIIllIIllIIIllI llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    final /* synthetic */ lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl;
    
    public lllIIIIlllllIlIIllIl(final lIlIlIIIllIIllIIIllI ilIlIlIlIlllllllllIl, final lIlIlIIIllIIllIIIllI llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        if (this.llllIIIIlIIIlIlllIll) {
            this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI);
            this.llllIIIIlIIIlIlllIll = false;
        }
    }
}
