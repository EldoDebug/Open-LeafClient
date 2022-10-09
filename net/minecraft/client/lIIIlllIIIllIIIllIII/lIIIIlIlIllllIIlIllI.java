package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import oshi.*;
import oshi.hardware.*;
import java.nio.*;
import net.minecraft.client.*;
import org.lwjgl.opengl.*;

public class lIIIIlIlIllllIIlIllI
{
    public static boolean llllIIIIlIIIlIlllIll;
    public static boolean IlIlIlIlIlllllllllIl;
    public static int llIllIIIIIllIlIIIIlI;
    public static int IlIIIlIlIIIllIlIlIIl;
    public static int IlIlIIIllIllIIIIIllI;
    public static int IllIIlllIIIIlllIIlIl;
    public static int llllIIIlIlllIlIIIIIl;
    public static int lIIIIlIIIIIlllIllIII;
    public static int lIIIlllIIIllIIIllIII;
    public static int llIIlIIIlIIIllIlIIIl;
    public static int llIllIlIIIIllIlIIllI;
    private static int lIIIIlIlIllllIIlIllI;
    public static boolean lIlIlIIIllIIllIIIllI;
    private static boolean llIIIlIlllIllIIlIllI;
    private static boolean IlIIllIIllIIllIIlIIl;
    public static int IlIlIIIllIIllIlllllI;
    public static int IIIIlllIIIIIIlIIIlll;
    public static int llllIIllllIlIlIIIIll;
    public static int IlIllIlIlIIIlIlIlIII;
    private static boolean lllllIIIIIlIlIIIIIIl;
    public static int IIlllIIlIllIllIlIIll;
    public static int lllIIIIlllllIlIIllIl;
    public static int IlIlIIIIIIlllIlIllIl;
    private static boolean IllIIlllllIIllIIllIl;
    public static int IIllIIllIIIlIlIIIIlI;
    public static int IIIlIIIlIlIIlllIIlll;
    public static int IlIlIIIlIIlIlIIlllIl;
    public static int IlllllllIIIlIIIlIlII;
    public static int IIlIIIIlllIlllllIlII;
    public static int IIIlIIlIIIIlllIlllII;
    public static int IlIlIllllllllIIIIlII;
    public static int IIlllIlIIllIlIlIlIIl;
    public static int llIIIlIlIllIIlIlIlII;
    public static int lllllIlIIIlIlIIlllII;
    public static int lIllllllIIllIlIlIlII;
    public static int llIIlllIIlllIIllIllI;
    public static int IIlllIIIlIlllIIlllII;
    public static int IIlIIIIIllIlIIIlIIll;
    public static int llllllIllIllIlIllllI;
    public static int IIIllllllIllIIIlllIl;
    public static int IlIIIlIIIllllIlIlIlI;
    public static int IIIIIllIIIIlIIIIllIl;
    public static int IIIIIIIIIlllIllIlIlI;
    private static boolean lIllIIIIIlllIIlIIllI;
    public static boolean IIllllIIIlIIIIIIllIl;
    public static boolean IlllIIIIlIIIlIlIlIIl;
    public static boolean lllIllIIIllllllIllll;
    private static String lIlIIlllIIlIIlIlllIl;
    private static String llIIIllIlIllIllIIIIl;
    public static boolean llIllIlIlIIIIIIIllII;
    public static boolean IIlIlIlIIlIllIIIIIIl;
    private static boolean IIIllIIIlIlIIllIIIlI;
    public static int IllIllIIIIlIIlIlllII;
    public static int IlIllllIIlIIlIlIlIll;
    public static float IllIllIlllIllllIIllI;
    public static float llIlIIIIIlIIlIlIIlll;
    public static boolean IlIIlIlIIIlIIlIlIlII;
    public static boolean IllIlIIllIllIIlIllII;
    public static int lIIlIIIlIllIlIllIIIl;
    public static int IIlIIIlllIllIllIlIII;
    public static final int lIlIlIlllIIlIlIlllIl = 7;
    public static final int llIIIIIIlIllIIlIIIll = 4;
    
