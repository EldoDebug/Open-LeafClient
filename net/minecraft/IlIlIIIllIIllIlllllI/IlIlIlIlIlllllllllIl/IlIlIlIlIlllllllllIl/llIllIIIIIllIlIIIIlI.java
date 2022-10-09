package net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;

import com.mojang.authlib.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIllIIIIIllIlIIIIlI implements IIlIIIIIllIlIIIlIIll
{
    private GameProfile llllIIIIlIIIlIlllIll;
    
    public llIllIIIIIllIlIIIIlI() {
    }
    
    public llIllIIIIIllIlIIIIlI(final GameProfile llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = new GameProfile(UUID.fromString(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(36)), llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16));
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        final UUID id = this.llllIIIIlIIIlIlllIll.getId();
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll((id == null) ? "" : id.toString());
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.getName());
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public GameProfile llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
