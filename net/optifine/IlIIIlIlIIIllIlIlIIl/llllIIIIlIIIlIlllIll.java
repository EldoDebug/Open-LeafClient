package net.optifine.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.*;

public class llllIIIIlIIIlIlllIll extends Thread
{
    private String llllIIIIlIIIlIlllIll;
    private IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl;
    
    public llllIIIIlIIIlIlllIll(final String llllIIIIlIIIlIlllIll, final IlIlIIIllIIllIlllllI ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void run() {
        try {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, Minecraft.getMinecraft().IlllIIIIlIIIlIlIlIIl()), null);
        }
        catch (Exception ex) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, null, ex);
        }
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
