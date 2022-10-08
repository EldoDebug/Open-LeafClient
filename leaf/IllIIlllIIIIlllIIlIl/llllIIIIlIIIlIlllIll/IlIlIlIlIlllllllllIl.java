package leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;

import leaf.mods.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import leaf.font.*;
import leaf.*;
import leaf.setting.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class IlIlIlIlIlllllllllIl extends llIIlIIIlIIIllIlIIIl
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private Mod IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    
    public IlIlIlIlIlllllllllIl(final Mod ilIlIIIllIllIIIIIllI, final int n, final int n2, final int n3, final int n4) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = Setting.llllIIIIlIIIlIlllIll(n);
        this.IlIlIlIlIlllllllllIl = Setting.IlIlIlIlIlllllllllIl(n2);
        this.llIllIIIIIllIlIIIIlI = Setting.llllIIIIlIIIlIlllIll(n3);
        this.IlIIIlIlIIIllIlIlIIl = Setting.IlIlIlIlIlllllllllIl(n4);
        this.IllIIlllIIIIlllIIlIl = false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((float)(this.IllIIlllIIIIlllIIlIl ? 0 : (this.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI() ? 1 : 100)), (float)(this.IllIIlllIIIIlllIIlIl ? 100 : (this.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI() ? 1 : 0)), (float)((!this.IllIIlllIIIIlllIIlIl && this.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI()) ? 1 : 0), 1.0f);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/mod.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, 0.0f, 0.0f, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, (float)this.llIllIIIIIllIlIIIIlI, (float)this.IlIIIlIlIIIllIlIlIIl);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/gear_small.png"));
        final int n = this.llllIIIlIlllIlIIIIIl ? Setting.llllIIIIlIIIlIlllIll(2) : 0;
        final int n2 = this.llllIIIlIlllIlIIIIIl ? Setting.llllIIIIlIIIlIlllIll(4) : 0;
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll + Setting.llllIIIIlIIIlIlllIll(60) - n, this.IlIlIlIlIlllllllllIl + Setting.IlIlIlIlIlllllllllIl(110) - n, 0.0f, 0.0f, Setting.llllIIIIlIIIlIlllIll(50) + n2, Setting.IlIlIlIlIlllllllllIl(50) + n2, (float)(Setting.llllIIIIlIIIlIlllIll(50) + n2), (float)(Setting.IlIlIlIlIlllllllllIl(50) + n2));
        LoadFont.minecraftFontRenderer.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), (float)(this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI / 2), (float)(this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl / 4), 0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (n >= this.llllIIIIlIIIlIlllIll && n <= this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI && n2 >= this.IlIlIlIlIlllllllllIl && n2 <= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl / 2) {
            this.IllIIlllIIIIlllIIlIl = true;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = false;
        }
        if (n >= this.llllIIIIlIIIlIlllIll && n <= this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI && n2 >= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl / 2 && n2 <= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIlIlllIlIIIIIl = true;
        }
        else {
            this.llllIIIlIlllIlIIIIIl = false;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (n >= this.llllIIIIlIIIlIlllIll && n <= this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI && n2 >= this.IlIlIlIlIlllllllllIl && n2 <= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl / 2) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
            Leaf.instance.saveConfig.saveConfig(this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "enable", String.valueOf(this.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI()));
        }
        else if (n >= this.llllIIIIlIIIlIlllIll && n <= this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI && n2 >= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl / 2 && n2 <= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl && !this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().equals("FreeLook") && !this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl().equals("Old Animation")) {
            Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new HudSetting(this.IlIlIIIllIllIIIIIllI));
        }
    }
}
