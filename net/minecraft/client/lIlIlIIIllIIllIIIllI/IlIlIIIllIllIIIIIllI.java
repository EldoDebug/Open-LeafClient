package net.minecraft.client.lIlIlIIIllIIllIIIllI;

import org.apache.logging.log4j.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.IIIIlllIIIIIIlIIIlll.*;

public class IlIlIIIllIllIIIIIllI
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static IlIlIIIllIllIIIIIllI IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl = new IlIlIIIllIllIIIIIllI();
    }
    
    public static IlIlIIIllIllIIIIIllI IlIlIlIlIlllllllllIl() {
        return IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII);
        liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII);
        lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl());
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        final int ilIIIlIlIIIllIlIlIIl = lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl <= 0) {
            throw new IlIlIlIlIlllllllllIl("Could not create shader program (returned program ID " + ilIIIlIlIIIllIlIlIIl + ")");
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
        liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
        lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl(liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl());
        if (lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(), lIIIIlIlIllllIIlIllI.IlIlIIIllIIllIlllllI) == 0) {
            IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.warn("Error encountered when linking program containing VS " + liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll() + " and FS " + liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll() + ". Log output:");
            IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.warn(lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(), 32768));
        }
    }
}
