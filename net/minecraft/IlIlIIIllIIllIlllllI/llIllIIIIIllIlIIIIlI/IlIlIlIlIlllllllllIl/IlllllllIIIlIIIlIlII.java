package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlllllllIIIlIIIlIlII extends IlIlIIIlIIlIlIIlllIl
{
    public IlllllllIIIlIIIlIlII() {
    }
    
    public IlllllllIIIlIIIlIlII(final int n, final byte ilIlIlIlIlllllllllIl, final byte llIllIIIIIllIlIIIIlI, final byte ilIIIlIlIIIllIlIlIIl, final boolean llllIIIlIlllIlIIIIIl) {
        super(n);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readByte();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readByte();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readByte();
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readBoolean();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeByte(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeByte(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeBoolean(this.llllIIIlIlllIlIIIIIl);
    }
}
