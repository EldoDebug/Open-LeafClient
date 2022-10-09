package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import java.util.*;

public class IlIlIllllllllIIIIlII
{
    private String llllIIIIlIIIlIlllIll;
    private Map IlIlIlIlIlllllllllIl;
    private Set llIllIIIIIllIlIIIIlI;
    
    public IlIlIllllllllIIIIlII(final String llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = new LinkedHashMap();
        this.llIllIIIIIllIlIIIIlI = new LinkedHashSet();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        this.IlIlIlIlIlllllllllIl.put(s, s2);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        if (ilIlIllllllllIIIIlII != null) {
            this.IlIlIlIlIlllllllllIl.putAll(ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll[] array) {
        for (int i = 0; i < array.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = array[i];
            final String s = this.IlIlIlIlIlllllllllIl.get(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll());
            if (s != null) {
                iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(s);
            }
        }
    }
    
    public String[] IlIlIlIlIlllllllllIl() {
        final Set keySet = this.IlIlIlIlIlllllllllIl.keySet();
        return (String[])keySet.toArray(new String[keySet.size()]);
    }
    
    public String llllIIIIlIIIlIlllIll(final String s) {
        return this.IlIlIlIlIlllllllllIl.get(s);
    }
    
    public void IlIlIlIlIlllllllllIl(final String s) {
        this.llIllIIIIIllIlIIIIlI.add(s);
    }
    
    public void llIllIIIIIllIlIIIIlI(final String s) {
        this.llIllIIIIIllIlIIIIlI.remove(s);
    }
    
    public Collection llIllIIIIIllIlIIIIlI() {
        return new LinkedHashSet(this.llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final Collection collection) {
        this.llIllIIIIIllIlIIIIlI.addAll(collection);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final String s) {
        return this.llIllIIIIIllIlIIIIlI.contains(s);
    }
}
