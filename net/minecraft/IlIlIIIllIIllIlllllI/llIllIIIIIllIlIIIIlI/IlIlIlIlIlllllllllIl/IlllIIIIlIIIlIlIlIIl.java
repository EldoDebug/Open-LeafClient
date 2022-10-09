package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlllIIIIlIIIlIlIlIIl implements IIlIIIIIllIlIIIlIIll
{
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    
    public IlllIIIIlIIIlIlIlIIl() {
    }
    
    public IlllIIIIlIIIlIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl = (llIIlIIIlIIIllIlIIIl)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl));
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
