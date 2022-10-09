package net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import com.mojang.authlib.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llllIIIIlIIIlIlllIll implements IIlIIIIIllIlIIIlIIll
{
    private GameProfile llllIIIIlIIIlIlllIll;
    
    public llllIIIIlIIIlIlllIll() {
    }
    
    public llllIIIIlIIIlIlllIll(final GameProfile llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = new GameProfile((UUID)null, llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16));
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.getName());
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public GameProfile llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
