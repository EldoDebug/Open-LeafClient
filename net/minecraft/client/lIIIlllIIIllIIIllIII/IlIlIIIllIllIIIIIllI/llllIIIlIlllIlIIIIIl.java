package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import java.util.*;
import org.apache.logging.log4j.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.awt.*;
import java.awt.image.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import net.optifine.shaders.*;

public class llllIIIlIlllIlIIIIIl extends llllIIIIlIIIlIlllIll
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    private final List lIIIlllIIIllIIIllIII;
    private final List llIIlIIIlIIIllIlIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public llllIIIlIlllIlIIIIIl(final lIllllIllIllIIllllll ilIlIlIlIlllllllllIl, final List liiIlllIIIllIIIllIII, final List llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IllIIlllIIIIlllIIlIl();
        BufferedImage bufferedImage;
        try {
            final BufferedImage llllIIIIlIIIlIlllIll = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl());
            int type = llllIIIIlIIIlIlllIll.getType();
            if (type == 0) {
                type = 6;
            }
            bufferedImage = new BufferedImage(llllIIIIlIIIlIlllIll.getWidth(), llllIIIIlIIIlIlllIll.getHeight(), type);
            bufferedImage.getGraphics().drawImage(llllIIIIlIIIlIlllIll, 0, 0, null);
            for (int n = 0; n < 17 && n < this.lIIIlllIIIllIIIllIII.size(); ++n) {
                if (n >= this.llIIlIIIlIIIllIlIIIl.size()) {
                    break;
                }
                final String s = this.lIIIlllIIIllIIIllIII.get(n);
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll ilIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl.get(n).IlIlIIIllIllIIIIIllI();
                if (s != null) {
                    final BufferedImage llllIIIIlIIIlIlllIll2 = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s)).IlIlIlIlIlllllllllIl());
                    if (llllIIIIlIIIlIlllIll2.getWidth() == bufferedImage.getWidth() && llllIIIIlIIIlIlllIll2.getHeight() == bufferedImage.getHeight() && llllIIIIlIIIlIlllIll2.getType() == 6) {
                        for (int i = 0; i < llllIIIIlIIIlIlllIll2.getHeight(); ++i) {
                            for (int j = 0; j < llllIIIIlIIIlIlllIll2.getWidth(); ++j) {
                                final int rgb = llllIIIIlIIIlIlllIll2.getRGB(j, i);
                                if ((rgb & 0xFF000000) != 0x0) {
                                    llllIIIIlIIIlIlllIll2.setRGB(j, i, ((rgb & 0xFF0000) << 8 & 0xFF000000) | (llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll.getRGB(j, i), ilIlIIIllIllIIIIIllI.IIIIIIIIIlllIllIlIlI) & 0xFFFFFF));
                                }
                            }
                        }
                        bufferedImage.getGraphics().drawImage(llllIIIIlIIIlIlllIll2, 0, 0, null);
                    }
                }
            }
        }
        catch (IOException ex) {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.error("Couldn't load layered image", (Throwable)ex);
            return;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), bufferedImage, false, false, ilIlIIIllIIllIlllllI, this.IlIlIlIlIlllllllllIl, this.llllIIIlIlllIlIIIIIl());
        }
        else {
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), bufferedImage);
        }
    }
}
