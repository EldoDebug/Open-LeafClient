package net.minecraft.client.lIIIlllIIIllIIIllIII;

import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.*;
import java.nio.*;

public class llIIIlIlIllIIlIlIlII
{
    public static synchronized int llllIIIIlIIIlIlllIll(final int n) {
        final int glGenLists = GL11.glGenLists(n);
        if (glGenLists == 0) {
            final int glGetError = GL11.glGetError();
            String gluErrorString = "No error code reported";
            if (glGetError != 0) {
                gluErrorString = GLU.gluErrorString(glGetError);
            }
            throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + n + ", GL error (" + glGetError + "): " + gluErrorString);
        }
        return glGenLists;
    }
    
    public static synchronized void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        GL11.glDeleteLists(n, n2);
    }
    
    public static synchronized void IlIlIlIlIlllllllllIl(final int n) {
        GL11.glDeleteLists(n, 1);
    }
    
    public static synchronized ByteBuffer llIllIIIIIllIlIIIIlI(final int n) {
        return ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
    }
    
    public static IntBuffer IlIIIlIlIIIllIlIlIIl(final int n) {
        return llIllIIIIIllIlIIIIlI(n << 2).asIntBuffer();
    }
    
    public static FloatBuffer IlIlIIIllIllIIIIIllI(final int n) {
        return llIllIIIIIllIlIIIIlI(n << 2).asFloatBuffer();
    }
}
