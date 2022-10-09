package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;

public class IlIIIlIlIIIllIlIlIIl extends llIllIIIIIllIlIIIIlI
{
    protected static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    protected int IllIIlllIIIIlllIIlIl;
    protected int llllIIIlIlllIlIIIIIl;
    public int lIIIIlIIIIIlllIllIII;
    public int lIIIlllIIIllIIIllIII;
    public String llIIlIIIlIIIllIlIIIl;
    public int llIllIlIIIIllIlIIllI;
    public boolean lIlIlIIIllIIllIIIllI;
    public boolean IlIlIIIllIIllIlllllI;
    protected boolean IIIIlllIIIIIIlIIIlll;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/widgets.png");
    }
    
    public IlIIIlIlIIIllIlIlIIl(final int n, final int n2, final int n3, final String s) {
        this(n, n2, n3, 200, 20, s);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final int llIllIlIIIIllIlIIllI, final int liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII, final int illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl, final String llIIlIIIlIIIllIlIIIl) {
        this.IllIIlllIIIIlllIIlIl = 200;
        this.llllIIIlIlllIlIIIIIl = 20;
        this.lIlIlIIIllIIllIIIllI = true;
        this.IlIlIIIllIIllIlllllI = true;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    protected int llllIIIIlIIIlIlllIll(final boolean b) {
        int n = 1;
        if (!this.lIlIlIIIllIIllIIIllI) {
            n = 0;
        }
        else if (b) {
            n = 2;
        }
        return n;
    }
    
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            final FontRenderer lIlIlIIIllIIllIIIllI = minecraft.lIlIlIIIllIIllIIIllI;
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.IIIIlllIIIIIIlIIIlll = (n >= this.lIIIIlIIIIIlllIllIII && n2 >= this.lIIIlllIIIllIIIllIII && n < this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl && n2 < this.lIIIlllIIIllIIIllIII + this.llllIIIlIlllIlIIIIIl);
            final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, 0, 46 + llllIIIIlIIIlIlllIll * 20, this.IllIIlllIIIIlllIIlIl / 2, this.llllIIIlIlllIlIIIIIl);
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl / 2, this.lIIIlllIIIllIIIllIII, 200 - this.IllIIlllIIIIlllIIlIl / 2, 46 + llllIIIIlIIIlIlllIll * 20, this.IllIIlllIIIIlllIIlIl / 2, this.llllIIIlIlllIlIIIIIl);
            this.IlIlIlIlIlllllllllIl(minecraft, n, n2);
            int n3 = 14737632;
            if (!this.lIlIlIIIllIIllIIIllI) {
                n3 = 10526880;
            }
            else if (this.IIIIlllIIIIIIlIIIlll) {
                n3 = 16777120;
            }
            this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, this.llIIlIIIlIIIllIlIIIl, this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl / 2, this.lIIIlllIIIllIIIllIII + (this.llllIIIlIlllIlIIIIIl - 8) / 2, n3);
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final Minecraft minecraft, final int n, final int n2) {
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final Minecraft minecraft, final int n, final int n2) {
        return this.lIlIlIIIllIIllIIIllI && this.IlIlIIIllIIllIlllllI && n >= this.lIIIIlIIIIIlllIllIII && n2 >= this.lIIIlllIIIllIIIllIII && n < this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl && n2 < this.lIIIlllIIIllIIIllIII + this.llllIIIlIlllIlIIIIIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2) {
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.client.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("gui.button.press"), 1.0f));
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
