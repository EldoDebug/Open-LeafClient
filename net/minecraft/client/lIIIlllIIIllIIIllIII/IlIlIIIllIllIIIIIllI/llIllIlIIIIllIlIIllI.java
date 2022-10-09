package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

public class llIllIlIIIIllIlIIllI implements Comparable
{
    private final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    
    public llIllIlIIIIllIlIIllI(final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll, final int ilIIIlIlIIIllIlIlIIl) {
        this.IllIIlllIIIIlllIIlIl = 1.0f;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl) > IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl));
    }
    
    public IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI ? IlIlIlIlIlllllllllIl((int)(this.llIllIIIIIllIlIIIIlI * this.IllIIlllIIIIlllIIlIl), this.IlIIIlIlIIIllIlIlIIl) : IlIlIlIlIlllllllllIl((int)(this.IlIlIlIlIlllllllllIl * this.IllIIlllIIIIlllIIlIl), this.IlIIIlIlIIIllIlIlIIl);
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI ? IlIlIlIlIlllllllllIl((int)(this.IlIlIlIlIlllllllllIl * this.IllIIlllIIIIlllIIlIl), this.IlIIIlIlIIIllIlIlIIl) : IlIlIlIlIlllllllllIl((int)(this.llIllIIIIIllIlIIIIlI * this.IllIIlllIIIIlllIIlIl), this.IlIIIlIlIIIllIlIlIIl);
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIIIllIllIIIIIllI = !this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (this.IlIlIlIlIlllllllllIl > n && this.llIllIIIIIllIlIIIIlI > n) {
            this.IllIIlllIIIIlllIIlIl = n / (float)Math.min(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI);
        }
    }
    
    @Override
    public String toString() {
        return "Holder{width=" + this.IlIlIlIlIlllllllllIl + ", height=" + this.llIllIIIIIllIlIIIIlI + '}';
    }
    
    public int llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        int n;
        if (this.llIllIIIIIllIlIIIIlI() == llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI()) {
            if (this.IlIlIlIlIlllllllllIl() == llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl()) {
                if (this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() == null) {
                    return (llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() == null) ? 0 : -1;
                }
                return this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII().compareTo(llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII());
            }
            else {
                n = ((this.IlIlIlIlIlllllllllIl() < llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl()) ? 1 : -1);
            }
        }
        else {
            n = ((this.llIllIIIIIllIlIIIIlI() < llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI()) ? 1 : -1);
        }
        return n;
    }
}
