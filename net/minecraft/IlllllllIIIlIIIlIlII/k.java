package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import com.google.common.collect.*;
import java.util.*;

public class k extends j
{
    private lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public k(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final int ilIlIlIlIlllllllllIl, final int ilIIIlIlIIIllIlIlIIl2, final int n2) {
        super(n2);
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, n);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
    }
    
    public k(final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int ilIIIlIlIIIllIlIlIIl, final int n) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final Random random, final List list, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n) {
        for (int i = 0; i < n; ++i) {
            final k k = (k)i.llllIIIIlIIIlIlllIll(random, list);
            final int ilIlIlIlIlllllllllIl = k.IlIlIlIlIlllllllllIl + random.nextInt(k.IlIIIlIlIIIllIlIlIIl - k.IlIlIlIlIlllllllllIl + 1);
            if (k.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() >= ilIlIlIlIlllllllllIl) {
                final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = k.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
                llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(random.nextInt(llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII()), llIIlIIIlIIIllIlIIIl);
            }
            else {
                for (int j = 0; j < ilIlIlIlIlllllllllIl; ++j) {
                    final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl2 = k.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
                    llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl = 1;
                    llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(random.nextInt(llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII()), llIIlIIIlIIIllIlIIIl2);
                }
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final Random random, final List list, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final int n) {
        for (int i = 0; i < n; ++i) {
            final k k = (k)i.llllIIIIlIIIlIlllIll(random, list);
            final int ilIlIlIlIlllllllllIl = k.IlIlIlIlIlllllllllIl + random.nextInt(k.IlIIIlIlIIIllIlIlIIl - k.IlIlIlIlIlllllllllIl + 1);
            if (k.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() >= ilIlIlIlIlllllllllIl) {
                final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = k.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
                llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(random.nextInt(lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII()), llIIlIIIlIIIllIlIIIl);
            }
            else {
                for (int j = 0; j < ilIlIlIlIlllllllllIl; ++j) {
                    final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl2 = k.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
                    llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl = 1;
                    lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(random.nextInt(lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII()), llIIlIIIlIIIllIlIIIl2);
                }
            }
        }
    }
    
    public static List llllIIIIlIIIlIlllIll(final List list, final k... array) {
        final ArrayList arrayList = Lists.newArrayList((Iterable)list);
        Collections.addAll(arrayList, array);
        return arrayList;
    }
}
