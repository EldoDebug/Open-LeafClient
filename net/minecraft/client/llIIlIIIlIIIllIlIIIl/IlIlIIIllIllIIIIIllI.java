package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;

class IlIlIIIllIllIIIIIllI extends InputStream
{
    private final InputStream llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIllIllIIIIIllI(final InputStream llllIIIIlIIIlIlllIll, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final String s) {
        this.llIllIIIIIllIlIIIIlI = false;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        this.IlIlIlIlIlllllllllIl = "Leaked resource: '" + lIllllIllIllIIllllll + "' loaded from pack: '" + s + "'\n" + byteArrayOutputStream.toString();
    }
    
    @Override
    public void close() {
        this.llllIIIIlIIIlIlllIll.close();
        this.llIllIIIIIllIlIIIIlI = true;
    }
    
    @Override
    protected void finalize() {
        if (!this.llIllIIIIIllIlIIIIlI) {
            IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.warn(this.IlIlIlIlIlllllllllIl);
        }
        super.finalize();
    }
    
    @Override
    public int read() {
        return this.llllIIIIlIIIlIlllIll.read();
    }
}
