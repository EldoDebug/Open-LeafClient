package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum IlIlIIIllIllIIIIIllI
{
    llllIIIIlIIIlIlllIll("NO_FBO", 0, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.no_fbo", new Object[0])), 
    IlIlIlIlIlllllllllIl("LIBRARY_ARCH_MISMATCH", 1, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.library_arch_mismatch", new Object[0])), 
    llIllIIIIIllIlIIIIlI("LIBRARY_FAILURE", 2, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.library_failure", new Object[0]), (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.report_to_mojang", new Object[0])), 
    IlIIIlIlIIIllIlIlIIl("UNSUPPORTED_OS_WINDOWS", 3, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.not_supported.windows", new Object[0])), 
    IlIlIIIllIllIIIIIllI("UNSUPPORTED_OS_MAC", 4, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.not_supported.mac", new Object[0]), (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.not_supported.mac.okay", new Object[0])), 
    IllIIlllIIIIlllIIlIl("UNSUPPORTED_OS_OTHER", 5, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.not_supported.other", new Object[0])), 
    llllIIIlIlllIlIIIIIl("ACCOUNT_NOT_MIGRATED", 6, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.account_not_migrated", new Object[0]), (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.account_not_migrated.okay", new Object[0])), 
    lIIIIlIIIIIlllIllIII("ACCOUNT_NOT_BOUND", 7, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.account_not_bound", new Object[0]), (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.account_not_bound.okay", new Object[0])), 
    lIIIlllIIIllIIIllIII("FAILED_TWITCH_AUTH", 8, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.failed_auth", new Object[0]), (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.failed_auth.okay", new Object[0])), 
    llIIlIIIlIIIllIlIIIl("FAILED_TWITCH_AUTH_ERROR", 9, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.failed_auth_error", new Object[0])), 
    llIllIlIIIIllIlIIllI("INITIALIZATION_FAILURE", 10, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.initialization_failure", new Object[0]), (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.report_to_mojang", new Object[0])), 
    lIlIlIIIllIIllIIIllI("UNKNOWN", 11, (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.unknown", new Object[0]), (llIIIIIIlIllIIlIIIll)new IIllIIllIIIlIlIIIIlI("stream.unavailable.report_to_mojang", new Object[0]));
    
    private final llIIIIIIlIllIIlIIIll IlIlIIIllIIllIlllllI;
    private final llIIIIIIlIllIIlIIIll IIIIlllIIIIIIlIIIlll;
    
    static {
        llllIIllllIlIlIIIIll = new IlIlIIIllIllIIIIIllI[] { IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl, IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII, IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII, IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl, IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI, IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI };
    }
    
    private IlIlIIIllIllIIIIIllI(final String s, final int n, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this(s, n, llIIIIIIlIllIIlIIIll, null);
    }
    
    private IlIlIIIllIllIIIIIllI(final String s, final int n, final llIIIIIIlIllIIlIIIll ilIlIIIllIIllIlllllI, final llIIIIIIlIllIIlIIIll iiiIlllIIIIIIlIIIlll) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
}
