package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class IIlIIIlllIllIllIlIII extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIlllIllIllIlIII() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public boolean lIIIIlIIIIIlllIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return true;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.bow", 0.5f, 0.4f / (IIlIIIlllIllIllIlIII.llIllIIIIIllIlIIIIlI.nextFloat() * 0.4f + 0.8f));
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll));
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        return lllIIIIlIlIllIIlIIIl;
    }
}
