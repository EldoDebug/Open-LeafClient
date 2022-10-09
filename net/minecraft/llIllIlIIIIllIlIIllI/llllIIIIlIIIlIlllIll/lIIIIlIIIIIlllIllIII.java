package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class lIIIIlIIIIIlllIllIII
{
    private String[][] llllIIIIlIIIlIlllIll;
    private IlIIIlIlIIIllIlIlIIl[][] IlIlIlIlIlllllllllIl;
    
    public lIIIIlIIIIIlllIllIII() {
        this.llllIIIIlIIIlIlllIll = new String[][] { { "XXX", "X X" }, { "X X", "XXX", "XXX" }, { "XXX", "X X", "X X" }, { "X X", "X X" } };
        this.IlIlIlIlIlllllllllIl = new IlIIIlIlIIIllIlIlIIl[][] { { IIllIIllIIIlIlIIIIlI.lllllIlIlIlllIlllIlI, IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI }, { IIllIIllIIIlIlIIIIlI.IIlIlIlIIlIllIIIIIIl, IIllIIllIIIlIlIIIIlI.IIlIIIlllIllIllIlIII, IIllIIllIIIlIlIIIIlI.llIIIlIlllIllIIlIllI, IIllIIllIIIlIlIIIIlI.lIllIIIIIlllIIlIIllI }, { IIllIIllIIIlIlIIIIlI.IllIllIIIIlIIlIlllII, IIllIIllIIIlIlIIIIlI.lIlIlIlllIIlIlIlllIl, IIllIIllIIIlIlIIIIlI.IlIIllIIllIIllIIlIIl, IIllIIllIIIlIlIIIIlI.lIlIIlllIIlIIlIlllIl }, { IIllIIllIIIlIlIIIIlI.IlIllllIIlIIlIlIlIll, IIllIIllIIIlIlIIIIlI.llIIIIIIlIllIIlIIIll, IIllIIllIIIlIlIIIIlI.lllllIIIIIlIlIIIIIIl, IIllIIllIIIlIlIIIIlI.llIIIllIlIllIllIIIIl }, { IIllIIllIIIlIlIIIIlI.IllIllIlllIllllIIllI, IIllIIllIIIlIlIIIIlI.lIIIIlIlIllllIIlIllI, IIllIIllIIIlIlIIIIlI.IllIIlllllIIllIIllIl, IIllIIllIIIlIlIIIIlI.IIIllIIIlIlIIllIIIlI } };
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl[0].length; ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl[0][i];
            for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length - 1; ++j) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(this.IlIlIlIlIlllllllllIl[j + 1][i]), this.llllIIIIlIIIlIlllIll[j], 'X', ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
}
