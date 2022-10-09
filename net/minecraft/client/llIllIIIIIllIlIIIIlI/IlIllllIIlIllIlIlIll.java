package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import org.apache.commons.lang3.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IlIllllIIlIllIlIlIll extends lllIIIIlIlIllIIlIIIl
{
    final /* synthetic */ lllllIlIlIlllIlllIlI llllIIIIlIIIlIlllIll;
    
    public IlIllllIIlIllIlIlIll(final lllllIlIlIlllIlllIlI llllIIIIlIIIlIlllIll, final Minecraft minecraft) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(minecraft, llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, 32, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII - 64, 36);
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.size();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final boolean b, final int n2, final int n3) {
        lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, n);
        final boolean b2 = this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII >= 0 && this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII < this.llllIIIIlIIIlIlllIll();
        this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI = b2;
        this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.lIlIlIIIllIIllIIIllI = b2;
        this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII.lIlIlIIIllIIllIIIllI = b2;
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lIlIlIIIllIIllIIIllI = b2;
        if (b && b2) {
            this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(n);
        }
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return n == this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII;
    }
    
    @Override
    protected int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.size() * 36;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.get(n);
        String s = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl();
        if (StringUtils.isEmpty((CharSequence)s)) {
            s = String.valueOf(this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI) + " " + (n + 1);
        }
        final String string = String.valueOf(new StringBuilder(String.valueOf(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll())).append(" (").append(this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.format(new Date(llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI()))).toString()) + ")";
        final String s2 = "";
        String s3;
        if (llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl()) {
            s3 = String.valueOf(this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll) + " " + s2;
        }
        else {
            s3 = this.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl[llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()];
            if (llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl()) {
                s3 = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gameMode.hardcore", new Object[0]) + IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl;
            }
            if (llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII()) {
                s3 = String.valueOf(s3) + ", " + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.cheats", new Object[0]);
            }
        }
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, s, n2 + 2, n3 + 1, 16777215);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, string, n2 + 2, n3 + 12, 8421504);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, s3, n2 + 2, n3 + 12 + 10, 8421504);
    }
}
