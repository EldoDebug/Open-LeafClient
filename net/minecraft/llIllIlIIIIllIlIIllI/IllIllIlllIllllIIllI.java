package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class IllIllIlllIllllIIllI extends IlIIIlIlIIIllIlIlIIl
{
    public IllIllIlllIllllIIllI() {
        this.IlIIIlIlIIIllIlIlIIl = 16;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.bow", 0.5f, 0.4f / (IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI.nextFloat() * 0.4f + 0.8f));
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll));
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        return lllIIIIlIlIllIIlIIIl;
    }
}
