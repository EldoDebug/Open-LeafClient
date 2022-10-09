package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class llIllIlIIIIllIlIIllI extends IlIllIlIlIIIlIlIlIII
{
    public llIllIlIIIIllIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final double n, final boolean b, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final float n, final float n2) {
        if (this.llIIIlIlllIllIIlIllI()) {
            this.IlIlIlIlIlllllllllIl(n, n2, 0.02f);
            this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
            this.lIllllllIIllIlIlIlII *= 0.800000011920929;
            this.llIIlllIIlllIIllIllI *= 0.800000011920929;
            this.IIlllIIIlIlllIIlllII *= 0.800000011920929;
        }
        else if (this.llIIIllIlIllIllIIIIl()) {
            this.IlIlIlIlIlllllllllIl(n, n2, 0.02f);
            this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
            this.lIllllllIIllIlIlIlII *= 0.5;
            this.llIIlllIIlllIIllIllI *= 0.5;
            this.IIlllIIIlIlllIIlllII *= 0.5;
        }
        else {
            float n3 = 0.91f;
            if (this.IIIIIllIIIIlIIIIllIl) {
                n3 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) - 1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI().IlIIIlIIIllllIlIlIlI * 0.91f;
            }
            final float n4 = 0.16277136f / (n3 * n3 * n3);
            this.IlIlIlIlIlllllllllIl(n, n2, this.IIIIIllIIIIlIIIIllIl ? (0.1f * n4) : 0.02f);
            float n5 = 0.91f;
            if (this.IIIIIllIIIIlIIIIllIl) {
                n5 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) - 1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI().IlIIIlIIIllllIlIlIlI * 0.91f;
            }
            this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
            this.lIllllllIIllIlIlIlII *= n5;
            this.llIIlllIIlllIIllIllI *= n5;
            this.IIlllIIIlIlllIIlllII *= n5;
        }
        this.lllIlIIIIIlIlllllIlI = this.llIlIIIIllIlIIlIlIII;
        final double n6 = this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII;
        final double n7 = this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII;
        float n8 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n6 * n6 + n7 * n7) * 4.0f;
        if (n8 > 1.0f) {
            n8 = 1.0f;
        }
        this.llIlIIIIllIlIIlIlIII += (n8 - this.llIlIIIIllIlIIlIlIII) * 0.4f;
        this.IIIIIlllIlIIIIIIIllI += this.llIlIIIIllIlIIlIlIII;
    }
    
    @Override
    public boolean f_() {
        return false;
    }
}
