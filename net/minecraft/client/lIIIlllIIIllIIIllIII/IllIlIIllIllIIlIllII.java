package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.awt.image.*;
import java.awt.*;

public class IllIlIIllIllIIlIllII implements IlIIlIlIIIlIIlIlIlII
{
    private int[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    @Override
    public BufferedImage llllIIIIlIIIlIlllIll(final BufferedImage bufferedImage) {
        if (bufferedImage == null) {
            return null;
        }
        this.IlIlIlIlIlllllllllIl = 64;
        this.llIllIIIIIllIlIIIIlI = 64;
        final int width = bufferedImage.getWidth();
        final int height = bufferedImage.getHeight();
        int n = 1;
        while (this.IlIlIlIlIlllllllllIl < width || this.llIllIIIIIllIlIIIIlI < height) {
            this.IlIlIlIlIlllllllllIl *= 2;
            this.llIllIIIIIllIlIIIIlI *= 2;
            n *= 2;
        }
        final BufferedImage bufferedImage2 = new BufferedImage(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, 2);
        final Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        if (bufferedImage.getHeight() == 32 * n) {
            graphics.drawImage(bufferedImage2, 24 * n, 48 * n, 20 * n, 52 * n, 4 * n, 16 * n, 8 * n, 20 * n, null);
            graphics.drawImage(bufferedImage2, 28 * n, 48 * n, 24 * n, 52 * n, 8 * n, 16 * n, 12 * n, 20 * n, null);
            graphics.drawImage(bufferedImage2, 20 * n, 52 * n, 16 * n, 64 * n, 8 * n, 20 * n, 12 * n, 32 * n, null);
            graphics.drawImage(bufferedImage2, 24 * n, 52 * n, 20 * n, 64 * n, 4 * n, 20 * n, 8 * n, 32 * n, null);
            graphics.drawImage(bufferedImage2, 28 * n, 52 * n, 24 * n, 64 * n, 0 * n, 20 * n, 4 * n, 32 * n, null);
            graphics.drawImage(bufferedImage2, 32 * n, 52 * n, 28 * n, 64 * n, 12 * n, 20 * n, 16 * n, 32 * n, null);
            graphics.drawImage(bufferedImage2, 40 * n, 48 * n, 36 * n, 52 * n, 44 * n, 16 * n, 48 * n, 20 * n, null);
            graphics.drawImage(bufferedImage2, 44 * n, 48 * n, 40 * n, 52 * n, 48 * n, 16 * n, 52 * n, 20 * n, null);
            graphics.drawImage(bufferedImage2, 36 * n, 52 * n, 32 * n, 64 * n, 48 * n, 20 * n, 52 * n, 32 * n, null);
            graphics.drawImage(bufferedImage2, 40 * n, 52 * n, 36 * n, 64 * n, 44 * n, 20 * n, 48 * n, 32 * n, null);
            graphics.drawImage(bufferedImage2, 44 * n, 52 * n, 40 * n, 64 * n, 40 * n, 20 * n, 44 * n, 32 * n, null);
            graphics.drawImage(bufferedImage2, 48 * n, 52 * n, 44 * n, 64 * n, 52 * n, 20 * n, 56 * n, 32 * n, null);
        }
        graphics.dispose();
        this.llllIIIIlIIIlIlllIll = ((DataBufferInt)bufferedImage2.getRaster().getDataBuffer()).getData();
        this.IlIlIlIlIlllllllllIl(0 * n, 0 * n, 32 * n, 16 * n);
        this.llllIIIIlIIIlIlllIll(32 * n, 0 * n, 64 * n, 32 * n);
        this.IlIlIlIlIlllllllllIl(0 * n, 16 * n, 64 * n, 32 * n);
        this.llllIIIIlIIIlIlllIll(0 * n, 32 * n, 16 * n, 48 * n);
        this.llllIIIIlIIIlIlllIll(16 * n, 32 * n, 40 * n, 48 * n);
        this.llllIIIIlIIIlIlllIll(40 * n, 32 * n, 56 * n, 48 * n);
        this.llllIIIIlIIIlIlllIll(0 * n, 48 * n, 16 * n, 64 * n);
        this.IlIlIlIlIlllllllllIl(16 * n, 48 * n, 48 * n, 64 * n);
        this.llllIIIIlIIIlIlllIll(48 * n, 48 * n, 64 * n, 64 * n);
        return bufferedImage2;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        if (!this.llIllIIIIIllIlIIIIlI(n, n2, n3, n4)) {
            for (int i = n; i < n3; ++i) {
                for (int j = n2; j < n4; ++j) {
                    final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
                    final int n5 = i + j * this.IlIlIlIlIlllllllllIl;
                    llllIIIIlIIIlIlllIll[n5] &= 0xFFFFFF;
                }
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
                final int n5 = i + j * this.IlIlIlIlIlllllllllIl;
                llllIIIIlIIIlIlllIll[n5] |= 0xFF000000;
            }
        }
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                if ((this.llllIIIIlIIIlIlllIll[i + j * this.IlIlIlIlIlllllllllIl] >> 24 & 0xFF) < 128) {
                    return true;
                }
            }
        }
        return false;
    }
}
