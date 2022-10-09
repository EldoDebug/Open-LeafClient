package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.optifine.util.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.awt.image.*;
import org.apache.commons.io.*;
import java.io.*;
import org.lwjgl.opengl.*;
import leaf.*;
import net.minecraft.client.*;
import com.ibm.icu.text.*;
import net.optifine.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.util.*;

public class FontRenderer implements IIIIlllIIIIIIlIIIlll
{
    private static final lIllllIllIllIIllllll[] IllIIlllIIIIlllIIlIl;
    private final int[] llllIIIlIlllIlIIIIIl;
    public int llllIIIIlIIIlIlllIll;
    public Random IlIlIlIlIlllllllllIl;
    private byte[] lIIIIlIIIIIlllIllIII;
    private int[] lIIIlllIIIllIIIllIII;
    private lIllllIllIllIIllllll llIIlIIIlIIIllIlIIIl;
    private final IIlllIIlIllIllIlIIll llIllIlIIIIllIlIIllI;
    private float lIlIlIIIllIIllIIIllI;
    private float IlIlIIIllIIllIlllllI;
    private boolean IIIIlllIIIIIIlIIIlll;
    private boolean llllIIllllIlIlIIIIll;
    private float IlIllIlIlIIIlIlIlIII;
    private float IIlllIIlIllIllIlIIll;
    private float lllIIIIlllllIlIIllIl;
    private float IlIlIIIIIIlllIlIllIl;
    private int IIllIIllIIIlIlIIIIlI;
    private boolean IIIlIIIlIlIIlllIIlll;
    private boolean IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    private boolean IIlIIIIlllIlllllIlII;
    private boolean IIIlIIlIIIIlllIlllII;
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    public lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    private float[] IlIlIllllllllIIIIlII;
    private boolean IIlllIlIIllIlIlIlIIl;
    private IllIIlllIIIIlllIIlIl llIIIlIlIllIIlIlIlII;
    
    static {
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll[256];
    }
    
