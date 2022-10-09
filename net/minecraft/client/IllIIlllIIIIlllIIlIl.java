package net.minecraft.client;

import java.util.concurrent.*;

class IllIIlllIIIIlllIIlIl implements Callable
{
    final /* synthetic */ Minecraft llllIIIIlIIIlIlllIll;
    
    IllIIlllIIIIlllIIlIl(final Minecraft llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        final String llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        return llllIIIIlIIIlIlllIll.equals("vanilla") ? ((Minecraft.class.getSigners() == null) ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.") : ("Definitely; Client brand changed to '" + llllIIIIlIIIlIlllIll + "'");
    }
}
