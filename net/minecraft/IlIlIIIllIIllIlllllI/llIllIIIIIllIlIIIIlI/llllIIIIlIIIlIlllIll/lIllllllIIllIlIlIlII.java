package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lIllllllIIllIlIlIlII implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private llIIlllIIlllIIllIllI IlIlIlIlIlllllllllIl;
    
    public lIllllllIIllIlIlIlII() {
    }
    
    public lIllllllIIllIlIlIlII(String substring, final llIIlllIIlllIIllIllI ilIlIlIlIlllllllllIl) {
        if (substring.length() > 40) {
            substring = substring.substring(0, 40);
        }
        this.llllIIIIlIIIlIlllIll = substring;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(40);
        this.IlIlIlIlIlllllllllIl = (llIIlllIIlllIIllIllI)llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.class);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
}
