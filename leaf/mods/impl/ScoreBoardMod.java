package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import java.util.*;

public class ScoreBoardMod extends Mod
{
    public boolean number;
    
    public ScoreBoardMod() {
        super("ScoreBoard", Integer.parseInt(Leaf.instance.configManager.loadConfig("ScoreBoard", "x")), Integer.parseInt(Leaf.instance.configManager.loadConfig("ScoreBoard", "y")), 0, 0, 0, Integer.valueOf(Leaf.instance.configManager.loadConfig("ScoreBoard", "size")), Boolean.valueOf(Leaf.instance.configManager.loadConfig("ScoreBoard", "enable")));
        this.number = Boolean.valueOf(Leaf.instance.configManager.loadConfig("ScoreBoard", "number"));
    }
    
    @Override
    public void render() {
    }
    
    @Override
    public void renderDummy(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("ScoreBoard", (float)(this.IlIIIlIlIIIllIlIlIIl() + 20), (float)(this.IlIlIIIllIllIIIIIllI() + 50), -1);
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int getWidth() {
        return 100;
    }
    
    @Override
    public int getHeight() {
        return 100;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final FontRenderer fontRenderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
        final Collection llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
        if (llllIIIIlIIIlIlllIll2.size() <= 15) {
            int n = fontRenderer.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : llllIIIIlIIIlIlllIll2) {
                n = Math.max(n, fontRenderer.llllIIIIlIIIlIlllIll(String.valueOf(net.minecraft.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl()), ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl())) + ": " + IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()));
            }
            final int n2 = this.IlIlIIIllIllIIIIIllI() + (llllIIIIlIIIlIlllIll2.size() + 1) * fontRenderer.llllIIIIlIIIlIlllIll;
            int ilIIIlIlIIIllIlIlIIl2 = this.IlIIIlIlIIIllIlIlIIl();
            int n3 = 0;
            int n4 = ilIIIlIlIIIllIlIlIIl2 + n + 8;
            final int n5 = Minecraft.getMinecraft().IlIIIlIlIIIllIlIlIIl / this.llIllIIIIIllIlIIIIlI().IlIlIIIllIllIIIIIllI();
            if (n4 > n5) {
                final int n6 = n4 - n5;
                ilIIIlIlIIIllIlIlIIl2 -= n6;
                n4 -= n6;
            }
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl3 : llllIIIIlIIIlIlllIll2) {
                ++n3;
                final String llllIIIIlIIIlIlllIll3 = net.minecraft.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(ilIIIlIlIIIllIlIlIIl3.IlIIIlIlIIIllIlIlIIl()), ilIIIlIlIIIllIlIlIIl3.IlIIIlIlIIIllIlIlIIl());
                final int n7 = n2 - n3 * fontRenderer.llllIIIIlIIIlIlllIll;
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2 - 2, n7, n4, n7 + fontRenderer.llllIIIIlIIIlIlllIll, 1342177280);
                fontRenderer.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, ilIIIlIlIIIllIlIlIIl2, n7, 553648127);
                if (!this.number) {
                    final String string = new StringBuilder().append(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI).append(ilIIIlIlIIIllIlIlIIl3.IlIlIlIlIlllllllllIl()).toString();
                    fontRenderer.llllIIIIlIIIlIlllIll(string, n4 - fontRenderer.llllIIIIlIIIlIlllIll(string), n7, 553648127);
                }
                if (n3 == llllIIIIlIIIlIlllIll2.size()) {
                    final String ilIIIlIlIIIllIlIlIIl4 = liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl();
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2 - 2, n7 - fontRenderer.llllIIIIlIIIlIlllIll - 1, n4, n7 - 1, 1610612736);
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2 - 2, n7 - 1, n4, n7, 1342177280);
                    fontRenderer.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl4, ilIIIlIlIIIllIlIlIIl2 + n / 2 - fontRenderer.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl4) / 2, n7 - fontRenderer.llllIIIIlIIIlIlllIll, 553648127);
                }
            }
        }
        GL11.glPopMatrix();
    }
}
