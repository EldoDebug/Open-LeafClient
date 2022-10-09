package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIIIIlIIIlIlllIll extends IIllIIIlIIlIlIlIIIII
{
    public static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/armorstand/wood.png");
    }
    
    public llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(), 0.0f);
        this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this, this));
        this.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(this));
        this.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(this.llllIIIIlIIIlIlllIll().llIllIlIIIIllIlIIllI));
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
    }
    
    public net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        return (net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll)super.IlIlIlIlIlllllllllIl();
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2, final float n3) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - n2, 0.0f, 1.0f, 0.0f);
    }
    
    protected boolean IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl();
    }
}
