package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl extends llIllIIIIIllIlIIIIlI
{
    private boolean[] lIIIIlIIIIIlllIllIII;
    private static final List lIIIlllIIIllIIIllIII;
    
    static {
        lIIIlllIIIllIIIllIII = Lists.newArrayList((Object[])new k[] { new k(IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, 0, 1, 3, 3), new k(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, 0, 1, 5, 10), new k(IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI, 0, 2, 7, 15), new k(IIllIIllIIIlIlIIIIlI.S, 0, 1, 3, 2), new k(IIllIIllIIIlIlIIIIlI.b, 0, 4, 6, 20), new k(IIllIIllIIIlIlIIIIlI.x, 0, 3, 7, 16), new k(IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII, 0, 1, 1, 3), new k(IIllIIllIIIlIlIIIIlI.ao, 0, 1, 1, 1), new k(IIllIIllIIIlIlIIIIlI.ap, 0, 1, 1, 1), new k(IIllIIllIIIlIlIIIIlI.aq, 0, 1, 1, 1) });
    }
    
    public IlIlIlIlIlllllllllIl() {
        this.lIIIIlIIIIIlllIllIII = new boolean[4];
    }
    
    public IlIlIlIlIlllllllllIl(final Random random, final int n, final int n2) {
        super(random, n, 64, n2, 21, 15, 21);
        this.lIIIIlIIIIIlllIllIII = new boolean[4];
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("hasPlacedChest0", this.lIIIIlIIIIIlllIllIII[0]);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("hasPlacedChest1", this.lIIIIlIIIIIlllIllIII[1]);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("hasPlacedChest2", this.lIIIIlIIIIIlllIllIII[2]);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("hasPlacedChest3", this.lIIIIlIIIIIlllIllIII[3]);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lIIIIlIIIIIlllIllIII[0] = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("hasPlacedChest0");
        this.lIIIIlIIIIIlllIllIII[1] = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("hasPlacedChest1");
        this.lIIIIlIIIIIlllIllIII[2] = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("hasPlacedChest2");
        this.lIIIIlIIIIIlllIllIII[3] = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("hasPlacedChest3");
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, -4, 0, this.llllIIIIlIIIlIlllIll - 1, 0, this.llIllIIIIIllIlIIIIlI - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        for (int i = 1; i <= 9; ++i) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, i, i, i, this.llllIIIIlIIIlIlllIll - 1 - i, i, this.llIllIIIIIllIlIIIIlI - 1 - i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, i + 1, i, i + 1, this.llllIIIIlIIIlIlllIll - 2 - i, i, this.llIllIIIIIllIlIIIIlI - 2 - i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        for (int j = 0; j < this.llllIIIIlIIIlIlllIll; ++j) {
            for (int k = 0; k < this.llIllIIIIIllIlIIIIlI; ++k) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), j, -5, k, ilIlIIIlIIlIlIIlllIl);
            }
        }
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S, 3);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S, 2);
        final int llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S, 0);
        final int llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S, 1);
        final int n = ~net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() & 0xF;
        final int n2 = ~net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI() & 0xF;
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 4, 9, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 10, 1, 3, 10, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 2, 10, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), 2, 10, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 0, 10, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll4), 4, 10, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.llllIIIIlIIIlIlllIll - 5, 0, 0, this.llllIIIIlIIIlIlllIll - 1, 9, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.llllIIIIlIIIlIlllIll - 4, 10, 1, this.llllIIIIlIIIlIlllIll - 2, 10, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), this.llllIIIIlIIIlIlllIll - 3, 10, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), this.llllIIIIlIIIlIlllIll - 3, 10, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), this.llllIIIIlIIIlIlllIll - 5, 10, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll4), this.llllIIIIlIIIlIlllIll - 1, 10, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 0, 0, 12, 4, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 1, 0, 11, 3, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 9, 1, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 9, 2, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 9, 3, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 10, 3, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 11, 3, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 11, 2, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 11, 1, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 1, 1, 8, 3, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 1, 2, 8, 2, 2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 12, 1, 1, 16, 3, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 12, 1, 2, 16, 2, 2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 4, 5, this.llllIIIIlIIIlIlllIll - 6, 4, this.llIllIIIIIllIlIIIIlI - 6, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 4, 9, 11, 4, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 1, 8, 8, 3, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 12, 1, 8, 12, 3, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 1, 12, 8, 3, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 12, 1, 12, 12, 3, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 5, 4, 4, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.llllIIIIlIIIlIlllIll - 5, 1, 5, this.llllIIIIlIIIlIlllIll - 2, 4, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 7, 9, 6, 7, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.llllIIIIlIIIlIlllIll - 7, 7, 9, this.llllIIIIlIIIlIlllIll - 7, 7, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 5, 9, 5, 7, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.llllIIIIlIIIlIlllIll - 6, 5, 9, this.llllIIIIlIIIlIlllIll - 6, 7, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 5, 5, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 5, 6, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 6, 6, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), this.llllIIIIlIIIlIlllIll - 6, 5, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), this.llllIIIIlIIIlIlllIll - 6, 6, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), this.llllIIIIlIIIlIlllIll - 7, 6, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 4, 4, 2, 6, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.llllIIIIlIIIlIlllIll - 3, 4, 4, this.llllIIIIlIIIlIlllIll - 3, 6, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 2, 4, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 2, 3, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), this.llllIIIIlIIIlIlllIll - 3, 4, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), this.llllIIIIlIIIlIlllIll - 3, 3, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 3, 2, 2, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.llllIIIIlIIIlIlllIll - 3, 1, 3, this.llllIIIIlIIIlIlllIll - 2, 2, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.lllIllIIIllllllIllll(), 1, 1, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.lllIllIIIllllllIllll(), this.llllIIIIlIIIlIlllIll - 2, 1, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(cy.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), 1, 2, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(cy.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), this.llllIIIIlIIIlIlllIll - 2, 2, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll4), 2, 1, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), this.llllIIIIlIIIlIlllIll - 3, 1, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 3, 5, 4, 3, 18, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.llllIIIIlIIIlIlllIll - 5, 3, 5, this.llllIIIIlIIIlIlllIll - 5, 3, 17, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 5, 4, 2, 16, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.llllIIIIlIIIlIlllIll - 6, 1, 5, this.llllIIIIlIIIlIlllIll - 5, 2, 16, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        for (int l = 5; l <= 17; l += 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 4, 1, l, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), 4, 2, l, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), this.llllIIIIlIIIlIlllIll - 5, 1, l, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), this.llllIIIIlIIIlIlllIll - 5, 2, l, ilIlIIIlIIlIlIIlllIl);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 10, 0, 7, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 10, 0, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 9, 0, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 11, 0, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 8, 0, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 12, 0, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 7, 0, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 13, 0, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 9, 0, 11, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 11, 0, 11, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 10, 0, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 10, 0, 13, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n2), 10, 0, 10, ilIlIIIlIIlIlIIlllIl);
        for (int n3 = 0; n3 <= this.llllIIIIlIIIlIlllIll - 1; n3 += this.llllIIIIlIIIlIlllIll - 1) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n3, 2, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 2, 2, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n3, 2, 3, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n3, 3, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 3, 2, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n3, 3, 3, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 4, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), n3, 4, 2, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 4, 3, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n3, 5, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 5, 2, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n3, 5, 3, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 6, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), n3, 6, 2, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 6, 3, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 7, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 7, 2, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n3, 7, 3, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n3, 8, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n3, 8, 2, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n3, 8, 3, ilIlIIIlIIlIlIIlllIl);
        }
        for (int n4 = 2; n4 <= this.llllIIIIlIIIlIlllIll - 3; n4 += this.llllIIIIlIIIlIlllIll - 3 - 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n4 - 1, 2, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4, 2, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n4 + 1, 2, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n4 - 1, 3, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4, 3, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n4 + 1, 3, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4 - 1, 4, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), n4, 4, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4 + 1, 4, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n4 - 1, 5, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4, 5, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n4 + 1, 5, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4 - 1, 6, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), n4, 6, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4 + 1, 6, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4 - 1, 7, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4, 7, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), n4 + 1, 7, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n4 - 1, 8, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n4, 8, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), n4 + 1, 8, 0, ilIlIIIlIIlIlIIlllIl);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 4, 0, 12, 6, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 8, 6, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 12, 6, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 9, 5, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), 10, 5, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.llIllIIIIIllIlIIIIlI(n), 11, 5, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, -14, 8, 12, -11, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, -10, 8, 12, -10, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, -9, 8, 12, -9, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, -8, 8, 12, -1, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, -11, 9, 11, -1, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIIlIlIIIlIIIIlIl.lllIllIIIllllllIllll(), 10, -11, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, -13, 9, 11, -13, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 8, -11, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 8, -10, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), 7, -10, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 7, -11, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 12, -11, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 12, -10, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), 13, -10, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 13, -11, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 10, -11, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 10, -10, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), 10, -10, 7, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 10, -11, 7, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 10, -11, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 10, -10, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), 10, -10, 13, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()), 10, -11, 13, ilIlIIIlIIlIlIIlllIl);
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            if (!this.lIIIIlIIIIIlllIllIII[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI()]) {
                this.lIIIIlIIIIIlllIllIII[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI()] = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 10 + lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII() * 2, -11, 10 + lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl() * 2, k.llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII, IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(random)), 2 + random.nextInt(5));
            }
        }
        return true;
    }
}
