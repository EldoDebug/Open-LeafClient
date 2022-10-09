package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;

class llllIIllllIlIlIIIIll extends IlIlIlIlIlllllllllIl
{
    final /* synthetic */ IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl;
    private final /* synthetic */ lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI;
    
    llllIIllllIlIlIIIIll(final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl, final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    protected IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        return new IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(), liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(), this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl());
    }
    
    @Override
    protected float llllIIIIlIIIlIlllIll() {
        return super.llllIIIIlIIIlIlllIll() * 0.5f;
    }
    
    @Override
    protected float IlIlIlIlIlllllllllIl() {
        return super.IlIlIlIlIlllllllllIl() * 1.25f;
    }
}
