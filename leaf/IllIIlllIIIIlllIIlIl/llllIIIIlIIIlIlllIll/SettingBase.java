package leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;

import leaf.setting.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import leaf.font.*;

public class SettingBase extends llIIlIIIlIIIllIlIIIl
{
    protected boolean llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private String llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    
    public SettingBase(final String ilIlIlIlIlllllllllIl, final int n, final int n2, final int n3, final int n4, final boolean llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = Setting.llllIIIIlIIIlIlllIll(n);
        this.IlIlIIIllIllIIIIIllI = Setting.IlIlIlIlIlllllllllIl(n2);
        this.IllIIlllIIIIlllIIlIl = Setting.llllIIIIlIIIlIlllIll(n3);
        this.llllIIIlIlllIlIIIIIl = Setting.IlIlIlIlIlllllllllIl(n4);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = String.valueOf(llllIIIIlIIIlIlllIll);
        this.lIIIIlIIIIIlllIllIII = false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((float)(this.lIIIIlIIIIIlllIllIII ? 0 : 1), (float)(this.lIIIIlIIIIIlllIllIII ? 100 : 1), (float)(this.lIIIIlIIIIIlllIllIII ? 0 : 1), 1.0f);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/" + this.llIllIIIIIllIlIIIIlI + ".png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, 0.0f, 0.0f, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, (float)this.IllIIlllIIIIlllIIlIl, (float)this.llllIIIlIlllIlIIIIIl);
        LoadFont.minecraftFontRenderer.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, (double)(this.IlIIIlIlIIIllIlIlIIl - Setting.llllIIIIlIIIlIlllIll(410)), (float)(this.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl / 2 - Setting.IlIlIlIlIlllllllllIl(10)), 0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (n >= this.IlIIIlIlIIIllIlIlIIl && n <= this.IlIIIlIlIIIllIlIlIIl + this.IllIIlllIIIIlllIIlIl && n2 >= this.IlIlIIIllIllIIIIIllI && n2 <= this.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl) {
            this.lIIIIlIIIIIlllIllIII = true;
        }
        else {
            this.lIIIIlIIIIIlllIllIII = false;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (n >= this.IlIIIlIlIIIllIlIlIIl && n <= this.IlIIIlIlIIIllIlIlIIl + this.IllIIlllIIIIlllIIlIl && n2 >= this.IlIlIIIllIllIIIIIllI && n2 <= this.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl) {
            this.llllIIIIlIIIlIlllIll = !this.llllIIIIlIIIlIlllIll;
            this.llIllIIIIIllIlIIIIlI = String.valueOf(this.llllIIIIlIIIlIlllIll);
            this.addSetting();
        }
    }
    
    @Override
    public void addSetting() {
    }
}
