package net.optifine.util;

public class IlllllllIIIlIIIlIlII
{
    private int llllIIIIlIIIlIlllIll;
    
    public boolean llllIIIIlIIIlIlllIll() {
        ++this.llllIIIIlIIIlIlllIll;
        return this.llllIIIIlIIIlIlllIll == 1;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        if (this.llllIIIIlIIIlIlllIll <= 0) {
            return false;
        }
        --this.llllIIIIlIIIlIlllIll;
        return this.llllIIIIlIIIlIlllIll == 0;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll > 0;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String toString() {
        return "lockCount: " + this.llllIIIIlIIIlIlllIll;
    }
}
