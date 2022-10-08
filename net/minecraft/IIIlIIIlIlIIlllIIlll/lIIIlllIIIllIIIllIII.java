package net.minecraft.IIIlIIIlIlIIlllIIlll;

class lIIIlllIIIllIIIllIII implements IlIIIlIlIIIllIlIlIIl
{
    @Override
    public String llllIIIIlIIIlIlllIll(final int n) {
        final double n2 = n / 100.0;
        final double n3 = n2 / 1000.0;
        return (n3 > 0.5) ? (String.valueOf(IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.format(n3)) + " km") : ((n2 > 0.5) ? (String.valueOf(IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.format(n2)) + " m") : (String.valueOf(n) + " cm"));
    }
}
