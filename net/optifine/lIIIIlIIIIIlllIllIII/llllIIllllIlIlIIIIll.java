package net.optifine.lIIIIlIIIIIlllIllIII;

import java.lang.reflect.*;
import net.optifine.*;
import java.util.*;

public class llllIIllllIlIlIIIIll implements llllIIIlIlllIlIIIIIl
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private Class[] llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private Method IlIlIIIllIllIIIIIllI;
    
    public llllIIllllIlIlIIIIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final String s) {
        this(llIIlIIIlIIIllIlIIIl, s, null);
    }
    
    public llllIIllllIlIlIIIIll(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final Class[] llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.IlIlIIIllIllIIIIIllI = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public Method IlIlIlIlIlllllllllIl() {
        if (this.IlIIIlIlIIIllIlIlIIl) {
            return this.IlIlIIIllIllIIIIIllI;
        }
        this.IlIIIlIlIIIllIlIlIIl = true;
        final Class ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl == null) {
            return null;
        }
        try {
            if (this.llIllIIIIIllIlIIIIlI == null) {
                final Method[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl);
                if (llllIIIIlIIIlIlllIll.length <= 0) {
                    IIlIIIlllIllIllIlIII.IlIlIIIllIllIIIIIllI("(Reflector) Method not present: " + ilIlIlIlIlllllllllIl.getName() + "." + this.IlIlIlIlIlllllllllIl);
                    return null;
                }
                if (llllIIIIlIIIlIlllIll.length > 1) {
                    IIlIIIlllIllIllIlIII.llIllIIIIIllIlIIIIlI("(Reflector) More than one method found: " + ilIlIlIlIlllllllllIl.getName() + "." + this.IlIlIlIlIlllllllllIl);
                    for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
                        IIlIIIlllIllIllIlIII.llIllIIIIIllIlIIIIlI("(Reflector)  - " + llllIIIIlIIIlIlllIll[i]);
                    }
                    return null;
                }
                this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll[0];
            }
            else {
                this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI);
            }
            if (this.IlIlIIIllIllIIIIIllI == null) {
                IIlIIIlllIllIllIlIII.IlIlIIIllIllIIIIIllI("(Reflector) Method not present: " + ilIlIlIlIlllllllllIl.getName() + "." + this.IlIlIlIlIlllllllllIl);
                return null;
            }
            this.IlIlIIIllIllIIIIIllI.setAccessible(true);
            return this.IlIlIIIllIllIIIIIllI;
        }
        catch (Throwable t) {
            t.printStackTrace();
            return null;
        }
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl ? (this.IlIlIIIllIllIIIIIllI != null) : (this.IlIlIlIlIlllllllllIl() != null);
    }
    
    public Class IlIIIlIlIIIllIlIlIIl() {
        final Method ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
        return (ilIlIlIlIlllllllllIl == null) ? null : ilIlIlIlIlllllllllIl.getReturnType();
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IlIlIIIllIllIIIIIllI = null;
    }
    
    public Object llllIIIIlIIIlIlllIll(final Object... array) {
        return lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(this, array);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final Object... array) {
        return lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(this, array);
    }
    
    public int llIllIIIIIllIlIIIIlI(final Object... array) {
        return lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(this, array);
    }
    
    public float IlIIIlIlIIIllIlIlIIl(final Object... array) {
        return lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(this, array);
    }
    
    public double IlIlIIIllIllIIIIIllI(final Object... array) {
        return lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(this, array);
    }
    
    public String IllIIlllIIIIlllIIlIl(final Object... array) {
        return lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl(this, array);
    }
    
    public Object llllIIIIlIIIlIlllIll(final Object o) {
        return lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(this, o);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final Object o) {
        return lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(this, o);
    }
    
    public int llIllIIIIIllIlIIIIlI(final Object o) {
        return lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(this, o);
    }
    
    public float IlIIIlIlIIIllIlIlIIl(final Object o) {
        return lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(this, o);
    }
    
    public double IlIlIIIllIllIIIIIllI(final Object o) {
        return lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(this, o);
    }
    
    public String IllIIlllIIIIlllIIlIl(final Object o) {
        return lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl(this, o);
    }
    
    public void llllIIIlIlllIlIIIIIl(final Object... array) {
        lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this, array);
    }
    
    public static Method llllIIIIlIIIlIlllIll(final Class clazz, final String s, final Class[] array) {
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; ++i) {
            final Method method = declaredMethods[i];
            if (method.getName().equals(s) && lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(array, method.getParameterTypes())) {
                return method;
            }
        }
        return null;
    }
    
    public static Method[] llllIIIIlIIIlIlllIll(final Class clazz, final String s) {
        final ArrayList<Method> list = new ArrayList<Method>();
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; ++i) {
            final Method method = declaredMethods[i];
            if (method.getName().equals(s)) {
                list.add(method);
            }
        }
        return list.toArray(new Method[list.size()]);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl();
    }
}
