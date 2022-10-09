package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;

public class IlIlIIIlIIlIlIIlllIl extends llIIlIIIlIIIllIlIIIl
{
    private boolean IIlllIIIllIllIIlIlIl;
    private static final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIlllIlllllIIllIIII;
    private static final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl lllllIlIlIlllIlllIlI;
    private static final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl IlIllllIIlIllIlIlIll;
    
    static {
        llIlllIlllllIIllIIII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.IlIIIlIlIIIllIlIlIIl);
        lllllIlIlIlllIlllIlI = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false);
        IlIllllIIlIllIlIlIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false);
    }
    
    public IlIlIIIlIIlIlIIlllIl(final int n, final boolean iIlllIIIllIllIIlIlIl) {
        super(n);
        this.IIlllIIIllIllIIlIlIl = iIlllIIIllIllIIlIlIl;
        if (iIlllIIIllIllIIlIlIl) {
            this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 2;
        }
        else {
            this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 50;
        }
        this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 25;
        this.IIllIIIlIIlIlIlIIIII.llIIIlIlIllIIlIlIlII = 4;
        if (!iIlllIIIllIllIIlIlIl) {
            this.llIllIIlllllllllllll.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.class, 2, 1, 1));
        }
        this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(IlIIIlIlIIIllIlIlIIl.class, 10, 4, 4));
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return (random.nextInt(10) == 0) ? this.IIIllIIllIIIIIIlIIlI : ((random.nextInt(2) == 0) ? new IIlllIIIlIlllIIlllII(IlIlIIIlIIlIlIIlllIl.llIlllIlllllIIllIIII, IlIlIIIlIIlIlIIlllIl.IlIllllIIlIllIlIlIll) : ((!this.IIlllIIIllIllIIlIlIl && random.nextInt(3) == 0) ? new IIlIIIIlllIlllllIlII(false, 10, 20, IlIlIIIlIIlIlIIlllIl.llIlllIlllllIIllIIII, IlIlIIIlIIlIlIIlllIl.lllllIlIlIlllIlllIlI) : new IIIIIIIIIlllIllIlIlI(false, 4 + random.nextInt(7), IlIlIIIlIIlIlIIlllIl.llIlllIlllllIIllIIII, IlIlIIIlIIlIlIIlllIl.lllllIlIlIlllIlllIlI, true)));
    }
    
    @Override
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl(final Random random) {
        return (random.nextInt(4) == 0) ? new IIIIIllIIIIlIIIIllIl(dd.llIllIIIIIllIlIIIIlI) : new IIIIIllIIIIlIIIIllIl(dd.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl);
        final int n = random.nextInt(16) + 8;
        final int n2 = random.nextInt(16) + 8;
        new IlIlIllllllllIIIIlII().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, random.nextInt(illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, 0, n2)).lIIIlllIIIllIIIllIII() * 2), n2));
        final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = new IIllllIIIlIIIIIIllIl();
        for (int i = 0; i < 50; ++i) {
            illllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(16) + 8, 128, random.nextInt(16) + 8));
        }
    }
}
