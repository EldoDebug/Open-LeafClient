package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class lllIIIIlllllIlIIllIl extends llllllIllIllIlIllllI implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = -8689337816398030143L;
    
    public lllIIIIlllllIlIIllIl(final float n, final float n2, final float n3) {
        super(n, n2, n3);
    }
    
    public lllIIIIlllllIlIIllIl(final float[] array) {
        super(array);
    }
    
    public lllIIIIlllllIlIIllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        super(lllIIIIlllllIlIIllIl);
    }
    
    public lllIIIIlllllIlIIllIl(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        super(illlIIlIllIllIlIIll);
    }
    
    public lllIIIIlllllIlIIllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super(llllllIllIllIlIllllI);
    }
    
    public lllIIIIlllllIlIIllIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        super(ilIIIIIllIlIIIlIIll);
    }
    
    public lllIIIIlllllIlIIllIl() {
    }
    
    public final float llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final float n = this.llIllIIIIIllIlIIIIlI - lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI;
        final float n2 = this.IlIIIlIlIIIllIlIlIIl - lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl;
        final float n3 = this.IlIlIIIllIllIIIIIllI - lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public final float IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final float n = this.llIllIIIIIllIlIIIIlI - lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI;
        final float n2 = this.IlIIIlIlIIIllIlIlIIl - lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl;
        final float n3 = this.IlIlIIIllIllIIIIIllI - lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI;
        return (float)Math.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    public final float llIllIIIIIllIlIIIIlI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return Math.abs(this.llIllIIIIIllIlIIIIlI - lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI) + Math.abs(this.IlIIIlIlIIIllIlIlIIl - lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl) + Math.abs(this.IlIlIIIllIllIIIIIllI - lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI);
    }
    
    public final float IlIIIlIlIIIllIlIlIIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return Math.max(Math.max(Math.abs(this.llIllIIIIIllIlIIIIlI - lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI), Math.abs(this.IlIIIlIlIIIllIlIlIIl - lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl)), Math.abs(this.IlIlIIIllIllIIIIIllI - lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI));
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        final float n = 1.0f / iiIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII;
        this.llIllIIIIIllIlIIIIlI = iiIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl * n;
        this.IlIIIlIlIIIllIlIlIIl = iiIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl * n;
        this.IlIlIIIllIllIIIIIllI = iiIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII * n;
    }
}
