package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIllIIllIIlIIIIlIIl
{
    public static void llllIIIIlIIIlIlllIll() {
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(llllIlIllllIIlIIlIlI.class, "ViBH");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(lIllIIlIlIlllllIIIII.class, "ViDF");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(lIIlIIIIIIIlIIlIlIIl.class, "ViF");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(h.class, "ViL");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.class, "ViPH");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(c.class, "ViSH");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(k.class, "ViSmH");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.class, "ViST");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(a.class, "ViS");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(g.class, "ViStart");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(d.class, "ViSR");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(b.class, "ViTRH");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(j.class, "ViW");
    }
    
    public static List llllIIIIlIIIlIlllIll(final Random random, final int n) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new e(c.class, 4, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2 + n, 4 + n * 2)));
        arrayList.add(new e(lIIlllIlllllIIlllIll.class, 20, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 0 + n, 1 + n)));
        arrayList.add(new e(llllIlIllllIIlIIlIlI.class, 20, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 0 + n, 2 + n)));
        arrayList.add(new e(k.class, 3, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2 + n, 5 + n * 3)));
        arrayList.add(new e(IlIIlllIIlIlllllIIlI.class, 15, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 0 + n, 2 + n)));
        arrayList.add(new e(lIllIIlIlIlllllIIIII.class, 3, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 1 + n, 4 + n)));
        arrayList.add(new e(lIIlIIIIIIIlIIlIlIIl.class, 3, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2 + n, 4 + n * 2)));
        arrayList.add(new e(a.class, 15, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 0, 1 + n)));
        arrayList.add(new e(b.class, 8, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 0 + n, 3 + n * 2)));
        final Iterator<e> iterator = (Iterator<e>)arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().IlIIIlIlIIIllIlIlIIl == 0) {
                iterator.remove();
            }
        }
        return arrayList;
    }
    
    private static int llllIIIIlIIIlIlllIll(final List list) {
        boolean b = false;
        int n = 0;
        for (final e e : list) {
            if (e.IlIIIlIlIIIllIlIlIIl > 0 && e.llIllIIIIIllIlIIIIlI < e.IlIIIlIlIIIllIlIlIIl) {
                b = true;
            }
            n += e.IlIlIlIlIlllllllllIl;
        }
        return b ? n : -1;
    }
    
    private static i llllIIIIlIIIlIlllIll(final g g, final e e, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final Class llllIIIIlIIIlIlllIll = e.llllIIIIlIIIlIlllIll;
        i i = null;
        if (llllIIIIlIIIlIlllIll == c.class) {
            i = c.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
        }
        else if (llllIIIIlIIIlIlllIll == lIIlllIlllllIIlllIll.class) {
            i = lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
        }
        else if (llllIIIIlIIIlIlllIll == llllIlIllllIIlIIlIlI.class) {
            i = llllIlIllllIIlIIlIlI.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
        }
        else if (llllIIIIlIIIlIlllIll == k.class) {
            i = k.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
        }
        else if (llllIIIIlIIIlIlllIll == IlIIlllIIlIlllllIIlI.class) {
            i = IlIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
        }
        else if (llllIIIIlIIIlIlllIll == lIllIIlIlIlllllIIIII.class) {
            i = lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
        }
        else if (llllIIIIlIIIlIlllIll == lIIlIIIIIIIlIIlIlIIl.class) {
            i = lIIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
        }
        else if (llllIIIIlIIIlIlllIll == a.class) {
            i = a.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
        }
        else if (llllIIIIlIIIlIlllIll == b.class) {
            i = b.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
        }
        return i;
    }
    
    private static i llIllIIIIIllIlIIIIlI(final g g, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(g.lIIIIlIIIIIlllIllIII);
        if (llllIIIIlIIIlIlllIll <= 0) {
            return null;
        }
        int i = 0;
        while (i < 5) {
            ++i;
            int nextInt = random.nextInt(llllIIIIlIIIlIlllIll);
            for (final e ilIIIlIlIIIllIlIlIIl : g.lIIIIlIIIIIlllIllIII) {
                nextInt -= ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl;
                if (nextInt < 0) {
                    if (!ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n4)) {
                        break;
                    }
                    if (ilIIIlIlIIIllIlIlIIl == g.IlIIIlIlIIIllIlIlIIl && g.lIIIIlIIIIIlllIllIII.size() > 1) {
                        break;
                    }
                    final i llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(g, ilIIIlIlIIIllIlIlIIl, list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        final e e = ilIIIlIlIIIllIlIlIIl;
                        ++e.llIllIIIIIllIlIIIIlI;
                        g.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
                        if (!ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()) {
                            g.lIIIIlIIIIIlllIllIII.remove(ilIIIlIlIIIllIlIlIIl);
                        }
                        return llllIIIIlIIIlIlllIll2;
                    }
                    continue;
                }
            }
        }
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll3 = h.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll);
        if (llllIIIIlIIIlIlllIll3 != null) {
            return new h(g, n4, random, llllIIIIlIIIlIlllIll3, lllIllIIIllllllIllll);
        }
        return null;
    }
    
    private static IlllllllIIIlIIIlIlII IlIIIlIlIIIllIlIlIIl(final g g, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        if (n4 > 50) {
            return null;
        }
        if (Math.abs(n - g.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll) <= 112 && Math.abs(n3 - g.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI) <= 112) {
            final i llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(g, list, random, n, n2, n3, lllIllIIIllllllIllll, n4 + 1);
            if (llIllIIIIIllIlIIIIlI != null) {
                final int n5 = (llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl) / 2;
                final int n6 = (llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl) / 2;
                final int n7 = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
                final int n8 = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
                if (g.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(n5, n6, ((n7 > n8) ? n7 : n8) / 2 + 4, IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI)) {
                    list.add(llIllIIIIIllIlIIIIlI);
                    g.lIIIlllIIIllIIIllIII.add(llIllIIIIIllIlIIIIlI);
                    return llIllIIIIIllIlIIIIlI;
                }
            }
            return null;
        }
        return null;
    }
    
    private static IlllllllIIIlIIIlIlII IlIlIIIllIllIIIIIllI(final g g, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        if (n4 > 3 + g.llIllIIIIIllIlIIIIlI) {
            return null;
        }
        if (Math.abs(n - g.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll) <= 112 && Math.abs(n3 - g.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI) <= 112) {
            final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = d.llllIIIIlIIIlIlllIll(g, list, random, n, n2, n3, lllIllIIIllllllIllll);
            if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl > 10) {
                final d d = new d(g, n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll);
                final int n5 = (d.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + d.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl) / 2;
                final int n6 = (d.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + d.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl) / 2;
                final int n7 = d.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - d.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
                final int n8 = d.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - d.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
                if (g.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(n5, n6, ((n7 > n8) ? n7 : n8) / 2 + 4, IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI)) {
                    list.add(d);
                    g.llIIlIIIlIIIllIlIIIl.add(d);
                    return d;
                }
            }
            return null;
        }
        return null;
    }
}
