package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.*;
import com.google.common.collect.*;
import java.util.concurrent.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class IlllllllIIIlIIIlIlII implements lIlIlIIIllIIllIIIllI
{
    private int llIIlllIIlllIIllIllI;
    protected boolean llllIIIIlIIIlIlllIll;
    public final List IlIlIlIlIlllllllllIl;
    protected final List llIllIIIIIllIlIIIIlI;
    public final List IlIIIlIlIIIllIlIlIIl;
    public final List IlIlIIIllIllIIIIIllI;
    private final List IIlllIIIlIlllIIlllII;
    private final List IIlIIIIIllIlIIIlIIll;
    public final List IllIIlllIIIIlllIIlIl;
    public final List llllIIIlIlllIlIIIIIl;
    protected final IIIllIIIlIlIIllIIIlI lIIIIlIIIIIlllIllIII;
    private long llllllIllIllIlIllllI;
    private int IIIllllllIllIIIlllIl;
    protected int lIIIlllIIIllIIIllIII;
    protected final int llIIlIIIlIIIllIlIIIl = 1013904223;
    protected float llIllIlIIIIllIlIIllI;
    protected float lIlIlIIIllIIllIIIllI;
    protected float IlIlIIIllIIllIlllllI;
    protected float IIIIlllIIIIIIlIIIlll;
    private int IlIIIlIIIllllIlIlIlI;
    public final Random llllIIllllIlIlIIIIll;
    public final lllllIlIIIlIlIIlllII IlIllIlIlIIIlIlIlIII;
    protected List IIlllIIlIllIllIlIIll;
    protected lIIIIlIIIIIlllIllIII lllIIIIlllllIlIIllIl;
    protected final IlIIIlIlIIIllIlIlIIl IlIlIIIIIIlllIlIllIl;
    protected llllIIllllIlIlIIIIll IIllIIllIIIlIlIIIIlI;
    protected boolean IIIlIIIlIlIIlllIIlll;
    protected net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII IlIlIIIlIIlIlIIlllIl;
    protected IlIlIIIllIllIIIIIllI IlllllllIIIlIIIlIlII;
    public final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl IIlIIIIlllIlllllIlII;
    private final Calendar IIIIIllIIIIlIIIIllIl;
    protected llIIlIIIlIIIllIlIIIl IIIlIIlIIIIlllIlllII;
    public final boolean IlIlIllllllllIIIIlII;
    protected Set IIlllIlIIllIlIlIlIIl;
    private int IIIIIIIIIlllIllIlIlI;
    protected boolean llIIIlIlIllIIlIlIlII;
    protected boolean lllllIlIIIlIlIIlllII;
    private boolean IIllllIIIlIIIIIIllIl;
    private final llIllIIIIIllIlIIIIlI IlllIIIIlIIIlIlIlIIl;
    int[] lIllllllIIllIlIlIlII;
    
    protected IlllllllIIIlIIIlIlII(final IlIIIlIlIIIllIlIlIIl ilIlIIIIIIlllIlIllIl, final llllIIllllIlIlIIIIll iIllIIllIIIlIlIIIIlI, final lllllIlIIIlIlIIlllII ilIllIlIlIIIlIlIlIII, final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl iIlIIIIlllIlllllIlII, final boolean ilIlIllllllllIIIIlII) {
        this.llIIlllIIlllIIllIllI = 63;
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.IIlllIIIlIlllIIlllII = Lists.newArrayList();
        this.IIlIIIIIllIlIIIlIIll = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
        this.lIIIIlIIIIIlllIllIII = new IIIllIIIlIlIIllIIIlI();
        this.llllllIllIllIlIllllI = 16777215L;
        this.lIIIlllIIIllIIIllIII = new Random().nextInt();
        this.llllIIllllIlIlIIIIll = new Random();
        this.IIlllIIlIllIllIlIIll = Lists.newArrayList();
        this.IIIIIllIIIIlIIIIllIl = Calendar.getInstance();
        this.IIIlIIlIIIIlllIlllII = new llIIlIIIlIIIllIlIIIl();
        this.IIlllIlIIllIlIlIlIIl = Sets.newHashSet();
        this.IIIIIIIIIlllIllIlIlI = this.llllIIllllIlIlIIIIll.nextInt(12000);
        this.llIIIlIlIllIIlIlIlII = true;
        this.lllllIlIIIlIlIIlllII = true;
        this.lIllllllIIllIlIlIlII = new int[32768];
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
        this.IlllIIIIlIIIlIlIlIIl = ilIllIlIlIIIlIlIlIII.lllIIIIlllllIlIIllIl();
    }
    
    public IlllllllIIIlIIIlIlII lIIIlllIIIllIIIllIII() {
        return this;
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl)) {
            final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl);
            try {
                return llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIIllIlllllI());
            }
            catch (Throwable t) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Getting biome");
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Coordinates of biome request").llllIIIIlIIIlIlllIll("Location", new IIlIIIIlllIlllllIlII(this, ilIlIlIlIlllllllllIl));
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
            }
        }
        return this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIIllIlllllI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll);
    }
    
    public IIIllllllIllIIIlllIl llIIlIIIlIIIllIlIIIl() {
        return this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIIllIlllllI();
    }
    
    protected abstract lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl();
    
    public void llllIIIIlIIIlIlllIll(final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl) {
        this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl(true);
    }
    
    public void llIllIlIIIIllIlIIllI() {
        this.IIlllIlIIllIlIlIlIIl(new IlIlIlIlIlllllllllIl(8, 64, 8));
    }
    
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
        for (llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), this.IlIlIIIlIIlIlIIlllIl(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()); !this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()); llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) {}
        return this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI();
    }
    
    private boolean llIIlllIIlllIIllIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >= -30000000 && ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >= -30000000 && ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() < 30000000 && ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() < 30000000 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 0 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, true);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        return this.llIIlllIIlllIIllIllI(ilIlIlIlIlllllllllIl) && this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4, b);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, true);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - n, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n, b);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, true);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl(), b);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        return this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, true);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll, ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl, ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI, ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl, ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI, ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl, b);
    }
    
    private boolean llllIIIIlIIIlIlllIll(int n, final int n2, int n3, int n4, final int n5, int n6, final boolean b) {
        if (n5 >= 0 && n2 < 256) {
            n >>= 4;
            n3 >>= 4;
            n4 >>= 4;
            n6 >>= 4;
            for (int i = n; i <= n4; ++i) {
                for (int j = n3; j <= n6; ++j) {
                    if (!this.IlIlIlIlIlllllllllIl(i, j, b)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    protected boolean IlIlIlIlIlllllllllIl(final int n, final int n2, final boolean b) {
        return this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(n, n2) && (b || !this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(n, n2).lIIIIlIIIIIlllIllIII());
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4);
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(n, n2);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        if (!this.llIIlllIIlllIIllIllI(ilIlIlIlIlllllllllIl)) {
            return false;
        }
        if (!this.IlIlIllllllllIIIIlII && this.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI() == llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            return false;
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl() != llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl() || llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl() != llIllIIIIIllIlIIIIlI2.IlIIIlIlIIIllIlIlIIl()) {
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("checkLight");
            this.IlllllllIIIlIIIlIlII(ilIlIlIlIlllllllllIl);
            this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        }
        if ((n & 0x2) != 0x0 && (!this.IlIlIllllllllIIIIlII || (n & 0x4) == 0x0) && llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII()) {
            this.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl);
        }
        if (!this.IlIlIllllllllIIIIlII && (n & 0x1) != 0x0) {
            this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
            if (llIllIIIIIllIlIIIIlI.IIIIIIIIIlllIllIlIlI()) {
                this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI);
            }
        }
        return true;
    }
    
    public boolean lIIIIlIIIIIlllIllIII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 3);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl(2001, ilIlIlIlIlllllllllIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2));
        if (b) {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, 0);
        }
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 3);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 3);
    }
    
    public void lIIIlllIIIllIIIllIII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI() != llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, int n3, int n4) {
        if (n3 > n4) {
            final int n5 = n4;
            n4 = n3;
            n3 = n5;
        }
        if (!this.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
            for (int i = n3; i <= n4; ++i) {
                this.llIllIIIIIllIlIIIIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, new IlIlIlIlIlllllllllIl(n, i, n2));
            }
        }
        this.IlIlIlIlIlllllllllIl(n, n3, n2, n, n4, n2);
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl());
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), llllIIIIlIIIlIlllIll);
        this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), llllIIIIlIIIlIlllIll);
        this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll);
        this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll);
        this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll);
        this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), llllIIIIlIIIlIlllIll);
        }
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), llllIIIIlIIIlIlllIll);
        }
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
            this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll);
        }
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
            this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll);
        }
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll);
        }
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), llllIIIIlIIIlIlllIll);
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlIlIllllllllIIIIlII) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            try {
                ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll);
            }
            catch (Throwable t) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Exception while updating neighbours");
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Block being updated");
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Source block type", new IIIlIIlIIIIlllIlllII(this, llllIIIIlIIIlIlllIll));
                net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
            }
        }
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return false;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl);
    }
    
    public boolean llIllIlIIIIllIlIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= this.IlIlIIIlIIlIlIIlllIl()) {
            return this.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl);
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), this.IlIlIIIlIIlIlIIlllIl(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        if (!this.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl2)) {
            return false;
        }
        for (IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(); ilIlIlIlIlllllllllIl3.lIIIlllIIIllIIIllIII() > ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl3.IlIlIlIlIlllllllllIl()) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl() > 0 && !llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
                return false;
            }
        }
        return true;
    }
    
    public int lIlIlIIIllIIllIIIllI(IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 0) {
            return 0;
        }
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 256) {
            ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), 255, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        return this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 0);
    }
    
    public int IlIlIIIllIIllIlllllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl, true);
    }
    
    public int llIllIIIIIllIlIIIIlI(IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        if (ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() < -30000000 || ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() < -30000000 || ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >= 30000000 || ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >= 30000000) {
            return 15;
        }
        if (b && this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IlIlIIIllIllIIIIIllI()) {
            int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), false);
            final int llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), false);
            final int llIllIIIIIllIlIIIIlI3 = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), false);
            final int llIllIIIIIllIlIIIIlI4 = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), false);
            final int llIllIIIIIllIlIIIIlI5 = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), false);
            if (llIllIIIIIllIlIIIIlI2 > llIllIIIIIllIlIIIIlI) {
                llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
            }
            if (llIllIIIIIllIlIIIIlI3 > llIllIIIIIllIlIIIIlI) {
                llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI3;
            }
            if (llIllIIIIIllIlIIIIlI4 > llIllIIIIIllIlIIIIlI) {
                llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI4;
            }
            if (llIllIIIIIllIlIIIIlI5 > llIllIIIIIllIlIIIIlI) {
                llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI5;
            }
            return llIllIIIIIllIlIIIIlI;
        }
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 0) {
            return 0;
        }
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 256) {
            ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), 255, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        return this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.IIIllllllIllIIIlllIl);
    }
    
    public IlIlIlIlIlllllllllIl IIIIlllIIIIIIlIIIlll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        int ilIlIlIlIlllllllllIl2;
        if (ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >= -30000000 && ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >= -30000000 && ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() < 30000000 && ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() < 30000000) {
            if (this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4, true)) {
                ilIlIlIlIlllllllllIl2 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4).IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF);
            }
            else {
                ilIlIlIlIlllllllllIl2 = 0;
            }
        }
        else {
            ilIlIlIlIlllllllllIl2 = this.IlIlIIIlIIlIlIIlllIl() + 1;
        }
        return new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
    }
    
    public int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (n < -30000000 || n2 < -30000000 || n >= 30000000 || n2 >= 30000000) {
            return this.IlIlIIIlIIlIlIIlllIl() + 1;
        }
        if (!this.IlIlIlIlIlllllllllIl(n >> 4, n2 >> 4, true)) {
            return 0;
        }
        return this.llllIIIIlIIIlIlllIll(n >> 4, n2 >> 4).IlIlIIIlIIlIlIIlllIl();
    }
    
    public int llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() && llllIIIlIlllIlIIIIIl == llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            return 0;
        }
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 0) {
            ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), 0, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        if (!this.llIIlllIIlllIIllIllI(ilIlIlIlIlllllllllIl)) {
            return llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        }
        if (!this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl)) {
            return llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        }
        if (this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IlIlIIIllIllIIIIIllI()) {
            int ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
            final int ilIlIlIlIlllllllllIl3 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
            final int ilIlIlIlIlllllllllIl4 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
            final int ilIlIlIlIlllllllllIl5 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
            final int ilIlIlIlIlllllllllIl6 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
            if (ilIlIlIlIlllllllllIl3 > ilIlIlIlIlllllllllIl2) {
                ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl3;
            }
            if (ilIlIlIlIlllllllllIl4 > ilIlIlIlIlllllllllIl2) {
                ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl4;
            }
            if (ilIlIlIlIlllllllllIl5 > ilIlIlIlIlllllllllIl2) {
                ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl5;
            }
            if (ilIlIlIlIlllllllllIl6 > ilIlIlIlIlllllllllIl2) {
                ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl6;
            }
            return ilIlIlIlIlllllllllIl2;
        }
        return this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl);
    }
    
    public int IlIlIlIlIlllllllllIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 0) {
            ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), 0, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        if (!this.llIIlllIIlllIIllIllI(ilIlIlIlIlllllllllIl)) {
            return llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        }
        if (!this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl)) {
            return llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        }
        return this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        if (this.llIIlllIIlllIIllIllI(ilIlIlIlIlllllllllIl) && this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl)) {
            this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl, n);
            this.llllIIllllIlIlIIIIll(ilIlIlIlIlllllllllIl);
        }
    }
    
    public void llllIIllllIlIlIIIIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
        int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll2 < n) {
            llllIIIIlIIIlIlllIll2 = n;
        }
        return llllIIIIlIIIlIlllIll << 20 | llllIIIIlIIIlIlllIll2 << 4;
    }
    
    public float IlIllIlIlIIIlIlIlIII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIllIlIlIIIlIlIlIII.IlIllIlIlIIIlIlIlIII()[this.IlIlIIIllIIllIlllllI(ilIlIlIlIlllllllllIl)];
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!this.llIIlllIIlllIIllIllI(ilIlIlIlIlllllllllIl)) {
            return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
        }
        return this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl);
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.IIIllllllIllIIIlllIl < 4;
    }
    
    public llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll(final e e, final e e2) {
        return this.llllIIIIlIIIlIlllIll(e, e2, false, false, false);
    }
    
    public llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll(final e e, final e e2, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(e, e2, b, false, false);
    }
    
    public llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll(e e, final e e2, final boolean b, final boolean b2, final boolean b3) {
        if (Double.isNaN(e.llllIIIIlIIIlIlllIll) || Double.isNaN(e.IlIlIlIlIlllllllllIl) || Double.isNaN(e.llIllIIIIIllIlIIIIlI)) {
            return null;
        }
        if (!Double.isNaN(e2.llllIIIIlIIIlIlllIll) && !Double.isNaN(e2.IlIlIlIlIlllllllllIl) && !Double.isNaN(e2.llIllIIIIIllIlIIIIlI)) {
            final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e2.llllIIIIlIIIlIlllIll);
            final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e2.IlIlIlIlIlllllllllIl);
            final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e2.llIllIIIIIllIlIIIIlI);
            int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e.llllIIIIlIIIlIlllIll);
            int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e.IlIlIlIlIlllllllllIl);
            int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e.llIllIIIIIllIlIIIIlI);
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI4, llIllIIIIIllIlIIIIlI5, llIllIIIIIllIlIIIIlI6);
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI7 = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
            if ((!b2 || llIllIIIIIllIlIIIIlI7.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2) != null) && llIllIIIIIllIlIIIIlI7.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, b)) {
                final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI7.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, e, e2);
                if (llllIIIIlIIIlIlllIll != null) {
                    return llllIIIIlIIIlIlllIll;
                }
            }
            llIlllIlllllIIllIIII llIlllIlllllIIllIIII = null;
            int n = 200;
            while (n-- >= 0) {
                if (Double.isNaN(e.llllIIIIlIIIlIlllIll) || Double.isNaN(e.IlIlIlIlIlllllllllIl) || Double.isNaN(e.llIllIIIIIllIlIIIIlI)) {
                    return null;
                }
                if (llIllIIIIIllIlIIIIlI4 == llIllIIIIIllIlIIIIlI && llIllIIIIIllIlIIIIlI5 == llIllIIIIIllIlIIIIlI2 && llIllIIIIIllIlIIIIlI6 == llIllIIIIIllIlIIIIlI3) {
                    return b3 ? llIlllIlllllIIllIIII : null;
                }
                boolean b4 = true;
                boolean b5 = true;
                boolean b6 = true;
                double n2 = 999.0;
                double n3 = 999.0;
                double n4 = 999.0;
                if (llIllIIIIIllIlIIIIlI > llIllIIIIIllIlIIIIlI4) {
                    n2 = llIllIIIIIllIlIIIIlI4 + 1.0;
                }
                else if (llIllIIIIIllIlIIIIlI < llIllIIIIIllIlIIIIlI4) {
                    n2 = llIllIIIIIllIlIIIIlI4 + 0.0;
                }
                else {
                    b4 = false;
                }
                if (llIllIIIIIllIlIIIIlI2 > llIllIIIIIllIlIIIIlI5) {
                    n3 = llIllIIIIIllIlIIIIlI5 + 1.0;
                }
                else if (llIllIIIIIllIlIIIIlI2 < llIllIIIIIllIlIIIIlI5) {
                    n3 = llIllIIIIIllIlIIIIlI5 + 0.0;
                }
                else {
                    b5 = false;
                }
                if (llIllIIIIIllIlIIIIlI3 > llIllIIIIIllIlIIIIlI6) {
                    n4 = llIllIIIIIllIlIIIIlI6 + 1.0;
                }
                else if (llIllIIIIIllIlIIIIlI3 < llIllIIIIIllIlIIIIlI6) {
                    n4 = llIllIIIIIllIlIIIIlI6 + 0.0;
                }
                else {
                    b6 = false;
                }
                double n5 = 999.0;
                double n6 = 999.0;
                double n7 = 999.0;
                final double n8 = e2.llllIIIIlIIIlIlllIll - e.llllIIIIlIIIlIlllIll;
                final double n9 = e2.IlIlIlIlIlllllllllIl - e.IlIlIlIlIlllllllllIl;
                final double n10 = e2.llIllIIIIIllIlIIIIlI - e.llIllIIIIIllIlIIIIlI;
                if (b4) {
                    n5 = (n2 - e.llllIIIIlIIIlIlllIll) / n8;
                }
                if (b5) {
                    n6 = (n3 - e.IlIlIlIlIlllllllllIl) / n9;
                }
                if (b6) {
                    n7 = (n4 - e.llIllIIIIIllIlIIIIlI) / n10;
                }
                if (n5 == -0.0) {
                    n5 = -1.0E-4;
                }
                if (n6 == -0.0) {
                    n6 = -1.0E-4;
                }
                if (n7 == -0.0) {
                    n7 = -1.0E-4;
                }
                lllIllIIIllllllIllll lllIllIIIllllllIllll;
                if (n5 < n6 && n5 < n7) {
                    lllIllIIIllllllIllll = ((llIllIIIIIllIlIIIIlI > llIllIIIIIllIlIIIIlI4) ? net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI : net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl);
                    e = new e(n2, e.IlIlIlIlIlllllllllIl + n9 * n5, e.llIllIIIIIllIlIIIIlI + n10 * n5);
                }
                else if (n6 < n7) {
                    lllIllIIIllllllIllll = ((llIllIIIIIllIlIIIIlI2 > llIllIIIIIllIlIIIIlI5) ? net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll : net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl);
                    e = new e(e.llllIIIIlIIIlIlllIll + n8 * n6, n3, e.llIllIIIIIllIlIIIIlI + n10 * n6);
                }
                else {
                    lllIllIIIllllllIllll = ((llIllIIIIIllIlIIIIlI3 > llIllIIIIIllIlIIIIlI6) ? net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI : net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl);
                    e = new e(e.llllIIIIlIIIlIlllIll + n8 * n7, e.IlIlIlIlIlllllllllIl + n9 * n7, n4);
                }
                llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e.llllIIIIlIIIlIlllIll) - ((lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) ? 1 : 0);
                llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e.IlIlIlIlIlllllllllIl) - ((lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) ? 1 : 0);
                llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e.llIllIIIIIllIlIIIIlI) - ((lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) ? 1 : 0);
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI4, llIllIIIIIllIlIIIIlI5, llIllIIIIIllIlIIIIlI6);
                final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3);
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI8 = ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI();
                if (b2 && llIllIIIIIllIlIIIIlI8.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl4) == null) {
                    continue;
                }
                if (llIllIIIIIllIlIIIIlI8.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, b)) {
                    final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll2 = llIllIIIIIllIlIIIIlI8.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl3, e, e2);
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        return llllIIIIlIIIlIlllIll2;
                    }
                    continue;
                }
                else {
                    llIlllIlllllIIllIIII = new llIlllIlllllIIllIIII(lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll, e, lllIllIIIllllllIllll, ilIlIlIlIlllllllllIl3);
                }
            }
            return b3 ? llIlllIlllllIIllIIII : null;
        }
        return null;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final String s, final float n, final float n2) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(s, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, n, n2);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String s, final float n, final float n2) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, s, llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, n, n2);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final String s, final float n4, final float n5) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(s, n, n2, n3, n4, n5);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final String s, final float n4, final float n5, final boolean b) {
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final String s) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(s, ilIlIlIlIlllllllllIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int... array) {
        this.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(), ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI(), n, n2, n3, n4, n5, n6, array);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final boolean b, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int... array) {
        this.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(), ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI() | b, n, n2, n3, n4, n5, n6, array);
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final boolean b, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final int... array) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(n, b, n2, n3, n4, n5, n6, n7, array);
        }
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIlIlllIlIIIIIl.add(llIllIIIIIllIlIIIIlI);
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl / 16.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII / 16.0);
        boolean ilIlIIIlIIlIlIIlllIl = llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl;
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            ilIlIIIlIIlIlIIlllIl = true;
        }
        if (!ilIlIIIlIIlIlIIlllIl && !this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3, true)) {
            return false;
        }
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            this.IllIIlllIIIIlllIIlIl.add(llIllIIIIIllIlIIIIlI);
            this.IIlllIIIlIlllIIlllII();
        }
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl.add(llIllIIIIIllIlIIIIlI);
        this.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI);
        return true;
    }
    
    protected void llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        }
    }
    
    protected void IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI != null) {
            llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI)null);
        }
        if (llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll != null) {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI)null);
        }
        llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII();
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            this.IllIIlllIIIIlllIIlIl.remove(llIllIIIIIllIlIIIIlI);
            this.IIlllIIIlIlllIIlllII();
            this.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI);
        }
    }
    
    public void IllIIlllIIIIlllIIlIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII();
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            this.IllIIlllIIIIlllIIlIl.remove(llIllIIIIIllIlIIIIlI);
            this.IIlllIIIlIlllIIlllII();
        }
        final int lllllIIlIlIIIlIlIIIl = llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl;
        final int llllIllllIllllIlIlII = llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII;
        if (llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll && this.IlIlIlIlIlllllllllIl(lllllIIlIlIIIlIlIIIl, llllIllllIllllIlIlII, true)) {
            this.llllIIIIlIIIlIlllIll(lllllIIlIlIIIlIlIIIl, llllIllllIllllIlIlII).IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        }
        this.IlIlIlIlIlllllllllIl.remove(llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        this.IIlllIIlIllIllIlIIll.add(llllIIllllIlIlIIIIll);
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        this.IIlllIIlIllIllIlIIll.remove(llllIIllllIlIlIIIIll);
    }
    
    public List llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final ArrayList arrayList = Lists.newArrayList();
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl + 1.0);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI + 1.0);
        final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        final int llIllIIIIIllIlIIIIlI7 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl + 1.0);
        final llIllIIIIIllIlIIIIlI illIllIlllIllllIIllI = this.IllIllIlllIllllIIllI();
        final boolean a = llIllIIIIIllIlIIIIlI.a();
        final boolean llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, llIllIIIIIllIlIIIIlI);
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl lllIllIIIllllllIllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll();
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = llIllIIIIIllIlIIIIlI2; i < llIllIIIIIllIlIIIIlI3; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI6; j < llIllIIIIIllIlIIIIlI7; ++j) {
                if (this.IllIIlllIIIIlllIIlIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, 64, j))) {
                    for (int k = llIllIIIIIllIlIIIIlI4 - 1; k < llIllIIIIIllIlIIIIlI5; ++k) {
                        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, k, j);
                        if (a && llllIIIIlIIIlIlllIll2) {
                            llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII(false);
                        }
                        else if (!a && !llllIIIIlIIIlIlllIll2) {
                            llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII(true);
                        }
                        net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = lllIllIIIllllllIllll;
                        if (illIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl) || !llllIIIIlIIIlIlllIll2) {
                            ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl);
                        }
                        ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(this, llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, arrayList, llIllIIIIIllIlIIIIlI);
                    }
                }
            }
        }
        final double n = 0.25;
        final List ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n, n, n));
        for (int l = 0; l < ilIlIlIlIlllllllllIl2.size(); ++l) {
            if (llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI != ilIlIlIlIlllllllllIl2 && llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll != ilIlIlIlIlllllllllIl2) {
                final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll h_ = ilIlIlIlIlllllllllIl2.get(l).h_();
                if (h_ != null && h_.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll)) {
                    arrayList.add(h_);
                }
                final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl2 = llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl2.get(l));
                if (llllIIIlIlllIlIIIIIl2 != null && llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll)) {
                    arrayList.add(llllIIIlIlllIlIIIIIl2);
                }
            }
        }
        return arrayList;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2) {
        final double ilIIIlIlIIIllIlIlIIl = llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
        final double ilIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI();
        final double illIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl();
        final double llllIIIlIlllIlIIIIIl = llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl();
        double n;
        double n2;
        double n3;
        double n4;
        if (llIllIIIIIllIlIIIIlI2.a()) {
            n = ilIIIlIlIIIllIlIlIIl + 1.0;
            n2 = ilIlIIIllIllIIIIIllI + 1.0;
            n3 = illIIlllIIIIlllIIlIl - 1.0;
            n4 = llllIIIlIlllIlIIIIIl - 1.0;
        }
        else {
            n = ilIIIlIlIIIllIlIlIIl - 1.0;
            n2 = ilIlIIIllIllIIIIIllI - 1.0;
            n3 = illIIlllIIIIlllIIlIl + 1.0;
            n4 = llllIIIlIlllIlIIIIIl + 1.0;
        }
        return llIllIIIIIllIlIIIIlI2.IIlllIlIIllIlIlIlIIl > n && llIllIIIIIllIlIIIIlI2.IIlllIlIIllIlIlIlIIl < n3 && llIllIIIIIllIlIIIIlI2.lllllIlIIIlIlIIlllII > n2 && llIllIIIIIllIlIIIIlI2.lllllIlIIIlIlIIlllII < n4;
    }
    
    public List llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final ArrayList arrayList = Lists.newArrayList();
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl + 1.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI + 1.0);
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl + 1.0);
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = llIllIIIIIllIlIIIIlI; i < llIllIIIIIllIlIIIIlI2; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI5; j < llIllIIIIIllIlIIIIlI6; ++j) {
                if (this.IllIIlllIIIIlllIIlIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, 64, j))) {
                    for (int k = llIllIIIIIllIlIIIIlI3 - 1; k < llIllIIIIIllIlIIIIlI4; ++k) {
                        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, k, j);
                        net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl;
                        if (i >= -30000000 && i < 30000000 && j >= -30000000 && j < 30000000) {
                            llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl);
                        }
                        else {
                            llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll();
                        }
                        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(this, llllIIIlIlllIlIIIIIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, arrayList, null);
                    }
                }
            }
        }
        return arrayList;
    }
    
    public int llllIIIIlIIIlIlllIll(final float n) {
        return (int)((1.0f - (float)((float)((1.0f - llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(1.0f - (llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI(n) * 3.1415927f * 2.0f) * 2.0f + 0.5f), 0.0f, 1.0f)) * (1.0 - this.llIIlIIIlIIIllIlIIIl(n) * 5.0f / 16.0)) * (1.0 - this.lIIIIlIIIIIlllIllIII(n) * 5.0f / 16.0))) * 11.0f);
    }
    
    public float IlIlIlIlIlllllllllIl(final float n) {
        return (float)((float)((1.0f - llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(1.0f - (llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI(n) * 3.1415927f * 2.0f) * 2.0f + 0.2f), 0.0f, 1.0f)) * (1.0 - this.llIIlIIIlIIIllIlIIIl(n) * 5.0f / 16.0)) * (1.0 - this.lIIIIlIIIIIlllIllIII(n) * 5.0f / 16.0)) * 0.8f + 0.2f;
    }
    
    public e llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI(n) * 3.1415927f * 2.0f) * 2.0f + 0.5f, 0.0f, 1.0f);
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII));
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        final int llllIIIIlIIIlIlllIll2 = llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
        final float n2 = (llllIIIIlIIIlIlllIll2 >> 16 & 0xFF) / 255.0f;
        final float n3 = (llllIIIIlIIIlIlllIll2 >> 8 & 0xFF) / 255.0f;
        final float n4 = (llllIIIIlIIIlIlllIll2 & 0xFF) / 255.0f;
        float n5 = n2 * llllIIIIlIIIlIlllIll;
        float n6 = n3 * llllIIIIlIIIlIlllIll;
        float n7 = n4 * llllIIIIlIIIlIlllIll;
        final float llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl(n);
        if (llIIlIIIlIIIllIlIIIl > 0.0f) {
            final float n8 = (n5 * 0.3f + n6 * 0.59f + n7 * 0.11f) * 0.6f;
            final float n9 = 1.0f - llIIlIIIlIIIllIlIIIl * 0.75f;
            n5 = n5 * n9 + n8 * (1.0f - n9);
            n6 = n6 * n9 + n8 * (1.0f - n9);
            n7 = n7 * n9 + n8 * (1.0f - n9);
        }
        final float liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII(n);
        if (liiiIlIIIIIlllIllIII > 0.0f) {
            final float n10 = (n5 * 0.3f + n6 * 0.59f + n7 * 0.11f) * 0.2f;
            final float n11 = 1.0f - liiiIlIIIIIlllIllIII * 0.75f;
            n5 = n5 * n11 + n10 * (1.0f - n11);
            n6 = n6 * n11 + n10 * (1.0f - n11);
            n7 = n7 * n11 + n10 * (1.0f - n11);
        }
        if (this.IlIIIlIIIllllIlIlIlI > 0) {
            float n12 = this.IlIIIlIIIllllIlIlIlI - n;
            if (n12 > 1.0f) {
                n12 = 1.0f;
            }
            final float n13 = n12 * 0.45f;
            n5 = n5 * (1.0f - n13) + 0.8f * n13;
            n6 = n6 * (1.0f - n13) + 0.8f * n13;
            n7 = n7 * (1.0f - n13) + 1.0f * n13;
        }
        return new e(n5, n6, n7);
    }
    
    public float llIllIIIIIllIlIIIIlI(final float n) {
        return this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl(), n);
    }
    
    public int IlIlIIIllIIllIlllllI() {
        return this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl());
    }
    
    public float IIIIlllIIIIIIlIIIlll() {
        return net.minecraft.IIIlIIlIIIIlllIlllII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll[this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl())];
    }
    
    public float IlIIIlIlIIIllIlIlIIl(final float n) {
        return this.llIllIIIIIllIlIIIIlI(n) * 3.1415927f * 2.0f;
    }
    
    public e IlIlIIIllIllIIIIIllI(final float n) {
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI(n) * 3.1415927f * 2.0f) * 2.0f + 0.5f, 0.0f, 1.0f);
        float n2 = (this.llllllIllIllIlIllllI >> 16 & 0xFFL) / 255.0f;
        float n3 = (this.llllllIllIllIlIllllI >> 8 & 0xFFL) / 255.0f;
        float n4 = (this.llllllIllIllIlIllllI & 0xFFL) / 255.0f;
        final float llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl(n);
        if (llIIlIIIlIIIllIlIIIl > 0.0f) {
            final float n5 = (n2 * 0.3f + n3 * 0.59f + n4 * 0.11f) * 0.6f;
            final float n6 = 1.0f - llIIlIIIlIIIllIlIIIl * 0.95f;
            n2 = n2 * n6 + n5 * (1.0f - n6);
            n3 = n3 * n6 + n5 * (1.0f - n6);
            n4 = n4 * n6 + n5 * (1.0f - n6);
        }
        float n7 = n2 * (llllIIIIlIIIlIlllIll * 0.9f + 0.1f);
        float n8 = n3 * (llllIIIIlIIIlIlllIll * 0.9f + 0.1f);
        float n9 = n4 * (llllIIIIlIIIlIlllIll * 0.85f + 0.15f);
        final float liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII(n);
        if (liiiIlIIIIIlllIllIII > 0.0f) {
            final float n10 = (n7 * 0.3f + n8 * 0.59f + n9 * 0.11f) * 0.2f;
            final float n11 = 1.0f - liiiIlIIIIIlllIllIII * 0.95f;
            n7 = n7 * n11 + n10 * (1.0f - n11);
            n8 = n8 * n11 + n10 * (1.0f - n11);
            n9 = n9 * n11 + n10 * (1.0f - n11);
        }
        return new e(n7, n8, n9);
    }
    
    public e IllIIlllIIIIlllIIlIl(final float n) {
        return this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI(n), n);
    }
    
    public IlIlIlIlIlllllllllIl IIlllIIlIllIllIlIIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
    }
    
    public IlIlIlIlIlllllllllIl lllIIIIlllllIlIIllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl);
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2;
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3;
        for (ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() + 16, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()); ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() >= 0; ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl3) {
            ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl();
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3).IllIIlllIIIIlllIIlIl();
            if (illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() && illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                break;
            }
        }
        return ilIlIlIlIlllllllllIl2;
    }
    
    public float llllIIIlIlllIlIIIIIl(final float n) {
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(1.0f - (llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI(n) * 3.1415927f * 2.0f) * 2.0f + 0.25f), 0.0f, 1.0f);
        return llllIIIIlIIIlIlllIll * llllIIIIlIIIlIlllIll * 0.5f;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
    }
    
    public void llllIIllllIlIlIIIIll() {
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("entities");
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("global");
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.size(); ++i) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = this.llllIIIlIlllIlIIIIIl.get(i);
            try {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI;
                ++llIllIIIIIllIlIIIIlI2.lllllIIIIIlIlIIIIIIl;
                llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI();
            }
            catch (Throwable t) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Ticking entity");
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Entity being ticked");
                if (llIllIIIIIllIlIIIIlI == null) {
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Entity", "~~NULL~~");
                }
                else {
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                }
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
            }
            if (llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl) {
                this.llllIIIlIlllIlIIIIIl.remove(i--);
            }
        }
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("remove");
        this.IlIlIlIlIlllllllllIl.removeAll(this.llIllIIIIIllIlIIIIlI);
        for (int j = 0; j < this.llIllIIIIIllIlIIIIlI.size(); ++j) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI3 = this.llIllIIIIIllIlIIIIlI.get(j);
            final int lllllIIlIlIIIlIlIIIl = llIllIIIIIllIlIIIIlI3.lllllIIlIlIIIlIlIIIl;
            final int llllIllllIllllIlIlII = llIllIIIIIllIlIIIIlI3.llllIllllIllllIlIlII;
            if (llIllIIIIIllIlIIIIlI3.IlIIlllllIIllIIlllll && this.IlIlIlIlIlllllllllIl(lllllIIlIlIIIlIlIIIl, llllIllllIllllIlIlII, true)) {
                this.llllIIIIlIIIlIlllIll(lllllIIlIlIIIlIlIIIl, llllIllllIllllIlIlII).IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI3);
            }
        }
        for (int k = 0; k < this.llIllIIIIIllIlIIIIlI.size(); ++k) {
            this.IlIIIlIlIIIllIlIlIIl((net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI)this.llIllIIIIIllIlIIIIlI.get(k));
        }
        this.llIllIIIIIllIlIIIIlI.clear();
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("regular");
        for (int l = 0; l < this.IlIlIlIlIlllllllllIl.size(); ++l) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI4 = this.IlIlIlIlIlllllllllIl.get(l);
            if (llIllIIIIIllIlIIIIlI4.IIIlIIIlIlIIlllIIlll != null) {
                if (!llIllIIIIIllIlIIIIlI4.IIIlIIIlIlIIlllIIlll.IIlIlIlIIlIllIIIIIIl && llIllIIIIIllIlIIIIlI4.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI == llIllIIIIIllIlIIIIlI4) {
                    continue;
                }
                llIllIIIIIllIlIIIIlI4.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI = null;
                llIllIIIIIllIlIIIIlI4.IIIlIIIlIlIIlllIIlll = null;
            }
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("tick");
            if (!llIllIIIIIllIlIIIIlI4.IIlIlIlIIlIllIIIIIIl) {
                try {
                    this.llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI4);
                }
                catch (Throwable t2) {
                    final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t2, "Ticking entity");
                    llIllIIIIIllIlIIIIlI4.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Entity being ticked"));
                    throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll3);
                }
            }
            this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("remove");
            if (llIllIIIIIllIlIIIIlI4.IIlIlIlIIlIllIIIIIIl) {
                final int lllllIIlIlIIIlIlIIIl2 = llIllIIIIIllIlIIIIlI4.lllllIIlIlIIIlIlIIIl;
                final int llllIllllIllllIlIlII2 = llIllIIIIIllIlIIIIlI4.llllIllllIllllIlIlII;
                if (llIllIIIIIllIlIIIIlI4.IlIIlllllIIllIIlllll && this.IlIlIlIlIlllllllllIl(lllllIIlIlIIIlIlIIIl2, llllIllllIllllIlIlII2, true)) {
                    this.llllIIIIlIIIlIlllIll(lllllIIlIlIIIlIlIIIl2, llllIllllIllllIlIlII2).IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI4);
                }
                this.IlIlIlIlIlllllllllIl.remove(l--);
                this.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI4);
            }
            this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        }
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("blockEntities");
        this.IIllllIIIlIIIIIIllIl = true;
        final Iterator iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = iterator.next();
            if (!ilIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll() && ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII()) {
                final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI();
                if (this.IllIIlllIIIIlllIIlIl(lIlIlIIIllIIllIIIllI) && this.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI)) {
                    try {
                        ((llIIIllIlIllIllIIIIl)ilIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll();
                    }
                    catch (Throwable t3) {
                        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t3, "Ticking block entity");
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("Block entity being ticked"));
                        throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll4);
                    }
                }
            }
            if (ilIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll()) {
                iterator.remove();
                this.IlIIIlIlIIIllIlIlIIl.remove(ilIIIlIlIIIllIlIlIIl);
                if (!this.IllIIlllIIIIlllIIlIl(ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI())) {
                    continue;
                }
                this.llllIIIlIlllIlIIIIIl(ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI()).llllIIIlIlllIlIIIIIl(ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI());
            }
        }
        this.IIllllIIIlIIIIIIllIl = false;
        if (!this.IIlIIIIIllIlIIIlIIll.isEmpty()) {
            this.IlIlIIIllIllIIIIIllI.removeAll(this.IIlIIIIIllIlIIIlIIll);
            this.IlIIIlIlIIIllIlIlIIl.removeAll(this.IIlIIIIIllIlIIIlIIll);
            this.IIlIIIIIllIlIIIlIIll.clear();
        }
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("pendingBlockEntities");
        if (!this.IIlllIIIlIlllIIlllII.isEmpty()) {
            for (int n = 0; n < this.IIlllIIIlIlllIIlllII.size(); ++n) {
                final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = this.IIlllIIIlIlllIIlllII.get(n);
                if (!ilIIIlIlIIIllIlIlIIl2.llllIIllllIlIlIIIIll()) {
                    if (!this.IlIIIlIlIIIllIlIlIIl.contains(ilIIIlIlIIIllIlIlIIl2)) {
                        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2);
                    }
                    if (this.IllIIlllIIIIlllIIlIl(ilIIIlIlIIIllIlIlIIl2.lIlIlIIIllIIllIIIllI())) {
                        this.llllIIIlIlllIlIIIIIl(ilIIIlIlIIIllIlIlIIl2.lIlIlIIIllIIllIIIllI()).llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2.lIlIlIIIllIIllIIIllI(), ilIIIlIlIIIllIlIlIIl2);
                    }
                    this.lIIIlllIIIllIIIllIII(ilIIIlIlIIIllIlIlIIl2.lIlIlIIIllIIllIIIllI());
                }
            }
            this.IIlllIIIlIlllIIlllII.clear();
        }
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final boolean add = this.IlIIIlIlIIIllIlIlIIl.add(ilIIIlIlIIIllIlIlIIl);
        if (add && ilIIIlIlIIIllIlIlIIl instanceof llIIIllIlIllIllIIIIl) {
            this.IlIlIIIllIllIIIIIllI.add(ilIIIlIlIIIllIlIlIIl);
        }
        return add;
    }
    
    public void llllIIIIlIIIlIlllIll(final Collection collection) {
        if (this.IIllllIIIlIIIIIIllIl) {
            this.IIlllIIIlIlllIIlllII.addAll(collection);
        }
        else {
            for (final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : collection) {
                this.IlIIIlIlIIIllIlIlIIl.add(ilIIIlIlIIIllIlIlIIl);
                if (ilIIIlIlIIIllIlIlIIl instanceof llIIIllIlIllIllIIIIl) {
                    this.IlIlIIIllIllIIIIIllI.add(ilIIIlIlIIIllIlIlIIl);
                }
            }
        }
    }
    
    public void llllIIIlIlllIlIIIIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, true);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final boolean b) {
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
        final int n = 32;
        if (!b || this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2 - n, 0, llIllIIIIIllIlIIIIlI3 - n, llIllIIIIIllIlIIIIlI2 + n, 0, llIllIIIIIllIlIIIIlI3 + n, true)) {
            llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
            llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII;
            llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
            llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl = llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll;
            llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI = llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI;
            if (b && llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll) {
                ++llIllIIIIIllIlIIIIlI.lllllIIIIIlIlIIIIIIl;
                if (llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll != null) {
                    llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI();
                }
                else {
                    llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI();
                }
            }
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("chunkCheck");
            if (Double.isNaN(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl) || Double.isInfinite(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl)) {
                llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl = llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl;
            }
            if (Double.isNaN(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII) || Double.isInfinite(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII)) {
                llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII = llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII;
            }
            if (Double.isNaN(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII) || Double.isInfinite(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII)) {
                llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII = llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl;
            }
            if (Double.isNaN(llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI) || Double.isInfinite(llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI)) {
                llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI = llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI;
            }
            if (Double.isNaN(llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll) || Double.isInfinite(llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll)) {
                llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll = llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl;
            }
            final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl / 16.0);
            final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII / 16.0);
            final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII / 16.0);
            if (!llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll || llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl != llIllIIIIIllIlIIIIlI4 || llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII != llIllIIIIIllIlIIIIlI5 || llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII != llIllIIIIIllIlIIIIlI6) {
                if (llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll && this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl, llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII, true)) {
                    this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl, llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII);
                }
                if (this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI4, llIllIIIIIllIlIIIIlI6, true)) {
                    llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll = true;
                    this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI4, llIllIIIIIllIlIIIIlI6).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                }
                else {
                    llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll = false;
                }
            }
            this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
            if (b && llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll && llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI != null) {
                if (!llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI.IIlIlIlIIlIllIIIIIIl && llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI.IIIlIIIlIlIIlllIIlll == llIllIIIIIllIlIIIIlI) {
                    this.llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI);
                }
                else {
                    llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI.IIIlIIIlIlIIlllIIlll = null;
                    llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI = null;
                }
            }
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, (net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI)null);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final List ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(null, llllIIIIlIIIlIlllIll);
        for (int i = 0; i < ilIlIlIlIlllllllllIl.size(); ++i) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl.get(i);
            if (!llIllIIIIIllIlIIIIlI2.IIlIlIlIIlIllIIIIIIl && llIllIIIIIllIlIIIIlI2.IlIlIIIIIIlllIlIllIl && llIllIIIIIllIlIIIIlI2 != llIllIIIIIllIlIIIIlI && (llIllIIIIIllIlIIIIlI == null || (llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll != llIllIIIIIllIlIIIIlI2 && llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI != llIllIIIIIllIlIIIIlI2))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = llIllIIIIIllIlIIIIlI; i <= llIllIIIIIllIlIIIIlI2; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI3; j <= llIllIIIIIllIlIIIIlI4; ++j) {
                for (int k = llIllIIIIIllIlIIIIlI5; k <= llIllIIIIIllIlIIIIlI6; ++k) {
                    if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, j, k)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = llIllIIIIIllIlIIIIlI; i <= llIllIIIIIllIlIIIIlI2; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI3; j <= llIllIIIIIllIlIIIIlI4; ++j) {
                for (int k = llIllIIIIIllIlIIIIlI5; k <= llIllIIIIIllIlIIIIlI6; ++k) {
                    if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, j, k)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl + 1.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI + 1.0);
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl + 1.0);
        if (this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI3, llIllIIIIIllIlIIIIlI5, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI4, llIllIIIIIllIlIIIIlI6, true)) {
            final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
            for (int i = llIllIIIIIllIlIIIIlI; i < llIllIIIIIllIlIIIIlI2; ++i) {
                for (int j = llIllIIIIIllIlIIIIlI3; j < llIllIIIIIllIlIIIIlI4; ++j) {
                    for (int k = llIllIIIIIllIlIIIIlI5; k < llIllIIIIIllIlIIIIlI6; ++k) {
                        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI7 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, j, k)).llIllIIIIIllIlIIIIlI();
                        if (llIllIIIIIllIlIIIIlI7 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI || llIllIIIIIllIlIIIIlI7 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI || llIllIIIIIllIlIIIIlI7 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl + 1.0);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI + 1.0);
        final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        final int llIllIIIIIllIlIIIIlI7 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl + 1.0);
        if (!this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI4, llIllIIIIIllIlIIIIlI6, llIllIIIIIllIlIIIIlI3, llIllIIIIIllIlIIIIlI5, llIllIIIIIllIlIIIIlI7, true)) {
            return false;
        }
        boolean b = false;
        e llllIIIIlIIIlIlllIll2 = new e(0.0, 0.0, 0.0);
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = llIllIIIIIllIlIIIIlI2; i < llIllIIIIIllIlIIIIlI3; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI4; j < llIllIIIIIllIlIIIIlI5; ++j) {
                for (int k = llIllIIIIIllIlIIIIlI6; k < llIllIIIIIllIlIIIIlI7; ++k) {
                    llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, j, k);
                    final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl);
                    final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI8 = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
                    if (llIllIIIIIllIlIIIIlI8.IllIIlllIIIIlllIIlIl() == ilIlIlIlIlllllllllIl && llIllIIIIIllIlIIIIlI5 >= (double)(j + 1 - IlIIlllIIlIlllllIIlI.IlIlIIIllIllIIIIIllI((int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl)))) {
                        b = true;
                        llllIIIIlIIIlIlllIll2 = llIllIIIIIllIlIIIIlI8.llllIIIIlIIIlIlllIll(this, llllIIIlIlllIlIIIIIl, llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll2);
                    }
                }
            }
        }
        if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl() > 0.0 && llIllIIIIIllIlIIIIlI.IllIlllIllIIIIllllII()) {
            final e llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
            final double n = 0.014;
            llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII += llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll * n;
            llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI += llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl * n;
            llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII += llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI * n;
        }
        return b;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl + 1.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI + 1.0);
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl + 1.0);
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = llIllIIIIIllIlIIIIlI; i < llIllIIIIIllIlIIIIlI2; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI3; j < llIllIIIIIllIlIIIIlI4; ++j) {
                for (int k = llIllIIIIIllIlIIIIlI5; k < llIllIIIIIllIlIIIIlI6; ++k) {
                    if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, j, k)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == ilIlIlIlIlllllllllIl) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl + 1.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI + 1.0);
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl + 1.0);
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = llIllIIIIIllIlIIIIlI; i < llIllIIIIIllIlIIIIlI2; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI3; j < llIllIIIIIllIlIIIIlI4; ++j) {
                for (int k = llIllIIIIIllIlIIIIlI5; k < llIllIIIIIllIlIIIIlI6; ++k) {
                    final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, j, k));
                    if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == ilIlIlIlIlllllllllIl) {
                        final int intValue = (int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl);
                        double n = j + 1;
                        if (intValue < 8) {
                            n = j + 1 - intValue / 8.0;
                        }
                        if (n >= llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, false, b);
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final boolean b, final boolean b2) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new net.minecraft.IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII(this, llIllIIIIIllIlIIIIlI, n, n2, n3, n4, b, b2);
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(true);
        return liiiIlIIIIIlllIllIII;
    }
    
    public float llllIIIIlIIIlIlllIll(final e e, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final double n = 1.0 / ((llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl - llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) * 2.0 + 1.0);
        final double n2 = 1.0 / ((llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI - llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) * 2.0 + 1.0);
        final double n3 = 1.0 / ((llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl - llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) * 2.0 + 1.0);
        final double n4 = (1.0 - Math.floor(1.0 / n) * n) / 2.0;
        final double n5 = (1.0 - Math.floor(1.0 / n3) * n3) / 2.0;
        if (n >= 0.0 && n2 >= 0.0 && n3 >= 0.0) {
            int n6 = 0;
            int n7 = 0;
            for (float n8 = 0.0f; n8 <= 1.0f; n8 += (float)n) {
                for (float n9 = 0.0f; n9 <= 1.0f; n9 += (float)n2) {
                    for (float n10 = 0.0f; n10 <= 1.0f; n10 += (float)n3) {
                        if (this.llllIIIIlIIIlIlllIll(new e(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll + (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl - llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) * n8 + n4, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI - llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) * n9, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl - llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) * n10 + n5), e) == null) {
                            ++n6;
                        }
                        ++n7;
                    }
                }
            }
            return n6 / (float)n7;
        }
        return 0.0f;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        if (this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI) {
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 1004, llllIIIIlIIIlIlllIll2, 0);
            this.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2);
            return true;
        }
        return false;
    }
    
    public String IlIllIlIlIIIlIlIlIII() {
        return "All: " + this.IlIlIlIlIlllllllllIl.size();
    }
    
    public String IIlllIIlIllIllIlIIll() {
        return this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!this.llIIlllIIlllIIllIllI(ilIlIlIlIlllllllllIl)) {
            return null;
        }
        net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = null;
        if (this.IIllllIIIlIIIIIIllIl) {
            for (int i = 0; i < this.IIlllIIIlIlllIIlllII.size(); ++i) {
                final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IIlllIIIlIlllIIlllII.get(i);
                if (!ilIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll() && ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI().equals(ilIlIlIlIlllllllllIl)) {
                    llllIIIIlIIIlIlllIll = ilIIIlIlIIIllIlIlIIl;
                    break;
                }
            }
        }
        if (llllIIIIlIIIlIlllIll == null) {
            llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll);
        }
        if (llllIIIIlIIIlIlllIll == null) {
            for (int j = 0; j < this.IIlllIIIlIlllIIlllII.size(); ++j) {
                final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = this.IIlllIIIlIlllIIlllII.get(j);
                if (!ilIIIlIlIIIllIlIlIIl2.llllIIllllIlIlIIIIll() && ilIIIlIlIIIllIlIlIIl2.lIlIlIIIllIIllIIIllI().equals(ilIlIlIlIlllllllllIl)) {
                    llllIIIIlIIIlIlllIll = ilIIIlIlIIIllIlIlIIl2;
                    break;
                }
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl != null && !ilIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll()) {
            if (this.IIllllIIIlIIIIIIllIl) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                final Iterator<net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl> iterator = (Iterator<net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl>)this.IIlllIIIlIlllIIlllII.iterator();
                while (iterator.hasNext()) {
                    final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = iterator.next();
                    if (ilIIIlIlIIIllIlIlIIl2.lIlIlIIIllIIllIIIllI().equals(ilIlIlIlIlllllllllIl)) {
                        ilIIIlIlIIIllIlIlIIl2.IlIllIlIlIIIlIlIlIII();
                        iterator.remove();
                    }
                }
                this.IIlllIIIlIlllIIlllII.add(ilIIIlIlIIIllIlIlIIl);
            }
            else {
                this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    public void IlIlIIIIIIlllIlIllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll != null && this.IIllllIIIlIIIIIIllIl) {
            llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII();
            this.IIlllIIIlIlllIIlllII.remove(llllIIIIlIIIlIlllIll);
        }
        else {
            if (llllIIIIlIIIlIlllIll != null) {
                this.IIlllIIIlIlllIIlllII.remove(llllIIIIlIIIlIlllIll);
                this.IlIIIlIlIIIllIlIlIIl.remove(llllIIIIlIIIlIlllIll);
                this.IlIlIIIllIllIIIIIllI.remove(llllIIIIlIIIlIlllIll);
            }
            this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IIlIIIIIllIlIIIlIIll.add(ilIIIlIlIIIllIlIlIIl);
    }
    
    public boolean IIllIIllIIIlIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
        return llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() >= 1.0;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        return (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl().llIIlIIIlIIIllIlIIIl() && llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl()) || ((llIllIIIIIllIlIIIIlI instanceof cm) ? (ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl) == cn.llllIIIIlIIIlIlllIll) : ((llIllIIIIIllIlIIIIlI instanceof cc) ? (ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cc.IIIIIIIIIlllIllIlIlI) == cd.llllIIIIlIIIlIlllIll) : (llIllIIIIIllIlIIIIlI instanceof lllIlIIIIIlIlllllIlI || (llIllIIIIIllIlIIIIlI instanceof cf && (int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cf.IIIIIIIIIlllIllIlIlI) == 7))));
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        if (!this.llIIlllIIlllIIllIllI(ilIlIlIlIlllllllllIl)) {
            return b;
        }
        if (this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl).lIIIIlIIIIIlllIllIII()) {
            return b;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl().llIIlIIIlIIIllIlIIIl() && llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl();
    }
    
    public void lllIIIIlllllIlIIllIl() {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(1.0f);
        if (llllIIIIlIIIlIlllIll != this.IIIllllllIllIIIlllIl) {
            this.IIIllllllIllIIIlllIl = llllIIIIlIIIlIlllIll;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llIIIlIlIllIIlIlIlII, final boolean lllllIlIIIlIlIIlllII) {
        this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIIIllIllIIIIIllI();
    }
    
    protected void IlIlIIIIIIlllIlIllIl() {
        if (this.IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll()) {
            this.lIlIlIIIllIIllIIIllI = 1.0f;
            if (this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI()) {
                this.IIIIlllIIIIIIlIIIlll = 1.0f;
            }
        }
    }
    
    protected void IlIlIIIllIllIIIIIllI() {
        if (!this.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() && !this.IlIlIllllllllIIIIlII) {
            int ilIlIllllllllIIIIlII = this.IIllIIllIIIlIlIIIIlI.IlIlIllllllllIIIIlII();
            if (ilIlIllllllllIIIIlII > 0) {
                --ilIlIllllllllIIIIlII;
                this.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl(ilIlIllllllllIIIIlII);
                this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI(this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI() ? 1 : 2);
                this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl(this.IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll() ? 1 : 2);
            }
            int iiiIlllIIIIIIlIIIlll = this.IIllIIllIIIlIlIIIIlI.IIIIlllIIIIIIlIIIlll();
            if (iiiIlllIIIIIIlIIIlll <= 0) {
                if (this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI()) {
                    this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI(this.llllIIllllIlIlIIIIll.nextInt(12000) + 3600);
                }
                else {
                    this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI(this.llllIIllllIlIlIIIIll.nextInt(168000) + 12000);
                }
            }
            else {
                --iiiIlllIIIIIIlIIIlll;
                this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI(iiiIlllIIIIIIlIIIlll);
                if (iiiIlllIIIIIIlIIIlll <= 0) {
                    this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(!this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI());
                }
            }
            this.IlIlIIIllIIllIlllllI = this.IIIIlllIIIIIIlIIIlll;
            if (this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI()) {
                this.IIIIlllIIIIIIlIIIlll += (float)0.01;
            }
            else {
                this.IIIIlllIIIIIIlIIIlll -= (float)0.01;
            }
            this.IIIIlllIIIIIIlIIIlll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll, 0.0f, 1.0f);
            int ilIllIlIlIIIlIlIlIII = this.IIllIIllIIIlIlIIIIlI.IlIllIlIlIIIlIlIlIII();
            if (ilIllIlIlIIIlIlIlIII <= 0) {
                if (this.IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll()) {
                    this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl(this.llllIIllllIlIlIIIIll.nextInt(12000) + 12000);
                }
                else {
                    this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl(this.llllIIllllIlIlIIIIll.nextInt(168000) + 12000);
                }
            }
            else {
                --ilIllIlIlIIIlIlIlIII;
                this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl(ilIllIlIlIIIlIlIlIII);
                if (ilIllIlIlIIIlIlIlIII <= 0) {
                    this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(!this.IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll());
                }
            }
            this.llIllIlIIIIllIlIIllI = this.lIlIlIIIllIIllIIIllI;
            if (this.IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll()) {
                this.lIlIlIIIllIIllIIIllI += (float)0.01;
            }
            else {
                this.lIlIlIIIllIIllIIIllI -= (float)0.01;
            }
            this.lIlIlIIIllIIllIIIllI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, 0.0f, 1.0f);
        }
    }
    
    protected void IIllIIllIIIlIlIIIIlI() {
        this.IIlllIlIIllIlIlIlIIl.clear();
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("buildList");
        for (int i = 0; i < this.IllIIlllIIIIlllIIlIl.size(); ++i) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.get(i);
            final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl / 16.0);
            final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII / 16.0);
            for (int illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl(), j = -illIIlllIIIIlllIIlIl; j <= illIIlllIIIIlllIIlIl; ++j) {
                for (int k = -illIIlllIIIIlllIIlIl; k <= illIIlllIIIIlllIIlIl; ++k) {
                    this.IIlllIlIIllIlIlIlIIl.add(new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(j + llIllIIIIIllIlIIIIlI, k + llIllIIIIIllIlIIIIlI2));
                }
            }
        }
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        if (this.IIIIIIIIIlllIllIlIlI > 0) {
            --this.IIIIIIIIIlllIllIlIlI;
        }
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("playerCheckLight");
        if (!this.IllIIlllIIIIlllIIlIl.isEmpty()) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.IllIIlllIIIIlllIIlIl.get(this.llllIIllllIlIlIIIIll.nextInt(this.IllIIlllIIIIlllIIlIl.size()));
            this.IlllllllIIIlIIIlIlII(new IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2.IIlllIlIIllIlIlIlIIl) + this.llllIIllllIlIlIIIIll.nextInt(11) - 5, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2.llIIIlIlIllIIlIlIlII) + this.llllIIllllIlIlIIIIll.nextInt(11) - 5, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2.lllllIlIIIlIlIIlllII) + this.llllIIllllIlIlIIIIll.nextInt(11) - 5));
        }
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
    }
    
    protected abstract int IllIIlllIIIIlllIIlIl();
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("moodSound");
        if (this.IIIIIIIIIlllIllIlIlI == 0 && !this.IlIlIllllllllIIIIlII) {
            this.lIIIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII * 3 + 1013904223;
            final int n3 = this.lIIIlllIIIllIIIllIII >> 2;
            final int n4 = n3 & 0xF;
            final int n5 = n3 >> 8 & 0xF;
            final int n6 = n3 >> 16 & 0xFF;
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(n4, n6, n5);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
            final int n7 = n4 + n;
            final int n8 = n5 + n2;
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && this.lIlIlIIIllIIllIIIllI(ilIlIlIlIlllllllllIl) <= this.llllIIllllIlIlIIIIll.nextInt(8) && this.IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl) <= 0) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(n7 + 0.5, n6 + 0.5, n8 + 0.5, 8.0);
                if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI(n7 + 0.5, n6 + 0.5, n8 + 0.5) > 4.0) {
                    this.llllIIIIlIIIlIlllIll(n7 + 0.5, n6 + 0.5, n8 + 0.5, "ambient.cave.cave", 0.7f, 0.8f + this.llllIIllllIlIlIIIIll.nextFloat() * 0.2f);
                    this.IIIIIIIIIlllIllIlIlI = this.llllIIllllIlIlIIIIll.nextInt(12000) + 6000;
                }
            }
        }
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("checkLight");
        llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI();
    }
    
    protected void llIllIIIIIllIlIIIIlI() {
        this.IIllIIllIIIlIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final Random random) {
        this.llllIIIIlIIIlIlllIll = true;
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this, ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl), random);
        this.llllIIIIlIIIlIlllIll = false;
    }
    
    public boolean IIIlIIIlIlIIlllIIlll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl, false);
    }
    
    public boolean IlIlIIIlIIlIlIIlllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl, true);
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        if (this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) > 0.15f) {
            return false;
        }
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 0 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256 && this.IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl) < 10) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
            if ((llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII) && (int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl) == 0) {
                if (!b) {
                    return true;
                }
                if (!this.IIlllIIIlIlllIIlllII(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()) || !this.IIlllIIIlIlllIIlllII(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()) || !this.IIlllIIIlIlllIIlllII(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()) || !this.IIlllIIIlIlllIIlllII(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean IIlllIIIlIlllIIlllII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        return this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) <= 0.15f && (!b || (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 0 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256 && this.IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl) < 10 && this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI.IlIIIlIlIIIllIlIlIIl(this, ilIlIlIlIlllllllllIl)));
    }
    
    public boolean IlllllllIIIlIIIlIlII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        boolean b = false;
        if (!this.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
            b |= this.llIllIIIIIllIlIIIIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
        }
        return b | this.llIllIIIIIllIlIIIIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
    }
    
    private int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIlIlllIlIIIIIl == llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && this.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl)) {
            return 15;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        int n = (llllIIIlIlllIlIIIIIl == llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) ? 0 : llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
        int ilIlIlIlIlllllllllIl2 = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl2 >= 15 && llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl() > 0) {
            ilIlIlIlIlllllllllIl2 = 1;
        }
        if (ilIlIlIlIlllllllllIl2 < 1) {
            ilIlIlIlIlllllllllIl2 = 1;
        }
        if (ilIlIlIlIlllllllllIl2 >= 15) {
            return 0;
        }
        if (n >= 14) {
            return n;
        }
        lllIllIIIllllllIllll[] values;
        for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            final int n2 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i])) - ilIlIlIlIlllllllllIl2;
            if (n2 > n) {
                n = n2;
            }
            if (n >= 14) {
                return n;
            }
        }
        return n;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 17, false)) {
            return false;
        }
        int i = 0;
        int n = 0;
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("getBrightness");
        final int ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl);
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl);
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        if (llllIIIIlIIIlIlllIll > ilIlIlIlIlllllllllIl2) {
            this.lIllllllIIllIlIlIlII[n++] = 133152;
        }
        else if (llllIIIIlIIIlIlllIll < ilIlIlIlIlllllllllIl2) {
            this.lIllllllIIllIlIlIlII[n++] = (0x20820 | ilIlIlIlIlllllllllIl2 << 18);
            while (i < n) {
                final int n2 = this.lIllllllIIllIlIlIlII[i++];
                final int n3 = (n2 & 0x3F) - 32 + liiiIlIIIIIlllIllIII;
                final int n4 = (n2 >> 6 & 0x3F) - 32 + liiIlllIIIllIIIllIII;
                final int n5 = (n2 >> 12 & 0x3F) - 32 + llIIlIIIlIIIllIlIIIl;
                final int n6 = n2 >> 18 & 0xF;
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = new IlIlIlIlIlllllllllIl(n3, n4, n5);
                if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl3) == n6) {
                    this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl3, 0);
                    if (n6 <= 0 || llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 - liiiIlIIIIIlllIllIII) + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n4 - liiIlllIIIllIIIllIII) + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n5 - llIIlIIIlIIIllIlIIIl) >= 17) {
                        continue;
                    }
                    final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
                    lllIllIIIllllllIllll[] values;
                    for (int length = (values = lllIllIIIllllllIllll.values()).length, j = 0; j < length; ++j) {
                        final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[j];
                        final int n7 = n3 + lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII();
                        final int n8 = n4 + lllIllIIIllllllIllll.lIIIlllIIIllIIIllIII();
                        final int n9 = n5 + lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl();
                        llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(n7, n8, n9);
                        final int max = Math.max(1, this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl2).llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl());
                        if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2) == n6 - max && n < this.lIllllllIIllIlIlIlII.length) {
                            this.lIllllllIIllIlIlIlII[n++] = (n7 - liiiIlIIIIIlllIllIII + 32 | n8 - liiIlllIIIllIIIllIII + 32 << 6 | n9 - llIIlIIIlIIIllIlIIIl + 32 << 12 | n6 - max << 18);
                        }
                    }
                }
            }
            i = 0;
        }
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("checkedPosition < toCheckCount");
        while (i < n) {
            final int n10 = this.lIllllllIIllIlIlIlII[i++];
            final int n11 = (n10 & 0x3F) - 32 + liiiIlIIIIIlllIllIII;
            final int n12 = (n10 >> 6 & 0x3F) - 32 + liiIlllIIIllIIIllIII;
            final int n13 = (n10 >> 12 & 0x3F) - 32 + llIIlIIIlIIIllIlIIIl;
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl4 = new IlIlIlIlIlllllllllIl(n11, n12, n13);
            final int ilIlIlIlIlllllllllIl5 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl4);
            final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, llllIIIlIlllIlIIIIIl);
            if (llllIIIIlIIIlIlllIll2 != ilIlIlIlIlllllllllIl5) {
                this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl4, llllIIIIlIIIlIlllIll2);
                if (llllIIIIlIIIlIlllIll2 <= ilIlIlIlIlllllllllIl5) {
                    continue;
                }
                final int abs = Math.abs(n11 - liiiIlIIIIIlllIllIII);
                final int abs2 = Math.abs(n12 - liiIlllIIIllIIIllIII);
                final int abs3 = Math.abs(n13 - llIIlIIIlIIIllIlIIIl);
                final boolean b = n < this.lIllllllIIllIlIlIlII.length - 6;
                if (abs + abs2 + abs3 >= 17 || !b) {
                    continue;
                }
                if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl4.IlIlIIIllIllIIIIIllI()) < llllIIIIlIIIlIlllIll2) {
                    this.lIllllllIIllIlIlIlII[n++] = n11 - 1 - liiiIlIIIIIlllIllIII + 32 + (n12 - liiIlllIIIllIIIllIII + 32 << 6) + (n13 - llIIlIIIlIIIllIlIIIl + 32 << 12);
                }
                if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl4.IllIIlllIIIIlllIIlIl()) < llllIIIIlIIIlIlllIll2) {
                    this.lIllllllIIllIlIlIlII[n++] = n11 + 1 - liiiIlIIIIIlllIllIII + 32 + (n12 - liiIlllIIIllIIIllIII + 32 << 6) + (n13 - llIIlIIIlIIIllIlIIIl + 32 << 12);
                }
                if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl4.IlIlIlIlIlllllllllIl()) < llllIIIIlIIIlIlllIll2) {
                    this.lIllllllIIllIlIlIlII[n++] = n11 - liiiIlIIIIIlllIllIII + 32 + (n12 - 1 - liiIlllIIIllIIIllIII + 32 << 6) + (n13 - llIIlIIIlIIIllIlIIIl + 32 << 12);
                }
                if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll()) < llllIIIIlIIIlIlllIll2) {
                    this.lIllllllIIllIlIlIlII[n++] = n11 - liiiIlIIIIIlllIllIII + 32 + (n12 + 1 - liiIlllIIIllIIIllIII + 32 << 6) + (n13 - llIIlIIIlIIIllIlIIIl + 32 << 12);
                }
                if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI()) < llllIIIIlIIIlIlllIll2) {
                    this.lIllllllIIllIlIlIlII[n++] = n11 - liiiIlIIIIIlllIllIII + 32 + (n12 - liiIlllIIIllIIIllIII + 32 << 6) + (n13 - 1 - llIIlIIIlIIIllIlIIIl + 32 << 12);
                }
                if (this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl4.IlIIIlIlIIIllIlIlIIl()) >= llllIIIIlIIIlIlllIll2) {
                    continue;
                }
                this.lIllllllIIllIlIlIlII[n++] = n11 - liiiIlIIIIIlllIllIII + 32 + (n12 - liiIlllIIIllIIIllIII + 32 << 6) + (n13 + 1 - llIIlIIIlIIIllIlIIIl + 32 << 12);
            }
        }
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final boolean b) {
        return false;
    }
    
    public List llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b) {
        return null;
    }
    
    public List IlIlIlIlIlllllllllIl(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final boolean b) {
        return null;
    }
    
    public List IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll, net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl);
    }
    
    public List llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final Predicate predicate) {
        final ArrayList arrayList = Lists.newArrayList();
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll - 2.0) / 16.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl + 2.0) / 16.0);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI - 2.0) / 16.0);
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl + 2.0) / 16.0);
        for (int i = llIllIIIIIllIlIIIIlI2; i <= llIllIIIIIllIlIIIIlI3; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI4; j <= llIllIIIIIllIlIIIIlI5; ++j) {
                if (this.IlIlIlIlIlllllllllIl(i, j, true)) {
                    this.llllIIIIlIIIlIlllIll(i, j).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll, arrayList, predicate);
                }
            }
        }
        return arrayList;
    }
    
    public List llllIIIIlIIIlIlllIll(final Class clazz, final Predicate predicate) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : this.IlIlIlIlIlllllllllIl) {
            if (clazz.isAssignableFrom(llIllIIIIIllIlIIIIlI.getClass()) && predicate.apply((Object)llIllIIIIIllIlIIIIlI)) {
                arrayList.add(llIllIIIIIllIlIIIIlI);
            }
        }
        return arrayList;
    }
    
    public List IlIlIlIlIlllllllllIl(final Class clazz, final Predicate predicate) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : this.IllIIlllIIIIlllIIlIl) {
            if (clazz.isAssignableFrom(llIllIIIIIllIlIIIIlI.getClass()) && predicate.apply((Object)llIllIIIIIllIlIIIIlI)) {
                arrayList.add(llIllIIIIIllIlIIIIlI);
            }
        }
        return arrayList;
    }
    
    public List llllIIIIlIIIlIlllIll(final Class clazz, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll(clazz, llllIIIIlIIIlIlllIll, net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl);
    }
    
    public List llllIIIIlIIIlIlllIll(final Class clazz, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final Predicate predicate) {
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll - 2.0) / 16.0);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl + 2.0) / 16.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI - 2.0) / 16.0);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl + 2.0) / 16.0);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = llIllIIIIIllIlIIIIlI; i <= llIllIIIIIllIlIIIIlI2; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI3; j <= llIllIIIIIllIlIIIIlI4; ++j) {
                if (this.IlIlIlIlIlllllllllIl(i, j, true)) {
                    this.llllIIIIlIIIlIlllIll(i, j).llllIIIIlIIIlIlllIll(clazz, llllIIIIlIIIlIlllIll, arrayList, predicate);
                }
            }
        }
        return arrayList;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final Class clazz, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final List llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(clazz, llllIIIIlIIIlIlllIll);
        net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = null;
        double n = Double.MAX_VALUE;
        for (int i = 0; i < llllIIIIlIIIlIlllIll2.size(); ++i) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll2.get(i);
            if (llIllIIIIIllIlIIIIlI3 != llIllIIIIIllIlIIIIlI && net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl.apply((Object)llIllIIIIIllIlIIIIlI3)) {
                final double ilIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI3);
                if (ilIlIIIllIllIIIIIllI <= n) {
                    llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI3;
                    n = ilIlIIIllIllIIIIIllI;
                }
            }
        }
        return llIllIIIIIllIlIIIIlI2;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final int n) {
        return (net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI)this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n);
    }
    
    public List IIIlIIIlIlIIlllIIlll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl)) {
            this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).llllIIIlIlllIlIIIIIl();
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final Class clazz) {
        int n = 0;
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : this.IlIlIlIlIlllllllllIl) {
            if ((!(llIllIIIIIllIlIIIIlI instanceof IlIllIlIlIIIlIlIlIII) || !((IlIllIlIlIIIlIlIlIII)llIllIIIIIllIlIIIIlI).r()) && clazz.isAssignableFrom(((IlIllIlIlIIIlIlIlIII)llIllIIIIIllIlIIIIlI).getClass())) {
                ++n;
            }
        }
        return n;
    }
    
    public void IlIlIlIlIlllllllllIl(final Collection collection) {
        this.IlIlIlIlIlllllllllIl.addAll(collection);
        final Iterator<net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI> iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.llIllIIIIIllIlIIIIlI(iterator.next());
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final Collection collection) {
        this.llIllIIIIIllIlIIIIlI.addAll(collection);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = b ? null : llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
        return (llllIIIIlIIIlIlllIll2 == null || this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llIllIIIIIllIlIIIIlI)) && ((llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll && llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj) || (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl().lIIIlllIIIllIIIllIII() && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)));
    }
    
    public int IlIlIIIlIIlIlIIlllIl() {
        return this.llIIlllIIlllIIllIllI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int llIIlllIIlllIIllIllI) {
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        return ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(this, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, lllIllIIIllllllIllll);
    }
    
    @Override
    public llIllIlIlIIIIIIIllII p_() {
        return this.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI();
    }
    
    public int IIlIIIIlllIlllllIlII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int max = Math.max(0, this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll));
        if (max >= 15) {
            return max;
        }
        final int max2 = Math.max(max, this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl));
        if (max2 >= 15) {
            return max2;
        }
        final int max3 = Math.max(max2, this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI));
        if (max3 >= 15) {
            return max3;
        }
        final int max4 = Math.max(max3, this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl));
        if (max4 >= 15) {
            return max4;
        }
        final int max5 = Math.max(max4, this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI));
        if (max5 >= 15) {
            return max5;
        }
        final int max6 = Math.max(max5, this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl));
        return (max6 >= 15) ? max6 : max6;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll) > 0;
    }
    
    public int llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() ? this.IIlIIIIlllIlllllIlII(ilIlIlIlIlllllllllIl) : llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, lllIllIIIllllllIllll);
    }
    
    public boolean IIIlIIlIIIIlllIlllII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) > 0 || this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) > 0 || this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) > 0 || this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) > 0 || this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) > 0 || this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) > 0;
    }
    
    public int IlIlIllllllllIIIIlII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        int n = 0;
        lllIllIIIllllllIllll[] values;
        for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
            final int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), lllIllIIIllllllIllll);
            if (llIllIIIIIllIlIIIIlI >= 15) {
                return 15;
            }
            if (llIllIIIIIllIlIIIIlI > n) {
                n = llIllIIIIIllIlIIIIlI;
            }
        }
        return n;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n) {
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, n);
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4) {
        double n5 = -1.0;
        net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = null;
        for (int i = 0; i < this.IllIIlllIIIIlllIIlIl.size(); ++i) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.IllIIlllIIIIlllIIlIl.get(i);
            if (net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl.apply((Object)llllIIIIlIIIlIlllIll2)) {
                final double ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI(n, n2, n3);
                if ((n4 < 0.0 || ilIlIIIllIllIIIIIllI < n4 * n4) && (n5 == -1.0 || ilIlIIIllIllIIIIIllI < n5)) {
                    n5 = ilIlIIIllIllIIIIIllI;
                    llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
                }
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3, final double n4) {
        for (int i = 0; i < this.IllIIlllIIIIlllIIlIl.size(); ++i) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.get(i);
            if (net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl.apply((Object)llllIIIIlIIIlIlllIll)) {
                final double ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(n, n2, n3);
                if (n4 < 0.0 || ilIlIIIllIllIIIIIllI < n4 * n4) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final String s) {
        for (int i = 0; i < this.IllIIlllIIIIlllIIlIl.size(); ++i) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.get(i);
            if (s.equals(llllIIIIlIIIlIlllIll.s_())) {
                return llllIIIIlIIIlIlllIll;
            }
        }
        return null;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final UUID uuid) {
        for (int i = 0; i < this.IllIIlllIIIIlllIIlIl.size(); ++i) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.get(i);
            if (uuid.equals(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl())) {
                return llllIIIIlIIIlIlllIll;
            }
        }
        return null;
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
    }
    
    public void IlllllllIIIlIIIlIlII() {
        this.IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void IlIlIlIlIlllllllllIl(final long n) {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(n);
    }
    
    public long IIlIIIIlllIlllllIlII() {
        return this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    public long IIIlIIlIIIIlllIlllII() {
        return this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl();
    }
    
    public long IlIlIllllllllIIIIlII() {
        return this.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final long n) {
        this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(n);
    }
    
    public IlIlIlIlIlllllllllIl IIlllIlIIllIlIlIlIIl() {
        IlIlIlIlIlllllllllIl iiiIlllIIIIIIlIIIlll = new IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(), this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl(), this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI());
        if (!this.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll)) {
            iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll(new IlIlIlIlIlllllllllIl(this.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(), 0.0, this.IllIllIlllIllllIIllI().IlIlIlIlIlllllllllIl()));
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    public void IIlllIlIIllIlIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    public void lIIIIlIIIIIlllIllIII(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl / 16.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII / 16.0);
        for (int n = 2, i = llIllIIIIIllIlIIIIlI2 - n; i <= llIllIIIIIllIlIIIIlI2 + n; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI3 - n; j <= llIllIIIIIllIlIIIIlI3 + n; ++j) {
                this.llllIIIIlIIIlIlllIll(i, j);
            }
        }
        if (!this.IlIlIlIlIlllllllllIl.contains(llIllIIIIIllIlIIIIlI)) {
            this.IlIlIlIlIlllllllllIl.add(llIllIIIIIllIlIIIIlI);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final byte b) {
    }
    
    public lIIIIlIIIIIlllIllIII llIIIlIlIllIIlIlIlII() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    public void llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl), n, n2);
    }
    
    public IlIIIlIlIIIllIlIlIIl lllllIlIIIlIlIIlllII() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public llllIIllllIlIlIIIIll lIllllllIIllIlIlIlII() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.lIIIlllIIIllIIIllIII llIIlllIIlllIIllIllI() {
        return this.IIllIIllIIIlIlIIIIlI.IlllllllIIIlIIIlIlII();
    }
    
    public void IIlllIIIlIlllIIlllII() {
    }
    
    public float lIIIIlIIIIIlllIllIII(final float n) {
        return (this.IlIlIIIllIIllIlllllI + (this.IIIIlllIIIIIIlIIIlll - this.IlIlIIIllIIllIlllllI) * n) * this.llIIlIIIlIIIllIlIIIl(n);
    }
    
    public void lIIIlllIIIllIIIllIII(final float n) {
        this.IlIlIIIllIIllIlllllI = n;
        this.IIIIlllIIIIIIlIIIlll = n;
    }
    
    public float llIIlIIIlIIIllIlIIIl(final float n) {
        return this.llIllIlIIIIllIlIIllI + (this.lIlIlIIIllIIllIIIllI - this.llIllIlIIIIllIlIIllI) * n;
    }
    
    public void llIllIlIIIIllIlIIllI(final float n) {
        this.llIllIlIIIIllIlIIllI = n;
        this.lIlIlIIIllIIllIIIllI = n;
    }
    
    public boolean IIlIIIIIllIlIIIlIIll() {
        return this.lIIIIlIIIIIlllIllIII(1.0f) > 0.9;
    }
    
    public boolean llllllIllIllIlIllllI() {
        return this.llIIlIIIlIIIllIlIIIl(1.0f) > 0.2;
    }
    
    public boolean llIIIlIlIllIIlIlIlII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!this.llllllIllIllIlIllllI()) {
            return false;
        }
        if (!this.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl)) {
            return false;
        }
        if (this.IIlllIIlIllIllIlIIll(ilIlIlIlIlllllllllIl).lIIIlllIIIllIIIllIII() > ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) {
            return false;
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        return !llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl() && !this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl, false) && llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI();
    }
    
    public boolean lllllIlIIIlIlIIlllII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).IllIIlllIIIIlllIIlIl();
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII IIIllllllIllIIIlllIl() {
        return this.IlIlIIIlIIlIlIIlllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final net.minecraft.IIIlIIlIIIIlllIlllII.llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(s, llllllIllIllIlIllllI);
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllllIllIllIlIllllI llllIIIIlIIIlIlllIll(final Class clazz, final String s) {
        return this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(clazz, s);
    }
    
    public int IlIlIlIlIlllllllllIl(final String s) {
        return this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(s);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n2) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(n, ilIlIlIlIlllllllllIl, n2);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n2) {
        this.llllIIIIlIIIlIlllIll(null, n, ilIlIlIlIlllllllllIl, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n2) {
        try {
            for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
                ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, ilIlIlIlIlllllllllIl, n2);
            }
        }
        catch (Throwable t) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Playing level event");
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Level event being played");
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Block coordinates", net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Event source", llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Event type", n);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Event data", n2);
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
        }
    }
    
    public int IlIIIlIIIllllIlIlIlI() {
        return 256;
    }
    
    public int IIIIIllIIIIlIIIIllIl() {
        return this.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() ? 128 : 256;
    }
    
    public Random IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        this.llllIIllllIlIlIIIIll.setSeed(n * 341873128712L + n2 * 132897987541L + this.lIllllllIIllIlIlIlII().IlIlIlIlIlllllllllIl() + n3);
        return this.llllIIllllIlIlIIIIll;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final String s, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIIIlIlIllIIlIlIlII().llllIIIIlIIIlIlllIll(this, s, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean q_() {
        return false;
    }
    
    public double IIIIIIIIIlllIllIlIlI() {
        return 0.0;
    }
    
    public lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Affected level", 1);
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Level name", (this.IIllIIllIIIlIlIIIIlI == null) ? "????" : this.IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl());
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("All players", new IlIlIllllllllIIIIlII(this));
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Chunk stats", new IIlllIlIIllIlIlIlIIl(this));
        try {
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        }
        catch (Throwable t) {
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Level Data Unobtainable", t);
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int n, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n2) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll)this.IIlllIIlIllIllIlIIll.get(i)).IlIlIlIlIlllllllllIl(n, ilIlIlIlIlllllllllIl, n2);
        }
    }
    
    public Calendar IIllllIIIlIIIIIIllIl() {
        if (this.IIIlIIlIIIIlllIlllII() % 600L == 0L) {
            this.IIIIIllIIIIlIIIIllIl.setTimeInMillis(net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI());
        }
        return this.IIIIIllIIIIlIIIIllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    public llIIlIIIlIIIllIlIIIl IlllIIIIlIIIlIlIlIIl() {
        return this.IIIlIIlIIIIlllIlllII;
    }
    
    public void IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            if (this.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll2)) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
                if (net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.an.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI())) {
                    ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(this, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll);
                }
                else {
                    if (!ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                        continue;
                    }
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                    final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3);
                    if (!net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.an.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI())) {
                        continue;
                    }
                    ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(this, llllIIIIlIIIlIlllIll3, ilIlIlIlIlllllllllIl3, llllIIIIlIIIlIlllIll);
                }
            }
        }
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI lIllllllIIllIlIlIlII(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        long illlllllIIIlIIIlIlII = 0L;
        float iiiIlllIIIIIIlIIIlll = 0.0f;
        if (this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl)) {
            iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll();
            illlllllIIIlIIIlIlII = this.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl).IlllllllIIIlIIIlIlII();
        }
        return new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI(this.lllIllIIIllllllIllll(), this.IlIlIllllllllIIIIlII(), illlllllIIIlIIIlIlII, iiiIlllIIIIIIlIIIlll);
    }
    
    public IllIIlllIIIIlllIIlIl lllIllIIIllllllIllll() {
        return this.lIllllllIIllIlIlIlII().IIlIIIIlllIlllllIlII();
    }
    
    public int llIllIlIlIIIIIIIllII() {
        return this.IIIllllllIllIIIlllIl;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final int iiIllllllIllIIIlllIl) {
        this.IIIllllllIllIIIlllIl = iiIllllllIllIIIlllIl;
    }
    
    public int IIlIlIlIIlIllIIIIIIl() {
        return this.IlIIIlIIIllllIlIlIlI;
    }
    
    public void IlIlIIIllIllIIIIIllI(final int ilIIIlIIIllllIlIlIlI) {
        this.IlIIIlIIIllllIlIlIlI = ilIIIlIIIllllIlIlIlI;
    }
    
    public boolean IllIllIIIIlIIlIlllII() {
        return this.IIIlIIIlIlIIlllIIlll;
    }
    
    public IlIlIIIllIllIIIIIllI IlIllllIIlIIlIlIlIll() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    public llIllIIIIIllIlIIIIlI IllIllIlllIllllIIllI() {
        return this.IlllIIIIlIIIlIlIlIIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        final IlIlIlIlIlllllllllIl iIlllIlIIllIlIlIlIIl = this.IIlllIlIIllIlIlIlIIl();
        final int n3 = n * 16 + 8 - iIlllIlIIllIlIlIlIIl.lIIIIlIIIIIlllIllIII();
        final int n4 = n2 * 16 + 8 - iIlllIlIIllIlIlIlIIl.llIIlIIIlIIIllIlIIIl();
        final int n5 = 128;
        return n3 >= -n5 && n3 <= n5 && n4 >= -n5 && n4 <= n5;
    }
}
