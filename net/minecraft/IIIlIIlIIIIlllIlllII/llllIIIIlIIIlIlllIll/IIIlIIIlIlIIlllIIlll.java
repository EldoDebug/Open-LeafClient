package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;

public class IIIlIIIlIlIIlllIIlll extends llIIlIIIlIIIllIlIIIl
{
    private lllIllIIIllllllIllll IIlllIIIllIllIIlIlIl;
    private IlIIIlIIIllllIlIlIlI llIlllIlllllIIllIIII;
    private int lllllIlIlIlllIlllIlI;
    private int IlIllllIIlIllIlIlIll;
    private int lllIlIIIIIlIlllllIlI;
    private int llIlIIIIllIlIIlIlIII;
    
    protected IIIlIIIlIlIIlllIIlll(final int n, final boolean b) {
        super(n);
        this.IIlllIIIllIllIIlIlIl = new IIlllIlIIllIlIlIlIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(bs.IIIIIIIIIlllIllIlIlI, bt.llllIIIIlIIIlIlllIll), 9);
        this.llIlllIlllllIIllIIII = new IlIIIlIIIllllIlIlIlI(false);
        this.lllllIlIlIlllIlllIlI = 0;
        this.IlIllllIIlIllIlIlIll = 1;
        this.lllIlIIIIIlIlllllIlI = 2;
        this.llIlIIIIllIlIIlIlIII = this.lllllIlIlIlllIlllIlI;
        if (b) {
            this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 3;
            this.llIlIIIIllIlIIlIlIII = this.IlIllllIIlIllIlIlIll;
        }
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return (random.nextInt(3) > 0) ? this.llIlllIlllllIIllIIII : super.llllIIIIlIIIlIlllIll(random);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl);
        for (int n = 3 + random.nextInt(6), i = 0; i < n; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(16), random.nextInt(28) + 4, random.nextInt(16));
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.T.lllIllIIIllllllIllll(), 2);
            }
        }
        for (int j = 0; j < 7; ++j) {
            this.IIlllIIIllIllIIlIlIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(16), random.nextInt(64), random.nextInt(16)));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2, final double n3) {
        this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll();
        this.IlIIlllllIIllIIlllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll();
        if ((n3 < -1.0 || n3 > 2.0) && this.llIlIIIIllIlIIlIlIII == this.lllIlIIIIIlIlllllIlI) {
            this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.lllIllIIIllllllIllll();
            this.IlIIlllllIIllIIlllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.lllIllIIIllllllIllll();
        }
        else if (n3 > 1.0 && this.llIlIIIIllIlIIlIlIII != this.IlIllllIIlIllIlIlIll) {
            this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll();
            this.IlIIlllllIIllIIlllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll();
        }
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl, n, n2, n3);
    }
    
    private IIIlIIIlIlIIlllIIlll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llIlIIIIllIlIIlIlIII = this.lllIlIIIIIlIlllllIlI;
        this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llIIIllIlIllIllIIIIl, true);
        this.llllIIIIlIIIlIlllIll(String.valueOf(llIIlIIIlIIIllIlIIIl.lIlIIlllIIlIIlIlllIl) + " M");
        this.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(llIIlIIIlIIIllIlIIIl.IIlllllIllIllIlIlIII, llIIlIIIlIIIllIlIIIl.llllIllllIllllIlIlII));
        this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.IIlIlIllllIlllIIIIll, llIIlIIIlIIIllIlIIIl.lIIllIIIllllIlllIllI);
        return this;
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl(final int n) {
        return new IIIlIIIlIlIIlllIIlll(n, false).IlIlIlIlIlllllllllIl(this);
    }
}
