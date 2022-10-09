package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import com.mojang.authlib.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class llIllIlIIIIllIlIIllI
{
    public static llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll;
    private IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl;
    private IlIlIIIllIIllIlllllI llIllIIIIIllIlIIIIlI;
    private IlIlIIIlIIlIlIIlllIl IlIIIlIlIIIllIlIlIIl;
    private lIIIIlIIIIIlllIllIII IlIlIIIllIllIIIIIllI;
    private llllllIllIllIlIllllI IllIIlllIIIIlllIIlIl;
    
    static {
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll = new llIllIlIIIIllIlIIllI();
    }
    
    public llIllIlIIIIllIlIIllI() {
        this.IlIlIlIlIlllllllllIl = new IlIlIIIllIIllIlllllI(0);
        this.llIllIIIIIllIlIIIIlI = new IlIlIIIllIIllIlllllI(1);
        this.IlIIIlIlIIIllIlIlIIl = new IlIlIIIlIIlIlIIlllIl();
        this.IlIlIIIllIllIIIIIllI = new lIIIIlIIIIIlllIllIII();
        this.IllIIlllIIIIlllIIlIl = new llllllIllIllIlIllllI();
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.aI) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
            IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, 0.0, 0.0, 0.0, 0.0f);
        }
        else if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ab) {
            GameProfile gameProfile = null;
            if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
                if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("SkullOwner", 10)) {
                    gameProfile = IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIIIllIIllIlllllI("SkullOwner"));
                }
                else if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("SkullOwner", 8) && llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl("SkullOwner").length() > 0) {
                    gameProfile = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(new GameProfile((UUID)null, llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl("SkullOwner")));
                    llllIIllllIlIlIIIIll.llllIIllllIlIlIIIIll("SkullOwner");
                    llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll("SkullOwner", IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll(), gameProfile));
                }
            }
            if (IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll != null) {
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, 0.0f, -0.5f);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(2.0f, 2.0f, 2.0f);
                lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
                IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, 0.0f, lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII(), gameProfile, -1);
                lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
        }
        else {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll());
            if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.U) {
                IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, 0.0, 0.0, 0.0, 0.0f);
            }
            else if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ak) {
                IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, 0.0, 0.0, 0.0, 0.0f);
            }
            else {
                IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 0.0, 0.0, 0.0, 0.0f);
            }
        }
    }
}
