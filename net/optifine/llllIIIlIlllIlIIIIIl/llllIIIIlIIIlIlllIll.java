package net.optifine.llllIIIlIlllIlIIIIIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.awt.image.*;

public class llllIIIIlIIIlIlllIll extends IllIlIIllIllIIlIllII
{
    private net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    
    public llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lIllllIllIllIIllllll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public BufferedImage llllIIIIlIIIlIlllIll(final BufferedImage bufferedImage) {
        final BufferedImage llllIIIIlIIIlIlllIll = net.optifine.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(bufferedImage);
        this.llIllIIIIIllIlIIIIlI = net.optifine.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(bufferedImage, llllIIIIlIIIlIlllIll);
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        }
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = null;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
