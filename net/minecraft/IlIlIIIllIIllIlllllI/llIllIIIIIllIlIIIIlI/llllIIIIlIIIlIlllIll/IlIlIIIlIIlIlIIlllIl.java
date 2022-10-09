package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIIIlIIlIlIIlllIl implements IIlIIIIIllIlIIIlIIll
{
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private llIIIIIIlIllIIlIIIll[] IlIlIlIlIlllllllllIl;
    
    public IlIlIIIlIIlIlIIlllIl() {
    }
    
    public IlIlIIIlIIlIlIIlllIl(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final llIIIIIIlIllIIlIIIll[] array) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = new llIIIIIIlIllIIlIIIll[] { array[0], array[1], array[2], array[3] };
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl = new llIIIIIIlIllIIlIIIll[4];
        for (int i = 0; i < 4; ++i) {
            this.IlIlIlIlIlllllllllIl[i] = lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(384));
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        for (int i = 0; i < 4; ++i) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl[i]));
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public llIIIIIIlIllIIlIIIll[] IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
