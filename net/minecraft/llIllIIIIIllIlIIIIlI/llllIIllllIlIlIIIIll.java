package net.minecraft.llIllIIIIIllIlIIIIlI;

class llllIIllllIlIlIIIIll
{
    private final String llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    
    public llllIIllllIlIlIIIIll(final String llllIIIIlIIIlIlllIll, final Object o) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (o == null) {
            this.IlIlIlIlIlllllllllIl = "~~NULL~~";
        }
        else if (o instanceof Throwable) {
            final Throwable t = (Throwable)o;
            this.IlIlIlIlIlllllllllIl = "~~ERROR~~ " + t.getClass().getSimpleName() + ": " + t.getMessage();
        }
        else {
            this.IlIlIlIlIlllllllllIl = o.toString();
        }
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
