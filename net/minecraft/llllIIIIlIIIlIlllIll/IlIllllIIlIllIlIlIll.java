package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIllllIIlIllIlIlIll extends bk
{
    public IlIllllIIlIllIlIlIll() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IlIllllIIlIllIlIlIll.IlllIIIIlIIIlIlIlIIl, llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl;
        final int n2 = n & 0xC;
        if (n2 == 4) {
            llIllIlIlIIIIIIIllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll;
        }
        else if (n2 == 8) {
            llIllIlIlIIIIIIIllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI;
        }
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIllllIIlIllIlIlIll.IlllIIIIlIIIlIlIlIIl, llIllIlIlIIIIIIIllII);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0;
        final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = (llIllIlIlIIIIIIIllII)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIllllIIlIllIlIlIll.IlllIIIIlIIIlIlIlIIl);
        if (llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) {
            n |= 0x4;
        }
        else if (llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IlIllllIIlIllIlIlIll.IlllIIIIlIIIlIlIlIIl });
    }
    
    @Override
    protected lllIIIIlIlIllIIlIIIl IllIIlllIIIIlllIIlIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this), 1, 0);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3, n4, lllIIIIlllllIlIIllIl).llllIIIIlIIIlIlllIll(IlIllllIIlIllIlIlIll.IlllIIIIlIIIlIlIlIIl, lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI());
    }
}
