package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.logging.log4j.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import net.optifine.shaders.*;
import net.optifine.*;
import java.io.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.awt.image.*;

public class lIIIlllIIIllIIIllIII extends llllIIIIlIIIlIlllIll
{
    private static final Logger llllIIIIlIIIlIlllIll;
    protected final lIllllIllIllIIllllll lIIIlllIIIllIIIllIII;
    public lIllllIllIllIIllllll llIIlIIIlIIIllIlIIIl;
    public boolean llIllIlIIIIllIlIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public lIIIlllIIIllIIIllIII(final lIllllIllIllIIllllll liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IllIIlllIIIIlllIIlIl();
        InputStream ilIlIlIlIlllllllllIl = null;
        try {
            final lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
            ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            final BufferedImage llllIIIIlIIIlIlllIll2 = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            boolean llllIIIIlIIIlIlllIll3 = false;
            boolean ilIlIlIlIlllllllllIl2 = false;
            if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
                try {
                    final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = (llllIIllllIlIlIIIIll)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("texture");
                    if (llllIIllllIlIlIIIIll != null) {
                        llllIIIIlIIIlIlllIll3 = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll();
                        ilIlIlIlIlllllllllIl2 = llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl();
                    }
                }
                catch (RuntimeException ex) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.warn("Failed reading metadata of: " + this.lIIIlllIIIllIIIllIII, (Throwable)ex);
                }
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3, ilIlIlIlIlllllllllIl2, ilIlIIIllIIllIlllllI, this.lIIIlllIIIllIIIllIII, this.llllIIIlIlllIlIIIIIl());
            }
            else {
                IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3, ilIlIlIlIlllllllllIl2);
            }
            if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll()) {
                llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, this);
            }
        }
        finally {
            if (ilIlIlIlIlllllllllIl != null) {
                ilIlIlIlIlllllllllIl.close();
            }
        }
        if (ilIlIlIlIlllllllllIl != null) {
            ilIlIlIlIlllllllllIl.close();
        }
    }
}
