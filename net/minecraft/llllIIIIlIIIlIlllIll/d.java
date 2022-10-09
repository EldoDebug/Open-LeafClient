package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;

public class d extends IIlIIIIlllIlllllIlII implements dt
{
    protected d() {
        final float n = 0.2f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, n * 2.0f, 0.5f + n);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (random.nextInt(25) == 0) {
            int n = 5;
            final Iterator<IlIlIlIlIlllllllllIl> iterator = (Iterator<IlIlIlIlIlllllllllIl>)net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-4, -1, -4), ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(4, 1, 4)).iterator();
            while (iterator.hasNext()) {
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(iterator.next()).llIllIIIIIllIlIIIIlI() == this && --n <= 0) {
                    return;
                }
            }
            IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            for (int i = 0; i < 4; ++i) {
                if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl2) && this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, this.lllIllIIIllllllIllll())) {
                    ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
                }
                ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }
            if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl2) && this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, this.lllIllIIIllllllIllll())) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, this.lllIllIIIllllllIllll(), 2);
            }
        }
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) && this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, this.lllIllIIIllllllIllll());
    }
    
    @Override
    protected boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 0 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            return ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A || (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI) == IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI) || (illlllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI(ilIlIlIlIlllllllllIl) < 13 && this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI()));
        }
        return false;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        lllIllIIIllllllIllll lllIllIIIllllllIllll = null;
        if (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII) {
            lllIllIIIllllllIllll = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.k);
        }
        else if (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl) {
            lllIllIIIllllllIllll = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.l);
        }
        if (lllIllIIIllllllIllll != null && lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl)) {
            return true;
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 3);
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        return true;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return random.nextFloat() < 0.4;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
    }
}
