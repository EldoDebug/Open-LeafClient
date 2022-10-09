package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import org.lwjgl.input.*;
import net.minecraft.IIlllIIlIllIllIlIIll.*;

public class lIIIIlIIIIIlllIllIII extends lllIIIIlIlIllIIlIIIl
{
    private final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll;
    
    public lIIIIlIIIIIlllIllIII(final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(Minecraft.getMinecraft(), n, n2, n3, n4, n5);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final boolean b, final int n2, final int n3) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, b, n2, n3);
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6);
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return super.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return super.lIlIlIIIllIIllIIIllI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return super.llIllIlIIIIllIlIIllI;
    }
    
    @Override
    protected int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void lIIIIlIIIIIlllIllIII() {
        super.lIIIIlIIIIIlllIllIII();
        if (this.llllIIllllIlIlIIIIll > 0.0f && Mouse.getEventButtonState()) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.IlIlIIIlIIlIlIIlllIl, this.IlIllIlIlIIIlIlIlIII, this.llIIlIIIlIIIllIlIIIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, n3, iiIlIIlIIIIlllIlllII);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        for (int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(), i = 0; i < llllIIIIlIIIlIlllIll; ++i) {
            final int n5 = n2 + i * this.llIIlIIIlIIIllIlIIIl + this.IlIlIIIlIIlIlIIlllIl;
            final int n6 = this.llIIlIIIlIIIllIlIIIl - 4;
            if (n5 > this.llllIIIlIlllIlIIIIIl || n5 + n6 < this.IllIIlllIIIIlllIIlIl) {
                this.llllIIIIlIIIlIlllIll(i, n, n5);
            }
            if (this.IIllIIllIIIlIlIIIIlI && this.llllIIIIlIIIlIlllIll(i)) {
                this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, n5, n6, IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl);
            }
            this.llllIIIIlIIIlIlllIll(i, n, n5, n6, n3, n4);
        }
    }
}
