package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.*;

public class llIlllIlllllIIllIIII extends lIIllIIIllllIlllIllI implements lllllIIIIIlIlIIIIIIl
{
    private String IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private IIlIIIIIllIlIIIlIIll lIIIlllIIIllIIIllIII;
    
    public llIlllIlllllIIllIIII() {
        this.IlIlIIIllIllIIIIIllI = "";
        this.IllIIlllIIIIlllIIlIl = "";
        this.lIIIlllIIIllIIIllIII = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final String s) {
        this.llllIIIIlIIIlIlllIll(s);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llIllIIIIIllIlIIIIlI("Working...");
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final String illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll(0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.lIIIIlIIIIIlllIllIII = true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        if (this.lIIIIlIIIIIlllIllIII) {
            if (!this.IlIlIIIllIIllIlllllI.IIlllIIlllIIIlIlllII()) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            }
        }
        else {
            if (this.lIIIlllIIIllIIIllIII != null && this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl == null) {
                this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII);
            }
            else {
                this.IlIlIIIllIIllIlllllI();
            }
            if (this.llllIIIlIlllIlIIIIIl > 0) {
                this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 70, 16777215);
                this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, String.valueOf(this.IllIIlllIIIIlllIIlIl) + " " + this.llllIIIlIlllIlIIIIIl + "%", this.llllIIllllIlIlIIIIll / 2, 90, 16777215);
            }
            super.llllIIIIlIIIlIlllIll(n, n2, n3);
        }
    }
}
