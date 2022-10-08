package leaf.font;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.awt.image.*;
import java.awt.*;
import java.awt.geom.*;
import org.lwjgl.opengl.*;

public class CFont
{
    float lIIIlllIIIllIIIllIII;
    CustomFontRenderer[] llIIlIIIlIIIllIlIIIl;
    Font llIllIlIIIIllIlIIllI;
    boolean lIlIlIIIllIIllIIIllI;
    boolean IlIlIIIllIIllIlllllI;
    int IIIIlllIIIIIIlIIIlll;
    int llllIIllllIlIlIIIIll;
    IlIlIlIlIlllllllllIl IlIllIlIlIIIlIlIlIII;
    
    public CFont(final Font llIllIlIIIIllIlIIllI, final boolean lIlIlIIIllIIllIIIllI, final boolean ilIlIIIllIIllIlllllI) {
        this.lIIIlllIIIllIIIllIII = 512.0f;
        this.llIIlIIIlIIIllIlIIIl = new CustomFontRenderer[256];
        this.IIIIlllIIIIIIlIIIlll = -1;
        this.llllIIllllIlIlIIIIll = 0;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IlIllIlIlIIIlIlIlIII = this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, lIlIlIIIllIIllIIIllI, ilIlIIIllIIllIlllllI, this.llIIlIIIlIIIllIlIIIl);
    }
    
    protected IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final Font font, final boolean b, final boolean b2, final CustomFontRenderer[] array) {
        final BufferedImage ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(font, b, b2, array);
        try {
            return new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    protected BufferedImage IlIlIlIlIlllllllllIl(final Font font, final boolean b, final boolean b2, final CustomFontRenderer[] array) {
        final int n = (int)this.lIIIlllIIIllIIIllIII;
        final BufferedImage bufferedImage = new BufferedImage(n, n, 2);
        final Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(font);
        graphics2D.setColor(new Color(255, 255, 255, 0));
        graphics2D.fillRect(0, 0, n, n);
        graphics2D.setColor(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, b2 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, b ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, b ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        final FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int ilIlIlIlIlllllllllIl = 0;
        int llIllIIIIIllIlIIIIlI = 0;
        int ilIIIlIlIIIllIlIlIIl = 1;
        for (int i = 0; i < array.length; ++i) {
            final char c = (char)i;
            final CustomFontRenderer customFontRenderer = new CustomFontRenderer();
            final Rectangle2D stringBounds = fontMetrics.getStringBounds(String.valueOf(c), graphics2D);
            customFontRenderer.llllIIIIlIIIlIlllIll = stringBounds.getBounds().width + 8;
            customFontRenderer.IlIlIlIlIlllllllllIl = stringBounds.getBounds().height;
            if (llIllIIIIIllIlIIIIlI + customFontRenderer.llllIIIIlIIIlIlllIll >= n) {
                llIllIIIIIllIlIIIIlI = 0;
                ilIIIlIlIIIllIlIlIIl += ilIlIlIlIlllllllllIl;
                ilIlIlIlIlllllllllIl = 0;
            }
            if (customFontRenderer.IlIlIlIlIlllllllllIl > ilIlIlIlIlllllllllIl) {
                ilIlIlIlIlllllllllIl = customFontRenderer.IlIlIlIlIlllllllllIl;
            }
            customFontRenderer.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            customFontRenderer.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            if (customFontRenderer.IlIlIlIlIlllllllllIl > this.IIIIlllIIIIIIlIIIlll) {
                this.IIIIlllIIIIIIlIIIlll = customFontRenderer.IlIlIlIlIlllllllllIl;
            }
            array[i] = customFontRenderer;
            graphics2D.drawString(String.valueOf(c), llIllIIIIIllIlIIIIlI + 2, ilIIIlIlIIIllIlIlIIl + fontMetrics.getAscent());
            llIllIIIIIllIlIIIIlI += customFontRenderer.llllIIIIlIIIlIlllIll;
        }
        return bufferedImage;
    }
    
    public void llllIIIIlIIIlIlllIll(final CustomFontRenderer[] array, final char c, final float n, final float n2) {
        try {
            this.llllIIIIlIIIlIlllIll(n, n2, (float)array[c].llllIIIIlIIIlIlllIll, (float)array[c].IlIlIlIlIlllllllllIl, (float)array[c].llIllIIIIIllIlIIIIlI, (float)array[c].IlIIIlIlIIIllIlIlIIl, (float)array[c].llllIIIIlIIIlIlllIll, (float)array[c].IlIlIlIlIlllllllllIl);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        final float n9 = n5 / this.lIIIlllIIIllIIIllIII;
        final float n10 = n6 / this.lIIIlllIIIllIIIllIII;
        final float n11 = n7 / this.lIIIlllIIIllIIIllIII;
        final float n12 = n8 / this.lIIIlllIIIllIIIllIII;
        GL11.glTexCoord2f(n9 + n11, n10);
        GL11.glVertex2d((double)(n + n3), (double)n2);
        GL11.glTexCoord2f(n9, n10);
        GL11.glVertex2d((double)n, (double)n2);
        GL11.glTexCoord2f(n9, n10 + n12);
        GL11.glVertex2d((double)n, (double)(n2 + n4));
        GL11.glTexCoord2f(n9, n10 + n12);
        GL11.glVertex2d((double)n, (double)(n2 + n4));
        GL11.glTexCoord2f(n9 + n11, n10 + n12);
        GL11.glVertex2d((double)(n + n3), (double)(n2 + n4));
        GL11.glTexCoord2f(n9 + n11, n10);
        GL11.glVertex2d((double)(n + n3), (double)n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean lIlIlIIIllIIllIIIllI) {
        if (this.lIlIlIIIllIIllIIIllI != lIlIlIIIllIIllIIIllI) {
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
            this.IlIllIlIlIIIlIlIlIII = this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI, this.llIIlIIIlIIIllIlIIIl);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean ilIlIIIllIIllIlllllI) {
        if (this.IlIlIIIllIIllIlllllI != ilIlIIIllIIllIlllllI) {
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
            this.IlIllIlIlIIIlIlIlIII = this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, ilIlIIIllIIllIlllllI, this.llIIlIIIlIIIllIlIIIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final Font llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.IlIllIlIlIIIlIlIlIII = this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI, this.llIIlIIIlIIIllIlIIIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI.deriveFont(0, (float)n);
        this.IlIllIlIlIIIlIlIlIII = this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI, this.llIIlIIIlIIIllIlIIIl);
    }
}
