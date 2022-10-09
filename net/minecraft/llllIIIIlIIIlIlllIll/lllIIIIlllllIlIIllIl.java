package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

class lllIIIIlllllIlIIllIl implements Runnable
{
    final /* synthetic */ IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl;
    private final /* synthetic */ IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    
    lllIIIIlllllIlIIllIl(final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void run() {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        if (llllIIIIlIIIlIlllIll instanceof llIIlIIIlIIIllIlIIIl) {
            ((llIIlIIIlIIIllIlIIIl)llllIIIIlIIIlIlllIll).IIIlIIIlIlIIlllIIlll();
            this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this.llIllIIIIIllIlIIIIlI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ac, 1, 0);
        }
    }
}
