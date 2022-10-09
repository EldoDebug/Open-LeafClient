package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class llllllIllIllIlIllllI extends llIIlIIIlIIIllIlIIIl
{
    private static final IIIllllllIllIIIlllIl IIlllIIIllIllIIlIlIl;
    private static final IlIIIlIIIllllIlIlIlI llIlllIlllllIIllIIII;
    private static final IIIlIIlIIIIlllIlllII lllllIlIlIlllIlllIlI;
    private static final IIIlIIlIIIIlllIlllII IlIllllIIlIllIlIlIll;
    private static final IlIlIIIllIllIIIIIllI lllIlIIIIIlIlllllIlI;
    private int llIlIIIIllIlIIlIlIII;
    
    static {
        IIlllIIIllIllIIlIlIl = new IIIllllllIllIIIlllIl();
        llIlllIlllllIIllIIII = new IlIIIlIIIllllIlIlIlI(false);
        lllllIlIlIlllIlllIlI = new IIIlIIlIIIIlllIlllII(false, false);
        IlIllllIIlIllIlIlIll = new IIIlIIlIIIIlllIlllII(false, true);
        lllIlIIIIIlIlllllIlI = new IlIlIIIllIllIIIIIllI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII, 0);
    }
    
    public llllllIllIllIlIllllI(final int n, final int llIlIIIIllIlIIlIlIII) {
        super(n);
        this.llIlIIIIllIlIIlIlIII = llIlIIIIllIlIIlIlIII;
        this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIllllllIllIIIlllIl.class, 8, 4, 4));
        this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 10;
        if (llIlIIIIllIlIIlIlIII != 1 && llIlIIIIllIlIIlIlIII != 2) {
            this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 1;
            this.IIllIIIlIIlIlIlIIIII.llIIlllIIlllIIllIllI = 1;
        }
        else {
            this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 7;
            this.IIllIIIlIIlIlIlIIIII.lIllllllIIllIlIlIlII = 1;
            this.IIllIIIlIIlIlIlIIIII.llIIlllIIlllIIllIllI = 3;
        }
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return ((this.llIlIIIIllIlIIlIlIII == 1 || this.llIlIIIIllIlIIlIlIII == 2) && random.nextInt(3) == 0) ? ((this.llIlIIIIllIlIIlIlIII != 2 && random.nextInt(13) != 0) ? llllllIllIllIlIllllI.lllllIlIlIlllIlllIlI : llllllIllIllIlIllllI.IlIllllIIlIllIlIlIll) : ((random.nextInt(3) == 0) ? llllllIllIllIlIllllI.IIlllIIIllIllIIlIlIl : llllllIllIllIlIllllI.llIlllIlllllIIllIIII);
    }
    
    @Override
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl(final Random random) {
        return (random.nextInt(5) > 0) ? new IIIIIllIIIIlIIIIllIl(dd.llIllIIIIIllIlIIIIlI) : new IIIIIllIIIIlIIIIllIl(dd.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.llIlIIIIllIlIIlIlIII == 1 || this.llIlIIIIllIlIIlIlIII == 2) {
            for (int nextInt = random.nextInt(3), i = 0; i < nextInt; ++i) {
                llllllIllIllIlIllllI.lllIlIIIIIlIlllllIlI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(16) + 8, 0, random.nextInt(16) + 8)));
            }
        }
        llllllIllIllIlIllllI.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl);
        for (int j = 0; j < 7; ++j) {
            final int n = random.nextInt(16) + 8;
            final int n2 = random.nextInt(16) + 8;
            llllllIllIllIlIllllI.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, random.nextInt(illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, 0, n2)).lIIIlllIIIllIIIllIII() + 32), n2));
        }
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2, final double n3) {
        if (this.llIlIIIIllIlIIlIlIII == 1 || this.llIlIIIIllIlIIlIlIII == 2) {
            this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll();
            this.IlIIlllllIIllIIlllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll();
            if (n3 > 1.75) {
                this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI, net.minecraft.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl);
            }
            else if (n3 > -0.95) {
                this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI, net.minecraft.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI);
            }
        }
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl, n, n2, n3);
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl(final int n) {
        return (this.lIIIIIlIlIIIlIIIIlIl == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIlIlIIIlIIlIlIlII.lIIIIIlIlIIIlIIIIlIl) ? new llllllIllIllIlIllllI(n, 2).llllIIIIlIIIlIlllIll(5858897, true).llllIIIIlIIIlIlllIll("Mega Spruce Taiga").llllIIIIlIIIlIlllIll(5159473).llllIIIIlIIIlIlllIll(0.25f, 0.8f).llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(this.IIlllllIllIllIlIlIII, this.llllIllllIllllIlIlII)) : super.IlIIIlIlIIIllIlIlIIl(n);
    }
}
