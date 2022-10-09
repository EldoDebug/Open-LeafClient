package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

public enum IIIllIIllIIIIIIlIIlI
{
    llllIIIIlIIIlIlllIll("TITLE", 0), 
    IlIlIlIlIlllllllllIl("SUBTITLE", 1), 
    llIllIIIIIllIlIIIIlI("TIMES", 2), 
    IlIIIlIlIIIllIlIlIIl("CLEAR", 3), 
    IlIlIIIllIllIIIIIllI("RESET", 4);
    
    static {
        IllIIlllIIIIlllIIlIl = new IIIllIIllIIIIIIlIIlI[] { IIIllIIllIIIIIIlIIlI.llllIIIIlIIIlIlllIll, IIIllIIllIIIIIIlIIlI.IlIlIlIlIlllllllllIl, IIIllIIllIIIIIIlIIlI.llIllIIIIIllIlIIIIlI, IIIllIIllIIIIIIlIIlI.IlIIIlIlIIIllIlIlIIl, IIIllIIllIIIIIIlIIlI.IlIlIIIllIllIIIIIllI };
    }
    
    private IIIllIIllIIIIIIlIIlI(final String s, final int n) {
    }
    
    public static IIIllIIllIIIIIIlIIlI llllIIIIlIIIlIlllIll(final String s) {
        IIIllIIllIIIIIIlIIlI[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IIIllIIllIIIIIIlIIlI iiIllIIllIIIIIIlIIlI = values[i];
            if (iiIllIIllIIIIIIlIIlI.name().equalsIgnoreCase(s)) {
                return iiIllIIllIIIIIIlIIlI;
            }
        }
        return IIIllIIllIIIIIIlIIlI.llllIIIIlIIIlIlllIll;
    }
    
    public static String[] llllIIIIlIIIlIlllIll() {
        final String[] array = new String[values().length];
        int n = 0;
        IIIllIIllIIIIIIlIIlI[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            array[n++] = values[i].name().toLowerCase();
        }
        return array;
    }
}
