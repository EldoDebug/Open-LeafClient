package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import com.google.common.util.concurrent.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

class lIlIlIIIllIIllIIIllI implements c
{
    final /* synthetic */ llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ String IlIlIlIlIlllllllllIl;
    private final /* synthetic */ String llIllIIIIIllIlIIIIlI;
    
    lIlIlIIIllIIllIIIllI(final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final String llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, Minecraft.getMinecraft());
        if (b) {
            if (this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII() != null) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII().llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll);
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new lIllllllIIllIlIlIlII(this.IlIlIlIlIlllllllllIl, llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl));
            Futures.addCallback(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IIlIlIlIIlIllIIIIIIl().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl), (FutureCallback)new IlIlIIIllIIllIlllllI(this, this.IlIlIlIlIlllllllllIl));
        }
        else {
            if (this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII() != null) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII().llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new lIllllllIIllIlIlIlII(this.IlIlIlIlIlllllllllIl, llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl));
        }
        net.minecraft.client.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII());
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
    }
}
