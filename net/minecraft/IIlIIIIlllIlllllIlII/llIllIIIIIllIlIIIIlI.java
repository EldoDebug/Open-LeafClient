package net.minecraft.IIlIIIIlllIlllllIlII;

import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.mojang.authlib.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llIllIIIIIllIlIIIIlI
{
    private IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    private IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private TreeMap llIIlIIIlIIIllIlIIIl;
    private List llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    
    public llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.llIIlIIIlIIIllIlIIIl = new TreeMap();
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
    }
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.llIIlIIIlIIIllIlIIIl = new TreeMap();
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIlIIIllIIllIlllllI();
        this.lIlIlIIIllIIllIIIllI();
        if (llllIIIlIlllIlIIIIIl % 20 == 0) {
            this.llIllIlIIIIllIlIIllI();
        }
        if (llllIIIlIlllIlIIIIIl % 30 == 0) {
            this.llIIlIIIlIIIllIlIIIl();
        }
        if (this.lIlIlIIIllIIllIIIllI < this.lIIIIlIIIIIlllIllIII / 10 && this.IlIlIlIlIlllllllllIl.size() > 20 && this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextInt(7000) == 0) {
            final e llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, 2, 4, 2);
            if (llllIIIIlIIIlIlllIll != null) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII(this.llllIIIIlIIIlIlllIll);
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII);
                ++this.lIlIlIIIllIIllIIIllI;
            }
        }
    }
    
    private e llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final int n3) {
        for (int i = 0; i < 10; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextInt(16) - 8, this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextInt(6) - 3, this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextInt(16) - 8);
            if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n, n2, n3), llllIIIIlIIIlIlllIll)) {
                return new e(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
            }
        }
        return null;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        if (!IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl())) {
            return false;
        }
        final int n = ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() / 2;
        final int n2 = ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() / 2;
        for (int i = n; i < n + ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(); ++i) {
            for (int j = ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII(); j < ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() + ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); ++j) {
                for (int k = n2; k < n2 + ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(); ++k) {
                    if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(i, j, k)).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private void llIIlIIIlIIIllIlIIIl() {
        this.lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class, new llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII() - this.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() - 4, this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl() - this.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII() + this.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() + 4, this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl() + this.IlIlIIIllIllIIIIIllI)).size();
    }
    
    private void llIllIlIIIIllIlIIllI() {
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.class, new llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII() - this.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() - 4, this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl() - this.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII() + this.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() + 4, this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl() + this.IlIlIIIllIllIIIIIllI)).size();
        if (this.lIIIIlIIIIIlllIllIII == 0) {
            this.llIIlIIIlIIIllIlIIIl.clear();
        }
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl.size();
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl) < this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI;
    }
    
    public List IllIIlllIIIIlllIIlIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = null;
        int n = Integer.MAX_VALUE;
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl2 : this.IlIlIlIlIlllllllllIl) {
            final int llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll < n) {
                illIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
                n = llllIIIIlIIIlIlllIll;
            }
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    public IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = null;
        int n = Integer.MAX_VALUE;
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl2 : this.IlIlIlIlIlllllllllIl) {
            final int llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            int llIllIIIIIllIlIIIIlI;
            if (llllIIIIlIIIlIlllIll > 256) {
                llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll * 1000;
            }
            else {
                llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl2.llIllIIIIIllIlIIIIlI();
            }
            if (llIllIIIIIllIlIIIIlI < n) {
                illIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
                n = llIllIIIIIllIlIIIIlI;
            }
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    public IllIIlllIIIIlllIIlIl IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl) > this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI) {
            return null;
        }
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl : this.IlIlIlIlIlllllllllIl) {
            if (illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().lIIIIlIIIIIlllIllIII() == ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() && illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().llIIlIIIlIIIllIlIIIl() == ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() && Math.abs(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().lIIIlllIIIllIIIllIII() - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) <= 1) {
                return illIIlllIIIIlllIIlIl;
            }
        }
        return null;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.IlIlIlIlIlllllllllIl.add(illIIlllIIIIlllIIlIl);
        this.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl());
        this.IIIIlllIIIIIIlIIIlll();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII();
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.IlIlIlIlIlllllllllIl.isEmpty();
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.llIllIlIIIIllIlIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll == lllIIIIlllllIlIIllIl) {
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl;
                return;
            }
        }
        this.llIllIlIIIIllIlIIllI.add(new IlIIIlIlIIIllIlIlIIl(this, lllIIIIlllllIlIIllIl, this.llllIIIlIlllIlIIIIIl));
    }
    
    public lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        double n = Double.MAX_VALUE;
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = null;
        for (int i = 0; i < this.llIllIlIIIIllIlIIllI.size(); ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = this.llIllIlIIIIllIlIIllI.get(i);
            final double ilIlIIIllIllIIIIIllI = ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(lllIIIIlllllIlIIllIl);
            if (ilIlIIIllIllIIIIIllI <= n) {
                ilIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
                n = ilIlIIIllIllIIIIIllI;
            }
        }
        return (ilIIIlIlIIIllIlIlIIl != null) ? ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll : null;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        double n = Double.MAX_VALUE;
        net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = null;
        for (final String s : this.llIIlIIIlIIIllIlIIIl.keySet()) {
            if (this.IlIlIlIlIlllllllllIl(s)) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
                if (llllIIIIlIIIlIlllIll2 == null) {
                    continue;
                }
                final double ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI(lllIIIIlllllIlIIllIl);
                if (ilIlIIIllIllIIIIIllI > n) {
                    continue;
                }
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
                n = ilIlIIIllIllIIIIIllI;
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private void lIlIlIIIllIIllIIIllI() {
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = (Iterator<IlIIIlIlIIIllIlIlIIl>)this.llIllIlIIIIllIlIIllI.iterator();
        while (iterator.hasNext()) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = iterator.next();
            if (!ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII() || Math.abs(this.llllIIIlIlllIlIIIIIl - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) > 300) {
                iterator.remove();
            }
        }
    }
    
    private void IlIlIIIllIIllIlllllI() {
        boolean b = false;
        final boolean b2 = this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextInt(50) == 0;
        final Iterator<IllIIlllIIIIlllIIlIl> iterator = (Iterator<IllIIlllIIIIlllIIlIl>)this.IlIlIlIlIlllllllllIl.iterator();
        while (iterator.hasNext()) {
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = iterator.next();
            if (b2) {
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll();
            }
            if (!this.IlIlIIIllIllIIIIIllI(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl()) || Math.abs(this.llllIIIlIlllIlIIIIIl - illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII()) > 1200) {
                this.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl());
                b = true;
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(true);
                iterator.remove();
            }
        }
        if (b) {
            this.IIIIlllIIIIIIlIIIlll();
        }
    }
    
    private boolean IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI instanceof llIlIIIIIlIIlIlIIlll && llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
    }
    
    private void IIIIlllIIIIIIlIIIlll() {
        final int size = this.IlIlIlIlIlllllllllIl.size();
        if (size == 0) {
            this.IlIIIlIlIIIllIlIlIIl = new IlIlIlIlIlllllllllIl(0, 0, 0);
            this.IlIlIIIllIllIIIIIllI = 0;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() / size, this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII() / size, this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl() / size);
            int max = 0;
            final Iterator<IllIIlllIIIIlllIIlIl> iterator = this.IlIlIlIlIlllllllllIl.iterator();
            while (iterator.hasNext()) {
                max = Math.max(iterator.next().llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl), max);
            }
            this.IlIlIIIllIllIIIIIllI = Math.max(32, (int)Math.sqrt(max) + 1);
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final String s) {
        final Integer n = this.llIIlIIIlIIIllIlIIIl.get(s);
        return (n != null) ? n : 0;
    }
    
    public int llllIIIIlIIIlIlllIll(final String s, final int n) {
        final int llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(s) + n, -30, 10);
        this.llIIlIIIlIIIllIlIIIl.put(s, llllIIIIlIIIlIlllIll);
        return llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        return this.llllIIIIlIIIlIlllIll(s) <= -15;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("PopSize");
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Radius");
        this.lIlIlIIIllIIllIIIllI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Golems");
        this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Stable");
        this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Tick");
        this.lIIIlllIIIllIIIllIII = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("MTick");
        this.IlIIIlIlIIIllIlIlIIl = new IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("CX"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("CY"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("CZ"));
        this.llIllIIIIIllIlIIIIlI = new IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ACX"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ACY"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ACZ"));
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Doors", 10);
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
            this.IlIlIlIlIlllllllllIl.add(new IllIIlllIIIIlllIIlIl(new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("X"), ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("Y"), ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("Z")), ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("IDX"), ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("IDZ"), ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("TS")));
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI2 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Players", 10);
        for (int j = 0; j < llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI(); ++j) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl2 = llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(j);
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI("UUID")) {
                final GameProfile llllIIIIlIIIlIlllIll = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().lIIIIIlIlIIIlIIIIlIl().llllIIIIlIIIlIlllIll(UUID.fromString(ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl("UUID")));
                if (llllIIIIlIIIlIlllIll != null) {
                    this.llIIlIIIlIIIllIlIIIl.put(llllIIIIlIIIlIlllIll.getName(), ilIlIlIlIlllllllllIl2.IllIIlllIIIIlllIIlIl("S"));
                }
            }
            else {
                this.llIIlIIIlIIIllIlIIIl.put(ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl("Name"), ilIlIlIlIlllllllllIl2.IllIIlllIIIIlllIIlIl("S"));
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("PopSize", this.lIIIIlIIIIIlllIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Radius", this.IlIlIIIllIllIIIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Golems", this.lIlIlIIIllIIllIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Stable", this.IllIIlllIIIIlllIIlIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Tick", this.llllIIIlIlllIlIIIIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("MTick", this.lIIIlllIIIllIIIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CX", this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CY", this.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CZ", this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ACX", this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ACY", this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ACZ", this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl());
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl : this.IlIlIlIlIlllllllllIl) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("X", illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().lIIIIlIIIIIlllIllIII());
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Y", illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().lIIIlllIIIllIIIllIII());
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Z", illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().llIIlIIIlIIIllIlIIIl());
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("IDX", illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl());
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("IDZ", illIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl());
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("TS", illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII());
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Doors", ilIlIIIlIIlIlIIlllIl);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 = new IlIlIIIlIIlIlIIlllIl();
        for (final String s : this.llIIlIIIlIIIllIlIIIl.keySet()) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll3 = new IIIIlllIIIIIIlIIIlll();
            final GameProfile llllIIIIlIIIlIlllIll = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().lIIIIIlIlIIIlIIIIlIl().llllIIIIlIIIlIlllIll(s);
            if (llllIIIIlIIIlIlllIll != null) {
                iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("UUID", llllIIIIlIIIlIlllIll.getId().toString());
                iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("S", this.llIIlIIIlIIIllIlIIIl.get(s));
                ilIlIIIlIIlIlIIlllIl2.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll3);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Players", ilIlIIIlIIlIlIIlllIl2);
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        this.lIIIlllIIIllIIIllIII = this.llllIIIlIlllIlIIIIIl;
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return this.lIIIlllIIIllIIIllIII == 0 || this.llllIIIlIlllIlIIIIIl - this.lIIIlllIIIllIIIllIII >= 3600;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        final Iterator<String> iterator = this.llIIlIIIlIIIllIlIIIl.keySet().iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(iterator.next(), n);
        }
    }
}
