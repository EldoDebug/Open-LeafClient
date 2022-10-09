package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import java.awt.image.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class IlIlIlIlIlllllllllIl extends llllIIIIlIIIlIlllIll
{
    private final int[] llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int lIIIlllIIIllIIIllIII;
    
    public IlIlIlIlIlllllllllIl(final BufferedImage bufferedImage) {
        this(bufferedImage.getWidth(), bufferedImage.getHeight());
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.llllIIIIlIIIlIlllIll, 0, bufferedImage.getWidth());
        this.IlIlIlIlIlllllllllIl();
    }
    
    public IlIlIlIlIlllllllllIl(final int ilIlIlIlIlllllllllIl, final int liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llllIIIIlIIIlIlllIll = new int[ilIlIlIlIlllllllllIl * liiIlllIIIllIIIllIII];
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), ilIlIlIlIlllllllllIl, liiIlllIIIllIIIllIII);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
    }
    
    public void IlIlIlIlIlllllllllIl() {
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.lIIIlllIIIllIIIllIII);
    }
    
    public int[] llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
