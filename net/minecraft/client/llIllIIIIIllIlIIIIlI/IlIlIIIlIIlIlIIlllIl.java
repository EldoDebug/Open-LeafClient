package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class IlIlIIIlIIlIlIIlllIl extends lIIllIIIllllIlllIllI
{
    private String IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    
    public IlIlIIIlIIlIlIIlllIl(final String ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void n_() {
        super.n_();
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, 140, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.llllIIIIlIIIlIlllIll(0, 0, this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, -12574688, -11530224);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 90, 16777215);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IllIIlllIIIIlllIIlIl, this.llllIIllllIlIlIIIIll / 2, 110, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
    }
}
