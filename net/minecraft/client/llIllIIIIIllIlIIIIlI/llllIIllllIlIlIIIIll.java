package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.optifine.llIllIIIIIllIlIIIIlI.*;

public class llllIIllllIlIlIIIIll extends lIIllIIIllllIlllIllI
{
    private final lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    
    public llllIIllllIlIlIIIIll(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void n_() {
        int n = 0;
        this.IllIIlllIIIIlllIIlIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.skinCustomisation.title", new Object[0]);
        IlIlIIIllIllIIIIIllI[] values;
        for (int length = (values = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.values()).length, i = 0; i < length; ++i) {
            final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = values[i];
            this.IIlllIIlIllIllIlIIll.add(new IlIllIlIlIIIlIlIlIII(this, ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), 150, 20, ilIlIIIllIllIIIIIllI, null));
            ++n;
        }
        if (n % 2 == 1) {
            ++n;
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(210, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.skinCustomisation.ofCape", new Object[0])));
        n += 2;
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 210) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(this));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
            }
            else if (ilIIIlIlIIIllIlIlIIl instanceof IlIllIlIlIIIlIlIlIII) {
                final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = ((IlIllIlIlIIIlIlIlIII)ilIIIlIlIIIllIlIlIIl).IlIllIlIlIIIlIlIlIII;
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IllIIlllIIIIlllIIlIl, this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    private String llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        String s;
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl().contains(ilIlIIIllIllIIIIIllI)) {
            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.on", new Object[0]);
        }
        else {
            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0]);
        }
        return String.valueOf(ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl().lIIIlllIIIllIIIllIII()) + ": " + s;
    }
}
