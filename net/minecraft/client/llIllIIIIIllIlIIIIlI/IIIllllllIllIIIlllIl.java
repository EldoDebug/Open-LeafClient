package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;

class IIIllllllIllIIIlllIl extends lllIIIIlIlIllIIlIIIl
{
    private final List IlIlIlIlIlllllllllIl;
    private final Map IlllllllIIIlIIIlIlII;
    final /* synthetic */ llllllIllIllIlIllllI llllIIIIlIIIlIlllIll;
    
    public IIIllllllIllIIIlllIl(final llllllIllIllIlIllllI llllIIIIlIIIlIlllIll, final Minecraft minecraft) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(minecraft, llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, 32, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII - 65 + 4, 18);
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.IlllllllIIIlIIIlIlII = Maps.newHashMap();
        for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII : llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl()) {
            this.IlllllllIIIlIIIlIlII.put(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(), ilIllIlIlIIIlIlIlIII);
            this.IlIlIlIlIlllllllllIl.add(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll());
        }
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.size();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final boolean b, final int n2, final int n3) {
        final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = this.IlllllllIIIlIIIlIlII.get(this.IlIlIlIlIlllllllllIl.get(n));
        this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII);
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.lllIIIIlIlIllIIlIIIl = ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll();
        this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI();
        this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() || this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IllIlllIllIIIIllllII);
        this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
        this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0]);
        this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI);
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return this.IlIlIlIlIlllllllllIl.get(n).equals(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll());
    }
    
    @Override
    protected int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll() * 18;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(true);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, this.IlllllllIIIlIIIlIlII.get(this.IlIlIlIlIlllllllllIl.get(n)).toString(), this.IlIIIlIlIIIllIlIlIIl / 2, n3 + 1, 16777215);
        this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl());
    }
}
