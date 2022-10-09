package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import com.mojang.authlib.*;
import java.util.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IllIIlllIIIIlllIIlIl implements IlIllIlIlIIIlIlIlIII
{
    private final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    
    public IllIIlllIIIIlllIIlIl(final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final lllIIIIlIlIllIIlIIIl llIllIlIIIIllIlIIllI = lllIIIIlllllIlIIllIl.llIllIlIIIIllIlIIllI(3);
        if (llIllIlIIIIllIlIIllI != null && llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll() != null) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
            final Minecraft minecraft = Minecraft.getMinecraft();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            if (lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl()) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.2f, 0.0f);
            }
            final boolean b = lllIIIIlllllIlIIllIl instanceof IlIlIllllllllIIIIlII || (lllIIIIlllllIlIIllIl instanceof llIlIIIIIlIIlIlIIlll && ((llIlIIIIIlIIlIlIIlll)lllIIIIlllllIlIIllIl).aq());
            if (!b && lllIIIIlllllIlIIllIl.e_()) {
                final float n8 = 2.0f;
                final float n9 = 1.4f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n9 / n8, n9 / n8, n9 / n8);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 16.0f * n7, 0.0f);
            }
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(0.0625f);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            if (llllIIIIlIIIlIlllIll instanceof IIlllIIIlIlllIIlllII) {
                final float n10 = 0.625f;
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.25f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 1.0f, 0.0f);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n10, -n10, -n10);
                if (b) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.1875f, 0.0f);
                }
                minecraft.lIllIIIIIlllIIlIIllI().llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, llIllIlIIIIllIlIIllI, IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl);
            }
            else if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.ab) {
                final float n11 = 1.1875f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n11, -n11, -n11);
                if (b) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0625f, 0.0f);
                }
                GameProfile gameProfile = null;
                if (llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll()) {
                    final IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = llIllIlIIIIllIlIIllI.llllIIllllIlIlIIIIll();
                    if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("SkullOwner", 10)) {
                        gameProfile = net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIIIllIIllIlllllI("SkullOwner"));
                    }
                    else if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("SkullOwner", 8)) {
                        final String llIIlIIIlIIIllIlIIIl = llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl("SkullOwner");
                        if (!lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl)) {
                            gameProfile = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(new GameProfile((UUID)null, llIIlIIIlIIIllIlIIIl));
                            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll("SkullOwner", net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(), gameProfile));
                        }
                    }
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(-0.5f, 0.0f, -0.5f, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, 180.0f, llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII(), gameProfile, -1);
            }
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return true;
    }
}
