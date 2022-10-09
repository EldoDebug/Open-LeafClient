package net.optifine.lIIIIlIIIIIlllIllIII;

import java.lang.reflect.*;
import net.optifine.*;

public class IlIIIlIlIIIllIlIlIIl implements IllIIlllIIIIlllIIlIl
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private Class IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Class clazz) {
        this(llIIlIIIlIIIllIlIIIl, clazz, 0);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final Class ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public Field llllIIIIlIIIlIlllIll() {
        final Class ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl == null) {
            return null;
        }
        try {
            final Field[] declaredFields = ilIlIlIlIlllllllllIl.getDeclaredFields();
            int n = 0;
            for (int i = 0; i < declaredFields.length; ++i) {
                final Field field = declaredFields[i];
                if (field.getType() == this.IlIlIlIlIlllllllllIl) {
                    if (n == this.llIllIIIIIllIlIIIIlI) {
                        field.setAccessible(true);
                        return field;
                    }
                    ++n;
                }
            }
            IIlIIIlllIllIllIlIII.IlIlIIIllIllIIIIIllI("(Reflector) Field not present: " + ilIlIlIlIlllllllllIl.getName() + ".(type: " + this.IlIlIlIlIlllllllllIl + ", index: " + this.llIllIIIIIllIlIIIIlI + ")");
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
}
