package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

class lllllIIIIIlIIlllIlIl extends lllIIIIlIlIllIIlIIIl
{
    public int llllIIIIlIIIlIlllIll;
    final /* synthetic */ IlIIIIIlIIllIIlIlIll IlIlIlIlIlllllllllIl;
    
    public lllllIIIIIlIIlllIlIl(final IlIIIIIlIIllIIlIlIll ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(ilIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI, ilIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll, ilIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII, 80, ilIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII - 32, 38);
        this.llllIIIIlIIIlIlllIll = -1;
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.size();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int llllIIIIlIIIlIlllIll, final boolean b, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
        this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.get(this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI.toString());
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return n == this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final int n3 = n + 5;
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n3 - 1, n3 + 32, n2 - 1, -2039584);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n3 - 1, n3 + 32, n2 + 32, -6250336);
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n3 - 1, n2 - 1, n2 + 32, -2039584);
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n3 + 32, n2 - 1, n2 + 32, -6250336);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 + 0, n2 + 32, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 + 32, n2 + 32, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 + 32, n2 + 0, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 + 0, n2 + 0, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final IllllIIlIlIllIIIllII illllIIlIlIllIIIllII = IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.get(n);
        this.llllIIIIlIIIlIlllIll(n2, n3, illllIIlIlIllIIIllII.IlIlIlIlIlllllllllIl);
        this.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(illllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll, n2 + 32 + 10, n3 + 14, 16777215);
    }
}
