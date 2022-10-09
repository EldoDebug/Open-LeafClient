package net.minecraft.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIllIIIlIlIIllIIIlI extends IIllllIIIlIIIIIIllIl
{
    public static final llIllIIIIIllIlIIIIlI IIIIIIIIIlllIllIlIlI;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing", (Predicate)IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll);
    }
    
    protected IIIllIIIlIlIIllIIIlI() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI() {
        return 2;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return 8;
    }
    
    @Override
    protected boolean IIlllIlIIllIlIlIlIIl() {
        return true;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.IIIIIIIIIlllIllIlIlI, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII().IlIlIIIllIllIIIIIllI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.IIIIIIIIIlllIllIlIlI, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII().IlIlIIIllIllIIIIIllI()), 2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        final IIlIIIIIllIlIIIlIIll at = llllIIIIlIIIlIlllIll.at();
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (at == null || !(llllIIIIlIIIlIlllIll2 instanceof IlIlIIIlIIlIlIIlllIl)) {
            return true;
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
            return true;
        }
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        at.llllIIIIlIIIlIlllIll((IlIlIIIlIIlIlIIlllIl)llllIIIIlIIIlIlllIll2);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(at);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIlIlIIIlIIlIlIlII);
        return true;
    }
    
    @Override
    public net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        return new IlIlIIIlIIlIlIIlllIl();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        for (int i = 0; i < 3; ++i) {
            final int n = random.nextInt(2) * 2 - 1;
            final int n2 = random.nextInt(2) * 2 - 1;
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5 + 0.25 * n, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextFloat(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5 + 0.25 * n2, random.nextFloat() * n, (random.nextFloat() - 0.5) * 0.125, random.nextFloat() * n2, new int[0]);
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        lllIllIIIllllllIllll lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(n);
        if (lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
        }
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IIIllIIIlIlIIllIIIlI.IIIIIIIIIlllIllIlIlI });
    }
}
