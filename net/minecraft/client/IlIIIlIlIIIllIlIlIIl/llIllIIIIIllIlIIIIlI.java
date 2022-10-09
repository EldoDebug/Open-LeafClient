package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

public class llIllIIIIIllIlIIIIlI extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    public IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    
    public llIllIIIIIllIlIIIIlI() {
        this.lIIIlllIIIllIIIllIII = 64;
        this.llIIlIIIlIIIllIlIIIl = 64;
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-10.0f, 0.0f, -2.0f, 20, 40, 1, 0.0f);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 44, 0)).llllIIIIlIIIlIlllIll(-1.0f, -30.0f, -1.0f, 2, 42, 2, 0.0f);
        (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, 0, 42)).llllIIIIlIIIlIlllIll(-10.0f, -32.0f, -1.0f, 20, 2, 2, 0.0f);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl = -32.0f;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0625f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0625f);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0.0625f);
    }
}
