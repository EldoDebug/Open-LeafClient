package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIlllIIlIllIllIlIIll.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIIIIlllIlIIIIIIIllI extends lllIIIIlIlIllIIlIIIl
{
    private final IIIlIIIlIlIIlllIIlll llllIIIIlIIIlIlllIll;
    
    public IIIIIlllIlIIIIIIIllI(final IIIlIIIlIlIIlllIIlll llllIIIIlIIIlIlllIll, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(Minecraft.getMinecraft(), n, n2, n3, n4, n5);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final boolean b, final int n2, final int n3) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, b, n2, n3);
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6);
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return super.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return super.lIlIlIIIllIIllIIIllI;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return super.llIllIlIIIIllIlIIllI;
    }
    
    @Override
    protected int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void lIIIIlIIIIIlllIllIII() {
        super.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int llIllIlIIIIllIlIIllI, final int lIlIlIIIllIIllIIIllI, final float n) {
        if (this.IlIlIIIIIIlllIlIllIl) {
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
            this.IlIlIlIlIlllllllllIl();
            final int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl();
            final int n2 = llllIIIlIlllIlIIIIIl + 6;
            this.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            final int n3 = this.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl / 2 - this.m_() / 2 + 2;
            final int n4 = this.IllIIlllIIIIlllIIlIl + 4 - (int)this.IlIllIlIlIIIlIlIlIII;
            if (this.IIIlIIIlIlIIlllIIlll) {
                this.llllIIIIlIIIlIlllIll(n3, n4, llllIIIIlIIIlIlllIll);
            }
            this.llllIIIIlIIIlIlllIll(n3, n4, llIllIlIIIIllIlIIllI, lIlIlIIIllIIllIIIllI);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
            this.llIllIIIIIllIlIIIIlI(0, this.IllIIlllIIIIlllIIlIl, 255, 255);
            this.llIllIIIIIllIlIIIIlI(this.llllIIIlIlllIlIIIIIl, this.IlIlIIIllIllIIIIIllI, 255, 255);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 0, 1);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            final int ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI();
            if (ilIlIIIllIIllIlllllI > 0) {
                final int llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl) * (this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl) / this.IllIIlllIIIIlllIIlIl(), 32, this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl - 8);
                int illIIlllIIIIlllIIlIl = (int)this.IlIllIlIlIIIlIlIlIII * (this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl - llllIIIIlIIIlIlllIll2) / ilIlIIIllIIllIlllllI + this.IllIIlllIIIIlllIIlIl;
                if (illIIlllIIIIlllIIlIl < this.IllIIlllIIIIlllIIlIl) {
                    illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
                }
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, this.llllIIIlIlllIlIIIIIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, this.llllIIIlIlllIlIIIIIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, this.IllIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, this.IllIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, illIIlllIIIIlllIIlIl + llllIIIIlIIIlIlllIll2, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, illIIlllIIIIlllIIlIl + llllIIIIlIIIlIlllIll2, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, illIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, illIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, illIIlllIIIIlllIIlIl + llllIIIIlIIIlIlllIll2 - 1, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(192, 192, 192, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2 - 1, illIIlllIIIIlllIIlIl + llllIIIIlIIIlIlllIll2 - 1, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(192, 192, 192, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2 - 1, illIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(192, 192, 192, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, illIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(192, 192, 192, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            }
            this.IlIlIlIlIlllllllllIl(llIllIlIIIIllIlIIllI, lIlIlIIIllIIllIIIllI);
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
            lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
    }
}
