package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class lIlIlIlllIIlIlIlllIl extends IIIllllllIllIIIlllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI IIIIIIIllllIlIIIIIII;
    private int IIlllIIIllIllIIlIlIl;
    private int llIlllIlllllIIllIIII;
    private IIlllIIlIllIllIlIIll lllllIlIlIlllIlllIlI;
    private float IlIllllIIlIllIlIlIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/explosion.png");
        IIIIIIIllllIlIIIIIII = new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll).llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll).llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII).llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl).llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl).llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI);
    }
    
    protected lIlIlIlllIIlIlIlllIl(final IIlllIIlIllIllIlIIll lllllIlIlIlllIlllIlI, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.lllllIlIlIlllIlllIlI = lllllIlIlIlllIlllIlI;
        this.llIlllIlllllIIllIIII = 6 + this.IlIIllIIllIIllIIlIIl.nextInt(4);
        final float llIIlIIIlIIIllIlIIIl = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.6f + 0.4f;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlIllllIIlIllIlIlIll = 1.0f - (float)n4 * 0.5f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final int n7 = (int)((this.IIlllIIIllIllIIlIlIl + n) * 15.0f / this.llIlllIlllllIIllIIII);
        if (n7 <= 15) {
            this.lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll(lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll);
            final float n8 = n7 % 4 / 4.0f;
            final float n9 = n8 + 0.24975f;
            final float n10 = n7 / 4 / 4.0f;
            final float n11 = n10 + 0.24975f;
            final float n12 = 2.0f * this.IlIllllIIlIllIlIlIll;
            final float n13 = (float)(this.IIlIIIIlllIlllllIlII + (this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII) * n - lIlIlIlllIIlIlIlllIl.llllIIllllIlIlIIIIll);
            final float n14 = (float)(this.IIIlIIlIIIIlllIlllII + (this.llIIIlIlIllIIlIlIlII - this.IIIlIIlIIIIlllIlllII) * n - lIlIlIlllIIlIlIlllIl.IlIllIlIlIIIlIlIlIII);
            final float n15 = (float)(this.IlIlIllllllllIIIIlII + (this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII) * n - lIlIlIlllIIlIlIlllIl.IIlllIIlIllIllIlIIll);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(7, lIlIlIlllIIlIlIlllIl.IIIIIIIllllIlIIIIIII);
            liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n13 - n2 * n12 - n5 * n12, n14 - n3 * n12, (double)(n15 - n4 * n12 - n6 * n12)).llllIIIIlIIIlIlllIll(n9, n11).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(0, 240).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
            liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n13 - n2 * n12 + n5 * n12, n14 + n3 * n12, (double)(n15 - n4 * n12 + n6 * n12)).llllIIIIlIIIlIlllIll(n9, n10).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(0, 240).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
            liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n13 + n2 * n12 + n5 * n12, n14 + n3 * n12, (double)(n15 + n4 * n12 + n6 * n12)).llllIIIIlIIIlIlllIll(n8, n10).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(0, 240).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
            liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n13 + n2 * n12 - n5 * n12, n14 - n3 * n12, (double)(n15 + n4 * n12 - n6 * n12)).llllIIIIlIIIlIlllIll(n8, n11).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(0, 240).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        }
    }
    
    @Override
    public int a_(final float n) {
        return 61680;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        ++this.IIlllIIIllIllIIlIlIl;
        if (this.IIlllIIIllIllIIlIlIl == this.llIlllIlllllIIllIIII) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
}
