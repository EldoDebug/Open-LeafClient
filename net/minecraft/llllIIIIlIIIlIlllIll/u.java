package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class u extends llllIIIIlIIIlIlllIll
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIlIlIlIlllllllllIl IlllIIIIlIIIlIlIlIIl;
    public static final IlIlIlIlIlllllllllIl lllIllIIIllllllIllll;
    private final boolean llIllIlIlIIIIIIIllII;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("north");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("east");
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("south");
        lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("west");
    }
    
    protected u(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean llIllIlIlIIIIIIIllII) {
        super(ilIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(u.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(u.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(u.IlllIIIIlIIIlIlIlIIl, false).llllIIIIlIIIlIlllIll(u.lllIllIIIllllllIllll, false));
        this.llIllIlIlIIIIIIIllII = llIllIlIlIIIIIIIllII;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(u.IIIIIIIIIlllIllIlIlI, this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(u.IlllIIIIlIIIlIlIlIIl, this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(u.lllIllIIIllllllIllll, this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(u.IIllllIIIlIIIIIIllIl, this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI()));
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return this.llIllIlIlIIIIIIIllII ? super.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, random, n) : null;
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
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() != this && super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final boolean llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI());
        final boolean llIllIIIIIllIlIIIIlI3 = this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI());
        final boolean llIllIIIIIllIlIIIIlI4 = this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI());
        final boolean llIllIIIIIllIlIIIIlI5 = this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI());
        if ((!llIllIIIIIllIlIIIIlI4 || !llIllIIIIIllIlIIIIlI5) && (llIllIIIIIllIlIIIIlI4 || llIllIIIIIllIlIIIIlI5 || llIllIIIIIllIlIIIIlI2 || llIllIIIIIllIlIIIIlI3)) {
            if (llIllIIIIIllIlIIIIlI4) {
                this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.4375f, 0.5f, 1.0f, 0.5625f);
                super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
            }
            else if (llIllIIIIIllIlIIIIlI5) {
                this.llllIIIIlIIIlIlllIll(0.5f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
                super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        }
        if ((!llIllIIIIIllIlIIIIlI2 || !llIllIIIIIllIlIIIIlI3) && (llIllIIIIIllIlIIIIlI4 || llIllIIIIIllIlIIIIlI5 || llIllIIIIIllIlIIIIlI2 || llIllIIIIIllIlIIIIlI3)) {
            if (llIllIIIIIllIlIIIIlI2) {
                this.llllIIIIlIIIlIlllIll(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 0.5f);
                super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
            }
            else if (llIllIIIIIllIlIIIIlI3) {
                this.llllIIIIlIIIlIlllIll(0.4375f, 0.0f, 0.5f, 0.5625f, 1.0f, 1.0f);
                super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 1.0f);
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        }
    }
    
    @Override
    public void IlIlIllllllllIIIIlII() {
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        float n = 0.4375f;
        float n2 = 0.5625f;
        float n3 = 0.4375f;
        float n4 = 0.5625f;
        final boolean llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI());
        final boolean llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI());
        final boolean llIllIIIIIllIlIIIIlI3 = this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI());
        final boolean llIllIIIIIllIlIIIIlI4 = this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI());
        if ((!llIllIIIIIllIlIIIIlI3 || !llIllIIIIIllIlIIIIlI4) && (llIllIIIIIllIlIIIIlI3 || llIllIIIIIllIlIIIIlI4 || llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI2)) {
            if (llIllIIIIIllIlIIIIlI3) {
                n = 0.0f;
            }
            else if (llIllIIIIIllIlIIIIlI4) {
                n2 = 1.0f;
            }
        }
        else {
            n = 0.0f;
            n2 = 1.0f;
        }
        if ((!llIllIIIIIllIlIIIIlI || !llIllIIIIIllIlIIIIlI2) && (llIllIIIIIllIlIIIIlI3 || llIllIIIIIllIlIIIIlI4 || llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI2)) {
            if (llIllIIIIIllIlIIIIlI) {
                n3 = 0.0f;
            }
            else if (llIllIIIIIllIlIIIIlI2) {
                n4 = 1.0f;
            }
        }
        else {
            n3 = 0.0f;
            n4 = 1.0f;
        }
        this.llllIIIIlIIIlIlllIll(n, 0.0f, n3, n2, 1.0f, n4);
    }
    
    public final boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() || llllIIIIlIIIlIlllIll == this || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL || llllIIIIlIIIlIlllIll instanceof u;
    }
    
    @Override
    protected boolean IIlllIlIIllIlIlIlIIl() {
        return true;
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 0;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { u.IIIIIIIIIlllIllIlIlI, u.IIllllIIIlIIIIIIllIl, u.lllIllIIIllllllIllll, u.IlllIIIIlIIIlIlIlIIl });
    }
}
