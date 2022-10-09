package net.optifine.lIIIIlIIIIIlllIllIII;

import java.lang.reflect.*;
import java.util.*;
import net.optifine.*;

public class IlIlIIIllIllIIIIIllI implements IllIIlllIIIIlllIIlIl
{
    private Field llllIIIIlIIIlIlllIll;
    
    public IlIlIIIllIllIIIIIllI(final Class clazz, final Class[] array, final Class clazz2, final Class[] array2, final String s) {
        this.llllIIIIlIIIlIlllIll = null;
        final Field[] declaredFields = clazz.getDeclaredFields();
        final ArrayList<Object> list = new ArrayList<Object>();
        for (int i = 0; i < declaredFields.length; ++i) {
            list.add(declaredFields[i].getType());
        }
        final ArrayList<Object> list2 = new ArrayList<Object>();
        list2.addAll(Arrays.asList((Class[])array));
        list2.add(clazz2);
        list2.addAll(Arrays.asList((Class[])array2));
        final int indexOfSubList = Collections.indexOfSubList(list, list2);
        if (indexOfSubList < 0) {
            IIlIIIlllIllIllIlIII.IlIlIIIllIllIIIIIllI("(Reflector) Field not found: " + s);
        }
        else if (Collections.indexOfSubList(list.subList(indexOfSubList + 1, list.size()), list2) >= 0) {
            IIlIIIlllIllIllIlIII.IlIlIIIllIllIIIIIllI("(Reflector) More than one match found for field: " + s);
        }
        else {
            this.llllIIIIlIIIlIlllIll = declaredFields[indexOfSubList + array.length];
        }
    }
    
    @Override
    public Field llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
