package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI;

import com.mojang.authlib.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class IlIlIIIllIllIIIIIllI implements IlIlIlIlIlllllllllIl
{
    private final GameProfile llllIIIIlIIIlIlllIll;
    private final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    
    public IlIlIIIllIllIIIIIllI(final GameProfile llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl = net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.getName()), llllIIIIlIIIlIlllIll.getName());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new lllllIlIIIlIlIIlllII(this.llllIIIIlIIIlIlllIll.getId()));
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI() {
        return new IlIlIIIIIIlllIlIllIl(this.llllIIIIlIIIlIlllIll.getName());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final int n2) {
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, n2 / 255.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return true;
    }
}