    static {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = "";
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIllIlllIllllIIllI = 0.0f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIlIIIIIlIIlIlIIlll = 0.0f;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        final ContextCapabilities capabilities = GLContext.getCapabilities();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllllIIIIIlIlIIIIIIl = (capabilities.GL_ARB_multitexture && !capabilities.OpenGL13);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllllIIllIIllIl = (capabilities.GL_ARB_texture_env_combine && !capabilities.OpenGL13);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIlIlIIIlIIlIlIlII = capabilities.OpenGL31;
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIlIlIIIlIIlIlIlII) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl = 36662;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII = 36663;
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl = 36662;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII = 36663;
        }
        final boolean b = net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIlIlIIIlIIlIlIlII || capabilities.GL_ARB_copy_buffer;
        final boolean openGL14 = capabilities.OpenGL14;
        if (!(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIlIIllIllIIlIllII = (b && openGL14))) {
            final ArrayList<String> list = new ArrayList<String>();
            if (!b) {
                list.add("OpenGL 1.3, ARB_copy_buffer");
            }
            if (!openGL14) {
                list.add("OpenGL 1.4");
            }
            final String string = "VboRegions not supported, missing: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(list);
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(string);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + string + "\n";
        }
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllllIIIIIlIlIIIIIIl) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "Using ARB_multitexture.\n";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll = 33984;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl = 33985;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIIIIlllIlIllIl = 33986;
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "Using GL 1.3 multitexturing.\n";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll = 33984;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl = 33985;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIIIIlllIlIllIl = 33986;
        }
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllllIIllIIllIl) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "Using ARB_texture_env_combine.\n";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIllIIllIIIlIlIIIIlI = 34160;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIlIIIlIlIIlllIIlll = 34165;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIlIIlIlIIlllIl = 34167;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlllllllIIIlIIIlIlII = 34166;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII = 34168;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII = 34161;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIllllllllIIIIlII = 34176;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl = 34177;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII = 34178;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII = 34192;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIllllllIIllIlIlIlII = 34193;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIlllIIlllIIllIllI = 34194;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIIlIlllIIlllII = 34162;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll = 34184;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllllIllIllIlIllllI = 34185;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllllllIllIIIlllIl = 34186;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI = 34200;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIIIllIIIIlIIIIllIl = 34201;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIIIIIIIlllIllIlIlI = 34202;
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "Using GL 1.3 texture combiners.\n";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIllIIllIIIlIlIIIIlI = 34160;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIlIIIlIlIIlllIIlll = 34165;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIlIIlIlIIlllIl = 34167;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlllllllIIIlIIIlIlII = 34166;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII = 34168;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII = 34161;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIllllllllIIIIlII = 34176;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl = 34177;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII = 34178;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII = 34192;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIllllllIIllIlIlIlII = 34193;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIlllIIlllIIllIllI = 34194;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIIlIlllIIlllII = 34162;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll = 34184;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllllIllIllIlIllllI = 34185;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllllllIllIIIlllIl = 34186;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI = 34200;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIIIllIIIIlIIIIllIl = 34201;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIIIIIIIlllIllIlIlI = 34202;
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIllllIIIlIIIIIIllIl = (capabilities.GL_EXT_blend_func_separate && !capabilities.OpenGL14);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIllIIIIIlllIIlIIllI = (capabilities.OpenGL14 || capabilities.GL_EXT_blend_func_separate);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI = (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIllIIIIIlllIIlIIllI && (capabilities.GL_ARB_framebuffer_object || capabilities.GL_EXT_framebuffer_object || capabilities.OpenGL30));
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "Using framebuffer objects because ";
            if (capabilities.OpenGL30) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "OpenGL 3.0 is supported and separate blending is supported.\n";
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI = 0;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI = 36160;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl = 36161;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI = 36064;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl = 36096;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl = 36053;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII = 36054;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII = 36055;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIlIIIlIIIllIlIIIl = 36059;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIlIIIIllIlIIllI = 36060;
            }
            else if (capabilities.GL_ARB_framebuffer_object) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "ARB_framebuffer_object is supported and separate blending is supported.\n";
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI = 1;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI = 36160;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl = 36161;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI = 36064;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl = 36096;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl = 36053;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII = 36055;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII = 36054;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIlIIIlIIIllIlIIIl = 36059;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIlIIIIllIlIIllI = 36060;
            }
            else if (capabilities.GL_EXT_framebuffer_object) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "EXT_framebuffer_object is supported.\n";
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI = 2;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI = 36160;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl = 36161;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI = 36064;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl = 36096;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl = 36053;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII = 36055;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIIIIIlllIllIII = 36054;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIlIIIlIIIllIlIIIl = 36059;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIlIIIIllIlIIllI = 36060;
            }
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "Not using framebuffer objects because ";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "OpenGL 1.4 is " + (capabilities.OpenGL14 ? "" : "not ") + "supported, ";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "EXT_blend_func_separate is " + (capabilities.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "OpenGL 3.0 is " + (capabilities.OpenGL30 ? "" : "not ") + "supported, ";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "ARB_framebuffer_object is " + (capabilities.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "EXT_framebuffer_object is " + (capabilities.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlllIIIIlIIIlIlIlIIl = capabilities.OpenGL21;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIIlIlllIllIIlIllI = (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlllIIIIlIIIlIlIlIIl || (capabilities.GL_ARB_vertex_shader && capabilities.GL_ARB_fragment_shader && capabilities.GL_ARB_shader_objects));
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "Shaders are " + (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIIlIlllIllIIlIllI ? "" : "not ") + "available because ";
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIIlIlllIllIIlIllI) {
            if (capabilities.OpenGL21) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "OpenGL 2.1 is supported.\n";
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl = false;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIllIIllIlllllI = 35714;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIIlllIIIIIIlIIIlll = 35713;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIllllIlIlIIIIll = 35633;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIllIlIlIIIlIlIlIII = 35632;
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl = true;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIllIIllIlllllI = 35714;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIIlllIIIIIIlIIIlll = 35713;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIllllIlIlIIIIll = 35633;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIllIlIlIIIlIlIlIII = 35632;
            }
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "OpenGL 2.1 is " + (capabilities.OpenGL21 ? "" : "not ") + "supported, ";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "ARB_shader_objects is " + (capabilities.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "ARB_vertex_shader is " + (capabilities.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "ARB_fragment_shader is " + (capabilities.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll = (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI && net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIIlIlllIllIIlIllI);
        final String lowerCase = GL11.glGetString(7936).toLowerCase();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll = lowerCase.contains("nvidia");
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllIIIlIlIIllIIIlI = (!capabilities.OpenGL15 && capabilities.GL_ARB_vertex_buffer_object);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIlIlIIIIIIIllII = (capabilities.OpenGL15 || net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllIIIlIlIIllIIIlI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "VBOs are " + (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIlIlIIIIIIIllII ? "" : "not ") + "available because ";
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIlIlIIIIIIIllII) {
            if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllIIIlIlIIllIIIlI) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "ARB_vertex_buffer_object is supported.\n";
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIllllIIlIIlIlIlIll = 35044;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII = 34962;
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl = String.valueOf(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl) + "OpenGL 1.5 is supported.\n";
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIllllIIlIIlIlIlIll = 35044;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII = 34962;
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl = lowerCase.contains("ati");
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl) {
            if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIlIlIIIIIIIllII) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlIlIlIIlIllIIIIIIl = true;
            }
            else {
                net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(16.0f);
            }
        }
        try {
            final Processor[] processors = new SystemInfo().getHardware().getProcessors();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIIllIlIllIllIIIIl = String.format("%dx %s", processors.length, processors[0]).replaceAll("\\s+", " ");
        }
        catch (Throwable t) {}
    }
    
    public static boolean IlIlIlIlIlllllllllIl() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll;
    }
    
    public static String llIllIIIIIllIlIIIIlI() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIIlllIIlIIlIlllIl;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl ? ARBShaderObjects.glGetObjectParameteriARB(n, n2) : GL20.glGetProgrami(n, n2);
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glAttachObjectARB(n, n2);
        }
        else {
            GL20.glAttachShader(n, n2);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glDeleteObjectARB(n);
        }
        else {
            GL20.glDeleteShader(n);
        }
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl ? ARBShaderObjects.glCreateShaderObjectARB(n) : GL20.glCreateShader(n);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final ByteBuffer byteBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glShaderSourceARB(n, byteBuffer);
        }
        else {
            GL20.glShaderSource(n, byteBuffer);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glCompileShaderARB(n);
        }
        else {
            GL20.glCompileShader(n);
        }
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl ? ARBShaderObjects.glGetObjectParameteriARB(n, n2) : GL20.glGetShaderi(n, n2);
    }
    
    public static String IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl ? ARBShaderObjects.glGetInfoLogARB(n, n2) : GL20.glGetShaderInfoLog(n, n2);
    }
    
    public static String IlIlIIIllIllIIIIIllI(final int n, final int n2) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl ? ARBShaderObjects.glGetInfoLogARB(n, n2) : GL20.glGetProgramInfoLog(n, n2);
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUseProgramObjectARB(n);
        }
        else {
            GL20.glUseProgram(n);
        }
    }
    
    public static int IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl ? ARBShaderObjects.glCreateProgramObjectARB() : GL20.glCreateProgram();
    }
    
    public static void IlIlIIIllIllIIIIIllI(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glDeleteObjectARB(n);
        }
        else {
            GL20.glDeleteProgram(n);
        }
    }
    
    public static void IllIIlllIIIIlllIIlIl(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glLinkProgramARB(n);
        }
        else {
            GL20.glLinkProgram(n);
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final CharSequence charSequence) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl ? ARBShaderObjects.glGetUniformLocationARB(n, charSequence) : GL20.glGetUniformLocation(n, charSequence);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final IntBuffer intBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniform1ARB(n, intBuffer);
        }
        else {
            GL20.glUniform1(n, intBuffer);
        }
    }
    
    public static void IllIIlllIIIIlllIIlIl(final int n, final int n2) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniform1iARB(n, n2);
        }
        else {
            GL20.glUniform1i(n, n2);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final FloatBuffer floatBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniform1ARB(n, floatBuffer);
        }
        else {
            GL20.glUniform1(n, floatBuffer);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final IntBuffer intBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniform2ARB(n, intBuffer);
        }
        else {
            GL20.glUniform2(n, intBuffer);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final FloatBuffer floatBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniform2ARB(n, floatBuffer);
        }
        else {
            GL20.glUniform2(n, floatBuffer);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n, final IntBuffer intBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniform3ARB(n, intBuffer);
        }
        else {
            GL20.glUniform3(n, intBuffer);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n, final FloatBuffer floatBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniform3ARB(n, floatBuffer);
        }
        else {
            GL20.glUniform3(n, floatBuffer);
        }
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final int n, final IntBuffer intBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniform4ARB(n, intBuffer);
        }
        else {
            GL20.glUniform4(n, intBuffer);
        }
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final int n, final FloatBuffer floatBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniform4ARB(n, floatBuffer);
        }
        else {
            GL20.glUniform4(n, floatBuffer);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final boolean b, final FloatBuffer floatBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniformMatrix2ARB(n, b, floatBuffer);
        }
        else {
            GL20.glUniformMatrix2(n, b, floatBuffer);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final boolean b, final FloatBuffer floatBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniformMatrix3ARB(n, b, floatBuffer);
        }
        else {
            GL20.glUniformMatrix3(n, b, floatBuffer);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n, final boolean b, final FloatBuffer floatBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl) {
            ARBShaderObjects.glUniformMatrix4ARB(n, b, floatBuffer);
        }
        else {
            GL20.glUniformMatrix4(n, b, floatBuffer);
        }
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n, final CharSequence charSequence) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIllIIllIIllIIlIIl ? ARBVertexShader.glGetAttribLocationARB(n, charSequence) : GL20.glGetAttribLocation(n, charSequence);
    }
    
    public static int IlIlIIIllIllIIIIIllI() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllIIIlIlIIllIIIlI ? ARBVertexBufferObject.glGenBuffersARB() : GL15.glGenBuffers();
    }
    
    public static void llllIIIlIlllIlIIIIIl(final int n, final int n2) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllIIIlIlIIllIIIlI) {
            ARBVertexBufferObject.glBindBufferARB(n, n2);
        }
        else {
            GL15.glBindBuffer(n, n2);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final ByteBuffer byteBuffer, final int n2) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllIIIlIlIIllIIIlI) {
            ARBVertexBufferObject.glBufferDataARB(n, byteBuffer, n2);
        }
        else {
            GL15.glBufferData(n, byteBuffer, n2);
        }
    }
    
    public static void llllIIIlIlllIlIIIIIl(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllIIIlIlIIllIIIlI) {
            ARBVertexBufferObject.glDeleteBuffersARB(n);
        }
        else {
            GL15.glDeleteBuffers(n);
        }
    }
    
    public static boolean IllIIlllIIIIlllIIlIl() {
        return !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII() && (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.D() || net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIlIIllIllIIlIllII) && (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIlIlIIIIIIIllII && Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIlIIIlIlIIlllIIlll);
    }
    
    public static void lIIIIlIIIIIlllIllIII(final int n, final int n2) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
                case 0: {
                    GL30.glBindFramebuffer(n, n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindFramebuffer(n, n2);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindFramebufferEXT(n, n2);
                    break;
                }
            }
        }
    }
    
    public static void lIIIlllIIIllIIIllIII(final int n, final int n2) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
                case 0: {
                    GL30.glBindRenderbuffer(n, n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindRenderbuffer(n, n2);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindRenderbufferEXT(n, n2);
                    break;
                }
            }
        }
    }
    
    public static void lIIIIlIIIIIlllIllIII(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
                case 0: {
                    GL30.glDeleteRenderbuffers(n);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteRenderbuffers(n);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteRenderbuffersEXT(n);
                    break;
                }
            }
        }
    }
    
    public static void lIIIlllIIIllIIIllIII(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
                case 0: {
                    GL30.glDeleteFramebuffers(n);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteFramebuffers(n);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteFramebuffersEXT(n);
                    break;
                }
            }
        }
    }
    
    public static int llllIIIlIlllIlIIIIIl() {
        if (!net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            return -1;
        }
        switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
            case 0: {
                return GL30.glGenFramebuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
            default: {
                return -1;
            }
        }
    }
    
    public static int lIIIIlIIIIIlllIllIII() {
        if (!net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            return -1;
        }
        switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
            case 0: {
                return GL30.glGenRenderbuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
            default: {
                return -1;
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
                case 0: {
                    GL30.glRenderbufferStorage(n, n2, n3, n4);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glRenderbufferStorage(n, n2, n3, n4);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glRenderbufferStorageEXT(n, n2, n3, n4);
                    break;
                }
            }
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
                case 0: {
                    GL30.glFramebufferRenderbuffer(n, n2, n3, n4);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferRenderbuffer(n, n2, n3, n4);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferRenderbufferEXT(n, n2, n3, n4);
                    break;
                }
            }
        }
    }
    
    public static int llIIlIIIlIIIllIlIIIl(final int n) {
        if (!net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            return -1;
        }
        switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
            case 0: {
                return GL30.glCheckFramebufferStatus(n);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus(n);
            }
            case 2: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT(n);
            }
            default: {
                return -1;
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            switch (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIIlIlIllllIIlIllI) {
                case 0: {
                    GL30.glFramebufferTexture2D(n, n2, n3, n4, n5);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferTexture2D(n, n2, n3, n4, n5);
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(n, n2, n3, n4, n5);
                    break;
                }
            }
        }
    }
    
    public static void llIllIlIIIIllIlIIllI(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllllIIIIIlIlIIIIIIl) {
            ARBMultitexture.glActiveTextureARB(n);
        }
        else {
            GL13.glActiveTexture(n);
        }
    }
    
    public static void lIlIlIIIllIIllIIIllI(final int n) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllllIIIIIlIlIIIIIIl) {
            ARBMultitexture.glClientActiveTextureARB(n);
        }
        else {
            GL13.glClientActiveTexture(n);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final float illIllIlllIllllIIllI, final float llIlIIIIIlIIlIlIIlll) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllllIIIIIlIlIIIIIIl) {
            ARBMultitexture.glMultiTexCoord2fARB(n, illIllIlllIllllIIllI, llIlIIIIIlIIlIlIIlll);
        }
        else {
            GL13.glMultiTexCoord2f(n, illIllIlllIllllIIllI, llIlIIIIIlIIlIlIIlll);
        }
        if (n == net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIllIlllIllllIIllI = illIllIlllIllllIIllI;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIlIIIIIlIIlIlIIlll = llIlIIIIIlIIlIlIIlll;
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3, final int n4) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIllIIIIIlllIIlIIllI) {
            if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIllllIIIlIIIIIIllIl) {
                EXTBlendFuncSeparate.glBlendFuncSeparateEXT(n, n2, n3, n4);
            }
            else {
                GL14.glBlendFuncSeparate(n, n2, n3, n4);
            }
        }
        else {
            GL11.glBlendFunc(n, n2);
        }
    }
    
    public static boolean lIIIlllIIIllIIIllIII() {
        return !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll() && (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI && Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final long n2, final int n3) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllIIIlIlIIllIIIlI) {
            ARBVertexBufferObject.glBufferDataARB(n, n2, n3);
        }
        else {
            GL15.glBufferData(n, n2, n3);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final long n2, final ByteBuffer byteBuffer) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIIllIIIlIlIIllIIIlI) {
            ARBVertexBufferObject.glBufferSubDataARB(n, n2, byteBuffer);
        }
        else {
            GL15.glBufferSubData(n, n2, byteBuffer);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final long n3, final long n4, final long n5) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIIlIlIIIlIIlIlIlII) {
            GL31.glCopyBufferSubData(n, n2, n3, n4, n5);
        }
        else {
            ARBCopyBuffer.glCopyBufferSubData(n, n2, n3, n4, n5);
        }
    }
    
    public static String llIIlIIIlIIIllIlIIIl() {
        return (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIIllIlIllIllIIIIl == null) ? "<unknown>" : net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIIIllIlIllIllIIIIl;
    }
}
