package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class lllllIlIlIlllIlllIlI extends IllIlllIllIIIIllllII
{
    private boolean llllIIIIlIIIlIlllIll;
    private static volatile /* synthetic */ int[] IlIlIlIlIlllllllllIl;
    
    public lllllIlIlIlllIlllIlI() {
    }
    
    public lllllIlIlIlllIlllIlI(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Mob", this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Mob");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        if (illlllllIIIlIIIlIlII != null) {
            ((llllllIIIIIIIlllIIll)illlllllIIIlIIIlIlII).IlIlIlIlIlllllllllIl = this;
        }
    }
    
    public static lllllIlIlIlllIlllIlI llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, -4, -1, 0, 11, 8, 16, lllIllIIIllllllIllll);
        return (IllIlllIllIIIIllllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new lllllIlIlIlllIlllIlI(n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 10, 7, 15, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl, lIllIlIIIllllllIIlII.llIllIIIIIllIlIIIIlI, 4, 1, 0);
        final int n = 6;
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, n, 1, 1, n, 14, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, n, 1, 9, n, 14, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, n, 1, 8, n, 2, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, n, 14, 8, n, 14, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 1, 2, 1, 4, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 1, 1, 9, 1, 4, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 1, 1, 1, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 1, 1, 9, 1, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 8, 7, 1, 12, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 1, 9, 6, 1, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll(), false);
        for (int i = 3; i < 14; i += 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, i, 0, 4, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 3, i, 10, 4, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), false);
        }
        for (int j = 2; j < 9; j += 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, j, 3, 15, j, 4, 15, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), false);
        }
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.z, 3);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 1, 5, 6, 1, 7, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 2, 6, 6, 2, 7, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 3, 7, 6, 3, 7, false, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        for (int k = 4; k <= 6; ++k) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.z.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), k, 1, 4, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.z.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), k, 2, 5, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.z.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), k, 3, 6, ilIlIIIlIIlIlIIlllIl);
        }
        int n2 = lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
        int n3 = lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
        int n4 = lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
        int n5 = lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIIlIIIlIlllIll()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 4: {
                    n2 = lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
                    n3 = lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                    break;
                }
                case 5: {
                    n2 = lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
                    n3 = lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
                    n4 = lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
                    n5 = lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                    break;
                }
                case 6: {
                    n2 = lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
                    n3 = lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
                    n4 = lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
                    n5 = lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                    break;
                }
            }
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n2).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 4, 3, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n2).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 5, 3, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n2).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 6, 3, 8, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n3).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 4, 3, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n3).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 5, 3, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n3).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 6, 3, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n4).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 3, 3, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n4).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 3, 3, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n4).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 3, 3, 11, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n5).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 7, 3, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n5).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 7, 3, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K.llIllIIIIIllIlIIIIlI(n5).llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, random.nextFloat() > 0.9f), 7, 3, 11, ilIlIIIlIIlIlIIlllIl);
        if (!this.llllIIIIlIIIlIlllIll) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(5, 6), this.llllIIIIlIIIlIlllIll(3), this.IlIlIlIlIlllllllllIl(5, 6));
            if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
                this.llllIIIIlIIIlIlllIll = true;
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI.lllIllIIIllllllIllll(), 2);
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                if (llllIIIIlIIIlIlllIll2 instanceof IIlllIlIIllIlIlIlIIl) {
                    ((IIlllIlIIllIlIlIlIIl)llllIIIIlIIIlIlllIll2).IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll("Silverfish");
                }
            }
        }
        return true;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] ilIlIlIlIlllllllllIl = lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        final int[] ilIlIlIlIlllllllllIl2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
    }
}
