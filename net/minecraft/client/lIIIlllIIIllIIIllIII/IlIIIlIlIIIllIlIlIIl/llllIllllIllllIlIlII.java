package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIllllIllllIlIlII extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/wolf/wolf.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/wolf/wolf_tame.png");
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/wolf/wolf_angry.png");
    }
    
    public llllIllllIllllIlIlII(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        super(lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, n);
        this.llllIIIIlIIIlIlllIll(new IIlIIIIlllIlllllIlII(this));
    }
    
    protected float llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final float n) {
        return iiIllllllIllIIIlllIl.aw();
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        if (iiIllllllIllIIIlllIl.aq()) {
            final float n6 = iiIllllllIllIIIlllIl.b_(n5) * iiIllllllIllIIIlllIl.llllIIllllIlIlIIIIll(n5);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n6, n6, n6);
        }
        super.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        return iiIllllllIllIIIlllIl.as() ? llllIllllIllllIlIlII.IlIlIIIllIllIIIIIllI : (iiIllllllIllIIIlllIl.ax() ? llllIllllIllllIlIlII.IIIlIIIlIlIIlllIIlll : llllIllllIllllIlIlII.llllIIIIlIIIlIlllIll);
    }
}
