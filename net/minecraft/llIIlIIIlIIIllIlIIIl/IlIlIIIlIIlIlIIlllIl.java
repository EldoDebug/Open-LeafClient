package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import org.apache.logging.log4j.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import org.apache.commons.lang3.*;
import java.util.*;

public class IlIlIIIlIIlIlIIlllIl extends IlIlIlIlIlllllllllIl
{
    private static final Logger IllIIlllIIIIlllIIlIl;
    private llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl;
    private llIIIlIlIllIIlIlIlII lIIIIlIIIIIlllIllIII;
    private IlllllllIIIlIIIlIlII lIIIlllIIIllIIIllIII;
    private net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl;
    public int llllIIIIlIIIlIlllIll;
    private int llIllIlIIIIllIlIIllI;
    private String lIlIlIIIllIIllIIIllI;
    private final llllIIIIlIIIlIlllIll IlIlIIIllIIllIlllllI;
    
    static {
        IllIIlllIIIIlllIIlIl = LogManager.getLogger();
    }
    
    public IlIlIIIlIIlIlIIlllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this(illIIlllIIIIlllIIlIl, illlllllIIIlIIIlIlII, net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll);
    }
    
    public IlIlIIIlIIlIlIIlllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlllllllIIIlIIIlIlII liiIlllIIIllIIIllIII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll ilIlIIIllIIllIlllllI) {
        this.llllIIIlIlllIlIIIIIl = new llIIlllIIlllIIllIllI();
        this.lIIIIlIIIIIlllIllIII = new net.minecraft.llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII(this, "Repair", true, 2);
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(this.lIIIIlIIIIIlllIllIII, 0, 27, 47));
        this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(this.lIIIIlIIIIIlllIllIII, 1, 76, 47));
        this.IlIlIlIlIlllllllllIl(new IIlIIIIlllIlllllIlII(this, this.llllIIIlIlllIlIIIIIl, 2, 134, 47, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, k, 8 + k * 18, 142));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        super.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII);
        if (llIIIlIlIllIIlIlIlII == this.lIIIIlIIIIIlllIllIII) {
            this.llllIIIIlIIIlIlllIll();
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI(0);
        this.llllIIIIlIIIlIlllIll = 1;
        int n = 0;
        final int n2 = 0;
        int n3 = 0;
        if (lIlIlIIIllIIllIIIllI == null) {
            this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(0, null);
            this.llllIIIIlIIIlIlllIll = 0;
        }
        else {
            lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI2 = this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI(1);
            final Map llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
            final int n4 = n2 + lIlIlIIIllIIllIIIllI.IIlllIlIIllIlIlIlIIl() + ((lIlIlIIIllIIllIIIllI2 == null) ? 0 : lIlIlIIIllIIllIIIllI2.IIlllIlIIllIlIlIlIIl());
            this.llIllIlIIIIllIlIIllI = 0;
            if (lIlIlIIIllIIllIIIllI2 != null) {
                final boolean b = lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ah && IIllIIllIIIlIlIIIIlI.ah.llIllIlIIIIllIlIIllI(lIlIlIIIllIIllIIIllI2).IlIlIIIllIllIIIIIllI() > 0;
                if (llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() && llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI2)) {
                    int n5 = Math.min(llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl(), llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII() / 4);
                    if (n5 <= 0) {
                        this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(0, null);
                        this.llllIIIIlIIIlIlllIll = 0;
                        return;
                    }
                    int llIllIlIIIIllIlIIllI;
                    for (llIllIlIIIIllIlIIllI = 0; n5 > 0 && llIllIlIIIIllIlIIllI < lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl; n5 = Math.min(llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl(), llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII() / 4), ++llIllIlIIIIllIlIIllI) {
                        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl() - n5);
                        ++n;
                    }
                    this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
                }
                else {
                    if (!b && (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll() != lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll() || !llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl())) {
                        this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(0, null);
                        this.llllIIIIlIIIlIlllIll = 0;
                        return;
                    }
                    if (llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() && !b) {
                        int n6 = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII() - (lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII() - lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl() + (lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII() - lIlIlIIIllIIllIIIllI2.llllIIIlIlllIlIIIIIl() + llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII() * 12 / 100));
                        if (n6 < 0) {
                            n6 = 0;
                        }
                        if (n6 < llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII()) {
                            llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(n6);
                            n += 2;
                        }
                    }
                    final Map llllIIIIlIIIlIlllIll2 = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI2);
                    for (final int intValue : llllIIIIlIIIlIlllIll2.keySet()) {
                        final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(intValue);
                        if (llllIIIIlIIIlIlllIll3 != null) {
                            final int n7 = llllIIIIlIIIlIlllIll.containsKey(intValue) ? llllIIIIlIIIlIlllIll.get(intValue) : 0;
                            int intValue2 = (int)llllIIIIlIIIlIlllIll2.get(intValue);
                            int max;
                            if (n7 == intValue2) {
                                max = ++intValue2;
                            }
                            else {
                                max = Math.max(intValue2, n7);
                            }
                            int ilIIIlIlIIIllIlIlIIl = max;
                            boolean llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI);
                            if (this.IlIlIIIllIIllIlllllI.K.IlIIIlIlIIIllIlIlIIl || lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ah) {
                                llllIIIIlIIIlIlllIll4 = true;
                            }
                            for (final int intValue3 : llllIIIIlIIIlIlllIll.keySet()) {
                                if (intValue3 != intValue && !llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(intValue3))) {
                                    llllIIIIlIIIlIlllIll4 = false;
                                    ++n;
                                }
                            }
                            if (!llllIIIIlIIIlIlllIll4) {
                                continue;
                            }
                            if (ilIIIlIlIIIllIlIlIIl > llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl()) {
                                ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl();
                            }
                            llllIIIIlIIIlIlllIll.put(intValue, ilIIIlIlIIIllIlIlIIl);
                            int max2 = 0;
                            switch (llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl()) {
                                case 1: {
                                    max2 = 8;
                                    break;
                                }
                                case 2: {
                                    max2 = 4;
                                    break;
                                }
                                case 5: {
                                    max2 = 2;
                                    break;
                                }
                                case 10: {
                                    max2 = 1;
                                    break;
                                }
                            }
                            if (b) {
                                max2 = Math.max(1, max2 / 2);
                            }
                            n += max2 * ilIIIlIlIIIllIlIlIIl;
                        }
                    }
                }
            }
            if (StringUtils.isBlank((CharSequence)this.lIlIlIIIllIIllIIIllI)) {
                if (lIlIlIIIllIIllIIIllI.IlIlIIIIIIlllIlIllIl()) {
                    n3 = 1;
                    n += n3;
                    llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl();
                }
            }
            else if (!this.lIlIlIIIllIIllIIIllI.equals(lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll())) {
                n3 = 1;
                n += n3;
                llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI);
            }
            this.llllIIIIlIIIlIlllIll = n4 + n;
            if (n <= 0) {
                llIIlIIIlIIIllIlIIIl = null;
            }
            if (n3 == n && n3 > 0 && this.llllIIIIlIIIlIlllIll >= 40) {
                this.llllIIIIlIIIlIlllIll = 39;
            }
            if (this.llllIIIIlIIIlIlllIll >= 40 && !this.IlIlIIIllIIllIlllllI.K.IlIIIlIlIIIllIlIlIIl) {
                llIIlIIIlIIIllIlIIIl = null;
            }
            if (llIIlIIIlIIIllIlIIIl != null) {
                int n8 = llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl();
                if (lIlIlIIIllIIllIIIllI2 != null && n8 < lIlIlIIIllIIllIIIllI2.IIlllIlIIllIlIlIlIIl()) {
                    n8 = lIlIlIIIllIIllIIIllI2.IIlllIlIIllIlIlIlIIl();
                }
                llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(n8 * 2 + 1);
                net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl);
            }
            this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(0, llIIlIIIlIIIllIlIIIl);
            this.llIllIIIIIllIlIIIIlI();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        super.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 0, this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int llllIIIIlIIIlIlllIll) {
        if (n == 0) {
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (!this.lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII) {
            for (int i = 0; i < this.lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII(); ++i) {
                final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI = this.lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI(i);
                if (ilIlIIIllIIllIlllllI != null) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, false);
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII() + 0.5, this.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII() + 0.5, this.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl() + 0.5) <= 64.0;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = null;
        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(n);
        if (iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl()) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll();
            llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl();
            if (n == 2) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 3, 39, true)) {
                    return null;
                }
                iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llIIlIIIlIIIllIlIIIl);
            }
            else if (n != 0 && n != 1) {
                if (n >= 3 && n < 39 && !this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0, 2, false)) {
                    return null;
                }
            }
            else if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 3, 39, false)) {
                return null;
            }
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == 0) {
                iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl(null);
            }
            else {
                iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI();
            }
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl) {
                return null;
            }
            iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        if (this.llllIIIIlIIIlIlllIll(2).IlIlIlIlIlllllllllIl()) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(2).llllIIIIlIIIlIlllIll();
            if (StringUtils.isBlank((CharSequence)lIlIlIIIllIIllIIIllI)) {
                llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl();
            }
            else {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI);
            }
        }
        this.llllIIIIlIIIlIlllIll();
    }
}
