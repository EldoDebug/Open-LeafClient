package net.minecraft.client.llllIIIIlIIIlIlllIll;

public enum IIIlIIIlIlIIlllIIlll
{
    llllIIIIlIIIlIlllIll("FILE", 0, "file"), 
    IlIlIlIlIlllllllllIl("SOUND_EVENT", 1, "event");
    
    private final String llIllIIIIIllIlIIIIlI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new IIIlIIIlIlIIlllIIlll[] { IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll, IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl };
    }
    
    private IIIlIIIlIlIIlllIIlll(final String s, final int n, final String llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public static IIIlIIIlIlIIlllIIlll llllIIIIlIIIlIlllIll(final String s) {
        IIIlIIIlIlIIlllIIlll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll = values[i];
            if (iiIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI.equals(s)) {
                return iiIlIIIlIlIIlllIIlll;
            }
        }
        return null;
    }
}
