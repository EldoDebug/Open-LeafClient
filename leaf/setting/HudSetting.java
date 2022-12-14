package leaf.setting;

import leaf.mods.*;
import java.awt.*;
import leaf.font.*;
import leaf.*;
import leaf.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;

public class HudSetting extends lIIllIIIllllIlllIllI
{
    private Mod IlIlIIIllIllIIIIIllI;
    private ArrayList IllIIlllIIIIlllIIlIl;
    
    public HudSetting(final Mod ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void n_() {
        final g g = new g(this.IlIlIIIllIIllIlllllI);
        final int n = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        final int n2 = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        Setting.llllIIIIlIIIlIlllIll(g.IlIlIIIllIllIIIIIllI(), (n / g.IlIlIIIllIllIIIIIllI() > g.llllIIIIlIIIlIlllIll()) ? (g.llllIIIIlIIIlIlllIll() / (n / (double)g.IlIlIIIllIllIIIIIllI())) : 1.0, (n2 / g.IlIlIIIllIllIIIIIllI() > g.IlIlIlIlIlllllllllIl()) ? (g.IlIlIlIlIlllllllllIl() / (n2 / (double)g.IlIlIIIllIllIIIIIllI())) : 1.0, (n < 1920) ? (n / 1920.0) : 1.0, (n2 < 1080) ? (n2 / 1080.0) : 1.0);
        LoadFont.minecraftFontRenderer.llllIIIIlIIIlIlllIll(Setting.llllIIIIlIIIlIlllIll());
        final String name = this.IlIlIIIllIllIIIIIllI.getName();
        if (name.equals("FreeLook") || name.equals("Old Animation")) {
            return;
        }
        if (name.equals("ToggleSprint")) {
            this.IllIIlllIIIIlllIIlIl.add(new ToggleSprintSetting0(this, "Enable Toggle Sneak", 1120, 650, 100, 60, Leaf.instance.modManager.toggleSprintMod.sneak));
            this.IllIIlllIIIIlllIIlIl.add(new ToggleSprintSetting1(this, "Enable Flying Boost", 1120, 750, 100, 60, Leaf.instance.modManager.toggleSprintMod.speedup));
        }
        else if (name.equals("CPS")) {
            this.IllIIlllIIIIlllIIlIl.add(new CPSSetting(this, "Enable Right Click CPS", 1120, 650, 100, 60, Leaf.instance.modManager.cpsMod.showRight));
        }
        else {
            if (name.equals("KillEffect")) {
                this.IllIIlllIIIIlllIIlIl.add(new KillEffectSetting2(this, "Type of Effects", 920, 250, 300, 90, Arrays.asList("NONE", "BLOOD", "LIGHTNING", "EXPLOSION"), Leaf.instance.modManager.killEffectMod.effectType));
                this.IllIIlllIIIIlllIIlIl.add(new KillEffectSetting1(this, "Animation of Hiding Corpse", 1120, 380, 100, 60, Leaf.instance.modManager.killEffectMod.hideCadaver));
                this.IllIIlllIIIIlllIIlIl.add(new KillEffectSetting0(this, "Enable Hypixel Mode", 1120, 480, 100, 60, Leaf.instance.modManager.killEffectMod.bypass));
                return;
            }
            if (name.equals("PotionStatus")) {
                this.IllIIlllIIIIlllIIlIl.add(new PotionStatusSetting(this, "Show Background", 1120, 650, 100, 60, Leaf.instance.modManager.potionStatusMod.background));
            }
            else {
                if (name.equals("NickHider")) {
                    this.IllIIlllIIIIlllIIlIl.add(new NickHiderSetting(this, "Nick Other Players", 1120, 250, 100, 60, Leaf.instance.modManager.nickHiderMod.nickOther));
                    return;
                }
                if (name.equals("HitBox")) {
                    this.IllIIlllIIIIlllIIlIl.add(new IIIllllllIllIIIlllIl(this, "Red Color of HUD", 960, 250, 255, 90, this.IlIlIIIllIllIIIIIllI.getColor().getRed(), 0));
                    this.IllIIlllIIIIlllIIlIl.add(new lIIIIlIIIIIlllIllIII(this, "Green Color of HUD", 960, 350, 255, 90, this.IlIlIIIllIllIIIIIllI.getColor().getGreen(), 0));
                    this.IllIIlllIIIIlllIIlIl.add(new lIIIlllIIIllIIIllIII(this, "Blue Color of HUD", 960, 450, 255, 90, this.IlIlIIIllIllIIIIIllI.getColor().getBlue(), 0));
                    this.IllIIlllIIIIlllIIlIl.add(new HitBoxSetting(this, "Show Player's Direction", 1120, 550, 100, 60, Leaf.instance.modManager.hitBoxMod.lookDirection));
                    return;
                }
                if (name.equals("ScoreBoard")) {
                    this.IllIIlllIIIIlllIIlIl.add(new HudSizeSetting(this, "Size of HUD", 960, 250, 255, 90, this.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl(), 0));
                    this.IllIIlllIIIIlllIIlIl.add(new ScoreBoardSetting(this, "Hide Number of Lines", 1120, 350, 100, 60, Leaf.instance.modManager.scoreBoardMod.number));
                    return;
                }
                if (name.equals("NameTag")) {
                    this.IllIIlllIIIIlllIIlIl.add(new NameTagSetting1(this, "Add Shadow Effects", 1120, 250, 100, 60, Leaf.instance.modManager.nameTagMod.shadow));
                    this.IllIIlllIIIIlllIIlIl.add(new NameTagSetting0(this, "Hide NameTag Background", 1120, 350, 100, 60, Leaf.instance.modManager.nameTagMod.background));
                    return;
                }
                if (name.equals("Chat")) {
                    this.IllIIlllIIIIlllIIlIl.add(new llllIIllllIlIlIIIIll(this, "Red Color of Detected Chat", 960, 250, 255, 90, this.IlIlIIIllIllIIIIIllI.getColor().getRed(), 40));
                    this.IllIIlllIIIIlllIIlIl.add(new HudGreenSetting(this, "Green Color of Detected Chat", 960, 350, 255, 90, this.IlIlIIIllIllIIIIIllI.getColor().getGreen(), 40));
                    this.IllIIlllIIIIlllIIlIl.add(new IIlllIIlIllIllIlIIll(this, "Blue Color of Detected Chat", 960, 450, 255, 90, this.IlIlIIIllIllIIIIIllI.getColor().getBlue(), 40));
                    this.IllIIlllIIIIlllIIlIl.add(new ChatSetting2(this, "Detect Your Name", 1120, 550, 100, 60, Leaf.instance.modManager.chatMod.detect));
                    this.IllIIlllIIIIlllIIlIl.add(new ChatSetting1(this, "Hide Chat Background", 1120, 650, 100, 60, Leaf.instance.modManager.chatMod.background));
                    this.IllIIlllIIIIlllIIlIl.add(new ChatSetting0(this, "Block Access to Chat", 1120, 750, 100, 60, Leaf.instance.modManager.chatMod.access));
                    return;
                }
                if (name.equals("Coordinate")) {
                    this.IllIIlllIIIIlllIIlIl.add(new CoordinateSetting0(this, "Hide the Biome", 1120, 650, 100, 60, Leaf.instance.modManager.coordinateMod.biome));
                    this.IllIIlllIIIIlllIIlIl.add(new CoordinateSetting1(this, "Enable Decimal Format", 1120, 750, 100, 60, Leaf.instance.modManager.coordinateMod.decimal));
                }
                else if (name.equals("BossBar")) {
                    this.IllIIlllIIIIlllIIlIl.add(new BossBarSetting(this, "Hide Health Bar", 1120, 650, 100, 60, Leaf.instance.modManager.bossBarMod.name));
                }
            }
        }
        this.IllIIlllIIIIlllIIlIl.add(new IIIlIIlIIIIlllIlllII(this, "Red Color of HUD", 960, 250, 255, 90, this.IlIlIIIllIllIIIIIllI.getColor().getRed(), 0));
        this.IllIIlllIIIIlllIIlIl.add(new IlIlIllllllllIIIIlII(this, "Green Color of HUD", 960, 350, 255, 90, this.IlIlIIIllIllIIIIIllI.getColor().getGreen(), 0));
        this.IllIIlllIIIIlllIIlIl.add(new IIlllIlIIllIlIlIlIIl(this, "Blue Color of HUD", 960, 450, 255, 90, this.IlIlIIIllIllIIIIIllI.getColor().getBlue(), 0));
        this.IllIIlllIIIIlllIIlIl.add(new llIIIlIlIllIIlIlIlII(this, "Size of HUD", 960, 550, 255, 90, this.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl(), 0));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        final g g = new g(this.IlIlIIIllIIllIlllllI);
        final int llllIIIIlIIIlIlllIll = g.llllIIIIlIIIlIlllIll();
        final int ilIlIlIlIlllllllllIl = g.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/main_mod.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, 0.0f, 0.0f, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, (float)llllIIIIlIIIlIlllIll, (float)ilIlIlIlIlllllllllIl);
        final Iterator<llIIlIIIlIIIllIlIIIl> iterator = this.IllIIlllIIIIlllIIlIl.iterator();
        while (iterator.hasNext()) {
            iterator.next().IlIlIlIlIlllllllllIl();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        this.IllIIlllIIIIlllIIlIl = new ArrayList();
        super.llllIIIIlIIIlIlllIll(minecraft, n, n2);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final Iterator<llIIlIIIlIIIllIlIIIl> iterator = this.IllIIlllIIIIlllIIlIl.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(n, n2, n3);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        if (Mouse.getEventDWheel() == 0) {
            this.llllIIIIlIIIlIlllIll(Mouse.getX() * this.llllIIllllIlIlIIIIll / this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIllIlIlIIIlIlIlIII - Mouse.getY() * this.IlIllIlIlIIIlIlIlIII / this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI - 1);
        }
    }
    
    void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final Iterator<llIIlIIIlIIIllIlIIIl> iterator = this.IllIIlllIIIIlllIIlIl.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(n, n2);
        }
    }
    
    @Override
    public void o_() {
        this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll = null;
    }
}
