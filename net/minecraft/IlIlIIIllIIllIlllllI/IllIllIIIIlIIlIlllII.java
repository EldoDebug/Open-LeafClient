package net.minecraft.IlIlIIIllIIllIlllllI;

public final class IllIllIIIIlIIlIlllII extends RuntimeException
{
    public static final IllIllIIIIlIIlIlllII llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new IllIllIIIIlIIlIlllII();
    }
    
    private IllIllIIIIlIIlIlllII() {
        this.setStackTrace(new StackTraceElement[0]);
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
