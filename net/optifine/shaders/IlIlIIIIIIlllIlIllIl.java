package net.optifine.shaders;

import java.util.*;

public class IlIlIIIIIIlllIlIllIl
{
    private List llllIIIIlIIIlIlllIll;
    private IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl;
    
    public IlIlIIIIIIlllIlIllIl() {
        this.llllIIIIlIIIlIlllIll = new ArrayList();
        this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll("", lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll, true);
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll(final String s, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2 = new IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll.size(), s, lllIIIIlllllIlIIllIl, ilIllIlIlIIIlIlIlIII);
        this.llllIIIIlIIIlIlllIll.add(ilIllIlIlIIIlIlIlIII2);
        return ilIllIlIlIIIlIlIlIII2;
    }
    
    private IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll(final String s, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final boolean b) {
        final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = new IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll.size(), s, lllIIIIlllllIlIIllIl, b);
        this.llllIIIIlIIIlIlllIll.add(ilIllIlIlIIIlIlIlIII);
        return ilIllIlIlIIIlIlIlIII;
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll(final String s, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        return this.llllIIIIlIIIlIlllIll(s, lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI, ilIllIlIlIIIlIlIlIII);
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll(final String s) {
        return this.llllIIIIlIIIlIlllIll(s, lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI, this.IlIlIlIlIlllllllllIl);
    }
    
    public IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl(final String s) {
        return this.llllIIIIlIIIlIlllIll(s, lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl, this.IlIlIlIlIlllllllllIl);
    }
    
    public IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl(final String s, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        return this.llllIIIIlIIIlIlllIll(s, lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl, ilIllIlIlIIIlIlIlIII);
    }
    
    public IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI(final String s) {
        return this.llllIIIIlIIIlIlllIll(s, lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll, true);
    }
    
    public IlIllIlIlIIIlIlIlIII[] llllIIIIlIIIlIlllIll(final String s, final int n) {
        final IlIllIlIlIIIlIlIlIII[] array = new IlIllIlIlIIIlIlIlIII[n];
        for (int i = 0; i < n; ++i) {
            array[i] = this.llllIIIIlIIIlIlllIll((i == 0) ? s : (String.valueOf(s) + i));
        }
        return array;
    }
    
    public IlIllIlIlIIIlIlIlIII[] IlIlIlIlIlllllllllIl(final String s, final int n) {
        final IlIllIlIlIIIlIlIlIII[] array = new IlIllIlIlIIIlIlIlIII[n];
        for (int i = 0; i < n; ++i) {
            array[i] = this.IlIlIlIlIlllllllllIl((i == 0) ? s : (String.valueOf(s) + i));
        }
        return array;
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll.size();
    }
    
    public IlIllIlIlIIIlIlIlIII IlIIIlIlIIIllIlIlIIl(final String s) {
        if (s == null) {
            return null;
        }
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.size(); ++i) {
            final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = this.llllIIIIlIIIlIlllIll.get(i);
            if (ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI().equals(s)) {
                return ilIllIlIlIIIlIlIlIII;
            }
        }
        return null;
    }
    
    public String[] llIllIIIIIllIlIIIIlI() {
        final String[] array = new String[this.llllIIIIlIIIlIlllIll.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = ((IlIllIlIlIIIlIlIlIII)this.llllIIIIlIIIlIlllIll.get(i)).IlIlIIIllIllIIIIIllI();
        }
        return array;
    }
    
    public IlIllIlIlIIIlIlIlIII[] IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll.toArray(new IlIllIlIlIIIlIlIlIII[this.llllIIIIlIIIlIlllIll.size()]);
    }
    
    public IlIllIlIlIIIlIlIlIII[] llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2) {
        int ilIIIlIlIIIllIlIlIIl = ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl();
        int ilIIIlIlIIIllIlIlIIl2 = ilIllIlIlIIIlIlIlIII2.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl > ilIIIlIlIIIllIlIlIIl2) {
            final int n = ilIIIlIlIIIllIlIlIIl;
            ilIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
            ilIIIlIlIIIllIlIlIIl2 = n;
        }
        final IlIllIlIlIIIlIlIlIII[] array = new IlIllIlIlIIIlIlIlIII[ilIIIlIlIIIllIlIlIIl2 - ilIIIlIlIIIllIlIlIIl + 1];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (IlIllIlIlIIIlIlIlIII)this.llllIIIIlIIIlIlllIll.get(ilIIIlIlIIIllIlIlIIl + i);
        }
        return array;
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll.toString();
    }
}
