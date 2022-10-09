package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIllllIlIlIIIIll extends IlIlIIIllIIllIlllllI
{
    private double IlllllllIIIlIIIlIlII;
    private double IIlIIIIlllIlllllIlII;
    
    public llllIIllllIlIlIIIIll(final String s) {
        super(s);
    }
    
    @Override
    public void llIIlIIIlIIIllIlIIIl() {
        if (!this.llllIIIIlIIIlIlllIll.isEmpty()) {
            final Minecraft minecraft = Minecraft.getMinecraft();
            double random = 0.0;
            if (minecraft.IllIIlllIIIIlllIIlIl != null && minecraft.lIIIIlIIIIIlllIllIII != null) {
                random = minecraft.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(1.0f);
                if (!minecraft.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl()) {
                    random = Math.random();
                }
            }
            double n;
            for (n = random - this.IlllllllIIIlIIIlIlII; n < -0.5; ++n) {}
            while (n >= 0.5) {
                --n;
            }
            this.IIlIIIIlllIlllllIlII += llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n, -1.0, 1.0) * 0.1;
            this.IIlIIIIlllIlllllIlII *= 0.8;
            this.IlllllllIIIlIIIlIlII += this.IIlIIIIlllIlllllIlII;
            int i;
            for (i = (int)((this.IlllllllIIIlIIIlIlII + 1.0) * this.llllIIIIlIIIlIlllIll.size()) % this.llllIIIIlIIIlIlllIll.size(); i < 0; i = (i + this.llllIIIIlIIIlIlllIll.size()) % this.llllIIIIlIIIlIlllIll.size()) {}
            if (i != this.lIIIIlIIIIIlllIllIII) {
                this.lIIIIlIIIIIlllIllIII = i;
                net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.get(this.lIIIIlIIIIIlllIllIII), this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, false, false);
            }
        }
    }
}
