package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class lIllIIIIIlllIIlIIllI extends IlIIIlIlIIIllIlIlIIl
{
    public final int llllIIIlIlllIlIIIIIl;
    private final int lIIIIlIIIIIlllIllIII;
    private final float lIIIlllIIIllIIIllIII;
    private final boolean llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    private int IIIIlllIIIIIIlIIIlll;
    private float llllIIllllIlIlIIIIll;
    
    public lIllIIIIIlllIIlIIllI(final int liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII, final boolean llIIlIIIlIIIllIlIIIl) {
        this.llllIIIlIlllIlIIIIIl = 32;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
    }
    
    public lIllIIIIIlllIIlIIllI(final int n, final boolean b) {
        this(n, 0.6f, b);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        llllIIIIlIIIlIlllIll.aq().llllIIIIlIIIlIlllIll(this, lllIIIIlIlIllIIlIIIl);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.burp", 0.5f, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f);
        this.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        return lllIIIIlIlIllIIlIIIl;
    }
    
    protected void IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.lIlIlIIIllIIllIIIllI > 0 && illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() < this.llllIIllllIlIlIIIIll) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI * 20, this.IIIIlllIIIIIIlIIIlll));
        }
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return 32;
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(this.llIllIlIIIIllIlIIllI)) {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl, this.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl));
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public int llIllIlIIIIllIlIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public float lIlIlIIIllIIllIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public boolean lllIIIIlllllIlIIllIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public lIllIIIIIlllIIlIIllI llllIIIIlIIIlIlllIll(final int lIlIlIIIllIIllIIIllI, final int ilIlIIIllIIllIlllllI, final int iiiIlllIIIIIIlIIIlll, final float llllIIllllIlIlIIIIll) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        return this;
    }
    
    public lIllIIIIIlllIIlIIllI IlIlIIIIIIlllIlIllIl() {
        this.llIllIlIIIIllIlIIllI = true;
        return this;
    }
}
