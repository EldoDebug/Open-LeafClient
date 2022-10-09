package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.mojang.authlib.minecraft.*;
import java.awt.image.*;

class IIIllllllIllIIIlllIl implements IlIIlIlIIIlIIlIlIlII
{
    final /* synthetic */ IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIIlIlIIIlIIlIlIlII IlIlIlIlIlllllllllIl;
    private final /* synthetic */ IIIIIIIIIlllIllIlIlI llIllIIIIIllIlIIIIlI;
    private final /* synthetic */ MinecraftProfileTexture$Type IlIIIlIlIIIllIlIlIIl;
    private final /* synthetic */ lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private final /* synthetic */ MinecraftProfileTexture IllIIlllIIIIlllIIlIl;
    
    IIIllllllIllIIIlllIl(final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll, final IlIIlIlIIIlIIlIlIlII ilIlIlIlIlllllllllIl, final IIIIIIIIIlllIllIlIlI llIllIIIIIllIlIIIIlI, final MinecraftProfileTexture$Type ilIIIlIlIIIllIlIlIIl, final lIllllIllIllIIllllll ilIlIIIllIllIIIIIllI, final MinecraftProfileTexture illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public BufferedImage llllIIIIlIIIlIlllIll(BufferedImage llllIIIIlIIIlIlllIll) {
        if (this.IlIlIlIlIlllllllllIl != null) {
            llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (this.IlIlIlIlIlllllllllIl != null) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        }
        if (this.llIllIIIIIllIlIIIIlI != null) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl);
        }
    }
}
