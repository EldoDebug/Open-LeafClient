package net.minecraft.client;

import java.util.concurrent.*;
import org.lwjgl.opengl.*;

class IlIlIIIIIIlllIlIllIl implements Callable
{
    final /* synthetic */ Minecraft llllIIIIlIIIlIlllIll;
    
    IlIlIIIIIIlllIlIllIl(final Minecraft llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.valueOf(GL11.glGetString(7937)) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
    }
}
