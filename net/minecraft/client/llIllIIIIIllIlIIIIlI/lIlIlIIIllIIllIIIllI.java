package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;

public class lIlIlIIIllIIllIIIllI extends lIIllIIIllllIlllIllI
{
    private final IIIIlllIIIIIIlIIIlll IlIlIIIllIllIIIIIllI;
    private llIIlIIIlIIIllIlIIIl IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    private IlIlIIIllIIllIlllllI llIIlIIIlIIIllIlIIIl;
    private IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI;
    private IlIIIlIlIIIllIlIlIIl lIlIlIIIllIIllIIIllI;
    private IlIIIlIlIIIllIlIlIIl IIIlIIIlIlIIlllIIlll;
    
    public lIlIlIIIllIIllIIIllI(final IIIIlllIIIIIIlIIIlll ilIlIIIllIllIIIIIllI, final String s) {
        this.IllIIlllIIIIlllIIlIl = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll(s);
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl.toString();
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        this.IllIIlllIIIIlllIIlIl = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s);
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        this.llllIIIlIlllIlIIIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.flat.title", new Object[0]);
        this.lIIIIlIIIIIlllIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.flat.tile", new Object[0]);
        this.lIIIlllIIIllIIIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.flat.height", new Object[0]);
        this.llIIlIIIlIIIllIlIIIl = new IlIlIIIllIIllIlllllI(this);
        this.IIlllIIlIllIllIlIIll.add(this.llIllIlIIIIllIlIIllI = new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 - 154, this.IlIllIlIlIIIlIlIlIII - 52, 100, 20, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.flat.addLayer", new Object[0])) + " (NYI)"));
        this.IIlllIIlIllIllIlIIll.add(this.lIlIlIIIllIIllIIIllI = new IlIIIlIlIIIllIlIlIIl(3, this.llllIIllllIlIlIIIIll / 2 - 50, this.IlIllIlIlIIIlIlIlIII - 52, 100, 20, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.flat.editLayer", new Object[0])) + " (NYI)"));
        this.IIlllIIlIllIllIlIIll.add(this.IIIlIIIlIlIIlllIIlll = new IlIIIlIlIIIllIlIlIIl(4, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII - 52, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.flat.removeLayer", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII - 28, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(5, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII - 52, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.presets", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII - 28, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        final IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI;
        final IlIIIlIlIIIllIlIlIIl lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI;
        final boolean b = false;
        lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI = b;
        llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI = b;
        this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final int n = this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI().size() - this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll - 1;
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
            this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 5) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlllllllIIIlIIIlIlII(this));
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 4 && this.lIIIIlIIIIIlllIllIII()) {
            this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI().remove(n);
            this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll = Math.min(this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll, this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI().size() - 1);
        }
        this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
        this.llllIIIlIlllIlIIIIIl();
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        final boolean liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        this.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI = liiiIlIIIIIlllIllIII;
        this.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI = liiiIlIIIIIlllIllIII;
        this.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI = false;
        this.llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI = false;
    }
    
    private boolean lIIIIlIIIIIlllIllIII() {
        return this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll > -1 && this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll < this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI().size();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.llllIIIlIlllIlIIIIIl, this.llllIIllllIlIlIIIIll / 2, 8, 16777215);
        final int n4 = this.llllIIllllIlIlIIIIll / 2 - 92 - 16;
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, this.lIIIIlIIIIIlllIllIII, n4, 32, 16777215);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, this.lIIIlllIIIllIIIllIII, n4 + 2 + 213 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII), 32, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
