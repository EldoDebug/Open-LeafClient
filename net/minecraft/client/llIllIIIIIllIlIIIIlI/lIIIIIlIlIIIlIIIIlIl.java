package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;

public class lIIIIIlIlIIIlIIIIlIl extends lIIllIIIllllIlllIllI
{
    private final lIIllIIIllllIlllIllI IllIIlllIIIIlllIIlIl;
    private final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    protected String IlIlIIIllIllIIIIIllI;
    private String lIIIIlIIIIIlllIllIII;
    
    public lIIIIIlIlIIIlIIIIlIl(final lIIllIIIllllIlllIllI illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl) {
        this.IlIlIIIllIllIIIIIllI = "Options";
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void n_() {
        int n = 0;
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.sounds.title", new Object[0]);
        this.lIIIIlIIIIIlllIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0]);
        this.IIlllIIlIllIllIlIIll.add(new IIllIIIlIIIIlIIlIIII(this, net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 - 12 + 24 * (n >> 1), net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll, true));
        n += 2;
        IlIlIIIllIIllIlllllI[] values;
        for (int length = (values = net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.values()).length, i = 0; i < length; ++i) {
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = values[i];
            if (ilIlIIIllIIllIlllllI != net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll) {
                this.IIlllIIlIllIllIlIIll.add(new IIllIIIlIIIIlIIlIIII(this, ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 - 12 + 24 * (n >> 1), ilIlIIIllIIllIlllllI, false));
                ++n;
            }
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 168, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI && ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    protected String llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final float llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
        return (llllIIIIlIIIlIlllIll == 0.0f) ? this.lIIIIlIIIIIlllIllIII : (String.valueOf((int)(llllIIIIlIIIlIlllIll * 100.0f)) + "%");
    }
}
