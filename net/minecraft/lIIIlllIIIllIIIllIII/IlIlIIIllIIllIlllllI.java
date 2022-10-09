package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;

class IlIlIIIllIIllIlllllI extends IlIlIlIlIlllllllllIl
{
    @Override
    protected IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        return new IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(), liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
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
