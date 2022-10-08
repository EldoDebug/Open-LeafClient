package leaf.cosmetic;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;

class RenderCosmeticWing extends IlIIIlIlIIIllIlIlIIl
{
    final /* synthetic */ CosmeticWing llllIIIIlIIIlIlllIll;
    
    private RenderCosmeticWing(final CosmeticWing llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(((llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).llIIlIIIlIIIllIlIIIl());
        if (llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl()) {
            GL11.glScaled(0.1, 0.1, 0.1);
            GL11.glTranslated(0.0, 1.8, 1.1);
            GL11.glRotated(10.0, -10.0, 0.0, 0.0);
        }
        else {
            GL11.glScaled(0.1, 0.1, 0.1);
            GL11.glTranslated(0.0, -0.3, 1.1);
            GL11.glRotated(10.0, -10.0, 0.0, 0.0);
        }
        for (int i = 0; i < 2; ++i) {
            final float n7 = n3 / 10.0f;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = 0.125f - (float)Math.cos(n7) * 0.1f;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = 0.25f;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = (float)(Math.sin(n7) + 1.225) * 0.5f;
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII = -(float)(Math.sin(n7 + 2.0f) + 0.5) * 0.75f;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = false;
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI = false;
            if (!llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII()) {
                GL11.glPushMatrix();
                GL11.glDisable(2896);
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
                GL11.glBlendFunc(1, 1);
                GL11.glEnable(2896);
                GL11.glPopMatrix();
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = false;
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI = false;
            if (i == 0) {
                GL11.glScaled(-1.0, 1.0, 1.0);
            }
        }
        GL11.glPopMatrix();
    }
}
