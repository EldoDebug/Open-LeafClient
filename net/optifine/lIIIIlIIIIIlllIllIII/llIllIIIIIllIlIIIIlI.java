package net.optifine.lIIIIlIIIIIlllIllIII;

import java.lang.reflect.*;
import net.optifine.*;

public class llIllIIIIIllIlIIIIlI implements IllIIlllIIIIlllIIlIl
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    
    public llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public Field llllIIIIlIIIlIlllIll() {
        final Class ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl == null) {
            return null;
        }
        try {
            final Field llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl);
            llllIIIIlIIIlIlllIll.setAccessible(true);
            return llllIIIIlIIIlIlllIll;
        }
        catch (NoSuchFieldException ex2) {
            IIlIIIlllIllIllIlIII.IlIlIIIllIllIIIIIllI("(Reflector) Field not present: " + ilIlIlIlIlllllllllIl.getName() + "." + this.IlIlIlIlIlllllllllIl);
            return null;
        }
        catch (SecurityException ex) {
            ex.printStackTrace();
            return null;
        }
        catch (Throwable t) {
            t.printStackTrace();
            return null;
        }
    }
    
    private Field llllIIIIlIIIlIlllIll(final Class clazz, final String s) {
        final Field[] declaredFields = clazz.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; ++i) {
            final Field field = declaredFields[i];
            if (field.getName().equals(s)) {
                return field;
            }
        }
        if (clazz == Object.class) {
            throw new NoSuchFieldException(s);
        }
        return this.llllIIIIlIIIlIlllIll(clazz.getSuperclass(), s);
    }
}
