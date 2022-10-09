package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class llIlIIIIIlIIlIlIIlll extends llllIllllIllllIlIlII
{
    protected llIlIIIIIlIIlIlIIlll() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.h, 1, illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl("map"));
        final String string = "map_" + lllIIIIlIlIllIIlIIIl2.lIIIIlIIIIIlllIllIII();
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(string);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(string, illIIlllIIIIlllIIlIl);
        illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = 0;
        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
        illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = (byte)illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll();
        illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
            return lllIIIIlIlIllIIlIIIl2;
        }
        if (!llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl2.llIIlIIIlIIIllIlIIIl())) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl2, false);
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        return lllIIIIlIlIllIIlIIIl;
    }
}
