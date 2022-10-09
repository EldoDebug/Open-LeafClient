package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlIlIIIIIIlllIlIllIl
{
    private String[][] llllIIIIlIIIlIlllIll;
    private Object[][] IlIlIlIlIlllllllllIl;
    
    public IlIlIIIIIIlllIlIllIl() {
        this.llllIIIIlIIIlIlllIll = new String[][] { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
        this.IlIlIlIlIlllllllllIl = new Object[][] { { net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI }, { IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll, IIllIIllIIIlIlIIIIlI.IlIlIIIIIIlllIlIllIl, IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl, IIllIIllIIIlIlIIIIlI.IlllllllIIIlIIIlIlII, IIllIIllIIIlIlIIIIlI.lIllllllIIllIlIlIlII }, { IIllIIllIIIlIlIIIIlI.IIIIlllIIIIIIlIIIlll, IIllIIllIIIlIlIIIIlI.lllIIIIlllllIlIIllIl, IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, IIllIIllIIIlIlIIIIlI.IlIlIIIlIIlIlIIlllIl, IIllIIllIIIlIlIIIIlI.lllllIlIIIlIlIIlllII }, { IIllIIllIIIlIlIIIIlI.IlIllIlIlIIIlIlIlIII, IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI, IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI, IIllIIllIIIlIlIIIIlI.IIlIIIIlllIlllllIlII, IIllIIllIIIlIlIIIIlI.llIIlllIIlllIIllIllI }, { IIllIIllIIIlIlIIIIlI.IIIllllllIllIIIlllIl, IIllIIllIIIlIlIIIIlI.IlIIIlIIIllllIlIlIlI, IIllIIllIIIlIlIIIIlI.IIIIIllIIIIlIIIIllIl, IIllIIllIIIlIlIIIIlI.IIIIIIIIIlllIllIlIlI, IIllIIllIIIlIlIIIIlI.IIllllIIIlIIIIIIllIl } };
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl[0].length; ++i) {
            final Object o = this.IlIlIlIlIlllllllllIl[0][i];
            for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length - 1; ++j) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl((IlIIIlIlIIIllIlIlIIl)this.IlIlIlIlIlllllllllIl[j + 1][i]), this.llllIIIIlIIIlIlllIll[j], '#', IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII, 'X', o);
            }
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.i), " #", "# ", '#', IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl);
    }
}
