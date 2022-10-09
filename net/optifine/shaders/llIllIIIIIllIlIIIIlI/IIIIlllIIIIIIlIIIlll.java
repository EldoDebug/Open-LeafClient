package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import java.util.*;
import org.lwjgl.opengl.*;
import net.optifine.shaders.*;

public abstract class IIIIlllIIIIIIlIIIlll
{
    private String llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int[] llIllIIIIIllIlIIIIlI;
    private static final int IlIIIlIlIIIllIlIlIIl = -1;
    private static final int IlIlIIIllIllIIIIIllI = Integer.MIN_VALUE;
    
    public IIIIlllIIIIIIlIIIlll(final String llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = new int[] { -1 };
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int ilIlIlIlIlllllllllIl) {
        if (this.IlIlIlIlIlllllllllIl != ilIlIlIlIlllllllllIl) {
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            this.llllIIIIlIIIlIlllIll();
            this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
    }
    
    private void llllIIIIlIIIlIlllIll() {
        if (this.IlIlIlIlIlllllllllIl >= this.llIllIIIIIllIlIIIIlI.length) {
            final int[] llIllIIIIIllIlIIIIlI = new int[this.IlIlIlIlIlllllllllIl * 2];
            Arrays.fill(llIllIIIIIllIlIIIIlI, Integer.MIN_VALUE);
            System.arraycopy(this.llIllIIIIIllIlIIIIlI, 0, llIllIIIIIllIlIIIIlI, 0, this.llIllIIIIIllIlIIIIlI.length);
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
    }
    
    protected abstract void llllIIIIlIIIlIlllIll(final int p0);
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        if (this.IlIlIlIlIlllllllllIl <= 0) {
            return -1;
        }
        int glGetUniformLocationARB = this.llIllIIIIIllIlIIIIlI[this.IlIlIlIlIlllllllllIl];
        if (glGetUniformLocationARB == Integer.MIN_VALUE) {
            glGetUniformLocationARB = ARBShaderObjects.glGetUniformLocationARB(this.IlIlIlIlIlllllllllIl, (CharSequence)this.llllIIIIlIIIlIlllIll);
            this.llIllIIIIIllIlIIIIlI[this.IlIlIlIlIlllllllllIl] = glGetUniformLocationARB;
        }
        return glGetUniformLocationARB;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI() >= 0;
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        this.llIllIIIIIllIlIIIIlI[this.IlIlIlIlIlllllllllIl] = -1;
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = new int[] { -1 };
        this.IlIlIlIlIlllllllllIl();
    }
    
    protected abstract void IlIlIlIlIlllllllllIl();
    
    protected void lIIIlllIIIllIIIllIII() {
        if (llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl(this.llllIIIIlIIIlIlllIll) != 0) {
            this.llllIIIlIlllIlIIIIIl();
        }
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
