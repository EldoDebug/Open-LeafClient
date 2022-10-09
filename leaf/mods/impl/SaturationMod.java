package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

public class SaturationMod extends Mod
{
    public SaturationMod() {
        super("Saturation", Integer.parseInt(Leaf.instance.configManager.loadConfig("Saturation", "x")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Saturation", "y")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Saturation", "red")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Saturation", "green")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Saturation", "blue")), Integer.valueOf(Leaf.instance.configManager.loadConfig("Saturation", "size")), Boolean.valueOf(Leaf.instance.configManager.loadConfig("Saturation", "enable")));
    }
    
    @Override
    public void render() {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.format("%.0f", Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.aq().IlIIIlIlIIIllIlIlIIl()), (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        GL11.glPopMatrix();
    }
    
    @Override
    public void renderDummy(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.valueOf(10), (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int getWidth() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("00") + 2;
    }
    
    @Override
    public int getHeight() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll + 2;
    }
}
