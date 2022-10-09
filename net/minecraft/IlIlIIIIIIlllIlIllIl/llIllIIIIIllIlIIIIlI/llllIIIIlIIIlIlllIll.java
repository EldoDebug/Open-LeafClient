package net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llllIIIIlIIIlIlllIll implements net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll
{
    private final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private final IIlllIIlIllIllIlIIll IlIlIlIlIlllllllllIl;
    private static volatile /* synthetic */ int[] llIllIIIIIllIlIIIIlI;
    
    public llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IIlllIIlIllIllIlIIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        switch (llllIIIIlIIIlIlllIll()[llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 4: {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
                if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() > 47) {
                    final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl("Outdated server! I'm still on 1.8.9");
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl));
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl);
                    break;
                }
                if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() < 47) {
                    final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2 = new IlIlIIIIIIlllIlIllIl("Outdated client! Please use 1.8.9");
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl2));
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl2);
                    break;
                }
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl));
                break;
            }
            case 3: {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI != null) {
            return llIllIIIIIllIlIIIIlI;
        }
        final int[] llIllIIIIIllIlIIIIlI2 = new int[net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.values().length];
        try {
            llIllIIIIIllIlIIIIlI2[net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIIIIIllIlIIIIlI2[net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIllIIIIIllIlIIIIlI2[net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIllIIIIIllIlIIIIlI2[net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
}
