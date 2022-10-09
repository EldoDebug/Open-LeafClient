package net.optifine.shaders;

import org.lwjgl.opengl.*;
import org.lwjgl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.nio.*;

public class llIIlIIIlIIIllIlIIIl implements llIllIlIIIIllIlIIllI
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public llIIlIIIlIIIllIlIIIl(final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll = GL11.glGenTextures();
        this.IlIlIlIlIlllllllllIl = 15;
        final byte[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n, n2);
        final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(llllIIIIlIIIlIlllIll.length);
        byteBuffer.put(llllIIIIlIIIlIlllIll);
        byteBuffer.flip();
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.llllIIIIlIIIlIlllIll);
        GL11.glTexImage2D(3553, 0, 6407, n, n2, 0, 6407, 5121, byteBuffer);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10241, 9729);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII(this.llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll = 0;
    }
    
    private int llllIIIIlIIIlIlllIll(int n) {
        n ^= n << 13;
        n ^= n >> 17;
        n ^= n << 5;
        return n;
    }
    
    private byte llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return (byte)(this.llllIIIIlIIIlIlllIll((this.llllIIIIlIIIlIlllIll(n) + this.llllIIIIlIIIlIlllIll(n2 * 19)) * this.llllIIIIlIIIlIlllIll(n3 * 23) - n3) % 128);
    }
    
    private byte[] llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final byte[] array = new byte[n * n2 * 3];
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 1; k < 4; ++k) {
                    array[n3++] = this.llllIIIIlIIIlIlllIll(j, i, k);
                }
            }
        }
        return array;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return 3553;
    }
}
