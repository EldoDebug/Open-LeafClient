package net.minecraft.llllIIIlIlllIlIIIIIl;

import org.apache.logging.log4j.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.*;

public class IlIIIlIIIllllIlIlIlI
{
    private static final Logger IllIIlllIIIIlllIIlIl;
    public static final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    public static final IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    public static final IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI;
    public static final IlIIIlIlIIIllIlIlIIl IlIIIlIlIIIllIlIlIIl;
    public static final IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI;
    
    static {
        IllIIlllIIIIlllIIlIl = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = new llllIIIlIlllIlIIIIIl(null, "generic.maxHealth", 20.0, 0.0, 1024.0).llllIIIIlIIIlIlllIll("Max Health").llllIIIIlIIIlIlllIll(true);
        IlIlIlIlIlllllllllIl = new llllIIIlIlllIlIIIIIl(null, "generic.followRange", 32.0, 0.0, 2048.0).llllIIIIlIIIlIlllIll("Follow Range");
        llIllIIIIIllIlIIIIlI = new llllIIIlIlllIlIIIIIl(null, "generic.knockbackResistance", 0.0, 0.0, 1.0).llllIIIIlIIIlIlllIll("Knockback Resistance");
        IlIIIlIlIIIllIlIlIIl = new llllIIIlIlllIlIIIIIl(null, "generic.movementSpeed", 0.699999988079071, 0.0, 1024.0).llllIIIIlIIIlIlllIll("Movement Speed").llllIIIIlIIIlIlllIll(true);
        IlIlIIIllIllIIIIIllI = new llllIIIlIlllIlIIIIIl(null, "generic.attackDamage", 2.0, 0.0, 2048.0);
    }
    
    public static IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        final Iterator<IlIlIIIllIllIIIIIllI> iterator = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll().iterator();
        while (iterator.hasNext()) {
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(iterator.next()));
        }
        return ilIlIIIlIIlIlIIlllIl;
    }
    
    private static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Name", ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Base", ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl());
        final Collection llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI != null && !llIllIIIIIllIlIIIIlI.isEmpty()) {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
            for (final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : llIllIIIIIllIlIIIIlI) {
                if (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI()) {
                    ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll));
                }
            }
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Modifiers", ilIlIIIlIIlIlIIlllIl);
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    private static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Name", llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Amount", llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Operation", llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("UUIDMost", llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().getMostSignificantBits());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("UUIDLeast", llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().getLeastSignificantBits());
        return iiiIlllIIIIIIlIIIlll;
    }
    
    public static void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++i) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(i);
            final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Name"));
            if (llllIIIIlIIIlIlllIll != null) {
                llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
            }
            else {
                IlIIIlIIIllllIlIlIlI.IllIIlllIIIIlllIIlIl.warn("Ignoring unknown attribute '" + ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Name") + "'");
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("Base"));
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Modifiers", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Modifiers", 10);
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i));
                if (llllIIIIlIIIlIlllIll != null) {
                    final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2);
                    }
                    ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                }
            }
        }
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final UUID uuid = new UUID(iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("UUIDMost"), iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("UUIDLeast"));
        try {
            return new llllIIIIlIIIlIlllIll(uuid, iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Name"), iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("Amount"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Operation"));
        }
        catch (Exception ex) {
            IlIIIlIIIllllIlIlIlI.IllIIlllIIIIlllIIlIl.warn("Unable to create attribute: " + ex.getMessage());
            return null;
        }
    }
}
