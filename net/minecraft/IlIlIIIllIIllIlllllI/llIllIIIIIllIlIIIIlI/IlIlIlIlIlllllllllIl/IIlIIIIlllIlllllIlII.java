package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIlIIIIlllIlllllIlII extends IlIlIIIlIIlIlIIlllIl
{
    public IIlIIIIlllIlllllIlII() {
        this.lIIIIlIIIIIlllIllIII = true;
    }
    
    public IIlIIIIlllIlllllIlII(final int n, final byte ilIlIIIllIllIIIIIllI, final byte illIIlllIIIIlllIIlIl, final boolean llllIIIlIlllIlIIIIIl) {
        super(n);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = true;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readByte();
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readByte();
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readBoolean();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
        llllllIllIllIlIllllI.writeByte(this.IlIlIIIllIllIIIIIllI);
        llllllIllIllIlIllllI.writeByte(this.IllIIlllIIIIlllIIlIl);
        llllllIllIllIlIllllI.writeBoolean(this.llllIIIlIlllIlIIIIIl);
    }
}
