package net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.net.*;
import com.mojang.authlib.*;

public class llllIIIIlIIIlIlllIll extends IlIllIlIlIIIlIlIlIII
{
    private IIIIlllIIIIIIlIIIlll IllIIlllIIIIlllIIlIl;
    
    public llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(ilIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll(10);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.s_().equals(this.llllIIIIlIIIlIlllIll().lllIllIIIllllllIllll())) {
            ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(this.IllIIlllIIIIlllIIlIl = new IIIIlllIIIIIIlIIIlll());
        }
        super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll(final SocketAddress socketAddress, final GameProfile gameProfile) {
        return (gameProfile.getName().equalsIgnoreCase(this.llllIIIIlIIIlIlllIll().lllIllIIIllllllIllll()) && this.llllIIIIlIIIlIlllIll(gameProfile.getName()) != null) ? "That name is already taken." : super.llllIIIIlIIIlIlllIll(socketAddress, gameProfile);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return (IlIlIlIlIlllllllllIl)super.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
