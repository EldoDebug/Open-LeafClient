package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class lIIIIlIIIIIlllIllIII extends llllIIIIlIIIlIlllIll
{
    protected lIIIIlIIIIIlllIllIII(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII);
        this.IlIlIlIlIlllllllllIl("digging");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 1 + 10 * (n - 1);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return super.IlIlIlIlIlllllllllIl(n) + 50;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 5;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i || super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
    }
}
