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
    public boolean IlIlIlIlIlllllllllIl;
    public boolean llIllIIIIIllIlIIIIlI;
    public String IlIIIlIlIIIllIlIlIIl;
    public String IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public KillEffectMod() {
        super("KillEffect", 0, 0, 0, 0, 0, 0, Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("KillEffect", "enable")));
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIIlIIIlIlllIll = false;
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.IlIlIlIlIlllllllllIl = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("KillEffect", "hide_cadaver"));
        this.llIllIIIIIllIlIIIIlI = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("KillEffect", "bypass"));
        this.IlIlIIIllIllIIIIIllI = Leaf.instance.saveConfig.loadConfig("KillEffect", "effect");
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (!this.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl)) {
            return;
        }
        if (this.IlIlIlIlIlllllllllIl) {
            Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new IIIlIIIlIlIIlllIIlll(new int[] { lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl() }));
        }
        final String ilIlIIIllIllIIIIIllI;
        switch (ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI) {
            case "EXPLOSION": {
                Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI, lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII, lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
                Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("random.explode", 1.0f, 1.0f);
                break;
            }
            case "LIGHTNING": {
                Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new IllIlIIllIllIIlIllII(new llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII, lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII)));
                Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("ambient.weather.thunder", 1.0f, 1.0f);
                break;
            }
            case "NONE": {
                break;
            }
            case "BLOOD": {
                Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(null, 2001, lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl().llllIIIIlIIIlIlllIll(0, 1, 0), 152);
                Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(null, 2001, lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl().llllIIIIlIIIlIlllIll(0, 1, 0), 152);
                break;
            }
            default:
                break;
        }
        this.IlIIIlIlIIIllIlIlIIl = "";
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (this.IlIIIlIlIIIllIlIlIIl.equals(llIllIIIIIllIlIIIIlI.s_())) {
            final String ilIlIIIllIllIIIIIllI;
            switch (ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI) {
                case "EXPLOSION": {
                    Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
                    Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("random.explode", 1.0f, 1.0f);
                    break;
                }
                case "LIGHTNING": {
                    Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new IllIlIIllIllIIlIllII(new llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII)));
                    Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("ambient.weather.thunder", 1.0f, 1.0f);
                    break;
                }
                case "NONE": {
                    break;
                }
                case "BLOOD": {
                    Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(null, 2001, llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl().llllIIIIlIIIlIlllIll(0, 1, 0), 152);
                    Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(null, 2001, llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl().llllIIIIlIIIlIlllIll(0, 1, 0), 152);
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
