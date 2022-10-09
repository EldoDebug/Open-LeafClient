package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.net.*;

class l implements Runnable
{
    final /* synthetic */ k llllIIIIlIIIlIlllIll;
    
    l(final k llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void run() {
        try {
            this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        }
        catch (UnknownHostException ex) {
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI = -1L;
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI + "Can't resolve hostname";
        }
        catch (Exception ex2) {
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI = -1L;
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI + "Can't connect to server.";
        }
    }
}
