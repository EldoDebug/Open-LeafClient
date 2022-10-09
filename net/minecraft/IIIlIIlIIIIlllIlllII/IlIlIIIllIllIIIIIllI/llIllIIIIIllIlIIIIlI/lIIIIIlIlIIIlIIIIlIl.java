package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIIIlIlIIIlIIIIlIl extends IllIlllIllIIIIllllII
{
    private static final List llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = Lists.newArrayList((Object[])new k[] { new k(IIllIIllIIIlIlIIIIlI.y, 0, 1, 1, 10), new k(IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, 0, 1, 3, 3), new k(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, 0, 1, 5, 10), new k(IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI, 0, 1, 3, 5), new k(IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII, 0, 4, 9, 5), new k(IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII, 0, 1, 3, 15), new k(IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI, 0, 1, 3, 15), new k(IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.lIlIlIIIllIIllIIIllI, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.lIlIlIlllIIlIlIlllIl, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.IIlIIIlllIllIllIlIII, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.llIIIIIIlIllIIlIIIll, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.lIIIIlIlIllllIIlIllI, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.llllIllllIllllIlIlII, 0, 1, 1, 1), new k(IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII, 0, 1, 1, 1), new k(IIllIIllIIIlIlIIIIlI.ao, 0, 1, 1, 1), new k(IIllIIllIIIlIlIIIIlI.ap, 0, 1, 1, 1), new k(IIllIIllIIIlIlIIIIlI.aq, 0, 1, 1, 1) });
    }
    
    public lIIIIIlIlIIIlIIIIlIl() {
    }
    
    public lIIIIIlIlIIIlIIIIlIl(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(random);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Chest", this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Chest");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        this.llllIIIIlIIIlIlllIll((llllllIIIIIIIlllIIll)illlllllIIIlIIIlIlII, list, random, 1, 1);
    }
    
    public static lIIIIIlIlIIIlIIIIlIl llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, -1, -1, 0, 5, 5, 7, lllIllIIIllllllIllll);
        return (IllIlllIllIIIIllllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new lIIIIIlIlIIIlIIIIlIl(n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 4, 4, 6, true, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl, this.IlIIIlIlIIIllIlIlIIl, 1, 1, 0);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl, lIllIlIIIllllllIIlII.llllIIIIlIIIlIlllIll, 1, 1, 6);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 2, 3, 1, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(cy.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()), 3, 1, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(cy.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()), 3, 1, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(cy.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()), 3, 2, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(cy.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()), 3, 2, 4, ilIlIIIlIIlIlIIlllIl);
        for (int i = 2; i <= 4; ++i) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(cy.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()), 2, 1, i, ilIlIIIlIIlIlIIlllIl);
        }
        if (!this.IlIlIlIlIlllllllllIl && ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(3, 3), this.llllIIIIlIIIlIlllIll(2), this.IlIlIlIlIlllllllllIl(3, 3)))) {
            this.IlIlIlIlIlllllllllIl = true;
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 3, 2, 3, k.llllIIIIlIIIlIlllIll(lIIIIIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll, IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(random)), 2 + random.nextInt(2));
        }
        return true;
    }
}
