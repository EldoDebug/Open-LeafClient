package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIllIIIIIlllIIlIIllI
{
    final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    lllIllIIIllllllIllll IlIlIlIlIlllllllllIl;
    int llIllIIIIIllIlIIIIlI;
    
    public lIllIIIIIlllIIlIIllI(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final byte b, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this.llIllIIIIIllIlIIIIlI = (this.llIllIIIIIllIlIIIIlI | b | 1 << lllIllIIIllllllIllll.ordinal());
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (this.llIllIIIIIllIlIIIIlI & 1 << lllIllIIIllllllIllll.ordinal()) > 0;
    }
    
    private void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
}
