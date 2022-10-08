package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IIIlIIIlIlIIlllIIlll extends IIIIIIIIIlllIllIlIlI implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 4643134103185764459L;
    
    public IIIlIIIlIlIIlllIIlll(final float n, final float n2, final float n3, final float n4) {
        super(n, n2, n3, n4);
    }
    
    public IIIlIIIlIlIIlllIIlll(final float[] array) {
        super(array);
    }
    
    public IIIlIIIlIlIIlllIIlll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        super(iiIlIIIlIlIIlllIIlll);
    }
    
    public IIIlIIIlIlIIlllIIlll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        super(illIIllIIIlIlIIIIlI);
    }
    
    public IIIlIIIlIlIIlllIIlll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        super(iiiiiiiiIlllIllIlIlI);
    }
    
    public IIIlIIIlIlIIlllIIlll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        super(iiiiIllIIIIlIIIIllIl);
    }
    
    public IIIlIIIlIlIIlllIIlll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI, llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl, llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI, 1.0f);
    }
    
    public IIIlIIIlIlIIlllIIlll() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        this.lIIIlllIIIllIIIllIII = 1.0f;
    }
    
    public final float llllIIIIlIIIlIlllIll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        final float n = this.IllIIlllIIIIlllIIlIl - iiIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl;
        final float n2 = this.llllIIIlIlllIlIIIIIl - iiIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl;
        final float n3 = this.lIIIIlIIIIIlllIllIII - iiIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII;
        final float n4 = this.lIIIlllIIIllIIIllIII - iiIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII;
        return n * n + n2 * n2 + n3 * n3 + n4 * n4;
    }
    
    public final float IlIlIlIlIlllllllllIl(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        final float n = this.IllIIlllIIIIlllIIlIl - iiIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl;
        final float n2 = this.llllIIIlIlllIlIIIIIl - iiIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl;
        final float n3 = this.lIIIIlIIIIIlllIllIII - iiIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII;
        final float n4 = this.lIIIlllIIIllIIIllIII - iiIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII;
        return (float)Math.sqrt(n * n + n2 * n2 + n3 * n3 + n4 * n4);
    }
    
    public final float llIllIIIIIllIlIIIIlI(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        return Math.abs(this.IllIIlllIIIIlllIIlIl - iiIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl) + Math.abs(this.llllIIIlIlllIlIIIIIl - iiIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl) + Math.abs(this.lIIIIlIIIIIlllIllIII - iiIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII) + Math.abs(this.lIIIlllIIIllIIIllIII - iiIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII);
    }
    
    public final float IlIIIlIlIIIllIlIlIIl(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        return Math.max(Math.max(Math.abs(this.IllIIlllIIIIlllIIlIl - iiIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl), Math.abs(this.llllIIIlIlllIlIIIIIl - iiIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl)), Math.max(Math.abs(this.lIIIIlIIIIIlllIllIII - iiIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII), Math.abs(this.lIIIlllIIIllIIIllIII - iiIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII)));
    }
    
    public final void IlIlIIIllIllIIIIIllI(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        final float n = 1.0f / iiIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = iiIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl * n;
        this.llllIIIlIlllIlIIIIIl = iiIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl * n;
        this.lIIIIlIIIIIlllIllIII = iiIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII * n;
        this.lIIIlllIIIllIIIllIII = 1.0f;
    }
}
