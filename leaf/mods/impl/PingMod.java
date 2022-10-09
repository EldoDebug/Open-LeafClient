package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

public class PingMod extends Mod
{
    public PingMod() {
        super("Ping", Integer.parseInt(Leaf.instance.configManager.loadConfig("Ping", "x")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Ping", "y")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Ping", "red")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Ping", "green")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Ping", "blue")), Integer.valueOf(Leaf.instance.configManager.loadConfig("Ping", "size")), Boolean.valueOf(Leaf.instance.configManager.loadConfig("Ping", "enable")));
    }
    
    @Override
    public void render() {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.valueOf((Minecraft.getMinecraft().lllllIlIIIlIlIIlllII() == null) ? 0L : Minecraft.getMinecraft().lllllIlIIIlIlIIlllII().IlIlIIIllIllIIIIIllI) + " ms", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        GL11.glPopMatrix();
    }
    
    @Override
    public void renderDummy(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("0 ms", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int getWidth() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("000 ms") + 2;
    }
    
    @Override
    public int getHeight() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll + 2;
    }
}
