package net.minecraft.client;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.*;

public class llIllIIIIIllIlIIIIlI implements lllllIIIIIlIlIIIIIIl
{
    private String llllIIIIlIIIlIlllIll;
    private Minecraft IlIlIlIlIlllllllllIl;
    private String llIllIIIIIllIlIIIIlI;
    private long IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private g IllIIlllIIIIlllIIlIl;
    private llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    
    public llIllIIIIIllIlIIIIlI(final Minecraft ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = "";
        this.llIllIIIIIllIlIIIIlI = "";
        this.IlIIIlIlIIIllIlIlIIl = Minecraft.IIIllllllIllIIIlllIl();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IllIIlllIIIIlllIIlIl = new g(ilIlIlIlIlllllllllIl);
        (this.llllIIIlIlllIlIIIIIl = new llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, false)).llllIIIIlIIIlIlllIll(9728);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s) {
        this.IlIlIIIllIllIIIIIllI = false;
        this.IlIIIlIlIIIllIlIlIIl(s);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final String s) {
        this.IlIlIIIllIllIIIIIllI = true;
        this.IlIIIlIlIIIllIlIlIIl(s);
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final String llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        if (!this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII) {
            if (!this.IlIlIIIllIllIIIIIllI) {
                throw new lIIIIIlIlIIIlIIIIlIl();
            }
        }
        else {
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(256);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
                final int ilIlIIIllIllIIIIIllI = this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI();
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll() * ilIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl() * ilIlIIIllIllIIIIIllI, 0.0, 100.0, 300.0);
            }
            else {
                final g g = new g(this.IlIlIlIlIlllllllllIl);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, g.llIllIIIIIllIlIIIIlI(), g.IlIIIlIlIIIllIlIlIIl(), 0.0, 100.0, 300.0);
            }
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -200.0f);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final String llllIIIIlIIIlIlllIll) {
        if (!this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII) {
            if (!this.IlIlIIIllIllIIIIIllI) {
                throw new lIIIIIlIlIIIlIIIIlIl();
            }
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = 0L;
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
            this.llllIIIIlIIIlIlllIll(-1);
            this.IlIIIlIlIIIllIlIlIIl = 0L;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (!this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII) {
            if (!this.IlIlIIIllIllIIIIIllI) {
                throw new lIIIIIlIlIIIlIIIIlIl();
            }
        }
        else {
            final long iiIllllllIllIIIlllIl = Minecraft.IIIllllllIllIIIlllIl();
            if (iiIllllllIllIIIlllIl - this.IlIIIlIlIIIllIlIlIIl >= 100L) {
                this.IlIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl;
                final g g = new g(this.IlIlIlIlIlllllllllIl);
                final int ilIlIIIllIllIIIIIllI = g.IlIlIIIllIllIIIIIllI();
                final int llllIIIIlIIIlIlllIll = g.llllIIIIlIIIlIlllIll();
                final int ilIlIlIlIlllllllllIl = g.IlIlIlIlIlllllllllIl();
                if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
                    this.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl();
                }
                else {
                    lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(256);
                }
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(false);
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
                lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, g.llIllIIIIIllIlIIIIlI(), g.IlIIIlIlIIIllIlIlIIl(), 0.0, 100.0, 300.0);
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
                lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -200.0f);
                if (!lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
                    lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(16640);
                }
                int n2 = 1;
                if (lIIIIlIIIIIlllIllIII.IIIIIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI()) {
                    final Object llllIIIlIlllIlIIIIIl = lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(lIIIIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI, new Object[0]);
                    if (llllIIIlIlllIlIIIIIl != null) {
                        n2 = (lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, lIIIIlIIIIIlllIllIII.IIIIIllIIIIlIIIIllIl, g) ? 0 : 1);
                    }
                }
                if (n2 != 0) {
                    final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                    final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
                    final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll3 = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
                    if (llllIIIIlIIIlIlllIll3 != null) {
                        llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl());
                    }
                    else {
                        this.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
                        final float n3 = 32.0f;
                        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, ilIlIlIlIlllllllllIl, 0.0).llllIIIIlIIIlIlllIll(0.0, ilIlIlIlIlllllllllIl / n3).IlIlIlIlIlllllllllIl(64, 64, 64, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, 0.0).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll / n3, ilIlIlIlIlllllllllIl / n3).IlIlIlIlIlllllllllIl(64, 64, 64, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, 0.0, 0.0).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll / n3, 0.0).IlIlIlIlIlllllllllIl(64, 64, 64, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(64, 64, 64, 255).IlIlIIIllIllIIIIIllI();
                        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
                    }
                    if (n >= 0) {
                        final int n4 = 100;
                        final int n5 = 2;
                        final int n6 = llllIIIIlIIIlIlllIll / 2 - n4 / 2;
                        final int n7 = ilIlIlIlIlllllllllIl / 2 + 16;
                        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
                        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n6, n7, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n6, n7 + n5, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n6 + n4, n7 + n5, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n6 + n4, n7, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n6, n7, 0.0).IlIlIlIlIlllllllllIl(128, 255, 128, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n6, n7 + n5, 0.0).IlIlIlIlIlllllllllIl(128, 255, 128, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n6 + n, n7 + n5, 0.0).IlIlIlIlIlllllllllIl(128, 255, 128, 255).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n6 + n, n7, 0.0).IlIlIlIlIlllllllllIl(128, 255, 128, 255).IlIlIIIllIllIIIIIllI();
                        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
                        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                    }
                    lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
                    this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, (float)((llllIIIIlIIIlIlllIll - this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI)) / 2), (float)(ilIlIlIlIlllllllllIl / 2 - 4 - 16), 16777215);
                    this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, (float)((llllIIIIlIIIlIlllIll - this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll)) / 2), (float)(ilIlIlIlIlllllllllIl / 2 - 4 + 8), 16777215);
                }
                this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI();
                if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
                    this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll * ilIlIIIllIllIIIIIllI, ilIlIlIlIlllllllllIl * ilIlIIIllIllIIIIIllI);
                }
                this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                try {
                    Thread.yield();
                }
                catch (Exception ex) {}
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
}
