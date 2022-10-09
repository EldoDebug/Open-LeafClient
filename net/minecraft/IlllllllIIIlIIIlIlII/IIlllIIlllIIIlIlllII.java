package net.minecraft.IlllllllIIIlIIIlIlII;

class IIlllIIlllIIIlIlllII
{
    final int llllIIIIlIIIlIlllIll;
    Object IlIlIlIlIlllllllllIl;
    IIlllIIlllIIIlIlllII llIllIIIIIllIlIIIIlI;
    final int IlIIIlIlIIIllIlIlIIl;
    
    IIlllIIlllIIIlIlllII(final int ilIIIlIlIIIllIlIlIIl, final int llllIIIIlIIIlIlllIll, final Object ilIlIlIlIlllllllllIl, final IIlllIIlllIIIlIlllII llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public final Object IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof IIlllIIlllIIIlIlllII)) {
            return false;
        }
        final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII = (IIlllIIlllIIIlIlllII)o;
        final Integer value = this.llllIIIIlIIIlIlllIll();
        final Integer value2 = illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        if (value == value2 || (value != null && value.equals(value2))) {
            final Object ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
            final Object ilIlIlIlIlllllllllIl2 = illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl == ilIlIlIlIlllllllllIl2 || (ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl.equals(ilIlIlIlIlllllllllIl2))) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return llllIIIlIlllIlIIIIIl(this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.llllIIIIlIIIlIlllIll()) + "=" + this.IlIlIlIlIlllllllllIl();
    }
}
