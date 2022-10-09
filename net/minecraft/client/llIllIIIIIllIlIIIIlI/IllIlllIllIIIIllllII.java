package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIlllIIlIllIllIlIIll.*;
import net.minecraft.client.*;

public class IllIlllIllIIIIllllII extends lllIIIIlIlIllIIlIIIl
{
    private final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    
    public IllIlllIllIIIIllllII(final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll, final int n, final int n2, final int n3, final int n4, final int n5) {
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
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return super.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return super.lIlIlIIIllIIllIIIllI;
    }
    
    public int lIIIlllIIIllIIIllIII() {
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
    }
}
