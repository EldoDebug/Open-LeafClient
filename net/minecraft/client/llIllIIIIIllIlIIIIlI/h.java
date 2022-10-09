package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class h extends lIIllIIIllllIlllIllI
{
    private static final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] IlIlIIIllIllIIIIIllI;
    private final lIIllIIIllllIlllIllI IllIIlllIIIIlllIIlIl;
    private final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = new net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl };
    }
    
    public h(final lIIllIIIllllIlllIllI illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void n_() {
        int n = 0;
        this.lIIIIlIIIIIlllIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.chat.title", new Object[0]);
        net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] ilIlIIIllIllIIIIIllI;
        for (int length = (ilIlIIIllIllIIIIIllI = h.IlIlIIIllIllIIIIIllI).length, i = 0; i < length; ++i) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI[i];
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                this.IIlllIIlIllIllIlIIll.add(new IlIIlIlIIIlIIlIlIlII(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI));
            }
            else {
                this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI, this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)));
            }
            ++n;
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 120, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI < 100 && ilIIIlIlIIIllIlIlIIl instanceof llIlIIIIIlIIlIlIIlll) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(((llIlIIIIIlIIlIlIIlll)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(), 1);
                ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.lIIIIlIIIIIlllIllIII, this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
