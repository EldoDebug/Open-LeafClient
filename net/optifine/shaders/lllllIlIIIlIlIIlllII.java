package net.optifine.shaders;

import org.lwjgl.opengl.*;

public class lllllIlIIIlIlIIlllII
{
    public int llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    public int IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    public int llllIIIlIlllIlIIIIIl;
    public int lIIIIlIIIIIlllIllIII;
    public int lIIIlllIIIllIIIllIII;
    public int llIIlIIIlIIIllIlIIIl;
    public int llIllIlIIIIllIlIIllI;
    public int lIlIlIIIllIIllIIIllI;
    public int IlIlIIIllIIllIlllllI;
    public int IIIIlllIIIIIIlIIIlll;
    public int llllIIllllIlIlIIIIll;
    public int IlIllIlIlIIIlIlIlIII;
    public int IIlllIIlIllIllIlIIll;
    public int lllIIIIlllllIlIIllIl;
    public int IlIlIIIIIIlllIlIllIl;
    public int IIllIIllIIIlIlIIIIlI;
    public int IIIlIIIlIlIIlllIIlll;
    public int IlIlIIIlIIlIlIIlllIl;
    public int IlllllllIIIlIIIlIlII;
    public int IIlIIIIlllIlllllIlII;
    public int IIIlIIlIIIIlllIlllII;
    public int IlIlIllllllllIIIIlII;
    public int IIlllIlIIllIlIlIlIIl;
    public int llIIIlIlIllIIlIlIlII;
    public int lllllIlIIIlIlIIlllII;
    public int lIllllllIIllIlIlIlII;
    public int llIIlllIIlllIIllIllI;
    public int IIlllIIIlIlllIIlllII;
    public int IIlIIIIIllIlIIIlIIll;
    public int llllllIllIllIlIllllI;
    public int IIIllllllIllIIIlllIl;
    public int IlIIIlIIIllllIlIlIlI;
    public int IIIIIllIIIIlIIIIllIl;
    public int IIIIIIIIIlllIllIlIlI;
    public int IIllllIIIlIIIIIIllIl;
    public int IlllIIIIlIIIlIlIlIIl;
    public int lllIllIIIllllllIllll;
    public int llIllIlIlIIIIIIIllII;
    public int IIlIlIlIIlIllIIIIIIl;
    public int IllIllIIIIlIIlIlllII;
    public int IlIllllIIlIIlIlIlIll;
    public int IllIllIlllIllllIIllI;
    public int llIlIIIIIlIIlIlIIlll;
    public int IlIIlIlIIIlIIlIlIlII;
    public int IllIlIIllIllIIlIllII;
    public int lIIlIIIlIllIlIllIIIl;
    public int IIlIIIlllIllIllIlIII;
    public int lIlIlIlllIIlIlIlllIl;
    public int llIIIIIIlIllIIlIIIll;
    public int lIIIIlIlIllllIIlIllI;
    public int llIIIlIlllIllIIlIllI;
    public int IlIIllIIllIIllIIlIIl;
    public int lllllIIIIIlIlIIIIIIl;
    public int IllIIlllllIIllIIllIl;
    public int lIllIIIIIlllIIlIIllI;
    public int lIlIIlllIIlIIlIlllIl;
    public int llIIIllIlIllIllIIIIl;
    public int IIIllIIIlIlIIllIIIlI;
    public int IIlllIIlllIIIlIlllII;
    public int IlIIlllllIIllIIlllll;
    public int lllllIIlIlIIIlIlIIIl;
    public int IIlllllIllIllIlIlIII;
    public int llllIllllIllllIlIlII;
    public int IIlIlIllllIlllIIIIll;
    public int lIIllIIIllllIlllIllI;
    public int IllIlIllIllIlllIIlll;
    public int IIllIIIlIIlIlIlIIIII;
    public int llIllIIlllllllllllll;
    public int lllllIIllIlIllIllllI;
    public int IlIIIIIlIIllIIlIlIll;
    public int IllllIIlIlIllIIIllII;
    
