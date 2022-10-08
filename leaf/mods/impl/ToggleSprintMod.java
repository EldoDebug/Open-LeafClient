package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

public class ToggleSprintMod extends Mod
{
    public boolean speedup;
    public boolean sneak;
    private boolean llIllIIIIIllIlIIIIlI;
    
    public ToggleSprintMod() {
        super("ToggleSprint", Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ToggleSprint", "x")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ToggleSprint", "y")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ToggleSprint", "red")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ToggleSprint", "green")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("ToggleSprint", "blue")), Integer.valueOf(Leaf.instance.saveConfig.loadConfig("ToggleSprint", "size")), Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("ToggleSprint", "enable")));
        this.speedup = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("ToggleSprint", "speedup"));
        this.sneak = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("ToggleSprint", "sneak"));
        this.llIllIIIIIllIlIIIIlI = false;
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        if (this.IIIIlllIIIIIIlIIIlll()) {
            Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("[Sneaking (Toggled)]", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.lIIIIlIIIIIlllIllIII());
        }
        else {
            Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("[Sprinting (Toggled)]", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.lIIIIlIIIIIlllIllIII());
        }
        GL11.glPopMatrix();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("[Sprinting (Toggled)]", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.lIIIIlIIIIIlllIllIII());
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("[Sprinting (Toggled)]") + 2;
    }
    
    @Override
    public int llllIIIlIlllIlIIIIIl() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll + 2;
    }
    
    public boolean IIIIlllIIIIIIlIIIlll() {
        if (!this.sneak) {
            return Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IlIIllIIllIIllIIlIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (!this.llIllIIIIIllIlIIIIlI) {
            if (Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IlIIllIIllIIllIIlIIl.IllIIlllIIIIlllIIlIl()) {
                this.llIllIIIIIllIlIIIIlI = true;
            }
        }
        else if (Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IlIIllIIllIIllIIlIIl.IllIIlllIIIIlllIIlIl()) {
            this.llIllIIIIIllIlIIIIlI = false;
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
}
