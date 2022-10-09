package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

enum IIlllIIlIllIllIlIIll
{
    llllIIIIlIIIlIlllIll("NONE", 0, 0.0f, 0.0f, 30, 1), 
    IlIlIlIlIlllllllllIl("HOP", 1, 0.8f, 0.2f, 20, 10), 
    llIllIIIIIllIlIIIIlI("STEP", 2, 1.0f, 0.45f, 14, 14), 
    IlIIIlIlIIIllIlIlIIl("SPRINT", 3, 1.75f, 0.4f, 1, 8), 
    IlIlIIIllIllIIIIIllI("ATTACK", 4, 2.0f, 0.7f, 7, 8);
    
    private final float IllIIlllIIIIlllIIlIl;
    private final float llllIIIlIlllIlIIIIIl;
    private final int lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    
    static {
        llIIlIIIlIIIllIlIIIl = new IIlllIIlIllIllIlIIll[] { IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll, IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl, IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI, IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl, IIlllIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI };
    }
    
    private IIlllIIlIllIllIlIIll(final String s, final int n, final float illIIlllIIIIlllIIlIl, final float llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public float llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
}
