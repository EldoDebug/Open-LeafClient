package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class lIllIIlIlIlllllIIIII
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final Minecraft IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/gui/stream_indicator.png");
    }
    
    public lIllIIlIlIlllllIIIII(final Minecraft ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = 1.0f;
        this.IlIIIlIlIIIllIlIlIIl = 1;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (this.IlIlIlIlIlllllllllIl.lIIlIIIlIllIlIllIIIl().llIllIlIIIIllIlIIllI()) {
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            final int illlllllIIIlIIIlIlII = this.IlIlIlIlIlllllllllIl.lIIlIIIlIllIlIllIIIl().IlllllllIIIlIIIlIlII();
            if (illlllllIIIlIIIlIlII > 0) {
                final String string = new StringBuilder().append(illlllllIIIlIIIlIlII).toString();
                final int llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string);
                final int n3 = n - llllIIIIlIIIlIlllIll - 1;
                final int n4 = n2 + 20 - 1;
                final int n5 = n2 + 20 + this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll - 1;
                lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
                final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 0.0f, (0.65f + 0.35000002f * this.llIllIIIIIllIlIIIIlI) / 2.0f);
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n5, 0.0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n5, 0.0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n4, 0.0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n4, 0.0).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
                lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string, n - llllIIIIlIIIlIlllIll, n2 + 20, 16777215);
            }
            this.llllIIIIlIIIlIlllIll(n, n2, this.IlIlIlIlIlllllllllIl(), 0);
            this.llllIIIIlIIIlIlllIll(n, n2, this.llIllIIIIIllIlIIIIlI(), 17);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 0.65f + 0.35000002f * this.llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll);
        final float n5 = 150.0f;
        final float n6 = 0.0f;
        final float n7 = n3 * 0.015625f;
        final float n8 = 1.0f;
        final float n9 = (n3 + 16) * 0.015625f;
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n - 16 - n4, n2 + 16, (double)n5).llllIIIIlIIIlIlllIll(n6, n9).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n - n4, n2 + 16, (double)n5).llllIIIIlIIIlIlllIll(n8, n9).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n - n4, n2 + 0, (double)n5).llllIIIIlIIIlIlllIll(n8, n7).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n - 16 - n4, n2 + 0, (double)n5).llllIIIIlIIIlIlllIll(n6, n7).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl.lIIlIIIlIllIlIllIIIl().lIlIlIIIllIIllIIIllI() ? 16 : 0;
    }
    
    private int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl.lIIlIIIlIllIlIllIIIl().lllllIlIIIlIlIIlllII() ? 48 : 32;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (this.IlIlIlIlIlllllllllIl.lIIlIIIlIllIlIllIIIl().llIllIlIIIIllIlIIllI()) {
            this.llIllIIIIIllIlIIIIlI += 0.025f * this.IlIIIlIlIIIllIlIlIIl;
            if (this.llIllIIIIIllIlIIIIlI < 0.0f) {
                this.IlIIIlIlIIIllIlIlIIl *= -1;
                this.llIllIIIIIllIlIIIIlI = 0.0f;
            }
            else if (this.llIllIIIIIllIlIIIIlI > 1.0f) {
                this.IlIIIlIlIIIllIlIlIIl *= -1;
                this.llIllIIIIIllIlIIIIlI = 1.0f;
            }
        }
        else {
            this.llIllIIIIIllIlIIIIlI = 1.0f;
            this.IlIIIlIlIIIllIlIlIIl = 1;
        }
    }
}
