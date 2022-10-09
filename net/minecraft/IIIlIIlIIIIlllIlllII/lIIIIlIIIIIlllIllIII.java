package net.minecraft.IIIlIIlIIIIlllIlllII;

import com.google.common.collect.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIIlIIIIIlllIllIII
{
    private final boolean llllIIIIlIIIlIlllIll;
    private final boolean IlIlIlIlIlllllllllIl;
    private final Random llIllIIIIIllIlIIIIlI;
    private final IlllllllIIIlIIIlIlII IlIIIlIlIIIllIlIlIIl;
    private final double IlIlIIIllIllIIIIIllI;
    private final double IllIIlllIIIIlllIIlIl;
    private final double llllIIIlIlllIlIIIIIl;
    private final llIllIIIIIllIlIIIIlI lIIIIlIIIIIlllIllIII;
    private final float lIIIlllIIIllIIIllIII;
    private final List llIIlIIIlIIIllIlIIIl;
    private final Map llIllIlIIIIllIlIIllI;
    
    public lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final List list) {
        this(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI, n, n2, n3, n4, false, true, list);
    }
    
    public lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final boolean b, final boolean b2, final List list) {
        this(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI, n, n2, n3, n4, b, b2);
        this.llIIlIIIlIIIllIlIIIl.addAll(list);
    }
    
    public lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII ilIIIlIlIIIllIlIlIIl, final llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII, final double ilIlIIIllIllIIIIIllI, final double illIIlllIIIIlllIIlIl, final double llllIIIlIlllIlIIIIIl, final float liiIlllIIIllIIIllIII, final boolean llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = new Random();
        this.llIIlIIIlIIIllIlIIIl = Lists.newArrayList();
        this.llIllIlIIIIllIlIIllI = Maps.newHashMap();
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i == 0 || i == 15 || j == 0 || j == 15 || k == 0 || k == 15) {
                        final double n = i / 15.0f * 2.0f - 1.0f;
                        final double n2 = j / 15.0f * 2.0f - 1.0f;
                        final double n3 = k / 15.0f * 2.0f - 1.0f;
                        final double sqrt = Math.sqrt(n * n + n2 * n2 + n3 * n3);
                        final double n4 = n / sqrt;
                        final double n5 = n2 / sqrt;
                        final double n6 = n3 / sqrt;
                        float n7 = this.lIIIlllIIIllIIIllIII * (0.7f + this.IlIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll.nextFloat() * 0.6f);
                        double ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
                        double illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
                        double llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
                        while (n7 > 0.0f) {
                            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl);
                            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
                            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                                n7 -= (((this.lIIIIlIIIIIlllIllIII != null) ? this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this, this.IlIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2) : ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null)) + 0.3f) * 0.3f;
                            }
                            if (n7 > 0.0f && (this.lIIIIlIIIIIlllIllIII == null || this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this, this.IlIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, n7))) {
                                hashSet.add(ilIlIlIlIlllllllllIl);
                            }
                            ilIlIIIllIllIIIIIllI += n4 * 0.30000001192092896;
                            illIIlllIIIIlllIIlIl += n5 * 0.30000001192092896;
                            llllIIIlIlllIlIIIIIl += n6 * 0.30000001192092896;
                            n7 -= 0.22500001f;
                        }
                    }
                }
            }
        }
        this.llIIlIIIlIIIllIlIIIl.addAll(hashSet);
        final float n8 = this.lIIIlllIIIllIIIllIII * 2.0f;
        final List ilIlIlIlIlllllllllIl3 = this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, new llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI - n8 - 1.0), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IllIIlllIIIIlllIIlIl - n8 - 1.0), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIlIlllIlIIIIIl - n8 - 1.0), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI + n8 + 1.0), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IllIIlllIIIIlllIIlIl + n8 + 1.0), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIlIlllIlIIIIIl + n8 + 1.0)));
        final e e = new e(this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        for (int l = 0; l < ilIlIlIlIlllllllllIl3.size(); ++l) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl3.get(l);
            if (!llIllIIIIIllIlIIIIlI.d()) {
                final double n9 = llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl) / n8;
                if (n9 <= 1.0) {
                    final double n10 = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - this.IlIlIIIllIllIIIIIllI;
                    final double n11 = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI() - this.IllIIlllIIIIlllIIlIl;
                    final double n12 = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - this.llllIIIlIlllIlIIIIIl;
                    final double n13 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n10 * n10 + n11 * n11 + n12 * n12);
                    if (n13 != 0.0) {
                        final double n14 = n10 / n13;
                        final double n15 = n11 / n13;
                        final double n16 = n12 / n13;
                        final double n17 = (1.0 - n9) * this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(e, llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI());
                        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), (float)(int)((n17 * n17 + n17) / 2.0 * 8.0 * n8 + 1.0));
                        final double llllIIIIlIIIlIlllIll = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n17);
                        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI;
                        llIllIIIIIllIlIIIIlI2.lIllllllIIllIlIlIlII += n14 * llllIIIIlIIIlIlllIll;
                        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI3 = llIllIIIIIllIlIIIIlI;
                        llIllIIIIIllIlIIIIlI3.llIIlllIIlllIIllIllI += n15 * llllIIIIlIIIlIlllIll;
                        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI4 = llIllIIIIIllIlIIIIlI;
                        llIllIIIIIllIlIIIIlI4.IIlllIIIlIlllIIlllII += n16 * llllIIIIlIIIlIlllIll;
                        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && !((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).K.llllIIIIlIIIlIlllIll) {
                            this.llIllIlIIIIllIlIIllI.put(llIllIIIIIllIlIIIIlI, new e(n14 * n17, n15 * n17, n16 * n17));
                        }
                    }
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, "random.explode", 4.0f, (1.0f + (this.IlIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll.nextFloat() - this.IlIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll.nextFloat()) * 0.2f) * 0.7f);
        if (this.lIIIlllIIIllIIIllIII >= 2.0f && this.IlIlIlIlIlllllllllIl) {
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, 1.0, 0.0, 0.0, new int[0]);
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, 1.0, 0.0, 0.0, new int[0]);
        }
        if (this.IlIlIlIlIlllllllllIl) {
            for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : this.llIIlIIIlIIIllIlIIIl) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
                if (b) {
                    final double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.IlIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll.nextFloat();
                    final double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.IlIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll.nextFloat();
                    final double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.IlIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll.nextFloat();
                    final double n4 = n - this.IlIlIIIllIllIIIIIllI;
                    final double n5 = n2 - this.IllIIlllIIIIlllIIlIl;
                    final double n6 = n3 - this.llllIIIlIlllIlIIIIIl;
                    final double n7 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n4 * n4 + n5 * n5 + n6 * n6);
                    final double n8 = n4 / n7;
                    final double n9 = n5 / n7;
                    final double n10 = n6 / n7;
                    final double n11 = 0.5 / (n7 / this.lIIIlllIIIllIIIllIII + 0.1) * (this.IlIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll.nextFloat() * this.IlIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll.nextFloat() + 0.3f);
                    final double n12 = n8 * n11;
                    final double n13 = n9 * n11;
                    final double n14 = n10 * n11;
                    this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll, (n + this.IlIlIIIllIllIIIIIllI * 1.0) / 2.0, (n2 + this.IllIIlllIIIIlllIIlIl * 1.0) / 2.0, (n3 + this.llllIIIlIlllIlIIIIIl * 1.0) / 2.0, n12, n13, n14, new int[0]);
                    this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, n, n2, n3, n12, n13, n14, new int[0]);
                }
                if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this)) {
                        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl, this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl), 1.0f / this.lIIIlllIIIllIIIllIII, 0);
                    }
                    this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 3);
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl, this);
                }
            }
        }
        if (this.llllIIIIlIIIlIlllIll) {
            for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 : this.llIIlIIIlIIIllIlIIIl) {
                if (this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll() && this.llIllIIIIIllIlIIIIlI.nextInt(3) == 0) {
                    this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll());
                }
            }
        }
    }
    
    public Map IlIlIlIlIlllllllllIl() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI() {
        return (this.lIIIIlIIIIIlllIllIII == null) ? null : ((this.lIIIIlIIIIIlllIllIII instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll) ? ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll)this.lIIIIlIIIIIlllIllIII).llllIIIlIlllIlIIIIIl() : ((this.lIIIIlIIIIIlllIllIII instanceof lllIIIIlllllIlIIllIl) ? ((lllIIIIlllllIlIIllIl)this.lIIIIlIIIIIlllIllIII) : null));
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llIIlIIIlIIIllIlIIIl.clear();
    }
    
    public List IlIlIIIllIllIIIIIllI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
}
