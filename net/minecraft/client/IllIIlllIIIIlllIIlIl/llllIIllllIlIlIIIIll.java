package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.mojang.authlib.minecraft.*;

class llllIIllllIlIlIIIIll implements IIIIIIIIIlllIllIlIlI
{
    final /* synthetic */ IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
    private static volatile /* synthetic */ int[] IlIlIlIlIlllllllllIl;
    
    llllIIllllIlIlIIIIll(final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final MinecraftProfileTexture$Type minecraftProfileTexture$Type, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final MinecraftProfileTexture minecraftProfileTexture) {
        switch (llllIIIIlIIIlIlllIll()[minecraftProfileTexture$Type.ordinal()]) {
            case 1: {
                IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, lIllllIllIllIIllllll);
                IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, minecraftProfileTexture.getMetadata("model"));
                if (this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl == null) {
                    IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, "default");
                    break;
                }
                break;
            }
            case 2: {
                IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, lIllllIllIllIIllllll);
                break;
            }
        }
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] ilIlIlIlIlllllllllIl = llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        final int[] ilIlIlIlIlllllllllIl2 = new int[MinecraftProfileTexture$Type.values().length];
        try {
            ilIlIlIlIlllllllllIl2[MinecraftProfileTexture$Type.CAPE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIlIlIlllllllllIl2[MinecraftProfileTexture$Type.SKIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        return llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
    }
}
