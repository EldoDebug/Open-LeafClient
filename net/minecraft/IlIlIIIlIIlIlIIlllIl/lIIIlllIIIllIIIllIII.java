package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public enum lIIIlllIIIllIIIllIII
{
    llllIIIIlIIIlIlllIll("BASE", 0, "base", "b"), 
    IlIlIlIlIlllllllllIl("SQUARE_BOTTOM_LEFT", 1, "square_bottom_left", "bl", "   ", "   ", "#  "), 
    llIllIIIIIllIlIIIIlI("SQUARE_BOTTOM_RIGHT", 2, "square_bottom_right", "br", "   ", "   ", "  #"), 
    IlIIIlIlIIIllIlIlIIl("SQUARE_TOP_LEFT", 3, "square_top_left", "tl", "#  ", "   ", "   "), 
    IlIlIIIllIllIIIIIllI("SQUARE_TOP_RIGHT", 4, "square_top_right", "tr", "  #", "   ", "   "), 
    IllIIlllIIIIlllIIlIl("STRIPE_BOTTOM", 5, "stripe_bottom", "bs", "   ", "   ", "###"), 
    llllIIIlIlllIlIIIIIl("STRIPE_TOP", 6, "stripe_top", "ts", "###", "   ", "   "), 
    lIIIIlIIIIIlllIllIII("STRIPE_LEFT", 7, "stripe_left", "ls", "#  ", "#  ", "#  "), 
    lIIIlllIIIllIIIllIII("STRIPE_RIGHT", 8, "stripe_right", "rs", "  #", "  #", "  #"), 
    llIIlIIIlIIIllIlIIIl("STRIPE_CENTER", 9, "stripe_center", "cs", " # ", " # ", " # "), 
    llIllIlIIIIllIlIIllI("STRIPE_MIDDLE", 10, "stripe_middle", "ms", "   ", "###", "   "), 
    lIlIlIIIllIIllIIIllI("STRIPE_DOWNRIGHT", 11, "stripe_downright", "drs", "#  ", " # ", "  #"), 
    IlIlIIIllIIllIlllllI("STRIPE_DOWNLEFT", 12, "stripe_downleft", "dls", "  #", " # ", "#  "), 
    IIIIlllIIIIIIlIIIlll("STRIPE_SMALL", 13, "small_stripes", "ss", "# #", "# #", "   "), 
    llllIIllllIlIlIIIIll("CROSS", 14, "cross", "cr", "# #", " # ", "# #"), 
    IlIllIlIlIIIlIlIlIII("STRAIGHT_CROSS", 15, "straight_cross", "sc", " # ", "###", " # "), 
    IIlllIIlIllIllIlIIll("TRIANGLE_BOTTOM", 16, "triangle_bottom", "bt", "   ", " # ", "# #"), 
    lllIIIIlllllIlIIllIl("TRIANGLE_TOP", 17, "triangle_top", "tt", "# #", " # ", "   "), 
    IlIlIIIIIIlllIlIllIl("TRIANGLES_BOTTOM", 18, "triangles_bottom", "bts", "   ", "# #", " # "), 
    IIllIIllIIIlIlIIIIlI("TRIANGLES_TOP", 19, "triangles_top", "tts", " # ", "# #", "   "), 
    IIIlIIIlIlIIlllIIlll("DIAGONAL_LEFT", 20, "diagonal_left", "ld", "## ", "#  ", "   "), 
    IlIlIIIlIIlIlIIlllIl("DIAGONAL_RIGHT", 21, "diagonal_up_right", "rd", "   ", "  #", " ##"), 
    IlllllllIIIlIIIlIlII("DIAGONAL_LEFT_MIRROR", 22, "diagonal_up_left", "lud", "   ", "#  ", "## "), 
    IIlIIIIlllIlllllIlII("DIAGONAL_RIGHT_MIRROR", 23, "diagonal_right", "rud", " ##", "  #", "   "), 
    IIIlIIlIIIIlllIlllII("CIRCLE_MIDDLE", 24, "circle", "mc", "   ", " # ", "   "), 
    IlIlIllllllllIIIIlII("RHOMBUS_MIDDLE", 25, "rhombus", "mr", " # ", "# #", " # "), 
    IIlllIlIIllIlIlIlIIl("HALF_VERTICAL", 26, "half_vertical", "vh", "## ", "## ", "## "), 
    llIIIlIlIllIIlIlIlII("HALF_HORIZONTAL", 27, "half_horizontal", "hh", "###", "###", "   "), 
    lllllIlIIIlIlIIlllII("HALF_VERTICAL_MIRROR", 28, "half_vertical_right", "vhr", " ##", " ##", " ##"), 
    lIllllllIIllIlIlIlII("HALF_HORIZONTAL_MIRROR", 29, "half_horizontal_bottom", "hhb", "   ", "###", "###"), 
    llIIlllIIlllIIllIllI("BORDER", 30, "border", "bo", "###", "# #", "###"), 
    IIlllIIIlIlllIIlllII("CURLY_BORDER", 31, "curly_border", "cbo", new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r)), 
    IIlIIIIIllIlIIIlIIll("CREEPER", 32, "creeper", "cre", new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 1, 4)), 
    llllllIllIllIlIllllI("GRADIENT", 33, "gradient", "gra", "# #", " # ", " # "), 
    IIIllllllIllIIIlllIl("GRADIENT_UP", 34, "gradient_up", "gru", " # ", " # ", "# #"), 
    IlIIIlIIIllllIlIlIlI("BRICKS", 35, "bricks", "bri", new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlIlIIIlIIlIlIlII)), 
    IIIIIllIIIIlIIIIllIl("SKULL", 36, "skull", "sku", new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 1, 1)), 
    IIIIIIIIIlllIllIlIlI("FLOWER", 37, "flower", "flo", new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, 1, llIllIIlllllllllllll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI())), 
    IIllllIIIlIIIIIIllIl("MOJANG", 38, "mojang", "moj", new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIllllIllllIlIlII, 1, 1));
    
    private String IlllIIIIlIIIlIlIlIIl;
    private String lllIllIIIllllllIllll;
    private String[] llIllIlIlIIIIIIIllII;
    private lllIIIIlIlIllIIlIIIl IIlIlIlIIlIllIIIIIIl;
    
    static {
        IllIllIIIIlIIlIlllII = new lIIIlllIIIllIIIllIII[] { lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll, lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl, lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI, lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl, lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI, lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl, lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl, lIIIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII, lIIIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII, lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl, lIIIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI, lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI, lIIIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI, lIIIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll, lIIIlllIIIllIIIllIII.llllIIllllIlIlIIIIll, lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII, lIIIlllIIIllIIIllIII.IIlllIIlIllIllIlIIll, lIIIlllIIIllIIIllIII.lllIIIIlllllIlIIllIl, lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl, lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI, lIIIlllIIIllIIIllIII.IIIlIIIlIlIIlllIIlll, lIIIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl, lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII, lIIIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII, lIIIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII, lIIIlllIIIllIIIllIII.IIlllIlIIllIlIlIlIIl, lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII, lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII, lIIIlllIIIllIIIllIII.lIllllllIIllIlIlIlII, lIIIlllIIIllIIIllIII.llIIlllIIlllIIllIllI, lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII, lIIIlllIIIllIIIllIII.IIlIIIIIllIlIIIlIIll, lIIIlllIIIllIIIllIII.llllllIllIllIlIllllI, lIIIlllIIIllIIIllIII.IIIllllllIllIIIlllIl, lIIIlllIIIllIIIllIII.IlIIIlIIIllllIlIlIlI, lIIIlllIIIllIIIllIII.IIIIIllIIIIlIIIIllIl, lIIIlllIIIllIIIllIII.IIIIIIIIIlllIllIlIlI, lIIIlllIIIllIIIllIII.IIllllIIIlIIIIIIllIl };
    }
    
    private lIIIlllIIIllIIIllIII(final String s, final int n, final String illlIIIIlIIIlIlIlIIl, final String lllIllIIIllllllIllll) {
        this.llIllIlIlIIIIIIIllII = new String[3];
        this.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl;
        this.lllIllIIIllllllIllll = lllIllIIIllllllIllll;
    }
    
    private lIIIlllIIIllIIIllIII(final String s, final int n, final String s2, final String s3, final lllIIIIlIlIllIIlIIIl iIlIlIlIIlIllIIIIIIl) {
        this(s, n, s2, s3);
        this.IIlIlIlIIlIllIIIIIIl = iIlIlIlIIlIllIIIIIIl;
    }
    
    private lIIIlllIIIllIIIllIII(final String s, final int n, final String s2, final String s3, final String s4, final String s5, final String s6) {
        this(s, n, s2, s3);
        this.llIllIlIlIIIIIIIllII[0] = s4;
        this.llIllIlIlIIIIIIIllII[1] = s5;
        this.llIllIlIlIIIIIIIllII[2] = s6;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlllIIIIlIIIlIlIlIIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.lllIllIIIllllllIllll;
    }
    
    public String[] llIllIIIIIllIlIIIIlI() {
        return this.llIllIlIlIIIIIIIllII;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IIlIlIlIIlIllIIIIIIl != null || this.llIllIlIlIIIIIIIllII[0] != null;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IIlIlIlIIlIllIIIIIIl != null;
    }
    
    public lllIIIIlIlIllIIlIIIl IllIIlllIIIIlllIIlIl() {
        return this.IIlIlIlIIlIllIIIIIIl;
    }
    
    public static lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final String s) {
        lIIIlllIIIllIIIllIII[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = values[i];
            if (liiIlllIIIllIIIllIII.lllIllIIIllllllIllll.equals(s)) {
                return liiIlllIIIllIIIllIII;
            }
        }
        return null;
    }
}
