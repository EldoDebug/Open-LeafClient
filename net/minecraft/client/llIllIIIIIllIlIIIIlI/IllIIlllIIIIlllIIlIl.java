package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;

public class IllIIlllIIIIlllIIlIl extends IlIIIlIlIIIllIlIlIIl
{
    private net.minecraft.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl llllIIllllIlIlIIIIll;
    
    public IllIIlllIIIIlllIIlIl(final net.minecraft.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl llllIIllllIlIlIIIIll, final int n, final int n2, final int n3, final String s) {
        super(n, n2, n3, s);
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public IllIIlllIIIIlllIIlIl(final net.minecraft.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl llllIIllllIlIlIIIIll, final int n, final int n2, final int n3, final String s, final int n4, final int n5) {
        super(n, n2, n3, n4, n5, s);
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return super.llIllIlIIIIllIlIIllI;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return super.lIlIlIIIllIIllIIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean lIlIlIIIllIIllIIIllI) {
        super.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final String llIIlIIIlIIIllIlIIIl) {
        super.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl() {
        return super.IlIlIlIlIlllllllllIl();
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return super.lIIIlllIIIllIIIllIII;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final Minecraft minecraft, final int n, final int n2) {
        if (super.llIllIIIIIllIlIIIIlI(minecraft, n, n2)) {
            this.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(n, n2);
        }
        return super.llIllIIIIIllIlIIIIlI(minecraft, n, n2);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI(n, n2);
    }
    
    public void IlIlIlIlIlllllllllIl(final Minecraft minecraft, final int n, final int n2) {
        this.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(n, n2);
    }
    
    public net.minecraft.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public int llllIIIIlIIIlIlllIll(final boolean b) {
        return this.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(b);
    }
    
    public int llIllIIIIIllIlIIIIlI(final boolean b) {
        return super.llllIIIIlIIIlIlllIll(b);
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
