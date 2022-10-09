package net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class llllIIIIlIIIlIlllIll extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private Minecraft IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    private String llIIlIIIlIIIllIlIIIl;
    private net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI;
    private long lIlIlIIIllIIllIIIllI;
    private IIlllIlIIllIlIlIlIIl IlIlIIIllIIllIlllllI;
    private boolean IIIIlllIIIIIIlIIIlll;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/achievement/achievement_background.png");
    }
    
    public llllIIIIlIIIlIlllIll(final Minecraft illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIIllIlllllI = illIIlllIIIIlllIIlIl.IllIIlllllIIllIIllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI) {
        this.lIIIlllIIIllIIIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("achievement.get", new Object[0]);
        this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI().lIIIIlIIIIIlllIllIII();
        this.lIlIlIIIllIIllIIIllI = Minecraft.IIIllllllIllIIIlllIl();
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.IIIIlllIIIIIIlIIIlll = false;
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI) {
        this.lIIIlllIIIllIIIllIII = llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI().lIIIIlIIIIIlllIllIII();
        this.llIIlIIIlIIIllIlIIIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl();
        this.lIlIlIIIllIIllIIIllI = Minecraft.IIIllllllIllIIIlllIl() + 2500L;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.IIIIlllIIIIIIlIIIlll = true;
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        this.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl;
        this.lIIIIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI;
        final g g = new g(this.IllIIlllIIIIlllIIlIl);
        this.llllIIIlIlllIlIIIIIl = g.llllIIIIlIIIlIlllIll();
        this.lIIIIlIIIIIlllIllIII = g.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(256);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, 0.0, 1000.0, 3000.0);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -2000.0f);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (this.llIllIlIIIIllIlIIllI != null && this.lIlIlIIIllIIllIIIllI != 0L && Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII != null) {
            double n = (Minecraft.IIIllllllIllIIIlllIl() - this.lIlIlIIIllIIllIIIllI) / 3000.0;
            if (!this.IIIIlllIIIIIIlIIIlll) {
                if (n < 0.0 || n > 1.0) {
                    this.lIlIlIIIllIIllIIIllI = 0L;
                    return;
                }
            }
            else if (n > 0.5) {
                n = 0.5;
            }
            this.llIllIIIIIllIlIIIIlI();
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            double n2 = n * 2.0;
            if (n2 > 1.0) {
                n2 = 2.0 - n2;
            }
            double n3 = 1.0 - n2 * 4.0;
            if (n3 < 0.0) {
                n3 = 0.0;
            }
            final double n4 = n3 * n3;
            final double n5 = n4 * n4;
            final int n6 = this.llllIIIlIlllIlIIIIIl - 160;
            final int n7 = 0 - (int)(n5 * 36.0);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            this.IlIlIlIlIlllllllllIl(n6, n7, 96, 202, 160, 32);
            if (this.IIIIlllIIIIIIlIIIlll) {
                this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, n6 + 30, n7 + 7, 120, -1);
            }
            else {
                this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, n6 + 30, n7 + 7, -256);
                this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, n6 + 30, n7 + 18, -1);
            }
            lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI();
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(this.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl, n6 + 8, n7 + 8);
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = 0L;
    }
}
