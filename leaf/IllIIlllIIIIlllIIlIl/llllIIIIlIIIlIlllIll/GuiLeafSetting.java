package leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;

import leaf.setting.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import leaf.font.*;
import org.lwjgl.input.*;

public class GuiLeafSetting extends llIIlIIIlIIIllIlIIIl
{
    protected int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    
    public GuiLeafSetting(final String llllIIIlIlllIlIIIIIl, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl = Setting.llllIIIIlIIIlIlllIll(n + n6);
        this.llIllIIIIIllIlIIIIlI = Setting.IlIlIlIlIlllllllllIl(n2);
        this.IlIIIlIlIIIllIlIlIIl = Setting.llllIIIIlIIIlIlllIll(n3);
        this.IlIlIIIllIllIIIIIllI = Setting.IlIlIlIlIlllllllllIl(n4);
        this.llllIIIIlIIIlIlllIll = Setting.llllIIIIlIIIlIlllIll(n5);
        this.IllIIlllIIIIlllIIlIl = n6 * 2;
        this.lIIIIlIIIIIlllIllIII = false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/bar_main.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, 0.0f, 0.0f, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, (float)this.IlIIIlIlIIIllIlIlIIl, (float)this.IlIlIIIllIllIIIIIllI);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((float)(this.lIIIIlIIIIIlllIllIII ? 0 : 1), (float)(this.lIIIIlIIIIIlllIllIII ? 100 : 1), (float)(this.lIIIIlIIIIIlllIllIII ? 0 : 1), 1.0f);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/bar_point.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl + this.llllIIIIlIIIlIlllIll - this.IlIlIIIllIllIIIIIllI / 2, this.llIllIIIIIllIlIIIIlI, 0.0f, 0.0f, this.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI, (float)this.IlIlIIIllIllIIIIIllI, (float)this.IlIlIIIllIllIIIIIllI);
        LoadFont.minecraftFontRenderer.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl, (double)(this.IlIlIlIlIlllllllllIl - Setting.llllIIIIlIIIlIlllIll(250 + this.IllIIlllIIIIlllIIlIl)), (float)(this.llIllIIIIIllIlIIIIlI + this.IlIlIIIllIllIIIIIllI / 2 - Setting.IlIlIlIlIlllllllllIl(10)), 0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (n >= this.IlIlIlIlIlllllllllIl && n <= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl && n2 >= this.llIllIIIIIllIlIIIIlI && n2 <= this.llIllIIIIIllIlIIIIlI + this.IlIlIIIllIllIIIIIllI) {
            this.lIIIIlIIIIIlllIllIII = true;
        }
        else {
            this.lIIIIlIIIIIlllIllIII = false;
        }
        if (this.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII) {
            if (Mouse.isButtonDown(0)) {
                this.llllIIIIlIIIlIlllIll = n - this.IlIlIlIlIlllllllllIl;
            }
            else {
                this.lIIIlllIIIllIIIllIII = false;
                this.llllIIIIlIIIlIlllIll();
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (n >= this.IlIlIlIlIlllllllllIl && n <= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl && n2 >= this.llIllIIIIIllIlIIIIlI && n2 <= this.llIllIIIIIllIlIIIIlI + this.IlIlIIIllIllIIIIIllI) {
            this.lIIIlllIIIllIIIllIII = true;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
}
