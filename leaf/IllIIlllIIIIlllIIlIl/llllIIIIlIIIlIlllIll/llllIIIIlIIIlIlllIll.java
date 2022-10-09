package leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;

import java.util.*;
import leaf.setting.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import leaf.font.*;

public class llllIIIIlIIIlIlllIll extends llIIlIIIlIIIllIlIIIl
{
    protected List IlIlIlIlIlllllllllIl;
    protected int llIllIIIIIllIlIIIIlI;
    private String llllIIIIlIIIlIlllIll;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    
    public llllIIIIlIIIlIlllIll(final String llllIIIIlIIIlIlllIll, final int n, final int n2, final int n3, final int n4, final List ilIlIlIlIlllllllllIl, final String s) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = Setting.llllIIIIlIIIlIlllIll(n);
        this.IlIlIIIllIllIIIIIllI = Setting.IlIlIlIlIlllllllllIl(n2);
        this.IllIIlllIIIIlllIIlIl = Setting.llllIIIIlIIIlIlllIll(n3);
        this.llllIIIlIlllIlIIIIIl = Setting.IlIlIlIlIlllllllllIl(n4);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.indexOf(s);
        this.lIIIIlIIIIIlllIllIII = false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((float)(this.lIIIIlIIIIIlllIllIII ? 0 : 1), (float)(this.lIIIIlIIIIIlllIllIII ? 100 : 1), (float)(this.lIIIIlIIIIIlllIllIII ? 0 : 1), 1.0f);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/select.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, 0.0f, 0.0f, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, (float)this.IllIIlllIIIIlllIIlIl, (float)this.llllIIIlIlllIlIIIIIl);
        LoadFont.minecraftFontRenderer.llllIIIIlIIIlIlllIll("< " + this.IlIlIlIlIlllllllllIl.get(this.llIllIIIIIllIlIIIIlI) + " >", (float)(this.IlIIIlIlIIIllIlIlIIl + this.IllIIlllIIIIlllIIlIl / 2), (float)(this.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl / 2 - Setting.IlIlIlIlIlllllllllIl(10)), 0);
        LoadFont.minecraftFontRenderer.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, (double)(this.IlIIIlIlIIIllIlIlIIl - Setting.llllIIIIlIIIlIlllIll(210)), (float)(this.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl / 2 - Setting.IlIlIlIlIlllllllllIl(10)), 1);
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
            if (this.llIllIIIIIllIlIIIIlI + 1 < this.IlIlIlIlIlllllllllIl.size()) {
                ++this.llIllIIIIIllIlIIIIlI;
            }
            else {
                this.llIllIIIIIllIlIIIIlI = 0;
            }
            this.addSetting();
        }
    }
    
    @Override
    public void addSetting() {
    }
}
