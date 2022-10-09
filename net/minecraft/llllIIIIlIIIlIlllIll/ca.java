package net.minecraft.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;

public class ca extends IIllllIIIlIIIIIIllIl
{
    public static final llIllIIIIIllIlIIIIlI IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    private static final Predicate IlllIIIIlIIIlIlIlIIl;
    private net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl lllIllIIIllllllIllll;
    private net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl llIllIlIlIIIIIIIllII;
    private static volatile /* synthetic */ int[] IIlIlIlIIlIllIIIIIIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("nodrop");
        IlllIIIIlIIIlIlIlIIl = (Predicate)new cb();
    }
    
    protected ca() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(ca.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(ca.IIllllIIIlIIIIIIllIl, false));
        this.llllIIIIlIIIlIlllIll(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
    }
    
    @Override
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("tile.skull.skeleton.name");
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
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        switch (IllIllIlllIllllIIllI()[((lllIllIIIllllllIllll)lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(ca.IIIIIIIIIlllIllIlIlI)).ordinal()]) {
            default: {
                this.llllIIIIlIIIlIlllIll(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
                break;
            }
            case 3: {
                this.llllIIIIlIIIlIlllIll(0.25f, 0.25f, 0.5f, 0.75f, 0.75f, 1.0f);
                break;
            }
            case 4: {
                this.llllIIIIlIIIlIlllIll(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 0.5f);
                break;
            }
            case 5: {
                this.llllIIIIlIIIlIlllIll(0.5f, 0.25f, 0.25f, 1.0f, 0.75f, 0.75f);
                break;
            }
            case 6: {
                this.llllIIIIlIIIlIlllIll(0.0f, 0.25f, 0.25f, 0.5f, 0.75f, 0.75f);
                break;
            }
        }
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ca.IIIIIIIIIlllIllIlIlI, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII()).llllIIIIlIIIlIlllIll(ca.IIllllIIIlIIIIIIllIl, false);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        return new llllllIllIllIlIllllI();
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab;
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        return (llllIIIIlIIIlIlllIll instanceof llllllIllIllIlIllllI) ? ((llllllIllIllIlIllllI)llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl() : super.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final int n2) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        if (llllIIIIlIIIlIlllIll2.K.IlIIIlIlIIIllIlIlIIl) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ca.IIllllIIIlIIIIIIllIl, true);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 4);
        }
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (!(boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ca.IIllllIIIlIIIIIIllIl)) {
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                if (llllIIIIlIIIlIlllIll instanceof llllllIllIllIlIllllI) {
                    final llllllIllIllIlIllllI llllllIllIllIlIllllI = (llllllIllIllIlIllllI)llllIIIIlIIIlIlllIll;
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 1, this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl));
                    if (llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl() == 3 && llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll() != null) {
                        lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(new IIIIlllIIIIIIlIIIlll());
                        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                        net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll());
                        lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llllIIIIlIIIlIlllIll("SkullOwner", iiiIlllIIIIIIlIIIlll);
                    }
                    net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIIIIlIlIllIIlIIIl);
                }
            }
            super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        }
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == 1 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 2 && illlllllIIIlIIIlIlII.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll && !illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IllIllIIIIlIIlIlllII().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) != null;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        if (llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl() == 1 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 2 && illlllllIIIlIIIlIlII.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll && !illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIllllIIlIIlIlIlIll = this.IlIllllIIlIIlIlIlIll();
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll != null) {
                for (int i = 0; i < 3; ++i) {
                    final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(i, 0, 0);
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(ca.IIllllIIIlIIIIIIllIl, true), 2);
                }
                for (int j = 0; j < ilIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl(); ++j) {
                    for (int k = 0; k < ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll(); ++k) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(j, k, 0).llIllIIIIIllIlIIIIlI(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
                    }
                }
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(1, 0, 0).llIllIIIIIllIlIIIIlI();
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII);
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(1, 2, 0).llIllIIIIIllIlIIIIlI();
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI2.lIIIIlIIIIIlllIllIII() + 0.5, llIllIIIIIllIlIIIIlI2.lIIIlllIIIllIIIllIII() + 0.55, llIllIIIIIllIlIIIIlI2.llIIlIIIlIIIllIlIIIl() + 0.5, (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().lIlIlIIIllIIllIIIllI() == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) ? 0.0f : 90.0f, 0.0f);
                ilIIIlIlIIIllIlIlIIl.lIllIlIIIllllllIIlII = ((llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().lIlIlIIIllIIllIIIllI() == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) ? 0.0f : 90.0f);
                ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII();
                final Iterator iterator = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, ilIIIlIlIIIllIlIlIIl.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(50.0, 50.0, 50.0)).iterator();
                while (iterator.hasNext()) {
                    iterator.next().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIllllllIllIIIlllIl);
                }
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                for (int l = 0; l < 120; ++l) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlllIIIlIlllIIlllII, llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() + illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextDouble(), llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII() - 2 + illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextDouble() * 3.9, llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl() + illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                }
                for (int n = 0; n < ilIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl(); ++n) {
                    for (int n2 = 0; n2 < ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll(); ++n2) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, 0).llIllIIIIIllIlIIIIlI(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
                    }
                }
            }
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ca.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(n & 0x7)).llllIIIIlIIIlIlllIll(ca.IIllllIIIlIIIIIIllIl, (n & 0x8) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ca.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ca.IIllllIIIlIIIIIIllIl)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { ca.IIIIIIIIIlllIllIlIlI, ca.IIllllIIIlIIIIIIllIl });
    }
    
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl IllIllIIIIlIIlIlllII() {
        if (this.lllIllIIIllllllIllll == null) {
            this.lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll("   ", "###", "~#~").llllIIIIlIIIlIlllIll('#', net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll((Predicate)net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a))).llllIIIIlIIIlIlllIll('~', net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll((Predicate)net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll))).IlIlIlIlIlllllllllIl();
        }
        return this.lllIllIIIllllllIllll;
    }
    
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl IlIllllIIlIIlIlIlIll() {
        if (this.llIllIlIlIIIIIIIllII == null) {
            this.llIllIlIlIIIIIIIllII = net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll("^^^", "###", "~#~").llllIIIIlIIIlIlllIll('#', net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll((Predicate)net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a))).llllIIIIlIIIlIlllIll('^', ca.IlllIIIIlIIIlIlIlIIl).llllIIIIlIIIlIlllIll('~', net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll((Predicate)net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll))).IlIlIlIlIlllllllllIl();
        }
        return this.llIllIlIlIIIIIIIllII;
    }
    
    static /* synthetic */ int[] IllIllIlllIllllIIllI() {
        final int[] iIlIlIlIIlIllIIIIIIl = ca.IIlIlIlIIlIllIIIIIIl;
        if (iIlIlIlIIlIllIIIIIIl != null) {
            return iIlIlIlIIlIllIIIIIIl;
        }
        final int[] iIlIlIlIIlIllIIIIIIl2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            iIlIlIlIIlIllIIIIIIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iIlIlIlIIlIllIIIIIIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iIlIlIlIIlIllIIIIIIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            iIlIlIlIIlIllIIIIIIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            iIlIlIlIIlIllIIIIIIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            iIlIlIlIIlIllIIIIIIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return ca.IIlIlIlIIlIllIIIIIIl = iIlIlIlIIlIllIIIIIIl2;
    }
}
