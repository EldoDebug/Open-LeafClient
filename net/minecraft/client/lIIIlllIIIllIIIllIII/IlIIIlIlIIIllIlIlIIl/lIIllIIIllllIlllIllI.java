package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import com.google.common.collect.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIllIIIllllIlllIllI extends IllIIlllIIIIlllIIlIl
{
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    private static final lIllllIllIllIIllllll IlIlIIIlIIlIlIIlllIl;
    private final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl IlllllllIIIlIIIlIlII;
    private final IllIlIIllIllIIlIllII IIlIIIIlllIlllllIlII;
    private final List IIIlIIlIIIIlllIlllII;
    private final List IlIlIllllllllIIIIlII;
    
    static {
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/zombie/zombie.png");
        IlIlIIIlIIlIlIIlllIl = new lIllllIllIllIIllllll("textures/entity/zombie/zombie_villager.png");
    }
    
    public lIIllIIIllllIlllIllI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IlIIlIlIIIlIIlIlIlII(), 0.5f, 1.0f);
        final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = this.lIIIIlIIIIIlllIllIII.get(0);
        this.IlllllllIIIlIIIlIlII = this.llllIIIIlIIIlIlllIll;
        this.IIlIIIIlllIlllllIlII = new IllIlIIllIllIIlIllII();
        this.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(this));
        final IllIlIllIllIlllIIlll illIlIllIllIlllIIlll = new IllIlIllIllIlllIIlll(this, this);
        this.llllIIIIlIIIlIlllIll(illIlIllIllIlllIIlll);
        this.IlIlIllllllllIIIIlII = Lists.newArrayList((Iterable)this.lIIIIlIIIIIlllIllIII);
        if (ilIllIlIlIIIlIlIlIII instanceof net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl) {
            this.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII);
            this.llllIIIIlIIIlIlllIll(new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(this.IIlIIIIlllIlllllIlII.llIllIlIIIIllIlIIllI));
        }
        this.IlIlIlIlIlllllllllIl(illIlIllIllIlllIIlll);
        this.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(this));
        this.IIIlIIlIIIIlllIlllII = Lists.newArrayList((Iterable)this.lIIIIlIIIIIlllIllIII);
    }
    
    public void llllIIIIlIIIlIlllIll(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll, final double n, final double n2, final double n3, final float n4, final float n5) {
        this.IlIlIlIlIlllllllllIl(llIlIIIIIlIIlIlIIlll);
        super.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        return llIlIIIIIlIIlIlIIlll.aq() ? lIIllIIIllllIlllIllI.IlIlIIIlIIlIlIIlllIl : lIIllIIIllllIlllIllI.IIIlIIIlIlIIlllIIlll;
    }
    
    private void IlIlIlIlIlllllllllIl(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        if (llIlIIIIIlIIlIlIIlll.aq()) {
            this.IllIIlllIIIIlllIIlIl = this.IIlIIIIlllIlllllIlII;
            this.lIIIIlIIIIIlllIllIII = this.IIIlIIlIIIIlllIlllII;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = this.IlllllllIIIlIIIlIlII;
            this.lIIIIlIIIIIlllIllIII = this.IlIlIllllllllIIIIlII;
        }
        this.llllIIIIlIIIlIlllIll = (net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl)this.IllIIlllIIIIlllIIlIl;
    }
    
    protected void llllIIIIlIIIlIlllIll(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll, final float n, float n2, final float n3) {
        if (llIlIIIIIlIIlIlIIlll.ar()) {
            n2 += (float)(Math.cos(llIlIIIIIlIIlIlIIlll.lllllIIIIIlIlIIIIIIl * 3.25) * 3.141592653589793 * 0.25);
        }
        super.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll, n, n2, n3);
    }
}
