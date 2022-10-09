package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.*;

public class llIllIlIIIIllIlIIllI extends lIIllIIIllllIlllIllI
{
    private static final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] lIIIIlIIIIIlllIllIII;
    private lIIllIIIllllIlllIllI lIIIlllIIIllIIIllIII;
    protected String IlIlIIIllIllIIIIIllI;
    private llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl;
    public IlIIIlIlIIIllIlIlIIl IllIIlllIIIIlllIIlIl;
    public long llllIIIlIlllIlIIIIIl;
    private lIllllllIIllIlIlIlII llIllIlIIIIllIlIIllI;
    private net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl lIlIlIIIllIIllIIIllI;
    
    static {
        lIIIIlIIIIIlllIllIII = new net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIlIIlIIIIlllIlllII };
    }
    
    public llIllIlIIIIllIlIIllI(final lIIllIIIllllIlllIllI liiIlllIIIllIIIllIII, final llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl) {
        this.IlIlIIIllIllIIIIIllI = "Controls";
        this.IllIIlllIIIIlllIIlIl = null;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public void n_() {
        this.llIllIlIIIIllIlIIllI = new lIllllllIIllIlIlIlII(this, this.IlIlIIIllIIllIlllllI);
        this.IIlllIIlIllIllIlIIll.add(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII - 29, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.lIlIlIIIllIIllIIIllI = new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(201, this.llllIIllllIlIlIIIIll / 2 - 155 + 160, this.IlIllIlIlIIIlIlIlIII - 29, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("controls.resetAll", new Object[0])));
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("controls.title", new Object[0]);
        int n = 0;
        net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] liiiIlIIIIIlllIllIII;
        for (int length = (liiiIlIIIIIlllIllIII = net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII).length, i = 0; i < length; ++i) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = liiiIlIIIIIlllIllIII[i];
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                this.IIlllIIlIllIllIlIIll.add(new IlIIlIlIIIlIIlIlIlII(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI));
            }
            else {
                this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI, this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)));
            }
            ++n;
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 201) {
            IlIIIlIlIIIllIlIlIIl[] lllllIIIIIlIIlllIlIl;
            for (int length = (lllllIIIIIlIIlllIlIl = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lllllIIIIIlIIlllIlIl).length, i = 0; i < length; ++i) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = lllllIIIIIlIIlllIlIl[i];
                ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl2.lIIIIlIIIIIlllIllIII());
            }
            net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI < 100 && ilIIIlIlIIIllIlIlIIl instanceof llIlIIIIIlIIlIlIIlll) {
            this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(((llIlIIIIIlIIlIlIIlll)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(), 1);
            ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI));
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, -100 + n3);
            this.IllIIlllIIIIlllIIlIl = null;
            net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
        }
        else if (n3 != 0 || !this.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(n, n2, n3)) {
            super.llllIIIIlIIIlIlllIll(n, n2, n3);
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        if (n3 != 0 || !this.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI(n, n2, n3)) {
            super.IlIlIlIlIlllllllllIl(n, n2, n3);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            if (n == 1) {
                this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, 0);
            }
            else if (n != 0) {
                this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, n);
            }
            else if (c > '\0') {
                this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, c + '\u0100');
            }
            this.IllIIlllIIIIlllIIlIl = null;
            this.llllIIIlIlllIlIIIIIl = Minecraft.IIIllllllIllIIIlllIl();
            net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
        }
        else {
            super.llllIIIIlIIIlIlllIll(c, n);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 8, 16777215);
        boolean b = true;
        IlIIIlIlIIIllIlIlIIl[] lllllIIIIIlIIlllIlIl;
        for (int length = (lllllIIIIIlIIlllIlIl = this.llIIlIIIlIIIllIlIIIl.lllllIIIIIlIIlllIlIl).length, i = 0; i < length; ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = lllllIIIIIlIIlllIlIl[i];
            if (ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() != ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII()) {
                b = false;
                break;
            }
        }
        this.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI = !b;
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
