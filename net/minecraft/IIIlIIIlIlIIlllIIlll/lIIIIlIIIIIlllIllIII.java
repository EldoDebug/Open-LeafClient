package net.minecraft.IIIlIIIlIlIIlllIIlll;

class lIIIIlIIIIIlllIllIII implements IlIIIlIlIIIllIlIlIIl
{
    @Override
    public String llllIIIIlIIIlIlllIll(final int n) {
        final double n2 = n / 20.0;
        final double n3 = n2 / 60.0;
        final double n4 = n3 / 60.0;
        final double n5 = n4 / 24.0;
        final double n6 = n5 / 365.0;
        return (n6 > 0.5) ? (String.valueOf(IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.format(n6)) + " y") : ((n5 > 0.5) ? (String.valueOf(IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.format(n5)) + " d") : ((n4 > 0.5) ? (String.valueOf(IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.format(n4)) + " h") : ((n3 > 0.5) ? (String.valueOf(IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.format(n3)) + " m") : (String.valueOf(n2) + " s"))));
    }
}
