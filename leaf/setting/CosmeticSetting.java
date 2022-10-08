package leaf.setting;

import java.awt.*;
import leaf.font.*;
import leaf.*;
import leaf.mods.*;
import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;

public class CosmeticSetting extends lIIllIIIllllIlllIllI
{
    private ArrayList IlIlIIIllIllIIIIIllI;
    private ArrayList IllIIlllIIIIlllIIlIl;
    private ArrayList llllIIIlIlllIlIIIIIl;
    private IlIlIIIllIllIIIIIllI lIIIIlIIIIIlllIllIII;
    
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
        this.llllIIIlIlllIlIIIIIl.addAll(Leaf.instance.modManager.llllIIIIlIIIlIlllIll);
        this.llllIIIlIlllIlIIIIIl.add(Leaf.instance.modManager.IlIIIlIlIIIllIlIlIIl);
        this.llllIIIlIlllIlIIIIIl.add(Leaf.instance.modManager.llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl.add(Leaf.instance.modManager.IllIIlllIIIIlllIIlIl);
        this.llllIIIlIlllIlIIIIIl.add(Leaf.instance.modManager.lIIIIlIIIIIlllIllIII);
        this.llllIIIlIlllIlIIIIIl.add(Leaf.instance.modManager.llIllIlIIIIllIlIIllI);
        this.llllIIIlIlllIlIIIIIl.add(Leaf.instance.modManager.lIlIlIIIllIIllIIIllI);
        this.llllIIIlIlllIlIIIIIl.add(Leaf.instance.modManager.IlIlIIIllIIllIlllllI);
        int n3 = 0;
        int n4 = 400;
        int n5 = 0;
        for (final Mod mod : this.llllIIIlIlllIlIIIIIl) {
            if (n3 >= 4) {
                n3 = 0;
                n4 += 220;
            }
            if (n5 >= 8) {
                n3 = 0;
                n4 = 400;
                n5 = 0;
            }
            this.IllIIlllIIIIlllIIlIl.add(new IlIlIlIlIlllllllllIl(mod, this.IlIlIIIllIllIIIIIllI.get(n3).llIllIIIIIllIlIIIIlI(), n4, 170, 182));
            ++n3;
            ++n5;
        }
        this.lIIIIlIIIIIlllIllIII = new IlIlIIIllIllIIIIIllI(this.llllIIIlIlllIlIIIIIl, 945, 400, 32, 400, 8);
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
            ((IlIlIlIlIlllllllllIl)this.IllIIlllIIIIlllIIlIl.get(ilIlIIIllIllIIIIIllI)).IlIlIlIlIlllllllllIl();
        }
        this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final Iterator<llllIIIlIlllIlIIIIIl> iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(n, n2, n3);
        }
        for (int ilIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(); this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI); ++ilIlIIIllIllIIIIIllI) {
            ((IlIlIlIlIlllllllllIl)this.IllIIlllIIIIlllIIlIl.get(ilIlIIIllIllIIIIIllI)).llllIIIIlIIIlIlllIll(n, n2, n3);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        this.IlIlIIIllIllIIIIIllI = new ArrayList();
        this.IllIIlllIIIIlllIIlIl = new ArrayList();
        this.llllIIIlIlllIlIIIIIl = new ArrayList();
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
            ((IlIlIlIlIlllllllllIl)this.IllIIlllIIIIlllIIlIl.get(ilIlIIIllIllIIIIIllI)).llllIIIIlIIIlIlllIll(n, n2);
        }
    }
    
    public void o_() {
        this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll = null;
    }
}
