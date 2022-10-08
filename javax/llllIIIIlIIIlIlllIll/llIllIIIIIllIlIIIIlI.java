package javax.llllIIIIlIIIlIlllIll;

import java.io.*;
import java.awt.*;

public class llIllIIIIIllIlIIIIlI extends IIlllIIIlIlllIIlllII implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 6632576088353444794L;
    
    public llIllIIIIIllIlIIIIlI(final byte b, final byte b2, final byte b3) {
        super(b, b2, b3);
    }
    
    public llIllIIIIIllIlIIIIlI(final byte[] array) {
        super(array);
    }
    
    public llIllIIIIIllIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super(llIllIIIIIllIlIIIIlI);
    }
    
    public llIllIIIIIllIlIIIIlI(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        super(illlIIIlIlllIIlllII);
    }
    
    public llIllIIIIIllIlIIIIlI(final Color color) {
        super((byte)color.getRed(), (byte)color.getGreen(), (byte)color.getBlue());
    }
    
    public llIllIIIIIllIlIIIIlI() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final Color color) {
        this.llIllIIIIIllIlIIIIlI = (byte)color.getRed();
        this.IlIIIlIlIIIllIlIlIIl = (byte)color.getGreen();
        this.IlIlIIIllIllIIIIIllI = (byte)color.getBlue();
    }
    
    public final Color llllIIIIlIIIlIlllIll() {
        return new Color(this.llIllIIIIIllIlIIIIlI & 0xFF, this.IlIIIlIlIIIllIlIlIIl & 0xFF, this.IlIlIIIllIllIIIIIllI & 0xFF);
    }
}
