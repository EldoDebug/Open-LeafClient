package net.optifine.lIIIIlIIIIIlllIllIII;

import java.lang.reflect.*;
import net.optifine.util.*;
import net.optifine.*;

public class llIllIlIIIIllIlIIllI implements llllIIIlIlllIlIIIIIl
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private Class[] IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    private Constructor IlIIIlIlIIIllIlIlIIl;
    
    public llIllIlIIIIllIlIIllI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final Class[] ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = false;
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public Constructor IlIlIlIlIlllllllllIl() {
        if (this.llIllIIIIIllIlIIIIlI) {
            return this.IlIIIlIlIIIllIlIlIIl;
        }
        this.llIllIIIIIllIlIIIIlI = true;
        final Class ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl == null) {
            return null;
        }
        try {
            this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl);
            if (this.IlIIIlIlIIIllIlIlIIl == null) {
                IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl("(Reflector) Constructor not present: " + ilIlIlIlIlllllllllIl.getName() + ", params: " + net.optifine.util.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl));
            }
            if (this.IlIIIlIlIIIllIlIlIIl != null) {
                this.IlIIIlIlIIIllIlIlIIl.setAccessible(true);
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    private static Constructor llllIIIIlIIIlIlllIll(final Class clazz, final Class[] array) {
        final Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; ++i) {
            final Constructor constructor = declaredConstructors[i];
            if (lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(array, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI ? (this.IlIIIlIlIIIllIlIlIIl != null) : (this.IlIlIlIlIlllllllllIl() != null);
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llIllIIIIIllIlIIIIlI = true;
        this.IlIIIlIlIIIllIlIlIIl = null;
    }
    
    public Object llllIIIIlIIIlIlllIll(final Object... array) {
        return lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(this, array);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl();
    }
}
