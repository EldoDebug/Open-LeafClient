package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.opengl.*;
import net.optifine.shaders.*;

public abstract class llllIIIIlIIIlIlllIll implements IlIIIlIlIIIllIlIlIIl
{
    protected int llIllIIIIIllIlIIIIlI;
    protected boolean IlIIIlIlIIIllIlIlIIl;
    protected boolean IlIlIIIllIllIIIIIllI;
    protected boolean IllIIlllIIIIlllIIlIl;
    protected boolean llllIIIlIlllIlIIIIIl;
    public llllIIllllIlIlIIIIll lIIIIlIIIIIlllIllIII;
    
    public llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = -1;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIIIlIlIIIllIlIlIIl, final boolean ilIlIIIllIllIIIIIllI) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        int n;
        int n2;
        if (ilIIIlIlIIIllIlIlIIl) {
            n = (ilIlIIIllIllIIIIIllI ? 9987 : 9729);
            n2 = 9729;
        }
        else {
            n = (ilIlIIIllIllIIIIIllI ? 9986 : 9728);
            n2 = 9728;
        }
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.llllIIIIlIIIlIlllIll());
        GL11.glTexParameteri(3553, 10241, n);
        GL11.glTexParameteri(3553, 10240, n2);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final boolean b, final boolean b2) {
        this.IllIIlllIIIIlllIIlIl = this.IlIIIlIlIIIllIlIlIIl;
        this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll(b, b2);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        if (this.llIllIIIIIllIlIIIIlI == -1) {
            this.llIllIIIIIllIlIIIIlI = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll();
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this, this.llIllIIIIIllIlIIIIlI);
        if (this.llIllIIIIIllIlIIIIlI != -1) {
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
            this.llIllIIIIIllIlIIIIlI = -1;
        }
    }
    
    @Override
    public llllIIllllIlIlIIIIll llllIIIlIlllIlIIIIIl() {
        return IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this);
    }
}
