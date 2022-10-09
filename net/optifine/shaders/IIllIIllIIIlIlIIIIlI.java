package net.optifine.shaders;

import org.apache.logging.log4j.*;

public abstract class IIllIIllIIIlIlIIIIlI
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final String IlIlIlIlIlllllllllIl = "[Shaders] ";
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s) {
        IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.error("[Shaders] " + s);
    }
    
    public static void IlIlIlIlIlllllllllIl(final String s) {
        IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.warn("[Shaders] " + s);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final String s) {
        IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.info("[Shaders] " + s);
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final String s) {
        IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.debug("[Shaders] " + s);
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final Object... array) {
        IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.error("[Shaders] " + String.format(s, array));
    }
    
    public static void IlIlIlIlIlllllllllIl(final String s, final Object... array) {
        IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.warn("[Shaders] " + String.format(s, array));
    }
    
    public static void llIllIIIIIllIlIIIIlI(final String s, final Object... array) {
        IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.info("[Shaders] " + String.format(s, array));
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final String s, final Object... array) {
        IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.debug("[Shaders] " + String.format(s, array));
    }
}
