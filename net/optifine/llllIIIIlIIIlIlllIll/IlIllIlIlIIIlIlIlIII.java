package net.optifine.llllIIIIlIIIlIlllIll;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IlIllIlIlIIIlIlIlIII
{
    private int llllIIIIlIIIlIlllIll;
    private int[] IlIlIlIlIlllllllllIl;
    
    public IlIllIlIlIIIlIlIlIII(final int n) {
        this(n, null);
    }
    
    public IlIllIlIlIIIlIlIlIII(final int n, final int n2) {
        this(n, new int[] { n2 });
    }
    
    public IlIllIlIlIIIlIlIlIII(final int llllIIIIlIIIlIlllIll, final int[] ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll == n && (this.IlIlIlIlIlllllllllIl == null || net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n2, this.IlIlIlIlIlllllllllIl));
    }
    
    private boolean IlIlIlIlIlllllllllIl(final int n) {
        return this.IlIlIlIlIlllllllllIl != null && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, this.IlIlIlIlIlllllllllIl);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n) {
        if (this.IlIlIlIlIlllllllllIl == null) {
            this.IlIlIlIlIlllllllllIl = new int[] { n };
            return true;
        }
        if (this.IlIlIlIlIlllllllllIl(n)) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, n);
        return true;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int[] IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String toString() {
        return (this.IlIlIlIlIlllllllllIl == null) ? new StringBuilder().append(this.llllIIIIlIIIlIlllIll).toString() : (this.llllIIIIlIIIlIlllIll + ":" + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl));
    }
}
