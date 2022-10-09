package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIIlIIlIIIIlllIlllII extends IlIlIIIlIIlIlIIlllIl
{
    public IIIlIIlIIIIlllIlllII() {
        this.lIIIIlIIIIIlllIllIII = true;
    }
    
    public IIIlIIlIIIIlllIlllII(final int n, final byte ilIlIlIlIlllllllllIl, final byte llIllIIIIIllIlIIIIlI, final byte ilIIIlIlIIIllIlIlIIl, final byte ilIlIIIllIllIIIIIllI, final byte illIIlllIIIIlllIIlIl, final boolean llllIIIlIlllIlIIIIIl) {
        super(n);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readByte();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readByte();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readByte();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readByte();
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readByte();
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readBoolean();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeByte(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeByte(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeByte(this.IlIlIIIllIllIIIIIllI);
        llllllIllIllIlIllllI.writeByte(this.IllIIlllIIIIlllIIlIl);
        llllllIllIllIlIllllI.writeBoolean(this.llllIIIlIlllIlIIIIIl);
    }
}
