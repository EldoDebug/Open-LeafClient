package net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI;

import java.util.concurrent.atomic.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import com.mojang.authlib.*;
import javax.crypto.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import org.apache.logging.log4j.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import io.netty.util.concurrent.*;
import org.apache.commons.lang3.*;
import java.security.*;
import com.google.common.base.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl implements net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl
{
    private static final AtomicInteger IlIlIlIlIlllllllllIl;
    private static final Logger llIllIIIIIllIlIIIIlI;
    private static final Random IlIIIlIlIIIllIlIlIIl;
    private final byte[] IlIlIIIllIllIIIIIllI;
    private final llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    public final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    private IlIlIIIllIllIIIIIllI llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private GameProfile lIIIlllIIIllIIIllIII;
    private String llIIlIIIlIIIllIlIIIl;
    private SecretKey llIllIlIIIIllIlIIllI;
    private IlIIIlIlIIIllIlIlIIl lIlIlIIIllIIllIIIllI;
    
    static {
        IlIlIlIlIlllllllllIl = new AtomicInteger(0);
        llIllIIIIIllIlIIIIlI = LogManager.getLogger();
        IlIIIlIlIIIllIlIlIIl = new Random();
    }
    
    public IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl, final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll) {
        this.IlIlIIIllIllIIIIIllI = new byte[4];
        this.llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
        this.llIIlIIIlIIIllIlIIIl = "";
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.nextBytes(this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (this.llllIIIlIlllIlIIIIIl == net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl) {
            this.IlIlIlIlIlllllllllIl();
        }
        else if (this.llllIIIlIlllIlIIIIIl == net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII.getId()) == null) {
            this.llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl;
            this.IllIIlllIIIIlllIIlIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.lIlIlIIIllIIllIIIllI);
            this.lIlIlIIIllIIllIIIllI = null;
        }
        if (this.lIIIIlIIIIIlllIllIII++ == 600) {
            this.llllIIIIlIIIlIlllIll("Took too long to log in");
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        try {
            net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.info("Disconnecting " + this.llIllIIIIIllIlIIIIlI() + ": " + s);
            final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(s);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl));
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl);
        }
        catch (Exception ex) {
            net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.error("Error whilst disconnecting player", (Throwable)ex);
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (!this.lIIIlllIIIllIIIllIII.isComplete()) {
            this.lIIIlllIIIllIIIllIII = this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
        }
        final String llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), this.lIIIlllIIIllIIIllIII);
        if (llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        else {
            this.llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl;
            if (this.IllIIlllIIIIlllIIlIl.IIlllIIIllIllIIlIlIl() >= 0 && !this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(this.IllIIlllIIIIlllIIlIl.IIlllIIIllIllIIlIlIl()), new llIllIIIIIllIlIIIIlI(this), new GenericFutureListener[0]);
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this.lIIIlllIIIllIIIllIII));
            if (this.IllIIlllIIIIlllIIlIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII.getId()) != null) {
                this.llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI;
                this.lIlIlIIIllIIllIIIllI = this.IllIIlllIIIIlllIIlIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
            }
            else {
                this.IllIIlllIIIIlllIIlIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IllIIlllIIIIlllIIlIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.info(String.valueOf(this.llIllIIIIIllIlIIIIlI()) + " lost connection: " + llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII());
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return (this.lIIIlllIIIllIIIllIII != null) ? (String.valueOf(this.lIIIlllIIIllIIIllIII.toString()) + " (" + this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().toString() + ")") : String.valueOf(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        Validate.validState(this.llllIIIlIlllIlIIIIIl == net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "Unexpected hello packet", new Object[0]);
        this.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        if (this.IllIIlllIIIIlllIIlIl.lIlIlIlllIIlIlIlllIl() && !this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
            this.llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl, this.IllIIlllIIIIlllIIlIl.IlllIIIIlIIIlIlIlIIl().getPublic(), this.IlIlIIIllIllIIIIIllI));
        }
        else {
            this.llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        Validate.validState(this.llllIIIlIlllIlIIIIIl == net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, "Unexpected key packet", new Object[0]);
        final PrivateKey private1 = this.IllIIlllIIIIlllIIlIl.IlllIIIIlIIIlIlIlIIl().getPrivate();
        if (!Arrays.equals(this.IlIlIIIllIllIIIIIllI, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(private1))) {
            throw new IllegalStateException("Invalid nonce!");
        }
        this.llIllIlIIIIllIlIIllI = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(private1);
        this.llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI);
        new net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(this, "User Authenticator #" + net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.incrementAndGet()).start();
    }
    
    protected GameProfile llllIIIIlIIIlIlllIll(final GameProfile gameProfile) {
        return new GameProfile(UUID.nameUUIDFromBytes(("OfflinePlayer:" + gameProfile.getName()).getBytes(Charsets.UTF_8)), gameProfile.getName());
    }
}
