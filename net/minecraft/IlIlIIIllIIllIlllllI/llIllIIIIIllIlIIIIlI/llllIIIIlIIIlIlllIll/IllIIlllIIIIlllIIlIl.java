package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IllIIlllIIIIlllIIlIl extends IlIlIIIllIllIIIIIllI
{
    public IllIIlllIIIIlllIIlIl() {
        this.llllIIIlIlllIlIIIIIl = true;
    }
    
    public IllIIlllIIIIlllIIlIl(final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final boolean illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readDouble();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readDouble();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readDouble();
        super.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeDouble(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeDouble(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeDouble(this.llIllIIIIIllIlIIIIlI);
        super.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
    }
}
