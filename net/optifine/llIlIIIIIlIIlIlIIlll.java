package net.optifine;

public class llIlIIIIIlIIlIlIIlll
{
    public long llllIIIIlIIIlIlllIll;
    public long IlIlIlIlIlllllllllIl;
    
    public llIlIIIIIlIIlIlIIlll() {
        this.llllIIIIlIIIlIlllIll = 0L;
        this.IlIlIlIlIlllllllllIl = 0L;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll && this.llllIIIIlIIIlIlllIll == 0L) {
            this.llllIIIIlIIIlIlllIll = System.nanoTime();
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll && this.llllIIIIlIIIlIlllIll != 0L) {
            this.IlIlIlIlIlllllllllIl += System.nanoTime() - this.llllIIIIlIIIlIlllIll;
            this.llllIIIIlIIIlIlllIll = 0L;
        }
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = 0L;
        this.llllIIIIlIIIlIlllIll = 0L;
    }
}
