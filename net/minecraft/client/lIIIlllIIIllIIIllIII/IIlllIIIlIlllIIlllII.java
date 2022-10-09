package net.minecraft.client.lIIIlllIIIllIIIllIII;

import org.lwjgl.opengl.*;

class IIlllIIIlIlllIIlllII
{
    private final int llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    public IIlllIIIlIlllIIlllII(final int llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = false;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll(false);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl != this.IlIlIlIlIlllllllllIl) {
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            if (ilIlIlIlIlllllllllIl) {
                GL11.glEnable(this.llllIIIIlIIIlIlllIll);
            }
            else {
                GL11.glDisable(this.llllIIIIlIIIlIlllIll);
            }
        }
    }
}
