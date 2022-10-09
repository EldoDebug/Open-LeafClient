package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;

public class lllllIlIIIlIlIIlllII extends lIIllIIIllllIlllIllI
{
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    @Override
    public void n_() {
        this.IlIlIIIllIllIIIIIllI = 0;
        this.IIlllIIlIllIllIlIIll.clear();
        final int n = -16;
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 120 + n, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("menu.returnToMenu", new Object[0])));
        if (!this.IlIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII()) {
            this.IIlllIIlIllIllIlIIll.get(0).llIIlIIIlIIIllIlIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("menu.disconnect", new Object[0]);
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(4, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 24 + n, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("menu.returnToGame", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 96 + n, 98, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("menu.options", new Object[0])));
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl;
        this.IIlllIIlIllIllIlIIll.add(ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(7, this.llllIIllllIlIlIIIIll / 2 + 2, this.IlIllIlIlIIIlIlIlIII / 4 + 96 + n, 98, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("menu.shareToLan", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(5, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 48 + n, 98, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.achievements", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(6, this.llllIIllllIlIlIIIIll / 2 + 2, this.IlIllIlIlIIIlIlIlIII / 4 + 48 + n, 98, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.stats", new Object[0])));
        ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI = (this.IlIlIIIllIIllIlllllI.llIIlllIIlllIIllIllI() && !this.IlIlIIIllIIllIlllllI.IIlllIIIlIlllIIlllII().IlIllllIIlIllIlIlIll());
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        switch (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI) {
            case 0: {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IllIlIIllIllIIlIllII(this, this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll));
                break;
            }
            case 1: {
                final boolean lIllllllIIllIlIlIlII = this.IlIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII();
                final boolean iIlllIIlllIIIlIlllII = this.IlIlIIIllIIllIlllllI.IIlllIIlllIIIlIlllII();
                ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI = false;
                this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl)null);
                if (lIllllllIIllIlIlIlII) {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lllIllIIIllllllIllll());
                    break;
                }
                if (iIlllIIlllIIIlIlllII) {
                    new net.minecraft.IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new lllIllIIIllllllIllll());
                    break;
                }
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIllllIIlIIlIlIlIll());
                break;
            }
            case 4: {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
                this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
                break;
            }
            case 5: {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll()));
                break;
            }
            case 6: {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll()));
                break;
            }
            case 7: {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new llIlIIIIllIlIIlIlIII(this));
                break;
            }
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        ++this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("menu.game", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 40, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
