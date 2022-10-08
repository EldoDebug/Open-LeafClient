package leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;

import leaf.setting.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import leaf.font.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;

public class llIllIIIIIllIlIIIIlI extends llIIlIIIlIIIllIlIIIl
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private String IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    
    public llIllIIIIIllIlIIIIlI(final String s, final int n, final int n2, final int n3, final int n4, final boolean llllIIIlIlllIlIIIIIl) {
        this.IllIIlllIIIIlllIIlIl = s;
        if (s.contains("/")) {
            this.IlIlIIIllIllIIIIIllI = s.substring(s.indexOf("/") + 1, s.indexOf("."));
        }
        else {
            this.IlIlIIIllIllIIIIIllI = s;
        }
        this.llllIIIIlIIIlIlllIll = Setting.llllIIIIlIIIlIlllIll(n);
        this.IlIlIlIlIlllllllllIl = Setting.IlIlIlIlIlllllllllIl(n2);
        this.llIllIIIIIllIlIIIIlI = Setting.llllIIIIlIIIlIlllIll(n3);
        this.IlIIIlIlIIIllIlIlIIl = Setting.IlIlIlIlIlllllllllIl(n4);
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((float)(this.lIIIIlIIIIIlllIllIII ? 0 : (this.llllIIIlIlllIlIIIIIl ? 1 : 100)), (float)(this.lIIIIlIIIIIlllIllIII ? 100 : (this.llllIIIlIlllIlIIIIIl ? 1 : 0)), (float)((!this.lIIIIlIIIIIlllIllIII && this.llllIIIlIlllIlIIIIIl) ? 1 : 0), 1.0f);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/select.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, 0.0f, 0.0f, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, (float)this.llIllIIIIIllIlIIIIlI, (float)this.IlIIIlIlIIIllIlIlIIl);
        LoadFont.minecraftFontRenderer.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, (float)(this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI / 2), (float)(this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl / 2 - Setting.IlIlIlIlIlllllllllIl(10)), 0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (n >= this.llllIIIIlIIIlIlllIll && n <= this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI && n2 >= this.IlIlIlIlIlllllllllIl && n2 <= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl) {
            this.lIIIIlIIIIIlllIllIII = true;
        }
        else {
            this.lIIIIlIIIIIlllIllIII = false;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (n >= this.llllIIIIlIIIlIlllIll && n <= this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI && n2 >= this.IlIlIlIlIlllllllllIl && n2 <= this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl) {
            Minecraft.getMinecraft().IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll((IlIlIlIlIlllllllllIl)lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("gui.button.press"), 1.0f));
            this.llllIIIIlIIIlIlllIll();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
}
