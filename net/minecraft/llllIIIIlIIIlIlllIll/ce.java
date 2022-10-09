package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class ce extends IlIlIIIlIIlIlIIlllIl
{
    public ce() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII, false, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIIIllllIlIlIlI = 0.8f;
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        if (llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl()) {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, n);
        }
        else {
            llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(n, 0.0f);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl()) {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI);
        }
        else if (llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI < 0.0) {
            llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI = -llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (Math.abs(llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI) < 0.1 && !llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl()) {
            final double n = 0.4 + Math.abs(llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI) * 0.2;
            llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII *= n;
            llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII *= n;
        }
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI);
    }
}
