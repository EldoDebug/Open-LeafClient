package leaf.mods;

import com.mojang.authlib.*;
import leaf.mods.impl.*;
import leaf.*;
import java.net.*;
import org.json.*;
import com.mojang.authlib.properties.*;
import java.io.*;
import java.util.*;

public class ModManager
{
    public ArrayList mods;
    public ToggleSprintMod toggleSprintMod;
    public CPSMod cpsMod;
    public KillEffectMod killEffectMod;
    public PotionStatusMod potionStatusMod;
    public NickHiderMod nickHiderMod;
    public FreelookMod freeLookMod;
    public HitBoxMod hitBoxMod;
    public PingMod pingMod;
    public ScoreBoardMod scoreBoardMod;
    public NameTagMod nameTagMod;
    public ChatMod chatMod;
    public OldAnimationMod oldAnimationMod;
    public CoordinateMod coordinateMod;
    public BossbarMod bossBarMod;
    public String capeSetting;
    public String wingSetting;
    public String hatSetting;
    public boolean hideIcon;
    public boolean hideCape;
    public boolean hideWing;
    public boolean IlIlIIIlIIlIlIIlllIl;
    public boolean hideEnchant;
    public boolean fullbright;
    public boolean hideFire;
    public boolean clearGlass;
    public boolean item;
    private GameProfile gameProfile;
    
    public ModManager() {
        (this.mods = new ArrayList()).add(this.toggleSprintMod = new ToggleSprintMod());
        this.mods.add(new FPSMod());
        this.mods.add(this.potionStatusMod = new PotionStatusMod());
        this.mods.add(this.cpsMod = new CPSMod());
        this.mods.add(new ArmorStatusMod());
        this.mods.add(new SaturationMod());
        this.mods.add(new PingMod());
        this.mods.add(this.scoreBoardMod = new ScoreBoardMod());
        this.mods.add(this.bossBarMod = new BossbarMod());
        this.mods.add(this.coordinateMod = new CoordinateMod());
        this.killEffectMod = new KillEffectMod();
        this.freeLookMod = new FreelookMod();
        this.nickHiderMod = new NickHiderMod();
        this.hitBoxMod = new HitBoxMod();
        this.nameTagMod = new NameTagMod();
        this.chatMod = new ChatMod();
        this.oldAnimationMod = new OldAnimationMod();
        this.capeSetting = Leaf.instance.configManager.loadConfig("Setting", "cape");
        this.wingSetting = Leaf.instance.configManager.loadConfig("Setting", "wing");
        this.hatSetting = Leaf.instance.configManager.loadConfig("Setting", "hat");
        this.hideIcon = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Setting", "hide_icon"));
        this.hideCape = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Setting", "hide_cape"));
        this.hideWing = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Setting", "hide_wing"));
        this.fullbright = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Setting", "fullbright"));
        this.hideEnchant = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Setting", "hide_enchant"));
        this.hideFire = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Setting", "hide_fire"));
        this.clearGlass = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Setting", "clear_glass"));
        this.item = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Setting", "item"));
        this.getPlayerData();
    }
    
    public void getPlayerData() {
        final String loadConfig = Leaf.instance.configManager.loadConfig("NickHider", "name");
        final String loadConfig2 = Leaf.instance.configManager.loadConfig("NickHider", "id");
        try {
            final JSONObject jsonObject = new JSONObject(new JSONTokener(new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + loadConfig2 + "?unsigned=false").openStream())).getJSONArray("properties").getJSONObject(0);
            this.gameProfile = new GameProfile(UUID.fromString(loadConfig2), loadConfig);
            this.gameProfile.getProperties().put((Object)jsonObject.getString("name"), (Object)new Property(jsonObject.getString("name"), jsonObject.getString("value"), jsonObject.getString("signature")));
        }
        catch (IOException ex) {
            this.gameProfile = new GameProfile(UUID.fromString(loadConfig2), loadConfig);
        }
    }
    
    public GameProfile getGameProfile() {
        return this.gameProfile;
    }
    
    public void getMods() {
        for (final Mod mod : this.mods) {
            if (mod.lIlIlIIIllIIllIIIllI()) {
                mod.render();
            }
        }
    }
}
