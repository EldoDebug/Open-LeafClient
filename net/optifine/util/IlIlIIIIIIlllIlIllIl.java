package net.optifine.util;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public class IlIlIIIIIIlllIlIllIl
{
    public static void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl[] array, final IlIIIlIlIIIllIlIlIIl[] array2) {
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < array2.length; ++i) {
            set.add(array2[i].lIIIlllIIIllIIIllIII());
        }
        final HashSet<IlIIIlIlIIIllIlIlIIl> set2 = (HashSet<IlIIIlIlIIIllIlIlIIl>)new HashSet<Object>(Arrays.asList(array));
        set2.removeAll(Arrays.asList(array2));
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : set2) {
            if (set.contains(ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII())) {
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(0);
            }
        }
    }
}
