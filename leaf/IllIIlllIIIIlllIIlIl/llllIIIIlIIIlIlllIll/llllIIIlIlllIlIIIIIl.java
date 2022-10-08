package leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;
import leaf.setting.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class llllIIIlIlllIlIIIIIl extends llIIlIIIlIIIllIlIIIl
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    
    public llllIIIlIlllIlIIIIIl(final String illIIlllIIIIlllIIlIl, final int ilIlIlIlIlllllllllIl, final int n, final int n2, final int n3) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = Setting.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI = Setting.IlIlIlIlIlllllllllIl(n);
        this.IlIIIlIlIIIllIlIlIIl = Setting.llllIIIIlIIIlIlllIll(n2);
        this.IlIlIIIllIllIIIIIllI = Setting.IlIlIlIlIlllllllllIl(n3);
        this.llllIIIlIlllIlIIIIIl = false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((float)(this.llllIIIlIlllIlIIIIIl ? 0 : 1), (float)(this.llllIIIlIlllIlIIIIIl ? 100 : 1), (float)(this.llllIIIlIlllIlIIIIIl ? 0 : 1), 1.0f);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/button/" + this.IllIIlllIIIIlllIIlIl + ".png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI, 0.0f, 0.0f, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, (float)this.IlIIIlIlIIIllIlIlIIl, (float)this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (n >= this.llllIIIIlIIIlIlllIll && n <= this.llllIIIIlIIIlIlllIll + this.IlIIIlIlIIIllIlIlIIl && n2 >= this.llIllIIIIIllIlIIIIlI && n2 <= this.llIllIIIIIllIlIIIIlI + this.IlIlIIIllIllIIIIIllI) {
            this.llllIIIlIlllIlIIIIIl = true;
        }
        else {
            this.llllIIIlIlllIlIIIIIl = false;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (n >= this.llllIIIIlIIIlIlllIll && n <= this.llllIIIIlIIIlIlllIll + this.IlIIIlIlIIIllIlIlIIl && n2 >= this.llIllIIIIIllIlIIIIlI && n2 <= this.llIllIIIIIllIlIIIIlI + this.IlIlIIIllIllIIIIIllI) {
            Minecraft.getMinecraft().IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("gui.button.press"), 1.0f));
            if (this.IllIIlllIIIIlllIIlIl.equals("mod")) {
                Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new CosmeticSetting());
            }
            else if (this.IllIIlllIIIIlllIIlIl.equals("cosmetic")) {
                Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new PlayerCosmeticSetting("Cape"));
            }
            else if (this.IllIIlllIIIIlllIIlIl.equals("location")) {
                Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new ModList());
            }
            else if (this.IllIIlllIIIIlllIIlIl.equals("setting")) {
                Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new RenderSetting());
            }
            else if (this.IllIIlllIIIIlllIIlIl.equals("single")) {
                Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new lllllIlIlIlllIlllIlI());
            }
            else if (this.IllIIlllIIIIlllIIlIl.equals("multi")) {
                Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new IlIllllIIlIIlIlIlIll());
            }
            else if (this.IllIIlllIIIIlllIIlIl.equals("account")) {
                Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new lllIlIIIIIlIlllllIlI());
            }
            else if (this.IllIIlllIIIIlllIIlIl.equals("settings")) {
                Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new IllIlIIllIllIIlIllII(null, Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll));
            }
            else if (this.IllIIlllIIIIlllIIlIl.equals("close")) {
                Minecraft.getMinecraft().IlIlIIIllIIllIlllllI();
            }
        }
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
