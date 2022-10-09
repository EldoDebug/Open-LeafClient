package net.minecraft.llIllIlIIIIllIlIIllI;

import java.text.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public final class lllIIIIlIlIllIIlIIIl
{
    public static final DecimalFormat llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    private IlIIIlIlIIIllIlIlIIl IlIIIlIlIIIllIlIlIIl;
    private IIIIlllIIIIIIlIIIlll IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl;
    private llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    private llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new DecimalFormat("#.###");
    }
    
    public lllIIIIlIlIllIIlIIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this(llllIIIIlIIIlIlllIll, 1);
    }
    
    public lllIIIIlIlIllIIlIIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        this(llllIIIIlIIIlIlllIll, n, 0);
    }
    
    public lllIIIIlIlIllIIlIIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        this(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), n, n2);
    }
    
    public lllIIIIlIlIllIIlIIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this(ilIIIlIlIIIllIlIlIIl, 1);
    }
    
    public lllIIIIlIlIllIIlIIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        this(ilIIIlIlIIIllIlIlIIl, n, 0);
    }
    
    public lllIIIIlIlIllIIlIIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int ilIlIlIlIlllllllllIl, final int illIIlllIIIIlllIIlIl) {
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = false;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = false;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        if (this.IllIIlllIIIIlllIIlIl < 0) {
            this.IllIIlllIIIIlllIIlIl = 0;
        }
    }
    
    public static lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl();
        lllIIIIlIlIllIIlIIIl.llIllIIIIIllIlIIIIlI(iiiIlllIIIIIIlIIIlll);
        return (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != null) ? lllIIIIlIlIllIIlIIIl : null;
    }
    
    private lllIIIIlIlIllIIlIIIl() {
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = false;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = false;
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final int n) {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(this.IlIIIlIlIIIllIlIlIIl, n, this.IllIIlllIIIIlllIIlIl);
        if (this.IlIlIIIllIllIIIIIllI != null) {
            lllIIIIlIlIllIIlIIIl.IlIlIIIllIllIIIIIllI = (IIIIlllIIIIIIlIIIlll)this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
        }
        this.IlIlIlIlIlllllllllIl -= n;
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        final boolean llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this, llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3);
        if (llllIIIIlIIIlIlllIll2) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl)]);
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    public float llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this, llllIIIIlIIIlIlllIll);
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll);
    }
    
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(this, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll);
    }
    
    public IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("id", (lIllllIllIllIIllllll == null) ? "minecraft:air" : lIllllIllIllIIllllll.toString());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Count", (byte)this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Damage", (short)this.IllIIlllIIIIlllIIlIl);
        if (this.IlIlIIIllIllIIIIIllI != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("tag", this.IlIlIIIllIllIIIIIllI);
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    public void llIllIIIIIllIlIIIIlI(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("id", 8)) {
            this.IlIIIlIlIIIllIlIlIIl = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("id"));
        }
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Count");
        this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Damage");
        if (this.IllIIlllIIIIlllIIlIl < 0) {
            this.IllIIlllIIIIlllIIlIl = 0;
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("tag", 10)) {
            this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("tag");
            if (this.IlIIIlIlIIIllIlIlIIl != null) {
                this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
            }
        }
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll();
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl() > 1 && (!this.IlIIIlIlIIIllIlIlIIl() || !this.IllIIlllIIIIlllIIlIl());
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl != null && this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() > 0 && (!this.IIIIlllIIIIIIlIIIlll() || !this.llllIIllllIlIlIIIIll().IIIIlllIIIIIIlIIIlll("Unbreakable"));
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl() && this.IllIIlllIIIIlllIIlIl > 0;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        if (this.IllIIlllIIIIlllIIlIl < 0) {
            this.IllIIlllIIIIlllIIlIl = 0;
        }
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
    }
    
    public boolean llllIIIIlIIIlIlllIll(int n, final Random random) {
        if (!this.IlIIIlIlIIIllIlIlIIl()) {
            return false;
        }
        if (n > 0) {
            final int llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.IIlllIlIIllIlIlIlIIl, this);
            int n2 = 0;
            for (int n3 = 0; llllIIIIlIIIlIlllIll > 0 && n3 < n; ++n3) {
                if (net.minecraft.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this, llllIIIIlIIIlIlllIll, random)) {
                    ++n2;
                }
            }
            n -= n2;
            if (n <= 0) {
                return false;
            }
        }
        this.IllIIlllIIIIlllIIlIl += n;
        return this.IllIIlllIIIIlllIIlIl > this.lIIIlllIIIllIIIllIII();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if ((!(lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) || !((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl).K.IlIIIlIlIIIllIlIlIIl) && this.IlIIIlIlIIIllIlIlIIl() && this.llllIIIIlIIIlIlllIll(n, lllIIIIlllllIlIIllIl.B())) {
            lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(this);
            --this.IlIlIlIlIlllllllllIl;
            if (lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl;
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lllllIIIIIlIlIIIIIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl)]);
                if (this.IlIlIlIlIlllllllllIl == 0 && this.llllIIIIlIIIlIlllIll() instanceof IIIllllllIllIIIlllIl) {
                    llllIIIIlIIIlIlllIll.q();
                }
            }
            if (this.IlIlIlIlIlllllllllIl < 0) {
                this.IlIlIlIlIlllllllllIl = 0;
            }
            this.IllIIlllIIIIlllIIlIl = 0;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this, lllIIIIlllllIlIIllIl, llllIIIIlIIIlIlllIll)) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl)]);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        if (this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2)) {
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl)]);
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this, llllIIIIlIIIlIlllIll, lllIIIIlllllIlIIllIl);
    }
    
    public lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl() {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIlIlIlllllllllIl, this.IllIIlllIIIIlllIIlIl);
        if (this.IlIlIIIllIllIIIIIllI != null) {
            lllIIIIlIlIllIIlIIIl.IlIlIIIllIllIIIIIllI = (IIIIlllIIIIIIlIIIlll)this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        return (lllIIIIlIlIllIIlIIIl == null && lllIIIIlIlIllIIlIIIl2 == null) || (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl2 != null && (lllIIIIlIlIllIIlIIIl.IlIlIIIllIllIIIIIllI != null || lllIIIIlIlIllIIlIIIl2.IlIlIIIllIllIIIIIllI == null) && (lllIIIIlIlIllIIlIIIl.IlIlIIIllIllIIIIIllI == null || lllIIIIlIlIllIIlIIIl.IlIlIIIllIllIIIIIllI.equals(lllIIIIlIlIllIIlIIIl2.IlIlIIIllIllIIIIIllI)));
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        return (lllIIIIlIlIllIIlIIIl == null && lllIIIIlIlIllIIlIIIl2 == null) || (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl2 != null && lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl2));
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.IlIlIlIlIlllllllllIl == lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl && this.IlIIIlIlIIIllIlIlIIl == lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl && this.IllIIlllIIIIlllIIlIl == lllIIIIlIlIllIIlIIIl.IllIIlllIIIIlllIIlIl && (this.IlIlIIIllIllIIIIIllI != null || lllIIIIlIlIllIIlIIIl.IlIlIIIllIllIIIIIllI == null) && (this.IlIlIIIllIllIIIIIllI == null || this.IlIlIIIllIllIIIIIllI.equals(lllIIIIlIlIllIIlIIIl.IlIlIIIllIllIIIIIllI));
    }
    
    public static boolean llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        return (lllIIIIlIlIllIIlIIIl == null && lllIIIIlIlIllIIlIIIl2 == null) || (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl2 != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl2));
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl != null && this.IlIIIlIlIIIllIlIlIIl == lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl && this.IllIIlllIIIIlllIIlIl == lllIIIIlIlIllIIlIIIl.IllIIlllIIIIlllIIlIl;
    }
    
    public String llIllIlIIIIllIlIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(this);
    }
    
    public static lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return (lllIIIIlIlIllIIlIIIl == null) ? null : lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl();
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.IlIlIlIlIlllllllllIl) + "x" + this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII() + "@" + this.IllIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final boolean b) {
        if (this.llIllIIIIIllIlIIIIlI > 0) {
            --this.llIllIIIIIllIlIIIIlI;
        }
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this, illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI, n, b);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIIIlIlllIllIIlIllI[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl)], n);
        this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(this, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll);
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl);
    }
    
    public int lIlIlIIIllIIllIIIllI() {
        return this.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl(this);
    }
    
    public net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll IlIlIIIllIIllIlllllI() {
        return this.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI(this);
    }
    
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        this.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, n);
    }
    
    public boolean IIIIlllIIIIIIlIIIlll() {
        return this.IlIlIIIllIllIIIIIllI != null;
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        if (this.IlIlIIIllIllIIIIIllI != null && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(s, 10)) {
            return this.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI(s);
        }
        if (b) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            this.llllIIIIlIIIlIlllIll(s, iiiIlllIIIIIIlIIIlll);
            return iiiIlllIIIIIIlIIIlll;
        }
        return null;
    }
    
    public IlIlIIIlIIlIlIIlllIl IlIllIlIlIIIlIlIlIII() {
        return (this.IlIlIIIllIllIIIIIllI == null) ? null : this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI("ench", 10);
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final IIIIlllIIIIIIlIIIlll ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public String IIlllIIlIllIllIlIIll() {
        String s = this.llllIIIIlIIIlIlllIll().llllIIIlIlllIlIIIIIl(this);
        if (this.IlIlIIIllIllIIIIIllI != null && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("display", 10)) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = this.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI("display");
            if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("Name", 8)) {
                s = ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl("Name");
            }
        }
        return s;
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final String s) {
        if (this.IlIlIIIllIllIIIIIllI == null) {
            this.IlIlIIIllIllIIIIIllI = new IIIIlllIIIIIIlIIIlll();
        }
        if (!this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("display", 10)) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll("display", new IIIIlllIIIIIIlIIIlll());
        }
        this.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI("display").llllIIIIlIIIlIlllIll("Name", s);
        return this;
    }
    
    public void lllIIIIlllllIlIIllIl() {
        if (this.IlIlIIIllIllIIIIIllI != null && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("display", 10)) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = this.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI("display");
            ilIlIIIllIIllIlllllI.llllIIllllIlIlIIIIll("Name");
            if (ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI()) {
                this.IlIlIIIllIllIIIIIllI.llllIIllllIlIlIIIIll("display");
                if (this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()) {
                    this.IlIIIlIlIIIllIlIlIIl((IIIIlllIIIIIIlIIIlll)null);
                }
            }
        }
    }
    
    public boolean IlIlIIIIIIlllIlIllIl() {
        return this.IlIlIIIllIllIIIIIllI != null && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("display", 10) && this.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI("display").IlIlIlIlIlllllllllIl("Name", 8);
    }
    
    public List llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b) {
        final ArrayList arrayList = Lists.newArrayList();
        String s = this.IIlllIIlIllIllIlIIll();
        if (this.IlIlIIIIIIlllIlIllIl()) {
            s = IlllIIIIlIIIlIlIlIIl.IIIlIIIlIlIIlllIIlll + s;
        }
        String s2 = String.valueOf(s) + IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl;
        if (b) {
            String s3 = "";
            if (s2.length() > 0) {
                s2 = String.valueOf(s2) + " (";
                s3 = ")";
            }
            final int llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
            if (this.IlIlIIIllIllIIIIIllI()) {
                s2 = String.valueOf(s2) + String.format("#%04d/%d%s", llllIIIIlIIIlIlllIll2, this.IllIIlllIIIIlllIIlIl, s3);
            }
            else {
                s2 = String.valueOf(s2) + String.format("#%04d%s", llllIIIIlIIIlIlllIll2, s3);
            }
        }
        else if (!this.IlIlIIIIIIlllIlIllIl() && this.IlIIIlIlIIIllIlIlIIl == IIllIIllIIIlIlIIIIlI.h) {
            s2 = String.valueOf(s2) + " #" + this.IllIIlllIIIIlllIIlIl;
        }
        arrayList.add(s2);
        int illIIlllIIIIlllIIlIl = 0;
        if (this.IIIIlllIIIIIIlIIIlll() && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("HideFlags", 99)) {
            illIIlllIIIIlllIIlIl = this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl("HideFlags");
        }
        if ((illIIlllIIIIlllIIlIl & 0x20) == 0x0) {
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this, llllIIIIlIIIlIlllIll, arrayList, b);
        }
        if (this.IIIIlllIIIIIIlIIIlll()) {
            if ((illIIlllIIIIlllIIlIl & 0x1) == 0x0) {
                final IlIlIIIlIIlIlIIlllIl ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII();
                if (ilIllIlIlIIIlIlIlIII != null) {
                    for (int i = 0; i < ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI(); ++i) {
                        final short ilIlIIIllIllIIIIIllI = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("id");
                        final short ilIlIIIllIllIIIIIllI2 = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("lvl");
                        if (net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI) != null) {
                            arrayList.add(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI).IlIIIlIlIIIllIlIlIIl(ilIlIIIllIllIIIIIllI2));
                        }
                    }
                }
            }
            if (this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("display", 10)) {
                final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = this.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI("display");
                if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("color", 3)) {
                    if (b) {
                        arrayList.add("Color: #" + Integer.toHexString(ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl("color")).toUpperCase());
                    }
                    else {
                        arrayList.add(IlllIIIIlIIIlIlIlIIl.IIIlIIIlIlIIlllIIlll + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.dyed"));
                    }
                }
                if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("Lore") == 9) {
                    final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI("Lore", 8);
                    if (llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() > 0) {
                        for (int j = 0; j < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++j) {
                            arrayList.add(new StringBuilder().append(IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl).append(IlllIIIIlIIIlIlIlIIl.IIIlIIIlIlIIlllIIlll).append(llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(j)).toString());
                        }
                    }
                }
            }
        }
        final Multimap llIIIlIlIllIIlIlIlII = this.llIIIlIlIllIIlIlIlII();
        if (!llIIIlIlIllIIlIlIlII.isEmpty() && (illIIlllIIIIlllIIlIl & 0x2) == 0x0) {
            arrayList.add("");
            for (final Map.Entry<K, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> entry : llIIIlIlIllIIlIlIlII.entries()) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = entry.getValue();
                double ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl();
                if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
                    ilIIIlIlIIIllIlIlIIl += lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this, IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll);
                }
                double n;
                if (llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI() != 1 && llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI() != 2) {
                    n = ilIIIlIlIIIllIlIlIIl;
                }
                else {
                    n = ilIIIlIlIIIllIlIlIIl * 100.0;
                }
                if (ilIIIlIlIIIllIlIlIIl > 0.0) {
                    arrayList.add(IlllIIIIlIIIlIlIlIIl.llIIlIIIlIIIllIlIIIl + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("attribute.modifier.plus." + llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI(), lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll.format(n), lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("attribute.name." + (String)entry.getKey())));
                }
                else {
                    if (ilIIIlIlIIIllIlIlIIl >= 0.0) {
                        continue;
                    }
                    arrayList.add(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("attribute.modifier.take." + llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI(), lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll.format(n * -1.0), lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("attribute.name." + (String)entry.getKey())));
                }
            }
        }
        if (this.IIIIlllIIIIIIlIIIlll() && this.llllIIllllIlIlIIIIll().IIIIlllIIIIIIlIIIlll("Unbreakable") && (illIIlllIIIIlllIIlIl & 0x4) == 0x0) {
            arrayList.add(IlllIIIIlIIIlIlIlIIl.llIIlIIIlIIIllIlIIIl + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.unbreakable"));
        }
        if (this.IIIIlllIIIIIIlIIIlll() && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("CanDestroy", 9) && (illIIlllIIIIlllIIlIl & 0x8) == 0x0) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI2 = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI("CanDestroy", 8);
            if (llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI() > 0) {
                arrayList.add("");
                arrayList.add(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.canBreak"));
                for (int k = 0; k < llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI(); ++k) {
                    final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl(k));
                    if (llllIIIIlIIIlIlllIll4 != null) {
                        arrayList.add(IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII + llllIIIIlIIIlIlllIll4.lllllIlIIIlIlIIlllII());
                    }
                    else {
                        arrayList.add(IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII + "missingno");
                    }
                }
            }
        }
        if (this.IIIIlllIIIIIIlIIIlll() && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("CanPlaceOn", 9) && (illIIlllIIIIlllIIlIl & 0x10) == 0x0) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI3 = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI("CanPlaceOn", 8);
            if (llIllIIIIIllIlIIIIlI3.IlIlIIIllIllIIIIIllI() > 0) {
                arrayList.add("");
                arrayList.add(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.canPlace"));
                for (int l = 0; l < llIllIIIIIllIlIIIIlI3.IlIlIIIllIllIIIIIllI(); ++l) {
                    final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl(l));
                    if (llllIIIIlIIIlIlllIll5 != null) {
                        arrayList.add(IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII + llllIIIIlIIIlIlllIll5.lllllIlIIIlIlIIlllII());
                    }
                    else {
                        arrayList.add(IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII + "missingno");
                    }
                }
            }
        }
        if (b) {
            if (this.IllIIlllIIIIlllIIlIl()) {
                arrayList.add("Durability: " + (this.lIIIlllIIIllIIIllIII() - this.llllIIIlIlllIlIIIIIl()) + " / " + this.lIIIlllIIIllIIIllIII());
            }
            arrayList.add(IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII + ((lIllllIllIllIIllllll)net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl)).toString());
            if (this.IIIIlllIIIIIIlIIIlll()) {
                arrayList.add(IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII + "NBT: " + this.llllIIllllIlIlIIIIll().IlIlIIIllIllIIIIIllI().size() + " tag(s)");
            }
        }
        return arrayList;
    }
    
    public boolean IIllIIllIIIlIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII(this);
    }
    
    public net.minecraft.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI IIIlIIIlIlIIlllIIlll() {
        return this.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII(this);
    }
    
    public boolean IlIlIIIlIIlIlIIlllIl() {
        return this.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl(this) && !this.IlllllllIIIlIIIlIlII();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        if (this.IlIlIIIllIllIIIIIllI == null) {
            this.IlIIIlIlIIIllIlIlIIl(new IIIIlllIIIIIIlIIIlll());
        }
        if (!this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("ench", 9)) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll("ench", new IlIlIIIlIIlIlIIlllIl());
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI("ench", 10);
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("id", (short)llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("lvl", (short)(byte)n);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    public boolean IlllllllIIIlIIIlIlII() {
        return this.IlIlIIIllIllIIIIIllI != null && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("ench", 9);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (this.IlIlIIIllIllIIIIIllI == null) {
            this.IlIIIlIlIIIllIlIlIIl(new IIIIlllIIIIIIlIIIlll());
        }
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(s, llllIIIlIlllIlIIIIIl);
    }
    
    public boolean IIlIIIIlllIlllllIlII() {
        return this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll();
    }
    
    public boolean IIIlIIlIIIIlllIlllII() {
        return this.llllIIIlIlllIlIIIIIl != null;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIllllllllIIIIlII() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int IIlllIlIIllIlIlIlIIl() {
        return (this.IIIIlllIIIIIIlIIIlll() && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("RepairCost", 3)) ? this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl("RepairCost") : 0;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int n) {
        if (!this.IIIIlllIIIIIIlIIIlll()) {
            this.IlIlIIIllIllIIIIIllI = new IIIIlllIIIIIIlIIIlll();
        }
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll("RepairCost", n);
    }
    
    public Multimap llIIIlIlIllIIlIlIlII() {
        Object o;
        if (this.IIIIlllIIIIIIlIIIlll() && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("AttributeModifiers", 9)) {
            o = HashMultimap.create();
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI("AttributeModifiers", 10);
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
                final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().getLeastSignificantBits() != 0L && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().getMostSignificantBits() != 0L) {
                    ((Multimap)o).put((Object)ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("AttributeName"), (Object)llllIIIIlIIIlIlllIll);
                }
            }
        }
        else {
            o = this.llllIIIIlIIIlIlllIll().IlIllIlIlIIIlIlIlIII();
        }
        return (Multimap)o;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public llIIIIIIlIllIIlIIIll lllllIlIIIlIlIIlllII() {
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(this.IIlllIIlIllIllIlIIll());
        if (this.IlIlIIIIIIlllIlIllIl()) {
            ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().IlIlIlIlIlllllllllIl(true);
        }
        final llIIIIIIlIllIIlIIIll ilIlIlIlIlllllllllIl = new IlIlIIIIIIlllIlIllIl("[").llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl).IlIlIlIlIlllllllllIl("]");
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
            ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(new net.minecraft.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(net.minecraft.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI, new IlIlIIIIIIlllIlIllIl(iiiIlllIIIIIIlIIIlll.toString())));
            ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.IIIlIIIlIlIIlllIIlll().IlIlIIIllIllIIIIIllI);
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII) {
        if (liiiIlIIIIIlllIllIII == this.lIIIIlIIIIIlllIllIII) {
            return this.lIIIlllIIIllIIIllIII;
        }
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        if (this.IIIIlllIIIIIIlIIIlll() && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("CanDestroy", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI("CanDestroy", 8);
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                if (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(i)) == liiiIlIIIIIlllIllIII) {
                    return this.lIIIlllIIIllIIIllIII = true;
                }
            }
        }
        return this.lIIIlllIIIllIIIllIII = false;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl == this.llIIlIIIlIIIllIlIIIl) {
            return this.llIllIlIIIIllIlIIllI;
        }
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        if (this.IIIIlllIIIIIIlIIIlll() && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl("CanPlaceOn", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI("CanPlaceOn", 8);
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                if (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(i)) == llIIlIIIlIIIllIlIIIl) {
                    return this.llIllIlIIIIllIlIIllI = true;
                }
            }
        }
        return this.llIllIlIIIIllIlIIllI = false;
    }
}
