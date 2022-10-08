package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class FPSMod extends Mod
{
    public FPSMod() {
        super("FPS", Integer.parseInt(Leaf.instance.saveConfig.loadConfig("FPS", "x")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("FPS", "y")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("FPS", "red")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("FPS", "green")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("FPS", "blue")), Integer.valueOf(Leaf.instance.saveConfig.loadConfig("FPS", "size")), Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("FPS", "enable")));
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI;
        Minecraft.getMinecraft();
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.valueOf(Minecraft.lIlIIlllIIlIIlIlllIl()) + " FPS", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.lIIIIlIIIIIlllIllIII());
        GL11.glPopMatrix();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("1000 FPS", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.lIIIIlIIIIIlllIllIII());
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("0000 FPS") + 2;
    }
    
    @Override
    public int llllIIIlIlllIlIIIIIl() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll + 2;
    }
}
