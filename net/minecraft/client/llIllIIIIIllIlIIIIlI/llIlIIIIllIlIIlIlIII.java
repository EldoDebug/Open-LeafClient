package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIlIIIIllIlIIlIlIII extends lIIllIIIllllIlllIllI
{
    private final lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private IlIIIlIlIIIllIlIlIIl IllIIlllIIIIlllIIlIl;
    private IlIIIlIlIIIllIlIlIIl llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    
    public llIlIIIIllIlIIlIlIII(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI) {
        this.lIIIIlIIIIIlllIllIII = "survival";
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(101, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII - 28, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("lanServer.start", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(102, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII - 28, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.llllIIIlIlllIlIIIIIl = new IlIIIlIlIIIllIlIlIIl(104, this.llllIIllllIlIlIIIIll / 2 - 155, 100, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.gameMode", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.IllIIlllIIIIlllIIlIl = new IlIIIlIlIIIllIlIlIIl(103, this.llllIIllllIlIlIIIIll / 2 + 5, 100, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.allowCommands", new Object[0])));
        this.IlIlIIIllIllIIIIIllI();
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        this.llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.gameMode", new Object[0])) + " " + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.gameMode." + this.lIIIIlIIIIIlllIllIII, new Object[0]);
        this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectWorld.allowCommands", new Object[0])) + " ";
        if (this.lIIIlllIIIllIIIllIII) {
            this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl = String.valueOf(this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.on", new Object[0]);
        }
        else {
            this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl = String.valueOf(this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0]);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 102) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 104) {
            if (this.lIIIIlIIIIIlllIllIII.equals("spectator")) {
                this.lIIIIlIIIIIlllIllIII = "creative";
            }
            else if (this.lIIIIlIIIIIlllIllIII.equals("creative")) {
                this.lIIIIlIIIIIlllIllIII = "adventure";
            }
            else if (this.lIIIIlIIIIIlllIllIII.equals("adventure")) {
                this.lIIIIlIIIIIlllIllIII = "survival";
            }
            else {
                this.lIIIIlIIIIIlllIllIII = "spectator";
            }
            this.IlIlIIIllIllIIIIIllI();
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 103) {
            this.lIIIlllIIIllIIIllIII = !this.lIIIlllIIIllIIIllIII;
            this.IlIlIIIllIllIIIIIllI();
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 101) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            final String llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI.IIlllIIIlIlllIIlllII().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII), this.lIIIlllIIIllIIIllIII);
            IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII;
            if (llllIIIIlIIIlIlllIll != null) {
                ilIllIlIlIIIlIlIlIII = new IIllIIllIIIlIlIIIIlI("commands.publish.started", new Object[] { llllIIIIlIIIlIlllIll });
            }
            else {
                ilIllIlIlIIIlIlIlIII = new IlIlIIIIIIlllIlIllIl("commands.publish.failed");
            }
            this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("lanServer.title", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 50, 16777215);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("lanServer.otherPlayers", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 82, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
