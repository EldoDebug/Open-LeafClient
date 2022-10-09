package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.*;
import org.apache.commons.lang3.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import com.mojang.authlib.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IlIlIIIIIIlllIlIllIl implements llllIIIIlIIIlIlllIll
{
    private boolean IlIlIlIlIlllllllllIl;
    final /* synthetic */ lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IIlllIIlIllIllIlIIll llIllIIIIIllIlIIIIlI;
    private final /* synthetic */ net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll IlIIIlIlIIIllIlIlIIl;
    private final /* synthetic */ String IlIlIIIllIllIIIIIllI;
    
    IlIlIIIIIIlllIlIllIl(final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll, final IIlllIIlIllIllIlIIll llIllIIIIIllIlIIIIlI, final net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll ilIIIlIlIIIllIlIlIIl, final String ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl = false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IIIIIIIIIlllIllIlIlI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl() != null) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = String.valueOf(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl());
            if (ArrayUtils.isNotEmpty((Object[])llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI())) {
                final StringBuilder sb = new StringBuilder();
                GameProfile[] llIllIIIIIllIlIIIIlI;
                for (int length = (llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI()).length, i = 0; i < length; ++i) {
                    final GameProfile gameProfile = llIllIIIIIllIlIIIIlI[i];
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(gameProfile.getName());
                }
                if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI().length < llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl()) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append("... and ").append(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl() - llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI().length).append(" more ...");
                }
                this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI = sb.toString();
            }
        }
        else {
            this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI = "";
        }
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(net.minecraft.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()));
        this.IlIlIlIlIlllllllllIl = true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl("Finished"));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        if (!this.IlIlIlIlIlllllllllIl) {
            lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll.error("Can't ping " + this.IlIlIIIllIllIIIIIllI + ": " + llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII());
        }
    }
}
