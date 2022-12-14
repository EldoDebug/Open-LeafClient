package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import net.minecraft.client.*;
import org.lwjgl.opengl.*;

public class CoordinateMod extends Mod
{
    public boolean biome;
    public boolean decimal;
    
    public CoordinateMod() {
        super("Coordinate", Integer.parseInt(Leaf.instance.configManager.loadConfig("Coordinate", "x")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Coordinate", "y")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Coordinate", "red")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Coordinate", "green")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Coordinate", "blue")), Integer.valueOf(Leaf.instance.configManager.loadConfig("Coordinate", "size")), Boolean.valueOf(Leaf.instance.configManager.loadConfig("Coordinate", "enable")));
        this.biome = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Coordinate", "biome"));
        this.decimal = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Coordinate", "decimal"));
    }
    
    @Override
    public void render() {
        String s;
        if (this.decimal) {
            s = "X: " + Math.round(Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl * 100.0) / 100.0 + " Y: " + Math.round(Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII * 100.0) / 100.0 + " Z: " + Math.round(Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII * 100.0) / 100.0;
        }
        else {
            s = "X: " + (int)Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl + " Y: " + (int)Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII + " Z: " + (int)Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        if (!this.biome) {
            Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("Biome: " + Minecraft.getMinecraft().IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl()).lIlIIlllIIlIIlIlllIl, (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 14), this.getIntColor());
        }
        GL11.glPopMatrix();
    }
    
    @Override
    public void renderDummy(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("X: 1000 Y: 1000 Z: 1000", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        if (!this.biome) {
            Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("Biome: Flower Forest", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 14), this.getIntColor());
        }
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int getWidth() {
        return 130;
    }
    
    @Override
    public int getHeight() {
        return 20;
    }
}
