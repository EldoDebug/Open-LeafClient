package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class llIllIlIlIIIIIIIllII extends IIlIlIlIIlIllIIIIIIl
{
    public llIllIlIlIIIIIIIllII() {
    }
    
    public llIllIlIlIIIIIIIllII(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        this.llllIIIIlIIIlIlllIll((IllIllIlllIllllIIllI)illlllllIIIlIIIlIlII, list, random, 5, 3, true);
        this.llllIIIIlIIIlIlllIll((IllIllIlllIllllIIllI)illlllllIIIlIIIlIlII, list, random, 5, 11, true);
    }
    
    public static llIllIlIlIIIIIIIllII llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, -5, -3, 0, 13, 14, 13, lllIllIIIllllllIllll);
        return (IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new llIllIlIlIIIIIIIllII(n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 0, 12, 4, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 0, 12, 13, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 0, 1, 12, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 5, 0, 12, 12, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 5, 11, 4, 12, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 5, 11, 10, 12, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 9, 11, 7, 12, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 5, 0, 4, 12, 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 5, 0, 10, 12, 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 9, 0, 7, 12, 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 11, 2, 10, 12, 10, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        for (int i = 1; i <= 11; i += 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, i, 10, 0, i, 11, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, i, 10, 12, i, 11, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 10, i, 0, 11, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 12, 10, i, 12, 11, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), i, 13, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), i, 13, 12, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), 0, 13, i, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), 12, 13, i, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), i + 1, 13, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), i + 1, 13, 12, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), 0, 13, i + 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), 12, 13, i + 1, ilIlIIIlIIlIlIIlllIl);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), 0, 13, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), 0, 13, 12, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), 0, 13, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), 12, 13, 0, ilIlIIIlIIlIlIIlllIl);
        for (int j = 3; j <= 9; j += 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 7, j, 1, 8, j, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 7, j, 11, 8, j, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
        }
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E, 3);
        for (int k = 0; k <= 6; ++k) {
            final int n = k + 4;
            for (int l = 5; l <= 7; ++l) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), l, 5 + k, n, ilIlIIIlIIlIlIIlllIl);
            }
            if (n >= 5 && n <= 8) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 5, n, 7, k + 4, n, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
            }
            else if (n >= 9 && n <= 10) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 8, n, 7, k + 4, n, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
            }
            if (k >= 1) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 6 + k, n, 7, 9 + k, n, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            }
        }
        for (int n2 = 5; n2 <= 7; ++n2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), n2, 12, 11, ilIlIIIlIIlIlIIlllIl);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 6, 7, 5, 7, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 6, 7, 7, 7, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 13, 12, 7, 13, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 5, 2, 3, 5, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 5, 9, 3, 5, 10, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 5, 4, 2, 5, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 5, 2, 10, 5, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 5, 9, 10, 5, 10, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 5, 4, 10, 5, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E, 0);
        final int llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E, 1);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 4, 5, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 4, 5, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 4, 5, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 4, 5, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), 8, 5, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), 8, 5, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), 8, 5, 9, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), 8, 5, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 4, 4, 4, 4, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 4, 4, 9, 4, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 5, 4, 4, 5, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.F.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.F.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 5, 4, 9, 5, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.F.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.F.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 2, 0, 8, 2, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 4, 12, 2, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 0, 0, 8, 1, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 0, 9, 8, 1, 12, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 4, 3, 1, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 0, 4, 12, 1, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        for (int n3 = 4; n3 <= 8; ++n3) {
            for (int n4 = 0; n4 <= 2; ++n4) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), n3, -1, n4, ilIlIIIlIIlIlIIlllIl);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), n3, -1, 12 - n4, ilIlIIIlIIlIlIIlllIl);
            }
        }
        for (int n5 = 0; n5 <= 2; ++n5) {
            for (int n6 = 4; n6 <= 8; ++n6) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), n5, -1, n6, ilIlIIIlIIlIlIIlllIl);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), 12 - n5, -1, n6, ilIlIIIlIIlIlIIlllIl);
            }
        }
        return true;
    }
}
