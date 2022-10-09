package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IIllIIllIIIlIlIIIIlI
{
    private String[][] llllIIIIlIIIlIlllIll;
    private Object[][] IlIlIlIlIlllllllllIl;
    
    public IIllIIllIIIlIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll = new String[][] { { "X", "X", "#" } };
        this.IlIlIlIlIlllllllllIl = new Object[][] { { net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI }, { net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIlIllIllIlIIll, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIlIlIIIllIIllIIIllI, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIlIIIlIlIIlllIIlll, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIIlIlIllIIlIlIlII } };
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl[0].length; ++i) {
            final Object o = this.IlIlIlIlIlllllllllIl[0][i];
            for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length - 1; ++j) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl((IlIIIlIlIIIllIlIlIIl)this.IlIlIlIlIlllllllllIl[j + 1][i]), this.llllIIIIlIIIlIlllIll[j], '#', net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII, 'X', o);
            }
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl, 1), " #X", "# X", " #X", 'X', net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII, '#', net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl, 4), "X", "#", "Y", 'Y', net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll, 'X', net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIlllIIIlIlllII, '#', net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII);
    }
}
