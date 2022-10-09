package leaf.mods.impl;

import leaf.mods.*;
import java.util.*;
import leaf.*;
import org.lwjgl.input.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

public class CPSMod extends Mod
{
    private ArrayList color;
    private ArrayList x;
    private boolean lastLeftClick;
    private boolean lastRightClick;
    private long lastCurrentTimeMillisLeft;
    private long lastCurrentTimeMillisRight;
    public boolean showRight;
    
    public CPSMod() {
        super("CPS", Integer.parseInt(Leaf.instance.configManager.loadConfig("CPS", "x")), Integer.parseInt(Leaf.instance.configManager.loadConfig("CPS", "y")), Integer.parseInt(Leaf.instance.configManager.loadConfig("CPS", "red")), Integer.parseInt(Leaf.instance.configManager.loadConfig("CPS", "green")), Integer.parseInt(Leaf.instance.configManager.loadConfig("CPS", "blue")), Integer.valueOf(Leaf.instance.configManager.loadConfig("CPS", "size")), Boolean.valueOf(Leaf.instance.configManager.loadConfig("CPS", "enable")));
        this.color = new ArrayList();
        this.x = new ArrayList();
        this.showRight = Boolean.valueOf(Leaf.instance.configManager.loadConfig("CPS", "right_click"));
    }
    
    @Override
    public void render() {
        final boolean buttonDown = Mouse.isButtonDown(0);
        if (buttonDown != this.lastLeftClick) {
            this.lastCurrentTimeMillisLeft = System.currentTimeMillis();
            if (this.lastLeftClick = buttonDown) {
                this.color.add(this.lastCurrentTimeMillisLeft);
            }
        }
        if (this.showRight) {
            final boolean buttonDown2 = Mouse.isButtonDown(1);
            if (buttonDown2 != this.lastRightClick) {
                this.lastCurrentTimeMillisRight = System.currentTimeMillis();
                if (this.lastRightClick = buttonDown2) {
                    this.x.add(this.lastCurrentTimeMillisRight);
                }
            }
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll((this.showRight ? (String.valueOf(this.getCPSLeft()) + " / " + this.getCPSRight()) : Integer.valueOf(this.getCPSLeft())) + " CPS", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        GL11.glPopMatrix();
    }
    
    @Override
    public void renderDummy(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.valueOf(this.showRight ? "10 / 10" : "10") + " CPS", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.getIntColor());
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int getWidth() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.showRight ? "00 / 00 CPS" : "00 CPS") + 2;
    }
    
    @Override
    public int getHeight() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll + 2;
    }
    
    int getCPSLeft() {
        this.color.removeIf(n -> n + 1000L < System.currentTimeMillis());
        return (this.color.size() <= 0) ? 0 : this.color.size();
    }
    
    int getCPSRight() {
        this.x.removeIf(n -> n + 1000L < System.currentTimeMillis());
        return (this.x.size() <= 0) ? 0 : this.x.size();
    }
}
