package net.optifine.llllIIIIlIIIlIlllIll;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class llllIIllllIlIlIIIIll
{
    private IIIIlllIIIIIIlIIIlll[] llllIIIIlIIIlIlllIll;
    
    public llllIIllllIlIlIIIIll() {
        this.llllIIIIlIIIlIlllIll = new IIIIlllIIIIIIlIIIlll[0];
    }
    
    public llllIIllllIlIlIIIIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll = new IIIIlllIIIIIIlIIIlll[0];
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll = (IIIIlllIIIIIIlIIIlll[])net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, iiiIlllIIIIIIlIIIlll);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(n)) {
                return true;
            }
        }
        return false;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.length;
    }
    
    public IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl(final int n) {
        return this.llllIIIIlIIIlIlllIll[n];
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = this.llllIIIIlIIIlIlllIll[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(iiiIlllIIIIIIlIIIlll.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
