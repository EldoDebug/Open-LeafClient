package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;

public abstract class lIIIIlIIIIIlllIllIII
{
    private Class llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private String[] IlIIIlIlIIIllIlIlIIl;
    
    public lIIIIlIIIIIlllIllIII(final Class llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public lIIIIlIIIIIlllIllIII(final Class llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI, final String[] ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public Class llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public String[] llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public abstract IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI();
    
    public abstract IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl p0, final String p1);
    
    public abstract String[] IllIIlllIIIIlllIIlIl();
    
    public abstract llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl p0, final float p1);
    
    public IIlIIIIIllIlIIIlIIll[] llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final String[] illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl();
        final ArrayList<IIlIIIIIllIlIIIlIIll> list = new ArrayList<IIlIIIIIllIlIIIlIIll>();
        for (int i = 0; i < illIIlllIIIIlllIIlIl.length; ++i) {
            final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, illIIlllIIIIlllIIlIl[i]);
            if (llllIIIIlIIIlIlllIll != null) {
                list.add(llllIIIIlIIIlIlllIll);
            }
        }
        return list.toArray(new IIlIIIIIllIlIIIlIIll[list.size()]);
    }
}
