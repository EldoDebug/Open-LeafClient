package net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll;

import java.util.concurrent.*;
import net.minecraft.client.*;

class IlIIIlIlIIIllIlIlIIl implements Callable
{
    final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        final String llllIIIIlIIIlIlllIll = net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        if (!llllIIIIlIIIlIlllIll.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + llllIIIIlIIIlIlllIll + "'";
        }
        final String ilIIIlIIIllllIlIlIlI = this.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI();
        return ilIIIlIIIllllIlIlIlI.equals("vanilla") ? ((Minecraft.class.getSigners() == null) ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.") : ("Definitely; Server brand changed to '" + ilIIIlIIIllllIlIlIlI + "'");
    }
}
