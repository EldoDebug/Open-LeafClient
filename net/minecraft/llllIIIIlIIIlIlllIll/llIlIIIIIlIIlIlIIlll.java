package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import com.google.common.base.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class llIlIIIIIlIIlIlIIlll extends llllIIIIlIIIlIlllIll
{
    public static final llIllIIIIIllIlIIIIlI IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIIIlIlIIIllIlIlIIl IlllIIIIlIIIlIlIlIIl;
    public static final IlIlIlIlIlllllllllIl lllIllIIIllllllIllll;
    public static final IlIIIlIlIIIllIlIlIIl llIllIlIlIIIIIIIllII;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing", (Predicate)IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("open");
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("hinge", IllIlIIllIllIIlIllII.class);
        lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("powered");
        llIllIlIlIIIIIIIllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("half", IlIIlIlIIIlIIlIlIlII.class);
    }
    
    protected llIlIIIIIlIIlIlIIlll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(ilIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IlllIIIIlIIIlIlIlIIl, IllIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll, false).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII, IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl));
    }
    
    @Override
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll((String.valueOf(this.lIllllllIIllIlIlIlII()) + ".name").replaceAll("tile", "item"));
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llllIIIlIlllIlIIIIIl(IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl));
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return super.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llIIlIIIlIIIllIlIIIl(IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl));
    }
    
    private void llIIlIIIlIIIllIlIIIl(final int n) {
        final float n2 = 0.1875f;
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
        final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl = IllIIlllIIIIlllIIlIl(n);
        final boolean llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl(n);
        final boolean liiIlllIIIllIIIllIII = lIIIlllIIIllIIIllIII(n);
        if (llllIIIlIlllIlIIIIIl) {
            if (illIIlllIIIIlllIIlIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                if (!liiIlllIIIllIIIllIII) {
                    this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n2);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 1.0f - n2, 1.0f, 1.0f, 1.0f);
                }
            }
            else if (illIIlllIIIIlllIIlIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                if (!liiIlllIIIllIIIllIII) {
                    this.llllIIIIlIIIlIlllIll(1.0f - n2, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, n2, 1.0f, 1.0f);
                }
            }
            else if (illIIlllIIIIlllIIlIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                if (!liiIlllIIIllIIIllIII) {
                    this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 1.0f - n2, 1.0f, 1.0f, 1.0f);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n2);
                }
            }
            else if (illIIlllIIIIlllIIlIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
                if (!liiIlllIIIllIIIllIII) {
                    this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, n2, 1.0f, 1.0f);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(1.0f - n2, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
            }
        }
        else if (illIIlllIIIIlllIIlIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, n2, 1.0f, 1.0f);
        }
        else if (illIIlllIIIIlllIIlIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n2);
        }
        else if (illIIlllIIIIlllIIlIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            this.llllIIIIlIIIlIlllIll(1.0f - n2, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        else if (illIIlllIIIIlllIIlIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 1.0f - n2, 1.0f, 1.0f, 1.0f);
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) {
            return true;
        }
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = (ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII) == IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl) ? ilIlIlIlIlllllllllIl : ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.equals(ilIlIlIlIlllllllllIl3) ? ilIlIlIlIlllllllllIl2 : illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3);
        if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() != this) {
            return false;
        }
        ilIlIlIlIlllllllllIl2 = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl2, 2);
        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ((boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl)) ? 1003 : 1006, ilIlIlIlIlllllllllIl, 0);
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = (ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII) == IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl) ? ilIlIlIlIlllllllllIl : ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (ilIlIlIlIlllllllllIl == ilIlIlIlIlllllllllIl3) ? ilIlIlIlIlllllllllIl2 : illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3);
            if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == this && (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl) != b) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl, b), 2);
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, b ? 1003 : 1006, ilIlIlIlIlllllllllIl, 0);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII) == IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2);
            if (ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() != this) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            }
            else if (llllIIIIlIIIlIlllIll != this) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl3, llllIIIIlIIIlIlllIll);
            }
        }
        else {
            boolean b = false;
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
            if (ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI() != this) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
                b = true;
            }
            if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl())) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
                b = true;
                if (ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI() == this) {
                    illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2);
                }
            }
            if (b) {
                if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
                }
            }
            else {
                final boolean b2 = illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII(ilIlIlIlIlllllllllIl) || illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII(llllIIIIlIIIlIlllIll2);
                if ((b2 || llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII()) && llllIIIIlIIIlIlllIll != this && b2 != (boolean)ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll, b2), 2);
                    if (b2 != (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl)) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl, b2), 2);
                        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, b2 ? 1003 : 1006, ilIlIlIlIlllllllllIl, 0);
                    }
                }
            }
        }
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII) == IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) ? null : this.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final e e, final e e2) {
        this.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, e, e2);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 255 && (net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) && super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()));
    }
    
    @Override
    public int IIlIIIIIllIlIIIlIIll() {
        return 1;
    }
    
    public static int IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2);
        final boolean liiiIlIIIIIlllIllIII = lIIIIlIIIIIlllIllIII(llIllIIIIIllIlIIIIlI);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
        final int llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3);
        final int n = liiiIlIIIIIlllIllIII ? llIllIIIIIllIlIIIIlI2 : llIllIIIIIllIlIIIIlI;
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        final int llIllIIIIIllIlIIIIlI3 = ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl4);
        final int n2 = liiiIlIIIIIlllIllIII ? llIllIIIIIllIlIIIIlI : llIllIIIIIllIlIIIIlI3;
        return IlIlIIIllIllIIIIIllI(n) | (liiiIlIIIIIlllIllIII ? 8 : 0) | (((n2 & 0x1) != 0x0) ? 16 : 0) | (((n2 & 0x2) != 0x0) ? 32 : 0);
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IllIllIIIIlIIlIlllII();
    }
    
    private net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IllIllIIIIlIIlIlllII() {
        return (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIllIIllIIIIIIlIIlI : ((this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIllllIlllIIIIll) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIlIllIllIlllIIlll : ((this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIllIIIllllIlllIllI) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIIlIIlIlIlIIIII : ((this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIllIllIlllIIlll) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIIlllllllllllll : ((this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIIlIIlIlIlIIIII) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIIllIlIllIllllI : ((this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIIIIlIIllIIlIlIll : net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIllIIIllllIlllIllI)))));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        if (llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl && llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII) == IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI() == this) {
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl2);
        }
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII) == IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
                llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IlllIIIIlIIIlIlIlIIl, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IlllIIIIlIIIlIlIlIIl)).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll));
            }
        }
        else {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            if (ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() == this) {
                llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIIIIIIIIlllIllIlIlI, ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIIIIIIIIlllIllIlIlI)).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl, ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl));
            }
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return ((n & 0x8) > 0) ? this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IlllIIIIlIIIlIlIlIIl, ((n & 0x1) > 0) ? IllIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl : IllIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll, (n & 0x2) > 0) : this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII, IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(n & 0x3).llllIIIlIlllIlIIIIIl()).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl, (n & 0x4) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final int n = 0;
        int n2;
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII) == IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) {
            n2 = (n | 0x8);
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IlllIIIIlIIIlIlIlIIl) == IllIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl) {
                n2 |= 0x1;
            }
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll)) {
                n2 |= 0x2;
            }
        }
        else {
            n2 = (n | ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIIIIIIIIlllIllIlIlI)).IllIIlllIIIIlllIIlIl().llIllIIIIIllIlIIIIlI());
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl)) {
                n2 |= 0x4;
            }
        }
        return n2;
    }
    
    protected static int IlIlIIIllIllIIIIIllI(final int n) {
        return n & 0x7;
    }
    
    public static boolean IllIIlllIIIIlllIIlIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llllIIIlIlllIlIIIIIl(IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl));
    }
    
    public static lllIllIIIllllllIllll llllIIIlIlllIlIIIIIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return IllIIlllIIIIlllIIlIl(IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl));
    }
    
    public static lllIllIIIllllllIllll IllIIlllIIIIlllIIlIl(final int n) {
        return net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(n & 0x3).llllIIIlIlllIlIIIIIl();
    }
    
    protected static boolean llllIIIlIlllIlIIIIIl(final int n) {
        return (n & 0x4) != 0x0;
    }
    
    protected static boolean lIIIIlIIIIIlllIllIII(final int n) {
        return (n & 0x8) != 0x0;
    }
    
    protected static boolean lIIIlllIIIllIIIllIII(final int n) {
        return (n & 0x10) != 0x0;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII, llIlIIIIIlIIlIlIIlll.IIIIIIIIIlllIllIlIlI, llIlIIIIIlIIlIlIIlll.IIllllIIIlIIIIIIllIl, llIlIIIIIlIIlIlIIlll.IlllIIIIlIIIlIlIlIIl, llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll });
    }
}