    public lllllIlIIIlIlIIlllII(final int llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"texture");
        this.llIllIIIIIllIlIIIIlI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"lightmap");
        this.IlIIIlIlIIIllIlIlIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"normals");
        this.IlIlIIIllIllIIIIIllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"specular");
        this.IllIIlllIIIIlllIIlIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadow");
        this.llllIIIlIlllIlIIIIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"watershadow");
        this.lIIIIlIIIIIlllIllIII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowtex0");
        this.lIIIlllIIIllIIIllIII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowtex1");
        this.llIIlIIIlIIIllIlIIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"depthtex0");
        this.llIllIlIIIIllIlIIllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"depthtex1");
        this.lIlIlIIIllIIllIIIllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowcolor");
        this.IlIlIIIllIIllIlllllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowcolor0");
        this.IIIIlllIIIIIIlIIIlll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowcolor1");
        this.llllIIllllIlIlIIIIll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"noisetex");
        this.IlIllIlIlIIIlIlIlIII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gcolor");
        this.IIlllIIlIllIllIlIIll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gdepth");
        this.lllIIIIlllllIlIIllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gnormal");
        this.IlIlIIIIIIlllIlIllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"composite");
        this.IIllIIllIIIlIlIIIIlI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gaux1");
        this.IIIlIIIlIlIIlllIIlll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gaux2");
        this.IlIlIIIlIIlIlIIlllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gaux3");
        this.IlllllllIIIlIIIlIlII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gaux4");
        this.IIlIIIIlllIlllllIlII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"colortex0");
        this.IIIlIIlIIIIlllIlllII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"colortex1");
        this.IlIlIllllllllIIIIlII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"colortex2");
        this.IIlllIlIIllIlIlIlIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"colortex3");
        this.llIIIlIlIllIIlIlIlII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"colortex4");
        this.lllllIlIIIlIlIIlllII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"colortex5");
        this.lIllllllIIllIlIlIlII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"colortex6");
        this.llIIlllIIlllIIllIllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"colortex7");
        this.IIlllIIIlIlllIIlllII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gdepthtex");
        this.IIlIIIIIllIlIIIlIIll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"depthtex2");
        this.llllllIllIllIlIllllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"tex");
        this.IIIllllllIllIIIlllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"heldItemId");
        this.IlIIIlIIIllllIlIlIlI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"heldBlockLightValue");
        this.IIIIIllIIIIlIIIIllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"fogMode");
        this.IIIIIIIIIlllIllIlIlI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"fogColor");
        this.IIllllIIIlIIIIIIllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"skyColor");
        this.IlllIIIIlIIIlIlIlIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"worldTime");
        this.lllIllIIIllllllIllll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"moonPhase");
        this.llIllIlIlIIIIIIIllII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"frameTimeCounter");
        this.IIlIlIlIIlIllIIIIIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"sunAngle");
        this.IllIllIIIIlIIlIlllII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowAngle");
        this.IlIllllIIlIIlIlIlIll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"rainStrength");
        this.IllIllIlllIllllIIllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"aspectRatio");
        this.llIlIIIIIlIIlIlIIlll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"viewWidth");
        this.IlIIlIlIIIlIIlIlIlII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"viewHeight");
        this.IllIlIIllIllIIlIllII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"near");
        this.lIIlIIIlIllIlIllIIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"far");
        this.IIlIIIlllIllIllIlIII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"sunPosition");
        this.lIlIlIlllIIlIlIlllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"moonPosition");
        this.llIIIIIIlIllIIlIIIll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"upPosition");
        this.lIIIIlIlIllllIIlIllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"previousCameraPosition");
        this.llIIIlIlllIllIIlIllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"cameraPosition");
        this.IlIIllIIllIIllIIlIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gbufferModelView");
        this.lllllIIIIIlIlIIIIIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gbufferModelViewInverse");
        this.IllIIlllllIIllIIllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gbufferPreviousProjection");
        this.lIllIIIIIlllIIlIIllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gbufferProjection");
        this.lIlIIlllIIlIIlIlllIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gbufferProjectionInverse");
        this.llIIIllIlIllIllIIIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"gbufferPreviousModelView");
        this.IIIllIIIlIlIIllIIIlI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowProjection");
        this.IIlllIIlllIIIlIlllII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowProjectionInverse");
        this.IlIIlllllIIllIIlllll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowModelView");
        this.lllllIIlIlIIIlIlIIIl = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"shadowModelViewInverse");
        this.IIlllllIllIllIlIlIII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"wetness");
        this.llllIllllIllllIlIlII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"eyeAltitude");
        this.IIlIlIllllIlllIIIIll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"eyeBrightness");
        this.lIIllIIIllllIlllIllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"eyeBrightnessSmooth");
        this.IllIlIllIllIlllIIlll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"terrainTextureSize");
        this.IIllIIIlIIlIlIlIIIII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"terrainIconSize");
        this.llIllIIlllllllllllll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"isEyeInWater");
        this.lllllIIllIlIllIllllI = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"hideGUI");
        this.IlIIIIIlIIllIIlIlIll = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"centerDepthSmooth");
        this.IllllIIlIlIllIIIllII = ARBShaderObjects.glGetUniformLocationARB(llllIIIIlIIIlIlllIll, (CharSequence)"atlasSize");
    }
}
