package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class llIlIIIIIlIIlIlIIlll extends IIIIIIIIIlllIllIlIlI implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 8749319902347760659L;
    
    public llIlIIIIIlIIlIlIIlll(final float n, final float n2, final float n3, final float n4) {
        super(n, n2, n3, n4);
    }
    
    public llIlIIIIIlIIlIlIIlll(final float[] array) {
        super(array);
    }
    
    public llIlIIIIIlIIlIlIIlll(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        super(llIlIIIIIlIIlIlIIlll);
    }
    
    public llIlIIIIIlIIlIlIIlll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        super(illIllIlllIllllIIllI);
    }
    
    public llIlIIIIIlIIlIlIIlll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        super(iiiiiiiiIlllIllIlIlI);
    }
    
    public llIlIIIIIlIIlIlIIlll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        super(iiiiIllIIIIlIIIIllIl);
    }
    
    public llIlIIIIIlIIlIlIIlll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI, llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl, llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI, 0.0f);
    }
    
    public llIlIIIIIlIIlIlIIlll() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        this.lIIIlllIIIllIIIllIII = 0.0f;
    }
    
    public final float llllIIIIlIIIlIlllIll() {
        return (float)Math.sqrt(this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII);
    }
    
    public final float IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII;
    }
    
    public final float llllIIIIlIIIlIlllIll(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        return this.IllIIlllIIIIlllIIlIl * llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        final float n = (float)(1.0 / Math.sqrt(llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl * llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl + llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl * llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl + llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII * llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII + llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII * llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII));
        this.IllIIlllIIIIlllIIlIl = llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl * n;
        this.llllIIIlIlllIlIIIIIl = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl * n;
        this.lIIIIlIIIIIlllIllIII = llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII * n;
        this.lIIIlllIIIllIIIllIII = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII * n;
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        final float n = (float)(1.0 / Math.sqrt(this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII));
        this.IllIIlllIIIIlllIIlIl *= n;
        this.llllIIIlIlllIlIIIIIl *= n;
        this.lIIIIlIIIIIlllIllIII *= n;
        this.lIIIlllIIIllIIIllIII *= n;
    }
    
    public final float llIllIIIIIllIlIIIIlI(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        double n = this.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll) / (this.llllIIIIlIIIlIlllIll() * llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll());
        if (n < -1.0) {
            n = -1.0;
        }
        if (n > 1.0) {
            n = 1.0;
        }
        return (float)Math.acos(n);
    }
}
