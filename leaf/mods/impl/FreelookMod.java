package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;

public class FreelookMod extends Mod
{
    private float IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    public boolean llllIIIIlIIIlIlllIll;
    
    public FreelookMod() {
        super("FreeLook", 0, 0, 0, 0, 0, 0, Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("FreeLook", "enable")));
        this.IlIlIlIlIlllllllllIl = 0.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.llllIIIIlIIIlIlllIll = false;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        if (n == Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.ax.lIIIlllIIIllIIIllIII()) {
            if (Keyboard.getEventKeyState()) {
                this.llllIIIIlIIIlIlllIll = !this.llllIIIIlIIIlIlllIll;
                this.IlIlIlIlIlllllllllIl = Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll;
                this.llIllIIIIIllIlIIIIlI = Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllllIllIllIlIllllI;
                if (this.llllIIIIlIIIlIlllIll) {
                    this.IlIIIlIlIIIllIlIlIIl = Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI;
                    Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = 1;
                }
                else {
                    Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = this.IlIIIlIlIIIllIlIlIIl;
                }
            }
            else {
                this.llllIIIIlIIIlIlllIll = false;
                Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = this.IlIIIlIlIIIllIlIlIIl;
            }
        }
        if (n == Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.llllIllllIllllIlIlII.lIIIlllIIIllIIIllIII()) {
            this.llllIIIIlIIIlIlllIll = false;
        }
    }
    
    public float IIIIlllIIIIIIlIIIlll() {
        return this.llllIIIIlIIIlIlllIll ? this.IlIlIlIlIlllllllllIl : Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll;
    }
    
    public float llllIIllllIlIlIIIIll() {
        return this.llllIIIIlIIIlIlllIll ? this.llIllIIIIIllIlIIIIlI : Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllllIllIllIlIllllI;
    }
    
    public boolean IlIllIlIlIIIlIlIlIII() {
        if (!this.llllIIIIlIIIlIlllIll) {
            return true;
        }
        Minecraft.getMinecraft().IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI();
        final float n = Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll * 0.6f + 0.2f;
        final float n2 = n * n * n * 8.0f;
        final float n3 = Minecraft.getMinecraft().IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll * n2;
        final float n4 = Minecraft.getMinecraft().IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl * n2;
        this.IlIlIlIlIlllllllllIl += n3 * 0.15f;
        this.llIllIIIIIllIlIIIIlI += n4 * 0.15f;
        if (this.llIllIIIIIllIlIIIIlI < -90.0f) {
            this.llIllIIIIIllIlIIIIlI = -90.0f;
        }
        if (this.llIllIIIIIllIlIIIIlI > 90.0f) {
            this.llIllIIIIIllIlIIIIlI = 90.0f;
        }
        return false;
    }
}
