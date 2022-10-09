package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import java.util.*;
import net.optifine.util.*;

public class llllIIllllIlIlIIIIll
{
    private static IlIIlIlIIIlIIlIlIlII[] IlIlIlIlIlllllllllIl;
    public static boolean llllIIIIlIIIlIlllIll;
    
    static {
        llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl = null;
        llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll = false;
    }
    
    public static IlIIlIlIIIlIIlIlIlII llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl == null) {
            return null;
        }
        if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll()) {
            return null;
        }
        if (!(llIIlIIIlIIIllIlIIIl instanceof IllIIlllIIIIlllIIlIl)) {
            return null;
        }
        final int ilIIIlIlIIIllIlIlIIl = ((IllIIlllIIIIlllIIlIl)llIIlIIIlIIIllIlIIIl).IlIIIlIlIIIllIlIlIIl();
        return (ilIIIlIlIIIllIlIlIIl > 0 && ilIIIlIlIIIllIlIlIIl < llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl.length) ? llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl[ilIIIlIlIIIllIlIlIIl] : null;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl = null;
        llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll = false;
        final ArrayList list = new ArrayList();
        final String s = "optifine/block.properties";
        final Properties ilIlIlIlIlllllllllIl = IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl(s, "CustomBlockLayers");
        if (ilIlIlIlIlllllllllIl != null) {
            llllIIIIlIIIlIlllIll(s, ilIlIlIlIlllllllllIl, list);
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            final llIIlllIIlllIIllIllI ilIlIlIlIlllllllllIl2 = net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl2 != null) {
                llllIIIIlIIIlIlllIll("shaders/block.properties", ilIlIlIlIlllllllllIl2, list);
            }
        }
        if (!list.isEmpty()) {
            llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl = (IlIIlIlIIIlIIlIlIlII[])list.toArray(new IlIIlIlIIIlIIlIlIlII[list.size()]);
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll = true;
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s, final Properties properties, final List list) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomBlockLayers: " + s);
        llllIIIIlIIIlIlllIll("solid", IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll, properties, list);
        llllIIIIlIIIlIlllIll("cutout", IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI, properties, list);
        llllIIIIlIIIlIlllIll("cutout_mipped", IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl, properties, list);
        llllIIIIlIIIlIlllIll("translucent", IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl, properties, list);
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s, final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII, final Properties properties, final List list) {
        final String property = properties.getProperty("layer." + s);
        if (property != null) {
            final net.optifine.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] llIllIIIIIllIlIIIIlI = new net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("CustomBlockLayers").llIllIIIIIllIlIIIIlI(property);
            if (llIllIIIIIllIlIIIIlI != null) {
                for (int i = 0; i < llIllIIIIIllIlIIIIlI.length; ++i) {
                    final int llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI[i].llllIIIIlIIIlIlllIll();
                    if (llllIIIIlIIIlIlllIll > 0) {
                        while (list.size() < llllIIIIlIIIlIlllIll + 1) {
                            list.add(null);
                        }
                        if (list.get(llllIIIIlIIIlIlllIll) != null) {
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("CustomBlockLayers: Block layer is already set, block: " + llllIIIIlIIIlIlllIll + ", layer: " + s);
                        }
                        list.set(llllIIIIlIIIlIlllIll, ilIIlIlIIIlIIlIlIlII);
                    }
                }
            }
        }
    }
    
    public static boolean IlIlIlIlIlllllllllIl() {
        return llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll;
    }
}
