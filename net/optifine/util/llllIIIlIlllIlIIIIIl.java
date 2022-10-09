package net.optifine.util;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class llllIIIlIlllIlIIIIIl
{
    private Object[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public llllIIIlIlllIlIIIIIl(final Object[] array) {
        this.IlIlIlIlIlllllllllIl = 0;
        this.llllIIIIlIIIlIlllIll = array.clone();
    }
    
    public llllIIIlIlllIlIIIIIl(final Object o, final Object o2) {
        this(new Object[] { o, o2 });
    }
    
    public llllIIIlIlllIlIIIIIl(final Object o, final Object o2, final Object o3) {
        this(new Object[] { o, o2, o3 });
    }
    
    @Override
    public int hashCode() {
        if (this.IlIlIlIlIlllllllllIl == 0) {
            this.IlIlIlIlIlllllllllIl = 7;
            for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
                final Object o = this.llllIIIIlIIIlIlllIll[i];
                if (o != null) {
                    this.IlIlIlIlIlllllllllIl = 31 * this.IlIlIlIlIlllllllllIl + o.hashCode();
                }
            }
        }
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof llllIIIlIlllIlIIIIIl)) {
            return false;
        }
        final Object[] ilIlIlIlIlllllllllIl = ((llllIIIlIlllIlIIIIIl)o).IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl.length != this.llllIIIIlIIIlIlllIll.length) {
            return false;
        }
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (!llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[i], ilIlIlIlIlllllllllIl[i])) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final Object o, final Object o2) {
        return o == o2 || (o != null && o2 != null && o.equals(o2));
    }
    
    private Object[] IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public Object[] llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.clone();
    }
    
    @Override
    public String toString() {
        return "[" + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll) + "]";
    }
}
