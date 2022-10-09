package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import leaf.*;

public class lllIlIIIIIlIlllllIlI extends lIIllIIIllllIlllIllI
{
    private lIIlIIIIIIIlIIlIlIIl IlIlIIIllIllIIIIIllI;
    private lIIlIIIIIIIlIIlIlIIl IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    
    public lllIlIIIIIlIlllllIlI() {
        this.llllIIIlIlllIlIIIIIl = "Email";
        this.lIIIIlIIIIIlllIllIII = "Password";
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void n_() {
        (this.IlIlIIIllIllIIIIIllI = new lIIlIIIIIIIlIIlIlIIl(0, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 100, 60, 200, 20)).llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        (this.IllIIlllIIIIlllIIlIl = new lIIlIIIIIIIlIIlIlIIl(0, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 100, 100, 200, 20)).llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 168, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI && ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
            Leaf.instance.loginAccount(this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl());
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (this.IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI()) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(c, n);
            this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
        }
        else if (this.IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI()) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(c, n);
            this.lIIIIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
        }
        super.llllIIIIlIIIlIlllIll(c, n);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().equals("Email")) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll("");
        }
        if (this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().equals("Password")) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("");
        }
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, "Change Microsoft Account", this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "Mojang accounts are not supported.", this.llllIIllllIlIlIIIIll / 2 - 93, 150, -6250336);
        this.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl();
        this.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl();
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
