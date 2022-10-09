package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import com.mojang.authlib.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lllIlIIIIIlIlllllIlI extends IlIIIlIlIIIllIlIlIIl
{
    private static final String[] llllIIIlIlllIlIIIIIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new String[] { "skeleton", "wither", "zombie", "char", "creeper" };
    }
    
    public lllIlIIIIIlIlllllIlI() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl(0);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
            return false;
        }
        if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2)) {
            if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl()) {
                return false;
            }
            llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        }
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        if (!net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ai.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2)) {
            return false;
        }
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ai.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ca.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll), 3);
            int n4 = 0;
            if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
                n4 = (llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll * 16.0f / 360.0f + 0.5) & 0xF);
            }
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            if (llllIIIIlIIIlIlllIll3 instanceof llllllIllIllIlIllllI) {
                final llllllIllIllIlIllllI llllllIllIllIlIllllI = (llllllIllIllIlIllllI)llllIIIIlIIIlIlllIll3;
                if (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == 3) {
                    GameProfile llllIIIIlIIIlIlllIll4 = null;
                    if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
                        final IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
                        if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("SkullOwner", 10)) {
                            llllIIIIlIIIlIlllIll4 = IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIIIllIIllIlllllI("SkullOwner"));
                        }
                        else if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("SkullOwner", 8) && llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl("SkullOwner").length() > 0) {
                            llllIIIIlIIIlIlllIll4 = new GameProfile((UUID)null, llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl("SkullOwner"));
                        }
                    }
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4);
                }
                else {
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
                }
                llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(n4);
                net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ai.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, llllllIllIllIlIllllI);
            }
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        }
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        for (int i = 0; i < lllIlIIIIIlIlllllIlI.llllIIIlIlllIlIIIIIl.length; ++i) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, i));
        }
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return n;
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        int liiiIlIIIIIlllIllIII = lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
        if (liiiIlIIIIIlllIllIII < 0 || liiiIlIIIIIlllIllIII >= lllIlIIIIIlIlllllIlI.llllIIIlIlllIlIIIIIl.length) {
            liiiIlIIIIIlllIllIII = 0;
        }
        return String.valueOf(super.lIIIIlIIIIIlllIllIII()) + "." + lllIlIIIIIlIlllllIlI.llllIIIlIlllIlIIIIIl[liiiIlIIIIIlllIllIII];
    }
    
    @Override
    public String llllIIIlIlllIlIIIIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == 3 && lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
            if (lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl("SkullOwner", 8)) {
                return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.skull.player.name", lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llIIlIIIlIIIllIlIIIl("SkullOwner"));
            }
            if (lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl("SkullOwner", 10)) {
                final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("SkullOwner");
                if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("Name", 8)) {
                    return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.skull.player.name", ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl("Name"));
                }
            }
        }
        return super.llllIIIlIlllIlIIIIIl(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("SkullOwner", 8) && iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("SkullOwner").length() > 0) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SkullOwner", IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(), llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(new GameProfile((UUID)null, iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("SkullOwner")))));
            return true;
        }
        return false;
    }
}
