package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class llllIIllllIlIlIIIIll extends lIllllllIIllIlIlIlII implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = -4801347926528714435L;
    
    public llllIIllllIlIlIIIIll(final float n, final float n2) {
        super(n, n2);
    }
    
    public llllIIllllIlIlIIIIll(final float[] array) {
        super(array);
    }
    
    public llllIIllllIlIlIIIIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        super(llllIIllllIlIlIIIIll);
    }
    
    public llllIIllllIlIlIIIIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super(iiiIlllIIIIIIlIIIlll);
    }
    
    public llllIIllllIlIlIIIIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        super(lllllIlIIIlIlIIlllII);
    }
    
    public llllIIllllIlIlIIIIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super(lIllllllIIllIlIlIlII);
    }
    
    public llllIIllllIlIlIIIIll() {
    }
    
    public final float llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        final float n = this.llIllIIIIIllIlIIIIlI - llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI;
        final float n2 = this.IlIIIlIlIIIllIlIlIIl - llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl;
        return n * n + n2 * n2;
    }
    
    public final float IlIlIlIlIlllllllllIl(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        final float n = this.llIllIIIIIllIlIIIIlI - llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI;
        final float n2 = this.IlIIIlIlIIIllIlIlIIl - llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl;
        return (float)Math.sqrt(n * n + n2 * n2);
    }
    
    public final float llIllIIIIIllIlIIIIlI(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        return Math.abs(this.llIllIIIIIllIlIIIIlI - llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI) + Math.abs(this.IlIIIlIlIIIllIlIlIIl - llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl);
    }
    
    public final float IlIIIlIlIIIllIlIlIIl(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        return Math.max(Math.abs(this.llIllIIIIIllIlIIIIlI - llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI), Math.abs(this.IlIIIlIlIIIllIlIlIIl - llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl));
    }
}
