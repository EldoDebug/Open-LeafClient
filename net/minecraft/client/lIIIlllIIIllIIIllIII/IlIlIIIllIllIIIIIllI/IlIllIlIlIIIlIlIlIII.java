package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIllIlIlIIIlIlIlIII extends IlIlIIIllIIllIlllllI
{
    public double IlllllllIIIlIIIlIlII;
    public double IIlIIIIlllIlllllIlII;
    public static String IIIlIIlIIIIlllIlllII;
    
    public IlIllIlIlIIIlIlIlIII(final String iiIlIIlIIIIlllIlllII) {
        super(iiIlIIlIIIIlllIlllII);
        IlIllIlIlIIIlIlIlIII.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
    }
    
    @Override
    public void llIIlIIIlIIIllIlIIIl() {
        final Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.IllIIlllIIIIlllIIlIl != null && minecraft.lIIIIlIIIIIlllIllIII != null) {
            this.llllIIIIlIIIlIlllIll(minecraft.IllIIlllIIIIlllIIlIl, minecraft.lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl, minecraft.lIIIIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII, minecraft.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll, false, false);
        }
        else {
            this.llllIIIIlIIIlIlllIll(null, 0.0, 0.0, 0.0, true, false);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, double n3, final boolean b, final boolean b2) {
        if (!this.llllIIIIlIIIlIlllIll.isEmpty()) {
            double illlllllIIIlIIIlIlII2 = 0.0;
            if (illlllllIIIlIIIlIlII != null && !b) {
                final IlIlIlIlIlllllllllIl iIlllIlIIllIlIlIlIIl = illlllllIIIlIIIlIlII.IIlllIlIIllIlIlIlIIl();
                final double n4 = iIlllIlIIllIlIlIlIIl.lIIIIlIIIIIlllIllIII() - n;
                final double n5 = iIlllIlIIllIlIlIlIIl.llIIlIIIlIIIllIlIIIl() - n2;
                n3 %= 360.0;
                illlllllIIIlIIIlIlII2 = -((n3 - 90.0) * 3.141592653589793 / 180.0 - Math.atan2(n5, n4));
                if (!illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl()) {
                    illlllllIIIlIIIlIlII2 = Math.random() * 3.141592653589793 * 2.0;
                }
            }
            if (b2) {
                this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII2;
            }
            else {
                double n6;
                for (n6 = illlllllIIIlIIIlIlII2 - this.IlllllllIIIlIIIlIlII; n6 < -3.141592653589793; n6 += 6.283185307179586) {}
                while (n6 >= 3.141592653589793) {
                    n6 -= 6.283185307179586;
                }
                this.IIlIIIIlllIlllllIlII += llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n6, -1.0, 1.0) * 0.1;
                this.IIlIIIIlllIlllllIlII *= 0.8;
                this.IlllllllIIIlIIIlIlII += this.IIlIIIIlllIlllllIlII;
            }
            int i;
            for (i = (int)((this.IlllllllIIIlIIIlIlII / 6.283185307179586 + 1.0) * this.llllIIIIlIIIlIlllIll.size()) % this.llllIIIIlIIIlIlllIll.size(); i < 0; i = (i + this.llllIIIIlIIIlIlllIll.size()) % this.llllIIIIlIIIlIlllIll.size()) {}
            if (i != this.lIIIIlIIIIIlllIllIII) {
                this.lIIIIlIIIIIlllIllIII = i;
                net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.get(this.lIIIIlIIIIIlllIllIII), this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, false, false);
            }
        }
    }
}
