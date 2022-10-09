package net.optifine.util;

import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.lang.reflect.*;
import java.util.*;

public class IlIlIIIllIllIIIIIllI
{
    private static llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private static lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl;
    private static lIlIlIIIllIIllIIIllI llIllIIIIIllIlIIIIlI;
    
    static {
        IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll = new llIIlIIIlIIIllIlIIIl(llllIIIIlIIIlIlllIll.class);
        IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll();
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI = new lIlIlIIIllIIllIIIllI(IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, int[].class, 0);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, true);
    }
    
    public static int llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int[] array = (int[])lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI);
        if (array == null || array.length != 256) {
            return -1;
        }
        final int n = array[(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF) | (ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF) << 4];
        if (n >= 0) {
            return n;
        }
        return llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl).lIIIlllIIIllIIIllIII();
    }
    
    private static lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll() {
        try {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll(null, 0, 0);
            final ArrayList<Field> list = new ArrayList<Field>();
            final ArrayList<Boolean> list2 = new ArrayList<Boolean>();
            final Field[] declaredFields = llllIIIIlIIIlIlllIll.class.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; ++i) {
                final Field field = declaredFields[i];
                if (field.getType() == Boolean.TYPE) {
                    field.setAccessible(true);
                    list.add(field);
                    list2.add((Boolean)field.get(llllIIIIlIIIlIlllIll));
                }
            }
            llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(false);
            final ArrayList<Boolean> list3 = new ArrayList<Boolean>();
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                list3.add((Boolean)iterator.next().get(llllIIIIlIIIlIlllIll));
            }
            llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(true);
            final ArrayList<Boolean> list4 = new ArrayList<Boolean>();
            final Iterator<Object> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                list4.add((Boolean)iterator2.next().get(llllIIIIlIIIlIlllIll));
            }
            final ArrayList<Field> list5 = new ArrayList<Field>();
            for (int j = 0; j < list.size(); ++j) {
                final Field field2 = list.get(j);
                final Boolean b = list3.get(j);
                final Boolean b2 = list4.get(j);
                if (!b && b2) {
                    list5.add(field2);
                    field2.set(llllIIIIlIIIlIlllIll, list2.get(j));
                }
            }
            if (list5.size() == 1) {
                return new lIlIlIIIllIIllIIIllI((Field)list5.get(0));
            }
        }
        catch (Exception ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(String.valueOf(ex.getClass().getName()) + " " + ex.getMessage());
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error finding Chunk.hasEntities");
        return new lIlIlIIIllIIllIIIllI(new llIIlIIIlIIIllIlIIIl(llllIIIIlIIIlIlllIll.class), "hasEntities");
    }
}
