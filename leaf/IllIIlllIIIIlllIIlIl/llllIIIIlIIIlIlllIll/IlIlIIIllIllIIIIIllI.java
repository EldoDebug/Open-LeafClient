package leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;

import java.util.*;
import leaf.setting.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class IlIlIIIllIllIIIIIllI extends llIIlIIIlIIIllIlIIIl
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    
    public IlIlIIIllIllIIIIIllI(final List list, final int n, final int n2, final int n3, final int n4, final int liiiIlIIIIIlllIllIII) {
        this.IllIIlllIIIIlllIIlIl = 0;
        this.lIIIlllIIIllIIIllIII = 0;
        this.llllIIIlIlllIlIIIIIl = list.size();
        this.llllIIIIlIIIlIlllIll = Setting.llllIIIIlIIIlIlllIll(n);
        this.IlIlIlIlIlllllllllIl = Setting.IlIlIlIlIlllllllllIl(n2);
        this.llIllIIIIIllIlIIIIlI = Setting.llllIIIIlIIIlIlllIll(n3);
        this.IlIIIlIlIIIllIlIlIIl = Setting.IlIlIlIlIlllllllllIl(n4);
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl / (int)Math.ceil(this.llllIIIlIlllIlIIIIIl / (double)this.lIIIIlIIIIIlllIllIII);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        final int n = this.IlIlIlIlIlllllllllIl + this.IlIlIIIllIllIIIIIllI * this.lIIIlllIIIllIIIllIII;
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/scroll_main.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, 0.0f, 0.0f, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, (float)this.llIllIIIIIllIlIIIIlI, (float)this.IlIIIlIlIIIllIlIlIIl);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/scroll_bar.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, n, 0.0f, 0.0f, this.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI, (float)this.llIllIIIIIllIlIIIIlI, (float)this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        if (this.IllIIlllIIIIlllIIlIl + this.lIIIIlIIIIIlllIllIII < this.llllIIIlIlllIlIIIIIl) {
            this.IllIIlllIIIIlllIIlIl += this.lIIIIlIIIIIlllIllIII;
            ++this.lIIIlllIIIllIIIllIII;
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.IllIIlllIIIIlllIIlIl - this.lIIIIlIIIIIlllIllIII >= 0) {
            this.IllIIlllIIIIlllIIlIl -= this.lIIIIlIIIIIlllIllIII;
            --this.lIIIlllIIIllIIIllIII;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n) {
        return n < this.llllIIIlIlllIlIIIIIl && n < this.lIIIIlIIIIIlllIllIII * (this.lIIIlllIIIllIIIllIII + 1);
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
