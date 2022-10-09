package net.optifine;

import org.apache.logging.log4j.*;

public class IIlIIIlllIllIllIlIII
{
    private static final Logger IlIlIlIlIlllllllllIl;
    public static final boolean llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = System.getProperty("log.detail", "false").equals("true");
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s) {
        if (IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll) {
            IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl.info("[OptiFine] " + s);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final String s) {
        IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl.info("[OptiFine] " + s);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final String s) {
        IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl.warn("[OptiFine] " + s);
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final Throwable t) {
        IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl.warn("[OptiFine] " + s, t);
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final String s) {
        IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl.error("[OptiFine] " + s);
    }
    
    public static void IlIlIlIlIlllllllllIl(final String s, final Throwable t) {
        IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl.error("[OptiFine] " + s, t);
    }
    
    public static void IlIlIIIllIllIIIIIllI(final String s) {
        IlIlIlIlIlllllllllIl(s);
    }
}
