package net.optifine.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class lIIIIlIIIIIlllIllIII extends lIIllIIIllllIlllIllI implements c
{
    private lIIllIIIllllIlllIllI IllIIlllIIIIlllIIlIl;
    protected String IlIlIIIllIllIIIIIllI;
    private llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private static net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] lIIIIlIIIIIlllIllIII;
    private IIIIlllIIIIIIlIIIlll lIIIlllIIIllIIIllIII;
    
    static {
        net.optifine.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII = new net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIllIIIIIlllIIlIIllI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIlllIlllllIIllIIII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIlIIlllIIlIIlIlllIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.l, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIIIIIlIIllIIlIlIll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lllIlIIIIIlIlllllIlI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIIIllIlIllIllIIIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.m, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.p };
    }
    
    public lIIIIlIIIIIlllIllIII(final lIIllIIIllllIlllIllI illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl) {
        this.lIIIlllIIIllIIIllIII = new IIIIlllIIIIIIlIIIlll(this, new IIlllIIlIllIllIlIIll());
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void n_() {
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.otherTitle", new Object[0]);
        this.IIlllIIlIllIllIlIIll.clear();
        for (int i = 0; i < net.optifine.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.length; ++i) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = net.optifine.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII[i];
            final int n = this.llllIIllllIlIlIIIIll / 2 - 155 + i % 2 * 160;
            final int n2 = this.IlIllIlIlIIIlIlIlIII / 6 + 21 * (i / 2) - 12;
            if (!llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                this.IIlllIIlIllIllIlIIll.add(new IllIIlllIIIIlllIIlIl(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), n, n2, llIllIIIIIllIlIIIIlI, this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)));
            }
            else {
                this.IIlllIIlIllIllIlIIll.add(new llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), n, n2, llIllIIIIIllIlIIIIlI));
            }
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(210, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 168 + 11 - 44, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.other.reset", new Object[0])));
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
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 210) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new b(this, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.other.reset", new Object[0]), "", 9999));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        if (b) {
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII();
        }
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n, n2, this.IIlllIIlIllIllIlIIll);
    }
}
