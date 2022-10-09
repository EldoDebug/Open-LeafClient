package net.optifine.shaders.llllIIIIlIIIlIlllIll;

public enum llllIIIIlIIIlIlllIll
{
    llllIIIIlIIIlIlllIll("ANTIALIASING", 0, "of.options.shaders.ANTIALIASING", "antialiasingLevel", "0"), 
    IlIlIlIlIlllllllllIl("NORMAL_MAP", 1, "of.options.shaders.NORMAL_MAP", "normalMapEnabled", "true"), 
    llIllIIIIIllIlIIIIlI("SPECULAR_MAP", 2, "of.options.shaders.SPECULAR_MAP", "specularMapEnabled", "true"), 
    IlIIIlIlIIIllIlIlIIl("RENDER_RES_MUL", 3, "of.options.shaders.RENDER_RES_MUL", "renderResMul", "1.0"), 
    IlIlIIIllIllIIIIIllI("SHADOW_RES_MUL", 4, "of.options.shaders.SHADOW_RES_MUL", "shadowResMul", "1.0"), 
    IllIIlllIIIIlllIIlIl("HAND_DEPTH_MUL", 5, "of.options.shaders.HAND_DEPTH_MUL", "handDepthMul", "0.125"), 
    llllIIIlIlllIlIIIIIl("CLOUD_SHADOW", 6, "of.options.shaders.CLOUD_SHADOW", "cloudShadow", "true"), 
    lIIIIlIIIIIlllIllIII("OLD_HAND_LIGHT", 7, "of.options.shaders.OLD_HAND_LIGHT", "oldHandLight", "default"), 
    lIIIlllIIIllIIIllIII("OLD_LIGHTING", 8, "of.options.shaders.OLD_LIGHTING", "oldLighting", "default"), 
    llIIlIIIlIIIllIlIIIl("SHADER_PACK", 9, "of.options.shaders.SHADER_PACK", "shaderPack", ""), 
    llIllIlIIIIllIlIIllI("TWEAK_BLOCK_DAMAGE", 10, "of.options.shaders.TWEAK_BLOCK_DAMAGE", "tweakBlockDamage", "false"), 
    lIlIlIIIllIIllIIIllI("SHADOW_CLIP_FRUSTRUM", 11, "of.options.shaders.SHADOW_CLIP_FRUSTRUM", "shadowClipFrustrum", "true"), 
    IlIlIIIllIIllIlllllI("TEX_MIN_FIL_B", 12, "of.options.shaders.TEX_MIN_FIL_B", "TexMinFilB", "0"), 
    IIIIlllIIIIIIlIIIlll("TEX_MIN_FIL_N", 13, "of.options.shaders.TEX_MIN_FIL_N", "TexMinFilN", "0"), 
    llllIIllllIlIlIIIIll("TEX_MIN_FIL_S", 14, "of.options.shaders.TEX_MIN_FIL_S", "TexMinFilS", "0"), 
    IlIllIlIlIIIlIlIlIII("TEX_MAG_FIL_B", 15, "of.options.shaders.TEX_MAG_FIL_B", "TexMagFilB", "0"), 
    IIlllIIlIllIllIlIIll("TEX_MAG_FIL_N", 16, "of.options.shaders.TEX_MAG_FIL_N", "TexMagFilN", "0"), 
    lllIIIIlllllIlIIllIl("TEX_MAG_FIL_S", 17, "of.options.shaders.TEX_MAG_FIL_S", "TexMagFilS", "0");
    
    private String IlIlIIIIIIlllIlIllIl;
    private String IIllIIllIIIlIlIIIIlI;
    private String IIIlIIIlIlIIlllIIlll;
    
    static {
        IlIlIIIlIIlIlIIlllIl = new llllIIIIlIIIlIlllIll[] { llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI, llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll, llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll, llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl };
    }
    
    private llllIIIIlIIIlIlllIll(final String s, final int n, final String ilIlIIIIIIlllIlIllIl, final String iIllIIllIIIlIlIIIIlI, final String iiIlIIIlIlIIlllIIlll) {
        this.IlIlIIIIIIlllIlIllIl = null;
        this.IIllIIllIIIlIlIIIIlI = null;
        this.IIIlIIIlIlIIlllIIlll = null;
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.IIIlIIIlIlIIlllIIlll;
    }
}
