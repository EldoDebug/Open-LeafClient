package net.minecraft.llllIIllllIlIlIIIIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public class IlIlIlIlIlllllllllIl extends llllIIIIlIIIlIlllIll
{
    protected IlIlIlIlIlllllllllIl(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final boolean b, final int n2) {
        super(n, lIllllIllIllIIllllll, b, n2);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll(lllIIIIlllllIlIIllIl.aj() - 4 * (n + 1));
        super.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, llIllIIIIIllIlIIIIlI, n);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll(lllIIIIlllllIlIIllIl.aj() + 4 * (n + 1));
        super.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl, llIllIIIIIllIlIIIIlI, n);
    }
}
