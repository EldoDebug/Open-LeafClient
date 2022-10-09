package net.minecraft.IlllllllIIIlIIIlIlII;

class IllIlIllIllIlllIIlll
{
    final long llllIIIIlIIIlIlllIll;
    Object IlIlIlIlIlllllllllIl;
    IllIlIllIllIlllIIlll llIllIIIIIllIlIIIIlI;
    final int IlIIIlIlIIIllIlIlIIl;
    
    IllIlIllIllIlllIIlll(final int ilIIIlIlIIIllIlIlIIl, final long llllIIIIlIIIlIlllIll, final Object ilIlIlIlIlllllllllIl, final IllIlIllIllIlllIIlll llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final long llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public final Object IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof IllIlIllIllIlllIIlll)) {
            return false;
        }
        final IllIlIllIllIlllIIlll illIlIllIllIlllIIlll = (IllIlIllIllIlllIIlll)o;
        final Long value = this.llllIIIIlIIIlIlllIll();
        final Long value2 = illIlIllIllIlllIIlll.llllIIIIlIIIlIlllIll();
        if (value == value2 || (value != null && value.equals(value2))) {
            final Object ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
            final Object ilIlIlIlIlllllllllIl2 = illIlIllIllIlllIIlll.IlIlIlIlIlllllllllIl();
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
