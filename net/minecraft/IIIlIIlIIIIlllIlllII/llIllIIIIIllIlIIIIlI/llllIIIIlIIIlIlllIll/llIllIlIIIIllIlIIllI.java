package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import java.io.*;

class llIllIlIIIIllIlIIllI extends ByteArrayOutputStream
{
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    final /* synthetic */ llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    public llIllIlIIIIllIlIIllI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(8096);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void close() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.buf, this.count);
    }
}
