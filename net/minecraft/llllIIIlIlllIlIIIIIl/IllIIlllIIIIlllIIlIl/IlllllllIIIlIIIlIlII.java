package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlllllllIIIlIIIlIlII extends llllllIllIllIlIllllI
{
    public float llllIIIIlIIIlIlllIll;
    public float IlIlIlIlIlllllllllIl;
    public float llIllIIIIIllIlIIIIlI;
    public float IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    public float t;
    public float u;
    public float v;
    private float w;
    private float x;
    private float y;
    private float z;
    private float A;
    private float B;
    
    public IlllllllIIIlIIIlIlII(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.95f, 0.95f);
        this.IlIIllIIllIIllIIlIIl.setSeed(1 + this.IlllIIIIlIIIlIlIlIIl());
        this.x = 1.0f / (this.IlIIllIIllIIllIIlIIl.nextFloat() + 1.0f) * 0.2f;
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, new IIlIIIIlllIlllllIlII(this));
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(10.0);
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return this.IlIllllIIlIIlIlIlIll * 0.5f;
    }
    
    @Override
    protected String e() {
        return null;
    }
    
    @Override
    protected String O() {
        return null;
    }
    
    @Override
    protected String P() {
        return null;
    }
    
    @Override
    protected float Z() {
        return 0.4f;
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return null;
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        for (int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(3 + n) + 1, i = 0; i < n2; ++i) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, 1, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI()), 0.0f);
        }
    }
    
    @Override
    public boolean llIIIlIlllIllIIlIllI() {
        return this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(0.0, -0.6000000238418579, 0.0), net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII, this);
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        super.IIIlIIIlIlIIlllIIlll();
        this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = this.llIllIIIIIllIlIIIIlI;
        this.t = this.IlIlIIIllIllIIIIIllI;
        this.v = this.u;
        this.IlIlIIIllIllIIIIIllI += this.x;
        if (this.IlIlIIIllIllIIIIIllI > 6.283185307179586) {
            if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.IlIlIIIllIllIIIIIllI = 6.2831855f;
            }
            else {
                this.IlIlIIIllIllIIIIIllI -= (float)6.283185307179586;
                if (this.IlIIllIIllIIllIIlIIl.nextInt(10) == 0) {
                    this.x = 1.0f / (this.IlIIllIIllIIllIIlIIl.nextFloat() + 1.0f) * 0.2f;
                }
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)19);
            }
        }
        if (this.lIllIIIIIlllIIlIIllI) {
            if (this.IlIlIIIllIllIIIIIllI < 3.1415927f) {
                final float n = this.IlIlIIIllIllIIIIIllI / 3.1415927f;
                this.u = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n * 3.1415927f) * 3.1415927f * 0.25f;
                if (n > 0.75) {
                    this.w = 1.0f;
                    this.y = 1.0f;
                }
                else {
                    this.y *= 0.8f;
                }
            }
            else {
                this.u = 0.0f;
                this.w *= 0.9f;
                this.y *= 0.99f;
            }
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.lIllllllIIllIlIlIlII = this.z * this.w;
                this.llIIlllIIlllIIllIllI = this.A * this.w;
                this.IIlllIIIlIlllIIlllII = this.B * this.w;
            }
            final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
            this.lIllIlIIIllllllIIlII += (-(float)net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.lIllllllIIllIlIlIlII, this.IIlllIIIlIlllIIlllII) * 180.0f / 3.1415927f - this.lIllIlIIIllllllIIlII) * 0.1f;
            this.IIlIIIIIllIlIIIlIIll = this.lIllIlIIIllllllIIlII;
            this.llIllIIIIIllIlIIIIlI += (float)(3.141592653589793 * this.y * 1.5);
            this.llllIIIIlIIIlIlllIll += (-(float)net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, this.llIIlllIIlllIIllIllI) * 180.0f / 3.1415927f - this.llllIIIIlIIIlIlllIll) * 0.1f;
        }
        else {
            this.u = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI)) * 3.1415927f * 0.25f;
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.lIllllllIIllIlIlIlII = 0.0;
                this.llIIlllIIlllIIllIllI -= 0.08;
                this.llIIlllIIlllIIllIllI *= 0.9800000190734863;
                this.IIlllIIIlIlllIIlllII = 0.0;
            }
            this.llllIIIIlIIIlIlllIll += (float)((-90.0f - this.llllIIIIlIIIlIlllIll) * 0.02);
        }
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final float n, final float n2) {
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.llIIIlIlIllIIlIlIlII > 45.0 && this.llIIIlIlIllIIlIlIlII < this.IlllllllIIIlIIIlIlII.IlIlIIIlIIlIlIIlllIl() && super.lIlIlIIIllIIllIIIllI();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 19) {
            this.IlIlIIIllIllIIIIIllI = 0.0f;
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final float z, final float a, final float b) {
        this.z = z;
        this.A = a;
        this.B = b;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.z != 0.0f || this.A != 0.0f || this.B != 0.0f;
    }
}
