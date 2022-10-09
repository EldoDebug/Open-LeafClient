package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIIllIIllIIllIIlIIl implements IIlIIIIIllIlIIIlIIll
{
    private IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private llIIIIIIlIllIIlIIIll[] llIllIIIIIllIlIIIIlI;
    
    public IlIIllIIllIIllIIlIIl() {
    }
    
    public IlIIllIIllIIllIIlIIl(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIIIIIlIllIIlIIIll[] array) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = new llIIIIIIlIllIIlIIIll[] { array[0], array[1], array[2], array[3] };
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl();
        this.llIllIIIIIllIlIIIIlI = new llIIIIIIlIllIIlIIIll[4];
        for (int i = 0; i < 4; ++i) {
            this.llIllIIIIIllIlIIIIlI[i] = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        for (int i = 0; i < 4; ++i) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI[i]);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llIIIIIIlIllIIlIIIll[] IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
