package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIIIIlllIlIllIl extends llIllIIIIIllIlIIIIlI
{
    private float llllIIIIlIIIlIlllIll;
    
    public IlIlIIIIIIlllIlIllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float llllIIIIlIIIlIlllIll) {
        super(lllIllIIIllllllIllll);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        this.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll);
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll = Minecraft.getMinecraft().IllIIlllllIIllIIllIl().llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.P);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        final float ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        final float illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
        final float llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
        final float liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 1.0f, 0.0f, 0.0f);
        llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI);
        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-0.5, -0.25, 0.0).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, liiiIlIIIIIlllIllIII).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(0.5, -0.25, 0.0).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, liiiIlIIIIIlllIllIII).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(0.5, 0.75, 0.0).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-0.5, 0.75, 0.0).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;
    }
}
