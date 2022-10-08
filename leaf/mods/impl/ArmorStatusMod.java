package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class ArmorStatusMod extends Mod
{
    public ArmorStatusMod() {
        super("ArmorStatus", Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ArmorStatus", "x")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ArmorStatus", "y")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ArmorStatus", "red")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ArmorStatus", "green")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ArmorStatus", "blue")), Integer.valueOf(Leaf.instance.saveConfig.loadConfig("ArmorStatus", "size")), Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("ArmorStatus", "enable")));
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        int n = this.IlIlIIIllIllIIIIIllI() + 8;
        for (int i = 3; i >= 0; --i) {
            if (Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(i) != null) {
                Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new StringBuilder(String.valueOf(Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(i).lIIIlllIIIllIIIllIII() - Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(i).llllIIIlIlllIlIIIIIl())).toString(), (float)(this.IlIIIlIlIIIllIlIlIIl() - 16), (float)(n + 4), this.lIIIIlIIIIIlllIllIII());
                Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(i), this.IlIIIlIlIIIllIlIlIIl() + 8, n);
                Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI, Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(i), this.IlIIIlIlIIIllIlIlIIl() + 8, n);
                GL11.glDisable(2896);
                n += 18;
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
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llIIIlIlllIllIIlIllI), this.IlIIIlIlIIIllIlIlIIl() + 8, this.IlIlIIIllIllIIIIIllI() + 8);
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IlIIllIIllIIllIIlIIl), this.IlIIIlIlIIIllIlIlIIl() + 8, this.IlIlIIIllIllIIIIIllI() + 26);
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lllllIIIIIlIlIIIIIIl), this.IlIIIlIlIIIllIlIlIIl() + 8, this.IlIlIIIllIllIIIIIllI() + 44);
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IllIIlllllIIllIIllIl), this.IlIIIlIlIIIllIlIlIIl() + 8, this.IlIlIIIllIllIIIIIllI() + 62);
        GL11.glPopMatrix();
        GL11.glDisable(2896);
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return 32;
    }
    
    @Override
    public int llllIIIlIlllIlIIIIIl() {
        return 85;
    }
}
