package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;
import org.lwjgl.input.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;

public class IllIlIllIllIlllIIlll extends lIIllIIIllllIlllIllI
{
    private final lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private final IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl;
    private lIIlIIIIIIIlIIlIlIIl llllIIIlIlllIlIIIIIl;
    private lIIlIIIIIIIlIIlIlIIl lIIIIlIIIIIlllIllIII;
    private IlIIIlIlIIIllIlIlIIl lIIIlllIIIllIIIllIII;
    private Predicate llIIlIIIlIIIllIlIIIl;
    
    public IllIlIllIllIlllIIlll(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.llIIlIIIlIIIllIlIIIl = (Predicate)new IIllIIIlIIlIlIlIIIII(this);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void n_() {
        Keyboard.enableRepeatEvents(true);
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 96 + 18, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("addServer.add", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 120 + 18, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.lIIIlllIIIllIIIllIII = new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 72, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("addServer.resourcePack", new Object[0])) + ": " + this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII()));
        (this.lIIIIlIIIIIlllIllIII = new lIIlIIIIIIIlIIlIlIIl(0, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 100, 66, 200, 20)).IlIlIlIlIlllllllllIl(true);
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
        (this.llllIIIlIlllIlIIIIIl = new lIIlIIIIIIIlIIlIlIIl(1, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 100, 106, 200, 20)).IllIIlllIIIIlllIIlIl(128);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl);
        this.IIlllIIlIllIllIlIIll.get(0).lIlIlIIIllIIllIIIllI = (this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().length() > 0 && this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().split(":").length > 0 && this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl().length() > 0);
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2) {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.values()[(this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().ordinal() + 1) % net.minecraft.client.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.values().length]);
                this.lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("addServer.resourcePack", new Object[0])) + ": " + this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII();
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(false, 0);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
                this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(true, 0);
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(c, n);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(c, n);
        if (n == 15) {
            this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(!this.lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI());
            this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(!this.llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI());
        }
        if (n == 28 || n == 156) {
            this.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll.get(0));
        }
        this.IIlllIIlIllIllIlIIll.get(0).lIlIlIIIllIIllIIIllI = (this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().length() > 0 && this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().split(":").length > 0 && this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl().length() > 0);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("addServer.title", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 17, 16777215);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("addServer.enterName", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 100, 53, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("addServer.enterIp", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 100, 94, 10526880);
        this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl();
        this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl();
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
