package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

public class IlIIIlIlIIIllIlIlIIl
{
    private llllIIIlIlllIlIIIIIl[] llllIIIIlIIIlIlllIll;
    
    public IlIIIlIlIIIllIlIlIIl(final llllIIIlIlllIlIIIIIl[] llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll();
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (!this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
                return false;
            }
        }
        return true;
    }
}
