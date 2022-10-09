package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIIlllIIIIlllIIlIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    protected net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    protected float IlIlIIIllIllIIIIIllI;
    
    static {
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/steve.png");
    }
    
    public IllIIlllIIIIlllIIlIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final float n) {
        this(lllIllIIIllllllIllll, illIIlllIIIIlllIIlIl, n, 1.0f);
        this.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(this));
    }
    
    public IllIIlllIIIIlllIIlIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll, final float n, final float ilIlIIIllIllIIIIIllI) {
        super(lllIllIIIllllllIllll, llllIIIIlIIIlIlllIll, n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll(new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        return IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll;
    }
    
    @Override
    public void r_() {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.1875f, 0.0f);
    }
}
