package net.optifine;

import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.optifine.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;
import net.optifine.shaders.*;

public class IlIlIIIllIIllIlllllI
{
    public static void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        try {
            final Throwable ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl == null) {
                return;
            }
            if (ilIlIlIlIlllllllllIl.getClass().getName().contains(".fml.client.SplashProgress")) {
                return;
            }
            if (ilIlIlIlIlllllllllIl.getClass() == Throwable.class) {
                return;
            }
            llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll c = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c();
            if (c == null) {
                return;
            }
            if (!c.lllIIIIlllllIlIIllIl) {
                return;
            }
            final String s = "http://optifine.net/crashReport";
            final byte[] bytes = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll).getBytes("ASCII");
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("OF-Version", net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
            hashMap.put("OF-Summary", IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll));
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(s, hashMap, bytes, iiiIlllIIIIIIlIIIlll);
            ilIlIlIlIlllllllllIl2.setPriority(10);
            ilIlIlIlIlllllllllIl2.start();
            Thread.sleep(1000L);
        }
        catch (Exception ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.valueOf(ex.getClass().getName()) + ": " + ex.getMessage());
        }
    }
    
    private static String llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final StringBuffer sb = new StringBuffer();
        sb.append("OptiFineVersion: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() + "\n");
        sb.append("Summary: " + IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll) + "\n");
        sb.append("\n");
        sb.append(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
        sb.append("\n");
        return sb.toString();
    }
    
    private static String IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final Throwable ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl == null) {
            return "Unknown";
        }
        final StackTraceElement[] stackTrace = ilIlIlIlIlllllllllIl.getStackTrace();
        String trim = "unknown";
        if (stackTrace.length > 0) {
            trim = stackTrace[0].toString().trim();
        }
        return String.valueOf(ilIlIlIlIlllllllllIl.getClass().getName()) + ": " + ilIlIlIlIlllllllllIl.getMessage() + " (" + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() + ")" + " [" + trim + "]";
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("OptiFine Version", net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("OptiFine Build", net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI());
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c() != null) {
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Render Distance Chunks", new StringBuilder().append(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.l()).toString());
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Mipmaps", new StringBuilder().append(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII()).toString());
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Anisotropic Filtering", new StringBuilder().append(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll()).toString());
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Antialiasing", new StringBuilder().append(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIIIIlIIlllIlIl()).toString());
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Multitexture", new StringBuilder().append(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII()).toString());
        }
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Shaders", new StringBuilder().append(llIIlllIIlllIIllIllI.IIIllIIllIIIIIIlIIlI()).toString());
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("OpenGlVersion", new StringBuilder().append(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).toString());
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("OpenGlRenderer", new StringBuilder().append(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).toString());
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("OpenGlVendor", new StringBuilder().append(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).toString());
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("CpuCount", new StringBuilder().append(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.e()).toString());
    }
}
