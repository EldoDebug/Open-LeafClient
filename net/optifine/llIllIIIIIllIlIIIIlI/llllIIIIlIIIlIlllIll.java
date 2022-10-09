package net.optifine.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.optifine.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class llllIIIIlIIIlIlllIll extends lIIllIIIllllIlllIllI
{
    private lIIllIIIllllIlllIllI IllIIlllIIIIlllIIlIl;
    protected String IlIlIIIllIllIIIIIllI;
    private net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private static net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] lIIIIlIIIIIlllIllIII;
    
    static {
        llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = new net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIIIlIlllIllIIlIllI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIIllIIllIIllIIlIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lllllIIIIIlIlIIIIIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlllIIlllIIIlIlllII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIllllIIIlIllIlIIll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIIIlIlIIIlIIIIlIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIllIIIlIIIIlIIlIIII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIllIIllIIIIIIlIIlI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lllllIlIlIlllIlllIlI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIlIIIIllIlIIlIlIII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIlIIIIIIIlIIlIlIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlllIIIllIllIIlIlIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll };
    }
    
    public llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI illIIlllIIIIlllIIlIl, final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void n_() {
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.animationsTitle", new Object[0]);
        this.IIlllIIlIllIllIlIIll.clear();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.length; ++i) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII[i];
            final int n = this.llllIIllllIlIlIIIIll / 2 - 155 + i % 2 * 160;
            final int n2 = this.IlIllIlIlIIIlIlIlIII / 6 + 21 * (i / 2) - 12;
            if (!llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                this.IIlllIIlIllIllIlIIll.add(new IllIIlllIIIIlllIIlIl(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), n, n2, llIllIIIIIllIlIIIIlI, this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)));
            }
            else {
                this.IIlllIIlIllIllIlIIll.add(new llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), n, n2, llIllIIIIIllIlIIIIlI));
            }
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(210, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 6 + 168 + 11, 70, 20, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.animation.allOn")));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(211, this.llllIIllllIlIlIIIIll / 2 - 155 + 80, this.IlIllIlIlIIIlIlIlIII / 6 + 168 + 11, 70, 20, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.animation.allOff")));
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(200, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII / 6 + 168 + 11, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI < 200 && ilIIIlIlIIIllIlIlIIl instanceof llIlIIIIIlIIlIlIIlll) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(((llIlIIIIIlIIlIlIIlll)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(), 1);
                ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 210) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(true);
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 211) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(false);
            }
            final g g = new g(this.IlIlIIIllIIllIlllllI);
            this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
