package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

abstract class IllIlllIllIIIIllllII extends IlllllllIIIlIIIlIlII
{
    protected lIllIlIIIllllllIIlII IlIIIlIlIIIllIlIlIIl;
    private static volatile /* synthetic */ int[] llllIIIIlIIIlIlllIll;
    private static volatile /* synthetic */ int[] IlIlIlIlIlllllllllIl;
    
    public IllIlllIllIIIIllllII() {
        this.IlIIIlIlIIIllIlIlIIl = lIllIlIIIllllllIIlII.llllIIIIlIIIlIlllIll;
    }
    
    protected IllIlllIllIIIIllllII(final int n) {
        super(n);
        this.IlIIIlIlIIIllIlIlIIl = lIllIlIIIllllllIIlII.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("EntryDoor", this.IlIIIlIlIIIllIlIlIIl.name());
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIIIlIlIIIllIlIlIIl = lIllIlIIIllllllIIlII.valueOf(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("EntryDoor"));
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final lIllIlIIIllllllIIlII lIllIlIIIllllllIIlII, final int n, final int n2, final int n3) {
        switch (llllIIIlIlllIlIIIIIl()[lIllIlIIIllllllIIlII.ordinal()]) {
            default: {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n, n2, n3, n + 3 - 1, n2 + 3 - 1, n3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
                break;
            }
            case 2: {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n, n2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n, n2 + 1, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n, n2 + 2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n + 1, n2 + 2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n + 2, n2 + 2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n + 2, n2 + 1, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n + 2, n2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII.lllIllIIIllllllIllll(), n + 1, n2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI(8), n + 1, n2 + 1, n3, ilIlIIIlIIlIlIIlllIl);
                break;
            }
            case 3: {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), n + 1, n2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), n + 1, n2 + 1, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), n, n2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), n, n2 + 1, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), n, n2 + 2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), n + 1, n2 + 2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), n + 2, n2 + 2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), n + 2, n2 + 1, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m.lllIllIIIllllllIllll(), n + 2, n2, n3, ilIlIIIlIIlIlIIlllIl);
                break;
            }
            case 4: {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n, n2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n, n2 + 1, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n, n2 + 2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n + 1, n2 + 2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n + 2, n2 + 2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n + 2, n2 + 1, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), n + 2, n2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII.lllIllIIIllllllIllll(), n + 1, n2, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII.llIllIIIIIllIlIIIIlI(8), n + 1, n2 + 1, n3, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll, 4)), n + 2, n2 + 1, n3 + 1, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll, 3)), n + 2, n2 + 1, n3 - 1, ilIlIIIlIIlIlIIlllIl);
                break;
            }
        }
    }
    
    protected lIllIlIIIllllllIIlII llllIIIIlIIIlIlllIll(final Random random) {
        switch (random.nextInt(5)) {
            default: {
                return lIllIlIIIllllllIIlII.llllIIIIlIIIlIlllIll;
            }
            case 2: {
                return lIllIlIIIllllllIIlII.IlIlIlIlIlllllllllIl;
            }
            case 3: {
                return lIllIlIIIllllllIIlII.llIllIIIIIllIlIIIIlI;
            }
            case 4: {
                return lIllIlIIIllllllIIlII.IlIIIlIlIIIllIlIlIIl;
            }
        }
    }
    
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final llllllIIIIIIIlllIIll llllllIIIIIIIlllIIll, final List list, final Random random, final int n, final int n2) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (lIIIIlIIIIIlllIllIII()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n2, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, this.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 4: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n2, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, this.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 5: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n2, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n, this.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 6: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n2, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n, this.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                }
            }
        }
        return null;
    }
    
    protected IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl(final llllllIIIIIIIlllIIll llllllIIIIIIIlllIIll, final List list, final Random random, final int n, final int n2) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (lIIIIlIIIIIlllIllIII()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 4: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 5: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 6: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl());
                }
            }
        }
        return null;
    }
    
    protected IlllllllIIIlIIIlIlII llIllIIIIIllIlIIIIlI(final llllllIIIIIIIlllIIll llllllIIIIIIIlllIIll, final List list, final Random random, final int n, final int n2) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (lIIIIlIIIIIlllIllIII()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 4: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 5: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 6: {
                    return llIllIIIIIllIlIIIIlI(llllllIIIIIIIlllIIll, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl());
                }
            }
        }
        return null;
    }
    
    protected static boolean llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        return ilIlIIIlIIlIlIIlllIl != null && ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl > 10;
    }
    
    static /* synthetic */ int[] llllIIIlIlllIlIIIIIl() {
        final int[] llllIIIIlIIIlIlllIll = IllIlllIllIIIIllllII.llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll != null) {
            return llllIIIIlIIIlIlllIll;
        }
        final int[] llllIIIIlIIIlIlllIll2 = new int[lIllIlIIIllllllIIlII.values().length];
        try {
            llllIIIIlIIIlIlllIll2[lIllIlIIIllllllIIlII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIIIlIIIlIlllIll2[lIllIlIIIllllllIIlII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIIIlIIIlIlllIll2[lIllIlIIIllllllIIlII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIIIlIIIlIlllIll2[lIllIlIIIllllllIIlII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return IllIlllIllIIIIllllII.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
    }
    
    static /* synthetic */ int[] lIIIIlIIIIIlllIllIII() {
        final int[] ilIlIlIlIlllllllllIl = IllIlllIllIIIIllllII.IlIlIlIlIlllllllllIl;
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
        return IllIlllIllIIIIllllII.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
    }
}
