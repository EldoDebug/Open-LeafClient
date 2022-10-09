package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class llllllIllIllIlIllllI extends lIIllIIIllllIlllIllI
{
    protected lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private IIIllllllIllIIIlllIl IllIIlllIIIIlllIIlIl;
    private final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private final IIlllIIlIllIllIlIIll lIIIIlIIIIIlllIllIII;
    private llIlIIIIIlIIlIlIIlll lIIIlllIIIllIIIllIII;
    private llIlIIIIIlIIlIlIIlll llIIlIIIlIIIllIlIIIl;
    
    public llllllIllIllIlIllllI(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI, final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl, final IIlllIIlIllIllIlIIll liiiIlIIIIIlllIllIII) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.add(this.lIIIlllIIIllIIIllIII = new llIlIIIIIlIIlIlIIlll(100, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII - 38, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI, this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI)));
        this.IIlllIIlIllIllIlIIll.add(this.llIIlIIIlIIIllIlIIIl = new llIlIIIIIlIIlIlIIlll(6, this.llllIIllllIlIlIIIIll / 2 - 155 + 160, this.IlIllIlIlIIIlIlIlIII - 38, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        (this.IllIIlllIIIIlllIIlIl = new IIIllllllIllIIIlllIl(this, this.IlIlIIIllIIllIlllllI)).IlIIIlIlIIIllIlIlIIl(7, 8);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            switch (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI) {
                case 5: {
                    break;
                }
                case 6: {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
                    break;
                }
                case 100: {
                    if (ilIIIlIlIIIllIlIlIIl instanceof llIlIIIIIlIIlIlIIlll) {
                        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(((llIlIIIIIlIIlIlIIlll)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(), 1);
                        ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI);
                        final g g = new g(this.IlIlIIIllIIllIlllllI);
                        this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl());
                        break;
                    }
                    break;
                }
                default: {
                    this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                    break;
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.language", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 16, 16777215);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, "(" + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.languageWarning", new Object[0]) + ")", this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII - 56, 8421504);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
