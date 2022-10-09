package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.*;

public class lIIlllIlllllIIlllIll extends llIllIIIIIllIlIIIIlI implements net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    public static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private final Minecraft llllIIIlIlllIlIIIIIl;
    private long lIIIIlIIIIIlllIllIII;
    private IllIIlllIIIIlllIIlIl lIIIlllIIIllIIIllIII;
    
    static {
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/gui/widgets.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/spectator_widgets.png");
    }
    
    public lIIlllIlllllIIlllIll(final Minecraft llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.lIIIIlIIIIIlllIllIII = Minecraft.IIIllllllIllIIIlllIl();
        if (this.lIIIlllIIIllIIIllIII != null) {
            this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(n);
        }
        else {
            this.lIIIlllIIIllIIIllIII = new IllIIlllIIIIlllIIlIl(this);
        }
    }
    
    private float llIllIIIIIllIlIIIIlI() {
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.lIIIIlIIIIIlllIllIII - Minecraft.IIIllllllIllIIIlllIl() + 5000L) / 2000.0f, 0.0f, 1.0f);
    }
    
    public void llllIIIIlIIIlIlllIll(final g g, final float n) {
        if (this.lIIIlllIIIllIIIllIII != null) {
            final float llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI <= 0.0f) {
                this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl();
            }
            else {
                final int n2 = g.llllIIIIlIIIlIlllIll() / 2;
                final float ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
                this.IlIIIlIlIIIllIlIlIIl = -90.0f;
                this.llllIIIIlIIIlIlllIll(g, llIllIIIIIllIlIIIIlI, n2, g.IlIlIlIlIlllllllllIl() - 22.0f * llIllIIIIIllIlIIIIlI, this.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl());
                this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final g g, final float n, final int n2, final float n3, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, n);
        this.llllIIIlIlllIlIIIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IllIIlllIIIIlllIIlIl);
        this.llllIIIIlIIIlIlllIll((float)(n2 - 91), n3, 0, 0, 182, 22);
        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() >= 0) {
            this.llllIIIIlIIIlIlllIll((float)(n2 - 91 - 1 + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() * 20), n3 - 1.0f, 0, 22, 24, 22);
        }
        lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI();
        for (int i = 0; i < 9; ++i) {
            this.llllIIIIlIIIlIlllIll(i, g.llllIIIIlIIIlIlllIll() / 2 - 90 + i * 20 + 2, n3 + 3.0f, n, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(i));
        }
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3, final float n4, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIlIlllIlIIIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IlIlIIIllIllIIIIIllI);
        if (ilIlIlIlIlllllllllIl != net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
            final int n5 = (int)(n4 * 255.0f);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n2, n3, 0.0f);
            final float n6 = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl() ? 1.0f : 0.25f;
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n6, n6, n6, n4);
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6, n5);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            final String value = String.valueOf(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.IIIlIIIlIlIIlllIIlll.IllllIIlIlIllIIIllII[n].lIIIlllIIIllIIIllIII()));
            if (n5 > 3 && ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) {
                this.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(value, (float)(n2 + 19 - 2 - this.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(value)), n3 + 6.0f + 3.0f, 16777215 + (n5 << 24));
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final g g) {
        final int n = (int)(this.llIllIIIIIllIlIIIIlI() * 255.0f);
        if (n > 3 && this.lIIIlllIIIllIIIllIII != null) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl();
            final String s = (ilIlIlIlIlllllllllIl != net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) ? ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().lIIIlllIIIllIIIllIII() : this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl().lIIIlllIIIllIIIllIII();
            if (s != null) {
                final int n2 = (g.llllIIIIlIIIlIlllIll() - this.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s)) / 2;
                final int n3 = g.IlIlIlIlIlllllllllIl() - 35;
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
                this.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, (float)n2, (float)n3, 16777215 + (n << 24));
                lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.lIIIlllIIIllIIIllIII = null;
        this.lIIIIlIIIIIlllIllIII = 0L;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII != null;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        int n2;
        for (n2 = this.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI() + n; n2 >= 0 && n2 <= 8 && (this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n2) == net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll || !this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n2).IlIIIlIlIIIllIlIlIIl()); n2 += n) {}
        if (n2 >= 0 && n2 <= 8) {
            this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(n2);
            this.lIIIIlIIIIIlllIllIII = Minecraft.IIIllllllIllIIIlllIl();
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.lIIIIlIIIIIlllIllIII = Minecraft.IIIllllllIllIIIlllIl();
        if (this.llllIIIIlIIIlIlllIll()) {
            final int ilIlIIIllIllIIIIIllI = this.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI != -1) {
                this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI);
            }
        }
        else {
            this.lIIIlllIIIllIIIllIII = new IllIIlllIIIIlllIIlIl(this);
        }
    }
}
