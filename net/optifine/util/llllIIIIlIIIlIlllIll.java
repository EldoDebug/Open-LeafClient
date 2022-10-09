package net.optifine.util;

import java.util.*;
import java.lang.reflect.*;

public class llllIIIIlIIIlIlllIll
{
    private Class llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private ArrayDeque llIllIIIIIllIlIIIIlI;
    
    public llllIIIIlIIIlIlllIll(final Class llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = new ArrayDeque();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public synchronized Object llllIIIIlIIIlIlllIll(final int n) {
        Object o = this.llIllIIIIIllIlIIIIlI.pollLast();
        if (o == null || Array.getLength(o) < n) {
            o = Array.newInstance(this.llllIIIIlIIIlIlllIll, n);
        }
        return o;
    }
    
    public synchronized void llllIIIIlIIIlIlllIll(final Object o) {
        if (o != null) {
            if (o.getClass().getComponentType() != this.llllIIIIlIIIlIlllIll) {
                throw new IllegalArgumentException("Wrong component type");
            }
            if (this.llIllIIIIIllIlIIIIlI.size() < this.IlIlIlIlIlllllllllIl) {
                this.llIllIIIIIllIlIIIIlI.add(o);
            }
        }
    }
}
