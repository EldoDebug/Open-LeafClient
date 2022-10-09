package net.optifine;

import java.nio.*;
import org.lwjgl.opengl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IIlIlIlIIlIllIIIIIIl implements ARBDebugOutputCallback$Handler
{
    public static void llllIIIIlIIIlIlllIll() {
        final boolean gl_ARB_debug_output = GLContext.getCapabilities().GL_ARB_debug_output;
        Display.create(new PixelFormat().withDepthBits(24), new ContextAttribs().withDebug(true));
        ARBDebugOutput.glDebugMessageCallbackARB(new ARBDebugOutputCallback((ARBDebugOutputCallback$Handler)new IIlIlIlIIlIllIIIIIIl()));
        ARBDebugOutput.glDebugMessageControlARB(4352, 4352, 4352, (IntBuffer)null, true);
        GL11.glEnable(33346);
    }
    
    public void handleMessage(final int n, final int n2, final int n3, final int n4, final String s) {
        if (!s.contains("glBindFramebuffer") && !s.contains("Wide lines") && !s.contains("shader recompiled")) {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("[LWJGL] source: " + this.llllIIIIlIIIlIlllIll(n) + ", type: " + this.IlIlIlIlIlllllllllIl(n2) + ", id: " + n3 + ", severity: " + this.llIllIIIIIllIlIIIIlI(n4) + ", message: " + s);
            new Throwable("StackTrace").printStackTrace();
        }
    }
    
    public String llllIIIIlIIIlIlllIll(final int n) {
        switch (n) {
            case 33350: {
                return "API";
            }
            case 33351: {
                return "WIN";
            }
            case 33352: {
                return "SHADER";
            }
            case 33353: {
                return "EXT";
            }
            case 33354: {
                return "APP";
            }
            case 33355: {
                return "OTHER";
            }
            default: {
                return this.IlIIIlIlIIIllIlIlIIl(n);
            }
        }
    }
    
    public String IlIlIlIlIlllllllllIl(final int n) {
        switch (n) {
            case 33356: {
                return "ERROR";
            }
            case 33357: {
                return "DEPRECATED";
            }
            case 33358: {
                return "UNDEFINED";
            }
            case 33359: {
                return "PORTABILITY";
            }
            case 33360: {
                return "PERFORMANCE";
            }
            case 33361: {
                return "OTHER";
            }
            default: {
                return this.IlIIIlIlIIIllIlIlIIl(n);
            }
        }
    }
    
    public String llIllIIIIIllIlIIIIlI(final int n) {
        switch (n) {
            case 37190: {
                return "HIGH";
            }
            case 37191: {
                return "MEDIUM";
            }
            case 37192: {
                return "LOW";
            }
            default: {
                return this.IlIIIlIlIIIllIlIlIIl(n);
            }
        }
    }
    
    private String IlIIIlIlIIIllIlIlIIl(final int n) {
        return "Unknown (0x" + Integer.toHexString(n).toUpperCase() + ")";
    }
}
