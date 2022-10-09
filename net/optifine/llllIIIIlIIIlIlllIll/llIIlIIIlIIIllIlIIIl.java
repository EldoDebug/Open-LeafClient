package net.optifine.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class llIIlIIIlIIIllIlIIIl
{
    private int llllIIIIlIIIlIlllIll;
    private int[] IlIlIlIlIlllllllllIl;
    
    public llIIlIIIlIIIllIlIIIl(final int llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = -1;
        this.IlIlIlIlIlllllllllIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public llIIlIIIlIIIllIlIIIl(final int llllIIIIlIIIlIlllIll, final int n) {
        this.llllIIIIlIIIlIlllIll = -1;
        this.IlIlIlIlIlllllllllIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (n >= 0 && n <= 15) {
            this.IlIlIlIlIlllllllllIl = new int[] { n };
        }
    }
    
    public llIIlIIIlIIIllIlIIIl(final int llllIIIIlIIIlIlllIll, final int[] ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = -1;
        this.IlIlIlIlIlllllllllIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int[] IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        return illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() == this.llllIIIIlIIIlIlllIll && llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl(), this.IlIlIlIlIlllllllllIl);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return n == this.llllIIIIlIIIlIlllIll && llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n2, this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (this.IlIlIlIlIlllllllllIl != null && n >= 0 && n <= 15) {
            for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
                if (this.IlIlIlIlIlllllllllIl[i] == n) {
                    return;
                }
            }
            this.IlIlIlIlIlllllllllIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, n);
        }
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll + ":" + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
}
