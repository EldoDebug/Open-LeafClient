package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class KillEffectMod extends Mod
{
    public boolean llllIIIIlIIIlIlllIll;
    public boolean hideCadaver;
    public boolean bypass;
    public String IlIIIlIlIIIllIlIlIIl;
    public String effectType;
    private int nazo;
    
    public KillEffectMod() {
        super("KillEffect", 0, 0, 0, 0, 0, 0, Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("KillEffect", "enable")));
        this.nazo = -1;
        this.llllIIIIlIIIlIlllIll = false;
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.hideCadaver = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("KillEffect", "hide_cadaver"));
        this.bypass = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("KillEffect", "bypass"));
        this.effectType = Leaf.instance.saveConfig.loadConfig("KillEffect", "effect");
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (!this.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl)) {
            return;
        }
        if (this.hideCadaver) {
            Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new IIIlIIIlIlIIlllIIlll(new int[] { lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl() }));
        }
        final String effectType;
        switch (effectType = this.effectType) {
            case "EXPLOSION": {
                Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI, lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII, lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
                Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("random.explode", 1.0f, 1.0f);
                break;
            }
            case "LIGHTNING": {
                Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new IllIlIIllIllIIlIllII((llIllIIIIIllIlIIIIlI)new llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII, lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII)));
                Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("ambient.weather.thunder", 1.0f, 1.0f);
                break;
            }
            case "NONE": {
                break;
            }
            case "BLOOD": {
                Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)null, 2001, lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl().llllIIIIlIIIlIlllIll(0, 1, 0), 152);
                Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)null, 2001, lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl().llllIIIIlIIIlIlllIll(0, 1, 0), 152);
                break;
            }
            default:
                break;
        }
        this.IlIIIlIlIIIllIlIlIIl = "";
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (this.IlIIIlIlIIIllIlIlIIl.equals(llIllIIIIIllIlIIIIlI.s_())) {
            final String effectType;
            switch (effectType = this.effectType) {
                case "EXPLOSION": {
                    Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
                    Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("random.explode", 1.0f, 1.0f);
                    break;
                }
                case "LIGHTNING": {
                    Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new IllIlIIllIllIIlIllII((llIllIIIIIllIlIIIIlI)new llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII)));
                    Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("ambient.weather.thunder", 1.0f, 1.0f);
                    break;
                }
                case "NONE": {
                    break;
                }
                case "BLOOD": {
                    Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)null, 2001, llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl().llllIIIIlIIIlIlllIll(0, 1, 0), 152);
                    Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)null, 2001, llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl().llllIIIIlIIIlIlllIll(0, 1, 0), 152);
                    break;
                }
                default:
                    break;
            }
            this.IlIIIlIlIIIllIlIlIIl = "";
        }
    }
    
    boolean IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (this.llllIIIIlIIIlIlllIll) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll = true;
        return lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && !(lllIIIIlllllIlIIllIl instanceof net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) && this.IlIIIlIlIIIllIlIlIIl.equals(lllIIIIlllllIlIIllIl.s_());
    }
}
