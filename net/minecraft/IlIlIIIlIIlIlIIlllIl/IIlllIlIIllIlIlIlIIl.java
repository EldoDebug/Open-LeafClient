package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;

public class IIlllIlIIllIlIlIlIIl extends IlIIIlIlIIIllIlIlIIl implements llIIIllIlIllIllIIIIl
{
    private final IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI;
    
    public IIlllIlIIllIlIlIlIIl() {
        this.IlIlIIIllIllIIIIIllI = new llIIIlIlIllIIlIlIlII(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("SpawnPotentials");
        return new IllIIlllllIIllIIllIl(this.IlIlIlIlIlllllllllIl, 1, iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        return this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(n) || super.llIllIIIIIllIlIIIIlI(n, n2);
    }
    
    @Override
    public boolean IlIlIIIIIIlllIlIllIl() {
        return true;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
