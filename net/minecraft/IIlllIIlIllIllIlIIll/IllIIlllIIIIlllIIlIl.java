package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;

public class IllIIlllIIIIlllIIlIl
{
    protected static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private net.minecraft.client.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/gui/widgets.png");
    }
    
    public IllIIlllIIIIlllIIlIl(final int n, final int n2, final int n3, final String s) {
        this.IlIlIlIlIlllllllllIl = new net.minecraft.client.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(this, n, n2, n3, s);
    }
    
    public IllIIlllIIIIlllIIlIl(final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.IlIlIlIlIlllllllllIl = new net.minecraft.client.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(this, n, n2, n3, s, n4, n5);
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(b);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(s);
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl();
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(Minecraft.getMinecraft(), n, n2);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2) {
    }
    
    public void llIllIIIIIllIlIIIIlI(final int n, final int n2) {
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n, n2, n3, n4, n5, n6);
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
    }
    
    public int IlIlIlIlIlllllllllIl(final boolean b) {
        return this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(b);
    }
}
