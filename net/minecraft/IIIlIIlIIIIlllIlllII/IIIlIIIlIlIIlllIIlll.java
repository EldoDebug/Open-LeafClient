package net.minecraft.IIIlIIlIIIIlllIlllII;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;

public class IIIlIIIlIlIIlllIIlll
{
    private final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll;
    private final Random IlIlIlIlIlllllllllIl;
    private final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI;
    private final List IlIIIlIlIIIllIlIlIIl;
    
    public IIIlIIIlIlIIlllIIlll(final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI = new lIIllIIIllllIlllIllI();
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = new Random(llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII());
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        if (this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll() != 1) {
            if (!this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, n)) {
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, n);
            }
        }
        else {
            final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl);
            final int n2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII) - 1;
            final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
            final int n3 = 1;
            final int n4 = 0;
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    for (int k = -1; k < 3; ++k) {
                        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI2 + j * n3 + i * n4, n2 + k, llIllIIIIIllIlIIIIlI3 + j * n4 - i * n3), (k < 0) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.lllIllIIIllllllIllll() : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
                    }
                }
            }
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI2, n2, llIllIIIIIllIlIIIIlI3, llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll, 0.0f);
            final double lIllllllIIllIlIlIlII = 0.0;
            llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII;
            llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI = lIllllllIIllIlIlIlII;
            llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        double n2 = -1.0;
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
        boolean b = true;
        IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        final long llllIIIIlIIIlIlllIll2 = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3);
        if (this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2)) {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (IlIlIIIlIIlIlIIlllIl)this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            n2 = 0.0;
            llllIIIIlIIIlIlllIll = ilIlIIIlIIlIlIIlllIl;
            ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII();
            b = false;
        }
        else {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
            for (int i = -128; i <= 128; ++i) {
                for (int j = -128; j <= 128; ++j) {
                    IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2;
                    for (IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl() - 1 - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), j); llllIIIIlIIIlIlllIll3.lIIIlllIIIllIIIllIII() >= 0; llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2) {
                        ilIlIlIlIlllllllllIl2 = llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl();
                        if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.c) {
                            while (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2 = llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.c) {
                                llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2;
                            }
                            final double illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll3.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl);
                            if (n2 < 0.0 || illIIlllIIIIlllIIlIl < n2) {
                                n2 = illIIlllIIIIlllIIlIl;
                                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll3;
                            }
                        }
                    }
                }
            }
        }
        if (n2 >= 0.0) {
            if (b) {
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, new IlIlIIIlIIlIlIIlllIl(this, llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII()));
                this.IlIIIlIlIIIllIlIlIIl.add(llllIIIIlIIIlIlllIll2);
            }
            double n3 = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() + 0.5;
            final double n4 = llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() + 0.5;
            double n5 = llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() + 0.5;
            final IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.c.llIIlIIIlIIIllIlIIIl(this.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll);
            final boolean b2 = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl() == IIlIlIlIIlIllIIIIIIl.IlIlIlIlIlllllllllIl;
            double n6 = (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) ? llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl() : ((double)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII());
            final double n7 = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII() + 1 - llIllIIIIIllIlIIIIlI.IIIIIlllIlIIIIIIIllI().IlIlIlIlIlllllllllIl * llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI();
            if (b2) {
                ++n6;
            }
            if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) {
                n5 = n6 + (1.0 - llIllIIIIIllIlIIIIlI.IIIIIlllIlIIIIIIIllI().llllIIIIlIIIlIlllIll) * llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll();
            }
            else {
                n3 = n6 + (1.0 - llIllIIIIIllIlIIIIlI.IIIIIlllIlIIIIIIIllI().llllIIIIlIIIlIlllIll) * llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() * llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll();
            }
            float n8 = 0.0f;
            float n9 = 0.0f;
            float n10 = 0.0f;
            float n11 = 0.0f;
            if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().IlIlIIIllIllIIIIIllI() == llIllIIIIIllIlIIIIlI.llllllIIIIIIIlllIIll()) {
                n8 = 1.0f;
                n9 = 1.0f;
            }
            else if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().IlIlIIIllIllIIIIIllI() == llIllIIIIIllIlIIIIlI.llllllIIIIIIIlllIIll().IlIlIIIllIllIIIIIllI()) {
                n8 = -1.0f;
                n9 = -1.0f;
            }
            else if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().IlIlIIIllIllIIIIIllI() == llIllIIIIIllIlIIIIlI.llllllIIIIIIIlllIIll().IllIIlllIIIIlllIIlIl()) {
                n10 = 1.0f;
                n11 = -1.0f;
            }
            else {
                n10 = -1.0f;
                n11 = 1.0f;
            }
            final double lIllllllIIllIlIlIlII = llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII;
            final double iIlllIIIlIlllIIlllII = llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII;
            llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII * n8 + iIlllIIIlIlllIIlllII * n11;
            llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII * n10 + iIlllIIIlIlllIIlllII * n9;
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n7, n5, llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll = n - llIllIIIIIllIlIIIIlI.llllllIIIIIIIlllIIll().IlIlIIIllIllIIIIIllI().llIllIIIIIllIlIIIIlI() * 90 + llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI() * 90, llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI);
            return true;
        }
        return false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final int n = 16;
        double n2 = -1.0;
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
        int n3 = llIllIIIIIllIlIIIIlI2;
        int n4 = llIllIIIIIllIlIIIIlI3;
        int n5 = llIllIIIIIllIlIIIIlI4;
        int n6 = 0;
        final int nextInt = this.IlIlIlIlIlllllllllIl.nextInt(4);
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
        for (int i = llIllIIIIIllIlIIIIlI2 - n; i <= llIllIIIIIllIlIIIIlI2 + n; ++i) {
            final double n7 = i + 0.5 - llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
            for (int j = llIllIIIIIllIlIIIIlI4 - n; j <= llIllIIIIIllIlIIIIlI4 + n; ++j) {
                final double n8 = j + 0.5 - llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
            Label_0447:
                for (int k = this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl() - 1; k >= 0; --k) {
                    if (this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, k, j))) {
                        while (k > 0 && this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, k - 1, j))) {
                            --k;
                        }
                        for (int l = nextInt; l < nextInt + 4; ++l) {
                            int n9 = l % 2;
                            int n10 = 1 - n9;
                            if (l % 4 >= 2) {
                                n9 = -n9;
                                n10 = -n10;
                            }
                            for (int n11 = 0; n11 < 3; ++n11) {
                                for (int n12 = 0; n12 < 4; ++n12) {
                                    for (int n13 = -1; n13 < 4; ++n13) {
                                        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i + (n12 - 1) * n9 + n11 * n10, k + n13, j + (n12 - 1) * n10 - n11 * n9);
                                        if (n13 < 0 && !this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl()) {
                                            continue Label_0447;
                                        }
                                        if (n13 >= 0 && !this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIlIlllIlIIIIIl)) {
                                            continue Label_0447;
                                        }
                                    }
                                }
                            }
                            final double n14 = k + 0.5 - llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII;
                            final double n15 = n7 * n7 + n14 * n14 + n8 * n8;
                            if (n2 < 0.0 || n15 < n2) {
                                n2 = n15;
                                n3 = i;
                                n4 = k;
                                n5 = j;
                                n6 = l % 4;
                            }
                        }
                    }
                }
            }
        }
        if (n2 < 0.0) {
            for (int n16 = llIllIIIIIllIlIIIIlI2 - n; n16 <= llIllIIIIIllIlIIIIlI2 + n; ++n16) {
                final double n17 = n16 + 0.5 - llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
                for (int n18 = llIllIIIIIllIlIIIIlI4 - n; n18 <= llIllIIIIIllIlIIIIlI4 + n; ++n18) {
                    final double n19 = n18 + 0.5 - llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
                Label_0819:
                    for (int n20 = this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl() - 1; n20 >= 0; --n20) {
                        if (this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n16, n20, n18))) {
                            while (n20 > 0 && this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n16, n20 - 1, n18))) {
                                --n20;
                            }
                            for (int n21 = nextInt; n21 < nextInt + 2; ++n21) {
                                final int n22 = n21 % 2;
                                final int n23 = 1 - n22;
                                for (int n24 = 0; n24 < 4; ++n24) {
                                    for (int n25 = -1; n25 < 4; ++n25) {
                                        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n16 + (n24 - 1) * n22, n20 + n25, n18 + (n24 - 1) * n23);
                                        if (n25 < 0 && !this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl()) {
                                            continue Label_0819;
                                        }
                                        if (n25 >= 0 && !this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIlIlllIlIIIIIl)) {
                                            continue Label_0819;
                                        }
                                    }
                                }
                                final double n26 = n20 + 0.5 - llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII;
                                final double n27 = n17 * n17 + n26 * n26 + n19 * n19;
                                if (n2 < 0.0 || n27 < n2) {
                                    n2 = n27;
                                    n3 = n16;
                                    n4 = n20;
                                    n5 = n18;
                                    n6 = n21 % 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        final int n28 = n3;
        int llllIIIIlIIIlIlllIll = n4;
        final int n29 = n5;
        int n30 = n6 % 2;
        int n31 = 1 - n30;
        if (n6 % 4 >= 2) {
            n30 = -n30;
            n31 = -n31;
        }
        if (n2 < 0.0) {
            llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n4, 70, this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl() - 10);
            for (int n32 = -1; n32 <= 1; ++n32) {
                for (int n33 = 1; n33 < 3; ++n33) {
                    for (int n34 = -1; n34 < 3; ++n34) {
                        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(n28 + (n33 - 1) * n30 + n32 * n31, llllIIIIlIIIlIlllIll + n34, n29 + (n33 - 1) * n31 - n32 * n30), (n34 < 0) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.lllIllIIIllllllIllll() : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
                    }
                }
            }
        }
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.c.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ab.IIIIIIIIIlllIllIlIlI, (n30 != 0) ? llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll : llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI);
        for (int n35 = 0; n35 < 4; ++n35) {
            for (int n36 = 0; n36 < 4; ++n36) {
                for (int n37 = -1; n37 < 4; ++n37) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n28 + (n36 - 1) * n30, llllIIIIlIIIlIlllIll + n37, n29 + (n36 - 1) * n31), (n36 == 0 || n36 == 3 || n37 == -1 || n37 == 3) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.lllIllIIIllllllIllll() : llllIIIIlIIIlIlllIll2, 2);
                }
            }
            for (int n38 = 0; n38 < 4; ++n38) {
                for (int n39 = -1; n39 < 4; ++n39) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(n28 + (n38 - 1) * n30, llllIIIIlIIIlIlllIll + n39, n29 + (n38 - 1) * n31);
                    this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI());
                }
            }
        }
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final long n) {
        if (n % 100L == 0L) {
            final Iterator<Long> iterator = (Iterator<Long>)this.IlIIIlIlIIIllIlIlIIl.iterator();
            final long n2 = n - 300L;
            while (iterator.hasNext()) {
                final Long n3 = iterator.next();
                final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (IlIlIIIlIIlIlIIlllIl)this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n3);
                if (ilIlIIIlIIlIlIIlllIl == null || ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI < n2) {
                    iterator.remove();
                    this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(n3);
                }
            }
        }
    }
}
