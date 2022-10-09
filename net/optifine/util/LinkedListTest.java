package net.optifine.util;

import net.optifine.lIIIlllIIIllIIIllIII.*;
import java.util.*;

public class LinkedListTest
{
    public static void main(final String[] array) {
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI();
        final ArrayList<lIIIIlIIIIIlllIllIII> list = new ArrayList<lIIIIlIIIIIlllIllIII>();
        final ArrayList<lIIIIlIIIIIlllIllIII> list2 = new ArrayList<lIIIIlIIIIIlllIllIII>();
        final Random random = new Random();
        final int n = 100;
        for (int i = 0; i < n; ++i) {
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII();
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(i);
            list.add(liiiIlIIIIIlllIllIII);
        }
        for (int j = 0; j < 100000; ++j) {
            llllIIIIlIIIlIlllIll(list, list2, n);
            llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI, list2.size());
            if (j % 5 == 0) {
                llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
            }
            if (random.nextBoolean()) {
                if (!list.isEmpty()) {
                    final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2 = list.get(random.nextInt(list.size()));
                    final IlIlIIIlIIlIlIIlllIl ilIIIlIlIIIllIlIlIIl = liiiIlIIIIIlllIllIII2.IlIIIlIlIIIllIlIlIIl();
                    if (random.nextBoolean()) {
                        illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                        llllIIIIlIIIlIlllIll("Add first: " + liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll());
                    }
                    else if (random.nextBoolean()) {
                        illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
                        llllIIIIlIIIlIlllIll("Add last: " + liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll());
                    }
                    else {
                        if (list2.isEmpty()) {
                            continue;
                        }
                        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII3 = list2.get(random.nextInt(list2.size()));
                        illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII3.IlIIIlIlIIIllIlIlIIl(), ilIIIlIlIIIllIlIlIIl);
                        llllIIIIlIIIlIlllIll("Add after: " + liiiIlIIIIIlllIllIII3.llllIIIIlIIIlIlllIll() + ", " + liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll());
                    }
                    list.remove(liiiIlIIIIIlllIllIII2);
                    list2.add(liiiIlIIIIIlllIllIII2);
                }
            }
            else if (!list2.isEmpty()) {
                final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII4 = list2.get(random.nextInt(list2.size()));
                illIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII4.IlIIIlIlIIIllIlIlIIl());
                llllIIIIlIIIlIlllIll("Remove: " + liiiIlIIIIIlllIllIII4.llllIIIIlIIIlIlllIll());
                list2.remove(liiiIlIIIIIlllIllIII4);
                list.add(liiiIlIIIIIlllIllIII4);
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        final StringBuffer sb = new StringBuffer();
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII;
        final StringBuffer sb2;
        illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll().forEachRemaining(ilIlIIIlIIlIlIIlllIl -> {
            liiiIlIIIIIlllIllIII = (lIIIIlIIIIIlllIllIII)ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
            return;
        });
        llllIIIIlIIIlIlllIll("List: " + (Object)sb);
    }
    
    private static void llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final int n) {
        if (illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl() != n) {
            throw new RuntimeException("Wrong size, linked: " + illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl() + ", used: " + n);
        }
        int n2 = 0;
        for (IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(); ilIlIIIlIIlIlIIlllIl != null; ilIlIIIlIIlIlIIlllIl = ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI()) {
            ++n2;
        }
        if (illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl() != n2) {
            throw new RuntimeException("Wrong count, linked: " + illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl() + ", count: " + n2);
        }
        int n3 = 0;
        for (IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 = illIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(); ilIlIIIlIIlIlIIlllIl2 != null; ilIlIIIlIIlIlIIlllIl2 = ilIlIIIlIIlIlIIlllIl2.IlIlIlIlIlllllllllIl()) {
            ++n3;
        }
        if (illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl() != n3) {
            throw new RuntimeException("Wrong count back, linked: " + illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl() + ", count: " + n3);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final List list, final List list2, final int n) {
        final int n2 = list.size() + list2.size();
        if (n2 != n) {
            throw new RuntimeException("Total size: " + n2);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s) {
        System.out.println(s);
    }
}
