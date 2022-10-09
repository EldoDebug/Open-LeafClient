package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IlIIIlIlIIIllIlIlIIl extends llIllIIIIIllIlIIIIlI
{
    private boolean lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    private static final List lIlIlIIIllIIllIIIllI;
    private static final List IlIlIIIllIIllIlllllI;
    private static IlIlIIIllIllIIIIIllI IIIIlllIIIIIIlIIIlll;
    
    static {
        lIlIlIIIllIIllIIIllI = Lists.newArrayList((Object[])new k[] { new k(IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, 0, 1, 3, 3), new k(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, 0, 1, 5, 10), new k(IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI, 0, 2, 7, 15), new k(IIllIIllIIIlIlIIIIlI.S, 0, 1, 3, 2), new k(IIllIIllIIIlIlIIIIlI.b, 0, 4, 6, 20), new k(IIllIIllIIIlIlIIIIlI.x, 0, 3, 7, 16), new k(IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII, 0, 1, 1, 3), new k(IIllIIllIIIlIlIIIIlI.ao, 0, 1, 1, 1), new k(IIllIIllIIIlIlIIIIlI.ap, 0, 1, 1, 1), new k(IIllIIllIIIlIlIIIIlI.aq, 0, 1, 1, 1) });
        IlIlIIIllIIllIlllllI = Lists.newArrayList((Object[])new k[] { new k(IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl, 0, 2, 7, 30) });
        IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll = new IlIlIIIllIllIIIIIllI(null);
    }
    
    public IlIIIlIlIIIllIlIlIIl() {
    }
    
    public IlIIIlIlIIIllIlIlIIl(final Random random, final int n, final int n2) {
        super(random, n, 64, n2, 12, 10, 15);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("placedMainChest", this.lIIIIlIIIIIlllIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("placedHiddenChest", this.lIIIlllIIIllIIIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("placedTrap1", this.llIIlIIIlIIIllIlIIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("placedTrap2", this.llIllIlIIIIllIlIIllI);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("placedMainChest");
        this.lIIIlllIIIllIIIllIII = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("placedHiddenChest");
        this.llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("placedTrap1");
        this.llIllIlIIIIllIlIIllI = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("placedTrap2");
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (!this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0)) {
            return false;
        }
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII, 3);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII, 2);
        final int llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII, 0);
        final int llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII, 1);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, -4, 0, this.llllIIIIlIIIlIlllIll - 1, 0, this.llIllIIIIIllIlIIIIlI - 1, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 2, 9, 2, 2, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 12, 9, 2, 12, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 3, 2, 2, 11, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 1, 3, 9, 2, 11, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 1, 10, 6, 1, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 13, 10, 6, 13, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 2, 1, 6, 12, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 3, 2, 10, 6, 12, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 3, 2, 9, 3, 12, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 6, 2, 9, 6, 12, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 7, 3, 8, 7, 11, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 8, 4, 7, 8, 10, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 3, 8, 2, 11);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 3, 6, 7, 3, 9);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 4, 2, 9, 5, 12);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 6, 5, 7, 6, 9);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 7, 6, 6, 7, 8);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 2, 6, 2, 2);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 2, 12, 6, 2, 12);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 5, 1, 6, 5, 1);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 5, 13, 6, 5, 13);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 1, 5, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 10, 5, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 1, 5, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 10, 5, 9, ilIlIIIlIIlIlIIlllIl);
        for (int i = 0; i <= 14; i += 14) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 4, i, 2, 5, i, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 4, i, 4, 5, i, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 4, i, 7, 5, i, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 4, i, 9, 5, i, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 6, 0, 6, 6, 0, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        for (int j = 0; j <= 11; j += 11) {
            for (int k = 2; k <= 12; k += 2) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, j, 4, k, j, 5, k, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, j, 6, 5, j, 6, 5, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, j, 6, 9, j, 6, 9, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 7, 2, 2, 9, 2, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 7, 2, 9, 9, 2, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 7, 12, 2, 9, 12, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 7, 12, 9, 9, 12, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 9, 4, 4, 9, 4, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 9, 4, 7, 9, 4, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 9, 10, 4, 9, 10, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 9, 10, 7, 9, 10, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 9, 7, 6, 9, 7, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 5, 9, 6, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 6, 9, 6, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), 5, 9, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), 6, 9, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 4, 0, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 5, 0, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 6, 0, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 7, 0, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 4, 1, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 4, 2, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 4, 3, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 7, 1, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 7, 2, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 7, 3, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 1, 9, 4, 1, 9, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 9, 7, 1, 9, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 1, 10, 7, 2, 10, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 4, 5, 6, 4, 5, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 4, 4, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll4), 7, 4, 5, ilIlIIIlIIlIlIIlllIl);
        for (int l = 0; l < 4; ++l) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), 5, 0 - l, 6 + l, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), 6, 0 - l, 6 + l, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 0 - l, 7 + l, 6, 0 - l, 9 + l);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, -3, 12, 10, -1, 13);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, -3, 1, 3, -1, 13);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, -3, 1, 9, -1, 5);
        for (int n = 1; n <= 13; n += 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, -3, n, 1, -2, n, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        }
        for (int n2 = 2; n2 <= 12; n2 += 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, -1, n2, 3, -1, n2, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, -2, 1, 5, -2, 1, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, -2, 1, 9, -2, 1, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, -3, 1, 6, -3, 1, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, -1, 1, 6, -1, 1, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(dj.IlllIIIIlIIIlIlIlIIl, true), 1, -3, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(dj.IlllIIIIlIIIlIlIlIIl, true), 4, -3, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.W.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(di.IlllIIIIlIIIlIlIlIIl, true), 2, -3, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.W.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(di.IlllIIIIlIIIlIlIlIIl, true), 3, -3, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 5, -3, 7, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 5, -3, 6, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 5, -3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 5, -3, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 5, -3, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 5, -3, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 5, -3, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 4, -3, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 3, -3, 1, ilIlIIIlIIlIlIIlllIl);
        if (!this.llIIlIIIlIIIllIlIIIl) {
            this.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 3, -2, 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), IlIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI, 2);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r.llIllIIIIIllIlIIIIlI(15), 3, -2, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(dj.IlllIIIIlIIIlIlIlIIl, true), 7, -3, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(dj.IlllIIIIlIIIlIlIlIIl, true), 7, -3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.W.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(di.IlllIIIIlIIIlIlIlIIl, true), 7, -3, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.W.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(di.IlllIIIIlIIIlIlIlIIl, true), 7, -3, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.W.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(di.IlllIIIIlIIIlIlIlIIl, true), 7, -3, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 8, -3, 6, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 9, -3, 6, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 9, -3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 9, -3, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 9, -2, 4, ilIlIIIlIIlIlIIlllIl);
        if (!this.llIllIlIIIIllIlIIllI) {
            this.llIllIlIIIIllIlIIllI = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 9, -2, 3, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), IlIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI, 2);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r.llIllIIIIIllIlIIIIlI(15), 8, -1, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r.llIllIIIIIllIlIIIIlI(15), 8, -2, 3, ilIlIIIlIIlIlIIlllIl);
        if (!this.lIIIIlIIIIIlllIllIII) {
            this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 8, -3, 3, k.llllIIIIlIIIlIlllIll(IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI, IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(random)), 2 + random.nextInt(5));
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 9, -3, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 8, -3, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 4, -3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 5, -2, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 5, -1, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 6, -3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 7, -2, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 7, -1, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 8, -3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, -1, 1, 9, -1, 5, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, -3, 8, 10, -1, 10);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.llIllIIIIIllIlIIIIlI(cv.llIllIlIlIIIIIIIllII), 8, -2, 11, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.llIllIIIIIllIlIIIIlI(cv.llIllIlIlIIIIIIIllII), 9, -2, 11, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.llIllIIIIIllIlIIIIlI(cv.llIllIlIlIIIIIIIllII), 10, -2, 11, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll.llIllIIIIIllIlIIIIlI(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl())))), 8, -2, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll.llIllIIIIIllIlIIIIlI(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl())))), 9, -2, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll.llIllIIIIIllIlIIIIlI(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl())))), 10, -2, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, -3, 8, 8, -3, 10, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, -3, 8, 10, -3, 10, false, random, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 10, -2, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 8, -2, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 8, -2, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl.lllIllIIIllllllIllll(), 10, -1, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), 9, -2, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl())), 10, -2, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl())), 10, -1, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.f.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.f, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI())), 10, -2, 10, ilIlIIIlIIlIlIIlllIl);
        if (!this.lIIIlllIIIllIIIllIII) {
            this.lIIIlllIIIllIIIllIII = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 9, -3, 10, k.llllIIIIlIIIlIlllIll(IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI, IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(random)), 2 + random.nextInt(5));
        }
        return true;
    }
}
