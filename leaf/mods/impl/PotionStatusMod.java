package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;

public class PotionStatusMod extends Mod
{
    public boolean llllIIIIlIIIlIlllIll;
    
    public PotionStatusMod() {
        super("PotionStatus", Integer.parseInt(Leaf.instance.saveConfig.loadConfig("PotionStatus", "x")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("PotionStatus", "y")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("PotionStatus", "red")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("PotionStatus", "green")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("PotionStatus", "blue")), Integer.valueOf(Leaf.instance.saveConfig.loadConfig("PotionStatus", "size")), Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("PotionStatus", "enable")));
        this.llllIIIIlIIIlIlllIll = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("PotionStatus", "background"));
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
        if (!Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.L().isEmpty()) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 : Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.L()) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll()];
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("textures/gui/container/inventory.png"));
                if (this.llllIIIIlIIIlIlllIll) {
                    Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI, 0, 166, 140, 32);
                }
                if (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI()) {
                    final int illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
                    Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl + 6, ilIlIIIllIllIIIIIllI + 7, 0 + illIIlllIIIIlllIIlIl % 8 * 18, 198 + illIIlllIIIIlllIIlIl / 8 * 18, 18, 18);
                }
                String s = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), new Object[0]);
                if (ilIIIlIlIIIllIlIlIIl2.llIllIIIIIllIlIIIIlI() == 1) {
                    s = String.valueOf(s) + " II";
                }
                else if (ilIIIlIlIIIllIlIlIIl2.llIllIIIIIllIlIIIIlI() == 2) {
                    s = String.valueOf(s) + " III";
                }
                else if (ilIIIlIlIIIllIlIlIIl2.llIllIIIIIllIlIIIIlI() == 3) {
                    s = String.valueOf(s) + " IV";
                }
                else if (ilIIIlIlIIIllIlIlIIl2.llIllIIIIIllIlIIIIlI() == 4) {
                    s = String.valueOf(s) + " V";
                }
                Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, (float)(ilIIIlIlIIIllIlIlIIl + 28), (float)(ilIlIIIllIllIIIIIllI + 6), this.lIIIIlIIIIIlllIllIII());
                String llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2);
                if (ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl() <= 200 && ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl() % 20 >= 10) {
                    llllIIIIlIIIlIlllIll2 = "";
                }
                Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, (float)(ilIIIlIlIIIllIlIlIIl + 28), (float)(ilIlIIIllIllIIIIIllI + 16), this.lIIIIlIIIIIlllIllIII());
                ilIlIIIllIllIIIIIllI += 33;
            }
        }
        GL11.glPopMatrix();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("PotionStatus", (float)(this.IlIIIlIlIIIllIlIlIIl() + 30), (float)(this.IlIlIIIllIllIIIIIllI() + 14), this.lIIIIlIIIIIlllIllIII());
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return 122;
    }
    
    @Override
    public int llllIIIlIlllIlIIIIIl() {
        return 35;
    }
}
