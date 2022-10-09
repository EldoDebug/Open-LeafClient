package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;

public class llIIIllIlIllIllIIIIl extends IlIIIlIlIIIllIlIlIIl
{
    private final Class llllIIIlIlllIlIIIIIl;
    
    public llIIIllIlIllIllIIIIl(final Class llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
            return false;
        }
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
            return false;
        }
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        final lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll);
        if (llllIIIIlIIIlIlllIll3 != null && llllIIIIlIIIlIlllIll3.llllIIIlIlllIlIIIIIl()) {
            if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
            }
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        }
        return true;
    }
    
    private lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (this.llllIIIlIlllIlIIIIIl == IlIlIIIIIIlllIlIllIl.class) ? new IlIlIIIIIIlllIlIllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll) : ((this.llllIIIlIlllIlIIIIIl == llIIlIIIlIIIllIlIIIl.class) ? new llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll) : null);
    }
}
