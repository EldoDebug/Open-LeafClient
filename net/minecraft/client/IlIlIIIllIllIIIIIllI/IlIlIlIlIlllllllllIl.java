package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import java.util.concurrent.atomic.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import org.apache.logging.log4j.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIlIlIlllllllllIl extends lIIllIIIllllIlllIllI
{
    private static final AtomicInteger IlIlIIIllIllIIIIIllI;
    private static final Logger IllIIlllIIIIlllIIlIl;
    private IIlllIIlIllIllIlIIll llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private final lIIllIIIllllIlllIllI lIIIlllIIIllIIIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = new AtomicInteger(0);
        IllIIlllIIIIlllIIlIl = LogManager.getLogger();
    }
    
    public IlIlIlIlIlllllllllIl(final lIIllIIIllllIlllIllI liiIlllIIIllIIIllIII, final Minecraft ilIlIIIllIIllIlllllI, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = net.minecraft.client.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl);
        ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((llIIlIIIlIIIllIlIIIl)null);
        ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
    }
    
    public IlIlIlIlIlllllllllIl(final lIIllIIIllllIlllIllI liiIlllIIIllIIIllIII, final Minecraft ilIlIIIllIIllIlllllI, final String s, final int n) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((llIIlIIIlIIIllIlIIIl)null);
        this.llllIIIIlIIIlIlllIll(s, n);
    }
    
    private void llllIIIIlIIIlIlllIll(final String s, final int n) {
        IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.info("Connecting to " + s + ", " + n);
        new net.minecraft.client.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(this, "Server Connector #" + IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.incrementAndGet(), s, n).start();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIlIlllIlIIIIIl != null) {
            if (this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI()) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
            }
            else {
                this.llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl();
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 120 + 12, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
            this.lIIIIlIIIIIlllIllIII = true;
            if (this.llllIIIlIlllIlIIIIIl != null) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl("Aborted"));
            }
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        if (this.llllIIIlIlllIlIIIIIl == null) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("connect.connecting", new Object[0]), this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 2 - 50, 16777215);
        }
        else {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("connect.authorizing", new Object[0]), this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 2 - 50, 16777215);
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
