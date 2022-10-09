package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IIIllllllIllIIIlllIl extends llIllIIIIIllIlIIIIlI
{
    protected int IlIlIlIlIlllllllllIl;
    protected int llIllIIIIIllIlIIIIlI;
    protected float IlIIIlIlIIIllIlIlIIl;
    protected float IlIlIIIllIllIIIIIllI;
    protected int IllIIlllIIIIlllIIlIl;
    protected int llllIIIlIlllIlIIIIIl;
    protected float lIIIIlIIIIIlllIllIII;
    protected float lIIIlllIIIllIIIllIII;
    protected float llIIlIIIlIIIllIlIIIl;
    protected float llIllIlIIIIllIlIIllI;
    protected float lIlIlIIIllIIllIIIllI;
    protected float IlIlIIIllIIllIlllllI;
    protected IlIlIIIllIIllIlllllI IIIIlllIIIIIIlIIIlll;
    public static double llllIIllllIlIlIIIIll;
    public static double IlIllIlIlIIIlIlIlIII;
    public static double IIlllIIlIllIllIlIIll;
    
    protected IIIllllllIllIIIlllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIllIIllIlllllI = 1.0f;
        this.llllIIIIlIIIlIlllIll(0.2f, 0.2f);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        this.IIlIIIIlllIlllllIlII = n;
        this.lIIlIIIlIllIlIllIIIl = n;
        this.IIIlIIlIIIIlllIlllII = n2;
        this.IIlIIIlllIllIllIlIII = n2;
        this.IlIlIllllllllIIIIlII = n3;
        this.lIlIlIlllIIlIlIlllIl = n3;
        final float llIIlIIIlIIIllIlIIIl = 1.0f;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlIIIlIlIIIllIlIlIIl = this.IlIIllIIllIIllIIlIIl.nextFloat() * 3.0f;
        this.IlIlIIIllIllIIIIIllI = this.IlIIllIIllIIllIIlIIl.nextFloat() * 3.0f;
        this.lIIIIlIIIIIlllIllIII = (this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.llllIIIlIlllIlIIIIIl = (int)(4.0f / (this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.9f + 0.1f));
        this.IllIIlllIIIIlllIIlIl = 0;
    }
    
    public IIIllllllIllIIIlllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this(illlllllIIIlIIIlIlII, n, n2, n3);
        this.lIllllllIIllIlIlIlII = n4 + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        this.llIIlllIIlllIIllIllI = n5 + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        this.IIlllIIIlIlllIIlllII = n6 + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        final float n7 = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.llIIlllIIlllIIllIllI * this.llIIlllIIlllIIllIllI + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII = this.lIllllllIIllIlIlIlII / llllIIIIlIIIlIlllIll * n7 * 0.4000000059604645;
        this.llIIlllIIlllIIllIllI = this.llIIlllIIlllIIllIllI / llllIIIIlIIIlIlllIll * n7 * 0.4000000059604645 + 0.10000000149011612;
        this.IIlllIIIlIlllIIlllII = this.IIlllIIIlIlllIIlllII / llllIIIIlIIIlIlllIll * n7 * 0.4000000059604645;
    }
    
    public IIIllllllIllIIIlllIl IlIIIlIlIIIllIlIlIIl(final float n) {
        this.lIllllllIIllIlIlIlII *= n;
        this.llIIlllIIlllIIllIllI = (this.llIIlllIIlllIIllIllI - 0.10000000149011612) * n + 0.10000000149011612;
        this.IIlllIIIlIlllIIlllII *= n;
        return this;
    }
    
    public IIIllllllIllIIIlllIl IlIlIIIllIllIIIIIllI(final float n) {
        this.llllIIIIlIIIlIlllIll(0.2f * n, 0.2f * n);
        this.lIIIIlIIIIIlllIllIII *= n;
        return this;
    }
    
    public void llllIIIIlIIIlIlllIll(final float llIIlIIIlIIIllIlIIIl, final float llIllIlIIIIllIlIIllI, final float lIlIlIIIllIIllIIIllI) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public void IllIIlllIIIIlllIIlIl(final float ilIlIIIllIIllIlllllI) {
        if (this.IlIlIIIllIIllIlllllI == 1.0f && ilIlIIIllIIllIlllllI < 1.0f) {
            Minecraft.getMinecraft().llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(this);
        }
        else if (this.IlIlIIIllIIllIlllllI < 1.0f && ilIlIIIllIIllIlllllI == 1.0f) {
            Minecraft.getMinecraft().llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(this);
        }
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public float llllIIIlIlllIlIIIIIl() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public float lIIIIlIIIIIlllIllIII() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public float lIIIlllIIIllIIIllIII() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    protected void a_() {
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        if (this.IllIIlllIIIIlllIIlIl++ >= this.llllIIIlIlllIlIIIIIl) {
            this.IllIllIIIIlIIlIlllII();
        }
        this.llIIlllIIlllIIllIllI -= 0.04 * this.lIIIlllIIIllIIIllIII;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.9800000190734863;
        this.llIIlllIIlllIIllIllI *= 0.9800000190734863;
        this.IIlllIIIlIlllIIlllII *= 0.9800000190734863;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        float ilIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl / 16.0f;
        float illIIlllIIIIlllIIlIl = ilIlIIIllIllIIIIIllI + 0.0624375f;
        float llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI / 16.0f;
        float liiiIlIIIIIlllIllIII = llllIIIlIlllIlIIIIIl + 0.0624375f;
        final float n7 = 0.1f * this.lIIIIlIIIIIlllIllIII;
        if (this.IIIIlllIIIIIIlIIIlll != null) {
            ilIlIIIllIllIIIIIllI = this.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI();
            illIIlllIIIIlllIIlIl = this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl();
            llllIIIlIlllIlIIIIIl = this.IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl();
            liiiIlIIIIIlllIllIII = this.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII();
        }
        final float n8 = (float)(this.IIlIIIIlllIlllllIlII + (this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII) * n - IIIllllllIllIIIlllIl.llllIIllllIlIlIIIIll);
        final float n9 = (float)(this.IIIlIIlIIIIlllIlllII + (this.llIIIlIlIllIIlIlIlII - this.IIIlIIlIIIIlllIlllII) * n - IIIllllllIllIIIlllIl.IlIllIlIlIIIlIlIlIII);
        final float n10 = (float)(this.IlIlIllllllllIIIIlII + (this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII) * n - IIIllllllIllIIIlllIl.IIlllIIlIllIllIlIIll);
        final int a_ = this.a_(n);
        final int n11 = a_ >> 16 & 0xFFFF;
        final int n12 = a_ & 0xFFFF;
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 - n2 * n7 - n5 * n7, n9 - n3 * n7, (double)(n10 - n4 * n7 - n6 * n7)).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, liiiIlIIIIIlllIllIII).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 - n2 * n7 + n5 * n7, n9 + n3 * n7, (double)(n10 - n4 * n7 + n6 * n7)).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 + n2 * n7 + n5 * n7, n9 + n3 * n7, (double)(n10 + n4 * n7 + n6 * n7)).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 + n2 * n7 - n5 * n7, n9 - n3 * n7, (double)(n10 + n4 * n7 - n6 * n7)).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, liiiIlIIIIIlllIllIII).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI iiiIlllIIIIIIlIIIlll) {
        if (this.IlIIIlIlIIIllIlIlIIl() == 1) {
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
            return;
        }
        throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (this.IlIIIlIlIIIllIlIlIIl() != 0) {
            throw new RuntimeException("Invalid call to Particle.setMiscTex");
        }
        this.IlIlIlIlIlllllllllIl = n % 16;
        this.llIllIIIIIllIlIIIIlI = n / 16;
    }
    
    public void lIlIlIIIllIIllIIIllI() {
        ++this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean i_() {
        return false;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.getClass().getSimpleName()) + ", Pos (" + this.IIlllIlIIllIlIlIlIIl + "," + this.llIIIlIlIllIIlIlIlII + "," + this.lllllIlIIIlIlIIlllII + "), RGBA (" + this.llIIlIIIlIIIllIlIIIl + "," + this.llIllIlIIIIllIlIIllI + "," + this.lIlIlIIIllIIllIIIllI + "," + this.IlIlIIIllIIllIlllllI + "), Age " + this.IllIIlllIIIIlllIIlIl;
    }
}
