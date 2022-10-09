package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class lllllIlIIIlIlIIlllII extends IlIIIlIlIIIllIlIlIIl
{
    public byte IlIlIIIllIllIIIIIllI;
    public boolean IllIIlllIIIIlllIIlIl;
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("note", this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("note");
        this.IlIlIIIllIllIIIIIllI = (byte)llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, 0, 24);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIIIllIllIIIIIllI = (byte)((this.IlIlIIIllIllIIIIIllI + 1) % 25);
        this.llIIIlIlIllIIlIlIlII();
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
            int n = 0;
            if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI) {
                n = 1;
            }
            if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII) {
                n = 2;
            }
            if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl) {
                n = 3;
            }
            if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
                n = 4;
            }
            illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, n, this.IlIlIIIllIllIIIIIllI);
        }
    }
}
