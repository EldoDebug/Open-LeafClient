package net.optifine.util;

import java.nio.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import net.optifine.shaders.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.optifine.*;
import net.minecraft.client.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import org.lwjgl.*;
import java.awt.image.*;
import java.util.*;

public class IlIIIlIIIllllIlIlIlI
{
    public static final String llllIIIIlIIIlIlllIll = "grass_top";
    public static final String IlIlIlIlIlllllllllIl = "stone";
    public static final String llIllIIIIIllIlIIIIlI = "dirt";
    public static final String IlIIIlIlIIIllIlIlIIl = "coarse_dirt";
    public static final String IlIlIIIllIllIIIIIllI = "grass_side";
    public static final String IllIIlllIIIIlllIIlIl = "stone_slab_side";
    public static final String llllIIIlIlllIlIIIIIl = "stone_slab_top";
    public static final String lIIIIlIIIIIlllIllIII = "bedrock";
    public static final String lIIIlllIIIllIIIllIII = "sand";
    public static final String llIIlIIIlIIIllIlIIIl = "gravel";
    public static final String llIllIlIIIIllIlIIllI = "log_oak";
    public static final String lIlIlIIIllIIllIIIllI = "log_big_oak";
    public static final String IlIlIIIllIIllIlllllI = "log_acacia";
    public static final String IIIIlllIIIIIIlIIIlll = "log_spruce";
    public static final String llllIIllllIlIlIIIIll = "log_birch";
    public static final String IlIllIlIlIIIlIlIlIII = "log_jungle";
    public static final String IIlllIIlIllIllIlIIll = "log_oak_top";
    public static final String lllIIIIlllllIlIIllIl = "log_big_oak_top";
    public static final String IlIlIIIIIIlllIlIllIl = "log_acacia_top";
    public static final String IIllIIllIIIlIlIIIIlI = "log_spruce_top";
    public static final String IIIlIIIlIlIIlllIIlll = "log_birch_top";
    public static final String IlIlIIIlIIlIlIIlllIl = "log_jungle_top";
    public static final String IlllllllIIIlIIIlIlII = "leaves_oak";
    public static final String IIlIIIIlllIlllllIlII = "leaves_big_oak";
    public static final String IIIlIIlIIIIlllIlllII = "leaves_acacia";
    public static final String IlIlIllllllllIIIIlII = "leaves_birch";
    public static final String IIlllIlIIllIlIlIlIIl = "leaves_spruce";
    public static final String llIIIlIlIllIIlIlIlII = "leaves_jungle";
    public static final String lllllIlIIIlIlIIlllII = "gold_ore";
    public static final String lIllllllIIllIlIlIlII = "iron_ore";
    public static final String llIIlllIIlllIIllIllI = "coal_ore";
    public static final String IIlllIIIlIlllIIlllII = "obsidian";
    public static final String IIlIIIIIllIlIIIlIIll = "grass_side_overlay";
    public static final String llllllIllIllIlIllllI = "snow";
    public static final String IIIllllllIllIIIlllIl = "grass_side_snowed";
    public static final String IlIIIlIIIllllIlIlIlI = "mycelium_side";
    public static final String IIIIIllIIIIlIIIIllIl = "mycelium_top";
    public static final String IIIIIIIIIlllIllIlIlI = "diamond_ore";
    public static final String IIllllIIIlIIIIIIllIl = "redstone_ore";
    public static final String IlllIIIIlIIIlIlIlIIl = "lapis_ore";
    public static final String lllIllIIIllllllIllll = "cactus_side";
    public static final String llIllIlIlIIIIIIIllII = "clay";
    public static final String IIlIlIlIIlIllIIIIIIl = "farmland_wet";
    public static final String IllIllIIIIlIIlIlllII = "farmland_dry";
    public static final String IlIllllIIlIIlIlIlIll = "netherrack";
    public static final String IllIllIlllIllllIIllI = "soul_sand";
    public static final String llIlIIIIIlIIlIlIIlll = "glowstone";
    public static final String IlIIlIlIIIlIIlIlIlII = "leaves_spruce";
    public static final String IllIlIIllIllIIlIllII = "leaves_spruce_opaque";
    public static final String lIIlIIIlIllIlIllIIIl = "end_stone";
    public static final String IIlIIIlllIllIllIlIII = "sandstone_top";
    public static final String lIlIlIlllIIlIlIlllIl = "sandstone_bottom";
    public static final String llIIIIIIlIllIIlIIIll = "redstone_lamp_off";
    public static final String lIIIIlIlIllllIIlIllI = "redstone_lamp_on";
    public static final String llIIIlIlllIllIIlIllI = "water_still";
    public static final String IlIIllIIllIIllIIlIIl = "water_flow";
    public static final String lllllIIIIIlIlIIIIIIl = "lava_still";
    public static final String IllIIlllllIIllIIllIl = "lava_flow";
    public static final String lIllIIIIIlllIIlIIllI = "fire_layer_0";
    public static final String lIlIIlllIIlIIlIlllIl = "fire_layer_1";
    public static final String llIIIllIlIllIllIIIIl = "portal";
    public static final String IIIllIIIlIlIIllIIIlI = "glass";
    public static final String IIlllIIlllIIIlIlllII = "glass_pane_top";
    public static final String IlIIlllllIIllIIlllll = "compass";
    public static final String lllllIIlIlIIIlIlIIIl = "clock";
    public static IlIlIIIllIIllIlllllI IIlllllIllIllIlIlIII;
    public static IlIlIIIllIIllIlllllI llllIllllIllllIlIlII;
    public static IlIlIIIllIIllIlllllI IIlIlIllllIlllIIIIll;
    public static IlIlIIIllIIllIlllllI lIIllIIIllllIlllIllI;
    public static IlIlIIIllIIllIlllllI IllIlIllIllIlllIIlll;
    public static IlIlIIIllIIllIlllllI IIllIIIlIIlIlIlIIIII;
    public static IlIlIIIllIIllIlllllI llIllIIlllllllllllll;
    public static IlIlIIIllIIllIlllllI lllllIIllIlIllIllllI;
    public static IlIlIIIllIIllIlllllI IlIIIIIlIIllIIlIlIll;
    public static IlIlIIIllIIllIlllllI IllllIIlIlIllIIIllII;
    public static IlIlIIIllIIllIlllllI lllllIIIIIlIIlllIlIl;
    public static IlIlIIIllIIllIlllllI IlIllllIIIlIllIlIIll;
    public static IlIlIIIllIIllIlllllI lIIIIIlIlIIIlIIIIlIl;
    public static IlIlIIIllIIllIlllllI IIllIIIlIIIIlIIlIIII;
    public static IlIlIIIllIIllIlllllI IIIllIIllIIIIIIlIIlI;
    public static IlIlIIIllIIllIlllllI IIIIIIIllllIlIIIIIII;
    public static IlIlIIIllIIllIlllllI IIlllIIIllIllIIlIlIl;
    public static IlIlIIIllIIllIlllllI llIlllIlllllIIllIIII;
    public static final String lllllIlIlIlllIlllIlI = "minecraft:blocks/";
    public static final String IlIllllIIlIllIlIlIll = "minecraft:items/";
    private static IntBuffer lllIlIIIIIlIlllllIlI;
    
