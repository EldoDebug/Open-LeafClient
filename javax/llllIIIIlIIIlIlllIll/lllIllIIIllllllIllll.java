package javax.llllIIIIlIIIlIlllIll;

class lllIllIIIllllllIllll
{
    private lllIllIIIllllllIllll() {
    }
    
    static final long llllIIIIlIIIlIlllIll(long n, final long n2) {
        n *= 31L;
        return n + n2;
    }
    
    static final long llllIIIIlIIIlIlllIll(long n, final float n2) {
        n *= 31L;
        if (n2 == 0.0f) {
            return n;
        }
        return n + Float.floatToIntBits(n2);
    }
    
    static final long llllIIIIlIIIlIlllIll(long n, final double n2) {
        n *= 31L;
        if (n2 == 0.0) {
            return n;
        }
        return n + Double.doubleToLongBits(n2);
    }
    
    static final int llllIIIIlIIIlIlllIll(final long n) {
        return (int)(n ^ n >> 32);
    }
}
