package net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

class llllIIIlIlllIlIIIIIl extends lllIIIIlIlIllIIlIIIl
{
    final /* synthetic */ llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    
    public llllIIIlIlllIlIIIIIl(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll, final Minecraft minecraft) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(minecraft, llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, 32, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII - 64, 10);
        this.IlIlIlIlIlllllllllIl(false);
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.size();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final boolean b, final int n2, final int n3) {
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return false;
    }
    
    @Override
    protected int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll() * 10;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.get(n);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI().lIIIIlIIIIIlllIllIII(), n2 + 2, n3 + 1, (n % 2 == 0) ? 16777215 : 9474192);
        final String llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl));
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, llllIIIIlIIIlIlllIll, n2 + 2 + 213 - this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), n3 + 1, (n % 2 == 0) ? 16777215 : 9474192);
    }
}
