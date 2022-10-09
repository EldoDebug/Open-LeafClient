package net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

class llIIlIIIlIIIllIlIIIl extends lllIIIIlIlIllIIlIIIl
{
    private final List IlIlIlIlIlllllllllIl;
    final /* synthetic */ llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    
    public llIIlIIIlIIIllIlIIIl(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll, final Minecraft minecraft) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(minecraft, llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, 32, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII - 64, llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll * 4);
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl(false);
        for (final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll : net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.values()) {
            if (llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl) > 0 || llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI) > 0) {
                this.IlIlIlIlIlllllllllIl.add(llllIIllllIlIlIIIIll);
            }
        }
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.size();
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
        return this.llllIIIIlIIIlIlllIll() * this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll * 4;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = this.IlIlIlIlIlllllllllIl.get(n);
        final String llllIIIIlIIIlIlllIll = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("entity." + net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll) + ".name", new Object[0]);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl);
        final int llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI);
        String s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stat.entityKills", llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll);
        String s2 = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stat.entityKilledBy", llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll3);
        if (llllIIIIlIIIlIlllIll2 == 0) {
            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stat.entityKills.none", llllIIIIlIIIlIlllIll);
        }
        if (llllIIIIlIIIlIlllIll3 == 0) {
            s2 = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stat.entityKilledBy.none", llllIIIIlIIIlIlllIll);
        }
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, llllIIIIlIIIlIlllIll, n2 + 2 - 10, n3 + 1, 16777215);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, s, n2 + 2, n3 + 1 + this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, (llllIIIIlIIIlIlllIll2 == 0) ? 6316128 : 9474192);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, s2, n2 + 2, n3 + 1 + this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll * 2, (llllIIIIlIIIlIlllIll3 == 0) ? 6316128 : 9474192);
    }
}
