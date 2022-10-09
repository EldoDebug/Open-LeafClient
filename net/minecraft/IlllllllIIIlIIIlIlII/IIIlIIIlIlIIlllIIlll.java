package net.minecraft.IlllllllIIIlIIIlIlII;

public class IIIlIIIlIlIIlllIIlll extends IllegalArgumentException
{
    public IIIlIIIlIlIIlllIIlll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final String s) {
        super(String.format("Error parsing: %s: %s", illIIllIIIlIlIIIIlI, s));
    }
    
    public IIIlIIIlIlIIlllIIlll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final int n) {
        super(String.format("Invalid index %d requested for %s", n, illIIllIIIlIlIIIIlI));
    }
    
    public IIIlIIIlIlIIlllIIlll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final Throwable t) {
        super(String.format("Error while parsing: %s", illIIllIIIlIlIIIIlI), t);
    }
}
