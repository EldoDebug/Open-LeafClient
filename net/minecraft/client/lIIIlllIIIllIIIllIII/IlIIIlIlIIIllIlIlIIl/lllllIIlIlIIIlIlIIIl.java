package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lllllIIlIlIIIlIlIIIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/witch.png");
    }
    
    public lllllIIlIlIIIlIlIIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IlIllllIIlIIlIlIlIll(0.0f), 0.5f);
        this.llllIIIIlIIIlIlllIll(new IlIlIIIllIIllIlllllI(this));
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI, final double n, final double n2, final double n3, final float n4, final float n5) {
        ((IlIllllIIlIIlIlIlIll)this.IllIIlllIIIIlllIIlIl).IlIlIIIllIIllIlllllI = (illIllIlllIllllIIllI.n() != null);
        super.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        return lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void r_() {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.1875f, 0.0f);
    }
    
    protected void llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI, final float n) {
        final float n2 = 0.9375f;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n2, n2, n2);
    }
}
