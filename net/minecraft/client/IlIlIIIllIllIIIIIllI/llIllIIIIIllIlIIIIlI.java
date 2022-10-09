package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.net.*;

class llIllIIIIIllIlIIIIlI extends Thread
{
    final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ String IlIlIlIlIlllllllllIl;
    private final /* synthetic */ int llIllIIIIIllIlIIIIlI;
    
    llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final String s, final String ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        super(s);
    }
    
    @Override
    public void run() {
        InetAddress byName = null;
        try {
            if (this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII) {
                return;
            }
            byName = InetAddress.getByName(this.IlIlIlIlIlllllllllIl);
            net.minecraft.client.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(byName, this.llIllIIIIIllIlIIIIlI, this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl()));
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII));
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(47, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.IIIIIllIIIIlIIIIllIl().IlIlIIIllIllIIIIIllI()));
        }
        catch (UnknownHostException ex) {
            if (this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII) {
                return;
            }
            net.minecraft.client.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.error("Couldn't connect to server", (Throwable)ex);
            this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII, "connect.failed", new IIllIIllIIIlIlIIIIlI("disconnect.genericReason", new Object[] { "Unknown host" })));
        }
        catch (Exception ex2) {
            if (this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII) {
                return;
            }
            net.minecraft.client.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.error("Couldn't connect to server", (Throwable)ex2);
            String s = ex2.toString();
            if (byName != null) {
                s = s.replaceAll(String.valueOf(byName.toString()) + ":" + this.llIllIIIIIllIlIIIIlI, "");
            }
            this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII, "connect.failed", new IIllIIllIIIlIlIIIIlI("disconnect.genericReason", new Object[] { s })));
        }
    }
}
