package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public abstract class IlllllllIIIlIIIlIlII
{
    protected IlIlIIIlIIlIlIIlllIl IlIlIIIllIllIIIIIllI;
    protected lllIllIIIllllllIllll IllIIlllIIIIlllIIlIl;
    protected int llllIIIlIlllIlIIIIIl;
    private static volatile /* synthetic */ int[] llllIIIIlIIIlIlllIll;
    
    public IlllllllIIIlIIIlIlII() {
    }
    
    protected IlllllllIIIlIIIlIlII(final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("id", IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BB", this.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("O", (this.IllIIlllIIIIlllIIlIl == null) ? -1 : this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("GD", this.llllIIIlIlllIlIIIIIl);
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        return iiiIlllIIIIIIlIIIlll;
    }
    
    protected abstract void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll p0);
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("BB")) {
            this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI("BB"));
        }
        final int illIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("O");
        this.IllIIlllIIIIlllIIlIl = ((illIIlllIIIIlllIIlIl == -1) ? null : lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl));
        this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("GD");
        this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    protected abstract void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll p0);
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
    }
    
    public abstract boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII p0, final Random p1, final IlIlIIIlIIlIlIIlllIl p2);
    
    public IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public static IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final List list, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        for (final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII : list) {
            if (illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI() != null && illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl)) {
                return illlllllIIIlIIIlIlII;
            }
        }
        return null;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI() {
        return new IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl());
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final int max = Math.max(this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll);
        final int max2 = Math.max(this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl - 1, ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl);
        final int max3 = Math.max(this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI);
        final int min = Math.min(this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl);
        final int min2 = Math.min(this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI + 1, ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI);
        final int min3 = Math.min(this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl);
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = max; i <= min; ++i) {
            for (int j = max3; j <= min3; ++j) {
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, max2, j)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
                    return true;
                }
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, min2, j)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
                    return true;
                }
            }
        }
        for (int k = max; k <= min; ++k) {
            for (int l = max2; l <= min2; ++l) {
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(k, l, max3)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
                    return true;
                }
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(k, l, min3)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
                    return true;
                }
            }
        }
        for (int n = max3; n <= min3; ++n) {
            for (int n2 = max2; n2 <= min2; ++n2) {
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(max, n2, n)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
                    return true;
                }
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(min, n2, n)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    protected int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (this.IllIIlllIIIIlllIIlIl == null) {
            return n;
        }
        switch (IllIIlllIIIIlllIIlIl()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
            case 3:
            case 4: {
                return this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n;
            }
            case 5: {
                return this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - n2;
            }
            case 6: {
                return this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2;
            }
            default: {
                return n;
            }
        }
    }
    
    protected int llllIIIIlIIIlIlllIll(final int n) {
        return (this.IllIIlllIIIIlllIIlIl == null) ? n : (n + this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
    }
    
    protected int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.IllIIlllIIIIlllIIlIl == null) {
            return n2;
        }
        switch (IllIIlllIIIIlllIIlIl()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
            case 3: {
                return this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - n2;
            }
            case 4: {
                return this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2;
            }
            case 5:
            case 6: {
                return this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n;
            }
            default: {
                return n2;
            }
        }
    }
    
    protected int llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll) {
            if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI || this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                if (n == 1) {
                    return 0;
                }
                return 1;
            }
        }
        else if (llllIIIIlIIIlIlllIll instanceof llIlIIIIIlIIlIlIIlll) {
            if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                if (n == 0) {
                    return 2;
                }
                if (n == 2) {
                    return 0;
                }
            }
            else {
                if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                    return n + 1 & 0x3;
                }
                if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                    return n + 3 & 0x3;
                }
            }
        }
        else if (llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.z && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S) {
            if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI) {
                if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                    if (n == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                    }
                    if (n == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                    }
                }
                else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                    if (n == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
                    }
                    if (n == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
                    }
                    if (n == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                    }
                    if (n == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                    }
                }
                else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                    if (n == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
                    }
                    if (n == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
                    }
                    if (n == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                    }
                    if (n == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()) {
                        return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                    }
                }
            }
            else if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll) {
                if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                    if (n == 3) {
                        return 4;
                    }
                    if (n == 4) {
                        return 3;
                    }
                }
                else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                    if (n == 3) {
                        return 1;
                    }
                    if (n == 4) {
                        return 2;
                    }
                    if (n == 2) {
                        return 3;
                    }
                    if (n == 1) {
                        return 4;
                    }
                }
                else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                    if (n == 3) {
                        return 2;
                    }
                    if (n == 4) {
                        return 1;
                    }
                    if (n == 2) {
                        return 3;
                    }
                    if (n == 1) {
                        return 4;
                    }
                }
            }
            else if (llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V && !(llllIIIIlIIIlIlllIll instanceof IIlIlIlIIlIllIIIIIIl)) {
                if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) {
                    if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                        if (n == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl() || n == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()) {
                            return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(n).IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl();
                        }
                    }
                    else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                        if (n == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                            return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
                        }
                        if (n == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()) {
                            return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
                        }
                        if (n == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()) {
                            return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                        }
                        if (n == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()) {
                            return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                        }
                    }
                    else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                        if (n == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                            return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
                        }
                        if (n == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()) {
                            return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
                        }
                        if (n == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()) {
                            return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                        }
                        if (n == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()) {
                            return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                        }
                    }
                }
            }
            else {
                final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(n);
                if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                    if (ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl || ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
                        return ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().llIllIIIIIllIlIIIIlI();
                    }
                }
                else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                    if (ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
                        return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
                    }
                    if (ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                        return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
                    }
                    if (ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                        return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                    }
                    if (ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                        return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
                    }
                }
                else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                    if (ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
                        return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
                    }
                    if (ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                        return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
                    }
                    if (ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                        return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                    }
                    if (ilIlIlIlIlllllllllIl == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                        return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
                    }
                }
            }
        }
        else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            if (n == 2) {
                return 3;
            }
            if (n == 3) {
                return 2;
            }
        }
        else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            if (n == 0) {
                return 2;
            }
            if (n == 1) {
                return 3;
            }
            if (n == 2) {
                return 0;
            }
            if (n == 3) {
                return 1;
            }
        }
        else if (this.IllIIlllIIIIlllIIlIl == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            if (n == 0) {
                return 2;
            }
            if (n == 1) {
                return 3;
            }
            if (n == 2) {
                return 1;
            }
            if (n == 3) {
                return 0;
            }
        }
        return n;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2, final int n3, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(n, n3), this.llllIIIIlIIIlIlllIll(n2), this.IlIlIlIlIlllllllllIl(n, n3));
        if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 2);
        }
    }
    
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final int n3, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(n, n3), this.llllIIIIlIIIlIlllIll(n2), this.IlIlIlIlIlllllllllIl(n, n3));
        return ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) ? illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl) : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), j, i, k, ilIlIIIlIIlIlIIlllIl);
                }
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2, final boolean b) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!b || this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, j, i, k, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIlIIIlIIIllIlIIIl2, j, i, k, ilIlIIIlIIlIlIIlllIl);
                        }
                        else {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIlIIIlIIIllIlIIIl, j, i, k, ilIlIIIlIIlIlIIlllIl);
                        }
                    }
                }
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final Random random, final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!b || this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, j, i, k, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        ilIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(random, j, i, k, i == n2 || i == n5 || j == n || j == n4 || k == n3 || k == n6);
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(), j, i, k, ilIlIIIlIIlIlIIlllIl);
                    }
                }
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final Random random, final float n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2, final boolean b) {
        for (int i = n3; i <= n6; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n4; k <= n7; ++k) {
                    if (random.nextFloat() <= n && (!b || this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, j, i, k, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)) {
                        if (i != n3 && i != n6 && j != n2 && j != n5 && k != n4 && k != n7) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIlIIIlIIIllIlIIIl2, j, i, k, ilIlIIIlIIlIlIIlllIl);
                        }
                        else {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIlIIIlIIIllIlIIIl, j, i, k, ilIlIIIlIIlIlIIlllIl);
                        }
                    }
                }
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final Random random, final float n, final int n2, final int n3, final int n4, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (random.nextFloat() < n) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIlIIIlIIIllIlIIIl, n2, n3, n4, ilIlIIIlIIlIlIIlllIl);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        final float n7 = (float)(n4 - n + 1);
        final float n8 = (float)(n5 - n2 + 1);
        final float n9 = (float)(n6 - n3 + 1);
        final float n10 = n + n7 / 2.0f;
        final float n11 = n3 + n9 / 2.0f;
        for (int i = n2; i <= n5; ++i) {
            final float n12 = (i - n2) / n8;
            for (int j = n; j <= n4; ++j) {
                final float n13 = (j - n10) / (n7 * 0.5f);
                for (int k = n3; k <= n6; ++k) {
                    final float n14 = (k - n11) / (n9 * 0.5f);
                    if ((!b || this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, j, i, k, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) && n13 * n13 + n12 * n12 + n14 * n14 <= 1.05f) {
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIlIIIlIIIllIlIIIl, j, i, k, ilIlIIIlIIlIlIIlllIl);
                    }
                }
            }
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final int n3, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(n, n3), this.llllIIIIlIIIlIlllIll(n2), this.IlIlIlIlIlllllllllIl(n, n3));
        if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
            while (!illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) && llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() < 255) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            }
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2, final int n3, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n, n3);
        int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(n2);
        final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(n, n3);
        if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl))) {
            while ((illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl)) || illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) && llllIIIIlIIIlIlllIll2 > 1) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl), llIIlIIIlIIIllIlIIIl, 2);
                --llllIIIIlIIIlIlllIll2;
            }
        }
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final Random random, final int n, final int n2, final int n3, final List list, final int n4) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(n, n3), this.llllIIIIlIIIlIlllIll(n2), this.IlIlIlIlIlllllllllIl(n, n3));
        if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl.lllIllIIIllllllIllll()), 2);
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll instanceof IlIlIIIllIIllIlllllI) {
                k.llllIIIIlIIIlIlllIll(random, list, (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll, n4);
            }
            return true;
        }
        return false;
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final Random random, final int n, final int n2, final int n3, final int n4, final List list, final int n5) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(n, n3), this.llllIIIIlIIIlIlllIll(n2), this.IlIlIlIlIlllllllllIl(n, n3));
        if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII, n4)), 2);
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
                k.llllIIIIlIIIlIlllIll(random, list, (lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll, n5);
            }
            return true;
        }
        return false;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(n, n3), this.llllIIIIlIIIlIlllIll(n2), this.IlIlIlIlIlllllllllIl(n, n3));
        if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
            llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    static /* synthetic */ int[] IllIIlllIIIIlllIIlIl() {
        final int[] llllIIIIlIIIlIlllIll = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll != null) {
            return llllIIIIlIIIlIlllIll;
        }
        final int[] llllIIIIlIIIlIlllIll2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
    }
}
