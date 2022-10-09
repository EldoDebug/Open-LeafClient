package net.minecraft.IlllllllIIIlIIIlIlII;

public class IIllIIIlIIIIlIIlIIII
{
    private float llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    
    public float llllIIIIlIIIlIlllIll(float llIllIIIIIllIlIIIIlI, final float n) {
        this.llllIIIIlIIIlIlllIll += llIllIIIIIllIlIIIIlI;
        llIllIIIIIllIlIIIIlI = (this.llllIIIIlIIIlIlllIll - this.IlIlIlIlIlllllllllIl) * n;
        this.llIllIIIIIllIlIIIIlI += (llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI) * 0.5f;
        if ((llIllIIIIIllIlIIIIlI > 0.0f && llIllIIIIIllIlIIIIlI > this.llIllIIIIIllIlIIIIlI) || (llIllIIIIIllIlIIIIlI < 0.0f && llIllIIIIIllIlIIIIlI < this.llIllIIIIIllIlIIIIlI)) {
            llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        }
        this.IlIlIlIlIlllllllllIl += llIllIIIIIllIlIIIIlI;
        return llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll = 0.0f;
        this.IlIlIlIlIlllllllllIl = 0.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
    }
}
