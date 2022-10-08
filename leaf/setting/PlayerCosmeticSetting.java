package leaf.setting;

import java.awt.*;
import leaf.font.*;
import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;
import net.minecraft.client.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import org.lwjgl.input.*;

public class PlayerCosmeticSetting extends lIIllIIIllllIlllIllI
{
    private ArrayList IlIlIIIllIllIIIIIllI;
    private ArrayList IllIIlllIIIIlllIIlIl;
    private llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private IlIlIIIllIllIIIIIllI lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    
    public PlayerCosmeticSetting(final String liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public void n_() {
        final g g = new g(this.IlIlIIIllIIllIlllllI);
        final int n = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        final int n2 = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        Setting.llllIIIIlIIIlIlllIll(g.IlIlIIIllIllIIIIIllI(), (n / g.IlIlIIIllIllIIIIIllI() > g.llllIIIIlIIIlIlllIll()) ? (g.llllIIIIlIIIlIlllIll() / (n / (double)g.IlIlIIIllIllIIIIIllI())) : 1.0, (n2 / g.IlIlIIIllIllIIIIIllI() > g.IlIlIlIlIlllllllllIl()) ? (g.IlIlIlIlIlllllllllIl() / (n2 / (double)g.IlIlIIIllIllIIIIIllI())) : 1.0, (n < 1920) ? (n / 1920.0) : 1.0, (n2 < 1080) ? (n2 / 1080.0) : 1.0);
        LoadFont.minecraftFontRenderer.llllIIIIlIIIlIlllIll(Setting.llllIIIIlIIIlIlllIll());
        this.IlIlIIIllIllIIIIIllI.add(new llllIIIlIlllIlIIIIIl("mod", 430, 250, 170, 106));
        this.IlIlIIIllIllIIIIIllI.add(new llllIIIlIlllIlIIIIIl("cosmetic", 650, 250, 170, 106));
        this.IlIlIIIllIllIIIIIllI.add(new llllIIIlIlllIlIIIIIl("location", 1100, 250, 170, 106));
        this.IlIlIIIllIllIIIIIllI.add(new llllIIIlIlllIlIIIIIl("setting", 1320, 250, 170, 106));
        Map<K, String> map = null;
        final ArrayList<String> list = new ArrayList<String>();
        if (this.lIIIlllIIIllIIIllIII.equals("Cape")) {
            map = (Map<K, String>)Leaf.instance.downloadPlayerData.IlIlIlIlIlllllllllIl;
        }
        else if (this.lIIIlllIIIllIIIllIII.equals("Wing")) {
            map = (Map<K, String>)Leaf.instance.downloadPlayerData.llIllIIIIIllIlIIIIlI;
        }
        else if (this.lIIIlllIIIllIIIllIII.equals("Hat")) {
            map = (Map<K, String>)Leaf.instance.downloadPlayerData.IlIIIlIlIIIllIlIlIIl;
        }
        final String s = map.get("free");
        list.add("None");
        String[] split;
        for (int length = (split = s.split(",")).length, i = 0; i < length; ++i) {
            list.add(split[i]);
        }
        if (map.containsKey(Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.lllIIIIlIlIllIIlIIIl().toString())) {
            String[] split2;
            for (int length2 = (split2 = map.get(Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.lllIIIIlIlIllIIlIIIl().toString()).split(",")).length, j = 0; j < length2; ++j) {
                list.add(split2[j]);
            }
        }
        int n3 = 400;
        int n4 = 0;
        for (final String s2 : list) {
            if (n4 >= 3) {
                n3 = 400;
                n4 = 0;
            }
            this.IllIIlllIIIIlllIIlIl.add(new PlayerSetting(this, s2, 480, n3, 300, 90, s2.equals(Leaf.instance.saveConfig.loadConfig("Setting", this.lIIIlllIIIllIIIllIII.toLowerCase())), s2));
            n3 += 100;
            ++n4;
        }
        this.llllIIIlIlllIlIIIIIl = new CosmeticTypeSetting(this, "", 480, 700, 300, 90, Arrays.asList("Cape", "Wing", "Hat"), this.lIIIlllIIIllIIIllIII);
        this.lIIIIlIIIIIlllIllIII = new IlIlIIIllIllIIIIIllI(list, 945, 400, 32, 400, 3);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        final g g = new g(this.IlIlIIIllIIllIlllllI);
        final int llllIIIIlIIIlIlllIll = g.llllIIIIlIIIlIlllIll();
        final int ilIlIlIlIlllllllllIl = g.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/main.png"));
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, 0.0f, 0.0f, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, (float)llllIIIIlIIIlIlllIll, (float)ilIlIlIlIlllllllllIl);
        final Iterator<llllIIIlIlllIlIIIIIl> iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            iterator.next().IlIlIlIlIlllllllllIl();
        }
        for (int ilIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(); this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI); ++ilIlIIIllIllIIIIIllI) {
            ((leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI)this.IllIIlllIIIIlllIIlIl.get(ilIlIIIllIllIIIIIllI)).IlIlIlIlIlllllllllIl();
        }
        this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
        this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
        IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(Setting.llllIIIIlIIIlIlllIll(1300), Setting.IlIlIlIlIlllllllllIl(800), Setting.llllIIIIlIIIlIlllIll(200), 150.0f, 0.0f, (lllIIIIlllllIlIIllIl)this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final Iterator<llllIIIlIlllIlIIIIIl> iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(n, n2, n3);
        }
        for (int ilIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(); this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI); ++ilIlIIIllIllIIIIIllI) {
            ((leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI)this.IllIIlllIIIIlllIIlIl.get(ilIlIIIllIllIIIIIllI)).llllIIIIlIIIlIlllIll(n, n2, n3);
        }
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        this.IlIlIIIllIllIIIIIllI = new ArrayList();
        this.IllIIlllIIIIlllIIlIl = new ArrayList();
        super.llllIIIIlIIIlIlllIll(minecraft, n, n2);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        final int eventDWheel = Mouse.getEventDWheel();
        if (eventDWheel == 0) {
            this.llllIIIIlIIIlIlllIll(Mouse.getX() * this.llllIIllllIlIlIIIIll / this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIllIlIlIIIlIlIlIII - Mouse.getY() * this.IlIllIlIlIIIlIlIlIII / this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI - 1);
        }
        else if (eventDWheel < 0) {
            this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI();
        }
        else if (eventDWheel > 0) {
            this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final Iterator<llllIIIlIlllIlIIIIIl> iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(n, n2);
        }
        for (int ilIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(); this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI); ++ilIlIIIllIllIIIIIllI) {
            ((leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI)this.IllIIlllIIIIlllIIlIl.get(ilIlIIIllIllIIIIIllI)).llllIIIIlIIIlIlllIll(n, n2);
        }
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2);
    }
    
    public void o_() {
        this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll = null;
    }
}
