package net.minecraft.IlllllllIIIlIIIlIlII;

public abstract class llllIllllIllllIlIlII
{
    private Object llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    public llllIllllIllllIlIlII() {
        this.IlIlIlIlIlllllllllIl = false;
    }
    
    public Object llIllIIIIIllIlIIIIlI() {
        if (!this.IlIlIlIlIlllllllllIl) {
            this.IlIlIlIlIlllllllllIl = true;
            this.llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl();
        }
        return this.llllIIIIlIIIlIlllIll;
    }
    
    protected abstract Object IlIlIlIlIlllllllllIl();
}
