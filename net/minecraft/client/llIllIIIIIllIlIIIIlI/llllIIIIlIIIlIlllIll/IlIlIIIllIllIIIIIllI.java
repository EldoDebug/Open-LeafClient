package net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.client.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

class IlIlIIIllIllIIIIIllI extends IlIIIlIlIIIllIlIlIIl
{
    final /* synthetic */ llIllIIIIIllIlIIIIlI IIlllIlIIllIlIlIlIIl;
    
    public IlIlIIIllIllIIIIIllI(final llIllIIIIIllIlIIIIlI iIlllIlIIllIlIlIlIIl, final Minecraft minecraft) {
        this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
        super(iIlllIlIIllIlIlIlIIl, minecraft);
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        for (final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI : net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI) {
            boolean b = false;
            final int llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll());
            if (iIlllIlIIllIlIlIlIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI) > 0) {
                b = true;
            }
            else if (net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[llllIIIIlIIIlIlllIll] != null && iIlllIlIIllIlIlIlIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[llllIIIIlIIIlIlllIll]) > 0) {
                b = true;
            }
            else if (net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIIIlIlllIllIIlIllI[llllIIIIlIIIlIlllIll] != null && iIlllIlIIllIlIlIlIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIIIlIlllIllIIlIllI[llllIIIIlIIIlIlllIll]) > 0) {
                b = true;
            }
            if (b) {
                this.IlIlIlIlIlllllllllIl.add(lIlIlIIIllIIllIIIllI);
            }
        }
        this.IlllllllIIIlIIIlIlII = new net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(this);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII) {
        super.llllIIIIlIIIlIlllIll(n, n2, illlIIlllIIIlIlllII);
        if (this.llllIIIIlIIIlIlllIll == 0) {
            this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(n + 115 - 18 + 1, n2 + 1 + 1, 18, 18);
        }
        else {
            this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(n + 115 - 18, n2 + 1, 18, 18);
        }
        if (this.llllIIIIlIIIlIlllIll == 1) {
            this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(n + 165 - 18 + 1, n2 + 1 + 1, 36, 18);
        }
        else {
            this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(n + 165 - 18, n2 + 1, 36, 18);
        }
        if (this.llllIIIIlIIIlIlllIll == 2) {
            this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(n + 215 - 18 + 1, n2 + 1 + 1, 54, 18);
        }
        else {
            this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(n + 215 - 18, n2 + 1, 54, 18);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final lIlIlIIIllIIllIIIllI ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(n);
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(n2 + 40, n3, llllIIIIlIIIlIlllIll);
        final int llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIIIlIlllIllIIlIllI[llllIIIIlIIIlIlllIll2], n2 + 115, n3, n % 2 == 0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[llllIIIIlIIIlIlllIll2], n2 + 165, n3, n % 2 == 0);
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n2 + 215, n3, n % 2 == 0);
    }
    
    @Override
    protected String llIllIIIIIllIlIIIIlI(final int n) {
        return (n == 0) ? "stat.crafted" : ((n == 1) ? "stat.used" : "stat.mined");
    }
}
