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
    public ArrayList llllIIIIlIIIlIlllIll;
    public ToggleSprintMod IlIlIlIlIlllllllllIl;
    public CPSMod llIllIIIIIllIlIIIIlI;
    public KillEffectMod IlIIIlIlIIIllIlIlIIl;
    public PotionStatusMod IlIlIIIllIllIIIIIllI;
    public NickHiderMod IllIIlllIIIIlllIIlIl;
    public FreelookMod llllIIIlIlllIlIIIIIl;
    public HitBoxMod lIIIIlIIIIIlllIllIII;
    public PingMod lIIIlllIIIllIIIllIII;
    public ScoreBoardMod llIIlIIIlIIIllIlIIIl;
    public NameTagMod llIllIlIIIIllIlIIllI;
    public ChatMod lIlIlIIIllIIllIIIllI;
    public OldAnimationMod IlIlIIIllIIllIlllllI;
    public CoordinateMod IIIIlllIIIIIIlIIIlll;
    public BossbarMod llllIIllllIlIlIIIIll;
    public String IlIllIlIlIIIlIlIlIII;
    public String IIlllIIlIllIllIlIIll;
    public String lllIIIIlllllIlIIllIl;
    public boolean IlIlIIIIIIlllIlIllIl;
    public boolean IIllIIllIIIlIlIIIIlI;
    public boolean IIIlIIIlIlIIlllIIlll;
    public boolean IlIlIIIlIIlIlIIlllIl;
    public boolean IlllllllIIIlIIIlIlII;
    public boolean IIlIIIIlllIlllllIlII;
    public boolean IIIlIIlIIIIlllIlllII;
    public boolean IlIlIllllllllIIIIlII;
    public boolean IIlllIlIIllIlIlIlIIl;
    private GameProfile llIIIlIlIllIIlIlIlII;
    
    public ModManager() {
        (this.llllIIIIlIIIlIlllIll = new ArrayList()).add(this.IlIlIlIlIlllllllllIl = new ToggleSprintMod());
        this.llllIIIIlIIIlIlllIll.add(new FPSMod());
        this.llllIIIIlIIIlIlllIll.add(this.IlIlIIIllIllIIIIIllI = new PotionStatusMod());
        this.llllIIIIlIIIlIlllIll.add(this.llIllIIIIIllIlIIIIlI = new CPSMod());
        this.llllIIIIlIIIlIlllIll.add(new ArmorStatusMod());
        this.llllIIIIlIIIlIlllIll.add(new SaturationMod());
        this.llllIIIIlIIIlIlllIll.add(new PingMod());
        this.llllIIIIlIIIlIlllIll.add(this.llIIlIIIlIIIllIlIIIl = new ScoreBoardMod());
        this.llllIIIIlIIIlIlllIll.add(this.llllIIllllIlIlIIIIll = new BossbarMod());
        this.llllIIIIlIIIlIlllIll.add(this.IIIIlllIIIIIIlIIIlll = new CoordinateMod());
        this.IlIIIlIlIIIllIlIlIIl = new KillEffectMod();
        this.llllIIIlIlllIlIIIIIl = new FreelookMod();
        this.IllIIlllIIIIlllIIlIl = new NickHiderMod();
        this.lIIIIlIIIIIlllIllIII = new HitBoxMod();
        this.llIllIlIIIIllIlIIllI = new NameTagMod();
        this.lIlIlIIIllIIllIIIllI = new ChatMod();
        this.IlIlIIIllIIllIlllllI = new OldAnimationMod();
        this.IlIllIlIlIIIlIlIlIII = Leaf.instance.saveConfig.loadConfig("Setting", "cape");
        this.IIlllIIlIllIllIlIIll = Leaf.instance.saveConfig.loadConfig("Setting", "wing");
        this.lllIIIIlllllIlIIllIl = Leaf.instance.saveConfig.loadConfig("Setting", "hat");
        this.IlIlIIIIIIlllIlIllIl = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Setting", "hide_icon"));
        this.IIllIIllIIIlIlIIIIlI = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Setting", "hide_cape"));
        this.IIIlIIIlIlIIlllIIlll = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Setting", "hide_wing"));
        this.IIlIIIIlllIlllllIlII = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Setting", "fullbright"));
        this.IlllllllIIIlIIIlIlII = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Setting", "hide_enchant"));
        this.IIIlIIlIIIIlllIlllII = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Setting", "hide_fire"));
        this.IlIlIllllllllIIIIlII = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Setting", "clear_glass"));
        this.IIlllIlIIllIlIlIlIIl = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Setting", "item"));
        this.llllIIIIlIIIlIlllIll();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final String loadConfig = Leaf.instance.saveConfig.loadConfig("NickHider", "name");
        final String loadConfig2 = Leaf.instance.saveConfig.loadConfig("NickHider", "id");
        try {
            final JSONObject jsonObject = new JSONObject(new JSONTokener(new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + loadConfig2 + "?unsigned=false").openStream())).getJSONArray("properties").getJSONObject(0);
            this.llIIIlIlIllIIlIlIlII = new GameProfile(UUID.fromString(loadConfig2), loadConfig);
            this.llIIIlIlIllIIlIlIlII.getProperties().put((Object)jsonObject.getString("name"), (Object)new Property(jsonObject.getString("name"), jsonObject.getString("value"), jsonObject.getString("signature")));
        }
        catch (IOException ex) {
            this.llIIIlIlIllIIlIlIlII = new GameProfile(UUID.fromString(loadConfig2), loadConfig);
        }
    }
    
    public GameProfile IlIlIlIlIlllllllllIl() {
        return this.llIIIlIlIllIIlIlIlII;
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        for (final Mod mod : this.llllIIIIlIIIlIlllIll) {
            if (mod.lIlIlIIIllIIllIIIllI()) {
                mod.IlIlIIIllIIllIlllllI();
            }
        }
    }
}
