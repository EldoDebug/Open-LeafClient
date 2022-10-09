package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class lIIlIIIlIllIlIllIIIl extends IlIIIlIlIIIllIlIlIIl
{
    public lIIlIIIlIllIlIllIIIl() {
        this.IlIIIlIlIIIllIlIlIIl = 16;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            return lllIIIIlIlIllIIlIIIl;
        }
        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.bow", 0.5f, 0.4f / (lIIlIIIlIllIlIllIIIl.llIllIIIIIllIlIIIIlI.nextFloat() * 0.4f + 0.8f));
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll));
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        return lllIIIIlIlIllIIlIIIl;
    }
}
