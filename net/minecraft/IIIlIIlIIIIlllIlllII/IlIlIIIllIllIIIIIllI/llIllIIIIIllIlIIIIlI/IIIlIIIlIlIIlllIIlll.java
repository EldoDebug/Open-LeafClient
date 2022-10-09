package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IIIlIIIlIlIIlllIIlll extends IlIIIIIlIIllIIlIlIll
{
    private boolean llIllIIIIIllIlIIIIlI;
    
    public IIIlIIIlIlIIlllIIlll() {
    }
    
    public IIIlIIIlIlIIlllIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final int n, final int n2, final int n3) {
        super(n, n2);
        final g g = new g(illlllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl(), 0, random, (n << 4) + 2, (n2 << 4) + 2, IlIllIIllIIlIIIIlIIl.llllIIIIlIIIlIlllIll(random, n3), n3);
        this.llllIIIIlIIIlIlllIll.add(g);
        g.llllIIIIlIIIlIlllIll(g, this.llllIIIIlIIIlIlllIll, random);
        final List llIIlIIIlIIIllIlIIIl = g.llIIlIIIlIIIllIlIIIl;
        final List liiIlllIIIllIIIllIII = g.lIIIlllIIIllIIIllIII;
        while (!llIIlIIIlIIIllIlIIIl.isEmpty() || !liiIlllIIIllIIIllIII.isEmpty()) {
            if (llIIlIIIlIIIllIlIIIl.isEmpty()) {
                liiIlllIIIllIIIllIII.remove(random.nextInt(liiIlllIIIllIIIllIII.size())).llllIIIIlIIIlIlllIll(g, this.llllIIIIlIIIlIlllIll, random);
            }
            else {
                llIIlIIIlIIIllIlIIIl.remove(random.nextInt(llIIlIIIlIIIllIlIIIl.size())).llllIIIIlIIIlIlllIll(g, this.llllIIIIlIIIlIlllIll, random);
            }
        }
        this.IlIIIlIlIIIllIlIlIIl();
        int n4 = 0;
        final Iterator iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            if (!(iterator.next() instanceof f)) {
                ++n4;
            }
        }
        this.llIllIIIIIllIlIIIIlI = (n4 > 2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Valid", this.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Valid");
    }
}
