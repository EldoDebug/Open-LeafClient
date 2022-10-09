package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIlIIIIIllIlIIIlIIll
{
    private lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private static final int IlIlIIIllIllIIIIIllI = 2;
    private static final int IllIIlllIIIIlllIIlIl = 0;
    private static final int llllIIIlIlllIlIIIIIl = 1;
    private static final int lIIIIlIIIIIlllIllIII = 2;
    
    public IIlIIIIIllIlIIIlIIll(final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final boolean ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = 2;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public static IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final String s, final int n, final Properties properties) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl("scaleMode", n, properties));
        return new IIlIIIIIllIlIIIlIIll(lIllllIllIllIIllllll, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl("scale", n, properties), (llllIIIIlIIIlIlllIll == 0) ? 2 : 1), net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl("center", n, properties), false));
    }
    
    private static String IlIlIlIlIlllllllllIl(final String s, final int n, final Properties properties) {
        if (properties == null) {
            return null;
        }
        final String property = properties.getProperty("dim" + n + "." + s);
        if (property != null) {
            return property;
        }
        return properties.getProperty(s);
    }
    
    private static int llllIIIIlIIIlIlllIll(String trim) {
        if (trim == null) {
            return 0;
        }
        trim = trim.toLowerCase().trim();
        if (trim.equals("fixed")) {
            return 0;
        }
        if (trim.equals("full")) {
            return 1;
        }
        if (trim.equals("stretch")) {
            return 2;
        }
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll("Invalid scale mode: " + trim);
        return 0;
    }
    
    private static int llllIIIIlIIIlIlllIll(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, -1);
        if (llllIIIIlIIIlIlllIll < 1) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll("Invalid scale: " + trim);
            return n;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        final double n3 = 16 * this.llIllIIIIIllIlIIIIlI;
        double n4 = n / n3;
        double n5 = n2 / n3;
        double n6 = 0.0;
        double n7 = 0.0;
        if (this.IlIIIlIlIIIllIlIlIIl) {
            n6 = (n3 - n) / (n3 * 2.0);
            n7 = (n3 - n2) / (n3 * 2.0);
        }
        switch (this.IlIlIlIlIlllllllllIl) {
            case 1: {
                final double n8 = Math.max(n, n2);
                n4 = this.llIllIIIIIllIlIIIIlI * n / n8;
                n5 = this.llIllIIIIIllIlIIIIlI * n2 / n8;
                if (this.IlIIIlIlIIIllIlIlIIl) {
                    n6 = this.llIllIIIIIllIlIIIIlI * (n8 - n) / (n8 * 2.0);
                    n7 = this.llIllIIIIIllIlIIIIlI * (n8 - n2) / (n8 * 2.0);
                    break;
                }
                break;
            }
            case 2: {
                n4 = this.llIllIIIIIllIlIIIIlI;
                n5 = this.llIllIIIIIllIlIIIIlI;
                n6 = 0.0;
                n7 = 0.0;
                break;
            }
        }
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n2, 0.0).llllIIIIlIIIlIlllIll(n6, n7 + n5).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2, 0.0).llllIIIIlIIIlIlllIll(n6 + n4, n7 + n5).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, 0.0, 0.0).llllIIIIlIIIlIlllIll(n6 + n4, n7).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, 0.0).llllIIIIlIIIlIlllIll(n6, n7).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
}
