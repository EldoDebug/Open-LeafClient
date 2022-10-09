package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.IlIlIIIllIIllIlllllI.*;
import org.apache.logging.log4j.*;

public class lIIIIlIIIIIlllIllIII
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl;
    private volatile boolean llIllIIIIIllIlIIIIlI;
    private IIlllIIlIllIllIlIIll IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public lIIIIlIIIIIlllIllIII(final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = false;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n) {
        net.minecraft.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(true);
        new lIIIlllIIIllIIIllIII(this, "Realms-connect-task", s, n).start();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = true;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            if (this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI()) {
                this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
            }
            else {
                this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl();
            }
        }
    }
}
