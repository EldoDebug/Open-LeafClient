package net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class llIllIIIIIllIlIIIIlI extends lIIllIIIllllIlllIllI implements d
{
    protected lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    protected String IllIIlllIIIIlllIIlIl;
    private llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl;
    private lIIIIlIIIIIlllIllIII lIIIIlIIIIIlllIllIII;
    private IlIlIIIllIllIIIIIllI lIIIlllIIIllIIIllIII;
    private llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl;
    private IlIlIIIllIIllIlllllI llIllIlIIIIllIlIIllI;
    private lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI;
    private boolean IIIlIIIlIlIIlllIIlll;
    
    public llIllIIIIIllIlIIIIlI(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI, final IlIlIIIllIIllIlllllI llIllIlIIIIllIlIIllI) {
        this.IllIIlllIIIIlllIIlIl = "Select world";
        this.IIIlIIIlIlIIlllIIlll = true;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    @Override
    public void n_() {
        this.IllIIlllIIIIlllIIlIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.stats", new Object[0]);
        this.IIIlIIIlIlIIlllIIlll = true;
        this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new IlIlIllllllllIIIIlII(IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl));
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        if (this.lIlIlIIIllIIllIIIllI != null) {
            this.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII();
        }
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        (this.llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl(this, this.IlIlIIIllIIllIlllllI)).IlIIIlIlIIIllIlIlIIl(1, 1);
        (this.lIIIIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII(this, this.IlIlIIIllIIllIlllllI)).IlIIIlIlIIIllIlIlIIl(1, 1);
        (this.lIIIlllIIIllIIIllIII = new IlIlIIIllIllIIIIIllI(this, this.IlIlIIIllIIllIlllllI)).IlIIIlIlIIIllIlIlIIl(1, 1);
        (this.llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl(this, this.IlIlIIIllIIllIlllllI)).IlIIIlIlIIIllIlIlIIl(1, 1);
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 + 4, this.IlIllIlIlIIIlIlIlIII - 28, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 160, this.IlIllIlIlIIIlIlIlIII - 52, 80, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stat.generalButton", new Object[0])));
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl;
        this.IIlllIIlIllIllIlIIll.add(ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 - 80, this.IlIllIlIlIIIlIlIlIII - 52, 80, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stat.blocksButton", new Object[0])));
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2;
        this.IIlllIIlIllIllIlIIll.add(ilIIIlIlIIIllIlIlIIl2 = new IlIIIlIlIIIllIlIlIIl(3, this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII - 52, 80, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stat.itemsButton", new Object[0])));
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl3;
        this.IIlllIIlIllIllIlIIll.add(ilIIIlIlIIIllIlIlIIl3 = new IlIIIlIlIIIllIlIlIIl(4, this.llllIIllllIlIlIIIIll / 2 + 80, this.IlIllIlIlIIIlIlIlIII - 52, 80, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stat.mobsButton", new Object[0])));
        if (this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() == 0) {
            ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI = false;
        }
        if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == 0) {
            ilIIIlIlIIIllIlIlIIl2.lIlIlIIIllIIllIIIllI = false;
        }
        if (this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll() == 0) {
            ilIIIlIlIIIllIlIlIIl3.lIlIlIIIllIIllIIIllI = false;
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.lIlIlIIIllIIllIIIllI = this.llllIIIlIlllIlIIIIIl;
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 3) {
                this.lIlIlIIIllIIllIIIllI = this.lIIIIlIIIIIlllIllIII;
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2) {
                this.lIlIlIIIllIIllIIIllI = this.lIIIlllIIIllIIIllIII;
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 4) {
                this.lIlIlIIIllIIllIIIllI = this.llIIlIIIlIIIllIlIIIl;
            }
            else {
                this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        if (this.IIIlIIIlIlIIlllIIlll) {
            this.IlIlIIIllIIllIlllllI();
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("multiplayer.downloadingStats", new Object[0]), this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 2, 16777215);
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, llIllIIIIIllIlIIIIlI.a_[(int)(Minecraft.IIIllllllIllIIIlllIl() / 150L % llIllIIIIIllIlIIIIlI.a_.length)], this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 2 + this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll * 2, 16777215);
        }
        else {
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IllIIlllIIIIlllIIlIl, this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
            super.llllIIIIlIIIlIlllIll(n, n2, n3);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        if (this.IIIlIIIlIlIIlllIIlll) {
            this.IlIlIIIllIllIIIIIllI();
            this.llllIIIlIlllIlIIIIIl();
            this.lIlIlIIIllIIllIIIllI = this.llllIIIlIlllIlIIIIIl;
            this.IIIlIIIlIlIIlllIIlll = false;
        }
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return !this.IIIlIIIlIlIIlllIIlll;
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll(n + 1, n2 + 1);
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI();
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(new net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, 0), n + 2, n2 + 2);
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.llIllIIIIIllIlIIIIlI(n, n2, 0, 0);
    }
    
    private void llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3, final int n4) {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0, n2 + 18, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 0) * 0.0078125f, (n4 + 18) * 0.0078125f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 18, n2 + 18, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 18) * 0.0078125f, (n4 + 18) * 0.0078125f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 18, n2 + 0, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 18) * 0.0078125f, (n4 + 0) * 0.0078125f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0, n2 + 0, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 0) * 0.0078125f, (n4 + 0) * 0.0078125f).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
}
