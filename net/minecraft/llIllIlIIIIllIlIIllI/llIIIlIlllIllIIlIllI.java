package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import java.util.*;

public class llIIIlIlllIllIIlIllI extends lIllIIIIIlllIIlIIllI
{
    private final boolean lIIIIlIIIIIlllIllIII;
    
    public llIIIlIlllIllIIlIllI(final boolean liiiIlIIIIIlllIllIII) {
        super(0, 0.0f, false);
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIIllIIllIIllIIlIIl llllIIIIlIIIlIlllIll = IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        return (this.lIIIIlIIIIIlllIllIII && llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl()) ? llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI() : llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public float lIlIlIIIllIIllIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIIllIIllIIllIIlIIl llllIIIIlIIIlIlllIll = IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        return (this.lIIIIlIIIIIlllIllIII && llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl()) ? llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() : llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return (IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl) == IlIIllIIllIIllIIlIIl.IlIIIlIlIIIllIlIlIIl) ? "+0-1+2+3+13&4-4" : null;
    }
    
    @Override
    protected void IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl) == IlIIllIIllIIllIIlIIl.IlIIIlIlIIIllIlIlIIl) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llllllIllIllIlIllllI, 1200, 3));
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.llllllIllIllIlIllllI, 300, 2));
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllllIllIllIlIllllI, 300, 1));
        }
        super.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        IlIIllIIllIIllIIlIIl[] values;
        for (int length = (values = IlIIllIIllIIllIIlIIl.values()).length, i = 0; i < length; ++i) {
            final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl = values[i];
            if (!this.lIIIIlIIIIIlllIllIII || ilIIllIIllIIllIIlIIl.llllIIIlIlllIlIIIIIl()) {
                list.add(new lllIIIIlIlIllIIlIIIl(this, 1, ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll()));
            }
        }
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIIllIIllIIllIIlIIl llllIIIIlIIIlIlllIll = IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        return String.valueOf(this.lIIIIlIIIIIlllIllIII()) + "." + llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() + "." + ((this.lIIIIlIIIIIlllIllIII && llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl()) ? "cooked" : "raw");
    }
}
