package net.optifine.shaders;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class IlIlIIIllIllIIIIIllI implements llIllIlIIIIllIlIIllI
{
    private int IlIIIlIlIIIllIlIlIIl;
    private lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private IlIIIlIlIIIllIlIlIIl llllIIIlIlllIlIIIIIl;
    public static final int llllIIIIlIIIlIlllIll = 0;
    public static final int IlIlIlIlIlllllllllIl = 1;
    public static final int llIllIIIIIllIlIIIIlI = 2;
    
    public IlIlIIIllIllIIIIIllI(final int ilIIIlIlIIIllIlIlIIl, final lIllllIllIllIIllllll ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IllIIlllIIIIlllIIlIl = 0;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl() {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            final IIlllIIlIllIllIlIIll lllIllIIIllllllIllll = Minecraft.getMinecraft().lllIllIIIllllllIllll();
            this.llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI);
            if (this.llllIIIlIlllIlIIIIIl == null) {
                this.llllIIIlIlllIlIIIIIl = new lIIIlllIIIllIIIllIII(this.IlIlIIIllIllIIIIIllI);
                lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, this.llllIIIlIlllIlIIIIIl);
                this.llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI);
            }
        }
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
        if (this.IllIIlllIIIIlllIIlIl != 0 && ilIlIlIlIlllllllllIl instanceof llllIIIIlIIIlIlllIll) {
            final llllIIllllIlIlIIIIll liiiIlIIIIIlllIllIII = ((llllIIIIlIIIlIlllIll)ilIlIlIlIlllllllllIl).lIIIIlIIIIIlllIllIII;
            if (liiiIlIIIIIlllIllIII != null) {
                if (this.IllIIlllIIIIlllIIlIl == 1) {
                    return liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl;
                }
                if (this.IllIIlllIIIIlllIIlIl == 2) {
                    return liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI;
                }
            }
        }
        return ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return 3553;
    }
    
    @Override
    public String toString() {
        return "textureUnit: " + this.IlIIIlIlIIIllIlIlIIl + ", location: " + this.IlIlIIIllIllIIIIIllI + ", glTextureId: " + ((this.llllIIIlIlllIlIIIIIl != null) ? Integer.valueOf(this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()) : "");
    }
}
