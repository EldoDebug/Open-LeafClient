package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class FPSMod extends Mod
{
    public FPSMod() {
        super("FPS", Integer.parseInt(Leaf.instance.configManager.loadConfig("FPS", "x")), Integer.parseInt(Leaf.instance.configManager.loadConfig("FPS", "y")), Integer.parseInt(Leaf.instance.configManager.loadConfig("FPS", "red")), Integer.parseInt(Leaf.instance.configManager.loadConfig("FPS", "green")), Integer.parseInt(Leaf.instance.configManager.loadConfig("FPS", "blue")), Integer.valueOf(Leaf.instance.configManager.loadConfig("FPS", "size")), Boolean.valueOf(Leaf.instance.configManager.loadConfig("FPS", "enable")));
    }
    
    @Override
    public void render() {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        final FontRenderer lIlIlIIIllIIllIIIllI = Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI;
        Minecraft.getMinecraft();
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.valueOf(Minecraft.lIlIIlllIIlIIlIlllIl()) + " FPS", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        GL11.glPopMatrix();
    }
    
    @Override
    public void renderDummy(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("1000 FPS", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int getWidth() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("0000 FPS") + 2;
    }
    
    @Override
    public int getHeight() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll + 2;
    }
}
