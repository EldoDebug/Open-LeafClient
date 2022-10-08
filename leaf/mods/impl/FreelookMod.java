package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;

public class FreelookMod extends Mod
{
    private float yaw;
    private float pitch;
    private int prevPerspectivev;
    public boolean toggled;
    
    public FreelookMod() {
        super("FreeLook", 0, 0, 0, 0, 0, 0, Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("FreeLook", "enable")));
        this.yaw = 0.0f;
        this.pitch = 0.0f;
        this.toggled = false;
    }
    
    public void onKey(final int n) {
        if (n == Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.ax.lIIIlllIIIllIIIllIII()) {
            if (Keyboard.getEventKeyState()) {
                this.toggled = !this.toggled;
                this.yaw = Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll;
                this.pitch = Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllllIllIllIlIllllI;
                if (this.toggled) {
                    this.prevPerspectivev = Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI;
                    Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = 1;
                }
                else {
                    Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = this.prevPerspectivev;
                }
            }
            else {
                this.toggled = false;
                Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = this.prevPerspectivev;
            }
        }
        if (n == Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.llllIllllIllllIlIlII.lIIIlllIIIllIIIllIII()) {
            this.toggled = false;
        }
    }
    
    public float getYaw() {
        return this.toggled ? this.yaw : Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll;
    }
    
    public float getPitch() {
        return this.toggled ? this.pitch : Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllllIllIllIlIllllI;
    }
    
    public boolean getMouseOver() {
        if (!this.toggled) {
            return true;
        }
        Minecraft.getMinecraft().IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI();
        final float n = Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll * 0.6f + 0.2f;
        final float n2 = n * n * n * 8.0f;
        final float n3 = Minecraft.getMinecraft().IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll * n2;
        final float n4 = Minecraft.getMinecraft().IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl * n2;
        this.yaw += n3 * 0.15f;
        this.pitch += n4 * 0.15f;
        if (this.pitch < -90.0f) {
            this.pitch = -90.0f;
        }
        if (this.pitch > 90.0f) {
            this.pitch = 90.0f;
        }
        return false;
    }
}
