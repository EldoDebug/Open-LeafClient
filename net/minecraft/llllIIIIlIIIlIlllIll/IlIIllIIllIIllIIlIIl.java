package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlIIllIIllIIllIIlIIl extends llllIIIIlIIIlIlllIll
{
    public IlIIllIIllIIllIIlIIl() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI);
        this.llllIIIIlIIIlIlllIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 1.0f, 0.9375f);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII));
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    private void lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (IlIIlllllIIllIIlllll.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 0) {
            final int n = 32;
            if (!IlIIlllllIIllIIlllll.IlllIIIIlIIIlIlIlIIl && illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-n, -n, -n), ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n, n))) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, this.lllIllIIIllllllIllll()));
            }
            else {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
                net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2;
                for (ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl; IlIIlllllIIllIIlllll.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2) && ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() > 0; ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl()) {}
                if (ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() > 0) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, this.lllIllIIIllllllIllll(), 2);
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        this.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    private void llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
            for (int i = 0; i < 1000; ++i) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(16) - illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(16), illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(8) - illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(8), illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(16) - illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(16));
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                        for (int j = 0; j < 128; ++j) {
                            final double nextDouble = illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextDouble();
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() + (ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) * nextDouble + (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextDouble() - 0.5) * 1.0 + 0.5, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() + (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()) * nextDouble + illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextDouble() * 1.0 - 0.5, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() + (ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) * nextDouble + (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextDouble() - 0.5) * 1.0 + 0.5, (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() - 0.5f) * 0.2f, (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() - 0.5f) * 0.2f, (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() - 0.5f) * 0.2f, new int[0]);
                        }
                    }
                    else {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2, 2);
                        illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
                    }
                    return;
                }
            }
        }
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return 5;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return true;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return null;
    }
}
