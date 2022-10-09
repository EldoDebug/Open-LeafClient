package net.minecraft.llIIlIIIlIIIllIlIIIl;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class IlIlIlIlIlllllllllIl
{
    public List IlIlIlIlIlllllllllIl;
    public List llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    private short llllIIIIlIIIlIlllIll;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private final Set lIIIIlIIIIIlllIllIII;
    protected List IlIlIIIllIllIIIIIllI;
    private Set lIIIlllIIIllIIIllIII;
    
    public IlIlIlIlIlllllllllIl() {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = -1;
        this.lIIIIlIIIIIlllIllIII = Sets.newHashSet();
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.lIIIlllIIIllIIIllIII = Sets.newHashSet();
    }
    
    protected IIIIIllIIIIlIIIIllIl IlIlIlIlIlllllllllIl(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI.size();
        this.llIllIIIIIllIlIIIIlI.add(iiiiIllIIIIlIIIIllIl);
        this.IlIlIlIlIlllllllllIl.add(null);
        return iiiiIllIIIIlIIIIllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        if (this.IlIlIIIllIllIIIIIllI.contains(ilIlIllllllllIIIIlII)) {
            throw new IllegalArgumentException("Listener already listening");
        }
        this.IlIlIIIllIllIIIIIllI.add(ilIlIllllllllIIIIlII);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, this.IlIlIlIlIlllllllllIl());
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        this.IlIlIIIllIllIIIIIllI.remove(ilIlIllllllllIIIIlII);
    }
    
    public List IlIlIlIlIlllllllllIl() {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.size(); ++i) {
            arrayList.add(((IIIIIllIIIIlIIIIllIl)this.llIllIIIIIllIlIIIIlI.get(i)).llllIIIIlIIIlIlllIll());
        }
        return arrayList;
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.size(); ++i) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.get(i).llllIIIIlIIIlIlllIll();
            if (!lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.get(i), llllIIIIlIIIlIlllIll)) {
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = (llllIIIIlIIIlIlllIll == null) ? null : llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
                this.IlIlIlIlIlllllllllIl.set(i, lllIIIIlIlIllIIlIIIl);
                for (int j = 0; j < this.IlIlIIIllIllIIIIIllI.size(); ++j) {
                    ((IlIlIllllllllIIIIlII)this.IlIlIIIllIllIIIIIllI.get(j)).llllIIIIlIIIlIlllIll(this, i, lllIIIIlIlIllIIlIIIl);
                }
            }
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        return false;
    }
    
    public IIIIIllIIIIlIIIIllIl llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n) {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.size(); ++i) {
            final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(i);
            if (iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, n)) {
                return iiiiIllIIIIlIIIIllIl;
            }
        }
        return null;
    }
    
    public IIIIIllIIIIlIIIIllIl llllIIIIlIIIlIlllIll(final int n) {
        return this.llIllIIIIIllIlIIIIlI.get(n);
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(n);
        return (iiiiIllIIIIlIIIIllIl != null) ? iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll() : null;
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
        final IllIIlllIIIIlllIIlIl lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI;
        if (n3 == 5) {
            final int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
            this.llllIIIlIlllIlIIIIIl = llIllIIIIIllIlIIIIlI(n2);
            if ((llllIIIlIlllIlIIIIIl != 1 || this.llllIIIlIlllIlIIIIIl != 2) && llllIIIlIlllIlIIIIIl != this.llllIIIlIlllIlIIIIIl) {
                this.IlIIIlIlIIIllIlIlIIl();
            }
            else if (lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI() == null) {
                this.IlIIIlIlIIIllIlIlIIl();
            }
            else if (this.llllIIIlIlllIlIIIIIl == 0) {
                this.IllIIlllIIIIlllIIlIl = IlIlIlIlIlllllllllIl(n2);
                if (llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll)) {
                    this.llllIIIlIlllIlIIIIIl = 1;
                    this.lIIIIlIIIIIlllIllIII.clear();
                }
                else {
                    this.IlIIIlIlIIIllIlIlIIl();
                }
            }
            else if (this.llllIIIlIlllIlIIIIIl == 1) {
                final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(n);
                if (iiiiIllIIIIlIIIIllIl != null && llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl, lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(), true) && iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI()) && lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI().IlIlIlIlIlllllllllIl > this.lIIIIlIIIIIlllIllIII.size() && this.llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl)) {
                    this.lIIIIlIIIIIlllIllIII.add(iiiiIllIIIIlIIIIllIl);
                }
            }
            else if (this.llllIIIlIlllIlIIIIIl == 2) {
                if (!this.lIIIIlIIIIIlllIllIII.isEmpty()) {
                    lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI().llIIlIIIlIIIllIlIIIl();
                    int ilIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI().IlIlIlIlIlllllllllIl;
                    for (final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl2 : this.lIIIIlIIIIIlllIllIII) {
                        if (iiiiIllIIIIlIIIIllIl2 != null && llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl2, lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(), true) && iiiiIllIIIIlIIIIllIl2.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI()) && lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI().IlIlIlIlIlllllllllIl >= this.lIIIIlIIIIIlllIllIII.size() && this.llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl2)) {
                            final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl2 = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl();
                            final int n4 = iiiiIllIIIIlIIIIllIl2.IlIlIlIlIlllllllllIl() ? iiiiIllIIIIlIIIIllIl2.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl : 0;
                            llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl, llIIlIIIlIIIllIlIIIl2, n4);
                            if (llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl > llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl()) {
                                llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl();
                            }
                            if (llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl > iiiiIllIIIIlIIIIllIl2.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl2)) {
                                llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl = iiiiIllIIIIlIIIIllIl2.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl2);
                            }
                            ilIlIlIlIlllllllllIl -= llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl - n4;
                            iiiiIllIIIIlIIIIllIl2.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl2);
                        }
                    }
                    llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                    if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                        llIIlIIIlIIIllIlIIIl = null;
                    }
                    lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl);
                }
                this.IlIIIlIlIIIllIlIlIIl();
            }
            else {
                this.IlIIIlIlIIIllIlIlIIl();
            }
        }
        else if (this.llllIIIlIlllIlIIIIIl != 0) {
            this.IlIIIlIlIIIllIlIlIIl();
        }
        else if ((n3 == 0 || n3 == 1) && (n2 == 0 || n2 == 1)) {
            if (n == -999) {
                if (lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI() != null) {
                    if (n2 == 0) {
                        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(), true);
                        lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
                    }
                    if (n2 == 1) {
                        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI().llllIIIIlIIIlIlllIll(1), true);
                        if (lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI().IlIlIlIlIlllllllllIl == 0) {
                            lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
                        }
                    }
                }
            }
            else if (n3 == 1) {
                if (n < 0) {
                    return null;
                }
                final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl3 = this.llIllIIIIIllIlIIIIlI.get(n);
                if (iiiiIllIIIIlIIIIllIl3 != null && iiiiIllIIIIlIIIIllIl3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
                    final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n);
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
                        lllIIIIlIlIllIIlIIIl = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl();
                        if (iiiiIllIIIIlIIIIllIl3.llllIIIIlIIIlIlllIll() != null && iiiiIllIIIIlIIIIllIl3.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll() == llllIIIIlIIIlIlllIll3) {
                            this.llllIIIIlIIIlIlllIll(n, n2, true, llllIIIIlIIIlIlllIll);
                        }
                    }
                }
            }
            else {
                if (n < 0) {
                    return null;
                }
                final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl4 = this.llIllIIIIIllIlIIIIlI.get(n);
                if (iiiiIllIIIIlIIIIllIl4 != null) {
                    final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll4 = iiiiIllIIIIlIIIIllIl4.llllIIIIlIIIlIlllIll();
                    final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI2 = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI();
                    if (llllIIIIlIIIlIlllIll4 != null) {
                        lllIIIIlIlIllIIlIIIl = llllIIIIlIIIlIlllIll4.llIIlIIIlIIIllIlIIIl();
                    }
                    if (llllIIIIlIIIlIlllIll4 == null) {
                        if (lIlIlIIIllIIllIIIllI2 != null && iiiiIllIIIIlIIIIllIl4.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI2)) {
                            int llIllIIIIIllIlIIIIlI = (n2 == 0) ? lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl : 1;
                            if (llIllIIIIIllIlIIIIlI > iiiiIllIIIIlIIIIllIl4.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI2)) {
                                llIllIIIIIllIlIIIIlI = iiiiIllIIIIlIIIIllIl4.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI2);
                            }
                            if (lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl >= llIllIIIIIllIlIIIIlI) {
                                iiiiIllIIIIlIIIIllIl4.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI));
                            }
                            if (lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl == 0) {
                                lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
                            }
                        }
                    }
                    else if (iiiiIllIIIIlIIIIllIl4.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
                        if (lIlIlIIIllIIllIIIllI2 == null) {
                            lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(iiiiIllIIIIlIIIIllIl4.llllIIIIlIIIlIlllIll((n2 == 0) ? llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl : ((llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl + 1) / 2)));
                            if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl == 0) {
                                iiiiIllIIIIlIIIIllIl4.IlIlIlIlIlllllllllIl(null);
                            }
                            iiiiIllIIIIlIIIIllIl4.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI());
                        }
                        else if (iiiiIllIIIIlIIIIllIl4.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI2)) {
                            if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll() == lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll() && llllIIIIlIIIlIlllIll4.lIIIIlIIIIIlllIllIII() == lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII() && net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, lIlIlIIIllIIllIIIllI2)) {
                                int n5 = (n2 == 0) ? lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl : 1;
                                if (n5 > iiiiIllIIIIlIIIIllIl4.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI2) - llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl) {
                                    n5 = iiiiIllIIIIlIIIIllIl4.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI2) - llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl;
                                }
                                if (n5 > lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl() - llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl) {
                                    n5 = lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl() - llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl;
                                }
                                lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll(n5);
                                if (lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl == 0) {
                                    lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
                                }
                                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = llllIIIIlIIIlIlllIll4;
                                lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl += n5;
                            }
                            else if (lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl <= iiiiIllIIIIlIIIIllIl4.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI2)) {
                                iiiiIllIIIIlIIIIllIl4.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI2);
                                lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4);
                            }
                        }
                        else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll() == lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll() && lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl() > 1 && (!llllIIIIlIIIlIlllIll4.IlIlIIIllIllIIIIIllI() || llllIIIIlIIIlIlllIll4.lIIIIlIIIIIlllIllIII() == lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII()) && net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, lIlIlIIIllIIllIIIllI2)) {
                            final int ilIlIlIlIlllllllllIl2 = llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl;
                            if (ilIlIlIlIlllllllllIl2 > 0 && ilIlIlIlIlllllllllIl2 + lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl <= lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl()) {
                                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl3 = lIlIlIIIllIIllIIIllI2;
                                lllIIIIlIlIllIIlIIIl3.IlIlIlIlIlllllllllIl += ilIlIlIlIlllllllllIl2;
                                if (iiiiIllIIIIlIIIIllIl4.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2).IlIlIlIlIlllllllllIl == 0) {
                                    iiiiIllIIIIlIIIIllIl4.IlIlIlIlIlllllllllIl(null);
                                }
                                iiiiIllIIIIlIIIIllIl4.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI());
                            }
                        }
                    }
                    iiiiIllIIIIlIIIIllIl4.llIllIIIIIllIlIIIIlI();
                }
            }
        }
        else if (n3 == 2 && n2 >= 0 && n2 < 9) {
            final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl5 = this.llIllIIIIIllIlIIIIlI.get(n);
            if (iiiiIllIIIIlIIIIllIl5.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI3 = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(n2);
                boolean b = lIlIlIIIllIIllIIIllI3 == null || (iiiiIllIIIIlIIIIllIl5.IlIlIlIlIlllllllllIl == lIlIlIIIllIIllIIIllI && iiiiIllIIIIlIIIIllIl5.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI3));
                int llllIIIlIlllIlIIIIIl2 = -1;
                if (!b) {
                    llllIIIlIlllIlIIIIIl2 = lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl();
                    b |= (llllIIIlIlllIlIIIIIl2 > -1);
                }
                if (iiiiIllIIIIlIIIIllIl5.IlIlIlIlIlllllllllIl() && b) {
                    final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll5 = iiiiIllIIIIlIIIIllIl5.llllIIIIlIIIlIlllIll();
                    lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(n2, llllIIIIlIIIlIlllIll5.llIIlIIIlIIIllIlIIIl());
                    if ((iiiiIllIIIIlIIIIllIl5.IlIlIlIlIlllllllllIl != lIlIlIIIllIIllIIIllI || !iiiiIllIIIIlIIIIllIl5.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI3)) && lIlIlIIIllIIllIIIllI3 != null) {
                        if (llllIIIlIlllIlIIIIIl2 > -1) {
                            lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI3);
                            iiiiIllIIIIlIIIIllIl5.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5.IlIlIlIlIlllllllllIl);
                            iiiiIllIIIIlIIIIllIl5.IlIlIlIlIlllllllllIl(null);
                            iiiiIllIIIIlIIIIllIl5.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll5);
                        }
                    }
                    else {
                        iiiiIllIIIIlIIIIllIl5.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5.IlIlIlIlIlllllllllIl);
                        iiiiIllIIIIlIIIIllIl5.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI3);
                        iiiiIllIIIIlIIIIllIl5.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll5);
                    }
                }
                else if (!iiiiIllIIIIlIIIIllIl5.IlIlIlIlIlllllllllIl() && lIlIlIIIllIIllIIIllI3 != null && iiiiIllIIIIlIIIIllIl5.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI3)) {
                    lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(n2, null);
                    iiiiIllIIIIlIIIIllIl5.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI3);
                }
            }
        }
        else if (n3 == 3 && llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl && lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI() == null && n >= 0) {
            final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl6 = this.llIllIIIIIllIlIIIIlI.get(n);
            if (iiiiIllIIIIlIIIIllIl6 != null && iiiiIllIIIIlIIIIllIl6.IlIlIlIlIlllllllllIl()) {
                final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl3 = iiiiIllIIIIlIIIIllIl6.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl();
                llIIlIIIlIIIllIlIIIl3.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl3.IlIlIlIlIlllllllllIl();
                lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl3);
            }
        }
        else if (n3 == 4 && lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI() == null && n >= 0) {
            final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl7 = this.llIllIIIIIllIlIIIIlI.get(n);
            if (iiiiIllIIIIlIIIIllIl7 != null && iiiiIllIIIIlIIIIllIl7.IlIlIlIlIlllllllllIl() && iiiiIllIIIIlIIIIllIl7.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
                final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll6 = iiiiIllIIIIlIIIIllIl7.llllIIIIlIIIlIlllIll((n2 == 0) ? 1 : iiiiIllIIIIlIIIIllIl7.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl);
                iiiiIllIIIIlIIIIllIl7.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll6);
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll6, true);
            }
        }
        else if (n3 == 6 && n >= 0) {
            final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl8 = this.llIllIIIIIllIlIIIIlI.get(n);
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI4 = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI();
            if (lIlIlIIIllIIllIIIllI4 != null && (iiiiIllIIIIlIIIIllIl8 == null || !iiiiIllIIIIlIIIIllIl8.IlIlIlIlIlllllllllIl() || !iiiiIllIIIIlIIIIllIl8.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll))) {
                final int n6 = (n2 == 0) ? 0 : (this.llIllIIIIIllIlIIIIlI.size() - 1);
                final int n7 = (n2 == 0) ? 1 : -1;
                for (int i = 0; i < 2; ++i) {
                    for (int n8 = n6; n8 >= 0 && n8 < this.llIllIIIIIllIlIIIIlI.size() && lIlIlIIIllIIllIIIllI4.IlIlIlIlIlllllllllIl < lIlIlIIIllIIllIIIllI4.IlIlIlIlIlllllllllIl(); n8 += n7) {
                        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl9 = this.llIllIIIIIllIlIIIIlI.get(n8);
                        if (iiiiIllIIIIlIIIIllIl9.IlIlIlIlIlllllllllIl() && llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl9, lIlIlIIIllIIllIIIllI4, true) && iiiiIllIIIIlIIIIllIl9.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI4, iiiiIllIIIIlIIIIllIl9) && (i != 0 || iiiiIllIIIIlIIIIllIl9.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl != iiiiIllIIIIlIIIIllIl9.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl())) {
                            final int min = Math.min(lIlIlIIIllIIllIIIllI4.IlIlIlIlIlllllllllIl() - lIlIlIIIllIIllIIIllI4.IlIlIlIlIlllllllllIl, iiiiIllIIIIlIIIIllIl9.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl);
                            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll7 = iiiiIllIIIIlIIIIllIl9.llllIIIIlIIIlIlllIll(min);
                            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl4 = lIlIlIIIllIIllIIIllI4;
                            lllIIIIlIlIllIIlIIIl4.IlIlIlIlIlllllllllIl += min;
                            if (llllIIIIlIIIlIlllIll7.IlIlIlIlIlllllllllIl <= 0) {
                                iiiiIllIIIIlIIIIllIl9.IlIlIlIlIlllllllllIl(null);
                            }
                            iiiiIllIIIIlIIIIllIl9.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll7);
                        }
                    }
                }
            }
            this.llIllIIIIIllIlIIIIlI();
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        return true;
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean b, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll(n, n2, 1, llllIIIIlIIIlIlllIll);
    }
    
    public void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IllIIlllIIIIlllIIlIl lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI;
        if (lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI() != null) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(), false);
            lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll(n).IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl[] array) {
        for (int i = 0; i < array.length; ++i) {
            this.llllIIIIlIIIlIlllIll(i).IlIlIlIlIlllllllllIl(array[i]);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    public short llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        return (short)(++this.llllIIIIlIIIlIlllIll);
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return !this.lIIIlllIIIllIIIllIII.contains(llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b) {
        if (b) {
            this.lIIIlllIIIllIIIllIII.remove(llllIIIIlIIIlIlllIll);
        }
        else {
            this.lIIIlllIIIllIIIllIII.add(llllIIIIlIIIlIlllIll);
        }
    }
    
    public abstract boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll p0);
    
    protected boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2, final boolean b) {
        boolean b2 = false;
        int n3 = n;
        if (b) {
            n3 = n2 - 1;
        }
        if (lllIIIIlIlIllIIlIIIl.llIllIIIIIllIlIIIIlI()) {
            while (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > 0 && ((!b && n3 < n2) || (b && n3 >= n))) {
                final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(n3);
                final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll();
                if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() && (!lllIIIIlIlIllIIlIIIl.IlIlIIIllIllIIIIIllI() || lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll)) {
                    final int ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                    if (ilIlIlIlIlllllllllIl <= lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl()) {
                        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 0;
                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                        iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI();
                        b2 = true;
                    }
                    else if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl < lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl()) {
                        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl -= lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl() - llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl();
                        iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI();
                        b2 = true;
                    }
                }
                if (b) {
                    --n3;
                }
                else {
                    ++n3;
                }
            }
        }
        if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > 0) {
            int n4;
            if (b) {
                n4 = n2 - 1;
            }
            else {
                n4 = n;
            }
            while ((!b && n4 < n2) || (b && n4 >= n)) {
                final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl2 = this.llIllIIIIIllIlIIIIlI.get(n4);
                if (iiiiIllIIIIlIIIIllIl2.llllIIIIlIIIlIlllIll() == null) {
                    iiiiIllIIIIlIIIIllIl2.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl());
                    iiiiIllIIIIlIIIIllIl2.llIllIIIIIllIlIIIIlI();
                    lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 0;
                    b2 = true;
                    break;
                }
                if (b) {
                    --n4;
                }
                else {
                    ++n4;
                }
            }
        }
        return b2;
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n) {
        return n >> 2 & 0x3;
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n) {
        return n & 0x3;
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return (n & 0x3) | (n2 & 0x3) << 2;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return n == 0 || n == 1 || (n == 2 && llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl);
    }
    
    protected void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIlIlllIlIIIIIl = 0;
        this.lIIIIlIIIIIlllIllIII.clear();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final boolean b) {
        boolean b2 = iiiiIllIIIIlIIIIllIl == null || !iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl();
        if (iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl() && lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll()) && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(), lllIIIIlIlIllIIlIIIl)) {
            b2 |= (iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl + (b ? 0 : lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl) <= lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl());
        }
        return b2;
    }
    
    public static void llllIIIIlIIIlIlllIll(final Set set, final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n2) {
        switch (n) {
            case 0: {
                lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl / (float)set.size());
                break;
            }
            case 1: {
                lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 1;
                break;
            }
            case 2: {
                lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll();
                break;
            }
        }
        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl += n2;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        return true;
    }
    
    public static int llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return (ilIIIlIlIIIllIlIlIIl instanceof llIIIlIlIllIIlIlIlII) ? IlIlIlIlIlllllllllIl((llIIIlIlIllIIlIlIlII)ilIIIlIlIIIllIlIlIIl) : 0;
    }
    
    public static int IlIlIlIlIlllllllllIl(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        if (llIIIlIlIllIIlIlIlII == null) {
            return 0;
        }
        int n = 0;
        float n2 = 0.0f;
        for (int i = 0; i < llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = llIIIlIlIllIIlIlIlII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                n2 += lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl / (float)Math.min(llIIIlIlIllIIlIlIlII.lllllIlIIIlIlIIlllII(), lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl());
                ++n;
            }
        }
        return llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n2 / llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII() * 14.0f) + ((n > 0) ? 1 : 0);
    }
}
