package net.minecraft.client.IlIlIIIllIIllIlllllI;

import com.mojang.authlib.properties.*;
import java.net.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import tv.twitch.*;
import java.io.*;
import com.google.gson.*;

class IlIlIllllllllIIIIlII extends Thread
{
    final /* synthetic */ IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ Property IlIlIlIlIlllllllllIl;
    
    IlIlIllllllllIIIIlII(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll, final String s, final Property ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s);
    }
    
    @Override
    public void run() {
        try {
            final JsonObject llIIlIIIlIIIllIlIIIl = IIlllllIllIllIlIlIII.llIIlIIIlIIIllIlIIIl(IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(new JsonParser().parse(IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll(new URL("https://api.twitch.tv/kraken?oauth_token=" + URLEncoder.encode(this.IlIlIlIlIlllllllllIl.getValue(), "UTF-8")))), "Response"), "token");
            if (IIlllllIllIllIlIlIII.llllIIIlIlllIlIIIIIl(llIIlIIIlIIIllIlIIIl, "valid")) {
                final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(llIIlIIIlIIIllIlIIIl, "user_name");
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Authenticated with twitch; username is {}", new Object[] { illIIlllIIIIlllIIlIl });
                final AuthToken authToken = new AuthToken();
                authToken.data = this.IlIlIlIlIlllllllllIl.getValue();
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, authToken);
                this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl);
                this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(authToken);
                Runtime.getRuntime().addShutdownHook(new IIlllIlIIllIlIlIlIIl(this, "Twitch shutdown hook"));
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII();
                this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
            }
            else {
                IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl);
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.error(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Given twitch access token is invalid");
            }
        }
        catch (IOException ex) {
            IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll);
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.error(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Could not authenticate with twitch", (Throwable)ex);
        }
    }
}
