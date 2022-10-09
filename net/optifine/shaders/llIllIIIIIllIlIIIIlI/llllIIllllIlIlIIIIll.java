package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import java.nio.*;
import org.lwjgl.opengl.*;

public class llllIIllllIlIlIIIIll extends IIIIlllIIIIIIlIIIlll
{
    private boolean llllIIIIlIIIlIlllIll;
    private FloatBuffer IlIlIlIlIlllllllllIl;
    
    public llllIIllllIlIlIIIIll(final String s) {
        super(s);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llllIIIIlIIIlIlllIll, final FloatBuffer ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
        if (ilIlIIIllIllIIIIIllI >= 0) {
            ARBShaderObjects.glUniformMatrix4ARB(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
            this.lIIIlllIIIllIIIllIII();
        }
    }
    
    public float llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (this.IlIlIlIlIlllllllllIl == null) {
            return 0.0f;
        }
        return this.IlIlIlIlIlllllllllIl.get(this.llllIIIIlIIIlIlllIll ? (n2 * 4 + n) : (n * 4 + n2));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n) {
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
        this.IlIlIlIlIlllllllllIl = null;
    }
}
