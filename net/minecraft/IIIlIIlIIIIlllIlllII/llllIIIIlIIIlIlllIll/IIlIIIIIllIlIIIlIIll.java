package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;

public class IIlIIIIIllIlIIIlIIll extends llIIlIIIlIIIllIlIIIl
{
    protected IIlIIIIIllIlIIIlIIll(final int n) {
        super(n);
        this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 2;
        this.IIllIIIlIIlIlIlIIIII.llIIIlIlIllIIlIlIlII = 1;
        this.IIllIIIlIIlIlIlIIIII.lIllllllIIllIlIlIlII = 1;
        this.IIllIIIlIIlIlIlIIIII.llIIlllIIlllIIllIllI = 8;
        this.IIllIIIlIIlIlIlIIIII.IIlllIIIlIlllIIlllII = 10;
        this.IIllIIIlIIlIlIlIIIII.IlIIIlIIIllllIlIlIlI = 1;
        this.IIllIIIlIIlIlIlIIIII.IlIlIllllllllIIIIlII = 4;
        this.IIllIIIlIIlIlIlIIIII.IIIllllllIllIIIlllIl = 0;
        this.IIllIIIlIIlIlIlIIIII.llllllIllIllIlIllllI = 0;
        this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 5;
        this.IllIlIllIllIlllIIlll = 14745518;
        this.llIllIIlllllllllllll.add(new lIlIlIIIllIIllIIIllI(IIIllllllIllIIIlllIl.class, 1, 1, 1));
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return this.IIIIIIIllllIlIIIIIII;
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (IIlIIIIIllIlIIIlIIll.IllIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() * 0.0225, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() * 0.0225) < -0.1) ? 5011004 : 6975545;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return 6975545;
    }
    
    @Override
    public llIllIIlllllllllllll llllIIIIlIIIlIlllIll(final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2, final double n3) {
        final double llllIIIIlIIIlIlllIll = IIlIIIIIllIlIIIlIIll.IllIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll(n * 0.25, n2 * 0.25);
        if (llllIIIIlIIIlIlllIll > 0.0) {
            final int n4 = n & 0xF;
            final int n5 = n2 & 0xF;
            int i = 255;
            while (i >= 0) {
                if (illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n5, i, n4).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    if (i != 62 || illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n5, i, n4).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl) {
                        break;
                    }
                    illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n5, i, n4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll());
                    if (llllIIIIlIIIlIlllIll < 0.12) {
                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n5, i + 1, n4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.B.lllIllIIIllllllIllll());
                        break;
                    }
                    break;
                }
                else {
                    --i;
                }
            }
        }
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl, n, n2, n3);
    }
}
