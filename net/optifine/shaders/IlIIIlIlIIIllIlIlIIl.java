package net.optifine.shaders;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class IlIIIlIlIIIllIlIlIIl implements llIllIlIIIIllIlIIllI
{
    private int llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI;
    
    public IlIIIlIlIIIllIlIlIIl(final int llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = -1;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return 3553;
    }
    
    @Override
    public String toString() {
        return "textureUnit: " + this.llllIIIIlIIIlIlllIll + ", path: " + this.IlIlIlIlIlllllllllIl + ", glTextureId: " + this.IlIIIlIlIIIllIlIlIIl();
    }
}
