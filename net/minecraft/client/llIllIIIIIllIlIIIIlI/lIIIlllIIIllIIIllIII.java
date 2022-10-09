package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import org.apache.logging.log4j.*;
import org.lwjgl.input.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIlllIIIllIIIllIII extends lIIllIIIllllIlllIllI
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private lIIlIIIIIIIlIIlIlIIl IllIIlllIIIIlllIIlIl;
    private lIIlIIIIIIIlIIlIlIIl llllIIIlIlllIlIIIIIl;
    private final IlIlIIIllIllIIIIIllI lIIIIlIIIIIlllIllIII;
    private IlIIIlIlIIIllIlIlIIl lIIIlllIIIllIIIllIII;
    private IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl;
    private IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
    }
    
    public lIIIlllIIIllIIIllIII(final IlIlIIIllIllIIIIIllI liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void n_() {
        Keyboard.enableRepeatEvents(true);
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(this.lIIIlllIIIllIIIllIII = new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 4 - 150, this.IlIllIlIlIIIlIlIlIII / 4 + 120 + 12, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.llIIlIIIlIIIllIlIIIl = new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 + 4, this.IlIllIlIlIIIlIlIlIII / 4 + 120 + 12, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.llIllIlIIIIllIlIIllI = new IlIIIlIlIIIllIlIlIIl(4, this.llllIIllllIlIlIIIIll / 2 + 150 - 20, 150, 20, 20, "O"));
        (this.IllIIlllIIIIlllIIlIl = new lIIlIIIIIIIlIIlIlIIl(2, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 150, 50, 300, 20)).IllIIlllIIIIlllIIlIl(32767);
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(true);
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII());
        (this.llllIIIlIlllIlIIIIIl = new lIIlIIIIIIIlIIlIlIIl(3, this.IIllIIllIIIlIlIIIIlI, this.llllIIllllIlIlIIIIll / 2 - 150, 150, 276, 20)).IllIIlllIIIIlllIIlIl(32767);
        this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(false);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll("-");
        this.lIlIlIIIllIIllIIIllI = this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI();
        this.IlIlIIIllIllIIIIIllI();
        this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = (this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().trim().length() > 0);
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI);
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
                final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(Unpooled.buffer());
                llllllIllIllIlIllllI.writeByte(this.lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI());
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
                llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl());
                llllllIllIllIlIllllI.writeBoolean(this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI());
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new llIIIlIlIllIIlIlIlII("MC|AdvCdm", llllllIllIllIlIllllI));
                if (!this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI()) {
                    this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl((llIIIIIIlIllIIlIIIll)null);
                }
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 4) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(!this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI());
                this.IlIlIIIllIllIIIIIllI();
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(c, n);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(c, n);
        this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = (this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl().trim().length() > 0);
        if (n != 28 && n != 156) {
            if (n == 1) {
                this.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl);
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("advMode.setCommand", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("advMode.command", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 150, 37, 10526880);
        this.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl();
        final int n4 = 75;
        int n5 = 0;
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("advMode.nearestPlayer", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 150, n4 + n5++ * this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("advMode.randomPlayer", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 150, n4 + n5++ * this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("advMode.allPlayers", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 150, n4 + n5++ * this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("advMode.allEntities", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 150, n4 + n5++ * this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, "", this.llllIIllllIlIlIIIIll / 2 - 150, n4 + n5++ * this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, 10526880);
        if (this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl().length() > 0) {
            this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("advMode.previousOutput", new Object[0]), this.llllIIllllIlIlIIIIll / 2 - 150, n4 + n5 * this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll + 16, 10526880);
            this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl();
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        if (this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI()) {
            this.llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl = "O";
            if (this.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII() != null) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII().lIIIIlIIIIIlllIllIII());
            }
        }
        else {
            this.llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl = "X";
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll("-");
        }
    }
}
