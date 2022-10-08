package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;

public class BossbarMod extends Mod
{
    public boolean llllIIIIlIIIlIlllIll;
    
    public BossbarMod() {
        super("BossBar", Integer.parseInt(Leaf.instance.saveConfig.loadConfig("BossBar", "x")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("BossBar", "y")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("BossBar", "red")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("BossBar", "green")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("BossBar", "blue")), Integer.valueOf(Leaf.instance.saveConfig.loadConfig("BossBar", "size")), Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("BossBar", "enable")));
        this.llllIIIIlIIIlIlllIll = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("BossBar", "health"));
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("BossBar", (float)(this.IlIIIlIlIIIllIlIlIIl() + 91 - Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("BossBar") / 2), (float)this.IlIlIIIllIllIIIIIllI(), this.lIIIIlIIIIIlllIllIII());
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl(), this.IlIlIIIllIllIIIIIllI() + 10, 0, 74, 182, 5);
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl(), this.IlIlIIIllIllIIIIIllI() + 10, 0, 79, 182, 5);
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return 182;
    }
    
    @Override
    public int llllIIIlIlllIlIIIIIl() {
        return 20;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null && net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
            GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
            GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
            --net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
            final int n = 182;
            final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
            final int n2 = (int)(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll * (n + 1));
            final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
            if (!this.llllIIIIlIIIlIlllIll) {
                Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI + 10, 0, 74, n, 5);
                Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI + 10, 0, 74, n, 5);
                if (n2 > 0) {
                    Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI + 10, 0, 79, n2, 5);
                }
            }
            final String llIllIIIIIllIlIIIIlI = net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, (float)(ilIIIlIlIIIllIlIlIIl + 91 - ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI) / 2), (float)ilIlIIIllIllIIIIIllI, this.lIIIIlIIIIIlllIllIII());
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
            GL11.glPopMatrix();
        }
    }
}
