package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public class IIlllIlIIllIlIlIlIIl extends IlllllllIIIlIIIlIlII
{
    private lllIllIIIllllllIllll llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private static volatile /* synthetic */ int[] llIllIIIIIllIlIIIIlI;
    
    public IIlllIlIIllIlIlIlIIl() {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("tf", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("D", this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("tf");
        this.llllIIIIlIIIlIlllIll = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("D"));
    }
    
    public IIlllIlIIllIlIlIlIIl(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll llllIIIIlIIIlIlllIll) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl = (ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl() > 3);
    }
    
    public static IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl(n, n2, n3, n, n2 + 2, n3);
        if (random.nextInt(4) == 0) {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 = ilIlIIIlIIlIlIIlllIl;
            ilIlIIIlIIlIlIIlllIl2.IlIlIIIllIllIIIIIllI += 4;
        }
        switch (llllIIIIlIIIlIlllIll()[lllIllIIIllllllIllll.ordinal()]) {
            case 3: {
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll = n - 1;
                ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = n + 3;
                ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI = n3 - 4;
                break;
            }
            case 4: {
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll = n - 1;
                ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = n + 3;
                ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl = n3 + 4;
                break;
            }
            case 5: {
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll = n - 4;
                ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI = n3 - 1;
                ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl = n3 + 3;
                break;
            }
            case 6: {
                ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = n + 4;
                ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI = n3 - 1;
                ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl = n3 + 3;
                break;
            }
        }
        return (IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, ilIlIIIlIIlIlIIlllIl) != null) ? null : ilIlIIIlIIlIlIIlllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        switch (llllIIIIlIIIlIlllIll()[this.llllIIIIlIIIlIlllIll.ordinal()]) {
            case 3: {
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl);
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                break;
            }
            case 4: {
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl);
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl);
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                break;
            }
            case 5: {
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl);
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl);
                break;
            }
            case 6: {
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl);
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                break;
            }
        }
        if (this.IlIlIlIlIlllllllllIl) {
            if (random.nextBoolean()) {
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 3 + 1, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
            }
            if (random.nextBoolean()) {
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 3 + 1, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl);
            }
            if (random.nextBoolean()) {
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 3 + 1, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
            }
            if (random.nextBoolean()) {
                IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 3 + 1, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl)) {
            return false;
        }
        if (this.IlIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 3 - 1, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 3 - 1, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI - 2, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI - 2, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 3, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 3, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        else {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 1, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 1, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        for (int i = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll; i <= this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl; ++i) {
            for (int j = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI; j <= this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl; ++j) {
                if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, i, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1, j, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), i, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1, j, ilIlIIIlIIlIlIIlllIl);
                }
            }
        }
        return true;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] llIllIIIIIllIlIIIIlI = IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI != null) {
            return llIllIIIIIllIlIIIIlI;
        }
        final int[] llIllIIIIIllIlIIIIlI2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
}
