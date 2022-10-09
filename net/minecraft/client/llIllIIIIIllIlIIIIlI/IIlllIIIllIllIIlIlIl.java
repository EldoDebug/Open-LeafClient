package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import org.lwjgl.input.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class IIlllIIIllIllIIlIlIl extends lIIllIIIllllIlllIllI
{
    private final lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private final IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl;
    private lIIlIIIIIIIlIIlIlIIl llllIIIlIlllIlIIIIIl;
    
    public IIlllIIIllIllIIlIlIl(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void n_() {
        Keyboard.enableRepeatEvents(true);
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 96 + 12, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.select", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 120 + 12, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        (this.llllIIIlIlllIlIIIIIl = new lIIlIIIIIIIlIIlIlIIl(2, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 100, 116, 200, 20)).IllIIlllIIIIlllIIlIl(128);
        this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(true);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lllllIlIlIlllIlllIlI);
        this.IIlllIIlIllIllIlIIll.get(0).lIlIlIIIllIIllIIIllI = (this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().length() > 0 && this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().split(":").length > 0);
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
        this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lllllIlIlIlllIlllIlI = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
        this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(false, 0);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(true, 0);
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(c, n)) {
            this.IIlllIIlIllIllIlIIll.get(0).lIlIlIIIllIIllIIIllI = (this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().length() > 0 && this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().split(":").length > 0);
        }
        else if (n == 28 || n == 156) {
            this.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll.get(0));
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.direct", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("addServer.enterIp", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 100, 100, 10526880);
        this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl();
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
