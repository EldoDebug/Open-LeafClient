package leaf.setting;

import java.awt.*;
import leaf.font.*;
import leaf.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;

public class RenderSetting extends lIIllIIIllllIlllIllI
{
    private ArrayList IlIlIIIllIllIIIIIllI;
    private IlIlIIIllIllIIIIIllI IllIIlllIIIIlllIIlIl;
    
    @Override
    public void n_() {
        final g g = new g(this.IlIlIIIllIIllIlllllI);
        final int n = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        final int n2 = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        Setting.llllIIIIlIIIlIlllIll(g.IlIlIIIllIllIIIIIllI(), (n / g.IlIlIIIllIllIIIIIllI() > g.llllIIIIlIIIlIlllIll()) ? (g.llllIIIIlIIIlIlllIll() / (n / (double)g.IlIlIIIllIllIIIIIllI())) : 1.0, (n2 / g.IlIlIIIllIllIIIIIllI() > g.IlIlIlIlIlllllllllIl()) ? (g.IlIlIlIlIlllllllllIl() / (n2 / (double)g.IlIlIIIllIllIIIIIllI())) : 1.0, (n < 1920) ? (n / 1920.0) : 1.0, (n2 < 1080) ? (n2 / 1080.0) : 1.0);
        LoadFont.minecraftFontRenderer.llllIIIIlIIIlIlllIll(Setting.llllIIIIlIIIlIlllIll());
        this.IlIlIIIllIllIIIIIllI.add(new FullbrightSetting(this, "Enable FullBright", 1090, 310, 100, 60, Leaf.instance.modManager.IIlIIIIlllIlllllIlII));
        this.IlIlIIIllIllIIIIIllI.add(new ClearGlassSetting(this, "Enable Clear Glass", 1090, 410, 100, 60, Leaf.instance.modManager.IlIlIllllllllIIIIlII));
        this.IlIlIIIllIllIIIIIllI.add(new FireOverlaySetting(this, "Hide Entity Burning", 1090, 510, 100, 60, Leaf.instance.modManager.IIIlIIlIIIIlllIlllII));
        this.IlIlIIIllIllIIIIIllI.add(new EnchantSetting(this, "Disable Enchantment Glint", 1090, 610, 100, 60, Leaf.instance.modManager.IlllllllIIIlIIIlIlII));
        this.IlIlIIIllIllIIIIIllI.add(new ItemSetting(this, "Enable Animation of Dropped Items", 1090, 710, 100, 60, Leaf.instance.modManager.IIlllIlIIllIlIlIlIIl));
        this.IlIlIIIllIllIIIIIllI.add(new PlayerListSetting(this, "Hide NameTag Icon", 1090, 310, 100, 60, Leaf.instance.modManager.IlIlIIIIIIlllIlIllIl));
        this.IlIlIIIllIllIIIIIllI.add(new CapeSetting(this, "Hide Cape Cosmetics", 1090, 410, 100, 60, Leaf.instance.modManager.IIllIIllIIIlIlIIIIlI));
        this.IlIlIIIllIllIIIIIllI.add(new WingSetting(this, "Hide Wing Cosmetics", 1090, 510, 100, 60, Leaf.instance.modManager.IIIlIIIlIlIIlllIIlll));
        this.IlIlIIIllIllIIIIIllI.add(new HatSetting(this, "Hide Hat Cosmetics", 1090, 610, 100, 60, Leaf.instance.modManager.IlIlIIIlIIlIlIIlllIl));
        this.IllIIlllIIIIlllIIlIl = new IlIlIIIllIllIIIIIllI(this.IlIlIIIllIllIIIIIllI, 1230, 310, 32, 460, 5);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        final g g = new g(this.IlIlIIIllIIllIlllllI);
        final int llllIIIIlIIIlIlllIll = g.llllIIIIlIIIlIlllIll();
        final int ilIlIlIlIlllllllllIl = g.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/main_mod.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, 0.0f, 0.0f, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, (float)llllIIIIlIIIlIlllIll, (float)ilIlIlIlIlllllllllIl);
        for (int ilIlIIIllIllIIIIIllI = this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI(); this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI); ++ilIlIIIllIllIIIIIllI) {
            ((llIIlIIIlIIIllIlIIIl)this.IlIlIIIllIllIIIIIllI.get(ilIlIIIllIllIIIIIllI)).IlIlIlIlIlllllllllIl();
        }
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        for (int ilIlIIIllIllIIIIIllI = this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI(); this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI); ++ilIlIIIllIllIIIIIllI) {
            ((llIIlIIIlIIIllIlIIIl)this.IlIlIIIllIllIIIIIllI.get(ilIlIIIllIllIIIIIllI)).llllIIIIlIIIlIlllIll(n, n2, n3);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        this.IlIlIIIllIllIIIIIllI = new ArrayList();
        super.llllIIIIlIIIlIlllIll(minecraft, n, n2);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        final int eventDWheel = Mouse.getEventDWheel();
        if (eventDWheel == 0) {
            this.llllIIIIlIIIlIlllIll(Mouse.getX() * this.llllIIllllIlIlIIIIll / this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIllIlIlIIIlIlIlIII - Mouse.getY() * this.IlIllIlIlIIIlIlIlIII / this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI - 1);
        }
        else if (eventDWheel < 0) {
            this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
        }
        else if (eventDWheel > 0) {
            this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        for (int ilIlIIIllIllIIIIIllI = this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI(); this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI); ++ilIlIIIllIllIIIIIllI) {
            ((llIIlIIIlIIIllIlIIIl)this.IlIlIIIllIllIIIIIllI.get(ilIlIIIllIllIIIIIllI)).llllIIIIlIIIlIlllIll(n, n2);
        }
    }
    
    @Override
    public void o_() {
        this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll = null;
    }
}
