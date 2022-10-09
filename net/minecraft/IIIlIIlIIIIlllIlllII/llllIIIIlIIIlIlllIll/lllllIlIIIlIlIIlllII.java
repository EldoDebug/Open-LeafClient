package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class lllllIlIIIlIlIIlllII extends llIIlIIIlIIIllIlIIIl
{
    private static final llIIlllIIlllIIllIllI IIlllIIIllIllIIlIlIl;
    
    static {
        IIlllIIIllIllIIlIlIl = new llIIlllIIlllIIllIllI(false);
    }
    
    protected lllllIlIIIlIlIIlllII(final int n) {
        super(n);
        this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(IllIIlllIIIIlllIIlIl.class, 1, 2, 6));
        this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 1;
        this.IIllIIIlIIlIlIlIIIII.llIIIlIlIllIIlIlIlII = 4;
        this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 20;
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return (random.nextInt(5) > 0) ? lllllIlIIIlIlIIlllII.IIlllIIIllIllIIlIlIl : this.IIllIIIlIIIIlIIlIIII;
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl(final int n) {
        final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII = new lIllllllIIllIlIlIlII(n, this);
        lIllllllIIllIlIlIlII.IIlIlIllllIlllIIIIll = (this.IIlIlIllllIlllIIIIll + 1.0f) * 0.5f;
        lIllllllIIllIlIlIlII.IIlllllIllIllIlIlIII = this.IIlllllIllIllIlIlIII * 0.5f + 0.3f;
        lIllllllIIllIlIlIlII.llllIllllIllllIlIlII = this.llllIllllIllllIlIlII * 0.5f + 1.2f;
        return lIllllllIIllIlIlIlII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        lllllIlIIIlIlIIlllII.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI);
        for (int i = 0; i < 7; ++i) {
            final int n = random.nextInt(16) + 8;
            final int n2 = random.nextInt(16) + 8;
            lllllIlIIIlIlIIlllII.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, random.nextInt(illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, 0, n2)).lIIIlllIIIllIIIllIII() + 32), n2));
        }
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl);
    }
}
