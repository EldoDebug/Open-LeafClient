package net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI;

import com.mojang.authlib.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.math.*;
import com.mojang.authlib.exceptions.*;

class IlIIIlIlIIIllIlIlIIl extends Thread
{
    final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final String s) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(s);
    }
    
    @Override
    public void run() {
        final GameProfile ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII;
        try {
            IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllllIIIIIlIIlllIlIl().hasJoinedServer(new GameProfile((UUID)null, ilIlIlIlIlllllllllIl.getName()), new BigInteger(lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl, this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlllIIIIlIIIlIlIlIIl().getPublic(), this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI)).toString(16)));
            if (this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII != null) {
                IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.info("UUID of player " + this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.getName() + " is " + this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.getId());
                IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl);
            }
            else if (this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIlIlIIIIIIIllII()) {
                IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.warn("Failed to verify username but will let them in anyway!");
                IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
                IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl);
            }
            else {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Failed to verify username!");
                IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.error("Username '" + this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.getName() + "' tried to join with an invalid session");
            }
        }
        catch (AuthenticationUnavailableException ex) {
            if (this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIlIlIIIIIIIllII()) {
                IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.warn("Authentication servers are down but will let them in anyway!");
                IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
                IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl);
            }
            else {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Authentication servers are down. Please try again later, sorry!");
                IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.error("Couldn't verify username because servers are unavailable");
            }
        }
    }
}
