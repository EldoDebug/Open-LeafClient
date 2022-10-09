package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llllllIIIIIIIlllIIll extends llllIIIlIlllIlIIIIIl
{
    @Override
    public void n_() {
        super.n_();
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII - 40, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("multiplayer.stopSleeping", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (n == 1) {
            this.llllIIIlIlllIlIIIIIl();
        }
        else if (n != 28 && n != 156) {
            super.llllIIIIlIIIlIlllIll(c, n);
        }
        else {
            final String trim = this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().trim();
            if (!trim.isEmpty()) {
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(trim);
            }
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll("");
            this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
            this.llllIIIlIlllIlIIIIIl();
        }
        else {
            super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    private void llllIIIlIlllIlIIIIIl() {
        this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI));
    }
}
