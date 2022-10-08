package leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import leaf.setting.*;
import net.minecraft.client.*;
import java.net.*;
import javax.imageio.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import leaf.font.*;

public class lIIIlllIIIllIIIllIII extends llIIlIIIlIIIllIlIIIl
{
    private Session llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    
    public lIIIlllIIIllIIIllIII(final Session llllIIIIlIIIlIlllIll, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = Setting.llllIIIIlIIIlIlllIll(n);
        this.llIllIIIIIllIlIIIIlI = Setting.IlIlIlIlIlllllllllIl(n2);
        this.IlIIIlIlIIIllIlIlIIl = Setting.llllIIIIlIIIlIlllIll(308);
        this.IlIlIIIllIllIIIIIllI = Setting.IlIlIlIlIlllllllllIl(80);
        try {
            this.IllIIlllIIIIlllIIlIl = Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), new IlIlIlIlIlllllllllIl(ImageIO.read(new URL("https://minotar.net/avatar/" + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()))));
        }
        catch (Exception ex) {}
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/button/session.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, 0.0f, 0.0f, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, (float)this.IlIIIlIlIIIllIlIlIIl, (float)this.IlIlIIIllIllIIIIIllI);
        LoadFont.minecraftFontRenderer.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), (double)(this.IlIlIlIlIlllllllllIl + (this.IlIlIIIllIllIIIIIllI - Setting.IlIlIlIlIlllllllllIl(30)) + Setting.llllIIIIlIIIlIlllIll(45)), (float)(this.llIllIIIIIllIlIIIIlI + this.IlIlIIIllIllIIIIIllI / 2 - Setting.IlIlIlIlIlllllllllIl(10)), -1);
        if (this.IllIIlllIIIIlllIIlIl != null) {
            Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl + Setting.llllIIIIlIIIlIlllIll(30), this.llIllIIIIIllIlIIIIlI + Setting.IlIlIlIlIlllllllllIl(16), 0.0f, 0.0f, this.IlIlIIIllIllIIIIIllI - Setting.IlIlIlIlIlllllllllIl(30), this.IlIlIIIllIllIIIIIllI - Setting.IlIlIlIlIlllllllllIl(30), (float)(this.IlIlIIIllIllIIIIIllI - Setting.IlIlIlIlIlllllllllIl(30)), (float)(this.IlIlIIIllIllIIIIIllI - Setting.IlIlIlIlIlllllllllIl(30)));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
}
