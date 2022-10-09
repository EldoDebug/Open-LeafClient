package net.optifine.shaders;

import net.optifine.llIIlIIIlIIIllIlIIIl.*;
import java.nio.*;
import org.lwjgl.opengl.*;

public class IllIIlllIIIIlllIIlIl implements llIllIlIIIIllIlIIllI
{
    private IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private static volatile /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl;
    
    public IllIIlllIIIIlllIIlIl(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final int n, final int n2, final int n3, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final ByteBuffer byteBuffer, final int ilIlIlIlIlllllllllIl2, final boolean b, final boolean b2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
        this.llIllIIIIIllIlIIIIlI = GL11.glGenTextures();
        GL11.glBindTexture(this.IllIIlllIIIIlllIIlIl(), this.llIllIIIIIllIlIIIIlI);
        final int n4 = b2 ? 33071 : 10497;
        final int n5 = b ? 9729 : 9728;
        switch (IlIlIlIlIlllllllllIl()[llllIIIIlIIIlIlllIll.ordinal()]) {
            case 1: {
                GL11.glTexImage1D(3552, 0, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), n, 0, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), byteBuffer);
                GL11.glTexParameteri(3552, 10242, n4);
                GL11.glTexParameteri(3552, 10240, n5);
                GL11.glTexParameteri(3552, 10241, n5);
                break;
            }
            case 2: {
                GL11.glTexImage2D(3553, 0, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), n, n2, 0, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), byteBuffer);
                GL11.glTexParameteri(3553, 10242, n4);
                GL11.glTexParameteri(3553, 10243, n4);
                GL11.glTexParameteri(3553, 10240, n5);
                GL11.glTexParameteri(3553, 10241, n5);
                break;
            }
            case 3: {
                GL12.glTexImage3D(32879, 0, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), n, n2, n3, 0, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), byteBuffer);
                GL11.glTexParameteri(32879, 10242, n4);
                GL11.glTexParameteri(32879, 10243, n4);
                GL11.glTexParameteri(32879, 32882, n4);
                GL11.glTexParameteri(32879, 10240, n5);
                GL11.glTexParameteri(32879, 10241, n5);
                break;
            }
            case 4: {
                GL11.glTexImage2D(34037, 0, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), n, n2, 0, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), byteBuffer);
                GL11.glTexParameteri(34037, 10242, n4);
                GL11.glTexParameteri(34037, 10243, n4);
                GL11.glTexParameteri(34037, 10240, n5);
                GL11.glTexParameteri(34037, 10241, n5);
                break;
            }
        }
        GL11.glBindTexture(this.IllIIlllIIIIlllIIlIl(), 0);
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        if (this.llIllIIIIIllIlIIIIlI > 0) {
            GL11.glDeleteTextures(this.llIllIIIIIllIlIIIIlI);
            this.llIllIIIIIllIlIIIIlI = 0;
        }
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] ilIIIlIlIIIllIlIlIIl = IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl;
        if (ilIIIlIlIIIllIlIlIIl != null) {
            return ilIIIlIlIIIllIlIlIIl;
        }
        final int[] ilIIIlIlIIIllIlIlIIl2 = new int[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.values().length];
        try {
            ilIIIlIlIIIllIlIlIIl2[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
    }
}
