package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llllIIIlIlllIlIIIIIl extends IlIlIIIllIllIIIIIllI
{
    public llllIIIlIlllIlIIIIIl() {
        this.lIIIIlIIIIIlllIllIII = true;
    }
    
    public llllIIIlIlllIlIIIIIl(final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI, final boolean illIIlllIIIIlllIIlIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readFloat();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readFloat();
        super.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeFloat(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeFloat(this.IlIlIIIllIllIIIIIllI);
        super.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
    }
}
