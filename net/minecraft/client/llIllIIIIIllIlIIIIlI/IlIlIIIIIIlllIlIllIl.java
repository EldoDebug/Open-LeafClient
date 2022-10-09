package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;

public class IlIlIIIIIIlllIlIllIl extends lIIllIIIllllIlllIllI
{
    private String IlIlIIIllIllIIIIIllI;
    private llIIIIIIlIllIIlIIIll IllIIlllIIIIlllIIlIl;
    private List llllIIIlIlllIlIIIIIl;
    private final lIIllIIIllllIlllIllI lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    
    public IlIlIIIIIIlllIlIllIl(final lIIllIIIllllIlllIllI liiiIlIIIIIlllIllIII, final String s, final llIIIIIIlIllIIlIIIll illIIlllIIIIlllIIlIl) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s, new Object[0]);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        this.llllIIIlIlllIlIIIIIl = this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(this.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII(), this.llllIIllllIlIlIIIIll - 50);
        this.lIIIlllIIIllIIIllIII = this.llllIIIlIlllIlIIIIIl.size() * this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 2 + this.lIIIlllIIIllIIIllIII / 2 + this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.toMenu", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 2 - this.lIIIlllIIIllIIIllIII / 2 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll * 2, 11184810);
        int n4 = this.IlIllIlIlIIIlIlIlIII / 2 - this.lIIIlllIIIllIIIllIII / 2;
        if (this.llllIIIlIlllIlIIIIIl != null) {
            final Iterator<String> iterator = this.llllIIIlIlllIlIIIIIl.iterator();
            while (iterator.hasNext()) {
                this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, iterator.next(), this.llllIIllllIlIlIIIIll / 2, n4, 16777215);
                n4 += this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
            }
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
