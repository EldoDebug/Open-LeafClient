package net.minecraft.IIIlIIlIIIIlllIlllII;

class llIIlIIIlIIIllIlIIIl
{
    private String llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private final llIllIlIIIIllIlIIllI IlIlIIIllIllIIIIIllI;
    
    public llIIlIIIlIIIllIlIIIl(final String s, final llIllIlIIIIllIlIIllI ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll(s);
    }
    
    public void llllIIIIlIIIlIlllIll(final String llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll != null) {
            if (llllIIIIlIIIlIlllIll.equals("false")) {
                this.IlIlIlIlIlllllllllIl = false;
                return;
            }
            if (llllIIIIlIIIlIlllIll.equals("true")) {
                this.IlIlIlIlIlllllllllIl = true;
                return;
            }
        }
        this.IlIlIlIlIlllllllllIl = Boolean.parseBoolean(llllIIIIlIIIlIlllIll);
        this.llIllIIIIIllIlIIIIlI = (this.IlIlIlIlIlllllllllIl ? 1 : 0);
        try {
            this.llIllIIIIIllIlIIIIlI = Integer.parseInt(llllIIIIlIIIlIlllIll);
        }
        catch (NumberFormatException ex) {}
        try {
            this.IlIIIlIlIIIllIlIlIIl = Double.parseDouble(llllIIIIlIIIlIlllIll);
        }
        catch (NumberFormatException ex2) {}
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public llIllIlIIIIllIlIIllI IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
