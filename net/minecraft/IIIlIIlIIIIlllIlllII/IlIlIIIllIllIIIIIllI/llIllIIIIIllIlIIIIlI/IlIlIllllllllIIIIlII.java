package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class IlIlIllllllllIIIIlII extends IlllllllIIIlIIIlIlII
{
    private boolean llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private static volatile /* synthetic */ int[] lIIIIlIIIIIlllIllIII;
    
    public IlIlIllllllllIIIIlII() {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("hr", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("sc", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("hps", this.llIllIIIIIllIlIIIIlI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Num", this.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("hr");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("sc");
        this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("hps");
        this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Num");
    }
    
    public IlIlIllllllllIIIIlII(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = (random.nextInt(3) == 0);
        this.IlIlIlIlIlllllllllIl = (!this.llllIIIIlIIIlIlllIll && random.nextInt(23) == 0);
        if (this.IllIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && this.IllIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI() / 5;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI() / 5;
        }
    }
    
    public static IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl(n, n2, n3, n, n2 + 2, n3);
        int i;
        for (i = random.nextInt(3) + 2; i > 0; --i) {
            final int n4 = i * 5;
            switch (llllIIIIlIIIlIlllIll()[lllIllIIIllllllIllll.ordinal()]) {
                case 3: {
                    ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = n + 2;
                    ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI = n3 - (n4 - 1);
                    break;
                }
                case 4: {
                    ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = n + 2;
                    ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl = n3 + (n4 - 1);
                    break;
                }
                case 5: {
                    ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll = n - (n4 - 1);
                    ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl = n3 + 2;
                    break;
                }
                case 6: {
                    ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = n + (n4 - 1);
                    ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl = n3 + 2;
                    break;
                }
            }
            if (IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, ilIlIIIlIIlIlIIlllIl) == null) {
                break;
            }
        }
        return (i > 0) ? ilIlIIIlIIlIlIIlllIl : null;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final int nextInt = random.nextInt(4);
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIIlIIIlIlllIll()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    if (nextInt <= 1) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, this.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                        break;
                    }
                    if (nextInt == 2) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl);
                        break;
                    }
                    IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                    break;
                }
                case 4: {
                    if (nextInt <= 1) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, this.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                        break;
                    }
                    if (nextInt == 2) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 3, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl);
                        break;
                    }
                    IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 3, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                    break;
                }
                case 5: {
                    if (nextInt <= 1) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, this.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                        break;
                    }
                    if (nextInt == 2) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
                        break;
                    }
                    IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl);
                    break;
                }
                case 6: {
                    if (nextInt <= 1) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, this.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                        break;
                    }
                    if (nextInt == 2) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 3, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
                        break;
                    }
                    IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 3, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1 + random.nextInt(3), this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl);
                    break;
                }
            }
        }
        if (ilIIIlIlIIIllIlIlIIl < 8) {
            if (this.IllIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && this.IllIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                for (int n = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 3; n + 3 <= this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl; n += 5) {
                    final int nextInt2 = random.nextInt(5);
                    if (nextInt2 == 0) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, n, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl + 1);
                    }
                    else if (nextInt2 == 1) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, n, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl + 1);
                    }
                }
            }
            else {
                for (int n2 = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 3; n2 + 3 <= this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl; n2 += 5) {
                    final int nextInt3 = random.nextInt(5);
                    if (nextInt3 == 0) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, n2, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl + 1);
                    }
                    else if (nextInt3 == 1) {
                        IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, n2, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl + 1);
                    }
                }
            }
        }
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final Random random, final int n, final int n2, final int n3, final List list, final int n4) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(n, n3), this.llllIIIIlIIIlIlllIll(n2), this.IlIlIlIlIlllllllllIl(n, n3));
        if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll, (int)(random.nextBoolean() ? 1 : 0))), 2);
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = new IlIlIIIllIIllIlllllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f);
            k.llllIIIIlIIIlIlllIll(random, list, ilIlIIIllIIllIlllllI, n4);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl)) {
            return false;
        }
        final int n = this.IlIIIlIlIIIllIlIlIIl * 5 - 1;
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 2, 1, n, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.8f, 0, 2, 0, 2, 2, n, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        if (this.IlIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.6f, 0, 0, 0, 2, 1, n, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl; ++i) {
            final int n2 = 2 + i * 5;
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, n2, 0, 1, n2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 0, n2, 2, 1, n2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            if (random.nextInt(4) == 0) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, n2, 0, 2, n2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 2, n2, 2, 2, n2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            }
            else {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, n2, 2, 2, n2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.1f, 0, 2, n2 - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.lllIllIIIllllllIllll());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.1f, 2, 2, n2 - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.lllIllIIIllllllIllll());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.1f, 0, 2, n2 + 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.lllIllIIIllllllIllll());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.1f, 2, 2, n2 + 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.lllIllIIIllllllIllll());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.05f, 0, 2, n2 - 2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.lllIllIIIllllllIllll());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.05f, 2, 2, n2 - 2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.lllIllIIIllllllIllll());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.05f, 0, 2, n2 + 2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.lllIllIIIllllllIllll());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.05f, 2, 2, n2 + 2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.lllIllIIIllllllIllll());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.05f, 1, 2, n2 - 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.llIllIIIIIllIlIIIIlI(lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()));
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.05f, 1, 2, n2 + 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.llIllIIIIIllIlIIIIlI(lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()));
            if (random.nextInt(100) == 0) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 2, 0, n2 - 1, k.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(random)), 3 + random.nextInt(4));
            }
            if (random.nextInt(100) == 0) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0, 0, n2 + 1, k.llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(random)), 3 + random.nextInt(4));
            }
            if (this.IlIlIlIlIlllllllllIl && !this.llIllIIIIIllIlIIIIlI) {
                final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(0);
                final int n3 = n2 - 1 + random.nextInt(3);
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(1, n3), llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl(1, n3));
                if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
                    this.llIllIIIIIllIlIIIIlI = true;
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI.lllIllIIIllllllIllll(), 2);
                    final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                    if (llllIIIIlIIIlIlllIll2 instanceof IIlllIlIIllIlIlIlIIl) {
                        ((IIlllIlIIllIlIlIlIIl)llllIIIIlIIIlIlllIll2).IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll("CaveSpider");
                    }
                }
            }
        }
        for (int j = 0; j <= 2; ++j) {
            for (int k = 0; k <= n; ++k) {
                if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, j, -1, k, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), j, -1, k, ilIlIIIlIIlIlIIlllIl);
                }
            }
        }
        if (this.llllIIIIlIIIlIlllIll) {
            for (int l = 0; l <= n; ++l) {
                final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 1, -1, l, ilIlIIIlIIlIlIIlllIl);
                if (llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.7f, 1, 0, l, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll, 0)));
                }
            }
        }
        return true;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] liiiIlIIIIIlllIllIII = IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII != null) {
            return liiiIlIIIIIlllIllIII;
        }
        final int[] liiiIlIIIIIlllIllIII2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII2;
    }
}
