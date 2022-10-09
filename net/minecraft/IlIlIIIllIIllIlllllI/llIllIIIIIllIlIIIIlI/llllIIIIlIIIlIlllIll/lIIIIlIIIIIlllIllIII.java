package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lIIIIlIIIIIlllIllIII extends IlIlIIIllIllIIIIIllI
{
    public lIIIIlIIIIIlllIllIII() {
        this.llllIIIlIlllIlIIIIIl = true;
        this.lIIIIlIIIIIlllIllIII = true;
    }
    
    public lIIIIlIIIIIlllIllIII(final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI, final boolean illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = true;
        this.llllIIIlIlllIlIIIIIl = true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readDouble();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readDouble();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readDouble();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readFloat();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readFloat();
        super.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeDouble(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeDouble(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeDouble(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeFloat(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeFloat(this.IlIlIIIllIllIIIIIllI);
        super.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
    }
}
