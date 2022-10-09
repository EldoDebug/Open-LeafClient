package net.minecraft.client.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.mojang.authlib.*;
import leaf.*;
import net.minecraft.client.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIlIlIlllllllllIl extends llllIIIIlIIIlIlllIll
{
    private boolean llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    private double llllIIIlIlllIlIIIIIl;
    
    public IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final GameProfile gameProfile) {
        super(illlllllIIIlIIIlIlII, gameProfile);
        this.llIIIIIIlIllIIlIIIll = 0.0f;
        this.lIIIIlIlIllllIIlIllI = true;
        this.I = 0.25f;
        this.lllIIIIlllllIlIIllIl = 10.0;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (Leaf.instance.modManager.killEffectMod.lIlIlIIIllIIllIIIllI() && lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() != null && lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl().s_().equals(Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI())) {
            Leaf.instance.modManager.killEffectMod.y = this.s_();
        }
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI, final float n, final float n2, final int ilIlIlIlIlllllllllIl, final boolean b) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = n;
        this.llllIIIlIlllIlIIIIIl = n2;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.I = 0.0f;
        super.IIllIIllIIIlIlIIIIlI();
        this.lllIlIIIIIlIlllllIlI = this.llIlIIIIllIlIIlIlIII;
        final double n = this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII;
        final double n2 = this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII;
        float n3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n2 * n2) * 4.0f;
        if (n3 > 1.0f) {
            n3 = 1.0f;
        }
        this.llIlIIIIllIlIIlIlIII += (n3 - this.llIlIIIIllIlIIlIlIII) * 0.4f;
        this.IIIIIlllIlIIIIIIIllI += this.llIlIIIIllIlIIlIlIII;
        if (!this.llllIIIIlIIIlIlllIll && this.IIlllIIIllIllIIlIlIl() && this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI];
            this.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI], lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl));
            this.llllIIIIlIIIlIlllIll = true;
        }
        else if (this.llllIIIIlIIIlIlllIll && !this.IIlllIIIllIllIIlIlIl()) {
            this.j();
            this.llllIIIIlIIIlIlllIll = false;
        }
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IlIlIlIlIlllllllllIl > 0) {
            final double n = this.IIlllIlIIllIlIlIlIIl + (this.llIllIIIIIllIlIIIIlI - this.IIlllIlIIllIlIlIlIIl) / this.IlIlIlIlIlllllllllIl;
            final double n2 = this.llIIIlIlIllIIlIlIlII + (this.IlIIIlIlIIIllIlIlIIl - this.llIIIlIlIllIIlIlIlII) / this.IlIlIlIlIlllllllllIl;
            final double n3 = this.lllllIlIIIlIlIIlllII + (this.IlIlIIIllIllIIIIIllI - this.lllllIlIIIlIlIIlllII) / this.IlIlIlIlIlllllllllIl;
            double n4;
            for (n4 = this.IllIIlllIIIIlllIIlIl - this.IIlIIIIIllIlIIIlIIll; n4 < -180.0; n4 += 360.0) {}
            while (n4 >= 180.0) {
                n4 -= 360.0;
            }
            this.IIlIIIIIllIlIIIlIIll += (float)(n4 / this.IlIlIlIlIlllllllllIl);
            this.llllllIllIllIlIllllI += (float)((this.llllIIIlIlllIlIIIIIl - this.llllllIllIllIlIllllI) / this.IlIlIlIlIlllllllllIl);
            --this.IlIlIlIlIlllllllllIl;
            this.IlIlIlIlIlllllllllIl(n, n2, n3);
            this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
        }
        this.w = this.x;
        this.W();
        float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
        float n5 = (float)Math.atan(-this.llIIlllIIlllIIllIllI * 0.20000000298023224) * 15.0f;
        if (llllIIIIlIIIlIlllIll > 0.1f) {
            llllIIIIlIIIlIlllIll = 0.1f;
        }
        if (!this.IIIIIllIIIIlIIIIllIl || this.N() <= 0.0f) {
            llllIIIIlIIIlIlllIll = 0.0f;
        }
        if (this.IIIIIllIIIIlIIIIllIl || this.N() <= 0.0f) {
            n5 = 0.0f;
        }
        this.x += (llllIIIIlIIIlIlllIll - this.x) * 0.4f;
        this.lIllllIllIllIIllllll += (n5 - this.lIllllIllIllIIllllll) * 0.8f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (n == 0) {
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = lllIIIIlIlIllIIlIIIl;
        }
        else {
            this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl[n - 1] = lllIIIIlIlIllIIlIIIl;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final String s) {
        return false;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIlIIIlIIlIlIIlllIl() {
        return new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + 0.5, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII + 0.5);
    }
}
