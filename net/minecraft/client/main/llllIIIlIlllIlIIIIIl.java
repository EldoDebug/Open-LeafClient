package net.minecraft.client.main;

import java.net.*;

class llllIIIlIlllIlIIIIIl extends Authenticator
{
    private final /* synthetic */ String llllIIIIlIIIlIlllIll;
    private final /* synthetic */ String IlIlIlIlIlllllllllIl;
    
    llllIIIlIlllIlIIIIIl(final String llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl.toCharArray());
    }
}
