package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.client.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.net.*;

class lIIIlllIIIllIIIllIII extends Thread
{
    final /* synthetic */ lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ String IlIlIlIlIlllllllllIl;
    private final /* synthetic */ int llIllIIIIIllIlIIIIlI;
    
    lIIIlllIIIllIIIllIII(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll, final String s, final String ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        super(s);
    }
    
    @Override
    public void run() {
        InetAddress byName = null;
        try {
            byName = InetAddress.getByName(this.IlIlIlIlIlllllllllIl);
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                return;
            }
            lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(byName, this.llIllIIIIIllIlIIIIlI, Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl()));
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                return;
            }
            this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, Minecraft.getMinecraft(), this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()));
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                return;
            }
            this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(47, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                return;
            }
            this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl().IlIlIIIllIllIIIIIllI()));
        }
        catch (UnknownHostException ex) {
            net.minecraft.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll();
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                return;
            }
            lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.error("Couldn't connect to world", (Throwable)ex);
            Minecraft.getMinecraft().IIlIlIlIIlIllIIIIIIl().IllIIlllIIIIlllIIlIl();
            net.minecraft.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, "connect.failed", new IIllIIllIIIlIlIIIIlI("disconnect.genericReason", new Object[] { "Unknown host '" + this.IlIlIlIlIlllllllllIl + "'" })));
        }
        catch (Exception ex2) {
            net.minecraft.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll();
            if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                return;
            }
            lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.error("Couldn't connect to world", (Throwable)ex2);
            String s = ex2.toString();
            if (byName != null) {
                s = s.replaceAll(String.valueOf(byName.toString()) + ":" + this.llIllIIIIIllIlIIIIlI, "");
            }
            net.minecraft.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, "connect.failed", new IIllIIllIIIlIlIIIIlI("disconnect.genericReason", new Object[] { s })));
        }
    }
}
