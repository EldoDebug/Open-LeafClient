package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

public class PingMod extends Mod
{
    public PingMod() {
        super("Ping", Integer.parseInt(Leaf.instance.saveConfig.loadConfig("Ping", "x")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("Ping", "y")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("Ping", "red")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("Ping", "green")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("Ping", "blue")), Integer.valueOf(Leaf.instance.saveConfig.loadConfig("Ping", "size")), Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Ping", "enable")));
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.valueOf((Minecraft.getMinecraft().lllllIlIIIlIlIIlllII() == null) ? 0L : Minecraft.getMinecraft().lllllIlIIIlIlIIlllII().IlIlIIIllIllIIIIIllI) + " ms", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.lIIIIlIIIIIlllIllIII());
        GL11.glPopMatrix();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("0 ms", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.lIIIIlIIIIIlllIllIII());
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("000 ms") + 2;
    }
    
    @Override
    public int llllIIIlIlllIlIIIIIl() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll + 2;
    }
}
