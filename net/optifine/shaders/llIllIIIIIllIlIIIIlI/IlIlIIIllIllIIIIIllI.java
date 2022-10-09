package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import net.optifine.shaders.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum IlIlIIIllIllIIIIIllI
{
    llllIIIIlIIIlIlllIll("BIOME", 0, "biome"), 
    IlIlIlIlIlllllllllIl("TEMPERATURE", 1, "temperature"), 
    llIllIIIIIllIlIIIIlI("RAINFALL", 2, "rainfall"), 
    IlIIIlIlIIIllIlIlIIl("HELD_ITEM_ID", 3, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.r), 
    IlIlIIIllIllIIIIIllI("HELD_BLOCK_LIGHT_VALUE", 4, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.s), 
    IllIIlllIIIIlllIIlIl("HELD_ITEM_ID2", 5, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.t), 
    llllIIIlIlllIlIIIIIl("HELD_BLOCK_LIGHT_VALUE2", 6, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.u), 
    lIIIIlIIIIIlllIllIII("WORLD_TIME", 7, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.z), 
    lIIIlllIIIllIIIllIII("WORLD_DAY", 8, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.A), 
    llIIlIIIlIIIllIlIIIl("MOON_PHASE", 9, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.B), 
    llIllIlIIIIllIlIIllI("FRAME_COUNTER", 10, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.C), 
    lIlIlIIIllIIllIIIllI("FRAME_TIME", 11, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.D), 
    IlIlIIIllIIllIlllllI("FRAME_TIME_COUNTER", 12, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.E), 
    IIIIlllIIIIIIlIIIlll("SUN_ANGLE", 13, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.F), 
    llllIIllllIlIlIIIIll("SHADOW_ANGLE", 14, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.G), 
    IlIllIlIlIIIlIlIlIII("RAIN_STRENGTH", 15, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.H), 
    IIlllIIlIllIllIlIIll("ASPECT_RATIO", 16, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.I), 
    lllIIIIlllllIlIIllIl("VIEW_WIDTH", 17, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.J), 
    IlIlIIIIIIlllIlIllIl("VIEW_HEIGHT", 18, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.K), 
    IIllIIllIIIlIlIIIIlI("NEAR", 19, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.L), 
    IIIlIIIlIlIIlllIIlll("FAR", 20, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.M), 
    IlIlIIIlIIlIlIIlllIl("WETNESS", 21, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.ad), 
    IlllllllIIIlIIIlIlII("EYE_ALTITUDE", 22, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.ae), 
    IIlIIIIlllIlllllIlII("EYE_BRIGHTNESS", 23, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.af, new String[] { "x", "y" }), 
    IIIlIIlIIIIlllIlllII("TERRAIN_TEXTURE_SIZE", 24, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.ah, new String[] { "x", "y" }), 
    IlIlIllllllllIIIIlII("TERRRAIN_ICON_SIZE", 25, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.ai), 
    IIlllIlIIllIlIlIlIIl("IS_EYE_IN_WATER", 26, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.aj), 
    llIIIlIlIllIIlIlIlII("NIGHT_VISION", 27, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.ak), 
    lllllIlIIIlIlIIlllII("BLINDNESS", 28, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.al), 
    lIllllllIIllIlIlIlII("SCREEN_BRIGHTNESS", 29, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.am), 
    llIIlllIIlllIIllIllI("HIDE_GUI", 30, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.an), 
    IIlllIIIlIlllIIlllII("CENTER_DEPT_SMOOTH", 31, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.ao), 
    IIlIIIIIllIlIIIlIIll("ATLAS_SIZE", 32, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.ap, new String[] { "x", "y" }), 
    llllllIllIllIlIllllI("CAMERA_POSITION", 33, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.S, new String[] { "x", "y", "z" }), 
    IIIllllllIllIIIlllIl("PREVIOUS_CAMERA_POSITION", 34, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.R, new String[] { "x", "y", "z" }), 
    IlIIIlIIIllllIlIlIlI("SUN_POSITION", 35, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.N, new String[] { "x", "y", "z" }), 
    IIIIIllIIIIlIIIIllIl("MOON_POSITION", 36, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.O, new String[] { "x", "y", "z" }), 
    IIIIIIIIIlllIllIlIlI("SHADOW_LIGHT_POSITION", 37, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.P, new String[] { "x", "y", "z" }), 
    IIllllIIIlIIIIIIllIl("UP_POSITION", 38, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.Q, new String[] { "x", "y", "z" }), 
    IlllIIIIlIIIlIlIlIIl("SKY_COLOR", 39, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.y, new String[] { "r", "g", "b" }), 
    lllIllIIIllllllIllll("GBUFFER_PROJECTION", 40, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.W, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    llIllIlIlIIIIIIIllII("GBUFFER_PROJECTION_INVERSE", 41, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.X, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    IIlIlIlIIlIllIIIIIIl("GBUFFER_PREVIOUS_PROJECTION", 42, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.V, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    IllIllIIIIlIIlIlllII("GBUFFER_MODEL_VIEW", 43, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.T, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    IlIllllIIlIIlIlIlIll("GBUFFER_MODEL_VIEW_INVERSE", 44, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.U, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    IllIllIlllIllllIIllI("GBUFFER_PREVIOUS_MODEL_VIEW", 45, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.Y, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    llIlIIIIIlIIlIlIIlll("SHADOW_PROJECTION", 46, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.Z, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    IlIIlIlIIIlIIlIlIlII("SHADOW_PROJECTION_INVERSE", 47, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.aa, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    IllIlIIllIllIIlIllII("SHADOW_MODEL_VIEW", 48, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.ab, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    lIIlIIIlIllIlIllIIIl("SHADOW_MODEL_VIEW_INVERSE", 49, (IIIIlllIIIIIIlIIIlll)net.optifine.shaders.llIIlllIIlllIIllIllI.ac, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" });
    
    private String IIlIIIlllIllIllIlIII;
    private IIIIlllIIIIIIlIIIlll lIlIlIlllIIlIlIlllIl;
    private String[] llIIIIIIlIllIIlIIIll;
    private String[] lIIIIlIlIllllIIlIllI;
    private static volatile /* synthetic */ int[] llIIIlIlllIllIIlIllI;
    
    static {
        IlIIllIIllIIllIIlIIl = new IlIlIIIllIllIIIIIllI[] { IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl, IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII, IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII, IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl, IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI, IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI, IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI, IlIlIIIllIllIIIIIllI.IIIIlllIIIIIIlIIIlll, IlIlIIIllIllIIIIIllI.llllIIllllIlIlIIIIll, IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII, IlIlIIIllIllIIIIIllI.IIlllIIlIllIllIlIIll, IlIlIIIllIllIIIIIllI.lllIIIIlllllIlIIllIl, IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl, IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI, IlIlIIIllIllIIIIIllI.IIIlIIIlIlIIlllIIlll, IlIlIIIllIllIIIIIllI.IlIlIIIlIIlIlIIlllIl, IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII, IlIlIIIllIllIIIIIllI.IIlIIIIlllIlllllIlII, IlIlIIIllIllIIIIIllI.IIIlIIlIIIIlllIlllII, IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII, IlIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl, IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII, IlIlIIIllIllIIIIIllI.lllllIlIIIlIlIIlllII, IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII, IlIlIIIllIllIIIIIllI.llIIlllIIlllIIllIllI, IlIlIIIllIllIIIIIllI.IIlllIIIlIlllIIlllII, IlIlIIIllIllIIIIIllI.IIlIIIIIllIlIIIlIIll, IlIlIIIllIllIIIIIllI.llllllIllIllIlIllllI, IlIlIIIllIllIIIIIllI.IIIllllllIllIIIlllIl, IlIlIIIllIllIIIIIllI.IlIIIlIIIllllIlIlIlI, IlIlIIIllIllIIIIIllI.IIIIIllIIIIlIIIIllIl, IlIlIIIllIllIIIIIllI.IIIIIIIIIlllIllIlIlI, IlIlIIIllIllIIIIIllI.IIllllIIIlIIIIIIllIl, IlIlIIIllIllIIIIIllI.IlllIIIIlIIIlIlIlIIl, IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll, IlIlIIIllIllIIIIIllI.llIllIlIlIIIIIIIllII, IlIlIIIllIllIIIIIllI.IIlIlIlIIlIllIIIIIIl, IlIlIIIllIllIIIIIllI.IllIllIIIIlIIlIlllII, IlIlIIIllIllIIIIIllI.IlIllllIIlIIlIlIlIll, IlIlIIIllIllIIIIIllI.IllIllIlllIllllIIllI, IlIlIIIllIllIIIIIllI.llIlIIIIIlIIlIlIIlll, IlIlIIIllIllIIIIIllI.IlIIlIlIIIlIIlIlIlII, IlIlIIIllIllIIIIIllI.IllIlIIllIllIIlIllII, IlIlIIIllIllIIIIIllI.lIIlIIIlIllIlIllIIIl };
    }
    
    private IlIlIIIllIllIIIIIllI(final String s, final int n, final String iIlIIIlllIllIllIlIII) {
        this.IIlIIIlllIllIllIlIII = iIlIIIlllIllIllIlIII;
    }
    
    private IlIlIIIllIllIIIIIllI(final String s, final int n, final IIIIlllIIIIIIlIIIlll lIlIlIlllIIlIlIlllIl) {
        this.IIlIIIlllIllIllIlIII = lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI();
        this.lIlIlIlllIIlIlIlllIl = lIlIlIlllIIlIlIlllIl;
        if (!llllIIIIlIIIlIlllIll(lIlIlIlllIIlIlIlllIl, llllIIIlIlllIlIIIIIl.class, lIIIIlIIIIIlllIllIII.class)) {
            throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + lIlIlIlllIIlIlIlllIl.getClass().getName());
        }
    }
    
    private IlIlIIIllIllIIIIIllI(final String s, final int n, final IIIIlllIIIIIIlIIIlll lIlIlIlllIIlIlIlllIl, final String[] llIIIIIIlIllIIlIIIll) {
        this.IIlIIIlllIllIllIlIII = lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI();
        this.lIlIlIlllIIlIlIlllIl = lIlIlIlllIIlIlIlllIl;
        this.llIIIIIIlIllIIlIIIll = llIIIIIIlIllIIlIIIll;
        if (!llllIIIIlIIIlIlllIll(lIlIlIlllIIlIlIlllIl, llIIlIIIlIIIllIlIIIl.class, lIIIlllIIIllIIIllIII.class, llIllIlIIIIllIlIIllI.class, lIlIlIIIllIIllIIIllI.class)) {
            throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + lIlIlIlllIIlIlIlllIl.getClass().getName());
        }
    }
    
    private IlIlIIIllIllIIIIIllI(final String s, final int n, final IIIIlllIIIIIIlIIIlll lIlIlIlllIIlIlIlllIl, final String[] llIIIIIIlIllIIlIIIll, final String[] liiiIlIlIllllIIlIllI) {
        this.IIlIIIlllIllIllIlIII = lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI();
        this.lIlIlIlllIIlIlIlllIl = lIlIlIlllIIlIlIlllIl;
        this.llIIIIIIlIllIIlIIIll = llIIIIIIlIllIIlIIIll;
        this.lIIIIlIlIllllIIlIllI = liiiIlIlIllllIIlIllI;
        if (!llllIIIIlIIIlIlllIll(lIlIlIlllIIlIlIlllIl, llllIIllllIlIlIIIIll.class)) {
            throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + lIlIlIlllIIlIlIlllIl.getClass().getName());
        }
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IIlIIIlllIllIllIlIII;
    }
    
    public IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl() {
        return this.lIlIlIlllIIlIlIlllIl;
    }
    
    public String[] llIllIIIIIllIlIIIIlI() {
        return this.llIIIIIIlIllIIlIIIll;
    }
    
    public String[] IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIIlIlIllllIIlIllI;
    }
    
    public float llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (this.llIIIIIIlIllIIlIIIll != null && (n < 0 || n > this.llIIIIIIlIllIIlIIIll.length)) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid index1, parameter: " + this + ", index: " + n);
            return 0.0f;
        }
        if (this.lIIIIlIlIllllIIlIllI != null && (n2 < 0 || n2 > this.lIIIIlIlIllllIIlIllI.length)) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid index2, parameter: " + this + ", index: " + n2);
            return 0.0f;
        }
        switch (IlIlIIIllIllIIIIIllI()[this.ordinal()]) {
            case 1: {
                return (float)net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIlIIIllllllIIlII().llIllIIIIIllIlIIIIlI(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIIllIIlIIIIlIIl()).lIIIIIlIlIIIlIIIIlIl;
            }
            case 2: {
                final IlIlIlIlIlllllllllIl ilIllIIllIIlIIIIlIIl = net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIIllIIlIIIIlIIl();
                final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIlIIIllllllIIlII().llIllIIIIIllIlIIIIlI(ilIllIIllIIlIIIIlIIl);
                return (llIllIIIIIllIlIIIIlI != null) ? llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIllIIllIIlIIIIlIIl) : 0.0f;
            }
            case 3: {
                final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI2 = net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIlIIIllllllIIlII().llIllIIIIIllIlIIIIlI(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIIllIIlIIIIlIIl());
                return (llIllIIIIIllIlIIIIlI2 != null) ? llIllIIIIIllIlIIIIlI2.lIIIlllIIIllIIIllIII() : 0.0f;
            }
            default: {
                if (this.lIlIlIlllIIlIlIlllIl instanceof llllIIIlIlllIlIIIIIl) {
                    return ((llllIIIlIlllIlIIIIIl)this.lIlIlIlllIIlIlIlllIl).llllIIIIlIIIlIlllIll();
                }
                if (this.lIlIlIlllIIlIlIlllIl instanceof lIIIIlIIIIIlllIllIII) {
                    return (float)((lIIIIlIIIIIlllIllIII)this.lIlIlIlllIIlIlIlllIl).llllIIIIlIIIlIlllIll();
                }
                if (this.lIlIlIlllIIlIlIlllIl instanceof llIIlIIIlIIIllIlIIIl) {
                    return (float)((llIIlIIIlIIIllIlIIIl)this.lIlIlIlllIIlIlIlllIl).llllIIIIlIIIlIlllIll()[n];
                }
                if (this.lIlIlIlllIIlIlIlllIl instanceof lIIIlllIIIllIIIllIII) {
                    return ((lIIIlllIIIllIIIllIII)this.lIlIlIlllIIlIlIlllIl).llllIIIIlIIIlIlllIll()[n];
                }
                if (this.lIlIlIlllIIlIlIlllIl instanceof llIllIlIIIIllIlIIllI) {
                    return ((llIllIlIIIIllIlIIllI)this.lIlIlIlllIIlIlIlllIl).llllIIIIlIIIlIlllIll()[n];
                }
                if (this.lIlIlIlllIIlIlIlllIl instanceof lIlIlIIIllIIllIIIllI) {
                    return ((lIlIlIIIllIIllIIIllI)this.lIlIlIlllIIlIlIlllIl).llllIIIIlIIIlIlllIll()[n];
                }
                if (this.lIlIlIlllIIlIlIlllIl instanceof llllIIllllIlIlIIIIll) {
                    return ((llllIIllllIlIlIIIIll)this.lIlIlIlllIIlIlIlllIl).llllIIIIlIIIlIlllIll(n, n2);
                }
                throw new IllegalArgumentException("Unknown uniform type: " + this);
            }
        }
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final Object o, final Class... array) {
        if (o == null) {
            return false;
        }
        final Class<?> class1 = o.getClass();
        for (int i = 0; i < array.length; ++i) {
            if (array[i].isAssignableFrom(class1)) {
                return true;
            }
        }
        return false;
    }
    
    static /* synthetic */ int[] IlIlIIIllIllIIIIIllI() {
        final int[] llIIIlIlllIllIIlIllI = IlIlIIIllIllIIIIIllI.llIIIlIlllIllIIlIllI;
        if (llIIIlIlllIllIIlIllI != null) {
            return llIIIlIlllIllIIlIllI;
        }
        final int[] llIIIlIlllIllIIlIllI2 = new int[values().length];
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIlllIIlIllIllIlIIll.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIlIIIIIllIlIIIlIIll.ordinal()] = 33;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.lllllIlIIIlIlIIlllII.ordinal()] = 29;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llllllIllIllIlIllllI.ordinal()] = 34;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIlllIIIlIlllIIlllII.ordinal()] = 32;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIlIIIIlllIlllllIlII.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIIlIIIlIlIIlllIIlll.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IllIllIIIIlIIlIlllII.ordinal()] = 44;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIllllIIlIIlIlIlIll.ordinal()] = 45;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IllIllIlllIllllIIllI.ordinal()] = 46;
        }
        catch (NoSuchFieldError noSuchFieldError15) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIlIlIlIIlIllIIIIIIl.ordinal()] = 43;
        }
        catch (NoSuchFieldError noSuchFieldError16) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll.ordinal()] = 41;
        }
        catch (NoSuchFieldError noSuchFieldError17) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llIllIlIlIIIIIIIllII.ordinal()] = 42;
        }
        catch (NoSuchFieldError noSuchFieldError18) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError19) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError20) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError21) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError22) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llIIlllIIlllIIllIllI.ordinal()] = 31;
        }
        catch (NoSuchFieldError noSuchFieldError23) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl.ordinal()] = 27;
        }
        catch (NoSuchFieldError noSuchFieldError24) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError25) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIIIIllIIIIlIIIIllIl.ordinal()] = 37;
        }
        catch (NoSuchFieldError noSuchFieldError26) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError27) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII.ordinal()] = 28;
        }
        catch (NoSuchFieldError noSuchFieldError28) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIIllllllIllIIIlllIl.ordinal()] = 35;
        }
        catch (NoSuchFieldError noSuchFieldError29) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError30) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError31) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII.ordinal()] = 30;
        }
        catch (NoSuchFieldError noSuchFieldError32) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llllIIllllIlIlIIIIll.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError33) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIIIIIIIIlllIllIlIlI.ordinal()] = 38;
        }
        catch (NoSuchFieldError noSuchFieldError34) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IllIlIIllIllIIlIllII.ordinal()] = 49;
        }
        catch (NoSuchFieldError noSuchFieldError35) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.lIIlIIIlIllIlIllIIIl.ordinal()] = 50;
        }
        catch (NoSuchFieldError noSuchFieldError36) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.llIlIIIIIlIIlIlIIlll.ordinal()] = 47;
        }
        catch (NoSuchFieldError noSuchFieldError37) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIIlIlIIIlIIlIlIlII.ordinal()] = 48;
        }
        catch (NoSuchFieldError noSuchFieldError38) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlllIIIIlIIIlIlIlIIl.ordinal()] = 40;
        }
        catch (NoSuchFieldError noSuchFieldError39) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError40) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIIIlIIIllllIlIlIlI.ordinal()] = 36;
        }
        catch (NoSuchFieldError noSuchFieldError41) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError42) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIIlIIlIIIIlllIlllII.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError43) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError44) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IIllllIIIlIIIIIIllIl.ordinal()] = 39;
        }
        catch (NoSuchFieldError noSuchFieldError45) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError46) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.lllIIIIlllllIlIIllIl.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError47) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.IlIlIIIlIIlIlIIlllIl.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError48) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError49) {}
        try {
            llIIIlIlllIllIIlIllI2[IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError50) {}
        return IlIlIIIllIllIIIIIllI.llIIIlIlllIllIIlIllI = llIIIlIlllIllIIlIllI2;
    }
}
