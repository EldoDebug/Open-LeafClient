package net.minecraft.IlIlIlIlIlllllllllIl;

public class IIlllIIIlIlllIIlllII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "setidletimeout";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 3;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.setidletimeout.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length != 1) {
            throw new llllIllllIllllIlIlII("commands.setidletimeout.usage", new Object[0]);
        }
        final int llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[0], 0);
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.setidletimeout.success", llllIIIIlIIIlIlllIll);
    }
}
