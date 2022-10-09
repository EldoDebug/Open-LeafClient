package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.client.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import com.mojang.authlib.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIllIIIlIlIIllIIIlI extends llIllIIIIIllIlIIIIlI
{
    private static final Ordering IlIlIIIllIllIIIIIllI;
    private final Minecraft IllIIlllIIIIlllIIlIl;
    private final llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl;
    private llIIIIIIlIllIIlIIIll lIIIIlIIIIIlllIllIII;
    private llIIIIIIlIllIIlIIIll lIIIlllIIIllIIIllIII;
    private long llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = Ordering.from((Comparator)new IIlllIIlllIIIlIlllII(null));
    }
    
    public IIIllIIIlIlIIllIIIlI(final Minecraft illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public String llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        return (iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl() != null) ? iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl().lIIIlllIIIllIIIllIII() : net.minecraft.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII(), iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().getName());
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llIllIlIIIIllIlIIllI) {
        if (llIllIlIIIIllIlIIllI && !this.llIllIlIIIIllIlIIllI) {
            this.llIIlIIIlIIIllIlIIIl = Minecraft.IIIllllllIllIIIlllIl();
        }
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final List sortedCopy = IIIllIIIlIlIIllIIIlI.IlIlIIIllIllIIIIIllI.sortedCopy((Iterable)this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
        int max = 0;
        int max2 = 0;
        for (final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll : sortedCopy) {
            max = Math.max(max, this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll)));
            if (liiiIlIIIIIlllIllIII != null && liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI() != net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) {
                max2 = Math.max(max2, this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(" " + llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().getName(), liiiIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl()));
            }
        }
        final List<IIIIlllIIIIIIlIIIlll> subList = sortedCopy.subList(0, Math.min(sortedCopy.size(), 80));
        int i;
        int n2;
        int n3;
        for (n2 = (i = subList.size()), n3 = 1; i > 20; i = (n2 + n3 - 1) / n3) {
            ++n3;
        }
        final boolean b = this.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII() || this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll().IlIlIlIlIlllllllllIl().IlIIIlIlIIIllIlIlIIl();
        int n4;
        if (liiiIlIIIIIlllIllIII != null) {
            if (liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI() == net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) {
                n4 = 90;
            }
            else {
                n4 = max2;
            }
        }
        else {
            n4 = 0;
        }
        final int n5 = Math.min(n3 * ((b ? 9 : 0) + max + n4 + 13), n - 50) / n3;
        final int n6 = n / 2 - (n5 * n3 + (n3 - 1) * 5) / 2;
        int n7 = 10;
        int n8 = n5 * n3 + (n3 - 1) * 5;
        List<String> llIllIIIIIllIlIIIIlI = null;
        List<String> llIllIIIIIllIlIIIIlI2 = null;
        if (this.lIIIlllIIIllIIIllIII != null) {
            llIllIIIIIllIlIIIIlI = (List<String>)this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(this.lIIIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII(), n - 50);
            final Iterator<String> iterator2 = llIllIIIIIllIlIIIIlI.iterator();
            while (iterator2.hasNext()) {
                n8 = Math.max(n8, this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(iterator2.next()));
            }
        }
        if (this.lIIIIlIIIIIlllIllIII != null) {
            llIllIIIIIllIlIIIIlI2 = (List<String>)this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII(), n - 50);
            final Iterator<String> iterator3 = llIllIIIIIllIlIIIIlI2.iterator();
            while (iterator3.hasNext()) {
                n8 = Math.max(n8, this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(iterator3.next()));
            }
        }
        if (llIllIIIIIllIlIIIIlI != null) {
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n / 2 - n8 / 2 - 1, n7 - 1, n / 2 + n8 / 2 + 1, n7 + llIllIIIIIllIlIIIIlI.size() * this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll, Integer.MIN_VALUE);
            for (final String s : llIllIIIIIllIlIIIIlI) {
                this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, (float)(n / 2 - this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s) / 2), (float)n7, -1);
                n7 += this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll;
            }
            ++n7;
        }
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n / 2 - n8 / 2 - 1, n7 - 1, n / 2 + n8 / 2 + 1, n7 + i * 9, Integer.MIN_VALUE);
        for (int j = 0; j < n2; ++j) {
            final int n9 = j / i;
            final int n10 = j % i;
            int n11 = n6 + n9 * n5 + n9 * 5;
            final int n12 = n7 + n10 * 9;
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n11, n12, n11 + n5, n12 + 8, 553648127);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            if (j < subList.size()) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = subList.get(j);
                final String llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
                final GameProfile llllIIIIlIIIlIlllIll2 = iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll();
                if (b) {
                    final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.getId());
                    final boolean b2 = llllIIIIlIIIlIlllIll3 != null && llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll) && (llllIIIIlIIIlIlllIll2.getName().equals("Dinnerbone") || llllIIIIlIIIlIlllIll2.getName().equals("Grumm"));
                    this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2.IllIIlllIIIIlllIIlIl());
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n11, n12, 8.0f, (float)(8 + (b2 ? 8 : 0)), 8, 8 * (b2 ? -1 : 1), 8, 8, 64.0f, 64.0f);
                    if (llllIIIIlIIIlIlllIll3 != null && llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl)) {
                        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n11, n12, 40.0f, (float)(8 + (b2 ? 8 : 0)), 8, 8 * (b2 ? -1 : 1), 8, 8, 64.0f, 64.0f);
                    }
                    n11 += 9;
                }
                if (iiiIlllIIIIIIlIIIlll2.IlIlIlIlIlllllllllIl() == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                    this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIlIIIlIlIIlllIIlll + llllIIIIlIIIlIlllIll, (float)n11, (float)n12, -1862270977);
                }
                else {
                    this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, (float)n11, (float)n12, -1);
                }
                if (liiiIlIIIIIlllIllIII != null && iiiIlllIIIIIIlIIIlll2.IlIlIlIlIlllllllllIl() != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                    final int n13 = n11 + max + 1;
                    final int n14 = n13 + n4;
                    if (n14 - n13 > 5) {
                        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, n12, llllIIIIlIIIlIlllIll2.getName(), n13, n14, iiiIlllIIIIIIlIIIlll2);
                    }
                }
                this.llllIIIIlIIIlIlllIll(n5, n11 - (b ? 9 : 0), n12, iiiIlllIIIIIIlIIIlll2);
            }
        }
        if (llIllIIIIIllIlIIIIlI2 != null) {
            int n15 = n7 + i * 9 + 1;
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n / 2 - n8 / 2 - 1, n15 - 1, n / 2 + n8 / 2 + 1, n15 + llIllIIIIIllIlIIIIlI2.size() * this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll, Integer.MIN_VALUE);
            for (final String s2 : llIllIIIIIllIlIIIIlI2) {
                this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s2, (float)(n / 2 - this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s2) / 2), (float)n15, -1);
                n15 += this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll;
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.llIllIIIIIllIlIIIIlI);
        final int n4 = 0;
        int n5;
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI() < 0) {
            n5 = 5;
        }
        else if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI() < 150) {
            n5 = 0;
        }
        else if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI() < 300) {
            n5 = 1;
        }
        else if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI() < 600) {
            n5 = 2;
        }
        else if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI() < 1000) {
            n5 = 3;
        }
        else {
            n5 = 4;
        }
        this.IlIIIlIlIIIllIlIlIIl += 100.0f;
        this.IlIlIlIlIlllllllllIl(n2 + n - 11, n3, 0 + n4 * 10, 176 + n5 * 8, 10, 8);
        this.IlIIIlIlIIIllIlIlIIl -= 100.0f;
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final int n, final String s, final int n2, final int n3, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final int ilIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(s, liiiIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl();
        if (liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI() == net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) {
            this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.llIllIIIIIllIlIIIIlI);
            if (this.llIIlIIIlIIIllIlIIIl == iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll()) {
                if (ilIlIlIlIlllllllllIl < iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI()) {
                    iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(Minecraft.IIIllllllIllIIIlllIl());
                    iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl((long)(this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI() + 20));
                }
                else if (ilIlIlIlIlllllllllIl > iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI()) {
                    iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(Minecraft.IIIllllllIllIIIlllIl());
                    iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl((long)(this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI() + 10));
                }
            }
            if (Minecraft.IIIllllllIllIIIlllIl() - iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI() > 1000L || this.llIIlIIIlIIIllIlIIIl != iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll()) {
                iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
                iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(Minecraft.IIIllllllIllIIIlllIl());
            }
            iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(this.llIIlIIIlIIIllIlIIIl);
            iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            final int illIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(Math.max(ilIlIlIlIlllllllllIl, iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI()) / 2.0f);
            final int max = Math.max(llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl((float)(ilIlIlIlIlllllllllIl / 2)), Math.max(llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl((float)(iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI() / 2)), 10));
            final boolean b = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll() > this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI() && (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll() - this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI()) / 3L % 2L == 1L;
            if (illIIlllIIIIlllIIlIl > 0) {
                final float min = Math.min((n3 - n2 - 4) / (float)max, 9.0f);
                if (min > 3.0f) {
                    for (int i = illIIlllIIIIlllIIlIl; i < max; ++i) {
                        this.llllIIIIlIIIlIlllIll(n2 + i * min, (float)n, b ? 25 : 16, 0, 9, 9);
                    }
                    for (int j = 0; j < illIIlllIIIIlllIIlIl; ++j) {
                        this.llllIIIIlIIIlIlllIll(n2 + j * min, (float)n, b ? 25 : 16, 0, 9, 9);
                        if (b) {
                            if (j * 2 + 1 < iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI()) {
                                this.llllIIIIlIIIlIlllIll(n2 + j * min, (float)n, 70, 0, 9, 9);
                            }
                            if (j * 2 + 1 == iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI()) {
                                this.llllIIIIlIIIlIlllIll(n2 + j * min, (float)n, 79, 0, 9, 9);
                            }
                        }
                        if (j * 2 + 1 < ilIlIlIlIlllllllllIl) {
                            this.llllIIIIlIIIlIlllIll(n2 + j * min, (float)n, (j >= 10) ? 160 : 52, 0, 9, 9);
                        }
                        if (j * 2 + 1 == ilIlIlIlIlllllllllIl) {
                            this.llllIIIIlIIIlIlllIll(n2 + j * min, (float)n, (j >= 10) ? 169 : 61, 0, 9, 9);
                        }
                    }
                }
                else {
                    final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl / 20.0f, 0.0f, 1.0f);
                    final int n4 = (int)((1.0f - llllIIIIlIIIlIlllIll) * 255.0f) << 16 | (int)(llllIIIIlIIIlIlllIll * 255.0f) << 8;
                    String s2 = new StringBuilder().append(ilIlIlIlIlllllllllIl / 2.0f).toString();
                    if (n3 - this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.valueOf(s2) + "hp") >= n2) {
                        s2 = String.valueOf(s2) + "hp";
                    }
                    this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s2, (float)((n3 + n2) / 2 - this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s2) / 2), (float)n, n4);
                }
            }
        }
        else {
            final String string = new StringBuilder().append(IlllIIIIlIIIlIlIlIIl.llllIIllllIlIlIIIIll).append(ilIlIlIlIlllllllllIl).toString();
            this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string, (float)(n3 - this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string)), (float)n, 16777215);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public void IlIlIlIlIlllllllllIl(final llIIIIIIlIllIIlIIIll liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.lIIIlllIIIllIIIllIII = null;
        this.lIIIIlIIIIIlllIllIII = null;
    }
}
