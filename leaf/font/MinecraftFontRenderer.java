package leaf.font;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.awt.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class MinecraftFontRenderer extends CFont
{
    CustomFontRenderer[] llllIIIIlIIIlIlllIll;
    CustomFontRenderer[] IlIlIlIlIlllllllllIl;
    CustomFontRenderer[] llIllIIIIIllIlIIIIlI;
    int[] IlIIIlIlIIIllIlIlIIl;
    String IlIlIIIllIllIIIIIllI;
    IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl;
    IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl;
    IlIlIlIlIlllllllllIl lIIIIlIIIIIlllIllIII;
    
    public MinecraftFontRenderer(final Font font, final boolean b, final boolean b2) {
        super(font, b, b2);
        this.llllIIIIlIIIlIlllIll = new CustomFontRenderer[256];
        this.IlIlIlIlIlllllllllIl = new CustomFontRenderer[256];
        this.llIllIIIIIllIlIIIIlI = new CustomFontRenderer[256];
        this.IlIIIlIlIIIllIlIlIIl = new int[32];
        this.IlIlIIIllIllIIIIIllI = "0123456789abcdefklmnor";
        this.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll();
    }
    
    public int llllIIIIlIIIlIlllIll(final String s, final double n, final float n2, final int n3) {
        return (int)Math.max(this.llllIIIIlIIIlIlllIll(s, n + 0.8999999761581421, n2 + 0.5, n3, true, 8.3f), this.llllIIIIlIIIlIlllIll(s, n, n2, n3, false, 8.3f));
    }
    
    public int IlIlIlIlIlllllllllIl(final String s, final double n, final float n2, final int n3) {
        return (int)this.llllIIIIlIIIlIlllIll(s, n, n2, n3, false, 8.3f);
    }
    
    public float llllIIIIlIIIlIlllIll(final String s, final float n, final float n2, final int n3) {
        return (float)this.IlIlIlIlIlllllllllIl(s, (double)(n - (float)(this.llllIIIIlIIIlIlllIll(s) / 2.0)), n2, n3);
    }
    
    public float IlIlIlIlIlllllllllIl(final String s, final float n, final float n2, final int n3) {
        return (float)this.llllIIIIlIIIlIlllIll(s, (double)(n - (float)(this.llllIIIIlIIIlIlllIll(s) / 2.0)), n2, n3);
    }
    
    public float llllIIIIlIIIlIlllIll(final String s, double n, double n2, int n3, final boolean b, final float n4) {
        --n;
        if (s == null) {
            return 0.0f;
        }
        if (n3 == 553648127) {
            n3 = 16777215;
        }
        if ((n3 & 0xFC000000) == 0x0) {
            n3 |= 0xFF000000;
        }
        if (b) {
            n3 = ((n3 & 0xFCFCFC) >> 2 | (n3 & 0xFF000000));
        }
        CustomFontRenderer[] array = this.llIIlIIIlIIIllIlIIIl;
        final float n5 = (n3 >> 24 & 0xFF) / 255.0f;
        int n6 = 0;
        int n7 = 0;
        boolean b2 = false;
        boolean b3 = false;
        n *= 2.0;
        n2 = (n2 - 3.0) * 2.0;
        GL11.glPushMatrix();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.5, 0.5, 0.5);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((n3 >> 16 & 0xFF) / 255.0f, (n3 >> 8 & 0xFF) / 255.0f, (n3 & 0xFF) / 255.0f, n5);
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll());
        GL11.glBindTexture(3553, this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll());
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '˜') {
                int index = 21;
                try {
                    index = "0123456789abcdefklmnor".indexOf(s.charAt(i + 1));
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                if (index < 16) {
                    n6 = 0;
                    n7 = 0;
                    b3 = false;
                    b2 = false;
                    lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll());
                    array = this.llIIlIIIlIIIllIlIIIl;
                    if (index < 0) {
                        index = 15;
                    }
                    if (b) {
                        index += 16;
                    }
                    final int n8 = this.IlIIIlIlIIIllIlIlIIl[index];
                    lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((n8 >> 16 & 0xFF) / 255.0f, (n8 >> 8 & 0xFF) / 255.0f, (n8 & 0xFF) / 255.0f, n5);
                }
                else if (index != 16) {
                    if (index == 17) {
                        n6 = 1;
                        if (n7 != 0) {
                            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
                            array = this.llIllIIIIIllIlIIIIlI;
                        }
                        else {
                            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll());
                            array = this.llllIIIIlIIIlIlllIll;
                        }
                    }
                    else if (index == 18) {
                        b2 = true;
                    }
                    else if (index == 19) {
                        b3 = true;
                    }
                    else if (index == 20) {
                        n7 = 1;
                        if (n6 != 0) {
                            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
                            array = this.llIllIIIIIllIlIIIIlI;
                        }
                        else {
                            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll());
                            array = this.IlIlIlIlIlllllllllIl;
                        }
                    }
                    else {
                        n6 = 0;
                        n7 = 0;
                        b3 = false;
                        b2 = false;
                        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((n3 >> 16 & 0xFF) / 255.0f, (n3 >> 8 & 0xFF) / 255.0f, (n3 & 0xFF) / 255.0f, n5);
                        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll());
                        array = this.llIIlIIIlIIIllIlIIIl;
                    }
                }
                ++i;
            }
            else if (char1 < array.length) {
                GL11.glBegin(4);
                this.llllIIIIlIIIlIlllIll(array, char1, (float)n, (float)n2);
                GL11.glEnd();
                if (b2) {
                    this.llllIIIIlIIIlIlllIll(n, n2 + array[char1].IlIlIlIlIlllllllllIl / 2, n + array[char1].llllIIIIlIIIlIlllIll - 8.0, n2 + array[char1].IlIlIlIlIlllllllllIl / 2, 1.0f);
                }
                if (b3) {
                    this.llllIIIIlIIIlIlllIll(n, n2 + array[char1].IlIlIlIlIlllllllllIl - 2.0, n + array[char1].llllIIIIlIIIlIlllIll - 8.0, n2 + array[char1].IlIlIlIlIlllllllllIl - 2.0, 1.0f);
                }
                n += array[char1].llllIIIIlIIIlIlllIll - n4 + this.llllIIllllIlIlIIIIll;
            }
        }
        GL11.glHint(3155, 4352);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        return (float)n / 2.0f;
    }
    
    public double llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            return 0.0;
        }
        float n = 0.0f;
        final CustomFontRenderer[] llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '˜') {
                "0123456789abcdefklmnor".indexOf(char1);
                ++i;
            }
            else if (char1 < llIIlIIIlIIIllIlIIIl.length) {
                n += llIIlIIIlIIIllIlIIIl[char1].llllIIIIlIIIlIlllIll - 8.3f + this.llllIIllllIlIlIIIIll;
            }
        }
        return n / 2.0f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Font font) {
        super.llllIIIIlIIIlIlllIll(font);
        this.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        super.llllIIIIlIIIlIlllIll(b);
        this.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final boolean b) {
        super.IlIlIlIlIlllllllllIl(b);
        this.llllIIIIlIIIlIlllIll();
    }
    
    private void llllIIIIlIIIlIlllIll() {
        this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI.deriveFont(1), this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI, this.llllIIIIlIIIlIlllIll);
        this.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI.deriveFont(2), this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI, this.IlIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI.deriveFont(3), this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI, this.llIllIIIIIllIlIIIIlI);
    }
    
    private void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final float n5) {
        GL11.glDisable(3553);
        GL11.glLineWidth(n5);
        GL11.glBegin(1);
        GL11.glVertex2d(n, n2);
        GL11.glVertex2d(n3, n4);
        GL11.glEnd();
        GL11.glEnable(3553);
    }
    
    private void IlIlIlIlIlllllllllIl() {
        for (int i = 0; i < 32; ++i) {
            final int n = (i >> 3 & 0x1) * 85;
            int n2 = (i >> 2 & 0x1) * 170 + n;
            int n3 = (i >> 1 & 0x1) * 170 + n;
            int n4 = (i & 0x1) * 170 + n;
            if (i == 6) {
                n2 += 85;
            }
            if (i >= 16) {
                n2 /= 4;
                n3 /= 4;
                n4 /= 4;
            }
            this.IlIIIlIlIIIllIlIlIIl[i] = ((n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | (n4 & 0xFF));
        }
    }
}
