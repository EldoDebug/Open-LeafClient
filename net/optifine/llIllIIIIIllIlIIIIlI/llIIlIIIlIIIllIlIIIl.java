package net.optifine.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class llIIlIIIlIIIllIlIIIl extends lIIllIIIllllIlllIllI
{
    private lIIllIIIllllIlllIllI IllIIlllIIIIlllIIlIl;
    protected String IlIlIIIllIllIIIIIllI;
    private llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private static net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] lIIIIlIIIIIlllIllIII;
    private IIIIlllIIIIIIlIIIlll lIIIlllIIIllIIIllIII;
    
    static {
        llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII = new net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIllIIlIlIlllllIIIII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIlllIlllllIIlllIll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IllllIIlIlIllIIIllII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllllIIIIIIIlllIIll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIllIIIlIlIIllIIIlI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIllllIIlIllIlIlIll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIllllIllIllIIllllll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIllIlIIIllllllIIlII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.d, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIllIIllIIlIIIIlIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.k, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.n, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI };
    }
    
    public llIIlIIIlIIIllIlIIIl(final lIIllIIIllllIlllIllI illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl) {
        this.lIIIlllIIIllIIIllIII = new IIIIlllIIIIIIlIIIlll(this, new IIlllIIlIllIllIlIIll());
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void n_() {
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.qualityTitle", new Object[0]);
        this.IIlllIIlIllIllIlIIll.clear();
        for (int i = 0; i < llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.length; ++i) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII[i];
            final int n = this.llllIIllllIlIlIIIIll / 2 - 155 + i % 2 * 160;
            final int n2 = this.IlIllIlIlIIIlIlIlIII / 6 + 21 * (i / 2) - 12;
            if (!llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                this.IIlllIIlIllIllIlIIll.add(new IllIIlllIIIIlllIIlIl(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), n, n2, llIllIIIIIllIlIIIIlI, this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)));
            }
            else {
                this.IIlllIIlIllIllIlIIll.add(new llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), n, n2, llIllIIIIIllIlIIIIlI));
            }
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 168 + 11, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
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
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI != net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIlllIlllllIIlllIll.ordinal()) {
                final g g = new g(this.IlIlIIIllIIllIlllllI);
                this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl());
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n, n2, this.IIlllIIlIllIllIlIIll);
    }
}
