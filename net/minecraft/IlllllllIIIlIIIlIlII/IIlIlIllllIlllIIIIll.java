package net.minecraft.IlllllllIIIlIIIlIlII;

import org.apache.logging.log4j.*;
import java.io.*;

public class IIlIlIllllIlllIIIIll extends PrintStream
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IIlIlIllllIlllIIIIll(final String ilIlIlIlIlllllllllIl, final OutputStream outputStream) {
        super(outputStream);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void println(final String s) {
        this.llllIIIIlIIIlIlllIll(s);
    }
    
    @Override
    public void println(final Object o) {
        this.llllIIIIlIIIlIlllIll(String.valueOf(o));
    }
    
    private void llllIIIIlIIIlIlllIll(final String s) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final StackTraceElement stackTraceElement = stackTrace[Math.min(3, stackTrace.length)];
        IIlIlIllllIlllIIIIll.llllIIIIlIIIlIlllIll.info("[{}]@.({}:{}): {}", new Object[] { this.IlIlIlIlIlllllllllIl, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), s });
    }
}
