package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIIIIIlIIllIIlIlIll implements IIlIIIIIllIlIIIlIIll
{
    public IllllIIlIlIllIIIllII llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    public String IlIlIIIllIllIIIIIllI;
    private static volatile /* synthetic */ int[] IllIIlllIIIIlllIIlIl;
    
    public IlIIIIIlIIllIIlIlIll() {
    }
    
    public IlIIIIIlIIllIIlIlIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final IllllIIlIlIllIIIllII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        final lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI = llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI();
        switch (llllIIIIlIIIlIlllIll()[llllIIIIlIIIlIlllIll.ordinal()]) {
            case 2: {
                this.IlIIIlIlIIIllIlIlIIl = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl();
                this.llIllIIIIIllIlIIIIlI = ((llIllIIIIIllIlIIIIlI == null) ? -1 : llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl());
                break;
            }
            case 3: {
                this.IlIlIlIlIlllllllllIl = llIIIlIlIllIIlIlIlII.IllIIlllIIIIlllIIlIl().IlllIIIIlIIIlIlIlIIl();
                this.llIllIIIIIllIlIIIIlI = ((llIllIIIIIllIlIIIIlI == null) ? -1 : llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl());
                this.IlIlIIIllIllIIIIIllI = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl().lIIIIlIIIIIlllIllIII();
                break;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = (IllllIIlIlIllIIIllII)llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(IllllIIlIlIllIIIllII.class);
        if (this.llllIIIIlIIIlIlllIll == IllllIIlIlIllIIIllII.IlIlIlIlIlllllllllIl) {
            this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
            this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readInt();
        }
        else if (this.llllIIIIlIIIlIlllIll == IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI) {
            this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
            this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readInt();
            this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        if (this.llllIIIIlIIIlIlllIll == IllllIIlIlIllIIIllII.IlIlIlIlIlllllllllIl) {
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl);
            llllllIllIllIlIllllI.writeInt(this.llIllIIIIIllIlIIIIlI);
        }
        else if (this.llllIIIIlIIIlIlllIll == IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI) {
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
            llllllIllIllIlIllllI.writeInt(this.llIllIIIIIllIlIIIIlI);
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] illIIlllIIIIlllIIlIl = IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl;
        if (illIIlllIIIIlllIIlIl != null) {
            return illIIlllIIIIlllIIlIl;
        }
        final int[] illIIlllIIIIlllIIlIl2 = new int[IllllIIlIlIllIIIllII.values().length];
        try {
            illIIlllIIIIlllIIlIl2[IllllIIlIlIllIIIllII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illIIlllIIIIlllIIlIl2[IllllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illIIlllIIIIlllIIlIl2[IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
    }
}
