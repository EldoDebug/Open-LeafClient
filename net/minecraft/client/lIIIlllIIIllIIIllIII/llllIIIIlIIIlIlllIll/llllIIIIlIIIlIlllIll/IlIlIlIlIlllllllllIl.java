package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

public class IlIlIlIlIlllllllllIl
{
    public float[] llllIIIIlIIIlIlllIll;
    public final int IlIlIlIlIlllllllllIl;
    
    public IlIlIlIlIlllllllllIl(final float[] llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public float llllIIIIlIIIlIlllIll(final int n) {
        if (this.llllIIIIlIIIlIlllIll == null) {
            throw new NullPointerException("uvs");
        }
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(n);
        return (ilIIIlIlIIIllIlIlIIl != 0 && ilIIIlIlIIIllIlIlIIl != 1) ? this.llllIIIIlIIIlIlllIll[2] : this.llllIIIIlIIIlIlllIll[0];
    }
    
    public float IlIlIlIlIlllllllllIl(final int n) {
        if (this.llllIIIIlIIIlIlllIll == null) {
            throw new NullPointerException("uvs");
        }
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(n);
        return (ilIIIlIlIIIllIlIlIIl != 0 && ilIIIlIlIIIllIlIlIIl != 3) ? this.llllIIIIlIIIlIlllIll[3] : this.llllIIIIlIIIlIlllIll[1];
    }
    
    private int IlIIIlIlIIIllIlIlIIl(final int n) {
        return (n + this.IlIlIlIlIlllllllllIl / 90) % 4;
    }
    
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return (n + (4 - this.IlIlIlIlIlllllllllIl / 90)) % 4;
    }
    
    public void llllIIIIlIIIlIlllIll(final float[] llllIIIIlIIIlIlllIll) {
        if (this.llllIIIIlIIIlIlllIll == null) {
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        }
    }
}
