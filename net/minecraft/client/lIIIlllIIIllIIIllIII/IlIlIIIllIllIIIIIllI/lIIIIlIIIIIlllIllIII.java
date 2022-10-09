package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import net.optifine.shaders.*;
import java.util.*;

public class lIIIIlIIIIIlllIllIII extends llllIIIIlIIIlIlllIll
{
    private static final Logger IlIlIlIlIlllllllllIl;
    public final List llllIIIIlIIIlIlllIll;
    private lIllllIllIllIIllllll lIIIlllIIIllIIIllIII;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public lIIIIlIIIIIlllIllIII(final String... array) {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList((Object[])array);
        if (array.length > 0 && array[0] != null) {
            this.lIIIlllIIIllIIIllIII = new lIllllIllIllIIllllll(array[0]);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IllIIlllIIIIlllIIlIl();
        BufferedImage bufferedImage = null;
        try {
            for (final String s : this.llllIIIIlIIIlIlllIll) {
                if (s != null) {
                    final BufferedImage llllIIIIlIIIlIlllIll = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s)).IlIlIlIlIlllllllllIl());
                    if (bufferedImage == null) {
                        bufferedImage = new BufferedImage(llllIIIIlIIIlIlllIll.getWidth(), llllIIIIlIIIlIlllIll.getHeight(), 2);
                    }
                    bufferedImage.getGraphics().drawImage(llllIIIIlIIIlIlllIll, 0, 0, null);
                }
            }
        }
        catch (IOException ex) {
            lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.error("Couldn't load layered image", (Throwable)ex);
            return;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), bufferedImage, false, false, ilIlIIIllIIllIlllllI, this.lIIIlllIIIllIIIllIII, this.llllIIIlIlllIlIIIIIl());
        }
        else {
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), bufferedImage);
        }
    }
}
