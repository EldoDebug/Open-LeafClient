package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIllIlIlIIIlIlIlIII extends IlIIIlIlIIIllIlIlIIl
{
    private int IlIlIIIllIllIIIIIllI;
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("OutputSignal", this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("OutputSignal");
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
}
