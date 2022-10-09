package leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.*;
import leaf.*;
import leaf.mods.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import org.lwjgl.input.*;

public class lIIIIlIIIIIlllIllIII
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    
    public lIIIIlIIIIIlllIllIII(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final String llllIIIlIlllIlIIIIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = false;
        this.lIIIlllIIIllIIIllIII = false;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll / this.IlIlIIIllIllIIIIIllI();
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl / this.IlIlIIIllIllIIIIIllI();
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return (Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIlIlllIlIlllIlIllll == 0) ? 4 : Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIlIlllIlIlllIlIllll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return n >= this.llllIIIIlIIIlIlllIll() && n <= this.llllIIIIlIIIlIlllIll() + this.llIllIIIIIllIlIIIIlI() && n2 >= this.IlIlIlIlIlllllllllIl() && n2 <= this.IlIlIlIlIlllllllllIl() + this.IlIIIlIlIIIllIlIlIIl();
    }
    
    void IllIIlllIIIIlllIIlIl() {
        final g g = new g(Minecraft.getMinecraft());
        if (this.llllIIIIlIIIlIlllIll() <= 0) {
            this.llllIIIIlIIIlIlllIll += 2;
        }
        else if (this.llllIIIIlIIIlIlllIll() + this.llIllIIIIIllIlIIIIlI() >= g.llllIIIIlIIIlIlllIll()) {
            this.llllIIIIlIIIlIlllIll -= 2;
        }
        else if (this.IlIlIlIlIlllllllllIl() <= 0) {
            this.IlIlIlIlIlllllllllIl += 2;
        }
        else {
            if (this.IlIlIlIlIlllllllllIl() + this.IlIIIlIlIIIllIlIlIIl() < g.IlIlIlIlIlllllllllIl()) {
                return;
            }
            this.IlIlIlIlIlllllllllIl -= 2;
        }
        Leaf.instance.configManager.saveConfig(this.llllIIIlIlllIlIIIIIl, "x", String.valueOf(this.llllIIIIlIIIlIlllIll));
        Leaf.instance.configManager.saveConfig(this.llllIIIlIlllIlIIIIIl, "y", String.valueOf(this.IlIlIlIlIlllllllllIl));
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        final ArrayList<String> list = new ArrayList<String>();
        for (final Mod mod : Leaf.instance.modManager.mods) {
            if (mod.lIlIlIIIllIIllIIIllI() && mod.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(n, n2)) {
                list.add(mod.getName());
            }
        }
        return !list.isEmpty() && list.get(0).equals(this.llllIIIlIlllIlIIIIIl);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        this.llIllIIIIIllIlIIIIlI(n, n2);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), this.IlIlIlIlIlllllllllIl(), this.llllIIIIlIIIlIlllIll() + this.llIllIIIIIllIlIIIIlI(), this.IlIlIlIlIlllllllllIl() + this.IlIIIlIlIIIllIlIlIIl(), 0);
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), this.llllIIIIlIIIlIlllIll() + this.llIllIIIIIllIlIIIIlI(), this.IlIlIlIlIlllllllllIl(), this.lIIIIlIIIIIlllIllIII ? -256 : -16711936);
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), this.llllIIIIlIIIlIlllIll() + this.llIllIIIIIllIlIIIIlI(), this.IlIlIlIlIlllllllllIl() + this.IlIIIlIlIIIllIlIlIIl(), this.lIIIIlIIIIIlllIllIII ? -256 : -16711936);
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(), this.IlIlIlIlIlllllllllIl() + this.IlIIIlIlIIIllIlIlIIl(), this.IlIlIlIlIlllllllllIl(), this.lIIIIlIIIIIlllIllIII ? -256 : -16711936);
        Minecraft.getMinecraft().lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll() + this.llIllIIIIIllIlIIIIlI(), this.IlIlIlIlIlllllllllIl() + this.IlIIIlIlIIIllIlIlIIl(), this.IlIlIlIlIlllllllllIl(), this.lIIIIlIIIIIlllIllIII ? -256 : -16711936);
        if (this.llllIIIIlIIIlIlllIll(n, n2)) {
            this.IlIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll - n * this.IlIlIIIllIllIIIIIllI();
            this.IllIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl - n2 * this.IlIlIIIllIllIIIIIllI();
        }
    }
    
    private void llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        final boolean llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, n, n2);
        if (llllIIIIlIIIlIlllIll && !this.lIIIIlIIIIIlllIllIII && !this.lIIIlllIIIllIIIllIII) {
            if (!Mouse.isButtonDown(0)) {
                this.lIIIlllIIIllIIIllIII = true;
            }
        }
        else if (!llllIIIIlIIIlIlllIll && !this.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII) {
            this.lIIIlllIIIllIIIllIII = false;
        }
        else if (llllIIIIlIIIlIlllIll && !this.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII && Mouse.isButtonDown(0)) {
            this.lIIIIlIIIIIlllIllIII = true;
        }
        this.IllIIlllIIIIlllIIlIl();
        if (this.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII) {
            this.llllIIIIlIIIlIlllIll = n * this.IlIlIIIllIllIIIIIllI() + this.IlIlIIIllIllIIIIIllI;
            this.IlIlIlIlIlllllllllIl = n2 * this.IlIlIIIllIllIIIIIllI() + this.IllIIlllIIIIlllIIlIl;
            if (!Mouse.isButtonDown(0)) {
                this.lIIIIlIIIIIlllIllIII = false;
                this.lIIIlllIIIllIIIllIII = false;
                Leaf.instance.configManager.saveConfig(this.llllIIIlIlllIlIIIIIl, "x", String.valueOf(this.llllIIIIlIIIlIlllIll));
                Leaf.instance.configManager.saveConfig(this.llllIIIlIlllIlIIIIIl, "y", String.valueOf(this.IlIlIlIlIlllllllllIl));
            }
        }
    }
}
