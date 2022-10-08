package javax.llllIIIIlIIIlIlllIll;

import java.io.*;
import java.awt.*;

public class IlIIIlIlIIIllIlIlIIl extends llllllIllIllIlIllllI implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = -1861792981817493659L;
    
    public IlIIIlIlIIIllIlIlIIl(final float n, final float n2, final float n3) {
        super(n, n2, n3);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final float[] array) {
        super(array);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        super(ilIIIlIlIIIllIlIlIIl);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super(llllllIllIllIlIllllI);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        super(ilIIIIIllIlIIIlIIll);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final Color color) {
        super(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f);
    }
    
    public IlIIIlIlIIIllIlIlIIl() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final Color color) {
        this.llIllIIIIIllIlIIIIlI = color.getRed() / 255.0f;
        this.IlIIIlIlIIIllIlIlIIl = color.getGreen() / 255.0f;
        this.IlIlIIIllIllIIIIIllI = color.getBlue() / 255.0f;
    }
    
    public final Color llllIIIIlIIIlIlllIll() {
        return new Color(Math.round(this.llIllIIIIIllIlIIIIlI * 255.0f), Math.round(this.IlIIIlIlIIIllIlIlIIl * 255.0f), Math.round(this.IlIlIIIllIllIIIIIllI * 255.0f));
    }
}
