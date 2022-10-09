package net.minecraft.client.llIllIIIIIllIlIIIIlI;

public class llIIlIIIlIIIllIlIIIl extends b
{
    private final String llIIlIIIlIIIllIlIIIl;
    private final String llIllIlIIIIllIlIIllI;
    private final String lIlIlIIIllIIllIIIllI;
    private boolean IIIlIIIlIlIIlllIIlll;
    
    public llIIlIIIlIIIllIlIIIl(final c c, final String lIlIlIIIllIIllIIIllI, final int n, final boolean b) {
        super(c, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(b ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), lIlIlIIIllIIllIIIllI, n);
        this.IIIlIIIlIlIIlllIIlll = true;
        this.llllIIIlIlllIlIIIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(b ? "chat.link.open" : "gui.yes", new Object[0]);
        this.lIIIIlIIIIIlllIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(b ? "gui.cancel" : "gui.no", new Object[0]);
        this.llIllIlIIIIllIlIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("chat.copy", new Object[0]);
        this.llIIlIIIlIIIllIlIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("chat.link.warning", new Object[0]);
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    @Override
    public void n_() {
        super.n_();
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 50 - 105, this.IlIllIlIlIIIlIlIlIII / 6 + 96, 100, 20, this.llllIIIlIlllIlIIIIIl));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 - 50, this.IlIllIlIlIIIlIlIlIII / 6 + 96, 100, 20, this.llIllIlIIIIllIlIIllI));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 50 + 105, this.IlIllIlIlIIIlIlIlIII / 6 + 96, 100, 20, this.lIIIIlIIIIIlllIllIII));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2) {
            this.IlIlIIIllIllIIIIIllI();
        }
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0, this.lIIIlllIIIllIIIllIII);
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        lIIllIIIllllIlllIllI.IlIIIlIlIIIllIlIlIIl(this.lIlIlIIIllIIllIIIllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (this.IIIlIIIlIlIIlllIIlll) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.llIIlIIIlIIIllIlIIIl, this.llllIIllllIlIlIIIIll / 2, 110, 16764108);
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        this.IIIlIIIlIlIIlllIIlll = false;
    }
}
