package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;

public class IIIIlllIIIIIIlIIIlll extends IlIIIlIlIIIllIlIlIIl
{
    private final IlIlIIIllIllIIIIIllI IlIlIIIllIllIIIIIllI;
    
    public IIIIlllIIIIIIlIIIlll() {
        this.IlIlIIIllIllIIIIIllI = new llllIIllllIlIlIIIIll(this);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll() {
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
        this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        return new IllIIlllllIIllIIllIl(this.IlIlIlIlIlllllllllIl, 2, iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public boolean IlIlIIIIIIlllIlIllIl() {
        return true;
    }
    
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public llIIIlIlIllIIlIlIlII IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI();
    }
}