    public FontRenderer(final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final IIlllIIlIllIllIlIIll llIllIlIIIIllIlIIllI, final boolean iiiIlllIIIIIIlIIIlll) {
        this.llllIIIlIlllIlIIIIIl = new int[256];
        this.llllIIIIlIIIlIlllIll = 9;
        this.IlIlIlIlIlllllllllIl = new Random();
        this.lIIIIlIIIIIlllIllIII = new byte[65536];
        this.lIIIlllIIIllIIIllIII = new int[32];
        this.IlIlIIIllIllIIIIIllI = 1.0f;
        this.IlIlIllllllllIIIIlII = new float[256];
        this.IIlllIlIIllIlIlIlIIl = false;
        this.llIIIlIlIllIIlIlIlII = new IllIIlllIIIIlllIIlIl();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIllllIllIllIIllllll;
        this.llIIlIIIlIIIllIlIIIl = lIllllIllIllIIllllll;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl = net.optifine.util.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl));
        for (int i = 0; i < 32; ++i) {
            final int n = (i >> 3 & 0x1) * 85;
            int n2 = (i >> 2 & 0x1) * 170 + n;
            int n3 = (i >> 1 & 0x1) * 170 + n;
            int n4 = (i >> 0 & 0x1) * 170 + n;
            if (i == 6) {
                n2 += 85;
            }
            if (llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI) {
                final int n5 = (n2 * 30 + n3 * 59 + n4 * 11) / 100;
                final int n6 = (n2 * 30 + n3 * 70) / 100;
                final int n7 = (n2 * 30 + n4 * 70) / 100;
                n2 = n5;
                n3 = n6;
                n4 = n7;
            }
            if (i >= 16) {
                n2 /= 4;
                n3 /= 4;
                n4 /= 4;
            }
            this.lIIIlllIIIllIIIllIII[i] = ((n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | (n4 & 0xFF));
        }
        this.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.llIIlIIIlIIIllIlIIIl = net.optifine.util.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl);
        for (int i = 0; i < FontRenderer.IllIIlllIIIIlllIIlIl.length; ++i) {
            FontRenderer.IllIIlllIIIIlllIIlIl[i] = null;
        }
        this.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIIIllIllIIIIIllI();
    }
    
    private void IlIIIlIlIIIllIlIlIIl() {
        BufferedImage llllIIIIlIIIlIlllIll;
        try {
            llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl));
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        final Properties llllIIIIlIIIlIlllIll2 = net.optifine.util.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl);
        this.IIlllIlIIllIlIlIlIIl = net.optifine.util.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, "blend", false);
        final int width = llllIIIIlIIIlIlllIll.getWidth();
        final int height = llllIIIIlIIIlIlllIll.getHeight();
        final int n = width / 16;
        final int n2 = height / 16;
        final float n3 = width / 128.0f;
        this.IlIlIIIllIllIIIIIllI = 1.0f / net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n3, 1.0f, 2.0f);
        final float llllIIIIlIIIlIlllIll3 = net.optifine.util.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, "offsetBold", -1.0f);
        if (llllIIIIlIIIlIlllIll3 >= 0.0f) {
            this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll3;
        }
        final int[] array = new int[width * height];
        llllIIIIlIIIlIlllIll.getRGB(0, 0, width, height, array, 0, width);
        for (int i = 0; i < 256; ++i) {
            final int n4 = i % 16;
            final int n5 = i / 16;
            int j;
            for (j = n - 1; j >= 0; --j) {
                final int n6 = n4 * n + j;
                boolean b = true;
                for (int n7 = 0; n7 < n2 && b; ++n7) {
                    if ((array[n6 + (n5 * n2 + n7) * width] >> 24 & 0xFF) > 16) {
                        b = false;
                    }
                }
                if (!b) {
                    break;
                }
            }
            if (i == 32) {
                if (n <= 8) {
                    j = (int)(2.0f * n3);
                }
                else {
                    j = (int)(1.5f * n3);
                }
            }
            this.IlIlIllllllllIIIIlII[i] = (j + 1) / n3 + 1.0f;
        }
        net.optifine.util.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, this.IlIlIllllllllIIIIlII);
        for (int k = 0; k < this.llllIIIlIlllIlIIIIIl.length; ++k) {
            this.llllIIIlIlllIlIIIIIl[k] = Math.round(this.IlIlIllllllllIIIIlII[k]);
        }
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        InputStream ilIlIlIlIlllllllllIl = null;
        try {
            ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll("font/glyph_sizes.bin"));
            ilIlIlIlIlllllllllIl.read(this.lIIIIlIIIIIlllIllIII);
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        finally {
            IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
        }
        IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
    }
    
    private float llllIIIIlIIIlIlllIll(final char c, final boolean b) {
        if (c != ' ' && c != '?') {
            final int index = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8Åí\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1????Å ???Å·Å‚\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261Å}\u2265\u2264\u2320\u2321\u00f7\u2248Åã\u2219ÅE\u221a\u207f?\u25a0\u0000".indexOf(c);
            return (index != -1 && !this.IIIIlllIIIIIIlIIIlll) ? this.llllIIIIlIIIlIlllIll(index, b) : this.IlIlIlIlIlllllllllIl(c, b);
        }
        return this.IIIIlllIIIIIIlIIIlll ? 4.0f : this.IlIlIllllllllIIIIlII[c];
    }
    
    private float llllIIIIlIIIlIlllIll(final int n, final boolean b) {
        final int n2 = n % 16 * 8;
        final int n3 = n / 16 * 8;
        final boolean b2 = b;
        this.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl);
        final float n4 = this.IlIlIllllllllIIIIlII[n];
        final float n5 = 7.99f;
        GL11.glBegin(5);
        GL11.glTexCoord2f(n2 / 128.0f, n3 / 128.0f);
        GL11.glVertex3f(this.lIlIlIIIllIIllIIIllI + (float)(b2 ? 1 : 0), this.IlIlIIIllIIllIlllllI, 0.0f);
        GL11.glTexCoord2f(n2 / 128.0f, (n3 + 7.99f) / 128.0f);
        GL11.glVertex3f(this.lIlIlIIIllIIllIIIllI - (float)(b2 ? 1 : 0), this.IlIlIIIllIIllIlllllI + 7.99f, 0.0f);
        GL11.glTexCoord2f((n2 + n5 - 1.0f) / 128.0f, n3 / 128.0f);
        GL11.glVertex3f(this.lIlIlIIIllIIllIIIllI + n5 - 1.0f + (float)(b2 ? 1 : 0), this.IlIlIIIllIIllIlllllI, 0.0f);
        GL11.glTexCoord2f((n2 + n5 - 1.0f) / 128.0f, (n3 + 7.99f) / 128.0f);
        GL11.glVertex3f(this.lIlIlIIIllIIllIIIllI + n5 - 1.0f - (float)(b2 ? 1 : 0), this.IlIlIIIllIIllIlllllI + 7.99f, 0.0f);
        GL11.glEnd();
        return n4;
    }
    
    private lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final int n) {
        if (FontRenderer.IllIIlllIIIIlllIIlIl[n] == null) {
            FontRenderer.IllIIlllIIIIlllIIlIl[n] = new lIllllIllIllIIllllll(String.format("textures/font/unicode_page_%02x.png", n));
            FontRenderer.IllIIlllIIIIlllIIlIl[n] = net.optifine.util.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(FontRenderer.IllIIlllIIIIlllIIlIl[n]);
        }
        return FontRenderer.IllIIlllIIIIlllIIlIl[n];
    }
    
    private void IlIlIlIlIlllllllllIl(final int n) {
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(n));
    }
    
    private float IlIlIlIlIlllllllllIl(final char c, final boolean b) {
        if (this.lIIIIlIIIIIlllIllIII[c] == 0) {
            return 0.0f;
        }
        this.IlIlIlIlIlllllllllIl(c / '\u0100');
        final int n = this.lIIIIlIIIIIlllIllIII[c] >>> 4;
        final int n2 = this.lIIIIlIIIIIlllIllIII[c] & 0xF;
        final float n3 = (float)n;
        final float n4 = (float)(n2 + 1);
        final float n5 = c % '\u0010' * 16 + n3;
        final float n6 = (float)((c & '\u00ff') / 16 * 16);
        final float n7 = n4 - n3 - 0.02f;
        final float n8 = b ? 1.0f : 0.0f;
        GL11.glBegin(5);
        GL11.glTexCoord2f(n5 / 256.0f, n6 / 256.0f);
        GL11.glVertex3f(this.lIlIlIIIllIIllIIIllI + n8, this.IlIlIIIllIIllIlllllI, 0.0f);
        GL11.glTexCoord2f(n5 / 256.0f, (n6 + 15.98f) / 256.0f);
        GL11.glVertex3f(this.lIlIlIIIllIIllIIIllI - n8, this.IlIlIIIllIIllIlllllI + 7.99f, 0.0f);
        GL11.glTexCoord2f((n5 + n7) / 256.0f, n6 / 256.0f);
        GL11.glVertex3f(this.lIlIlIIIllIIllIIIllI + n7 / 2.0f + n8, this.IlIlIIIllIIllIlllllI, 0.0f);
        GL11.glTexCoord2f((n5 + n7) / 256.0f, (n6 + 15.98f) / 256.0f);
        GL11.glVertex3f(this.lIlIlIIIllIIllIIIllI + n7 / 2.0f - n8, this.IlIlIIIllIIllIlllllI + 7.99f, 0.0f);
        GL11.glEnd();
        return (n4 - n3) / 2.0f + 1.0f;
    }
    
    public int llllIIIIlIIIlIlllIll(final String s, final float n, final float n2, final int n3) {
        return this.llllIIIIlIIIlIlllIll(s, n, n2, n3, true);
    }
    
    public int llllIIIIlIIIlIlllIll(final String s, final int n, final int n2, final int n3) {
        return this.llllIIIIlIIIlIlllIll(s, (float)n, (float)n2, n3, false);
    }
    
    public int llllIIIIlIIIlIlllIll(String s, final float n, final float n2, final int n3, final boolean b) {
        if (Leaf.instance.modManager.nickHiderMod.lIlIlIIIllIIllIIIllI()) {
            if (s.contains(Minecraft.getMinecraft().session.llIllIIIIIllIlIIIIlI()) && !(Minecraft.getMinecraft().IIIIlllIIIIIIlIIIlll instanceof lllIllIIIllllllIllll)) {
                s = s.replace(Minecraft.getMinecraft().session.llIllIIIIIllIlIIIIlI(), "You");
            }
            if (Leaf.instance.modManager.nickHiderMod.nickOther && Minecraft.getMinecraft().IllIIlllIIIIlllIIlIl != null) {
                for (final net.minecraft.client.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll : Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
                    if (iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl() != null && s.contains(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl().lIIIlllIIIllIIIllIII())) {
                        s = s.replace(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl().lIIIlllIIIllIIIllIII(), Leaf.instance.modManager.nickHiderMod.nickName);
                    }
                }
            }
        }
        this.llIllIIIIIllIlIIIIlI();
        if (this.IIlllIlIIllIlIlIlIIl) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llIIIlIlIllIIlIlIlII);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
        }
        this.IllIIlllIIIIlllIIlIl();
        int n4;
        if (b) {
            n4 = Math.max(this.IlIlIlIlIlllllllllIl(s, n + 1.0f, n2 + 1.0f, n3, true), this.IlIlIlIlIlllllllllIl(s, n, n2, n3, false));
        }
        else {
            n4 = this.IlIlIlIlIlllllllllIl(s, n, n2, n3, false);
        }
        if (this.IIlllIlIIllIlIlIlIIl) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII);
        }
        return n4;
    }
    
    private String llIllIIIIIllIlIIIIlI(final String s) {
        try {
            final Bidi bidi = new Bidi(new ArabicShaping(8).shape(s), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (ArabicShapingException ex) {
            return s;
        }
    }
    
    private void IllIIlllIIIIlllIIlIl() {
        this.IIIlIIIlIlIIlllIIlll = false;
        this.IlIlIIIlIIlIlIIlllIl = false;
        this.IlllllllIIIlIIIlIlII = false;
        this.IIlIIIIlllIlllllIlII = false;
        this.IIIlIIlIIIIlllIlllII = false;
    }
    
    private void llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        for (int i = 0; i < s.length(); ++i) {
            char char1 = s.charAt(i);
            if (char1 == 'Åò' && i + 1 < s.length()) {
                int index = "0123456789abcdefklmnor".indexOf(s.toLowerCase(Locale.ENGLISH).charAt(i + 1));
                if (index < 16) {
                    this.IIIlIIIlIlIIlllIIlll = false;
                    this.IlIlIIIlIIlIlIIlllIl = false;
                    this.IIIlIIlIIIIlllIlllII = false;
                    this.IIlIIIIlllIlllllIlII = false;
                    this.IlllllllIIIlIIIlIlII = false;
                    if (index < 0 || index > 15) {
                        index = 15;
                    }
                    if (b) {
                        index += 16;
                    }
                    int llllIIIIlIIIlIlllIll = this.lIIIlllIIIllIIIllIII[index];
                    if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                        llllIIIIlIIIlIlllIll = net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(index, llllIIIIlIIIlIlllIll);
                    }
                    this.IIllIIllIIIlIlIIIIlI = llllIIIIlIIIlIlllIll;
                    this.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll >> 16) / 255.0f, (llllIIIIlIIIlIlllIll >> 8 & 0xFF) / 255.0f, (llllIIIIlIIIlIlllIll & 0xFF) / 255.0f, this.IlIlIIIIIIlllIlIllIl);
                }
                else if (index == 16) {
                    this.IIIlIIIlIlIIlllIIlll = true;
                }
                else if (index == 17) {
                    this.IlIlIIIlIIlIlIIlllIl = true;
                }
                else if (index == 18) {
                    this.IIIlIIlIIIIlllIlllII = true;
                }
                else if (index == 19) {
                    this.IIlIIIIlllIlllllIlII = true;
                }
                else if (index == 20) {
                    this.IlllllllIIIlIIIlIlII = true;
                }
                else if (index == 21) {
                    this.IIIlIIIlIlIIlllIIlll = false;
                    this.IlIlIIIlIIlIlIIlllIl = false;
                    this.IIIlIIlIIIIlllIlllII = false;
                    this.IIlIIIIlllIlllllIlII = false;
                    this.IlllllllIIIlIIIlIlII = false;
                    this.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll, this.lllIIIIlllllIlIIllIl, this.IlIlIIIIIIlllIlIllIl);
                }
                ++i;
            }
            else {
                int n = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8Åí\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1????Å ???Å·Å‚\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261Å}\u2265\u2264\u2320\u2321\u00f7\u2248Åã\u2219ÅE\u221a\u207f?\u25a0\u0000".indexOf(char1);
                if (this.IIIlIIIlIlIIlllIIlll && n != -1) {
                    char char2;
                    do {
                        n = this.IlIlIlIlIlllllllllIl.nextInt("\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8Åí\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1????Å ???Å·Å‚\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261Å}\u2265\u2264\u2320\u2321\u00f7\u2248Åã\u2219ÅE\u221a\u207f?\u25a0\u0000".length());
                        char2 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8Åí\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1????Å ???Å·Å‚\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261Å}\u2265\u2264\u2320\u2321\u00f7\u2248Åã\u2219ÅE\u221a\u207f?\u25a0\u0000".charAt(n);
                    } while (this.llllIIIIlIIIlIlllIll(char1) != this.llllIIIIlIIIlIlllIll(char2));
                    char1 = char2;
                }
                final float n2 = (n != -1 && !this.IIIIlllIIIIIIlIIIlll) ? this.IlIlIIIllIllIIIIIllI : 0.5f;
                final boolean b2 = (char1 == '\0' || n == -1 || this.IIIIlllIIIIIIlIIIlll) && b;
                if (b2) {
                    this.lIlIlIIIllIIllIIIllI -= n2;
                    this.IlIlIIIllIIllIlllllI -= n2;
                }
                float llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(char1, this.IlllllllIIIlIIIlIlII);
                if (b2) {
                    this.lIlIlIIIllIIllIIIllI += n2;
                    this.IlIlIIIllIIllIlllllI += n2;
                }
                if (this.IlIlIIIlIIlIlIIlllIl) {
                    this.lIlIlIIIllIIllIIIllI += n2;
                    if (b2) {
                        this.lIlIlIIIllIIllIIIllI -= n2;
                        this.IlIlIIIllIIllIlllllI -= n2;
                    }
                    this.llllIIIIlIIIlIlllIll(char1, this.IlllllllIIIlIIIlIlII);
                    this.lIlIlIIIllIIllIIIllI -= n2;
                    if (b2) {
                        this.lIlIlIIIllIIllIIIllI += n2;
                        this.IlIlIIIllIIllIlllllI += n2;
                    }
                    llllIIIIlIIIlIlllIll2 += n2;
                }
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final float n) {
        if (this.IIIlIIlIIIIlllIlllII) {
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI + this.llllIIIIlIIIlIlllIll / 2, 0.0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI + n, this.IlIlIIIllIIllIlllllI + this.llllIIIIlIIIlIlllIll / 2, 0.0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI + n, this.IlIlIIIllIIllIlllllI + this.llllIIIIlIIIlIlllIll / 2 - 1.0f, 0.0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI + this.llllIIIIlIIIlIlllIll / 2 - 1.0f, 0.0).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        }
        if (this.IIlIIIIlllIlllllIlII) {
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
            final int n2 = this.IIlIIIIlllIlllllIlII ? -1 : 0;
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI + n2, this.IlIlIIIllIIllIlllllI + this.llllIIIIlIIIlIlllIll, 0.0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI + n, this.IlIlIIIllIIllIlllllI + this.llllIIIIlIIIlIlllIll, 0.0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI + n, this.IlIlIIIllIIllIlllllI + this.llllIIIIlIIIlIlllIll - 1.0f, 0.0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI + n2, this.IlIlIIIllIIllIlllllI + this.llllIIIIlIIIlIlllIll - 1.0f, 0.0).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        }
        this.lIlIlIIIllIIllIIIllI += n;
    }
    
    private int llllIIIIlIIIlIlllIll(final String s, int n, final int n2, final int n3, final int n4, final boolean b) {
        if (this.llllIIllllIlIlIIIIll) {
            n = n + n3 - this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI(s));
        }
        return this.IlIlIlIlIlllllllllIl(s, (float)n, (float)n2, n4, b);
    }
    
    private int IlIlIlIlIlllllllllIl(String llIllIIIIIllIlIIIIlI, final float lIlIlIIIllIIllIIIllI, final float ilIlIIIllIIllIlllllI, int n, final boolean b) {
        if (llIllIIIIIllIlIIIIlI == null) {
            return 0;
        }
        if (this.llllIIllllIlIlIIIIll) {
            llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI);
        }
        if ((n & 0xFC000000) == 0x0) {
            n |= 0xFF000000;
        }
        if (b) {
            n = ((n & 0xFCFCFC) >> 2 | (n & 0xFF000000));
        }
        this.IlIllIlIlIIIlIlIlIII = (n >> 16 & 0xFF) / 255.0f;
        this.IIlllIIlIllIllIlIIll = (n >> 8 & 0xFF) / 255.0f;
        this.lllIIIIlllllIlIIllIl = (n & 0xFF) / 255.0f;
        this.IlIlIIIIIIlllIlIllIl = (n >> 24 & 0xFF) / 255.0f;
        this.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll, this.lllIIIIlllllIlIIllIl, this.IlIlIIIIIIlllIlIllIl);
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, b);
        return (int)this.lIlIlIIIllIIllIIIllI;
    }
    
    public int llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            return 0;
        }
        float n = 0.0f;
        boolean b = false;
        for (int i = 0; i < s.length(); ++i) {
            float llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(s.charAt(i));
            if (llIllIIIIIllIlIIIIlI < 0.0f && i < s.length() - 1) {
                ++i;
                final char char1 = s.charAt(i);
                if (char1 != 'l' && char1 != 'L') {
                    if (char1 == 'r' || char1 == 'R') {
                        b = false;
                    }
                }
                else {
                    b = true;
                }
                llIllIIIIIllIlIIIIlI = 0.0f;
            }
            n += llIllIIIIIllIlIIIIlI;
            if (b && llIllIIIIIllIlIIIIlI > 0.0f) {
                n += (this.IIIIlllIIIIIIlIIIlll ? 1.0f : this.IlIlIIIllIllIIIIIllI);
            }
        }
        return Math.round(n);
    }
    
    public int llllIIIIlIIIlIlllIll(final char c) {
        return Math.round(this.llIllIIIIIllIlIIIIlI(c));
    }
    
    private float llIllIIIIIllIlIIIIlI(final char c) {
        if (c == 'Åò') {
            return -1.0f;
        }
        if (c == ' ' || c == '?') {
            return this.IlIlIllllllllIIIIlII[32];
        }
        final int index = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8Åí\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1????Å ???Å·Å‚\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261Å}\u2265\u2264\u2320\u2321\u00f7\u2248Åã\u2219ÅE\u221a\u207f?\u25a0\u0000".indexOf(c);
        if (c > '\0' && index != -1 && !this.IIIIlllIIIIIIlIIIlll) {
            return this.IlIlIllllllllIIIIlII[index];
        }
        if (this.lIIIIlIIIIIlllIllIII[c] != 0) {
            int n = this.lIIIIlIIIIIlllIllIII[c] >>> 4;
            int n2 = this.lIIIIlIIIIIlllIllIII[c] & 0xF;
            if (n2 > 7) {
                n2 = 15;
                n = 0;
            }
            return (float)((++n2 - n) / 2 + 1);
        }
        return 0.0f;
    }
    
    public String llllIIIIlIIIlIlllIll(final String s, final int n) {
        return this.llllIIIIlIIIlIlllIll(s, n, false);
    }
    
    public String llllIIIIlIIIlIlllIll(final String s, final int n, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        float n2 = 0.0f;
        final int n3 = b ? (s.length() - 1) : 0;
        final int n4 = b ? -1 : 1;
        int n5 = 0;
        boolean b2 = false;
        for (int n6 = n3; n6 >= 0 && n6 < s.length() && n2 < n; n6 += n4) {
            final char char1 = s.charAt(n6);
            final float llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(char1);
            if (n5 != 0) {
                n5 = 0;
                if (char1 != 'l' && char1 != 'L') {
                    if (char1 == 'r' || char1 == 'R') {
                        b2 = false;
                    }
                }
                else {
                    b2 = true;
                }
            }
            else if (llIllIIIIIllIlIIIIlI < 0.0f) {
                n5 = 1;
            }
            else {
                n2 += llIllIIIIIllIlIIIIlI;
                if (b2) {
                    ++n2;
                }
            }
            if (n2 > n) {
                break;
            }
            if (b) {
                sb.insert(0, char1);
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    private String IlIIIlIlIIIllIlIlIIl(String substring) {
        while (substring != null && substring.endsWith("\n")) {
            substring = substring.substring(0, substring.length() - 1);
        }
        return substring;
    }
    
    public void llllIIIIlIIIlIlllIll(String ilIIIlIlIIIllIlIlIIl, final int n, final int n2, final int n3, final int iIllIIllIIIlIlIIIIlI) {
        if (this.IIlllIlIIllIlIlIlIIl) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.llIIIlIlIllIIlIlIlII);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
        }
        this.IllIIlllIIIIlllIIlIl();
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
        ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n, n2, n3, false);
        if (this.IIlllIlIIllIlIlIlIIl) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final String s, final int n, int n2, final int n3, final boolean b) {
        final Iterator<String> iterator = this.llIllIIIIIllIlIIIIlI(s, n3).iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(iterator.next(), n, n2, n3, this.IIllIIllIIIlIlIIIIlI, b);
            n2 += this.llllIIIIlIIIlIlllIll;
        }
    }
    
    public int IlIlIlIlIlllllllllIl(final String s, final int n) {
        return this.llllIIIIlIIIlIlllIll * this.llIllIIIIIllIlIIIIlI(s, n).size();
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public List llIllIIIIIllIlIIIIlI(final String s, final int n) {
        return Arrays.asList(this.IlIIIlIlIIIllIlIlIIl(s, n).split("\n"));
    }
    
    String IlIIIlIlIIIllIlIlIIl(final String s, final int n) {
        if (s.length() <= 1) {
            return s;
        }
        final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(s, n);
        if (s.length() <= ilIlIIIllIllIIIIIllI) {
            return s;
        }
        final String substring = s.substring(0, ilIlIIIllIllIIIIIllI);
        final char char1 = s.charAt(ilIlIIIllIllIIIIIllI);
        return String.valueOf(substring) + "\n" + this.IlIIIlIlIIIllIlIlIIl(String.valueOf(IlIlIlIlIlllllllllIl(substring)) + s.substring(ilIlIIIllIllIIIIIllI + ((char1 == ' ' || char1 == '\n') ? 1 : 0)), n);
    }
    
    private int IlIlIIIllIllIIIIIllI(final String s, final int n) {
        final int length = s.length();
        float n2 = 0.0f;
        int i = 0;
        int n3 = -1;
        int n4 = 0;
        while (i < length) {
            final char char1 = s.charAt(i);
            Label_0164: {
                switch (char1) {
                    case 10: {
                        --i;
                        break Label_0164;
                    }
                    case 32: {
                        n3 = i;
                        break;
                    }
                    case 167: {
                        if (i >= length - 1) {
                            break Label_0164;
                        }
                        ++i;
                        final char char2 = s.charAt(i);
                        if (char2 == 'l' || char2 == 'L') {
                            n4 = 1;
                            break Label_0164;
                        }
                        if (char2 == 'r' || char2 == 'R' || IlIIIlIlIIIllIlIlIIl(char2)) {
                            n4 = 0;
                        }
                        break Label_0164;
                    }
                }
                n2 += this.llllIIIIlIIIlIlllIll(char1);
                if (n4 != 0) {
                    ++n2;
                }
            }
            if (char1 == '\n') {
                n3 = ++i;
                break;
            }
            if (Math.round(n2) > n) {
                break;
            }
            ++i;
        }
        return (i != length && n3 != -1 && n3 < i) ? n3 : i;
    }
    
    private static boolean IlIIIlIlIIIllIlIlIIl(final char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }
    
    private static boolean IlIlIIIllIllIIIIIllI(final char c) {
        return (c >= 'k' && c <= 'o') || (c >= 'K' && c <= 'O') || c == 'r' || c == 'R';
    }
    
    public static String IlIlIlIlIlllllllllIl(final String s) {
        String s2 = "";
        int index = -1;
        final int length = s.length();
        while ((index = s.indexOf(167, index + 1)) != -1) {
            if (index < length - 1) {
                final char char1 = s.charAt(index + 1);
                if (IlIIIlIlIIIllIlIlIIl(char1)) {
                    s2 = "Åò" + char1;
                }
                else {
                    if (!IlIlIIIllIllIIIIIllI(char1)) {
                        continue;
                    }
                    s2 = String.valueOf(s2) + "Åò" + char1;
                }
            }
        }
        return s2;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public int IlIlIlIlIlllllllllIl(final char c) {
        final int index = "0123456789abcdef".indexOf(c);
        if (index >= 0 && index < this.lIIIlllIIIllIIIllIII.length) {
            int llllIIIIlIIIlIlllIll = this.lIIIlllIIIllIIIllIII[index];
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                llllIIIIlIIIlIlllIll = net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(index, llllIIIIlIIIlIlllIll);
            }
            return llllIIIIlIIIlIlllIll;
        }
        return 16777215;
    }
    
    protected void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4) {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n, n2, n3, n4);
    }
    
    protected void llIllIIIIIllIlIIIIlI() {
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
    }
    
    protected void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
    }
    
    protected InputStream IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return Minecraft.getMinecraft().llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll).IlIlIlIlIlllllllllIl();
    }
}
