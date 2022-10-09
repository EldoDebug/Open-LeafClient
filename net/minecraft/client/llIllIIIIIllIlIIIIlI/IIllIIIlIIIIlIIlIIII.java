package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;

class IIllIIIlIIIIlIIlIIII extends IlIIIlIlIIIllIlIlIIl
{
    private final IlIlIIIllIIllIlllllI lllIIIIlllllIlIIllIl;
    private final String IlIlIIIIIIlllIlIllIl;
    public float llllIIllllIlIlIIIIll;
    public boolean IlIllIlIlIIIlIlIlIII;
    final /* synthetic */ lIIIIIlIlIIIlIIIIlIl IIlllIIlIllIllIlIIll;
    
    public IIllIIIlIIIIlIIlIIII(final lIIIIIlIlIIIlIIIIlIl iIlllIIlIllIllIlIIll, final int n, final int n2, final int n3, final IlIlIIIllIIllIlllllI lllIIIIlllllIlIIllIl, final boolean b) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        super(n, n2, n3, b ? 310 : 150, 20, "");
        this.llllIIllllIlIlIIIIll = 1.0f;
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
        this.IlIlIIIIIIlllIlIllIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("soundCategory." + lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(), new Object[0]);
        this.llIIlIIIlIIIllIlIIIl = String.valueOf(this.IlIlIIIIIIlllIlIllIl) + ": " + iIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
        this.llllIIllllIlIlIIIIll = iIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll(final boolean b) {
        return 0;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            if (this.IlIllIlIlIIIlIlIlIII) {
                this.llllIIllllIlIlIIIIll = (n - (this.lIIIIlIIIIIlllIllIII + 4)) / (float)(this.IllIIlllIIIIlllIIlIl - 8);
                this.llllIIllllIlIlIIIIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, 0.0f, 1.0f);
                minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, this.llllIIllllIlIlIIIIll);
                minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.llIIlIIIlIIIllIlIIIl = String.valueOf(this.IlIlIIIIIIlllIlIllIl) + ": " + this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl);
            }
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII + (int)(this.llllIIllllIlIlIIIIll * (this.IllIIlllIIIIlllIIlIl - 8)), this.lIIIlllIIIllIIIllIII, 0, 66, 4, 20);
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII + (int)(this.llllIIllllIlIlIIIIll * (this.IllIIlllIIIIlllIIlIl - 8)) + 4, this.lIIIlllIIIllIIIllIII, 196, 66, 4, 20);
        }
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final Minecraft minecraft, final int n, final int n2) {
        if (super.llIllIIIIIllIlIIIIlI(minecraft, n, n2)) {
            this.llllIIllllIlIlIIIIll = (n - (this.lIIIIlIIIIIlllIllIII + 4)) / (float)(this.IllIIlllIIIIlllIIlIl - 8);
            this.llllIIllllIlIlIIIIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, 0.0f, 1.0f);
            minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, this.llllIIllllIlIlIIIIll);
            minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
            this.llIIlIIIlIIIllIlIIIl = String.valueOf(this.IlIlIIIIIIlllIlIllIl) + ": " + this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl);
            return this.IlIllIlIlIIIlIlIlIII = true;
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (this.IlIllIlIlIIIlIlIlIII) {
            if (this.lllIIIIlllllIlIIllIl != net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll) {
                this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl);
            }
            this.IIlllIIlIllIllIlIIll.IlIlIIIllIIllIlllllI.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(net.minecraft.client.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("gui.button.press"), 1.0f));
        }
        this.IlIllIlIlIIIlIlIlIII = false;
    }
}
