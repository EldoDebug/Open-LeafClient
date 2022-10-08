package javax.llllIIIIlIIIlIlllIll;

import java.io.*;
import java.awt.*;

public class IllIIlllIIIIlllIIlIl extends IIIIIIIIIlllIllIlIlI implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 8577680141580006740L;
    
    public IllIIlllIIIIlllIIlIl(final float n, final float n2, final float n3, final float n4) {
        super(n, n2, n3, n4);
    }
    
    public IllIIlllIIIIlllIIlIl(final float[] array) {
        super(array);
    }
    
    public IllIIlllIIIIlllIIlIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        super(illIIlllIIIIlllIIlIl);
    }
    
    public IllIIlllIIIIlllIIlIl(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        super(iiiiiiiiIlllIllIlIlI);
    }
    
    public IllIIlllIIIIlllIIlIl(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        super(iiiiIllIIIIlIIIIllIl);
    }
    
    public IllIIlllIIIIlllIIlIl(final Color color) {
        super(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / 255.0f);
    }
    
    public IllIIlllIIIIlllIIlIl() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final Color color) {
        this.IllIIlllIIIIlllIIlIl = color.getRed() / 255.0f;
        this.llllIIIlIlllIlIIIIIl = color.getGreen() / 255.0f;
        this.lIIIIlIIIIIlllIllIII = color.getBlue() / 255.0f;
        this.lIIIlllIIIllIIIllIII = color.getAlpha() / 255.0f;
    }
    
    public final Color llllIIIIlIIIlIlllIll() {
        return new Color(Math.round(this.IllIIlllIIIIlllIIlIl * 255.0f), Math.round(this.llllIIIlIlllIlIIIIIl * 255.0f), Math.round(this.lIIIIlIIIIIlllIllIII * 255.0f), Math.round(this.lIIIlllIIIllIIIllIII * 255.0f));
    }
}