    static {
        net.optifine.util.IlIIIlIIIllllIlIlIlI.lllIlIIIIIlIlllllIlI = net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl(256);
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        final IlIlIIIIIIlllIlIllIl ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl != null) {
            final String s = "minecraft:blocks/";
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IIlllllIllIllIlIlIII = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "grass_top");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.llllIllllIllllIlIlII = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "grass_side");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IIlIlIllllIlllIIIIll = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "grass_side_overlay");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.lIIllIIIllllIlllIllI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "snow");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IllIlIllIllIlllIIlll = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "grass_side_snowed");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IIllIIIlIIlIlIlIIIII = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "mycelium_side");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.llIllIIlllllllllllll = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "mycelium_top");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.lllllIIllIlIllIllllI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "water_still");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IlIIIIIlIIllIIlIlIll = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "water_flow");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IllllIIlIlIllIIIllII = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "lava_still");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.lllllIIIIIlIIlllIlIl = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "lava_flow");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.lIIIIIlIlIIIlIIIIlIl = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "fire_layer_0");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IIllIIIlIIIIlIIlIIII = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "fire_layer_1");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IlIllllIIIlIllIlIIll = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "portal");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IIIllIIllIIIIIIlIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "glass");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IIIIIIIllllIlIIIIIII = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s) + "glass_pane_top");
            final String s2 = "minecraft:items/";
            net.optifine.util.IlIIIlIIIllllIlIlIlI.IIlllIIIllIllIIlIlIl = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s2) + "compass");
            net.optifine.util.IlIIIlIIIllllIlIlIlI.llIlllIlllllIIllIIII = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(String.valueOf(s2) + "clock");
        }
    }
    
    public static BufferedImage llllIIIIlIIIlIlllIll(final String s, final BufferedImage bufferedImage) {
        if (s.startsWith("/mob/zombie") || s.startsWith("/mob/pigzombie")) {
            final int width = bufferedImage.getWidth();
            final int height = bufferedImage.getHeight();
            if (width == height * 2) {
                final BufferedImage bufferedImage2 = new BufferedImage(width, height * 2, 2);
                final Graphics2D graphics = bufferedImage2.createGraphics();
                graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                graphics.drawImage(bufferedImage, 0, 0, width, height, null);
                return bufferedImage2;
            }
        }
        return bufferedImage;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        int i;
        for (i = 1; i < n; i *= 2) {}
        return i;
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n) {
        int i;
        int n2;
        for (i = 1, n2 = 0; i < n; i *= 2, ++n2) {}
        return n2;
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n) {
        int n2 = 1;
        for (int i = 0; i < n; ++i) {
            n2 *= 2;
        }
        return n2;
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll);
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
            return null;
        }
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(lIllllIllIllIIllllll);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, liiIlllIIIllIIIllIII);
        return liiIlllIIIllIIIllIII;
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (IlIlIlIlIlllllllllIl() != null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("*** Reloading custom textures ***");
            net.optifine.IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll();
            net.optifine.lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll();
            llllIIIIlIIIlIlllIll();
            net.optifine.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll();
            net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            net.optifine.lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl();
            net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll();
            net.optifine.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl();
            net.optifine.IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll();
            net.optifine.lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl();
            net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
            net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIIllIllIIlIlIl();
            net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll();
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI();
            net.optifine.IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll();
            net.optifine.IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl();
            net.optifine.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll();
            net.optifine.llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl();
            net.optifine.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll();
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().IlIlIlIlIlllllllllIl();
        }
    }
    
    public static IlIlIIIIIIlllIlIllIl IlIlIlIlIlllllllllIl() {
        return Minecraft.getMinecraft().IlIllllIIlIIlIlIlIll();
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIIllIIllIIllIIlIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl();
        if (ilIIllIIllIIllIIlIIl instanceof llIllIlIIIIllIlIIllI) {
            ((llIllIlIIIIllIlIIllI)ilIIllIIllIIllIIlIIl).llllIIIIlIIIlIlllIll(new net.optifine.util.IIIIIllIIIIlIIIIllIl());
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("optifine/TickableTextures"), new IIIIIIIIIlllIllIlIlI());
    }
    
    public static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll lIllllIllIllIIllllll, final String s) {
        if (!lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI().equals("minecraft")) {
            return lIllllIllIllIIllllll;
        }
        final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        final String llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, s);
        if (llllIIIIlIIIlIlllIll != ilIlIlIlIlllllllllIl) {
            lIllllIllIllIIllllll = new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll);
        }
        return lIllllIllIllIIllllll;
    }
    
    public static String llllIIIIlIIIlIlllIll(String s, String string) {
        final String s2 = "assets/minecraft/";
        if (s.startsWith(s2)) {
            s = s.substring(s2.length());
            return s;
        }
        if (s.startsWith("./")) {
            s = s.substring(2);
            if (!string.endsWith("/")) {
                string = String.valueOf(string) + "/";
            }
            s = String.valueOf(string) + s;
            return s;
        }
        if (s.startsWith("/~")) {
            s = s.substring(1);
        }
        final String s3 = "mcpatcher/";
        if (s.startsWith("~/")) {
            s = s.substring(2);
            s = String.valueOf(s3) + s;
            return s;
        }
        if (s.startsWith("/")) {
            s = String.valueOf(s3) + s.substring(1);
            return s;
        }
        return s;
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s) {
        final int lastIndex = s.lastIndexOf(47);
        return (lastIndex < 0) ? "" : s.substring(0, lastIndex);
    }
    
    public static void IlIIIlIlIIIllIlIlIIl() {
        if (GLContext.getCapabilities().GL_EXT_texture_filter_anisotropic) {
            GL11.glTexParameterf(3553, 34046, Math.min((float)net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll(), GL11.glGetFloat(34047)));
        }
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final int n) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(n);
    }
    
    public static boolean IlIlIIIllIllIIIIIllI(final int n) {
        return net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n) == n;
    }
    
    public static BufferedImage llllIIIIlIIIlIlllIll(final BufferedImage bufferedImage, final int n) {
        final int width = bufferedImage.getWidth();
        final int n2 = bufferedImage.getHeight() * n / width;
        final BufferedImage bufferedImage2 = new BufferedImage(n, n2, 2);
        final Graphics2D graphics = bufferedImage2.createGraphics();
        Object o = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        if (n < width || n % width != 0) {
            o = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        }
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, o);
        graphics.drawImage(bufferedImage, 0, 0, n, n2, null);
        return bufferedImage2;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (n == n2) {
            return n;
        }
        int i;
        for (i = n / n2 * n2; i < n; i += n2) {}
        return i;
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (n >= n2) {
            return n;
        }
        int i;
        for (i = n2 / n * n; i < n2; i += n) {}
        return i;
    }
    
    public static Dimension llllIIIIlIIIlIlllIll(final InputStream inputStream, final String s) {
        final Iterator<ImageReader> imageReadersBySuffix = ImageIO.getImageReadersBySuffix(s);
        while (imageReadersBySuffix.hasNext()) {
            final ImageReader imageReader = imageReadersBySuffix.next();
            Dimension dimension;
            try {
                imageReader.setInput(ImageIO.createImageInputStream(inputStream));
                dimension = new Dimension(imageReader.getWidth(imageReader.getMinIndex()), imageReader.getHeight(imageReader.getMinIndex()));
            }
            catch (IOException ex) {
                continue;
            }
            finally {
                imageReader.dispose();
            }
            imageReader.dispose();
            return dimension;
        }
        return null;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final int[][] llllIIIIlIIIlIlllIll = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(0);
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final int[] array = llllIIIIlIIIlIlllIll[i];
            if (array == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(i + ": " + array);
            }
            else {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(i + ": " + array.length);
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2, final int n3, final int n4) {
        IlIIIlIlIIIllIlIlIIl(n);
        GL11.glPixelStorei(3333, 1);
        GL11.glPixelStorei(3317, 1);
        final File parentFile = new File(s).getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        for (int i = 0; i < 16; ++i) {
            new File(String.valueOf(s) + "_" + i + ".png").delete();
        }
        for (int j = 0; j <= n2; ++j) {
            final File file = new File(String.valueOf(s) + "_" + j + ".png");
            final int n5 = n3 >> j;
            final int n6 = n4 >> j;
            final int n7 = n5 * n6;
            final IntBuffer intBuffer = BufferUtils.createIntBuffer(n7);
            final int[] array = new int[n7];
            GL11.glGetTexImage(3553, j, 32993, 33639, intBuffer);
            intBuffer.get(array);
            final BufferedImage bufferedImage = new BufferedImage(n5, n6, 2);
            bufferedImage.setRGB(0, 0, n5, n6, array, 0, n5);
            try {
                ImageIO.write(bufferedImage, "png", file);
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Exported: " + file);
            }
            catch (Exception ex) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error writing: " + file);
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(ex.getClass().getName() + ": " + ex.getMessage());
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n) {
        final int llIllIIIIIllIlIIIIlI = ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI();
        final int ilIIIlIlIIIllIlIlIIl = ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI() < 1) {
            final ArrayList<int[][]> list = new ArrayList<int[][]>();
            final int[][] array = new int[n + 1][];
            array[0] = new int[llIllIIIIIllIlIIIIlI * ilIIIlIlIIIllIlIlIIl];
            list.add(array);
            ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(list);
        }
        final ArrayList<int[][]> list2 = new ArrayList<int[][]>();
        for (int llIllIlIIIIllIlIIllI = ilIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI(), i = 0; i < llIllIlIIIIllIlIIllI; ++i) {
            int[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, i, 0);
            if (llllIIIIlIIIlIlllIll == null || llllIIIIlIIIlIlllIll.length < 1) {
                llllIIIIlIIIlIlllIll = new int[llIllIIIIIllIlIIIIlI * ilIIIlIlIIIllIlIlIIl];
            }
            if (llllIIIIlIIIlIlllIll.length != llIllIIIIIllIlIIIIlI * ilIIIlIlIIIllIlIlIIl) {
                int n2 = (int)Math.round(Math.sqrt(llllIIIIlIIIlIlllIll.length));
                if (n2 * n2 != llllIIIIlIIIlIlllIll.length) {
                    llllIIIIlIIIlIlllIll = new int[] { 0 };
                    n2 = 1;
                }
                final BufferedImage bufferedImage = new BufferedImage(n2, n2, 2);
                bufferedImage.setRGB(0, 0, n2, n2, llllIIIIlIIIlIlllIll, 0, n2);
                final BufferedImage llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(bufferedImage, llIllIIIIIllIlIIIIlI);
                final int[] array2 = new int[llIllIIIIIllIlIIIIlI * ilIIIlIlIIIllIlIlIIl];
                llllIIIIlIIIlIlllIll2.getRGB(0, 0, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, array2, 0, llIllIIIIIllIlIIIIlI);
                llllIIIIlIIIlIlllIll = array2;
            }
            final int[][] array3 = new int[n + 1][];
            array3[0] = llllIIIIlIIIlIlllIll;
            list2.add(array3);
        }
        ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(list2);
        ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl(n);
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n, final int n2) {
        final List ilIlIIIIIIlllIlIllIl = ilIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl();
        if (ilIlIIIIIIlllIlIllIl.size() <= n) {
            return null;
        }
        final int[][] array = ilIlIIIIIIlllIlIllIl.get(n);
        if (array != null && array.length > n2) {
            return array[n2];
        }
        return null;
    }
    
    public static int IlIlIIIllIllIIIIIllI() {
        for (int i = 65536; i > 0; i >>= 1) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(32868, 0, 6408, i, i, 0, 6408, 5121, null);
            GL11.glGetError();
            if (net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(32868, 0, 4096) != 0) {
                return i;
            }
        }
        return -1;
    }
}
