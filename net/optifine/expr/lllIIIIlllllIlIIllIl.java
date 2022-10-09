package net.optifine.expr;

import java.util.*;

public class lllIIIIlllllIlIIllIl implements IlIllIlIlIIIlIlIlIII
{
    private IlIlIIIllIllIIIIIllI[] llllIIIIlIIIlIlllIll;
    private IlIlIIIllIllIIIIIllI[] IlIlIlIlIlllllllllIl;
    private IlIlIIIllIllIIIIIllI[] llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private static final IlIlIIIllIllIIIIIllI[] IlIlIIIllIllIIIIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = new IlIlIIIllIllIIIIIllI[0];
    }
    
    public lllIIIIlllllIlIIllIl() {
        this(null, null, null);
    }
    
    public lllIIIIlllllIlIIllIl(final IlIlIIIllIllIIIIIllI[] array, final IlIlIIIllIllIIIIIllI[] array2, final IlIlIIIllIllIIIIIllI[] array3) {
        this(array, array2, array3, Integer.MAX_VALUE);
    }
    
    public lllIIIIlllllIlIIllIl(final IlIlIIIllIllIIIIIllI[] array, final IlIlIIIllIllIIIIIllI[] array2, final IlIlIIIllIllIIIIIllI[] array3, final int ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = Integer.MAX_VALUE;
        this.llllIIIIlIIIlIlllIll = IlIIIlIlIIIllIlIlIIl(array);
        this.IlIlIlIlIlllllllllIl = IlIIIlIlIIIllIlIlIIl(array2);
        this.llIllIIIIIllIlIIIIlI = IlIIIlIlIIIllIlIlIIl(array3);
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    private static IlIlIIIllIllIIIIIllI[] IlIIIlIlIIIllIlIlIIl(final IlIlIIIllIllIIIIIllI[] array) {
        return (array == null) ? lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI : array;
    }
    
    public IlIlIIIllIllIIIIIllI[] llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIIIllIllIIIIIllI[] IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public IlIlIIIllIllIIIIIllI[] llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return (this.llllIIIIlIIIlIlllIll == null) ? 0 : this.llllIIIIlIIIlIlllIll.length;
    }
    
    @Override
    public IlIlIIIllIllIIIIIllI[] llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl[] array) {
        final int n = this.llllIIIIlIIIlIlllIll.length + this.llIllIIIIIllIlIIIIlI.length;
        final int n2 = array.length - n;
        int n3 = 0;
        for (int n4 = 0; n4 + this.IlIlIlIlIlllllllllIl.length <= n2 && n + n4 + this.IlIlIlIlIlllllllllIl.length <= this.IlIIIlIlIIIllIlIlIIl; n4 += this.IlIlIlIlIlllllllllIl.length) {
            ++n3;
        }
        final ArrayList list = new ArrayList();
        list.addAll(Arrays.asList(this.llllIIIIlIIIlIlllIll));
        for (int i = 0; i < n3; ++i) {
            list.addAll(Arrays.asList(this.IlIlIlIlIlllllllllIl));
        }
        list.addAll(Arrays.asList(this.llIllIIIIIllIlIIIIlI));
        return (IlIlIIIllIllIIIIIllI[])list.toArray(new IlIlIIIllIllIIIIIllI[list.size()]);
    }
    
    public lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI... array) {
        return new lllIIIIlllllIlIIllIl(array, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI);
    }
    
    public lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI... array) {
        return new lllIIIIlllllIlIIllIl(this.llllIIIIlIIIlIlllIll, array, this.llIllIIIIIllIlIIIIlI);
    }
    
    public lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI(final IlIlIIIllIllIIIIIllI... array) {
        return new lllIIIIlllllIlIIllIl(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, array);
    }
    
    public lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll(final int n) {
        return new lllIIIIlllllIlIIllIl(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, n);
    }
}
