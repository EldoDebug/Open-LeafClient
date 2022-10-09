package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.*;
import com.mojang.authlib.*;
import org.apache.logging.log4j.*;
import java.math.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.mojang.authlib.exceptions.*;
import io.netty.util.concurrent.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import javax.crypto.*;
import java.security.*;
import com.mojang.authlib.minecraft.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.*;

public class IllIIlllIIIIlllIIlIl implements llllIIIIlIIIlIlllIll
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final Minecraft IlIlIlIlIlllllllllIl;
    private final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI;
    private final IIlllIIlIllIllIlIIll IlIIIlIlIIIllIlIlIIl;
    private GameProfile IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IllIIlllIIIIlllIIlIl(final IIlllIIlIllIllIlIIll ilIIIlIlIIIllIlIlIIl, final Minecraft ilIlIlIlIlllllllllIl, final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final SecretKey llllIIIIlIIIlIlllIll = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll();
        final String llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        final PublicKey ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        final String string = new BigInteger(lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll)).toString(16);
        if (this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII() != null && this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII().IlIIIlIlIIIllIlIlIIl()) {
            try {
                this.llllIIIIlIIIlIlllIll().joinServer(this.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl().IlIlIIIllIllIIIIIllI(), this.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl(), string);
            }
            catch (AuthenticationException ex2) {
                IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.warn("Couldn't connect to auth servers but will continue to join LAN");
            }
        }
        else {
            try {
                this.llllIIIIlIIIlIlllIll().joinServer(this.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl().IlIlIIIllIllIIIIIllI(), this.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl(), string);
            }
            catch (AuthenticationUnavailableException ex3) {
                this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("disconnect.loginFailedInfo", new Object[] { new IIllIIllIIIlIlIIIIlI("disconnect.loginFailedInfo.serversUnavailable", new Object[0]) }));
                return;
            }
            catch (InvalidCredentialsException ex4) {
                this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("disconnect.loginFailedInfo", new Object[] { new IIllIIllIIIlIlIIIIlI("disconnect.loginFailedInfo.invalidSession", new Object[0]) }));
                return;
            }
            catch (AuthenticationException ex) {
                this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("disconnect.loginFailedInfo", new Object[] { ex.getMessage() }));
                return;
            }
        }
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()), new net.minecraft.client.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl(this, llllIIIIlIIIlIlllIll), new GenericFutureListener[0]);
    }
    
    private MinecraftSessionService llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.lIlIlIlllIIlIlIlllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IlIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new lIIIIlIIIIIlllIllIII(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this.llIllIIIIIllIlIIIIlI, "connect.failed", llIIIIIIlIllIIlIIIll));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (!this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI()) {
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll());
        }
    }
}
