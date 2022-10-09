package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll extends IIIIlllIIIIIIlIIIlll
{
    private String IIIIlllIIIIIIlIIIlll;
    private llIIIIIIlIllIIlIIIll llllIIllllIlIlIIIIll;
    private List IlIllIlIlIIIlIlIlIII;
    private final IIIIlllIIIIIIlIIIlll IIlllIIlIllIllIlIIll;
    private int lllIIIIlllllIlIIllIl;
    
    public llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iIlllIIlIllIllIlIIll, final String s, final llIIIIIIlIllIIlIIIll llllIIllllIlIlIIIIll) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        this.IIIIlllIIIIIIlIIIlll = net.minecraft.IIlllIIlIllIllIlIIll.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(s);
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    @Override
    public void init() {
        net.minecraft.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(false);
        this.llllIIIlIlllIlIIIIIl();
        this.IlIllIlIlIIIlIlIlIII = this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll.lIIIlllIIIllIIIllIII(), this.IlIIIlIlIIIllIlIlIIl() - 50);
        this.lllIIIIlllllIlIIllIl = this.IlIllIlIlIIIlIlIlIII.size() * this.IllIIlllIIIIlllIIlIl();
        this.llllIIIIlIIIlIlllIll(net.minecraft.IIlllIIlIllIllIlIIll.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(0, this.IlIIIlIlIIIllIlIlIIl() / 2 - 100, this.IlIlIIIllIllIIIIIllI() / 2 + this.lllIIIIlllllIlIIllIl / 2 + this.IllIIlllIIIIlllIIlIl(), net.minecraft.IIlllIIlIllIllIlIIll.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("gui.back")));
    }
    
    @Override
    public void keyPressed(final char c, final int n) {
        if (n == 1) {
            net.minecraft.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll);
        }
    }
    
    @Override
    public void buttonClicked(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        if (illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl() == 0) {
            net.minecraft.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll);
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll, this.IlIIIlIlIIIllIlIlIIl() / 2, this.IlIlIIIllIllIIIIIllI() / 2 - this.lllIIIIlllllIlIIllIl / 2 - this.IllIIlllIIIIlllIIlIl() * 2, 11184810);
        int n4 = this.IlIlIIIllIllIIIIIllI() / 2 - this.lllIIIIlllllIlIIllIl / 2;
        if (this.IlIllIlIlIIIlIlIlIII != null) {
            final Iterator<String> iterator = this.IlIllIlIlIIIlIlIlIII.iterator();
            while (iterator.hasNext()) {
                this.llllIIIIlIIIlIlllIll(iterator.next(), this.IlIIIlIlIIIllIlIlIIl() / 2, n4, 16777215);
                n4 += this.IllIIlllIIIIlllIIlIl();
            }
        }
        super.render(n, n2, n3);
    }
}
