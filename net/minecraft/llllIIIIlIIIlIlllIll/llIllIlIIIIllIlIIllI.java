package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llIllIlIIIIllIlIIllI extends IIllllIIIlIIIIIIllIl
{
    public static final llIllIIIIIllIlIIIIlI IIIIIIIIIlllIllIlIlI;
    public static final IllIIlllIIIIlllIIlIl IIllllIIIlIIIIIIllIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing", (Predicate)IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("rotation", 0, 15);
    }
    
    protected llIllIlIIIIllIlIIllI() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        final float n = 0.25f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 1.0f, 0.5f + n);
    }
    
    @Override
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.banner.white.name");
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return super.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return true;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llIIIlIlIllIIlIlIlII() {
        return true;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        return new lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aI;
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final int n2) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll instanceof lIIIIlIIIIIlllIllIII) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aI, 1, ((lIIIIlIIIIIlllIllIII)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll());
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
            iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("x");
            iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("y");
            iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("z");
            iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("id");
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("BlockEntityTag", iiiIlllIIIIIIlIIIlll);
            net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIIIIlIlIllIIlIIIl);
        }
        else {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, n, n2);
        }
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return !this.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) && super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl instanceof lIIIIlIIIIIlllIllIII) {
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = (lIIIIlIIIIIlllIllIII)ilIIIlIlIIIllIlIlIIl;
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aI, 1, ((lIIIIlIIIIIlllIllIII)ilIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll());
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(), liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI());
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("BlockEntityTag", iiiIlllIIIIIIlIIIlll);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIIIIlIlIllIIlIIIl);
        }
        else {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, null);
        }
    }
}
