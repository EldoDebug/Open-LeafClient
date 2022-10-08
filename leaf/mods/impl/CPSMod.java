package leaf.mods.impl;

import leaf.mods.*;
import java.util.*;
import leaf.*;
import org.lwjgl.input.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

public class CPSMod extends Mod
{
    private ArrayList IlIlIlIlIlllllllllIl;
    private ArrayList llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private long IllIIlllIIIIlllIIlIl;
    private long llllIIIlIlllIlIIIIIl;
    public boolean llllIIIIlIIIlIlllIll;
    
    public CPSMod() {
        super("CPS", Integer.parseInt(Leaf.instance.saveConfig.loadConfig("CPS", "x")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("CPS", "y")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("CPS", "red")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("CPS", "green")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("CPS", "blue")), Integer.valueOf(Leaf.instance.saveConfig.loadConfig("CPS", "size")), Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("CPS", "enable")));
        this.IlIlIlIlIlllllllllIl = new ArrayList();
        this.llIllIIIIIllIlIIIIlI = new ArrayList();
        this.llllIIIIlIIIlIlllIll = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("CPS", "right_click"));
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
        final boolean buttonDown = Mouse.isButtonDown(0);
        if (buttonDown != this.IlIIIlIlIIIllIlIlIIl) {
            this.IllIIlllIIIIlllIIlIl = System.currentTimeMillis();
            if (this.IlIIIlIlIIIllIlIlIIl = buttonDown) {
                this.IlIlIlIlIlllllllllIl.add(this.IllIIlllIIIIlllIIlIl);
            }
        }
        if (this.llllIIIIlIIIlIlllIll) {
            final boolean buttonDown2 = Mouse.isButtonDown(1);
            if (buttonDown2 != this.IlIlIIIllIllIIIIIllI) {
                this.llllIIIlIlllIlIIIIIl = System.currentTimeMillis();
                if (this.IlIlIIIllIllIIIIIllI = buttonDown2) {
                    this.llIllIIIIIllIlIIIIlI.add(this.llllIIIlIlllIlIIIIIl);
                }
            }
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll((this.llllIIIIlIIIlIlllIll ? (String.valueOf(this.IIIIlllIIIIIIlIIIlll()) + " / " + this.llllIIllllIlIlIIIIll()) : Integer.valueOf(this.IIIIlllIIIIIIlIIIlll())) + " CPS", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.lIIIIlIIIIIlllIllIII());
        GL11.glPopMatrix();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), 0.0f);
        GL11.glScalef(this.llIllIlIIIIllIlIIllI(), this.llIllIlIIIIllIlIIllI(), 1.0f);
        GL11.glTranslatef((float)(-(this.IlIIIlIlIIIllIlIlIIl() + 2)), (float)(-(this.IlIlIIIllIllIIIIIllI() + 2)), 0.0f);
        Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.valueOf(this.llllIIIIlIIIlIlllIll ? "10 / 10" : "10") + " CPS", (float)(this.IlIIIlIlIIIllIlIlIIl() + 2), (float)(this.IlIlIIIllIllIIIIIllI() + 2), this.lIIIIlIIIIIlllIllIII());
        GL11.glPopMatrix();
        this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll ? "00 / 00 CPS" : "00 CPS") + 2;
    }
    
    @Override
    public int llllIIIlIlllIlIIIIIl() {
        return Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll + 2;
    }
    
    int IIIIlllIIIIIIlIIIlll() {
        this.IlIlIlIlIlllllllllIl.removeIf(n -> n + 1000L < System.currentTimeMillis());
        return (this.IlIlIlIlIlllllllllIl.size() <= 0) ? 0 : this.IlIlIlIlIlllllllllIl.size();
    }
    
    int llllIIllllIlIlIIIIll() {
        this.llIllIIIIIllIlIIIIlI.removeIf(n -> n + 1000L < System.currentTimeMillis());
        return (this.llIllIIIIIllIlIIIIlI.size() <= 0) ? 0 : this.llIllIIIIIllIlIIIIlI.size();
    }
}
