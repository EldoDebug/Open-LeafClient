package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;

public class lIIlIIIlIllIlIllIIIl extends IlIIIIIlIIllIIlIlIll
{
    private Set llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    public lIIlIIIlIllIlIllIIIl() {
        this.llIllIIIIIllIlIIIIlI = Sets.newHashSet();
    }
    
    public lIIlIIIlIllIlIllIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final int n, final int n2) {
        super(n, n2);
        this.llIllIIIIIllIlIIIIlI = Sets.newHashSet();
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, random, n, n2);
    }
    
    private void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final int n, final int n2) {
        random.setSeed(illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII());
        random.setSeed(n * random.nextLong() ^ n2 * random.nextLong() ^ illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII());
        this.llllIIIIlIIIlIlllIll.add(new lIlIIlllIIlIIlIlllIl(random, n * 16 + 8 - 29, n2 * 16 + 8 - 29, IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(random)));
        this.IlIIIlIlIIIllIlIlIIl();
        this.IlIIIlIlIIIllIlIlIIl = true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (!this.IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIIlIIIlIlllIll.clear();
            this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, random, this.IlIlIIIllIllIIIIIllI(), this.IllIIlllIIIIlllIIlIl());
        }
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return !this.llIllIIIIIllIlIIIIlI.contains(ilIlIlIlIlllllllllIl) && super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI.add(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl();
        for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : this.llIllIIIIIllIlIIIIlI) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("X", ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll);
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Z", ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl);
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Processed", ilIlIIIlIIlIlIIlllIl);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Processed", 9)) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Processed", 10);
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
                this.llIllIIIIIllIlIIIIlI.add(new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("X"), ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("Z")));
            }
        }
    }
}
