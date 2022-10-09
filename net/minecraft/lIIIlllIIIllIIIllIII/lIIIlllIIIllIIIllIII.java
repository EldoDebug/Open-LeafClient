package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import com.mojang.authlib.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

class lIIIlllIIIllIIIllIII extends llllIIIIlIIIlIlllIll
{
    private boolean IlIlIlIlIlllllllllIl;
    
    lIIIlllIIIllIIIllIII() {
        this.IlIlIlIlIlllllllllIl = true;
    }
    
    @Override
    protected lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI2 = IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl());
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI2);
        final ca ai = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ai;
        if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2) && ai.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, lllIIIIlIlIllIIlIIIl)) {
            if (!llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ai.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ca.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl), 3);
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                if (llllIIIIlIIIlIlllIll3 instanceof llllllIllIllIlIllllI) {
                    if (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == 3) {
                        GameProfile llllIIIIlIIIlIlllIll4 = null;
                        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
                            final IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
                            if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("SkullOwner", 10)) {
                                llllIIIIlIIIlIlllIll4 = IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIIIllIIllIlllllI("SkullOwner"));
                            }
                            else if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("SkullOwner", 8)) {
                                final String llIIlIIIlIIIllIlIIIl = llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl("SkullOwner");
                                if (!lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl)) {
                                    llllIIIIlIIIlIlllIll4 = new GameProfile((UUID)null, llIIlIIIlIIIllIlIIIl);
                                }
                            }
                        }
                        ((llllllIllIllIlIllllI)llllIIIIlIIIlIlllIll3).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4);
                    }
                    else {
                        ((llllllIllIllIlIllllI)llllIIIIlIIIlIlllIll3).llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
                    }
                    ((llllllIllIllIlIllllI)llllIIIIlIIIlIlllIll3).IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI2.IlIlIIIllIllIIIIIllI().llIllIIIIIllIlIIIIlI() * 4);
                    net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ai.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, (llllllIllIllIlIllllI)llllIIIIlIIIlIlllIll3);
                }
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
        }
        else {
            this.IlIlIlIlIlllllllllIl = false;
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        if (this.IlIlIlIlIlllllllllIl) {
            ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(1000, ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(), 0);
        }
        else {
            ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(1001, ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(), 0);
        }
    }
}
