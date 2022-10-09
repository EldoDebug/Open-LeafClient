package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIllIIllIlllllI
{
    private static String llIIIlIlIllIIlIlIlII;
    public static final String llllIIIIlIIIlIlllIll = "MC_VERSION";
    public static final String IlIlIlIlIlllllllllIl = "MC_GL_VERSION";
    public static final String llIllIIIIIllIlIIIIlI = "MC_GLSL_VERSION";
    public static final String IlIIIlIlIIIllIlIlIIl = "MC_OS_WINDOWS";
    public static final String IlIlIIIllIllIIIIIllI = "MC_OS_MAC";
    public static final String IllIIlllIIIIlllIIlIl = "MC_OS_LINUX";
    public static final String llllIIIlIlllIlIIIIIl = "MC_OS_OTHER";
    public static final String lIIIIlIIIIIlllIllIII = "MC_GL_VENDOR_ATI";
    public static final String lIIIlllIIIllIIIllIII = "MC_GL_VENDOR_INTEL";
    public static final String llIIlIIIlIIIllIlIIIl = "MC_GL_VENDOR_NVIDIA";
    public static final String llIllIlIIIIllIlIIllI = "MC_GL_VENDOR_XORG";
    public static final String lIlIlIIIllIIllIIIllI = "MC_GL_VENDOR_OTHER";
    public static final String IlIlIIIllIIllIlllllI = "MC_GL_RENDERER_RADEON";
    public static final String IIIIlllIIIIIIlIIIlll = "MC_GL_RENDERER_GEFORCE";
    public static final String llllIIllllIlIlIIIIll = "MC_GL_RENDERER_QUADRO";
    public static final String IlIllIlIlIIIlIlIlIII = "MC_GL_RENDERER_INTEL";
    public static final String IIlllIIlIllIllIlIIll = "MC_GL_RENDERER_GALLIUM";
    public static final String lllIIIIlllllIlIIllIl = "MC_GL_RENDERER_MESA";
    public static final String IlIlIIIIIIlllIlIllIl = "MC_GL_RENDERER_OTHER";
    public static final String IIllIIllIIIlIlIIIIlI = "MC_FXAA_LEVEL";
    public static final String IIIlIIIlIlIIlllIIlll = "MC_NORMAL_MAP";
    public static final String IlIlIIIlIIlIlIIlllIl = "MC_SPECULAR_MAP";
    public static final String IlllllllIIIlIIIlIlII = "MC_RENDER_QUALITY";
    public static final String IIlIIIIlllIlllllIlII = "MC_SHADOW_QUALITY";
    public static final String IIIlIIlIIIIlllIlllII = "MC_HAND_DEPTH";
    public static final String IlIlIllllllllIIIIlII = "MC_OLD_HAND_LIGHT";
    public static final String IIlllIlIIllIlIlIlIIl = "MC_OLD_LIGHTING";
    private static lIlIlIIIllIIllIIIllI[] lllllIlIIIlIlIIlllII;
    private static volatile /* synthetic */ int[] lIllllllIIllIlIlIlII;
    
    static {
        net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII = "MC_";
    }
    
    public static String llllIIIIlIIIlIlllIll() {
        switch (lIIIIlIIIIIlllIllIII()[c.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 3: {
                return "MC_OS_WINDOWS";
            }
            case 4: {
                return "MC_OS_MAC";
            }
            case 1: {
                return "MC_OS_LINUX";
            }
            default: {
                return "MC_OS_OTHER";
            }
        }
    }
    
    public static String IlIlIlIlIlllllllllIl() {
        final String liiiIlIIIIIlllIllIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII == null) {
            return "MC_GL_VENDOR_OTHER";
        }
        final String lowerCase = liiiIlIIIIIlllIllIII.toLowerCase();
        return lowerCase.startsWith("ati") ? "MC_GL_VENDOR_ATI" : (lowerCase.startsWith("intel") ? "MC_GL_VENDOR_INTEL" : (lowerCase.startsWith("nvidia") ? "MC_GL_VENDOR_NVIDIA" : (lowerCase.startsWith("x.org") ? "MC_GL_VENDOR_XORG" : "MC_GL_VENDOR_OTHER")));
    }
    
    public static String llIllIIIIIllIlIIIIlI() {
        final String llllIIIlIlllIlIIIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
        if (llllIIIlIlllIlIIIIIl == null) {
            return "MC_GL_RENDERER_OTHER";
        }
        final String lowerCase = llllIIIlIlllIlIIIIIl.toLowerCase();
        return lowerCase.startsWith("amd") ? "MC_GL_RENDERER_RADEON" : (lowerCase.startsWith("ati") ? "MC_GL_RENDERER_RADEON" : (lowerCase.startsWith("radeon") ? "MC_GL_RENDERER_RADEON" : (lowerCase.startsWith("gallium") ? "MC_GL_RENDERER_GALLIUM" : (lowerCase.startsWith("intel") ? "MC_GL_RENDERER_INTEL" : (lowerCase.startsWith("geforce") ? "MC_GL_RENDERER_GEFORCE" : (lowerCase.startsWith("nvidia") ? "MC_GL_RENDERER_GEFORCE" : (lowerCase.startsWith("quadro") ? "MC_GL_RENDERER_QUADRO" : (lowerCase.startsWith("nvs") ? "MC_GL_RENDERER_QUADRO" : (lowerCase.startsWith("mesa") ? "MC_GL_RENDERER_MESA" : "MC_GL_RENDERER_OTHER")))))))));
    }
    
    public static String IlIIIlIlIIIllIlIlIIl() {
        return net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII;
    }
    
    public static lIlIlIIIllIIllIIIllI[] IlIlIIIllIllIIIIIllI() {
        if (net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.lllllIlIIIlIlIIlllII == null) {
            final String[] lIlIlIIIllIIllIIIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI();
            final lIlIlIIIllIIllIIIllI[] lllllIlIIIlIlIIlllII = new lIlIlIIIllIIllIIIllI[lIlIlIIIllIIllIIIllI.length];
            for (int i = 0; i < lIlIlIIIllIIllIIIllI.length; ++i) {
                lllllIlIIIlIlIIlllII[i] = new lIlIlIIIllIIllIIIllI(String.valueOf(net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII) + lIlIlIIIllIIllIIIllI[i], "");
            }
            net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
        }
        return net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.lllllIlIIIlIlIIlllII;
    }
    
    public static String IllIIlllIIIIlllIIlIl() {
        final StringBuilder sb = new StringBuilder();
        llllIIIIlIIIlIlllIll(sb, "MC_VERSION", net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
        llllIIIIlIIIlIlllIll(sb, "MC_GL_VERSION " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl().IlIIIlIlIIIllIlIlIIl());
        llllIIIIlIIIlIlllIll(sb, "MC_GLSL_VERSION " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI().IlIIIlIlIIIllIlIlIIl());
        llllIIIIlIIIlIlllIll(sb, llllIIIIlIIIlIlllIll());
        llllIIIIlIIIlIlllIll(sb, IlIlIlIlIlllllllllIl());
        llllIIIIlIIIlIlllIll(sb, llIllIIIIIllIlIIIIlI());
        return sb.toString();
    }
    
    public static String llllIIIlIlllIlIIIIIl() {
        final StringBuilder sb = new StringBuilder();
        if (llIIlllIIlllIIllIllI.cn > 0) {
            llllIIIIlIIIlIlllIll(sb, "MC_FXAA_LEVEL", llIIlllIIlllIIllIllI.cn);
        }
        if (llIIlllIIlllIIllIllI.cj) {
            llllIIIIlIIIlIlllIll(sb, "MC_NORMAL_MAP");
        }
        if (llIIlllIIlllIIllIllI.ck) {
            llllIIIIlIIIlIlllIll(sb, "MC_SPECULAR_MAP");
        }
        llllIIIIlIIIlIlllIll(sb, "MC_RENDER_QUALITY", llIIlllIIlllIIllIllI.ca);
        llllIIIIlIIIlIlllIll(sb, "MC_SHADOW_QUALITY", llIIlllIIlllIIllIllI.cb);
        llllIIIIlIIIlIlllIll(sb, "MC_HAND_DEPTH", llIIlllIIlllIIllIllI.bZ);
        if (llIIlllIIlllIIllIllI.lIIIlllIIIllIIIllIII()) {
            llllIIIIlIIIlIlllIll(sb, "MC_OLD_HAND_LIGHT");
        }
        if (llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI()) {
            llllIIIIlIIIlIlllIll(sb, "MC_OLD_LIGHTING");
        }
        return sb.toString();
    }
    
    private static void llllIIIIlIIIlIlllIll(final StringBuilder sb, final String s, final int n) {
        sb.append("#define ");
        sb.append(s);
        sb.append(" ");
        sb.append(n);
        sb.append("\n");
    }
    
    private static void llllIIIIlIIIlIlllIll(final StringBuilder sb, final String s, final float n) {
        sb.append("#define ");
        sb.append(s);
        sb.append(" ");
        sb.append(n);
        sb.append("\n");
    }
    
    private static void llllIIIIlIIIlIlllIll(final StringBuilder sb, final String s) {
        sb.append("#define ");
        sb.append(s);
        sb.append("\n");
    }
    
    static /* synthetic */ int[] lIIIIlIIIIIlllIllIII() {
        final int[] lIllllllIIllIlIlIlII = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII;
        if (lIllllllIIllIlIlIlII != null) {
            return lIllllllIIllIlIlIlII;
        }
        final int[] lIllllllIIllIlIlIlII2 = new int[d.values().length];
        try {
            lIllllllIIllIlIlIlII2[d.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lIllllllIIllIlIlIlII2[d.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lIllllllIIllIlIlIlII2[d.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lIllllllIIllIlIlIlII2[d.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lIllllllIIllIlIlIlII2[d.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII2;
    }
}
