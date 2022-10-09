package net.minecraft.IIlllIIlIllIllIlIIll;

import org.apache.logging.log4j.*;
import net.minecraft.client.*;
import java.lang.reflect.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class IlIIIlIlIIIllIlIlIIl extends IIIIlllIIIIIIlIIIlll
{
    private static final Logger IIIIlllIIIIIIlIIIlll;
    private lIIllIIIllllIlllIllI llllIIllllIlIlIIIIll;
    
    static {
        IIIIlllIIIIIIlIIIlll = LogManager.getLogger();
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        try {
            final Constructor<?> declaredConstructor = Class.forName("com.mojang.realmsclient.RealmsMainScreen").getDeclaredConstructor(IIIIlllIIIIIIlIIIlll.class);
            declaredConstructor.setAccessible(true);
            Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(((IIIIlllIIIIIIlIIIlll)declaredConstructor.newInstance(this)).llllIIIIlIIIlIlllIll());
        }
        catch (Exception ex) {
            IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll.error("Realms module missing", (Throwable)ex);
        }
    }
    
    public IIIllIIllIIIIIIlIIlI IlIlIlIlIlllllllllIl(final lIIllIIIllllIlllIllI llllIIllllIlIlIIIIll) {
        try {
            this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
            final Constructor<?> declaredConstructor = Class.forName("com.mojang.realmsclient.gui.screens.RealmsNotificationsScreen").getDeclaredConstructor(IIIIlllIIIIIIlIIIlll.class);
            declaredConstructor.setAccessible(true);
            return ((IIIIlllIIIIIIlIIIlll)declaredConstructor.newInstance(this)).llllIIIIlIIIlIlllIll();
        }
        catch (Exception ex) {
            IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll.error("Realms module missing", (Throwable)ex);
            return null;
        }
    }
    
    @Override
    public void init() {
        Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll);
    }
}
