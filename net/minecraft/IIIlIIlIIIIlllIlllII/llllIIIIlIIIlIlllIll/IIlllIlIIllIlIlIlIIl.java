package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IIlllIlIIllIlIlIlIIl extends llIIlIIIlIIIllIlIIIl
{
    protected boolean IIlllIIIllIllIIlIlIl;
    
    protected IIlllIlIIllIlIlIlIIl(final int n) {
        super(n);
        this.llllIIIIlIIIlIlllIll(0.8f, 0.4f);
        this.llllIIIIlIIIlIlllIll(IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI);
        this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(IllIIlllIIIIlllIIlIl.class, 5, 2, 6));
        this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = -999;
        this.IIllIIIlIIlIlIlIIIII.llIIIlIlIllIIlIlIlII = 4;
        this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 10;
    }
    
    @Override
    public llIllIIlllllllllllll llllIIIIlIIIlIlllIll(final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (IIlllIlIIllIlIlIlIIl.IllIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() / 200.0, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() / 200.0) < -0.8) {
            switch (random.nextInt(4)) {
                case 0: {
                    return net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl;
                }
                case 1: {
                    return net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl;
                }
                case 2: {
                    return net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.lIIIlllIIIllIIIllIII;
                }
                default: {
                    return net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.lIIIIlIIIIIlllIllIII;
                }
            }
        }
        else {
            if (random.nextInt(3) > 0) {
                final int nextInt = random.nextInt(3);
                return (nextInt == 0) ? net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl : ((nextInt == 1) ? net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI : net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.llIIlIIIlIIIllIlIIIl);
            }
            return net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (IIlllIlIIllIlIlIlIIl.IllIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll((ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 8) / 200.0, (ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 8) / 200.0) < -0.8) {
            this.IIllIIIlIIlIlIlIIIII.llIIIlIlIllIIlIlIlII = 15;
            this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 5;
        }
        else {
            this.IIllIIIlIIlIlIlIIIII.llIIIlIlIllIIlIlIlII = 4;
            this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 10;
            IIlllIlIIllIlIlIlIIl.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI);
            for (int i = 0; i < 7; ++i) {
                final int n = random.nextInt(16) + 8;
                final int n2 = random.nextInt(16) + 8;
                IIlllIlIIllIlIlIlIIl.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, random.nextInt(illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, 0, n2)).lIIIlllIIIllIIIllIII() + 32), n2));
            }
        }
        if (this.IIlllIIIllIllIIlIlIl) {
            IIlllIlIIllIlIlIlIIl.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll);
            for (int j = 0; j < 10; ++j) {
                final int n3 = random.nextInt(16) + 8;
                final int n4 = random.nextInt(16) + 8;
                IIlllIlIIllIlIlIlIIl.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n3, random.nextInt(illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n3, 0, n4)).lIIIlllIIIllIIIllIII() + 32), n4));
            }
        }
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl(final int n) {
        final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl = new IIlllIlIIllIlIlIlIIl(n);
        illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll("Sunflower Plains");
        illlIlIIllIlIlIlIIl.IIlllIIIllIllIIlIlIl = true;
        illlIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl(9286496);
        illlIlIIllIlIlIlIIl.IIIllIIIlIlIIllIIIlI = 14273354;
        return illlIlIIllIlIlIlIIl;
    }
}
