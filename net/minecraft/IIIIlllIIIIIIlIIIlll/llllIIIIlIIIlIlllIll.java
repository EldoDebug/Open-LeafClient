package net.minecraft.IIIIlllIIIIIIlIIIlll;

public class llllIIIIlIIIlIlllIll
{
    private lIIIIlIIIIIlllIllIII[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll = new lIIIIlIIIIIlllIllIII[1024];
    }
    
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.IlIlIlIlIlllllllllIl == this.llllIIIIlIIIlIlllIll.length) {
            final lIIIIlIIIIIlllIllIII[] llllIIIIlIIIlIlllIll = new lIIIIlIIIIIlllIllIII[this.IlIlIlIlIlllllllllIl << 1];
            System.arraycopy(this.llllIIIIlIIIlIlllIll, 0, llllIIIIlIIIlIlllIll, 0, this.IlIlIlIlIlllllllllIl);
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        }
        this.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl] = liiiIlIIIIIlllIllIII;
        liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl++);
        return liiiIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = 0;
    }
    
    public lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl() {
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll[0];
        final lIIIIlIIIIIlllIllIII[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        final int n = 0;
        final lIIIIlIIIIIlllIllIII[] llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll;
        final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl - 1;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        llllIIIIlIIIlIlllIll[n] = llllIIIIlIIIlIlllIll2[ilIlIlIlIlllllllllIl];
        this.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl] = null;
        if (this.IlIlIlIlIlllllllllIl > 0) {
            this.IlIlIlIlIlllllllllIl(0);
        }
        liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = -1;
        return liiiIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final float llllIIIlIlllIlIIIIIl) {
        final float llllIIIlIlllIlIIIIIl2 = liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl;
        liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        if (llllIIIlIlllIlIIIIIl < llllIIIlIlllIlIIIIIl2) {
            this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl);
        }
        else {
            this.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(int i) {
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll[i];
        final float llllIIIlIlllIlIIIIIl = liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl;
        while (i > 0) {
            final int n = i - 1 >> 1;
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2 = this.llllIIIIlIIIlIlllIll[n];
            if (llllIIIlIlllIlIIIIIl >= liiiIlIIIIIlllIllIII2.llllIIIlIlllIlIIIIIl) {
                break;
            }
            this.llllIIIIlIIIlIlllIll[i] = liiiIlIIIIIlllIllIII2;
            liiiIlIIIIIlllIllIII2.IlIIIlIlIIIllIlIlIIl = i;
            i = n;
        }
        this.llllIIIIlIIIlIlllIll[i] = liiiIlIIIIIlllIllIII;
        liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = i;
    }
    
    private void IlIlIlIlIlllllllllIl(int ilIIIlIlIIIllIlIlIIl) {
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl];
        final float llllIIIlIlllIlIIIIIl = liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl;
        while (true) {
            final int n = 1 + (ilIIIlIlIIIllIlIlIIl << 1);
            final int n2 = n + 1;
            if (n >= this.IlIlIlIlIlllllllllIl) {
                break;
            }
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2 = this.llllIIIIlIIIlIlllIll[n];
            final float llllIIIlIlllIlIIIIIl2 = liiiIlIIIIIlllIllIII2.llllIIIlIlllIlIIIIIl;
            lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII3;
            float llllIIIlIlllIlIIIIIl3;
            if (n2 >= this.IlIlIlIlIlllllllllIl) {
                liiiIlIIIIIlllIllIII3 = null;
                llllIIIlIlllIlIIIIIl3 = Float.POSITIVE_INFINITY;
            }
            else {
                liiiIlIIIIIlllIllIII3 = this.llllIIIIlIIIlIlllIll[n2];
                llllIIIlIlllIlIIIIIl3 = liiiIlIIIIIlllIllIII3.llllIIIlIlllIlIIIIIl;
            }
            if (llllIIIlIlllIlIIIIIl2 < llllIIIlIlllIlIIIIIl3) {
                if (llllIIIlIlllIlIIIIIl2 >= llllIIIlIlllIlIIIIIl) {
                    break;
                }
                this.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl] = liiiIlIIIIIlllIllIII2;
                liiiIlIIIIIlllIllIII2.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
                ilIIIlIlIIIllIlIlIIl = n;
            }
            else {
                if (llllIIIlIlllIlIIIIIl3 >= llllIIIlIlllIlIIIIIl) {
                    break;
                }
                this.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl] = liiiIlIIIIIlllIllIII3;
                liiiIlIIIIIlllIllIII3.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
                ilIIIlIlIIIllIlIlIIl = n2;
            }
        }
        this.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl] = liiiIlIIIIIlllIllIII;
        liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl == 0;
    }
}
