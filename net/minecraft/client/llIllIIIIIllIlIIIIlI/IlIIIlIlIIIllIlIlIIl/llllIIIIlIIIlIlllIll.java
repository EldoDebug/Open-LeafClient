package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class llllIIIIlIIIlIlllIll extends lIIllIIIllllIlllIllI
{
    private final lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl;
    
    public llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void n_() {
        this.IllIIlllIIIIlllIIlIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.stream.ingest.title", new Object[0]);
        this.llllIIIlIlllIlIIIIIl = new IlIlIlIlIlllllllllIl(this, this.IlIlIIIllIIllIlllllI);
        if (!this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().IlIlIIIlIIlIlIIlllIl()) {
            this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().IIllIIllIIIlIlIIIIlI();
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII - 24 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII - 24 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.stream.ingest.reset", new Object[0])));
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void o_() {
        if (this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().IlIlIIIlIIlIlIIlllIl()) {
            this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().IIIlIIIlIlIIlllIIlll().llllIIIlIlllIlIIIIIl();
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
            }
            else {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IllIllIIIIlIIlIlllII = "";
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IllIIlllIIIIlllIIlIl, this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
