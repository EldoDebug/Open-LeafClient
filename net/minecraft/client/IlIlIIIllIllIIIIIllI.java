package net.minecraft.client;

import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;

class IlIlIIIllIllIIIIIllI implements llIllIIIIIllIlIIIIlI
{
    final /* synthetic */ Minecraft llllIIIIlIIIlIlllIll;
    
    IlIlIIIllIllIIIIIllI(final Minecraft llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll(final String s) {
        try {
            return String.format(s, net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IllIIlllllIIllIIllIl.lIIIlllIIIllIIIllIII()));
        }
        catch (Exception ex) {
            return "Error: " + ex.getLocalizedMessage();
        }
    }
}
