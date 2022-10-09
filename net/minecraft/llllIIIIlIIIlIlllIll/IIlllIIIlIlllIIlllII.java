package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIlllIIIlIlllIIlllII extends llllIIIIlIIIlIlllIll
{
    public static final IllIIlllIIIIlllIIlIl IIIIIIIIIlllIllIlIlI;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("level", 0, 3);
    }
    
    public IIlllIIIlIlllIIlllII() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI, 0));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.3125f, 1.0f);
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        final float n = 0.125f;
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, n, 1.0f, 1.0f);
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n);
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll(1.0f - n, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 1.0f - n, 1.0f, 1.0f, 1.0f);
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        this.IlIlIllllllllIIIIlII();
    }
    
    @Override
    public void IlIlIllllllllIIIIlII() {
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
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
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI);
        final float n = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + (6.0f + 3 * intValue) / 16.0f;
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && llIllIIIIIllIlIIIIlI.lIIIIIlIlIIIlIIIIlIl() && intValue > 0 && llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl <= n) {
            llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII();
            this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, intValue - 1);
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl == null) {
            return true;
        }
        final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI);
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll2 == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIIIIIlIIlllIlIl) {
            if (intValue < 3) {
                if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                    llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllllIIlIlIllIIIllII));
                }
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIIllllllIllIIIlllIl);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 3);
            }
            return true;
        }
        if (llllIIIIlIIIlIlllIll2 == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.E) {
            if (intValue > 0) {
                if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D, 1, 0);
                    if (!llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl)) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, lllIIIIlIlIllIIlIIIl));
                    }
                    else if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl) {
                        ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI);
                    }
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIIlIIIllllIlIlIlI);
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = ilIIIlIlIIIllIlIlIIl;
                    --lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl;
                    if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl <= 0) {
                        llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
                    }
                }
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, intValue - 1);
            }
            return true;
        }
        if (intValue > 0 && llllIIIIlIIIlIlllIll2 instanceof IIIlIIlIIIIlllIlllII) {
            final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)llllIIIIlIIIlIlllIll2;
            if (iiIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl() == net.minecraft.llIllIlIIIIllIlIIllI.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll && iiIlIIlIIIIlllIlllII.llIllIlIIIIllIlIIllI(ilIIIlIlIIIllIlIlIIl)) {
                iiIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI(ilIIIlIlIIIllIlIlIIl);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, intValue - 1);
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIIIIllIIIIlIIIIllIl);
                return true;
            }
        }
        if (intValue > 0 && llllIIIIlIIIlIlllIll2 instanceof lIllllllIIllIlIlIlII && net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl) > 0) {
            final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl2 = ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl();
            llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl = 1;
            net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(llIIlIIIlIIIllIlIIIl2);
            if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl <= 1 && !llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, llIIlIIIlIIIllIlIIIl2);
            }
            else {
                if (!llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl2)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, llIIlIIIlIIIllIlIIIl2));
                }
                else if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl) {
                    ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI);
                }
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIIIIIIIIlllIllIlIlI);
                if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl3 = ilIIIlIlIIIllIlIlIIl;
                    --lllIIIIlIlIllIIlIIIl3.IlIlIlIlIlllllllllIl;
                }
            }
            if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, intValue - 1);
            }
            return true;
        }
        return false;
    }
    
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n, 0, 3)), 2);
        illlllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl, this);
    }
    
    @Override
    public void llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(20) == 1) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            if ((int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI) < 3) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI), 2);
            }
        }
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.K;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.K;
    }
    
    @Override
    public boolean IIIIIIIIIlllIllIlIlI() {
        return true;
    }
    
    @Override
    public int lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (int)illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI, n);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI });
    }
}
