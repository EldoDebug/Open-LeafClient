package javax.llllIIIIlIIIlIlllIll;

import java.io.*;
import java.awt.*;

public class IlIlIIIllIllIIIIIllI extends IlIIIlIIIllllIlIlIlI implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = -105080578052502155L;
    
    public IlIlIIIllIllIIIIIllI(final byte b, final byte b2, final byte b3, final byte b4) {
        super(b, b2, b3, b4);
    }
    
    public IlIlIIIllIllIIIIIllI(final byte[] array) {
        super(array);
    }
    
    public IlIlIIIllIllIIIIIllI(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        super(ilIlIIIllIllIIIIIllI);
    }
    
    public IlIlIIIllIllIIIIIllI(final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI) {
        super(ilIIIlIIIllllIlIlIlI);
    }
    
    public IlIlIIIllIllIIIIIllI(final Color color) {
        super((byte)color.getRed(), (byte)color.getGreen(), (byte)color.getBlue(), (byte)color.getAlpha());
    }
    
    public IlIlIIIllIllIIIIIllI() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final Color color) {
        this.llIllIIIIIllIlIIIIlI = (byte)color.getRed();
        this.IlIIIlIlIIIllIlIlIIl = (byte)color.getGreen();
        this.IlIlIIIllIllIIIIIllI = (byte)color.getBlue();
        this.IllIIlllIIIIlllIIlIl = (byte)color.getAlpha();
    }
    
    public final Color llllIIIIlIIIlIlllIll() {
        return new Color(this.llIllIIIIIllIlIIIIlI & 0xFF, this.IlIIIlIlIIIllIlIlIIl & 0xFF, this.IlIlIIIllIllIIIIIllI & 0xFF, this.IllIIlllIIIIlllIIlIl & 0xFF);
    }
}
