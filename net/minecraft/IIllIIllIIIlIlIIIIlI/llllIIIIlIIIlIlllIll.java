package net.minecraft.IIllIIllIIIlIlIIIIlI;

import net.optifine.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.*;
import org.apache.logging.log4j.*;
import net.optifine.shaders.*;
import java.util.regex.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.optifine.util.*;
import net.optifine.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import org.lwjgl.opengl.*;
import org.lwjgl.*;
import org.apache.commons.io.*;
import javax.imageio.*;
import java.awt.image.*;
import java.lang.reflect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.nio.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class llllIIIIlIIIlIlllIll
{
    public static final String llllIIIIlIIIlIlllIll = "OptiFine";
    public static final String IlIlIlIlIlllllllllIl = "1.8.9";
    public static final String llIllIIIIIllIlIIIIlI = "HD_U";
    public static final String IlIIIlIlIIIllIlIlIIl = "M5";
    public static final String IlIlIIIllIllIIIIIllI = "OptiFine_1.8.9_HD_U_M5";
    private static String IIIlIIIlIlIIlllIIlll;
    private static String IlIlIIIlIIlIlIIlllIl;
    private static boolean IlllllllIIIlIIIlIlII;
    public static String IllIIlllIIIIlllIIlIl;
    public static String llllIIIlIlllIlIIIIIl;
    public static String lIIIIlIIIIIlllIllIII;
    public static String[] lIIIlllIIIllIIIllIII;
    public static IlIlIIIllIllIIIIIllI llIIlIIIlIIIllIlIIIl;
    public static IlIlIIIllIllIIIIIllI llIllIlIIIIllIlIIllI;
    public static int lIlIlIIIllIIllIIIllI;
    public static boolean IlIlIIIllIIllIlllllI;
    public static boolean IIIIlllIIIIIIlIIIlll;
    private static net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll IIlIIIIlllIlllllIlII;
    private static Minecraft IIIlIIlIIIIlllIlllII;
    private static boolean IlIlIllllllllIIIIlII;
    private static Thread IIlllIlIIllIlIlIlIIl;
    private static DisplayMode llIIIlIlIllIIlIlIlII;
    private static DisplayMode[] lllllIlIIIlIlIIlllII;
    private static int lIllllllIIllIlIlIlII;
    private static int llIIlllIIlllIIllIllI;
    public static boolean llllIIllllIlIlIIIIll;
    public static boolean IlIllIlIlIIIlIlIlIII;
    private static int IIlllIIIlIlllIIlllII;
    public static boolean IIlllIIlIllIllIlIIll;
    private static boolean IIlIIIIIllIlIIIlIIll;
    private static boolean llllllIllIllIlIllllI;
    private static llIllIIIIIllIlIIIIlI IIIllllllIllIIIlllIl;
    public static final Float lllIIIIlllllIlIIllIl;
    private static final Logger IlIIIlIIIllllIlIlIlI;
    public static final boolean IlIlIIIIIIlllIlIllIl;
    private static String IIIIIllIIIIlIIIIllIl;
    private static int IIIIIIIIIlllIllIlIlI;
    public static float IIllIIllIIIlIlIIIIlI;
    
    static {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI = -1;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII = Minecraft.getMinecraft();
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII = 0;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI = 0;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII = 0;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl = null;
        lllIIIIlllllIlIIllIl = 0.1f;
        IlIIIlIIIllllIlIlIlI = LogManager.getLogger();
        IlIlIIIIIIlllIlIllIl = System.getProperty("log.detail", "false").equals("true");
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl = null;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI = 0;
    }
    
    public static String llllIIIIlIIIlIlllIll() {
        return "OptiFine_1.8.9_HD_U_M5";
    }
    
    public static String IlIlIlIlIlllllllllIl() {
        final StringBuffer sb = new StringBuffer(32);
        if (x()) {
            sb.append("DL: ");
            sb.append(String.valueOf(IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl()));
            sb.append(", ");
        }
        sb.append("OptiFine_1.8.9_HD_U_M5");
        final String iiIllIIllIIIIIIlIIlI = net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllIIllIIIIIIlIIlI();
        if (iiIllIIllIIIIIIlIIlI != null) {
            sb.append(", ");
            sb.append(iiIllIIllIIIIIIlIIlI);
        }
        return sb.toString();
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll iIlIIIIlllIlllllIlII) {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII = Display.getDesktopDisplayMode();
            f();
            net.optifine.lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("optifine.ForgeSplashCompatible", Boolean.TRUE);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        IlIIIlIlIIIllIlIlIIl();
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.d;
        m();
        n();
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl = Thread.currentThread();
        IlIlIIIllIIllIlllllI();
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(Minecraft.getMinecraft());
    }
    
    public static void IlIIIlIlIIIllIlIlIIl() {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII && Display.isCreated()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII = true;
            J();
            M();
        }
    }
    
    private static void J() {
        IlIlIIIllIllIIIIIllI("");
        IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll());
        IlIlIIIllIllIIIIIllI("Build: " + IlIlIIIllIllIIIIIllI());
        IlIlIIIllIllIIIIIllI("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        IlIlIIIllIllIIIIIllI("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        IlIlIIIllIllIIIIIllI("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        IlIlIIIllIllIIIIIllI("LWJGL: " + Sys.getVersion());
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = GL11.glGetString(7938);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = GL11.glGetString(7937);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = GL11.glGetString(7936);
        IlIlIIIllIllIIIIIllI("OpenGL: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl + ", version " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl + ", " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
        IlIlIIIllIllIIIIIllI("OpenGL Version: " + lIIIlllIIIllIIIllIII());
        if (!GLContext.getCapabilities().OpenGL12) {
            IlIlIIIllIllIIIIIllI("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
        }
        if (!(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI = GLContext.getCapabilities().GL_NV_fog_distance)) {
            IlIlIIIllIllIIIIIllI("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
        }
        if (!(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll = GLContext.getCapabilities().GL_ARB_occlusion_query)) {
            IlIlIIIllIllIIIIIllI("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
        }
        final int ilIlIIIllIllIIIIIllI = net.optifine.util.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI();
        IlIlIlIlIlllllllllIl("Maximum texture size: " + ilIlIIIllIllIIIIIllI + "x" + ilIlIIIllIllIIIIIllI);
    }
    
    public static String IlIlIIIllIllIIIIIllI() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll == null) {
            try {
                final InputStream resourceAsStream = llllIIIIlIIIlIlllIll.class.getResourceAsStream("/buildof.txt");
                if (resourceAsStream == null) {
                    return null;
                }
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll = llllIIIIlIIIlIlllIll(resourceAsStream)[0];
            }
            catch (Exception ex) {
                llIllIIIIIllIlIIIIlI(ex.getClass().getName() + ": " + ex.getMessage());
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll = "";
            }
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll;
    }
    
    public static boolean IllIIlllIIIIlllIIlIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI;
    }
    
    public static boolean llllIIIlIlllIlIIIIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll;
    }
    
    public static int lIIIIlIIIIIlllIllIII() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI < 0) {
            final String[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll("1.8.9", ".");
            int lIlIlIIIllIIllIIIllI = 0;
            if (llllIIIIlIIIlIlllIll.length > 0) {
                lIlIlIIIllIIllIIIllI += 10000 * llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[0], 0);
            }
            if (llllIIIIlIIIlIlllIll.length > 1) {
                lIlIlIIIllIIllIIIllI += 100 * llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[1], 0);
            }
            if (llllIIIIlIIIlIlllIll.length > 2) {
                lIlIlIIIllIIllIIIllI += 1 * llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[2], 0);
            }
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI;
    }
    
    public static String lIIIlllIIIllIIIllIII() {
        final IlIlIIIllIllIIIIIllI llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl();
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll() + "." + llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl() + "." + llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
    }
    
    private static IlIlIIIllIllIIIIIllI K() {
        return GLContext.getCapabilities().OpenGL44 ? new IlIlIIIllIllIIIIIllI(4, 4) : (GLContext.getCapabilities().OpenGL43 ? new IlIlIIIllIllIIIIIllI(4, 3) : (GLContext.getCapabilities().OpenGL42 ? new IlIlIIIllIllIIIIIllI(4, 2) : (GLContext.getCapabilities().OpenGL41 ? new IlIlIIIllIllIIIIIllI(4, 1) : (GLContext.getCapabilities().OpenGL40 ? new IlIlIIIllIllIIIIIllI(4, 0) : (GLContext.getCapabilities().OpenGL33 ? new IlIlIIIllIllIIIIIllI(3, 3) : (GLContext.getCapabilities().OpenGL32 ? new IlIlIIIllIllIIIIIllI(3, 2) : (GLContext.getCapabilities().OpenGL31 ? new IlIlIIIllIllIIIIIllI(3, 1) : (GLContext.getCapabilities().OpenGL30 ? new IlIlIIIllIllIIIIIllI(3, 0) : (GLContext.getCapabilities().OpenGL21 ? new IlIlIIIllIllIIIIIllI(2, 1) : (GLContext.getCapabilities().OpenGL20 ? new IlIlIIIllIllIIIIIllI(2, 0) : (GLContext.getCapabilities().OpenGL15 ? new IlIlIIIllIllIIIIIllI(1, 5) : (GLContext.getCapabilities().OpenGL14 ? new IlIlIIIllIllIIIIIllI(1, 4) : (GLContext.getCapabilities().OpenGL13 ? new IlIlIIIllIllIIIIIllI(1, 3) : (GLContext.getCapabilities().OpenGL12 ? new IlIlIIIllIllIIIIIllI(1, 2) : (GLContext.getCapabilities().OpenGL11 ? new IlIlIIIllIllIIIIIllI(1, 1) : new IlIlIIIllIllIIIIIllI(1, 0))))))))))))))));
    }
    
    public static IlIlIIIllIllIIIIIllI llIIlIIIlIIIllIlIIIl() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll(GL11.glGetString(7938), (IlIlIIIllIllIIIIIllI)null);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = K();
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = new IlIlIIIllIllIIIIIllI(1, 0);
            }
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl;
    }
    
    public static IlIlIIIllIllIIIIIllI llIllIlIIIIllIlIIllI() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll(GL11.glGetString(35724), (IlIlIIIllIllIIIIIllI)null);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = new IlIlIIIllIllIIIIIllI(1, 10);
            }
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI;
    }
    
    public static IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final String s, final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        try {
            if (s == null) {
                return ilIlIIIllIllIIIIIllI;
            }
            final Matcher matcher = Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?").matcher(s);
            if (!matcher.matches()) {
                return ilIlIIIllIllIIIIIllI;
            }
            return new IlIlIIIllIllIIIIIllI(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), (matcher.group(4) != null) ? Integer.parseInt(matcher.group(4)) : 0, matcher.group(5));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return ilIlIIIllIllIIIIIllI;
        }
    }
    
    public static String[] lIlIlIIIllIIllIIIllI() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII = L();
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII;
    }
    
    private static String[] L() {
        try {
            if (llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll() >= 3) {
                final int glGetInteger = GL11.glGetInteger(33309);
                if (glGetInteger > 0) {
                    final String[] array = new String[glGetInteger];
                    for (int i = 0; i < glGetInteger; ++i) {
                        array[i] = GL30.glGetStringi(7939, i);
                    }
                    return array;
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            return GL11.glGetString(7939).split(" ");
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
            return new String[0];
        }
    }
    
    public static void IlIlIIIllIIllIlllllI() {
        f();
        if (g()) {
            if (h()) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.setPriority(10);
                IlIlIlIlIlllllllllIl("Server thread", 1);
            }
            else {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.setPriority(5);
                IlIlIlIlIlllllllllIl("Server thread", 5);
            }
        }
        else {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.setPriority(10);
            IlIlIlIlIlllllllllIl("Server thread", 5);
        }
    }
    
    private static void IlIlIlIlIlllllllllIl(final String s, final int priority) {
        try {
            final ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            if (threadGroup == null) {
                return;
            }
            final Thread[] array = new Thread[(threadGroup.activeCount() + 10) * 2];
            threadGroup.enumerate(array, false);
            for (int i = 0; i < array.length; ++i) {
                final Thread thread = array[i];
                if (thread != null && thread.getName().startsWith(s)) {
                    thread.setPriority(priority);
                }
            }
        }
        catch (Throwable t) {
            llIllIIIIIllIlIIIIlI(String.valueOf(t.getClass().getName()) + ": " + t.getMessage());
        }
    }
    
    public static boolean IIIIlllIIIIIIlIIIlll() {
        return Thread.currentThread() == net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
    }
    
    private static void M() {
        new IIlllllIllIllIlIlIII().start();
    }
    
    public static boolean llllIIllllIlIlIIIIll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.IlIIIlIIIllllIlIlIlI > 0;
    }
    
    public static int IlIllIlIlIIIlIlIlIII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.IlIIIlIIIllllIlIlIlI;
    }
    
    public static int IIlllIIlIllIllIlIIll() {
        switch (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIlllIlllllIIlllIll) {
            case 0: {
                return 9986;
            }
            case 1: {
                return 9986;
            }
            case 2: {
                if (IIllIIIlIIIIlIIlIIII()) {
                    return 9985;
                }
                return 9986;
            }
            case 3: {
                if (IIllIIIlIIIIlIIlIIII()) {
                    return 9987;
                }
                return 9986;
            }
            default: {
                return 9986;
            }
        }
    }
    
    public static boolean lllIIIIlllllIlIIllIl() {
        return IlIlIIIIIIlllIlIllIl() > net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl + 1.0E-5f;
    }
    
    public static float IlIlIIIIIIlllIlIllIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl;
    }
    
    public static boolean IIllIIllIIIlIlIIIIlI() {
        return IllIIlllIIIIlllIIlIl() && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIllIlIIIllllllIIlII == 2;
    }
    
    public static boolean IIIlIIIlIlIIlllIIlll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIllIlIIIllllllIIlII == 1;
    }
    
    public static boolean IlIlIIIlIIlIlIIlllIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIllIlIIIllllllIIlII == 3;
    }
    
    public static boolean IlllllllIIIlIIIlIlII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIllIlIIIllllllIIlII != 3;
    }
    
    public static float IIlIIIIlllIlllllIlII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.IlIllIIllIIlIIIIlIIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s) {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.info("[OptiFine] " + s);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.info("[OptiFine] " + s);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.warn("[OptiFine] " + s);
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.error("[OptiFine] " + s);
    }
    
    public static void IlIlIIIllIllIIIIIllI(final String s) {
        IlIlIlIlIlllllllllIl(s);
    }
    
    public static int IIIlIIlIIIIlllIlllII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.u;
    }
    
    public static boolean IlIlIllllllllIIIIlII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.v;
    }
    
    public static boolean IIlllIlIIllIlIlIlIIl() {
        return (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.i == 0) ? net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII : (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.i == 2);
    }
    
    public static boolean llIIIlIlIllIIlIlIlII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.i == 3;
    }
    
    public static boolean lllllIlIIIlIlIIlllII() {
        return (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.f != 0) ? (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.f == 2) : ((b() && !net.optifine.shaders.llIIlllIIlllIIllIllI.cG.llllIIIlIlllIlIIIIIl()) ? net.optifine.shaders.llIIlllIIlllIIllIllI.cG.lIIIlllIIIllIIIllIII() : ((net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII != 0) ? (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII == 2) : net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII));
    }
    
    public static boolean lIllllllIIllIlIlIlII() {
        return (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.f != 0) ? (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.f == 3) : ((b() && !net.optifine.shaders.llIIlllIIlllIIllIllI.cG.llllIIIlIlllIlIIIIIl()) ? net.optifine.shaders.llIIlllIIlllIIllIllI.cG.llIIlIIIlIIIllIlIIIl() : (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII != 0 && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII == 3));
    }
    
    public static void llIIlllIIlllIIllIllI() {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII = 0;
        final IlIlIIIllIIllIlllllI ilIIllIIllIIllIIlIIl = IlIIllIIllIIllIIlIIl();
        if (ilIIllIIllIIllIIlIIl != null) {
            try {
                final InputStream ilIlIlIlIlllllllllIl = ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("mcpatcher/color.properties")).IlIlIlIlIlllllllllIl();
                if (ilIlIlIlIlllllllllIl == null) {
                    return;
                }
                final net.optifine.util.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new net.optifine.util.llIIlllIIlllIIllIllI();
                llIIlllIIlllIIllIllI.load(ilIlIlIlIlllllllllIl);
                ilIlIlIlIlllllllllIl.close();
                final String property = llIIlllIIlllIIllIllI.getProperty("clouds");
                if (property == null) {
                    return;
                }
                IlIlIlIlIlllllllllIl("Texture pack clouds: " + property);
                final String lowerCase = property.toLowerCase();
                if (lowerCase.equals("fast")) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII = 1;
                }
                if (lowerCase.equals("fancy")) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII = 2;
                }
                if (lowerCase.equals("off")) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII = 3;
                }
            }
            catch (Exception ex) {}
        }
    }
    
    public static IllIIlllIIIIlllIIlIl IIlllIIIlIlllIIlllII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IllIIlllllIIllIIllIl().IlIlIlIlIlllllllllIl;
    }
    
    public static boolean IIlIIIIIllIlIIIlIIll() {
        return (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.h == 0) ? net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII : (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.h != 1);
    }
    
    public static boolean llllllIllIllIlIllllI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.h == 4;
    }
    
    public static boolean IIIllllllIllIIIlllIl() {
        return (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.h == 0) ? (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII) : (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.h == 4);
    }
    
    public static boolean IlIIIlIIIllllIlIlIlI() {
        return (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.j == 0) ? net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII : (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.j == 2);
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return (n < n2) ? n2 : ((n > n3) ? n3 : n);
    }
    
    public static float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        return (n < n2) ? n2 : ((n > n3) ? n3 : n);
    }
    
    public static double llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        return (n < n2) ? n2 : ((n > n3) ? n3 : n);
    }
    
    public static float llllIIIIlIIIlIlllIll(final float n) {
        return (n < 0.0f) ? 0.0f : ((n > 1.0f) ? 1.0f : n);
    }
    
    public static boolean IIIIIllIIIIlIIIIllIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.V != 2;
    }
    
    public static boolean IIIIIIIIIlllIllIlIlI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.V == 1;
    }
    
    public static boolean IIllllIIIlIIIIIIllIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.Y;
    }
    
    public static boolean IlllIIIIlIIIlIlIlIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.W != 2;
    }
    
    public static boolean lllIllIIIllllllIllll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.W == 1;
    }
    
    public static boolean llIllIlIlIIIIIIIllII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.X;
    }
    
    public static boolean IIlIlIlIIlIllIIIIIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.Z;
    }
    
    public static boolean IllIllIIIIlIIlIlllII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.aa;
    }
    
    public static boolean IlIllllIIlIIlIlIlIll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.ab;
    }
    
    public static boolean IllIllIlllIllllIIllI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.ac;
    }
    
    public static boolean llIlIIIIIlIIlIlIIlll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.ad;
    }
    
    public static boolean IlIIlIlIIIlIIlIlIlII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.ae;
    }
    
    public static boolean IllIlIIllIllIIlIllII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.af;
    }
    
    public static boolean lIIlIIIlIllIlIllIIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.ag;
    }
    
    public static boolean IIlIIIlllIllIllIlIII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.ah;
    }
    
    public static boolean lIlIlIlllIIlIlIlllIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.ai;
    }
    
    public static float llIIIIIIlIllIIlIIIll() {
        return (b() && net.optifine.shaders.llIIlllIIlllIIllIllI.dc >= 0.0f) ? net.optifine.shaders.llIIlllIIlllIIllIllI.dc : net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.c;
    }
    
    public static String llllIIIIlIIIlIlllIll(final List list) {
        return llllIIIIlIIIlIlllIll(list, ", ");
    }
    
    public static String llllIIIIlIIIlIlllIll(final List list, final String s) {
        if (list == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(list.size() * 5);
        for (int i = 0; i < list.size(); ++i) {
            final Object value = list.get(i);
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.valueOf(value));
        }
        return sb.toString();
    }
    
    public static String llllIIIIlIIIlIlllIll(final Object[] array) {
        return llllIIIIlIIIlIlllIll(array, ", ");
    }
    
    public static String llllIIIIlIIIlIlllIll(final Object[] array, final String s) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final Object o = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.valueOf(o));
        }
        return sb.toString();
    }
    
    public static String llllIIIIlIIIlIlllIll(final int[] array) {
        return llllIIIIlIIIlIlllIll(array, ", ");
    }
    
    public static String llllIIIIlIIIlIlllIll(final int[] array, final String s) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.valueOf(n));
        }
        return sb.toString();
    }
    
    public static String llllIIIIlIIIlIlllIll(final float[] array) {
        return llllIIIIlIIIlIlllIll(array, ", ");
    }
    
    public static String llllIIIIlIIIlIlllIll(final float[] array, final String s) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final float n = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.valueOf(n));
        }
        return sb.toString();
    }
    
    public static Minecraft lIIIIlIlIllllIIlIllI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII;
    }
    
    public static IIlllIIlIllIllIlIIll llIIIlIlllIllIIlIllI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll();
    }
    
    public static IlIlIIIllIIllIlllllI IlIIllIIllIIllIIlIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII();
    }
    
    public static InputStream llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII(), lIllllIllIllIIllllll);
    }
    
    public static InputStream llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        return (llllIIIIlIIIlIlllIll == null) ? null : llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
    }
    
    public static boolean llIllIIIIIllIlIIIIlI(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return lIllllIllIllIIllllll != null && IlIlIIIllIllIIIIIllI(lIllllIllIllIIllllll) != null;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        try {
            return ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll) != null;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public static llllIIllllIlIlIIIIll[] lllllIIIIIlIlIIIIIIl() {
        final IIIlIIlIIIIlllIlllII iIlIlIlIIlIllIIIIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIlIlIlIIlIllIIIIIIl();
        final List llIllIIIIIllIlIIIIlI = iIlIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI();
        final ArrayList<llllIIllllIlIlIIIIll> list = new ArrayList<llllIIllllIlIlIIIIll>();
        final Iterator<lllllIlIIIlIlIIlllII> iterator = llIllIIIIIllIlIIIIlI.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().llIllIIIIIllIlIIIIlI());
        }
        if (iIlIlIlIIlIllIIIIIIl.IlIlIIIllIllIIIIIllI() != null) {
            list.add(iIlIlIlIIlIllIIIIIIl.IlIlIIIllIllIIIIIllI());
        }
        return list.toArray(new llllIIllllIlIlIIIIll[list.size()]);
    }
    
    public static String IllIIlllllIIllIIllIl() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIlIlIlIIlIllIIIIIIl() == null) {
            return "";
        }
        final llllIIllllIlIlIIIIll[] lllllIIIIIlIlIIIIIIl = lllllIIIIIlIlIIIIIIl();
        if (lllllIIIIIlIlIIIIIIl.length <= 0) {
            return lIllIIIIIlllIIlIIllI().IlIlIlIlIlllllllllIl();
        }
        final String[] array = new String[lllllIIIIIlIlIIIIIIl.length];
        for (int i = 0; i < lllllIIIIIlIlIIIIIIl.length; ++i) {
            array[i] = lllllIIIIIlIlIIIIIIl[i].IlIlIlIlIlllllllllIl();
        }
        return llllIIIIlIIIlIlllIll(array);
    }
    
    public static llIllIIIIIllIlIIIIlI lIllIIIIIlllIIlIIllI() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl == null) {
            final Minecraft minecraft = Minecraft.getMinecraft();
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl = (llIllIIIIIllIlIIIIlI)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(minecraft, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bj);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl == null) {
                final IIIlIIlIIIIlllIlllII iIlIlIlIIlIllIIIIIIl = minecraft.IIlIlIlIIlIllIIIIIIl();
                if (iIlIlIlIIlIllIIIIIIl != null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl = (llIllIIIIIllIlIIIIlI)iIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll;
                }
            }
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl;
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return IlIlIIIllIllIIIIIllI(lIllllIllIllIIllllll) == lIllIIIIIlllIIlIIllI();
    }
    
    public static llllIIllllIlIlIIIIll IlIlIIIllIllIIIIIllI(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final IIIlIIlIIIIlllIlllII iIlIlIlIIlIllIIIIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIlIlIlIIlIllIIIIIIl();
        final llllIIllllIlIlIIIIll ilIlIIIllIllIIIIIllI = iIlIlIlIIlIllIIIIIIl.IlIlIIIllIllIIIIIllI();
        if (ilIlIIIllIllIIIIIllI != null && ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll)) {
            return ilIlIIIllIllIIIIIllI;
        }
        final List llIllIIIIIllIlIIIIlI = iIlIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI;
        for (int i = llIllIIIIIllIlIIIIlI.size() - 1; i >= 0; --i) {
            final llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI.get(i).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll)) {
                return llIllIIIIIllIlIIIIlI2;
            }
        }
        if (lIllIIIIIlllIIlIIllI().IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll)) {
            return lIllIIIIIlllIIlIIllI();
        }
        return null;
    }
    
    public static lllllIIIIIlIlIIIIIIl lIlIIlllIIlIIlIlllIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;
    }
    
    public static boolean llIIIllIlIllIllIIIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.k != 3;
    }
    
    public static boolean IIIllIIIlIlIIllIIIlI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.k == 2;
    }
    
    public static boolean IIlllIIlllIIIlIlllII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.p;
    }
    
    public static boolean IlIIlllllIIllIIlllll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.q;
    }
    
    public static boolean lllllIIlIlIIIlIlIIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.s;
    }
    
    public static boolean IIlllllIllIllIlIlIII() {
        return lllllIIlIlIIIlIlIIIl() && (!b() || net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIlllIIIIIIlIIIlll());
    }
    
    public static boolean llllIllllIllllIlIlII() {
        return lllllIIlIlIIIlIlIIIl() && (!b() || net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIllllIlIlIIIIll());
    }
    
    public static boolean IIlIlIllllIlllIIIIll() {
        return (!b() || net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIlIlIIIlIlIlIII()) && ((net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.t == 0) ? net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII : (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.t == 2));
    }
    
    public static boolean lIIllIIIllllIlllIllI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.r;
    }
    
    public static void llllIIIIlIIIlIlllIll(final long n) {
        try {
            Thread.sleep(n);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public static boolean IllIlIllIllIlllIIlll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.w == 1;
    }
    
    public static boolean IIllIIIlIIlIlIlIIIII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.w == 0;
    }
    
    public static boolean llIllIIlllllllllllll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.w == 2;
    }
    
    public static boolean lllllIIllIlIllIllllI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.x;
    }
    
    public static int IlIIIIIlIIllIIlIlIll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.e;
    }
    
    public static boolean IllllIIlIlIllIIIllII() {
        return IlIIIIIlIIllIIlIlIll() > 1;
    }
    
    public static int lllllIIIIIlIIlllIlIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII;
    }
    
    public static boolean IlIllllIIIlIllIlIIll() {
        return lllllIIIIIlIIlllIlIl() > 0;
    }
    
    public static boolean lIIIIIlIlIIIlIIIIlIl() {
        return c().d > 0;
    }
    
    public static boolean IIllIIIlIIIIlIIlIIII() {
        return IlIIIIIlIIllIIlIlIll() > 1 || lllllIIIIIlIIlllIlIl() > 0;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        return n >= n2 && n <= n3;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3) {
        return n >= n2 && n <= n3;
    }
    
    public static boolean IIIllIIllIIIIIIlIIlI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.aj;
    }
    
    public static boolean IIIIIIIllllIlIIIIIII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.y;
    }
    
    public static Dimension IIlllIIIllIllIIlIlIl() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII == null) {
            return null;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII == null) {
            return new Dimension(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.getWidth(), net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.getHeight());
        }
        final String z = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.z;
        if (z.equals("Default")) {
            return new Dimension(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.getWidth(), net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.getHeight());
        }
        final String[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(z, " x");
        return (llllIIIIlIIIlIlllIll.length < 2) ? new Dimension(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.getWidth(), net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.getHeight()) : new Dimension(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[0], -1), llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[1], -1));
    }
    
    public static int llllIIIIlIIIlIlllIll(String trim, final int n) {
        try {
            if (trim == null) {
                return n;
            }
            trim = trim.trim();
            return Integer.parseInt(trim);
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    public static float llllIIIIlIIIlIlllIll(String trim, final float n) {
        try {
            if (trim == null) {
                return n;
            }
            trim = trim.trim();
            return Float.parseFloat(trim);
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll(String trim, final boolean b) {
        try {
            if (trim == null) {
                return b;
            }
            trim = trim.trim();
            return Boolean.parseBoolean(trim);
        }
        catch (NumberFormatException ex) {
            return b;
        }
    }
    
    public static Boolean llllIIIIlIIIlIlllIll(String lowerCase, final Boolean b) {
        try {
            if (lowerCase == null) {
                return b;
            }
            lowerCase = lowerCase.trim().toLowerCase();
            return lowerCase.equals("true") ? Boolean.TRUE : (lowerCase.equals("false") ? Boolean.FALSE : b);
        }
        catch (NumberFormatException ex) {
            return b;
        }
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final String s, final String s2) {
        final StringTokenizer stringTokenizer = new StringTokenizer(s, s2);
        final ArrayList<String> list = new ArrayList<String>();
        while (stringTokenizer.hasMoreTokens()) {
            list.add(stringTokenizer.nextToken());
        }
        return list.toArray(new String[list.size()]);
    }
    
    public static DisplayMode llIlllIlllllIIllIIII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII;
    }
    
    public static DisplayMode[] lllllIlIlIlllIlllIlI() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII == null) {
            try {
                final DisplayMode[] availableDisplayModes = Display.getAvailableDisplayModes();
                final Set llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(availableDisplayModes);
                final ArrayList<DisplayMode> list = new ArrayList<DisplayMode>();
                final Iterator<Dimension> iterator = llllIIIIlIIIlIlllIll.iterator();
                while (iterator.hasNext()) {
                    final DisplayMode llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(availableDisplayModes, iterator.next()), net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII);
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        list.add(llllIIIIlIIIlIlllIll2);
                    }
                }
                final DisplayMode[] array = list.toArray(new DisplayMode[list.size()]);
                Arrays.sort(array, new lIIIlllIIIllIIIllIII());
                return array;
            }
            catch (Exception ex) {
                ex.printStackTrace();
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII = new DisplayMode[] { net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII };
            }
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
    }
    
    public static DisplayMode IlIllllIIlIllIlIlIll() {
        final DisplayMode[] lllllIlIlIlllIlllIlI = lllllIlIlIlllIlllIlI();
        if (lllllIlIlIlllIlllIlI != null && lllllIlIlIlllIlllIlI.length >= 1) {
            final DisplayMode displayMode = lllllIlIlIlllIlllIlI[lllllIlIlIlllIlllIlI.length - 1];
            return (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.getWidth() > displayMode.getWidth()) ? net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII : ((net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.getWidth() == displayMode.getWidth() && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.getHeight() > displayMode.getHeight()) ? net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII : displayMode);
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII;
    }
    
    private static Set llllIIIIlIIIlIlllIll(final DisplayMode[] array) {
        final HashSet<Dimension> set = new HashSet<Dimension>();
        for (int i = 0; i < array.length; ++i) {
            final DisplayMode displayMode = array[i];
            set.add(new Dimension(displayMode.getWidth(), displayMode.getHeight()));
        }
        return set;
    }
    
    private static DisplayMode[] llllIIIIlIIIlIlllIll(final DisplayMode[] array, final Dimension dimension) {
        final ArrayList<DisplayMode> list = new ArrayList<DisplayMode>();
        for (int i = 0; i < array.length; ++i) {
            final DisplayMode displayMode = array[i];
            if (displayMode.getWidth() == dimension.getWidth() && displayMode.getHeight() == dimension.getHeight()) {
                list.add(displayMode);
            }
        }
        return list.toArray(new DisplayMode[list.size()]);
    }
    
    private static DisplayMode llllIIIIlIIIlIlllIll(final DisplayMode[] array, final DisplayMode displayMode) {
        if (displayMode != null) {
            for (int i = 0; i < array.length; ++i) {
                final DisplayMode displayMode2 = array[i];
                if (displayMode2.getBitsPerPixel() == displayMode.getBitsPerPixel() && displayMode2.getFrequency() == displayMode.getFrequency()) {
                    return displayMode2;
                }
            }
        }
        if (array.length <= 0) {
            return null;
        }
        Arrays.sort(array, new lIIIlllIIIllIIIllIII());
        return array[array.length - 1];
    }
    
    public static String[] lllIlIIIIIlIlllllIlI() {
        final DisplayMode[] lllllIlIlIlllIlllIlI = lllllIlIlIlllIlllIlI();
        final String[] array = new String[lllllIlIlIlllIlllIlI.length];
        for (int i = 0; i < lllllIlIlIlllIlllIlI.length; ++i) {
            final DisplayMode displayMode = lllllIlIlIlllIlllIlI[i];
            array[i] = displayMode.getWidth() + "x" + displayMode.getHeight();
        }
        return array;
    }
    
    public static DisplayMode llllIIIIlIIIlIlllIll(final Dimension dimension) {
        final DisplayMode[] lllllIlIlIlllIlllIlI = lllllIlIlIlllIlllIlI();
        for (int i = 0; i < lllllIlIlIlllIlllIlI.length; ++i) {
            final DisplayMode displayMode = lllllIlIlIlllIlllIlI[i];
            if (displayMode.getWidth() == dimension.width && displayMode.getHeight() == dimension.height) {
                return displayMode;
            }
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII;
    }
    
    public static boolean llIlIIIIllIlIIlIlIII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.ak;
    }
    
    public static boolean IIIIIlllIlIIIIIIIllI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.al;
    }
    
    public static boolean llllllIIIIIIIlllIIll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.A;
    }
    
    public static boolean IIlIlllIlIlllIlIllll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.B;
    }
    
    public static void IllIIlllIIIIlllIIlIl(final String s) {
        final int llllllIllIllIlIllllI = net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllllIllIllIlIllllI();
        if (llllllIllIllIlIllllI != 0 && IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI)) {
            final String llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(llllllIllIllIlIllllI);
            IlIIIlIlIIIllIlIlIIl(String.format("OpenGL error: %s (%s), at: %s", llllllIllIllIlIllllI, llIllIIIIIllIlIIIIlI, s));
            if (G() && net.optifine.util.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("ShowGlError", 10000L)) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.openglError", llllllIllIllIlIllllI, llIllIIIIIllIlIIIIlI)));
            }
        }
    }
    
    public static boolean lIllllIllIllIIllllll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.C;
    }
    
    public static boolean lllIIIIlIlIllIIlIIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.E;
    }
    
    public static boolean IllIlllIllIIIIllllII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.F;
    }
    
    public static boolean lIllIlIIIllllllIIlII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.D;
    }
    
    public static boolean IlIllIIllIIlIIIIlIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.G;
    }
    
    public static boolean lIIlllIlllllIIlllIll() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.H != 3;
    }
    
    public static boolean lIllIIlIlIlllllIIIII() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.J;
    }
    
    public static boolean lIIlIIIIIIIlIIlIlIIl() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.K;
    }
    
    public static boolean IlIIlllIIlIlllllIIlI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.H == 2;
    }
    
    public static boolean llllIlIllllIIlIIlIlI() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.M;
    }
    
    public static boolean a() {
        return (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.N == 0) ? net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII : (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.N == 2);
    }
    
    public static boolean b() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.cu;
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final File file) {
        return llllIIIIlIIIlIlllIll(new FileInputStream(file));
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final InputStream inputStream) {
        final ArrayList<String> list = new ArrayList<String>();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ASCII"));
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            list.add(line);
        }
        return list.toArray(new String[list.size()]);
    }
    
    public static String IlIlIlIlIlllllllllIl(final File file) {
        return llllIIIIlIIIlIlllIll(new FileInputStream(file), "ASCII");
    }
    
    public static String IlIlIlIlIlllllllllIl(final InputStream inputStream) {
        return llllIIIIlIIIlIlllIll(inputStream, "ASCII");
    }
    
    public static String llllIIIIlIIIlIlllIll(final InputStream inputStream, final String s) {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, s));
        final StringBuffer sb = new StringBuffer();
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public static byte[] llIllIIIIIllIlIIIIlI(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[1024];
        while (true) {
            final int read = inputStream.read(array);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        inputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
    
    public static net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll c() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII;
    }
    
    public static String d() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl;
    }
    
    public static void llllIIIlIlllIlIIIIIl(final String ilIlIIIlIIlIlIIlllIl) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl = ilIlIIIlIIlIlIIlllIl;
    }
    
    public static int IlIlIlIlIlllllllllIl(final String s, final String s2) {
        final String[] liiIlllIIIllIIIllIII = lIIIlllIIIllIIIllIII(s);
        final String[] liiIlllIIIllIIIllIII2 = lIIIlllIIIllIIIllIII(s2);
        final String s3 = liiIlllIIIllIIIllIII[0];
        final String s4 = liiIlllIIIllIIIllIII2[0];
        if (!s3.equals(s4)) {
            return s3.compareTo(s4);
        }
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII[1], -1);
        final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII2[1], -1);
        if (llllIIIIlIIIlIlllIll != llllIIIIlIIIlIlllIll2) {
            return llllIIIIlIIIlIlllIll - llllIIIIlIIIlIlllIll2;
        }
        final String s5 = liiIlllIIIllIIIllIII[2];
        final String s6 = liiIlllIIIllIIIllIII2[2];
        if (!s5.equals(s6)) {
            if (s5.isEmpty()) {
                return 1;
            }
            if (s6.isEmpty()) {
                return -1;
            }
        }
        return s5.compareTo(s6);
    }
    
    private static String[] lIIIlllIIIllIIIllIII(final String s) {
        if (s == null || s.length() <= 0) {
            return new String[] { "", "", "" };
        }
        final Matcher matcher = Pattern.compile("([A-Z])([0-9]+)(.*)").matcher(s);
        if (!matcher.matches()) {
            return new String[] { "", "", "" };
        }
        return new String[] { lIIIIlIIIIIlllIllIII(matcher.group(1)), lIIIIlIIIIIlllIllIII(matcher.group(2)), lIIIIlIIIIIlllIllIII(matcher.group(3)) };
    }
    
    public static int llllIIIIlIIIlIlllIll(int n) {
        n = (n ^ 0x3D ^ n >> 16);
        n += n << 3;
        n ^= n >> 4;
        n *= 668265261;
        n ^= n >> 15;
        return n;
    }
    
    public static int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(n + 37) + ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII()) + ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()) + ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII());
    }
    
    public static int e() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI;
    }
    
    public static void f() {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI = Runtime.getRuntime().availableProcessors();
    }
    
    public static boolean g() {
        return e() <= 1;
    }
    
    public static boolean h() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.IlIIlllIIlIlllllIIlI;
    }
    
    public static boolean i() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.llllIlIllllIIlIIlIlI;
    }
    
    public static boolean j() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.O;
    }
    
    public static boolean k() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.P;
    }
    
    public static int l() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII == null) {
            return 10;
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final Object o, final Object[] array) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (llllIIIIlIIIlIlllIll(o, array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int n, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final Object o, final Object[] array) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (o == array[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static String lIIIIlIIIIIlllIllIII(final String s) {
        return (s == null) ? "" : s;
    }
    
    public static void m() {
        final int lllllIIIIIlIIlllIlIl = lllllIIIIIlIIlllIlIl();
        if (lllllIIIIIlIIlllIlIl > 0) {
            final DisplayMode displayMode = Display.getDisplayMode();
            IlIlIlIlIlllllllllIl("FSAA Samples: " + lllllIIIIIlIIlllIlIl);
            try {
                Display.destroy();
                Display.setDisplayMode(displayMode);
                Display.create(new PixelFormat().withDepthBits(24).withSamples(lllllIIIIIlIIlllIlIl));
                Display.setResizable(false);
                Display.setResizable(true);
            }
            catch (LWJGLException ex) {
                llIllIIIIIllIlIIIIlI("Error setting FSAA: " + lllllIIIIIlIIlllIlIl + "x");
                ex.printStackTrace();
                try {
                    Display.setDisplayMode(displayMode);
                    Display.create(new PixelFormat().withDepthBits(24));
                    Display.setResizable(false);
                    Display.setResizable(true);
                }
                catch (LWJGLException ex2) {
                    ex2.printStackTrace();
                    try {
                        Display.setDisplayMode(displayMode);
                        Display.create();
                        Display.setResizable(false);
                        Display.setResizable(true);
                    }
                    catch (LWJGLException ex3) {
                        ex3.printStackTrace();
                    }
                }
            }
            if (!Minecraft.llllIIIIlIIIlIlllIll && lIllIIIIIlllIIlIIllI() != null) {
                InputStream llIllIIIIIllIlIIIIlI = null;
                InputStream llIllIIIIIllIlIIIIlI2 = null;
                try {
                    llIllIIIIIllIlIIIIlI = lIllIIIIIlllIIlIIllI().llIllIIIIIllIlIIIIlI(new lIllllIllIllIIllllll("icons/icon_16x16.png"));
                    llIllIIIIIllIlIIIIlI2 = lIllIIIIIlllIIlIIllI().llIllIIIIIllIlIIIIlI(new lIllllIllIllIIllllll("icons/icon_32x32.png"));
                    if (llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI2 != null) {
                        Display.setIcon(new ByteBuffer[] { IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI), IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI2) });
                    }
                }
                catch (IOException ex4) {
                    llIllIIIIIllIlIIIIlI("Error setting window icon: " + ex4.getClass().getName() + ": " + ex4.getMessage());
                    return;
                }
                finally {
                    IOUtils.closeQuietly(llIllIIIIIllIlIIIIlI);
                    IOUtils.closeQuietly(llIllIIIIIllIlIIIIlI2);
                }
                IOUtils.closeQuietly(llIllIIIIIllIlIIIIlI);
                IOUtils.closeQuietly(llIllIIIIIllIlIIIIlI2);
            }
        }
    }
    
    private static ByteBuffer IlIIIlIlIIIllIlIlIIl(final InputStream inputStream) {
        final BufferedImage read = ImageIO.read(inputStream);
        final int[] rgb = read.getRGB(0, 0, read.getWidth(), read.getHeight(), null, 0, read.getWidth());
        final ByteBuffer allocate = ByteBuffer.allocate(4 * rgb.length);
        int[] array;
        for (int length = (array = rgb).length, i = 0; i < length; ++i) {
            final int n = array[i];
            allocate.putInt(n << 8 | (n >> 24 & 0xFF));
        }
        allocate.flip();
        return allocate;
    }
    
    public static void n() {
        try {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIIIlIIIllllIlIlIlI()) {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll) {
                    return;
                }
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = true;
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI = false;
                final DisplayMode displayMode = Display.getDisplayMode();
                final Dimension iIlllIIIllIllIIlIlIl = IIlllIIIllIllIIlIlIl();
                if (iIlllIIIllIllIIlIlIl == null) {
                    return;
                }
                if (displayMode.getWidth() == iIlllIIIllIllIIlIlIl.width && displayMode.getHeight() == iIlllIIIllIllIIlIlIl.height) {
                    return;
                }
                final DisplayMode llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(iIlllIIIllIllIIlIlIl);
                if (llllIIIIlIIIlIlllIll == null) {
                    return;
                }
                Display.setDisplayMode(llllIIIIlIIIlIlllIll);
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl = Display.getDisplayMode().getWidth();
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI = Display.getDisplayMode().getHeight();
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl <= 0) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl = 1;
                }
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI <= 0) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI = 1;
                }
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll != null) {
                    final g g = new g(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII);
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII, g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl());
                }
                o();
                Display.setFullscreen(true);
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIIlIIIlIlIIlllIIlll.llIIlIIIlIIIllIlIIIl();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            }
            else {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI) {
                    return;
                }
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI = true;
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = false;
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIIlIIIlIlIIlllIIlll.llIIlIIIlIIIllIlIIIl();
                Display.update();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                Display.setResizable(false);
                Display.setResizable(true);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.z = "Default";
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII();
        }
    }
    
    public static void o() {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl, net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIllIlIlIIIlIlIlIII != null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl, net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI);
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIllllIlIlIIIIll = new net.minecraft.client.llIllIIIIIllIlIIIIlI(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII);
    }
    
    public static Object[] llllIIIIlIIIlIlllIll(final Object[] array, final Object o) {
        if (array == null) {
            throw new NullPointerException("The given array is NULL");
        }
        final int length = array.length;
        final Object[] array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), length + 1);
        System.arraycopy(array, 0, array2, 0, length);
        array2[length] = o;
        return array2;
    }
    
    public static Object[] llllIIIIlIIIlIlllIll(final Object[] array, final Object o, final int n) {
        final ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(array));
        list.add(n, o);
        return list.toArray((Object[])Array.newInstance(array.getClass().getComponentType(), list.size()));
    }
    
    public static Object[] llllIIIIlIIIlIlllIll(final Object[] array, final Object[] array2) {
        if (array == null) {
            throw new NullPointerException("The given array is NULL");
        }
        if (array2.length == 0) {
            return array;
        }
        final int length = array.length;
        final Object[] array3 = (Object[])Array.newInstance(array.getClass().getComponentType(), length + array2.length);
        System.arraycopy(array, 0, array3, 0, length);
        System.arraycopy(array2, 0, array3, length, array2.length);
        return array3;
    }
    
    public static Object[] IlIlIlIlIlllllllllIl(final Object[] array, final Object o) {
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(array));
        list.remove(o);
        return llllIIIIlIIIlIlllIll(list, array.getClass().getComponentType());
    }
    
    public static Object[] llllIIIIlIIIlIlllIll(final Collection collection, final Class clazz) {
        if (collection == null) {
            return null;
        }
        if (clazz == null) {
            return null;
        }
        if (clazz.isPrimitive()) {
            throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + clazz);
        }
        return collection.toArray((Object[])Array.newInstance(clazz, collection.size()));
    }
    
    public static boolean p() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.I;
    }
    
    public static void q() {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(Minecraft.lIlIIlllIIlIIlIlllIl() + "/" + r() + " fps, C: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll() + ", E: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll() + "+" + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII() + ", U: " + llIIlIIIlIIIllIlIIIl(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lIllllllIIllIlIlIlII), 2, 2, -2039584);
    }
    
    public static int r() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lIllllllIIllIlIlIlII == net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl) {
            return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lIllllllIIllIlIlIlII;
        final lIIlIIIlIllIlIllIIIl llIIIllIlIllIllIIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llIIIllIlIllIllIIIIl();
        final long[] llIllIIIIIllIlIIIIlI = llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI();
        final int ilIlIlIlIlllllllllIl = llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl();
        final int llllIIIIlIIIlIlllIll = llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll();
        if (ilIlIlIlIlllllllllIl == llllIIIIlIIIlIlllIll) {
            return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI;
        }
        int lIlIIlllIIlIIlIlllIl = Minecraft.lIlIIlllIIlIIlIlllIl();
        if (lIlIIlllIIlIIlIlllIl <= 0) {
            lIlIIlllIIlIIlIlllIl = 1;
        }
        long n = (long)(1.0 / lIlIIlllIIlIIlIlllIl * 1.0E9);
        long n2 = 0L;
        long n4;
        for (int n3 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl - 1, llIllIIIIIllIlIIIIlI.length); n3 != llllIIIIlIIIlIlllIll && n2 < 1.0E9; n2 += n4, n3 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 - 1, llIllIIIIIllIlIIIIlI.length)) {
            n4 = llIllIIIIIllIlIIIIlI[n3];
            if (n4 > n) {
                n = n4;
            }
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI = (int)(1.0 / (n / 1.0E9));
    }
    
    private static String llIIlIIIlIIIllIlIIIl(final String s) {
        final int index = s.indexOf(40);
        if (index < 0) {
            return "";
        }
        final int index2 = s.indexOf(32, index);
        return (index2 < 0) ? "" : s.substring(index + 1, index2);
    }
    
    public static int s() {
        return (System.getenv("ProgramFiles(X86)") != null) ? 64 : 32;
    }
    
    public static int t() {
        final String[] array = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
        for (int i = 0; i < array.length; ++i) {
            final String property = System.getProperty(array[i]);
            if (property != null && property.contains("64")) {
                return 64;
            }
        }
        return 32;
    }
    
    public static boolean u() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII;
    }
    
    public static void llllIIIIlIIIlIlllIll(final boolean illlllllIIIlIIIlIlII) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
    }
    
    public static boolean v() {
        return false;
    }
    
    public static void llIllIIIIIllIlIIIIlI(final String s, final String s2) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(new net.optifine.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll, s, s2));
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final int[] array, final int n) {
        return llllIIIIlIIIlIlllIll(array, new int[] { n });
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final int[] array, final int[] array2) {
        if (array != null && array2 != null) {
            final int length = array.length;
            final int[] array3 = new int[length + array2.length];
            System.arraycopy(array, 0, array3, 0, length);
            for (int i = 0; i < array2.length; ++i) {
                array3[i + length] = array2[i];
            }
            return array3;
        }
        throw new NullPointerException("The given array is NULL");
    }
    
    public static net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        try {
            final InputStream llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("textures/gui/title/mojang.png"));
            if (llllIIIIlIIIlIlllIll == null) {
                return ilIlIlIlIlllllllllIl;
            }
            final BufferedImage read = ImageIO.read(llllIIIIlIIIlIlllIll);
            if (read == null) {
                return ilIlIlIlIlllllllllIl;
            }
            return new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(read);
        }
        catch (Exception ex) {
            llIllIIIIIllIlIIIIlI(String.valueOf(ex.getClass().getName()) + ": " + ex.getMessage());
            return ilIlIlIlIlllllllllIl;
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final File file, final String s) {
        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(s.getBytes("ASCII"));
        fileOutputStream.close();
    }
    
    public static net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl w() {
        return lIIIIlIlIllllIIlIllI().IlIllllIIlIIlIlIlIll();
    }
    
    public static boolean x() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.Q != 3;
    }
    
    public static boolean y() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.Q == 1;
    }
    
    public static boolean z() {
        return x() && (!b() || net.optifine.shaders.llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl());
    }
    
    public static boolean A() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.R;
    }
    
    public static boolean B() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.S;
    }
    
    public static int C() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.U;
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final Integer[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            return new int[0];
        }
        final int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static boolean D() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.a;
    }
    
    public static boolean E() {
        return lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl();
    }
    
    public static boolean F() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIIlIIIIIIIlIIlIlIIl;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final URI uri) {
        try {
            Desktop.getDesktop().browse(uri);
            return true;
        }
        catch (Exception ex) {
            llIllIIIIIllIlIIIIlI("Error opening link: " + uri);
            llIllIIIIIllIlIIIIlI(String.valueOf(ex.getClass().getName()) + ": " + ex.getMessage());
            return false;
        }
    }
    
    public static boolean G() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.T;
    }
    
    public static String llllIIIIlIIIlIlllIll(final boolean[] array, final String s) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final boolean b = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.valueOf(b));
        }
        return sb.toString();
    }
    
    public static boolean H() {
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIlllIIIlIlllIIlllII() != null && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lIllllllIIllIlIlIlII();
    }
    
    public static IntBuffer IlIlIlIlIlllllllllIl(final int n) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(n << 2).asIntBuffer();
    }
    
    public static String llIllIIIIIllIlIIIIlI(final int n) {
        switch (n) {
            case 0: {
                return "No error";
            }
            case 1280: {
                return "Invalid enum";
            }
            case 1281: {
                return "Invalid value";
            }
            case 1282: {
                return "Invalid operation";
            }
            case 1283: {
                return "Stack overflow";
            }
            case 1284: {
                return "Stack underflow";
            }
            case 1285: {
                return "Out of memory";
            }
            case 1286: {
                return "Invalid framebuffer operation";
            }
            default: {
                return "Unknown";
            }
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final Boolean b) {
        return b != null && b;
    }
    
    public static boolean I() {
        return b() && !net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIlIlIlllllIIIII();
    }
    
    public static void llllIIIIlIIIlIlllIll(final Object o, final String s) {
        if (o == null) {
            throw new NullPointerException(s);
        }
    }
}
